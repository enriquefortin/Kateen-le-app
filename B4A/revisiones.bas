B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
Private autos As List
	Private btnrevi1 As B4XView
	Private B4XSeekBar1 As B4XSeekBar
	Private edtcombustible As EditText
	Private cmbauto As B4XComboBox
	Private btncontinuarrevi2 As B4XView
	Private ImageView1 As B4XView
	Private ime As IME
	Private textobs As B4XView	
	Private pnlnoclick As B4XView
	Private pnlrayo As B4XView
	Private pnlguion As B4XView
	Private pnlgolpe As B4XView
	Private img As B4XBitmap
	Private pnlclickcarro As B4XView
	Private btncontinuargolpe As B4XView
	Private btnlimpiar As B4XView
	Private btncontinuarfirma As B4XView
	Private pnldondesefirma As B4XView
	Private SignatureTemplate As B4XSignatureTemplate


	Private imgviewfirma As B4XView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root1.LoadLayout("revi1")
	autos.Initialize
	autos.AddAll(Array As String("Sedan","PickUp Sencillo","PickUp Doble Cabina","Panel","Motocicleta","Furgon","Camioneta","Camion","Avion"))
	ime.Initialize("")
	img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
	 
	SignatureTemplate.Initialize


	
End Sub



'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnrevi1_Click
	Root.RemoveAllViews
	Root.LoadLayout("revi2")
End Sub

Private Sub B4XSeekBar1_ValueChanged (Value As Int)
	edtcombustible.Text=Value&"%"
End Sub

Private Sub btncontinuarrevi2_Click
	Root.RemoveAllViews
	Root.LoadLayout("golpes")
	cmbauto.SetItems(autos)
End Sub

Private Sub cmbauto_SelectedIndexChanged (Index As Int)
	
	Dim selectedAuto As String = cmbauto.GetItem(Index)
    
	' Usar Select Case para cambiar la imagen
	Select selectedAuto
		Case "Sedan"			
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "fsedan.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "PickUp Sencillo"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "ffsencillo.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "PickUp Doble Cabina"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "ffpdoble.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "Panel"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "ffpanel.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "Motocicleta"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "fmoto.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "Furgon"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "FFURGON.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "Camioneta"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "FCAMIONETA.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "Camion"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "FFCAMION.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
		Case "Avion"
			Dim img As B4XBitmap = xui.LoadBitmapResize(File.DirAssets, "ffavioneta.jpg",ImageView1.Width,ImageView1.Height,True)
			ImageView1.SetBitmap(img)
			pnlclickcarro.RemoveAllViews
			img = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
	End Select
	
End Sub

Private Sub pnlnoclick_Click
	ime.HideKeyboard
End Sub

Private Sub pnlgolpe_Click
	img  = xui.LoadBitmapResize(File.DirAssets, "equis.png" ,16dip,16dip,True)
End Sub

Private Sub pnlguion_Click
	img  = xui.LoadBitmapResize(File.DirAssets, "guion.png" ,16dip,16dip,True)
End Sub

Private Sub pnlrayo_Click
	 img  = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
End Sub





Private Sub pnlclickcarro_Touch (Action As Int, X As Float, Y As Float)
	If Action = pnlclickcarro.TOUCH_ACTION_DOWN Then
		' Crear un nuevo ImageView
		Dim iv As ImageView
		iv.Initialize("")        
		' Asignar un Bitmap  (cualquier lógica que desees)
		'Dim randomBitmap As Bitmap = ChooseRandomBitmap()
		iv.Bitmap = img        
		' Establecer el tamaño del ImageView (ajusta según sea necesario)
		Dim size As Int = 16dip
		pnlclickcarro.AddView(iv, X - size / 2, Y - size / 2, size, size)
	End If
End Sub

Private Sub lblgolpe_Click
	img  = xui.LoadBitmapResize(File.DirAssets, "equis.png" ,16dip,16dip,True)
End Sub

Private Sub lblguion_Click
	img  = xui.LoadBitmapResize(File.DirAssets, "guion.png" ,16dip,16dip,True)
End Sub

Private Sub lblrajado_Click
	img  = xui.LoadBitmapResize(File.DirAssets, "rayo.png" ,16dip,16dip,True)
End Sub

Private Sub btncontinuargolpe_Click
	Root.RemoveAllViews
	Root.LoadLayout("firma")
	pnldondesefirma.AddView(SignatureTemplate.mBase, pnldondesefirma.Left, pnldondesefirma.top, pnldondesefirma.Width, pnldondesefirma.Height)
	SignatureTemplate.Resize(pnldondesefirma.Width,pnldondesefirma.Height)

End Sub




Private Sub btncontinuarfirma_Click
	'pnldondesefirma.SetBitmap(SignatureTemplate.Bitmap.Resize(pnldondesefirma.Width, pnldondesefirma.Height, True))
	Dim out As OutputStream = File.OpenOutput(File.DirInternal, "signature.png", False)
	SignatureTemplate.Bitmap.WriteToStream(out, 100, "PNG")
	out.Close
	ToastMessageShow("Firma guardada", False)
	
	'ToastMessageShow("Firma guardada en: " & File.Combine(File.DirInternal, "signature.png"), True)
	Dim paglog As questioninterface
	
	paglog=B4XPages.GetPage("questioninterface")
	paglog.lblmsj.Text="Favor Lea el código del dispositivo a instalar"
	paglog.B4XSwitchllego.mBase.Visible=False
	paglog.lblno.Visible=False
	paglog.lblsi.Visible=False
	paglog.btnnotificar.Text="Leer"
	B4XPages.ShowPageAndRemovePreviousPages("questioninterface")
End Sub

Private Sub btnlimpiar_Click
	'para visualizar la firma en el imgview antes de guardarla
	'imgviewfirma.SetBitmap(SignatureTemplate.Bitmap.Resize(imgviewfirma.Width, imgviewfirma.Height, True))
	
	'para visualizar la firma guardada, este es el directorio donde esta alamacenada la firma 
	'imgviewfirma.SetBitmap(xui.LoadBitmapResize(File.DirInternal, "signature.png", imgviewfirma.Width, imgviewfirma.Height, True))
	pnldondesefirma.RemoveAllViews
	SignatureTemplate.Initialize
	pnldondesefirma.AddView(SignatureTemplate.mBase, pnldondesefirma.Left, pnldondesefirma.top, pnldondesefirma.Width, pnldondesefirma.Height)
	SignatureTemplate.Resize(pnldondesefirma.Width,pnldondesefirma.Height)

End Sub


