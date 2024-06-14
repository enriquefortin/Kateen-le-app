
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "com.detektor.kateenapp.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _actionbarhomeclicked = RemoteObject.createImmutable(false);
public static RemoteObject _rdclink = RemoteObject.createImmutable("");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _inappupdate = RemoteObject.declareNull("com.khaan.iau.InAppUpdate");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"ActionBarHomeClicked",main._actionbarhomeclicked,"Activity",main.mostCurrent._activity,"B4XCollections",Debug.moduleToString(com.detektor.kateenapp.b4xcollections.class),"B4XPages",Debug.moduleToString(com.detektor.kateenapp.b4xpages.class),"DateUtils",main.mostCurrent._dateutils,"FirebaseMessaging",Debug.moduleToString(com.detektor.kateenapp.firebasemessaging.class),"HttpUtils2Service",Debug.moduleToString(com.detektor.kateenapp.httputils2service.class),"InAppUpdate",main.mostCurrent._inappupdate,"rdcLink",main._rdclink,"sql1",main._sql1,"Starter",Debug.moduleToString(com.detektor.kateenapp.starter.class),"XUIViewsUtils",Debug.moduleToString(com.detektor.kateenapp.xuiviewsutils.class)};
}
}