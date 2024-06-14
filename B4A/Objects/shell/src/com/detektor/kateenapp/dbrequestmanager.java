
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class dbrequestmanager {
    public static RemoteObject myClass;
	public dbrequestmanager() {
	}
    public static PCBA staticBA = new PCBA(null, dbrequestmanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mtarget = RemoteObject.declareNull("Object");
public static RemoteObject _link = RemoteObject.createImmutable("");
public static RemoteObject _version = RemoteObject.createImmutable(0f);
public static RemoteObject _ser11 = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
public static RemoteObject _job11 = RemoteObject.declareNull("com.detektor.kateenapp.httpjob");
public static RemoteObject _tag11 = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"Job11",_ref.getField(false, "_job11"),"link",_ref.getField(false, "_link"),"mTarget",_ref.getField(false, "_mtarget"),"ser11",_ref.getField(false, "_ser11"),"Tag11",_ref.getField(false, "_tag11"),"VERSION",_ref.getField(false, "_version")};
}
}