
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cameraexclass {
    public static RemoteObject myClass;
	public cameraexclass() {
	}
    public static PCBA staticBA = new PCBA(null, cameraexclass.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _nativecam = RemoteObject.declareNull("Object");
public static RemoteObject _cam = RemoteObject.declareNull("anywheresoftware.b4a.objects.CameraW");
public static RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
public static RemoteObject _target = RemoteObject.declareNull("Object");
public static RemoteObject _event = RemoteObject.createImmutable("");
public static RemoteObject _front = RemoteObject.createImmutable(false);
public static RemoteObject _parameters = RemoteObject.declareNull("Object");
public static RemoteObject _previeworientation = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cam",_ref.getField(false, "_cam"),"DateUtils",_ref.getField(false, "_dateutils"),"event",_ref.getField(false, "_event"),"Front",_ref.getField(false, "_front"),"nativeCam",_ref.getField(false, "_nativecam"),"parameters",_ref.getField(false, "_parameters"),"PreviewOrientation",_ref.getField(false, "_previeworientation"),"r",_ref.getField(false, "_r"),"target",_ref.getField(false, "_target")};
}
}