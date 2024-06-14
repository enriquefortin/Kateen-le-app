B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private imginstaphoto As B4XView
	Public B4XSwitchllego As B4XSwitch
	Public btnnotificar As B4XView
	Public lblmsj As B4XView
	Public lblno As B4XView
	Public lblsi As B4XView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root1.LoadLayout("questioninterfaz")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.



Private Sub btnnotificar_Click
	If B4XSwitchllego.Value=True And lblmsj.Text="¿Se encuentra en el lugar de instalación?" Then
		lblmsj.Text="¿Contacto con el cliente y el vehículo está disponible?"
		B4XSwitchllego.value=False
	Else If B4XSwitchllego.Value=True And lblmsj.Text="¿Contacto con el cliente y el vehículo está disponible?" Then
		B4XPages.ShowPageAndRemovePreviousPages("revisiones")
	else if lblmsj.Text="Favor Lea el código del dispositivo a instalar" Then
		'ToastMessageShow("abrir la interfaz de camara",False)
		B4XPages.ShowPage("OpenCamera")		
		Else 
			ToastMessageShow("Notificar a SAC que NO "& lblmsj.Text,False)
	End If
	
End Sub