
package com.detektor.kateenapp;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "com.detektor.kateenapp.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.detektor.kateenapp.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _gps1 = RemoteObject.declareNull("anywheresoftware.b4a.gps.GPS");
public static RemoteObject _gpsstarted = RemoteObject.createImmutable(false);
public static RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _nmea = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _phone = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _locationmanager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(com.detektor.kateenapp.b4xcollections.class),"B4XPages",Debug.moduleToString(com.detektor.kateenapp.b4xpages.class),"context",starter._context,"DateUtils",starter.mostCurrent._dateutils,"FirebaseMessaging",Debug.moduleToString(com.detektor.kateenapp.firebasemessaging.class),"GPS1",starter._gps1,"gpsStarted",starter._gpsstarted,"HttpUtils2Service",Debug.moduleToString(com.detektor.kateenapp.httputils2service.class),"LocationManager",starter._locationmanager,"Main",Debug.moduleToString(com.detektor.kateenapp.main.class),"nmea",starter._nmea,"phone",starter._phone,"rp",starter._rp,"Service",starter.mostCurrent._service,"XUIViewsUtils",Debug.moduleToString(com.detektor.kateenapp.xuiviewsutils.class)};
}
}