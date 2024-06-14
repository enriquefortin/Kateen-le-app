package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class gpsmap_subs_2 {


public static void  _addmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddMap (gpsmap) ","gpsmap",7,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("addmap")) { __ref.runUserSub(false, "gpsmap","addmap", __ref); return;}
ResumableSub_AddMap rsub = new ResumableSub_AddMap(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddMap extends BA.ResumableSub {
public ResumableSub_AddMap(com.detektor.kateenapp.gpsmap parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.detektor.kateenapp.gpsmap parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _iniii = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
RemoteObject _loc = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddMap (gpsmap) ","gpsmap",7,__ref.getField(false, "ba"),__ref,36);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 37;BA.debugLine="Wait For MapFragment1_Ready";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","mapfragment1_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "gpsmap", "addmap"), null);
this.state = 26;
return;
case 26:
//C
this.state = 1;
;
 BA.debugLineNum = 38;BA.debugLine="Log(\"====Map is ready====\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","53342338",RemoteObject.createImmutable("====Map is ready===="),0);
 BA.debugLineNum = 39;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(64);
__ref.setField ("_gmap" /*RemoteObject*/ ,__ref.getField(false,"_mapfragment1" /*RemoteObject*/ ).runMethod(false,"GetMap"));
 BA.debugLineNum = 40;BA.debugLine="Log(\"mapa get\")";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","53342340",RemoteObject.createImmutable("mapa get"),0);
 BA.debugLineNum = 42;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCAT";
Debug.ShouldStop(512);
__ref.getField(false,"_rp" /*RemoteObject*/ ).runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_rp" /*RemoteObject*/ ).getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 43;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As S";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","b4xpage_permissionresult", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "gpsmap", "addmap"), null);
this.state = 27;
return;
case 27:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 44;BA.debugLine="If Result = True  Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 12;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 45;BA.debugLine="gmap.MyLocationEnabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(true,"setMyLocationEnabled",parent.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="Dim iniii As CameraPosition";
Debug.ShouldStop(16384);
_iniii = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("iniii", _iniii);
 BA.debugLineNum = 48;BA.debugLine="iniii.Initialize(14.06669638968808, -87.171479165";
Debug.ShouldStop(32768);
_iniii.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, 14.06669638968808)),(Object)(BA.numberCast(double.class, -87.17147916555405)),(Object)(BA.numberCast(float.class, 12)));
 BA.debugLineNum = 49;BA.debugLine="gmap.MoveCamera(iniii)";
Debug.ShouldStop(65536);
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runVoidMethod ("MoveCamera",(Object)((_iniii.getObject())));
 BA.debugLineNum = 54;BA.debugLine="Do While gmap.MyLocation.IsInitialized = False";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//do while
this.state = 7;
while (RemoteObject.solveBoolean("=",__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation").runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 BA.debugLineNum = 55;BA.debugLine="Sleep(100)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "gpsmap", "addmap"),BA.numberCast(int.class, 100));
this.state = 28;
return;
case 28:
//C
this.state = 4;
;
 if (true) break;
;
 BA.debugLineNum = 57;BA.debugLine="If gmap.MyLocation.IsInitialized=True Then";
Debug.ShouldStop(16777216);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation").runMethod(true,"IsInitialized"),parent.__c.getField(true,"True"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 58;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(33554432);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 59;BA.debugLine="cp.Initialize(gmap.MyLocation.Latitude, gmap.MyL";
Debug.ShouldStop(67108864);
_cp.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation").runMethod(true,"getLatitude")),(Object)(__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation").runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 17)));
 BA.debugLineNum = 60;BA.debugLine="gmap.MoveCamera(cp)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runVoidMethod ("MoveCamera",(Object)((_cp.getObject())));
 if (true) break;

case 10:
//C
this.state = 13;
;
 BA.debugLineNum = 63;BA.debugLine="Log(gmap.MyLocation)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","53342363",BA.ObjectToString(__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation")),0);
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 66;BA.debugLine="Log(\"No permission!\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","53342366",RemoteObject.createImmutable("No permission!"),0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 68;BA.debugLine="gmap.MapType = gmap.MAP_TYPE_NORMAL";
Debug.ShouldStop(8);
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(true,"setMapType",__ref.getField(false,"_gmap" /*RemoteObject*/ ).getField(true,"MAP_TYPE_NORMAL"));
 BA.debugLineNum = 69;BA.debugLine="If gmap.IsInitialized  Then";
Debug.ShouldStop(16);
if (true) break;

case 14:
//if
this.state = 25;
if (__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 71;BA.debugLine="Do While gmap.MyLocation.IsInitialized = False";
Debug.ShouldStop(64);
if (true) break;

case 17:
//do while
this.state = 20;
while (RemoteObject.solveBoolean("=",__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation").runMethod(true,"IsInitialized"),parent.__c.getField(true,"False"))) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 17;
 BA.debugLineNum = 72;BA.debugLine="Sleep(100)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "gpsmap", "addmap"),BA.numberCast(int.class, 100));
this.state = 29;
return;
case 29:
//C
this.state = 17;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 75;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(1024);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 76;BA.debugLine="Dim loc As LatLng = gmap.MyLocation";
Debug.ShouldStop(2048);
_loc = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
_loc = __ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation");Debug.locals.put("loc", _loc);Debug.locals.put("loc", _loc);
 BA.debugLineNum = 77;BA.debugLine="If loc.IsInitialized Then";
Debug.ShouldStop(4096);
if (true) break;

case 21:
//if
this.state = 24;
if (_loc.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 78;BA.debugLine="cp.Initialize(gmap.MyLocation.Latitude, gmap.My";
Debug.ShouldStop(8192);
_cp.runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation").runMethod(true,"getLatitude")),(Object)(__ref.getField(false,"_gmap" /*RemoteObject*/ ).runMethod(false,"getMyLocation").runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 17)));
 BA.debugLineNum = 79;BA.debugLine="gmap.AnimateCamera(cp)";
Debug.ShouldStop(16384);
__ref.getField(false,"_gmap" /*RemoteObject*/ ).runVoidMethod ("AnimateCamera",(Object)((_cp.getObject())));
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _mapfragment1_ready(RemoteObject __ref) throws Exception{
}
public static void  _b4xpage_permissionresult(RemoteObject __ref,RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (gpsmap) ","gpsmap",7,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "gpsmap","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Root = Root1";
Debug.ShouldStop(2097152);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root1.LoadLayout(\"gpsmap\")";
Debug.ShouldStop(4194304);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("gpsmap")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="Root1.LoadLayout(\"selectloc\")";
Debug.ShouldStop(8388608);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("selectloc")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="Label2.BringToFront";
Debug.ShouldStop(16777216);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 27;BA.debugLine="AddMap";
Debug.ShouldStop(67108864);
__ref.runClassMethod (com.detektor.kateenapp.gpsmap.class, "_addmap" /*void*/ );
 BA.debugLineNum = 28;BA.debugLine="pnlmenu.BringToFront";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlmenu" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 29;BA.debugLine="pnlhora.BringToFront";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlhora" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 30;BA.debugLine="Label2.BringToFront";
Debug.ShouldStop(536870912);
__ref.getField(false,"_label2" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
gpsmap._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",gpsmap._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
gpsmap._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",gpsmap._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private Label2 As B4XView";
gpsmap._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_label2",gpsmap._label2);
 //BA.debugLineNum = 5;BA.debugLine="Public MapFragment1 As MapFragment";
gpsmap._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");__ref.setField("_mapfragment1",gpsmap._mapfragment1);
 //BA.debugLineNum = 6;BA.debugLine="Public rp As RuntimePermissions";
gpsmap._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",gpsmap._rp);
 //BA.debugLineNum = 7;BA.debugLine="Private gmap As GoogleMap";
gpsmap._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");__ref.setField("_gmap",gpsmap._gmap);
 //BA.debugLineNum = 9;BA.debugLine="Private pnlhora As B4XView";
gpsmap._pnlhora = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlhora",gpsmap._pnlhora);
 //BA.debugLineNum = 10;BA.debugLine="Private pnlmenu As B4XView";
gpsmap._pnlmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlmenu",gpsmap._pnlmenu);
 //BA.debugLineNum = 11;BA.debugLine="Private Label2 As B4XView";
gpsmap._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_label2",gpsmap._label2);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (gpsmap) ","gpsmap",7,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "gpsmap","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Return Me";
Debug.ShouldStop(65536);
if (true) return __ref;
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}