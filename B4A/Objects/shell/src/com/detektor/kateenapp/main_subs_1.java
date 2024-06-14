package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _activity_actionbarhomeclick() throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_actionbarhomeclick");}
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_ActionBarHomeClick";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="ActionBarHomeClicked = True";
Debug.ShouldStop(1048576);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 54;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
Debug.ShouldStop(2097152);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_actionbarhomeclick" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="ActionBarHomeClicked = False";
Debug.ShouldStop(4194304);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pm = RemoteObject.declareNull("com.detektor.kateenapp.b4xpagesmanager");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 37;BA.debugLine="If File.Exists(File.DirInternal,\"Clientsdb.db\") =";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Clientsdb.db"))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 38;BA.debugLine="File.Copy(File.DirAssets,\"Clientsdb.db\",File.Dir";
Debug.ShouldStop(32);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Clientsdb.db")),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("Clientsdb.db")));
 };
 BA.debugLineNum = 40;BA.debugLine="sql1.Initialize(File.DirInternal,\"Clientsdb.db\",F";
Debug.ShouldStop(128);
main._sql1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("Clientsdb.db")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 41;BA.debugLine="Dim pm As B4XPagesManager";
Debug.ShouldStop(256);
_pm = RemoteObject.createNew ("com.detektor.kateenapp.b4xpagesmanager");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 42;BA.debugLine="pm.Initialize(Activity)";
Debug.ShouldStop(512);
_pm.runClassMethod (com.detektor.kateenapp.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,58);
if (RapidSub.canDelegate("activity_keypress")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
Debug.ShouldStop(67108864);
if (true) return main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_keypress" /*RemoteObject*/ ,(Object)(_keycode));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,66);
if (RapidSub.canDelegate("activity_pause")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 66;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(4);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("activity_permissionresult")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
Debug.ShouldStop(64);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_permissionresult" /*RemoteObject*/ ,(Object)(_permission),(Object)(_result));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,62);
if (RapidSub.canDelegate("activity_resume")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(1073741824);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Create_Menu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("create_menu")) { return com.detektor.kateenapp.main.remoteMe.runUserSub(false, "main","create_menu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 74;BA.debugLine="Sub Create_Menu (Menu As Object)";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
Debug.ShouldStop(1024);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (com.detektor.kateenapp.b4xpagesdelegator.class, "_create_menu" /*RemoteObject*/ ,(Object)(_menu));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
firebasemessaging_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.detektor.kateenapp.main");
b4xmainpage.myClass = BA.getDeviceClass ("com.detektor.kateenapp.b4xmainpage");
login.myClass = BA.getDeviceClass ("com.detektor.kateenapp.login");
activegps.myClass = BA.getDeviceClass ("com.detektor.kateenapp.activegps");
starter.myClass = BA.getDeviceClass ("com.detektor.kateenapp.starter");
menup.myClass = BA.getDeviceClass ("com.detektor.kateenapp.menup");
menuorden.myClass = BA.getDeviceClass ("com.detektor.kateenapp.menuorden");
gpsmap.myClass = BA.getDeviceClass ("com.detektor.kateenapp.gpsmap");
dbrequestmanager.myClass = BA.getDeviceClass ("com.detektor.kateenapp.dbrequestmanager");
firebasemessaging.myClass = BA.getDeviceClass ("com.detektor.kateenapp.firebasemessaging");
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
nb6.myClass = BA.getDeviceClass ("com.detektor.kateenapp.nb6");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Public ActionBarHomeClicked As Boolean";
main._actionbarhomeclicked = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 21;BA.debugLine="Type DBResult (Tag As Object, Columns As Map, Row";
;
 //BA.debugLineNum = 22;BA.debugLine="Type DBCommand (Name As String, Parameters() As O";
;
 //BA.debugLineNum = 23;BA.debugLine="Dim const rdcLink As String = \"http://192.168.75.";
main._rdclink = BA.ObjectToString("http://192.168.75.107:17178/rdc");
 //BA.debugLineNum = 24;BA.debugLine="Dim sql1 As SQL";
main._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}