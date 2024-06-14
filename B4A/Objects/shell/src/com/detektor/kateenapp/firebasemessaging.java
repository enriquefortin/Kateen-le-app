
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

public class firebasemessaging implements IRemote{
	public static firebasemessaging mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public firebasemessaging() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("firebasemessaging"), "com.detektor.kateenapp.firebasemessaging");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _receiver;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _receiver = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.detektor.kateenapp.firebasemessaging");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, firebasemessaging.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fm = RemoteObject.declareNull("anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(com.detektor.kateenapp.b4xcollections.class),"B4XPages",Debug.moduleToString(com.detektor.kateenapp.b4xpages.class),"DateUtils",firebasemessaging.mostCurrent._dateutils,"fm",firebasemessaging._fm,"HttpUtils2Service",Debug.moduleToString(com.detektor.kateenapp.httputils2service.class),"Main",Debug.moduleToString(com.detektor.kateenapp.main.class),"Receiver",firebasemessaging.mostCurrent._receiver,"Starter",Debug.moduleToString(com.detektor.kateenapp.starter.class),"XUIViewsUtils",Debug.moduleToString(com.detektor.kateenapp.xuiviewsutils.class)};
}
}