package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class menuorden_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (menuorden) ","menuorden",11,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "menuorden","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 29;BA.debugLine="Root1.LoadLayout(\"menuorden\")";
Debug.ShouldStop(268435456);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("menuorden")),__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="B4XRadioButton1.Checked=True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_b4xradiobutton1" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xradiobutton.class, "_setchecked" /*RemoteObject*/ ,menuorden.__c.getField(true,"True"));
 BA.debugLineNum = 31;BA.debugLine="tipodeservicios.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tipodeservicios" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="tipodeservicios.AddAll(Array As String(\"Instalaci";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tipodeservicios" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(menuorden.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("Instalación"),BA.ObjectToString("Revisión"),BA.ObjectToString("Desmonte"),RemoteObject.createImmutable("Mantenimiento")})))));
 BA.debugLineNum = 33;BA.debugLine="B4XComboBox1.SetItems(tipodeservicios)";
Debug.ShouldStop(1);
__ref.getField(false,"_b4xcombobox1" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tipodeservicios" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="Panel15.Top=Label1.Top+Label1.Height";
Debug.ShouldStop(4);
__ref.getField(false,"_panel15" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 36;BA.debugLine="Panel16.Top=Label2.Top+Label2.Height";
Debug.ShouldStop(8);
__ref.getField(false,"_panel16" /*RemoteObject*/ ).runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"getTop"),__ref.getField(false,"_label2" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 38;BA.debugLine="Panel15.LoadLayout(\"menudatoscliente\")";
Debug.ShouldStop(32);
__ref.getField(false,"_panel15" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menudatoscliente")),__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="Panel16.LoadLayout(\"menudatosvehiculo\")";
Debug.ShouldStop(64);
__ref.getField(false,"_panel16" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("menudatosvehiculo")),__ref.getField(false, "ba"));
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
public static RemoteObject  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (menuorden) ","menuorden",11,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "menuorden","button1_click", __ref);}
 BA.debugLineNum = 82;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"gpsmap\")";
Debug.ShouldStop(262144);
menuorden._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("gpsmap")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
menuorden._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",menuorden._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
menuorden._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",menuorden._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private B4XRadioButton1 As B4XRadioButton";
menuorden._b4xradiobutton1 = RemoteObject.createNew ("com.detektor.kateenapp.b4xradiobutton");__ref.setField("_b4xradiobutton1",menuorden._b4xradiobutton1);
 //BA.debugLineNum = 5;BA.debugLine="Private tipodeservicios As List";
menuorden._tipodeservicios = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tipodeservicios",menuorden._tipodeservicios);
 //BA.debugLineNum = 6;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
menuorden._b4xcombobox1 = RemoteObject.createNew ("com.detektor.kateenapp.b4xcombobox");__ref.setField("_b4xcombobox1",menuorden._b4xcombobox1);
 //BA.debugLineNum = 7;BA.debugLine="Private Label1 As B4XView";
menuorden._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_label1",menuorden._label1);
 //BA.debugLineNum = 8;BA.debugLine="Private Label2 As B4XView";
menuorden._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_label2",menuorden._label2);
 //BA.debugLineNum = 9;BA.debugLine="Private Panel15 As Panel";
menuorden._panel15 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel15",menuorden._panel15);
 //BA.debugLineNum = 10;BA.debugLine="Private Panel16 As Panel";
menuorden._panel16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel16",menuorden._panel16);
 //BA.debugLineNum = 11;BA.debugLine="Private pnlcerrar As B4XView";
menuorden._pnlcerrar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlcerrar",menuorden._pnlcerrar);
 //BA.debugLineNum = 12;BA.debugLine="Private B4XRadioButton2 As B4XRadioButton";
menuorden._b4xradiobutton2 = RemoteObject.createNew ("com.detektor.kateenapp.b4xradiobutton");__ref.setField("_b4xradiobutton2",menuorden._b4xradiobutton2);
 //BA.debugLineNum = 13;BA.debugLine="Private B4XRadioButton4 As B4XRadioButton";
menuorden._b4xradiobutton4 = RemoteObject.createNew ("com.detektor.kateenapp.b4xradiobutton");__ref.setField("_b4xradiobutton4",menuorden._b4xradiobutton4);
 //BA.debugLineNum = 14;BA.debugLine="Private B4XRadioButton3 As B4XRadioButton";
menuorden._b4xradiobutton3 = RemoteObject.createNew ("com.detektor.kateenapp.b4xradiobutton");__ref.setField("_b4xradiobutton3",menuorden._b4xradiobutton3);
 //BA.debugLineNum = 15;BA.debugLine="Private Button1 As B4XView";
menuorden._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_button1",menuorden._button1);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (menuorden) ","menuorden",11,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "menuorden","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.ShouldStop(2097152);
if (true) return __ref;
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (menuorden) ","menuorden",11,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "menuorden","label1_click", __ref);}
 BA.debugLineNum = 50;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="If Panel15.Visible=False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_panel15" /*RemoteObject*/ ).runMethod(true,"getVisible"),menuorden.__c.getField(true,"False"))) { 
 BA.debugLineNum = 53;BA.debugLine="Panel15.Visible=True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_panel15" /*RemoteObject*/ ).runMethod(true,"setVisible",menuorden.__c.getField(true,"True"));
 BA.debugLineNum = 54;BA.debugLine="Panel15.BringToFront";
Debug.ShouldStop(2097152);
__ref.getField(false,"_panel15" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 55;BA.debugLine="Panel15.RequestFocus";
Debug.ShouldStop(4194304);
__ref.getField(false,"_panel15" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 56;BA.debugLine="B4XComboBox1.mBase.Visible=False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_b4xcombobox1" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",menuorden.__c.getField(true,"False"));
 };
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (menuorden) ","menuorden",11,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "menuorden","label2_click", __ref);}
 BA.debugLineNum = 62;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="If Panel16.Visible=False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_panel16" /*RemoteObject*/ ).runMethod(true,"getVisible"),menuorden.__c.getField(true,"False"))) { 
 BA.debugLineNum = 65;BA.debugLine="Panel16.Visible=True";
Debug.ShouldStop(1);
__ref.getField(false,"_panel16" /*RemoteObject*/ ).runMethod(true,"setVisible",menuorden.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="Panel16.BringToFront";
Debug.ShouldStop(2);
__ref.getField(false,"_panel16" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 67;BA.debugLine="Panel16.RequestFocus";
Debug.ShouldStop(4);
__ref.getField(false,"_panel16" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 68;BA.debugLine="B4XComboBox1.mBase.Visible=False";
Debug.ShouldStop(8);
__ref.getField(false,"_b4xcombobox1" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",menuorden.__c.getField(true,"False"));
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlcerrar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlcerrar_Click (menuorden) ","menuorden",11,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("pnlcerrar_click")) { return __ref.runUserSub(false, "menuorden","pnlcerrar_click", __ref);}
 BA.debugLineNum = 73;BA.debugLine="Private Sub pnlcerrar_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="If Panel15.Visible=True Or Panel16.visible=True T";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_panel15" /*RemoteObject*/ ).runMethod(true,"getVisible"),menuorden.__c.getField(true,"True")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_panel16" /*RemoteObject*/ ).runMethod(true,"getVisible"),menuorden.__c.getField(true,"True"))) { 
 BA.debugLineNum = 75;BA.debugLine="Panel15.Visible=False";
Debug.ShouldStop(1024);
__ref.getField(false,"_panel15" /*RemoteObject*/ ).runMethod(true,"setVisible",menuorden.__c.getField(true,"False"));
 BA.debugLineNum = 76;BA.debugLine="Panel16.Visible=False";
Debug.ShouldStop(2048);
__ref.getField(false,"_panel16" /*RemoteObject*/ ).runMethod(true,"setVisible",menuorden.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="B4XComboBox1.mBase.Visible=True";
Debug.ShouldStop(4096);
__ref.getField(false,"_b4xcombobox1" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",menuorden.__c.getField(true,"True"));
 };
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
}