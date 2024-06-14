
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class questioninterface {
    public static RemoteObject myClass;
	public questioninterface() {
	}
    public static PCBA staticBA = new PCBA(null, questioninterface.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _imginstaphoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _b4xswitchllego = RemoteObject.declareNull("com.detektor.kateenapp.b4xswitch");
public static RemoteObject _btnnotificar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblmsj = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblno = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblsi = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"B4XSwitchllego",_ref.getField(false, "_b4xswitchllego"),"btnnotificar",_ref.getField(false, "_btnnotificar"),"DateUtils",_ref.getField(false, "_dateutils"),"imginstaphoto",_ref.getField(false, "_imginstaphoto"),"lblmsj",_ref.getField(false, "_lblmsj"),"lblno",_ref.getField(false, "_lblno"),"lblsi",_ref.getField(false, "_lblsi"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}