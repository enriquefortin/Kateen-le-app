B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private login As login
	Private gps As ActiveGPS
	Private menup As menup
	Private menuorden As menuorden
	Private gpsmap As gpsmap
	Private questioninterface As questioninterface
	Private revisiones As revisiones
	Private OpenCamera As OpenCamera
End Sub




Public Sub Initialize
	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("SplashScreen")
	Sleep(1200)
	login.Initialize
	gps.Initialize
	menup.Initialize
	menuorden.Initialize
	gpsmap.Initialize
	questioninterface.Initialize
	revisiones.Initialize
	OpenCamera.Initialize
	
	B4XPages.AddPage("login",login)
	B4XPages.ShowPage("login")
	B4XPages.AddPage("gps",gps)
	B4XPages.AddPage("menup",menup)
	B4XPages.AddPage("menuorden",menuorden)
	B4XPages.AddPage("gpsmap",gpsmap)
	B4XPages.AddPage("questioninterface",questioninterface)
	B4XPages.AddPage("revisiones",revisiones)
	B4XPages.AddPage("OpenCamera",OpenCamera)
	CallSubDelayed2(FirebaseMessaging, "SubscribeToTopics", Array("ios_general"))
	'request notification permission
	#if B4A
	Wait For (CheckAndRequestNotificationPermission) Complete (HasPermission As Boolean)
	If HasPermission = False Then
		Log("no permission")
		ToastMessageShow("no permission", True)
	End If
	#Else If B4i
	Main.App.RegisterUserNotifications(True, True, True)
	Main.App.RegisterForRemoteNotifications
	#End If
	

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

'Private Sub Button1_Click
'	xui.MsgboxAsync("Hello world!", "B4X")
	'ENd Sub
End Sub

Sub CreateRequest As DBRequestManager
	Dim req As DBRequestManager
	req.Initialize(Me, Main.rdcLink)
	Return req
End Sub
Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmdc As DBCommand
	cmdc.Initialize
	cmdc.Name = Name
	If Parameters <> Null Then cmdc.Parameters = Parameters
	Return cmdc
End Sub

#if B4A
Private Sub CheckAndRequestNotificationPermission As ResumableSub
	Dim p As Phone
	If p.SdkVersion < 33 Then Return True
	Dim ctxt As JavaObject
	ctxt.InitializeContext
	Dim targetSdkVersion As Int = ctxt.RunMethodJO("getApplicationInfo", Null).GetField("targetSdkVersion")
	If targetSdkVersion < 33 Then Return True
	Dim NotificationsManager As JavaObject = ctxt.RunMethod("getSystemService", Array("notification"))
	Dim NotificationsEnabled As Boolean = NotificationsManager.RunMethod("areNotificationsEnabled", Null)
	If NotificationsEnabled Then Return True
	Dim rp As RuntimePermissions
	rp.CheckAndRequest(rp.PERMISSION_POST_NOTIFICATIONS)
	Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean) 'change to Activity_PermissionResult if non-B4XPages.
	Log(Permission & ": " & Result)
	Return Result
End Sub
#End If