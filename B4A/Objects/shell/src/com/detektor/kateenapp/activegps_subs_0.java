package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class activegps_subs_0 {


public static RemoteObject  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (activegps) ","activegps",6,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("b4xpage_appear")) { return __ref.runUserSub(false, "activegps","b4xpage_appear", __ref);}
 BA.debugLineNum = 16;BA.debugLine="Sub B4XPage_Appear";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",activegps._starter._gps1 /*RemoteObject*/ .runMethod(true,"getGPSEnabled"),activegps.__c.getField(true,"False"))) { 
 BA.debugLineNum = 25;BA.debugLine="Button1.Enabled=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_button1" /*RemoteObject*/ ).runMethod(true,"setEnabled",activegps.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 33;BA.debugLine="Button1.Enabled=True";
Debug.ShouldStop(1);
__ref.getField(false,"_button1" /*RemoteObject*/ ).runMethod(true,"setEnabled",activegps.__c.getField(true,"True"));
 };
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (activegps) ","activegps",6,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "activegps","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 41;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Root = Root1";
Debug.ShouldStop(512);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 43;BA.debugLine="Root1.LoadLayout(\"gps\")";
Debug.ShouldStop(1024);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("gps")),__ref.getField(false, "ba"));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Button1_Click (activegps) ","activegps",6,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("button1_click")) { return __ref.runUserSub(false, "activegps","button1_click", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Private Sub Button1_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Log(\"click en el boton gps\")";
Debug.ShouldStop(1024);
activegps.__c.runVoidMethod ("LogImpl","23801089",RemoteObject.createImmutable("click en el boton gps"),0);
 BA.debugLineNum = 76;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"menup\")";
Debug.ShouldStop(2048);
activegps._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("menup")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
activegps._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",activegps._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
activegps._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",activegps._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private Button1 As B4XView";
activegps._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_button1",activegps._button1);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (activegps) ","activegps",6,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "activegps","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}