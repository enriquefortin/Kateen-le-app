package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (login) ","login",10,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "login","b4xpage_created", __ref, _root1);}
RemoteObject _password = RemoteObject.createImmutable("");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _encoded64 = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _b = null;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Root = Root1";
Debug.ShouldStop(524288);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root1.LoadLayout(\"login\")";
Debug.ShouldStop(2097152);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("login")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="Log(\"desde el menu principal\")";
Debug.ShouldStop(4194304);
login.__c.runVoidMethod ("LogImpl","28716292",RemoteObject.createImmutable("desde el menu principal"),0);
 BA.debugLineNum = 24;BA.debugLine="listacombo.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listacombo" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="listacombo.AddAll(Array As String (\"No\",\"Si\"))";
Debug.ShouldStop(16777216);
__ref.getField(false,"_listacombo" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(login.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("No"),RemoteObject.createImmutable("Si")})))));
 BA.debugLineNum = 28;BA.debugLine="Dim password As String = \"mi_contraseña_secreta\"";
Debug.ShouldStop(134217728);
_password = BA.ObjectToString("mi_contraseña_secreta");Debug.locals.put("password", _password);Debug.locals.put("password", _password);
 BA.debugLineNum = 30;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(536870912);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 31;BA.debugLine="Dim Encoded64 As String";
Debug.ShouldStop(1073741824);
_encoded64 = RemoteObject.createImmutable("");Debug.locals.put("Encoded64", _encoded64);
 BA.debugLineNum = 32;BA.debugLine="Private s As String = password";
Debug.ShouldStop(-2147483648);
_s = _password;Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 33;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 34;BA.debugLine="Encoded64 = su.EncodeBase64(s.GetBytes(\"utf8\"))";
Debug.ShouldStop(2);
_encoded64 = _su.runMethod(true,"EncodeBase64",(Object)(_s.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("utf8")))));Debug.locals.put("Encoded64", _encoded64);
 BA.debugLineNum = 37;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(16);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 38;BA.debugLine="Dim b() As Byte = su.DecodeBase64(Encoded64)";
Debug.ShouldStop(32);
_b = _su.runMethod(false,"DecodeBase64",(Object)(_encoded64));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 43;BA.debugLine="Log(\"Contraseña original: \" & password)";
Debug.ShouldStop(1024);
login.__c.runVoidMethod ("LogImpl","28716312",RemoteObject.concat(RemoteObject.createImmutable("Contraseña original: "),_password),0);
 BA.debugLineNum = 44;BA.debugLine="Log(\"Contraseña cifrada: \" & Encoded64)";
Debug.ShouldStop(2048);
login.__c.runVoidMethod ("LogImpl","28716313",RemoteObject.concat(RemoteObject.createImmutable("Contraseña cifrada: "),_encoded64),0);
 BA.debugLineNum = 45;BA.debugLine="Log(BytesToString(b, 0, b.Length, \"utf8\"))";
Debug.ShouldStop(4096);
login.__c.runVoidMethod ("LogImpl","28716314",login.__c.runMethod(true,"BytesToString",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"length")),(Object)(RemoteObject.createImmutable("utf8"))),0);
 BA.debugLineNum = 47;BA.debugLine="ime.SetCustomFilter( EditText1, EditText1.INPUT_T";
Debug.ShouldStop(16384);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("SetCustomFilter",(Object)((__ref.getField(false,"_edittext1" /*RemoteObject*/ ).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_edittext1" /*RemoteObject*/ ).getField(true,"INPUT_TYPE_TEXT"),RemoteObject.createImmutable(4096)}, "+",1, 1)),(Object)(RemoteObject.createImmutable("ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789.")));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Button1_Click (login) ","login",10,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "login","button1_click", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 80;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"gps\")";
Debug.ShouldStop(32768);
login._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gps")));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 9;BA.debugLine="Private EditText1 As EditText";
login._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1",login._edittext1);
 //BA.debugLineNum = 10;BA.debugLine="Private ime As IME";
login._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_ime",login._ime);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (login) ","login",10,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "login","createcommand", __ref, _name, _parameters);}
RemoteObject _cmdc = RemoteObject.declareNull("com.detektor.kateenapp.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 56;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim cmdc As DBCommand";
Debug.ShouldStop(16777216);
_cmdc = RemoteObject.createNew ("com.detektor.kateenapp.main._dbcommand");Debug.locals.put("cmdc", _cmdc);
 BA.debugLineNum = 58;BA.debugLine="cmdc.Initialize";
Debug.ShouldStop(33554432);
_cmdc.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="cmdc.Name = Name";
Debug.ShouldStop(67108864);
_cmdc.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 60;BA.debugLine="If Parameters <> Null Then cmdc.Parameters = Para";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmdc.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 61;BA.debugLine="Return cmdc";
Debug.ShouldStop(268435456);
if (true) return _cmdc;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("CreateRequest (login) ","login",10,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "login","createrequest", __ref);}
RemoteObject _req = RemoteObject.declareNull("com.detektor.kateenapp.dbrequestmanager");
 BA.debugLineNum = 51;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(524288);
_req = RemoteObject.createNew ("com.detektor.kateenapp.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 53;BA.debugLine="req.Initialize(Me, Main.rdcLink)";
Debug.ShouldStop(1048576);
_req.runClassMethod (com.detektor.kateenapp.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(login._main._rdclink /*RemoteObject*/ ));
 BA.debugLineNum = 54;BA.debugLine="Return req";
Debug.ShouldStop(2097152);
if (true) return _req;
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (login) ","login",10,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "login","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.ShouldStop(16384);
if (true) return __ref;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("pnlnoclick_Touch (login) ","login",10,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("pnlnoclick_touch")) { return __ref.runUserSub(false, "login","pnlnoclick_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 84;BA.debugLine="Private Sub pnlnoclick_Touch (Action As Int, X As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="IME1.HideKeyboard";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ime1" /*RemoteObject*/ ).runVoidMethod ("HideKeyboard",__ref.getField(false, "ba"));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}