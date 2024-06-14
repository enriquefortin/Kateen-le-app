B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private Label2 As B4XView
	Public MapFragment1 As MapFragment
	Public rp As RuntimePermissions
	Private gmap As GoogleMap
	Private pnlhora As B4XView
	Private pnlmenu As B4XView
	Private Label2 As B4XView
	Private btnplace As B4XView
End Sub

'You can add more parameters here.
'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root1.LoadLayout("gpsmap")
	Root1.LoadLayout("selectloc")
	Label2.BringToFront
	'load the layout to Root
	AddMap
	pnlmenu.BringToFront
	pnlhora.BringToFront
	Label2.BringToFront
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Sub AddMap
Wait For MapFragment1_Ready
Log("====Map is ready====")
gmap = MapFragment1.GetMap
Log("mapa get")
'gmap.MyLocationEnabled = True
rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCATION)
Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
If Result = True  Then
	gmap.MyLocationEnabled = True
		
	Dim iniii As CameraPosition
	iniii.Initialize(14.06669638968808, -87.17147916555405, 12)
	gmap.MoveCamera(iniii)
'		gmap.MoveCamera(gmap.MyLocation)
		
		
		
	Do While gmap.MyLocation.IsInitialized = False
		Sleep(100)
	Loop
	If gmap.MyLocation.IsInitialized=True Then
		Dim cp As CameraPosition
		cp.Initialize(gmap.MyLocation.Latitude, gmap.MyLocation.Longitude, 17)
		gmap.MoveCamera(cp)
	End If
	
		Log(gmap.MyLocation)
			
	Else
		Log("No permission!")
	End If
	gmap.MapType = gmap.MAP_TYPE_NORMAL
	If gmap.IsInitialized  Then
		'clstoast.Show("Favor encienda el GPS de su dispositivo")
		Do While gmap.MyLocation.IsInitialized = False
			Sleep(100)
		Loop
		
		Dim cp As CameraPosition
		Dim loc As LatLng = gmap.MyLocation
		If loc.IsInitialized Then
			cp.Initialize(gmap.MyLocation.Latitude, gmap.MyLocation.Longitude, 17)
			gmap.AnimateCamera(cp)
			
		End If
		
	End If
End Sub

Private Sub btnplace_Click
	B4XPages.ShowPageAndRemovePreviousPages("questioninterface")
End Sub