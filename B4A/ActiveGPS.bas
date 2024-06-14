B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	'Private gmap As GoogleMap
	Private Button1 As B4XView

End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub



Sub B4XPage_Appear

	If Starter.GPS1.GPSEnabled = False Then
		'ToastMessageShow("Please enable the GPS device.", True)
		'Dim resultx As Int = _
		'Msgbox2("¿Desea encender el GPS","Kateen-le App","Si","Cancelar","",Null)
		'If resultx = DialogResponse.POSITIVE Then
		'	StartActivity(Starter.GPS1.LocationSettingsIntent)
		'End If
		Button1.Enabled=False
		'StartActivity(Starter.GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
	Else

	
'		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
'		Wait For Activity_PermissionResult (Permission As String, result As Boolean)
'		If result Then CallSubDelayed(Starter, "StartGPS")
		Button1.Enabled=True
End If

End Sub
'This event will be called once, before the page becomes visible.



Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root1.LoadLayout("gps")
	'load the layout to Root
		
	

'
'	If Starter.GPS1.GPSEnabled = False Then
'		ToastMessageShow("Please enable the GPS device.", True)
'		Button1.Enabled=False
'		'StartActivity(Starter.GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
'	Else
'		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
'		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'		If Result Then CallSubDelayed(Starter, "StartGPS")
'		Button1.Enabled=True
'	End If

	
	
'	gmap.MyLocationEnabled = True
'	If gmap.MyLocation.IsInitialized=True Then
'		Do While gmap.MyLocation.IsInitialized = False
'			Sleep(100)
'
'		Loop
'		
'	End If
	
	
End Sub

Private Sub Button1_Click
Log("click en el boton gps")
	B4XPages.ShowPageAndRemovePreviousPages("menup")

End Sub


'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.