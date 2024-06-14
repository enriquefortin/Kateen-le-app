
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class opencamera {
    public static RemoteObject myClass;
	public opencamera() {
	}
    public static PCBA staticBA = new PCBA(null, opencamera.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _pnlopencamera = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnsiguienteopencamera = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _detector = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _camex = RemoteObject.declareNull("com.detektor.kateenapp.cameraexclass");
public static RemoteObject _lastpreview = RemoteObject.createImmutable(0L);
public static RemoteObject _intervalbetweenpreviewsms = RemoteObject.createImmutable(0);
public static RemoteObject _toast = RemoteObject.declareNull("com.detektor.kateenapp.bctoast");
public static RemoteObject _capturing = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnsiguienteopencamera",_ref.getField(false, "_btnsiguienteopencamera"),"camEx",_ref.getField(false, "_camex"),"Capturing",_ref.getField(false, "_capturing"),"DateUtils",_ref.getField(false, "_dateutils"),"detector",_ref.getField(false, "_detector"),"IntervalBetweenPreviewsMs",_ref.getField(false, "_intervalbetweenpreviewsms"),"LastPreview",_ref.getField(false, "_lastpreview"),"lblResult",_ref.getField(false, "_lblresult"),"pnlopencamera",_ref.getField(false, "_pnlopencamera"),"Root",_ref.getField(false, "_root"),"rp",_ref.getField(false, "_rp"),"toast",_ref.getField(false, "_toast"),"xui",_ref.getField(false, "_xui")};
}
}