
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class login {
    public static RemoteObject myClass;
	public login() {
	}
    public static PCBA staticBA = new PCBA(null, login.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _listacombo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ime1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _panel4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Button1",_ref.getField(false, "_button1"),"DateUtils",_ref.getField(false, "_dateutils"),"EditText1",_ref.getField(false, "_edittext1"),"ime",_ref.getField(false, "_ime"),"IME1",_ref.getField(false, "_ime1"),"listacombo",_ref.getField(false, "_listacombo"),"lst",_ref.getField(false, "_lst"),"Panel4",_ref.getField(false, "_panel4"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}