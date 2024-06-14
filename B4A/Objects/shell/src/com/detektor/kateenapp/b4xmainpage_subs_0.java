package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static void  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("b4xpage_created")) { __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1); return;}
ResumableSub_B4XPage_Created rsub = new ResumableSub_B4XPage_Created(null,__ref,_root1);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_Created extends BA.ResumableSub {
public ResumableSub_B4XPage_Created(com.detektor.kateenapp.b4xmainpage parent,RemoteObject __ref,RemoteObject _root1) {
this.parent = parent;
this.__ref = __ref;
this._root1 = _root1;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.detektor.kateenapp.b4xmainpage parent;
RemoteObject _root1;
RemoteObject _haspermission = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 30;BA.debugLine="Root = Root1";
Debug.ShouldStop(536870912);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"SplashScreen\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("SplashScreen")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="Sleep(1200)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "b4xpage_created"),BA.numberCast(int.class, 1200));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 33;BA.debugLine="login.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_login" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.login.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="gps.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_gps" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.activegps.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="menup.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_menup" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.menup.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 36;BA.debugLine="menuorden.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_menuorden" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.menuorden.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 37;BA.debugLine="gpsmap.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_gpsmap" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.gpsmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="questioninterface.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_questioninterface" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.questioninterface.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="revisiones.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_revisiones" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.revisiones.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 40;BA.debugLine="OpenCamera.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_opencamera" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.opencamera.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 42;BA.debugLine="B4XPages.AddPage(\"login\",login)";
Debug.ShouldStop(512);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("login")),(Object)((__ref.getField(false,"_login" /*RemoteObject*/ ))));
 BA.debugLineNum = 43;BA.debugLine="B4XPages.ShowPage(\"login\")";
Debug.ShouldStop(1024);
parent._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("login")));
 BA.debugLineNum = 44;BA.debugLine="B4XPages.AddPage(\"gps\",gps)";
Debug.ShouldStop(2048);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("gps")),(Object)((__ref.getField(false,"_gps" /*RemoteObject*/ ))));
 BA.debugLineNum = 45;BA.debugLine="B4XPages.AddPage(\"menup\",menup)";
Debug.ShouldStop(4096);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("menup")),(Object)((__ref.getField(false,"_menup" /*RemoteObject*/ ))));
 BA.debugLineNum = 46;BA.debugLine="B4XPages.AddPage(\"menuorden\",menuorden)";
Debug.ShouldStop(8192);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("menuorden")),(Object)((__ref.getField(false,"_menuorden" /*RemoteObject*/ ))));
 BA.debugLineNum = 47;BA.debugLine="B4XPages.AddPage(\"gpsmap\",gpsmap)";
Debug.ShouldStop(16384);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("gpsmap")),(Object)((__ref.getField(false,"_gpsmap" /*RemoteObject*/ ))));
 BA.debugLineNum = 48;BA.debugLine="B4XPages.AddPage(\"questioninterface\",questioninte";
Debug.ShouldStop(32768);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("questioninterface")),(Object)((__ref.getField(false,"_questioninterface" /*RemoteObject*/ ))));
 BA.debugLineNum = 49;BA.debugLine="B4XPages.AddPage(\"revisiones\",revisiones)";
Debug.ShouldStop(65536);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("revisiones")),(Object)((__ref.getField(false,"_revisiones" /*RemoteObject*/ ))));
 BA.debugLineNum = 50;BA.debugLine="B4XPages.AddPage(\"OpenCamera\",OpenCamera)";
Debug.ShouldStop(131072);
parent._b4xpages.runVoidMethod ("_addpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("OpenCamera")),(Object)((__ref.getField(false,"_opencamera" /*RemoteObject*/ ))));
 BA.debugLineNum = 51;BA.debugLine="CallSubDelayed2(FirebaseMessaging, \"SubscribeToTo";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((parent._firebasemessaging.getObject())),(Object)(BA.ObjectToString("SubscribeToTopics")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("ios_general"))}))));
 BA.debugLineNum = 54;BA.debugLine="Wait For (CheckAndRequestNotificationPermission)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "b4xpage_created"), __ref.runClassMethod (com.detektor.kateenapp.b4xmainpage.class, "_checkandrequestnotificationpermission" /*RemoteObject*/ ));
this.state = 6;
return;
case 6:
//C
this.state = 1;
_haspermission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("HasPermission", _haspermission);
;
 BA.debugLineNum = 55;BA.debugLine="If HasPermission = False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_haspermission,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 56;BA.debugLine="Log(\"no permission\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","2851995",RemoteObject.createImmutable("no permission"),0);
 BA.debugLineNum = 57;BA.debugLine="ToastMessageShow(\"no permission\", True)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("no permission")),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _haspermission) throws Exception{
}
public static RemoteObject  _checkandrequestnotificationpermission(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckAndRequestNotificationPermission (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("checkandrequestnotificationpermission")) { return __ref.runUserSub(false, "b4xmainpage","checkandrequestnotificationpermission", __ref);}
ResumableSub_CheckAndRequestNotificationPermission rsub = new ResumableSub_CheckAndRequestNotificationPermission(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckAndRequestNotificationPermission extends BA.ResumableSub {
public ResumableSub_CheckAndRequestNotificationPermission(com.detektor.kateenapp.b4xmainpage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.detektor.kateenapp.b4xmainpage parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _targetsdkversion = RemoteObject.createImmutable(0);
RemoteObject _notificationsmanager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _notificationsenabled = RemoteObject.createImmutable(false);
RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckAndRequestNotificationPermission (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,86);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 87;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 88;BA.debugLine="If p.SdkVersion < 33 Then Return True";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("<",_p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 33))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 89;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(16777216);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 90;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(33554432);
_ctxt.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 91;BA.debugLine="Dim targetSdkVersion As Int = ctxt.RunMethodJO(\"g";
Debug.ShouldStop(67108864);
_targetsdkversion = BA.numberCast(int.class, _ctxt.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getApplicationInfo")),(Object)((parent.__c.getField(false,"Null")))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("targetSdkVersion"))));Debug.locals.put("targetSdkVersion", _targetsdkversion);Debug.locals.put("targetSdkVersion", _targetsdkversion);
 BA.debugLineNum = 92;BA.debugLine="If targetSdkVersion < 33 Then Return True";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("<",_targetsdkversion,BA.numberCast(double.class, 33))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 93;BA.debugLine="Dim NotificationsManager As JavaObject = ctxt.Run";
Debug.ShouldStop(268435456);
_notificationsmanager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_notificationsmanager = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _ctxt.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSystemService")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("notification"))}))));Debug.locals.put("NotificationsManager", _notificationsmanager);Debug.locals.put("NotificationsManager", _notificationsmanager);
 BA.debugLineNum = 94;BA.debugLine="Dim NotificationsEnabled As Boolean = Notificatio";
Debug.ShouldStop(536870912);
_notificationsenabled = BA.ObjectToBoolean(_notificationsmanager.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("areNotificationsEnabled")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("NotificationsEnabled", _notificationsenabled);Debug.locals.put("NotificationsEnabled", _notificationsenabled);
 BA.debugLineNum = 95;BA.debugLine="If NotificationsEnabled Then Return True";
Debug.ShouldStop(1073741824);
if (true) break;

case 13:
//if
this.state = 18;
if (_notificationsenabled.<Boolean>get().booleanValue()) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 96;BA.debugLine="Dim rp As RuntimePermissions";
Debug.ShouldStop(-2147483648);
_rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rp", _rp);
 BA.debugLineNum = 97;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_POST_NOTIFICATIO";
Debug.ShouldStop(1);
_rp.runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(_rp.getField(true,"PERMISSION_POST_NOTIFICATIONS")));
 BA.debugLineNum = 98;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","b4xpage_permissionresult", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xmainpage", "checkandrequestnotificationpermission"), null);
this.state = 19;
return;
case 19:
//C
this.state = -1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 99;BA.debugLine="Log(Permission & \": \" & Result)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","21048589",RemoteObject.concat(_permission,RemoteObject.createImmutable(": "),_result),0);
 BA.debugLineNum = 100;BA.debugLine="Return Result";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _b4xpage_permissionresult(RemoteObject __ref,RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private login As login";
b4xmainpage._login = RemoteObject.createNew ("com.detektor.kateenapp.login");__ref.setField("_login",b4xmainpage._login);
 //BA.debugLineNum = 12;BA.debugLine="Private gps As ActiveGPS";
b4xmainpage._gps = RemoteObject.createNew ("com.detektor.kateenapp.activegps");__ref.setField("_gps",b4xmainpage._gps);
 //BA.debugLineNum = 13;BA.debugLine="Private menup As menup";
b4xmainpage._menup = RemoteObject.createNew ("com.detektor.kateenapp.menup");__ref.setField("_menup",b4xmainpage._menup);
 //BA.debugLineNum = 14;BA.debugLine="Private menuorden As menuorden";
b4xmainpage._menuorden = RemoteObject.createNew ("com.detektor.kateenapp.menuorden");__ref.setField("_menuorden",b4xmainpage._menuorden);
 //BA.debugLineNum = 15;BA.debugLine="Private gpsmap As gpsmap";
b4xmainpage._gpsmap = RemoteObject.createNew ("com.detektor.kateenapp.gpsmap");__ref.setField("_gpsmap",b4xmainpage._gpsmap);
 //BA.debugLineNum = 16;BA.debugLine="Private questioninterface As questioninterface";
b4xmainpage._questioninterface = RemoteObject.createNew ("com.detektor.kateenapp.questioninterface");__ref.setField("_questioninterface",b4xmainpage._questioninterface);
 //BA.debugLineNum = 17;BA.debugLine="Private revisiones As revisiones";
b4xmainpage._revisiones = RemoteObject.createNew ("com.detektor.kateenapp.revisiones");__ref.setField("_revisiones",b4xmainpage._revisiones);
 //BA.debugLineNum = 18;BA.debugLine="Private OpenCamera As OpenCamera";
b4xmainpage._opencamera = RemoteObject.createNew ("com.detektor.kateenapp.opencamera");__ref.setField("_opencamera",b4xmainpage._opencamera);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "b4xmainpage","createcommand", __ref, _name, _parameters);}
RemoteObject _cmdc = RemoteObject.declareNull("com.detektor.kateenapp.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 77;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim cmdc As DBCommand";
Debug.ShouldStop(8192);
_cmdc = RemoteObject.createNew ("com.detektor.kateenapp.main._dbcommand");Debug.locals.put("cmdc", _cmdc);
 BA.debugLineNum = 79;BA.debugLine="cmdc.Initialize";
Debug.ShouldStop(16384);
_cmdc.runVoidMethod ("Initialize");
 BA.debugLineNum = 80;BA.debugLine="cmdc.Name = Name";
Debug.ShouldStop(32768);
_cmdc.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 81;BA.debugLine="If Parameters <> Null Then cmdc.Parameters = Para";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmdc.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 82;BA.debugLine="Return cmdc";
Debug.ShouldStop(131072);
if (true) return _cmdc;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "b4xmainpage","createrequest", __ref);}
RemoteObject _req = RemoteObject.declareNull("com.detektor.kateenapp.dbrequestmanager");
 BA.debugLineNum = 72;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(256);
_req = RemoteObject.createNew ("com.detektor.kateenapp.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 74;BA.debugLine="req.Initialize(Me, Main.rdcLink)";
Debug.ShouldStop(512);
_req.runClassMethod (com.detektor.kateenapp.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(b4xmainpage._main._rdclink /*RemoteObject*/ ));
 BA.debugLineNum = 75;BA.debugLine="Return req";
Debug.ShouldStop(1024);
if (true) return _req;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="B4XPages.GetManager.LogEvents = True";
Debug.ShouldStop(16777216);
b4xmainpage._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ,__ref.getField(false, "ba")).setField ("_logevents" /*RemoteObject*/ ,b4xmainpage.__c.getField(true,"True"));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}