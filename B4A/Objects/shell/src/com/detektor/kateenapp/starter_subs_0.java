package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",13,starter.processBA,starter.mostCurrent,66);
if (RapidSub.canDelegate("application_error")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 66;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_gpsstatus(RemoteObject _satellites) throws Exception{
try {
		Debug.PushSubsStack("GPS_GpsStatus (starter) ","starter",13,starter.processBA,starter.mostCurrent,62);
if (RapidSub.canDelegate("gps_gpsstatus")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","gps_gpsstatus", _satellites);}
Debug.locals.put("Satellites", _satellites);
 BA.debugLineNum = 62;BA.debugLine="Sub GPS_GpsStatus (Satellites As List)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="CallSub2(Main, \"GpsStatus\", Satellites)";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(BA.ObjectToString("GpsStatus")),(Object)((_satellites)));
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
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS_LocationChanged (starter) ","starter",13,starter.processBA,starter.mostCurrent,57);
if (RapidSub.canDelegate("gps_locationchanged")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","gps_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 57;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="CallSub2(Main, \"LocationChanged\", Location1)";
Debug.ShouldStop(33554432);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",starter.processBA,(Object)((starter.mostCurrent._main.getObject())),(Object)(BA.ObjectToString("LocationChanged")),(Object)((_location1)));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_nmea(RemoteObject _timestamp,RemoteObject _sentence) throws Exception{
try {
		Debug.PushSubsStack("GPS_NMEA (starter) ","starter",13,starter.processBA,starter.mostCurrent,52);
if (RapidSub.canDelegate("gps_nmea")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","gps_nmea", _timestamp, _sentence);}
Debug.locals.put("TimeStamp", _timestamp);
Debug.locals.put("Sentence", _sentence);
 BA.debugLineNum = 52;BA.debugLine="Sub GPS_NMEA (TimeStamp As Long, Sentence As Strin";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="If phone.SdkVersion >= 24 Then Return";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("g",starter._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 24))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 54;BA.debugLine="Log(\"GPS_NMEA: \" & Sentence)";
Debug.ShouldStop(2097152);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","210158082",RemoteObject.concat(RemoteObject.createImmutable("GPS_NMEA: "),_sentence),0);
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
public static RemoteObject  _nmea_event(RemoteObject _message,RemoteObject _timestamp) throws Exception{
try {
		Debug.PushSubsStack("NMEA_Event (starter) ","starter",13,starter.processBA,starter.mostCurrent,38);
if (RapidSub.canDelegate("nmea_event")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","nmea_event", _message, _timestamp);}
Debug.locals.put("Message", _message);
Debug.locals.put("Timestamp", _timestamp);
 BA.debugLineNum = 38;BA.debugLine="Private Sub NMEA_Event (Message As String, Timesta";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Log($\"$Time{Timestamp}: ${Message.Trim}\"$)";
Debug.ShouldStop(64);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","210027009",(RemoteObject.concat(RemoteObject.createImmutable(""),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((_timestamp))),RemoteObject.createImmutable(": "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_message.runMethod(true,"trim")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 8;BA.debugLine="Public GPS1 As GPS";
starter._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 9;BA.debugLine="Private gpsStarted As Boolean";
starter._gpsstarted = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 10;BA.debugLine="Private context As JavaObject";
starter._context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 11;BA.debugLine="Private nmea As JavaObject";
starter._nmea = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 12;BA.debugLine="Private phone As Phone";
starter._phone = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 13;BA.debugLine="Private LocationManager As JavaObject";
starter._locationmanager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",13,starter.processBA,starter.mostCurrent,16);
if (RapidSub.canDelegate("service_create")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 16;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="GPS1.Initialize(\"GPS\")";
Debug.ShouldStop(65536);
starter._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS")));
 BA.debugLineNum = 18;BA.debugLine="context.InitializeContext";
Debug.ShouldStop(131072);
starter._context.runVoidMethod ("InitializeContext",starter.processBA);
 BA.debugLineNum = 19;BA.debugLine="Dim LocationManager As JavaObject = context.RunMe";
Debug.ShouldStop(262144);
starter._locationmanager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
starter._locationmanager = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), starter._context.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSystemService")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("location"))}))));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",13,starter.processBA,starter.mostCurrent,70);
if (RapidSub.canDelegate("service_destroy")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 70;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="StopGps";
Debug.ShouldStop(64);
_stopgps();
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",13,starter.processBA,starter.mostCurrent,23);
if (RapidSub.canDelegate("service_start")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 23;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startgps() throws Exception{
try {
		Debug.PushSubsStack("StartGps (starter) ","starter",13,starter.processBA,starter.mostCurrent,27);
if (RapidSub.canDelegate("startgps")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","startgps");}
 BA.debugLineNum = 27;BA.debugLine="Public Sub StartGps";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="If gpsStarted = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",starter._gpsstarted,starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 29;BA.debugLine="GPS1.Start(0, 0)";
Debug.ShouldStop(268435456);
starter._gps1.runVoidMethodAndSync ("Start",starter.processBA,(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 30;BA.debugLine="gpsStarted = True";
Debug.ShouldStop(536870912);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 31;BA.debugLine="If phone.SdkVersion >= 24 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",starter._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 32;BA.debugLine="nmea.InitializeNewInstance(Application.PackageN";
Debug.ShouldStop(-2147483648);
starter._nmea.runVoidMethod ("InitializeNewInstance",(Object)(RemoteObject.concat(starter.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".starter$MyNmeaMessageListener"))),(Object)((starter.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 33;BA.debugLine="LocationManager.RunMethod(\"addNmeaListener\", Ar";
Debug.ShouldStop(1);
starter._locationmanager.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addNmeaListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(starter._nmea.getObject())})));
 };
 };
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopgps() throws Exception{
try {
		Debug.PushSubsStack("StopGps (starter) ","starter",13,starter.processBA,starter.mostCurrent,42);
if (RapidSub.canDelegate("stopgps")) { return com.detektor.kateenapp.starter.remoteMe.runUserSub(false, "starter","stopgps");}
 BA.debugLineNum = 42;BA.debugLine="Public Sub StopGps";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="If gpsStarted Then";
Debug.ShouldStop(1024);
if (starter._gpsstarted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(2048);
starter._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 45;BA.debugLine="gpsStarted = False";
Debug.ShouldStop(4096);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 46;BA.debugLine="If phone.SdkVersion >= 24 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("g",starter._phone.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 47;BA.debugLine="LocationManager.RunMethod(\"removeNmeaListener\",";
Debug.ShouldStop(16384);
starter._locationmanager.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("removeNmeaListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(starter._nmea.getObject())})));
 };
 };
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}