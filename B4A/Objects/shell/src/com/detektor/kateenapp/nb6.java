
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class nb6 {
    public static RemoteObject myClass;
	public nb6() {
	}
    public static PCBA staticBA = new PCBA(null, nb6.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _channel = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _notificationbuilder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _sdklevel = RemoteObject.createImmutable(0);
public static RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _s_old = RemoteObject.createImmutable(0);
public static RemoteObject _s_builder = RemoteObject.createImmutable(0);
public static RemoteObject _s_channel = RemoteObject.createImmutable(0);
public static RemoteObject _supportlevel = RemoteObject.createImmutable(0);
public static RemoteObject _oldnotification = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
public static RemoteObject _pendingintentstatic = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _notificationstatic = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _common = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Channel",_ref.getField(false, "_channel"),"common",_ref.getField(false, "_common"),"ctxt",_ref.getField(false, "_ctxt"),"DateUtils",_ref.getField(false, "_dateutils"),"NotificationBuilder",_ref.getField(false, "_notificationbuilder"),"NotificationStatic",_ref.getField(false, "_notificationstatic"),"OldNotification",_ref.getField(false, "_oldnotification"),"PendingIntentStatic",_ref.getField(false, "_pendingintentstatic"),"S_BUILDER",_ref.getField(false, "_s_builder"),"S_CHANNEL",_ref.getField(false, "_s_channel"),"S_OLD",_ref.getField(false, "_s_old"),"SdkLevel",_ref.getField(false, "_sdklevel"),"SupportLevel",_ref.getField(false, "_supportlevel")};
}
}