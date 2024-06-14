B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private B4XRadioButton1 As B4XRadioButton
	Private tipodeservicios As List
	Private B4XComboBox1 As B4XComboBox
	Private Label1 As B4XView
	Private Label2 As B4XView
	Private Panel15 As Panel
	Private Panel16 As Panel
	Private pnlcerrar As B4XView
	Private B4XRadioButton2 As B4XRadioButton
	Private B4XRadioButton4 As B4XRadioButton
	Private B4XRadioButton3 As B4XRadioButton
	Private Button1 As B4XView

End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root1.LoadLayout("menuorden")
	B4XRadioButton1.Checked=True
	tipodeservicios.Initialize
	tipodeservicios.AddAll(Array As String("Instalación","Revisión","Desmonte","Mantenimiento"))
	B4XComboBox1.SetItems(tipodeservicios)

	Panel15.Top=Label1.Top+Label1.Height
	Panel16.Top=Label2.Top+Label2.Height

	Panel15.LoadLayout("menudatoscliente")
	Panel16.LoadLayout("menudatosvehiculo")

End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.






Private Sub Label1_Click
	If Panel15.Visible=False Then 
	
		Panel15.Visible=True
		Panel15.BringToFront
		Panel15.RequestFocus
		B4XComboBox1.mBase.Visible=False
	End If

End Sub


Private Sub Label2_Click
	If Panel16.Visible=False Then
		
		Panel16.Visible=True
		Panel16.BringToFront
		Panel16.RequestFocus
		B4XComboBox1.mBase.Visible=False
	End If
End Sub


Private Sub pnlcerrar_Click
	If Panel15.Visible=True Or Panel16.visible=True Then
		Panel15.Visible=False
		Panel16.Visible=False
		B4XComboBox1.mBase.Visible=True
	End If
End Sub


Private Sub Button1_Click
	B4XPages.ShowPageAndRemovePreviousPages("gpsmap")
End Sub