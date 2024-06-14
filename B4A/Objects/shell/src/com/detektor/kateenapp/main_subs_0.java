package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_actionbarhomeclick() throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_actionbarhomeclick");}
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_ActionBarHomeClick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="ActionBarHomeClicked = True";
Debug.ShouldStop(524288);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 53;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
Debug.ShouldStop(1048576);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_actionbarhomeclick" /*RemoteObject*/ );
 BA.debugLineNum = 54;BA.debugLine="ActionBarHomeClicked = False";
Debug.ShouldStop(2097152);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pm = RemoteObject.declareNull("com.detektor.kateenapp.b4xpagesmanager");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 33;BA.debugLine="CheckUpdate";
Debug.ShouldStop(1);
_checkupdate();
 BA.debugLineNum = 36;BA.debugLine="If File.Exists(File.DirInternal,\"Clientsdb.db\") =";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Clientsdb.db"))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 37;BA.debugLine="File.Copy(File.DirAssets,\"Clientsdb.db\",File.Dir";
Debug.ShouldStop(16);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Clientsdb.db")),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Clientsdb.db")));
 };
 BA.debugLineNum = 39;BA.debugLine="sql1.Initialize(File.DirInternal,\"Clientsdb.db\",F";
Debug.ShouldStop(64);
main._sql1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("Clientsdb.db")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 40;BA.debugLine="Dim pm As B4XPagesManager";
Debug.ShouldStop(128);
_pm = RemoteObject.createNew ("com.detektor.kateenapp.b4xpagesmanager");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 41;BA.debugLine="pm.Initialize(Activity)";
Debug.ShouldStop(256);
_pm.runClassMethod (com.detektor.kateenapp.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_keypress")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
Debug.ShouldStop(33554432);
if (true) return main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_keypress" /*RemoteObject*/ ,(Object)(_keycode));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("activity_pause")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(2);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("activity_permissionresult")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
Debug.ShouldStop(32);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_permissionresult" /*RemoteObject*/ ,(Object)(_permission),(Object)(_result));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("activity_resume")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(536870912);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkupdate() throws Exception{
try {
		Debug.PushSubsStack("CheckUpdate (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,88);
if (RapidSub.canDelegate("checkupdate")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","checkupdate");}
 BA.debugLineNum = 88;BA.debugLine="Private Sub CheckUpdate";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="InAppUpdate.initialize(False)";
Debug.ShouldStop(16777216);
main.mostCurrent._inappupdate.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 90;BA.debugLine="InAppUpdate.GetAppUpdateInfo";
Debug.ShouldStop(33554432);
main.mostCurrent._inappupdate.runVoidMethod ("GetAppUpdateInfo");
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_menu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Create_Menu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("create_menu")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","create_menu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 73;BA.debugLine="Sub Create_Menu (Menu As Object)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
Debug.ShouldStop(512);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_create_menu" /*RemoteObject*/ ,(Object)(_menu));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private InAppUpdate As InAppUpdate";
main.mostCurrent._inappupdate = RemoteObject.createNew ("com.khaan.iau.InAppUpdate");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _inappupdate_onappupdateinforeceived(RemoteObject _success,RemoteObject _inappupdateinfo) throws Exception{
try {
		Debug.PushSubsStack("InAppUpdate_onAppUpdateInfoReceived (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,99);
if (RapidSub.canDelegate("inappupdate_onappupdateinforeceived")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","inappupdate_onappupdateinforeceived", _success, _inappupdateinfo);}
Debug.locals.put("success", _success);
Debug.locals.put("inAppUpdateInfo", _inappupdateinfo);
 BA.debugLineNum = 99;BA.debugLine="Private Sub InAppUpdate_onAppUpdateInfoReceived(su";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Log($\"InAppUpdate_onAppUpdateInfoReceived, Succes";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("LogImpl","2655361",(RemoteObject.concat(RemoteObject.createImmutable("InAppUpdate_onAppUpdateInfoReceived, Success: "),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_success))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 102;BA.debugLine="If success Then";
Debug.ShouldStop(32);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="If inAppUpdateInfo.updateAvailability = inAppUpd";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_inappupdateinfo.runMethod(true,"updateAvailability"),BA.numberCast(double.class, _inappupdateinfo.getField(true,"UPDATE_AVAILABILITY_DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS"))) || RemoteObject.solveBoolean("=",_inappupdateinfo.runMethod(true,"updateAvailability"),BA.numberCast(double.class, _inappupdateinfo.getField(true,"UPDATE_AVAILABILITY_AVAILABLE")))) { 
 BA.debugLineNum = 104;BA.debugLine="InAppUpdate.startImmediateUpdateFlow";
Debug.ShouldStop(128);
main.mostCurrent._inappupdate.runVoidMethod ("StartImmediateUpdateFlow");
 };
 };
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
firebasemessaging_subs_0._process_globals();
starter_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.detektor.kateenapp.main");
b4xmainpage.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xmainpage");
gpsmap.myClass = BA.getDeviceClass ("com.detektor.kateenapp.gpsmap");
questioninterface.myClass = BA.getDeviceClass ("com.detektor.kateenapp.questioninterface");
revisiones.myClass = BA.getDeviceClass ("com.detektor.kateenapp.revisiones");
opencamera.myClass = BA.getDeviceClass ("com.detektor.kateenapp.opencamera");
activegps.myClass = BA.getDeviceClass ("com.detektor.kateenapp.activegps");
cameraexclass.myClass = BA.getDeviceClass ("com.detektor.kateenapp.cameraexclass");
dbrequestmanager.myClass = BA.getDeviceClass ("com.detektor.kateenapp.dbrequestmanager");
firebasemessaging.myClass = BA.getDeviceClass ("com.detektor.kateenapp.firebasemessaging");
login.myClass = BA.getDeviceClass ("com.detektor.kateenapp.login");
menuorden.myClass = BA.getDeviceClass ("com.detektor.kateenapp.menuorden");
menup.myClass = BA.getDeviceClass ("com.detektor.kateenapp.menup");
starter.myClass = BA.getDeviceClass ("com.detektor.kateenapp.starter");
b4xpages.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xset");
b4xpagesdelegator.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xpagesmanager");
bitmapsasync.myClass = BA.getDeviceClass ("com.detektor.kateenapp.bitmapsasync");
nb6.myClass = BA.getDeviceClass ("com.detektor.kateenapp.nb6");
httputils2service.myClass = BA.getDeviceClass ("com.detektor.kateenapp.httputils2service");
httpjob.myClass = BA.getDeviceClass ("com.detektor.kateenapp.httpjob");
animatedcounter.myClass = BA.getDeviceClass ("com.detektor.kateenapp.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("com.detektor.kateenapp.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("com.detektor.kateenapp.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("com.detektor.kateenapp.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("com.detektor.kateenapp.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("com.detektor.kateenapp.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("com.detektor.kateenapp.xuiviewsutils");
bctoast.myClass = BA.getDeviceClass ("com.detektor.kateenapp.bctoast");
bbcodeparser.myClass = BA.getDeviceClass ("com.detektor.kateenapp.bbcodeparser");
bbcodeview.myClass = BA.getDeviceClass ("com.detektor.kateenapp.bbcodeview");
bblabel.myClass = BA.getDeviceClass ("com.detektor.kateenapp.bblabel");
bctextengine.myClass = BA.getDeviceClass ("com.detektor.kateenapp.bctextengine");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Public ActionBarHomeClicked As Boolean";
main._actionbarhomeclicked = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 20;BA.debugLine="Type DBResult (Tag As Object, Columns As Map, Row";
;
 //BA.debugLineNum = 21;BA.debugLine="Type DBCommand (Name As String, Parameters() As O";
;
 //BA.debugLineNum = 22;BA.debugLine="Dim const rdcLink As String = \"http://192.168.75.";
main._rdclink = BA.ObjectToString("http://192.168.75.107:17178/rdc");
 //BA.debugLineNum = 23;BA.debugLine="Dim sql1 As SQL";
main._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}