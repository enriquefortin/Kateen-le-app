
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

public class b4xcollections implements IRemote{
	public static b4xcollections mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public b4xcollections() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, b4xcollections.class);
    static {
		mostCurrent = new b4xcollections();
        remoteMe = RemoteObject.declareNull("com.detektor.kateenapp.b4xcollections");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("b4xcollections"), "com.detektor.kateenapp.b4xcollections");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("com.detektor.kateenapp.b4xcollections"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XPages",Debug.moduleToString(com.detektor.kateenapp.b4xpages.class),"DateUtils",b4xcollections.mostCurrent._dateutils,"FirebaseMessaging",Debug.moduleToString(com.detektor.kateenapp.firebasemessaging.class),"HttpUtils2Service",Debug.moduleToString(com.detektor.kateenapp.httputils2service.class),"Main",Debug.moduleToString(com.detektor.kateenapp.main.class),"Starter",Debug.moduleToString(com.detektor.kateenapp.starter.class),"XUIViewsUtils",Debug.moduleToString(com.detektor.kateenapp.xuiviewsutils.class)};
}
}