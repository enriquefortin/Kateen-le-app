
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xmainpage {
    public static RemoteObject myClass;
	public b4xmainpage() {
	}
    public static PCBA staticBA = new PCBA(null, b4xmainpage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _login = RemoteObject.declareNull("com.detektor.kateenapp.login");
public static RemoteObject _gps = RemoteObject.declareNull("com.detektor.kateenapp.activegps");
public static RemoteObject _menup = RemoteObject.declareNull("com.detektor.kateenapp.menup");
public static RemoteObject _menuorden = RemoteObject.declareNull("com.detektor.kateenapp.menuorden");
public static RemoteObject _gpsmap = RemoteObject.declareNull("com.detektor.kateenapp.gpsmap");
public static RemoteObject _questioninterface = RemoteObject.declareNull("com.detektor.kateenapp.questioninterface");
public static RemoteObject _revisiones = RemoteObject.declareNull("com.detektor.kateenapp.revisiones");
public static RemoteObject _opencamera = RemoteObject.declareNull("com.detektor.kateenapp.opencamera");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"gps",_ref.getField(false, "_gps"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}