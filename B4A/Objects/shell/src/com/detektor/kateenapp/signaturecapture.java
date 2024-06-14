
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

public class signaturecapture implements IRemote{
	public static signaturecapture mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public signaturecapture() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, signaturecapture.class);
    static {
		mostCurrent = new signaturecapture();
        remoteMe = RemoteObject.declareNull("com.detektor.kateenapp.signaturecapture");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("signaturecapture"), "com.detektor.kateenapp.signaturecapture");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("com.detektor.kateenapp.signaturecapture"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _px = RemoteObject.createImmutable(0);
public static RemoteObject _py = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(com.detektor.kateenapp.b4xcollections.class),"B4XPages",Debug.moduleToString(com.detektor.kateenapp.b4xpages.class),"DateUtils",signaturecapture.mostCurrent._dateutils,"FirebaseMessaging",Debug.moduleToString(com.detektor.kateenapp.firebasemessaging.class),"HttpUtils2Service",Debug.moduleToString(com.detektor.kateenapp.httputils2service.class),"Main",Debug.moduleToString(com.detektor.kateenapp.main.class),"px",signaturecapture._px,"py",signaturecapture._py,"Starter",Debug.moduleToString(com.detektor.kateenapp.starter.class),"XUIViewsUtils",Debug.moduleToString(com.detektor.kateenapp.xuiviewsutils.class)};
}
}