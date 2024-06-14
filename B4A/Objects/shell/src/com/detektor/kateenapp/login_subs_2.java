package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_2 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (login) ","login",2,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "login","b4xpage_created", __ref, _root1);}
RemoteObject _password = RemoteObject.createImmutable("");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _encoded64 = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _b = null;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root1.LoadLayout(\"login\")";
Debug.ShouldStop(1048576);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("login")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="Log(\"desde el menu principal\")";
Debug.ShouldStop(2097152);
login.__c.runVoidMethod ("LogImpl","31048580",RemoteObject.createImmutable("desde el menu principal"),0);
 BA.debugLineNum = 23;BA.debugLine="listacombo.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_listacombo" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="listacombo.AddAll(Array As String (\"No\",\"Si\"))";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listacombo" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(login.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("No"),RemoteObject.createImmutable("Si")})))));
 BA.debugLineNum = 27;BA.debugLine="Dim password As String = \"mi_contraseña_secreta\"";
Debug.ShouldStop(67108864);
_password = BA.ObjectToString("mi_contraseña_secreta");Debug.locals.put("password", _password);Debug.locals.put("password", _password);
 BA.debugLineNum = 29;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(268435456);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 30;BA.debugLine="Dim Encoded64 As String";
Debug.ShouldStop(536870912);
_encoded64 = RemoteObject.createImmutable("");Debug.locals.put("Encoded64", _encoded64);
 BA.debugLineNum = 31;BA.debugLine="Private s As String = password";
Debug.ShouldStop(1073741824);
_s = _password;Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 32;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(-2147483648);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 33;BA.debugLine="Encoded64 = su.EncodeBase64(s.GetBytes(\"utf8\"))";
Debug.ShouldStop(1);
_encoded64 = _su.runMethod(true,"EncodeBase64",(Object)(_s.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("utf8")))));Debug.locals.put("Encoded64", _encoded64);
 BA.debugLineNum = 36;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(8);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 37;BA.debugLine="Dim b() As Byte = su.DecodeBase64(Encoded64)";
Debug.ShouldStop(16);
_b = _su.runMethod(false,"DecodeBase64",(Object)(_encoded64));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 42;BA.debugLine="Log(\"Contraseña original: \" & password)";
Debug.ShouldStop(512);
login.__c.runVoidMethod ("LogImpl","31048600",RemoteObject.concat(RemoteObject.createImmutable("Contraseña original: "),_password),0);
 BA.debugLineNum = 43;BA.debugLine="Log(\"Contraseña cifrada: \" & Encoded64)";
Debug.ShouldStop(1024);
login.__c.runVoidMethod ("LogImpl","31048601",RemoteObject.concat(RemoteObject.createImmutable("Contraseña cifrada: "),_encoded64),0);
 BA.debugLineNum = 44;BA.debugLine="Log(BytesToString(b, 0, b.Length, \"utf8\"))";
Debug.ShouldStop(2048);
login.__c.runVoidMethod ("LogImpl","31048602",login.__c.runMethod(true,"BytesToString",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")),(Object)(RemoteObject.createImmutable("utf8"))),0);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (login) ","login",2,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "login","button1_click", __ref);}
 BA.debugLineNum = 77;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"gps\")";
Debug.ShouldStop(8192);
login._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gps")));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
login._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",login._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
login._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",login._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private lst As List";
login._lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lst",login._lst);
 //BA.debugLineNum = 5;BA.debugLine="Private Button1 As B4XView";
login._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_button1",login._button1);
 //BA.debugLineNum = 6;BA.debugLine="Private listacombo As List";
login._listacombo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listacombo",login._listacombo);
 //BA.debugLineNum = 7;BA.debugLine="Private IME1 As IME";
login._ime1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_ime1",login._ime1);
 //BA.debugLineNum = 8;BA.debugLine="Private Panel4 As B4XView";
login._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel4",login._panel4);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (login) ","login",2,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "login","createcommand", __ref, _name, _parameters);}
RemoteObject _cmdc = RemoteObject.declareNull("com.detektor.kateenapp.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 54;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim cmdc As DBCommand";
Debug.ShouldStop(4194304);
_cmdc = RemoteObject.createNew ("com.detektor.kateenapp.main._dbcommand");Debug.locals.put("cmdc", _cmdc);
 BA.debugLineNum = 56;BA.debugLine="cmdc.Initialize";
Debug.ShouldStop(8388608);
_cmdc.runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="cmdc.Name = Name";
Debug.ShouldStop(16777216);
_cmdc.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 58;BA.debugLine="If Parameters <> Null Then cmdc.Parameters = Para";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmdc.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 59;BA.debugLine="Return cmdc";
Debug.ShouldStop(67108864);
if (true) return _cmdc;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (login) ","login",2,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "login","createrequest", __ref);}
RemoteObject _req = RemoteObject.declareNull("com.detektor.kateenapp.dbrequestmanager");
 BA.debugLineNum = 49;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(131072);
_req = RemoteObject.createNew ("com.detektor.kateenapp.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 51;BA.debugLine="req.Initialize(Me, Main.rdcLink)";
Debug.ShouldStop(262144);
_req.runClassMethod (com.detektor.kateenapp.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(login._main._rdclink /*RemoteObject*/ ));
 BA.debugLineNum = 52;BA.debugLine="Return req";
Debug.ShouldStop(524288);
if (true) return _req;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext1_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText1_TextChanged (login) ","login",2,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("edittext1_textchanged")) { return __ref.runUserSub(false, "login","edittext1_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 89;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (login) ","login",2,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "login","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Return Me";
Debug.ShouldStop(8192);
if (true) return __ref;
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlnoclick_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnlnoclick_Touch (login) ","login",2,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("pnlnoclick_touch")) { return __ref.runUserSub(false, "login","pnlnoclick_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 82;BA.debugLine="Private Sub pnlnoclick_Touch (Action As Int, X As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="IME1.HideKeyboard";
Debug.ShouldStop(262144);
__ref.getField(false,"_ime1" /*RemoteObject*/ ).runVoidMethod ("HideKeyboard",__ref.getField(false, "ba"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}