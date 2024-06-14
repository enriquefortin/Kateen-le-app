package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class questioninterface_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (questioninterface) ","questioninterface",3,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "questioninterface","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Root = Root1";
Debug.ShouldStop(262144);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 21;BA.debugLine="Root1.LoadLayout(\"questioninterfaz\")";
Debug.ShouldStop(1048576);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("questioninterfaz")),__ref.getField(false, "ba"));
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnotificar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnnotificar_Click (questioninterface) ","questioninterface",3,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("btnnotificar_click")) { return __ref.runUserSub(false, "questioninterface","btnnotificar_click", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Private Sub btnnotificar_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="If B4XSwitchllego.Value=True And lblmsj.Text=\"¿Se";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_b4xswitchllego" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xswitch.class, "_getvalue" /*RemoteObject*/ ),questioninterface.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_lblmsj" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("¿Se encuentra en el lugar de instalación?"))) { 
 BA.debugLineNum = 30;BA.debugLine="lblmsj.Text=\"¿Contacto con el cliente y el vehíc";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblmsj" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("¿Contacto con el cliente y el vehículo está disponible?"));
 BA.debugLineNum = 31;BA.debugLine="B4XSwitchllego.value=False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_b4xswitchllego" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xswitch.class, "_setvalue" /*RemoteObject*/ ,questioninterface.__c.getField(true,"False"));
 }else 
{ BA.debugLineNum = 32;BA.debugLine="Else If B4XSwitchllego.Value=True And lblmsj.Text";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_b4xswitchllego" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xswitch.class, "_getvalue" /*RemoteObject*/ ),questioninterface.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_lblmsj" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("¿Contacto con el cliente y el vehículo está disponible?"))) { 
 BA.debugLineNum = 33;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"revisio";
Debug.ShouldStop(1);
questioninterface._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("revisiones")));
 }else 
{ BA.debugLineNum = 34;BA.debugLine="else if lblmsj.Text=\"Favor Lea el código del disp";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lblmsj" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString("Favor Lea el código del dispositivo a instalar"))) { 
 BA.debugLineNum = 36;BA.debugLine="B4XPages.ShowPage(\"OpenCamera\")";
Debug.ShouldStop(8);
questioninterface._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("OpenCamera")));
 }else {
 BA.debugLineNum = 38;BA.debugLine="ToastMessageShow(\"Notificar a SAC que NO \"& lbl";
Debug.ShouldStop(32);
questioninterface.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Notificar a SAC que NO "),__ref.getField(false,"_lblmsj" /*RemoteObject*/ ).runMethod(true,"getText")))),(Object)(questioninterface.__c.getField(true,"False")));
 }}}
;
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
questioninterface._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",questioninterface._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
questioninterface._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",questioninterface._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private imginstaphoto As B4XView";
questioninterface._imginstaphoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_imginstaphoto",questioninterface._imginstaphoto);
 //BA.debugLineNum = 5;BA.debugLine="Public B4XSwitchllego As B4XSwitch";
questioninterface._b4xswitchllego = RemoteObject.createNew ("com.detektor.kateenapp.b4xswitch");__ref.setField("_b4xswitchllego",questioninterface._b4xswitchllego);
 //BA.debugLineNum = 6;BA.debugLine="Public btnnotificar As B4XView";
questioninterface._btnnotificar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnnotificar",questioninterface._btnnotificar);
 //BA.debugLineNum = 7;BA.debugLine="Public lblmsj As B4XView";
questioninterface._lblmsj = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblmsj",questioninterface._lblmsj);
 //BA.debugLineNum = 8;BA.debugLine="Public lblno As B4XView";
questioninterface._lblno = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblno",questioninterface._lblno);
 //BA.debugLineNum = 9;BA.debugLine="Public lblsi As B4XView";
questioninterface._lblsi = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblsi",questioninterface._lblsi);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (questioninterface) ","questioninterface",3,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "questioninterface","initialize", __ref, _ba);}
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
}