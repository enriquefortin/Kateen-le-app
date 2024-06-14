B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private pnlopencamera As B4XView
	Private lblResult As B4XView
	Private btnsiguienteopencamera As B4XView
	Private rp As RuntimePermissions
	Private detector As JavaObject
	Private camEx As CameraExClass
	Private LastPreview As Long
	Private IntervalBetweenPreviewsMs As Int = 100
	Private toast As BCToast
	Private lblResult As B4XView
	Private Capturing As Boolean
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root1.LoadLayout("OpenCamera")
	toast.Initialize(Root)
	'StopCamera
	StartCamera
	B4XPages.SetTitle(Me, "Barcode Example")
	#if B4A
	CreateDetector(Array("AZTEC", "CODE_128", "CODE_39", "CODE_93", "CODABAR", "DATA_MATRIX", "EAN_13", "EAN_8", "ITF", "PDF417", "QR_CODE", "UPC_A", "UPC_E"))
	#end if
'	If Capturing = False Then
'		StartCamera
'	Else
'		StopCamera
'	End If
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnsiguienteopencamera_Click
	'If Capturing = False Then
	'	StartCamera
	'Else
		StopCamera
	'End If
	ToastMessageShow("Camara detenida codigo leido",False)
End Sub

Private Sub FoundBarcode (msg As String)
	lblResult.Text = msg
	toast.Show($"Found [Color=Blue][b][plain]${msg}[/plain][/b][/Color]"$)
End Sub


Private Sub CreateDetector (Codes As List)
	Dim ctxt As JavaObject
	ctxt.InitializeContext
	Dim builder As JavaObject
	builder.InitializeNewInstance("com/google/android/gms/vision/barcode/BarcodeDetector.Builder".Replace("/", "."), Array(ctxt))
	Dim barcodeClass As String = "com/google/android/gms/vision/barcode/Barcode".Replace("/", ".")
	Dim barcodeStatic As JavaObject
	barcodeStatic.InitializeStatic(barcodeClass)
	Dim format As Int
	For Each formatName As String In Codes
		format = Bit.Or(format, barcodeStatic.GetField(formatName))
	Next
	builder.RunMethod("setBarcodeFormats", Array(format))
	detector = builder.RunMethod("build", Null)
	Dim operational As Boolean = detector.RunMethod("isOperational", Null)
	If operational = False Then
		toast.Show("Failed to create detector")
	End If
	'btnStartStop.Enabled = operational
End Sub

Private Sub Camera1_Preview (data() As Byte)
	If DateTime.Now > LastPreview + IntervalBetweenPreviewsMs Then
		'Dim n As Long = DateTime.Now
		Dim frameBuilder As JavaObject
		Dim bb As JavaObject
		bb = bb.InitializeStatic("java.nio.ByteBuffer").RunMethod("wrap", Array(data))
		frameBuilder.InitializeNewInstance("com/google/android/gms/vision/Frame.Builder".Replace("/", "."), Null)
		Dim cs As CameraSize = camEx.GetPreviewSize
		frameBuilder.RunMethod("setImageData", Array(bb, cs.Width, cs.Height,  842094169))
		Dim frame As JavaObject = frameBuilder.RunMethod("build", Null)
		Dim SparseArray As JavaObject = detector.RunMethod("detect", Array(frame))
		LastPreview = DateTime.Now
		Dim Matches As Int = SparseArray.RunMethod("size", Null)
		If Matches > 0 Then
			Dim barcode As JavaObject = SparseArray.RunMethod("valueAt", Array(0))
			Dim raw As String = barcode.GetField("rawValue")
			FoundBarcode(raw)
		End If
	End If
End Sub

Private Sub StartCamera
	rp.CheckAndRequest(rp.PERMISSION_CAMERA)
	Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
	If Result = False Then
		toast.Show("No permission!")
		Return
	End If
	StartCameraShared
	camEx.Initialize(pnlopencamera, False, Me, "Camera1")
	Wait For Camera1_Ready (Success As Boolean)
	If Success Then
		camEx.SetContinuousAutoFocus
		camEx.CommitParameters
		camEx.StartPreview
	Else
		toast.Show("Error opening camera")
		StopCamera
	End If
End Sub

Private Sub StopCamera
	Capturing = False
	'btnStartStop.Text = "Start"
	pnlopencamera.Visible = False
	#if B4A
	If camEx.IsInitialized Then
		camEx.Release
	End If
	#Else If B4i
	scanner.Stop
	#end if
End Sub

Private Sub StartCameraShared
	'btnStartStop.Text = "Stop"
	pnlopencamera.Visible = True
	Capturing = True
End Sub