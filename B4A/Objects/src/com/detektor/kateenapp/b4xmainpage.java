package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public com.detektor.kateenapp.login _login = null;
public com.detektor.kateenapp.activegps _gps = null;
public com.detektor.kateenapp.menup _menup = null;
public com.detektor.kateenapp.menuorden _menuorden = null;
public com.detektor.kateenapp.gpsmap _gpsmap = null;
public com.detektor.kateenapp.questioninterface _questioninterface = null;
public com.detektor.kateenapp.revisiones _revisiones = null;
public com.detektor.kateenapp.opencamera _opencamera = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public void  _b4xpage_created(com.detektor.kateenapp.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(this,__ref,_root1);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(com.detektor.kateenapp.b4xmainpage parent,com.detektor.kateenapp.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
this.__ref = parent;
}
com.detektor.kateenapp.b4xmainpage __ref;
com.detektor.kateenapp.b4xmainpage parent;
anywheresoftware.b4a.objects.B4XViewWrapper _root1;
boolean _haspermission = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Root.LoadLayout(\"SplashScreen\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SplashScreen",ba);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Sleep(1200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "b4xpage_created"),(int) (1200));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="login.Initialize";
__ref._login /*com.detektor.kateenapp.login*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="gps.Initialize";
__ref._gps /*com.detektor.kateenapp.activegps*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="menup.Initialize";
__ref._menup /*com.detektor.kateenapp.menup*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="menuorden.Initialize";
__ref._menuorden /*com.detektor.kateenapp.menuorden*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="gpsmap.Initialize";
__ref._gpsmap /*com.detektor.kateenapp.gpsmap*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="questioninterface.Initialize";
__ref._questioninterface /*com.detektor.kateenapp.questioninterface*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="revisiones.Initialize";
__ref._revisiones /*com.detektor.kateenapp.revisiones*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="OpenCamera.Initialize";
__ref._opencamera /*com.detektor.kateenapp.opencamera*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="B4XPages.AddPage(\"login\",login)";
parent._b4xpages._addpage /*String*/ (ba,"login",(Object)(__ref._login /*com.detektor.kateenapp.login*/ ));
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="B4XPages.ShowPage(\"login\")";
parent._b4xpages._showpage /*String*/ (ba,"login");
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="B4XPages.AddPage(\"gps\",gps)";
parent._b4xpages._addpage /*String*/ (ba,"gps",(Object)(__ref._gps /*com.detektor.kateenapp.activegps*/ ));
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="B4XPages.AddPage(\"menup\",menup)";
parent._b4xpages._addpage /*String*/ (ba,"menup",(Object)(__ref._menup /*com.detektor.kateenapp.menup*/ ));
RDebugUtils.currentLine=851985;
 //BA.debugLineNum = 851985;BA.debugLine="B4XPages.AddPage(\"menuorden\",menuorden)";
parent._b4xpages._addpage /*String*/ (ba,"menuorden",(Object)(__ref._menuorden /*com.detektor.kateenapp.menuorden*/ ));
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="B4XPages.AddPage(\"gpsmap\",gpsmap)";
parent._b4xpages._addpage /*String*/ (ba,"gpsmap",(Object)(__ref._gpsmap /*com.detektor.kateenapp.gpsmap*/ ));
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="B4XPages.AddPage(\"questioninterface\",questioninte";
parent._b4xpages._addpage /*String*/ (ba,"questioninterface",(Object)(__ref._questioninterface /*com.detektor.kateenapp.questioninterface*/ ));
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="B4XPages.AddPage(\"revisiones\",revisiones)";
parent._b4xpages._addpage /*String*/ (ba,"revisiones",(Object)(__ref._revisiones /*com.detektor.kateenapp.revisiones*/ ));
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="B4XPages.AddPage(\"OpenCamera\",OpenCamera)";
parent._b4xpages._addpage /*String*/ (ba,"OpenCamera",(Object)(__ref._opencamera /*com.detektor.kateenapp.opencamera*/ ));
RDebugUtils.currentLine=851990;
 //BA.debugLineNum = 851990;BA.debugLine="CallSubDelayed2(FirebaseMessaging, \"SubscribeToTo";
parent.__c.CallSubDelayed2(ba,(Object)(parent._firebasemessaging.getObject()),"SubscribeToTopics",(Object)(new Object[]{(Object)("ios_general")}));
RDebugUtils.currentLine=851993;
 //BA.debugLineNum = 851993;BA.debugLine="Wait For (CheckAndRequestNotificationPermission)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "b4xpage_created"), __ref._checkandrequestnotificationpermission /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 6;
return;
case 6:
//C
this.state = 1;
_haspermission = (Boolean) result[1];
;
RDebugUtils.currentLine=851994;
 //BA.debugLineNum = 851994;BA.debugLine="If HasPermission = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_haspermission==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=851995;
 //BA.debugLineNum = 851995;BA.debugLine="Log(\"no permission\")";
parent.__c.LogImpl("2851995","no permission",0);
RDebugUtils.currentLine=851996;
 //BA.debugLineNum = 851996;BA.debugLine="ToastMessageShow(\"no permission\", True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("no permission"),parent.__c.True);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=852009;
 //BA.debugLineNum = 852009;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkandrequestnotificationpermission(com.detektor.kateenapp.b4xmainpage __ref) throws Exception{
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "checkandrequestnotificationpermission", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkandrequestnotificationpermission", null));}
ResumableSub_CheckAndRequestNotificationPermission rsub = new ResumableSub_CheckAndRequestNotificationPermission(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckAndRequestNotificationPermission extends BA.ResumableSub {
public ResumableSub_CheckAndRequestNotificationPermission(com.detektor.kateenapp.b4xmainpage parent,com.detektor.kateenapp.b4xmainpage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.detektor.kateenapp.b4xmainpage __ref;
com.detektor.kateenapp.b4xmainpage parent;
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _ctxt = null;
int _targetsdkversion = 0;
anywheresoftware.b4j.object.JavaObject _notificationsmanager = null;
boolean _notificationsenabled = false;
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xmainpage";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If p.SdkVersion < 33 Then Return True";
if (true) break;

case 1:
//if
this.state = 6;
if (_p.getSdkVersion()<33) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim targetSdkVersion As Int = ctxt.RunMethodJO(\"g";
_targetsdkversion = (int)(BA.ObjectToNumber(_ctxt.RunMethodJO("getApplicationInfo",(Object[])(parent.__c.Null)).GetField("targetSdkVersion")));
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="If targetSdkVersion < 33 Then Return True";
if (true) break;

case 7:
//if
this.state = 12;
if (_targetsdkversion<33) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Dim NotificationsManager As JavaObject = ctxt.Run";
_notificationsmanager = new anywheresoftware.b4j.object.JavaObject();
_notificationsmanager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_ctxt.RunMethod("getSystemService",new Object[]{(Object)("notification")})));
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Dim NotificationsEnabled As Boolean = Notificatio";
_notificationsenabled = BA.ObjectToBoolean(_notificationsmanager.RunMethod("areNotificationsEnabled",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="If NotificationsEnabled Then Return True";
if (true) break;

case 13:
//if
this.state = 18;
if (_notificationsenabled) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_POST_NOTIFICATIO";
_rp.CheckAndRequest(ba,_rp.PERMISSION_POST_NOTIFICATIONS);
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xmainpage", "checkandrequestnotificationpermission"), null);
this.state = 19;
return;
case 19:
//C
this.state = -1;
_permission = (String) result[1];
_result = (Boolean) result[2];
;
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="Log(Permission & \": \" & Result)";
parent.__c.LogImpl("21048589",_permission+": "+BA.ObjectToString(_result),0);
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="Return Result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(com.detektor.kateenapp.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Private login As login";
_login = new com.detektor.kateenapp.login();
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Private gps As ActiveGPS";
_gps = new com.detektor.kateenapp.activegps();
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Private menup As menup";
_menup = new com.detektor.kateenapp.menup();
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Private menuorden As menuorden";
_menuorden = new com.detektor.kateenapp.menuorden();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Private gpsmap As gpsmap";
_gpsmap = new com.detektor.kateenapp.gpsmap();
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Private questioninterface As questioninterface";
_questioninterface = new com.detektor.kateenapp.questioninterface();
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Private revisiones As revisiones";
_revisiones = new com.detektor.kateenapp.revisiones();
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Private OpenCamera As OpenCamera";
_opencamera = new com.detektor.kateenapp.opencamera();
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.main._dbcommand  _createcommand(com.detektor.kateenapp.b4xmainpage __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((com.detektor.kateenapp.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
com.detektor.kateenapp.main._dbcommand _cmdc = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim cmdc As DBCommand";
_cmdc = new com.detektor.kateenapp.main._dbcommand();
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="cmdc.Initialize";
_cmdc.Initialize();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="cmdc.Name = Name";
_cmdc.Name /*String*/  = _name;
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="If Parameters <> Null Then cmdc.Parameters = Para";
if (_parameters!= null) { 
_cmdc.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Return cmdc";
if (true) return _cmdc;
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.dbrequestmanager  _createrequest(com.detektor.kateenapp.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((com.detektor.kateenapp.dbrequestmanager) Debug.delegate(ba, "createrequest", null));}
com.detektor.kateenapp.dbrequestmanager _req = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim req As DBRequestManager";
_req = new com.detektor.kateenapp.dbrequestmanager();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="req.Initialize(Me, Main.rdcLink)";
_req._initialize /*String*/ (null,ba,this,_main._rdclink /*String*/ );
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="End Sub";
return null;
}
public String  _initialize(com.detektor.kateenapp.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="B4XPages.GetManager.LogEvents = True";
_b4xpages._getmanager /*com.detektor.kateenapp.b4xpagesmanager*/ (ba)._logevents /*boolean*/  = __c.True;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
}