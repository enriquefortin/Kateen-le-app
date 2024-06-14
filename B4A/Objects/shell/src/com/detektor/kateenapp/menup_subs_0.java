package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class menup_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (menup) ","menup",12,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "menup","b4xpage_created", __ref, _root1);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Root = Root1";
Debug.ShouldStop(32768);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 18;BA.debugLine="Root1.LoadLayout(\"menup\")";
Debug.ShouldStop(131072);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("menup")),__ref.getField(false, "ba"));
 BA.debugLineNum = 20;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 22;BA.debugLine="p.SetLayoutAnimated(100, 0,0, 100%x, 115dip)";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(menup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))));
 BA.debugLineNum = 23;BA.debugLine="p.LoadLayout(\"ordenes\")";
Debug.ShouldStop(4194304);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ordenes")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAssets";
Debug.ShouldStop(8388608);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), menup.__c.runMethod(false,"LoadBitmapResize",(Object)(menup.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("gpssat.png")),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.getField(true,"True"))).getObject());Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 25;BA.debugLine="imgpproducto.SetBitmap(b)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_imgpproducto" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_b.getObject())));
 BA.debugLineNum = 27;BA.debugLine="lblhora.Text=\"8:00AM-9:00AM\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblhora" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("8:00AM-9:00AM"));
 BA.debugLineNum = 28;BA.debugLine="CLVS1.Add(p,0)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_clvs1" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 30;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 31;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(menup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))));
 BA.debugLineNum = 32;BA.debugLine="p.LoadLayout(\"ordenes\")";
Debug.ShouldStop(-2147483648);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ordenes")),__ref.getField(false, "ba"));
 BA.debugLineNum = 33;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
Debug.ShouldStop(1);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), menup.__c.runMethod(false,"LoadBitmapResize",(Object)(menup.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("radiogps.png")),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.getField(true,"True"))).getObject());Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 34;BA.debugLine="imgpproducto.SetBitmap(b)";
Debug.ShouldStop(2);
__ref.getField(false,"_imgpproducto" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_b.getObject())));
 BA.debugLineNum = 35;BA.debugLine="lblhora.Text=\"10:00AM-11:00AM\"";
Debug.ShouldStop(4);
__ref.getField(false,"_lblhora" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("10:00AM-11:00AM"));
 BA.debugLineNum = 36;BA.debugLine="CLVS1.Add(p,1)";
Debug.ShouldStop(8);
__ref.getField(false,"_clvs1" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 39;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 41;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
Debug.ShouldStop(256);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(menup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))));
 BA.debugLineNum = 42;BA.debugLine="p.LoadLayout(\"ordenes\")";
Debug.ShouldStop(512);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ordenes")),__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
Debug.ShouldStop(1024);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), menup.__c.runMethod(false,"LoadBitmapResize",(Object)(menup.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("sergpsradio.png")),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.getField(true,"True"))).getObject());Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 44;BA.debugLine="imgpproducto.SetBitmap(b)";
Debug.ShouldStop(2048);
__ref.getField(false,"_imgpproducto" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_b.getObject())));
 BA.debugLineNum = 45;BA.debugLine="lblhora.Text=\"11:30AM-1:30PM\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblhora" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("11:30AM-1:30PM"));
 BA.debugLineNum = 46;BA.debugLine="CLVS1.Add(p,2)";
Debug.ShouldStop(8192);
__ref.getField(false,"_clvs1" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 48;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 50;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
Debug.ShouldStop(131072);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(menup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))));
 BA.debugLineNum = 51;BA.debugLine="p.LoadLayout(\"ordenes\")";
Debug.ShouldStop(262144);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ordenes")),__ref.getField(false, "ba"));
 BA.debugLineNum = 52;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
Debug.ShouldStop(524288);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), menup.__c.runMethod(false,"LoadBitmapResize",(Object)(menup.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("servariagpsrad.png")),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.getField(true,"True"))).getObject());Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 53;BA.debugLine="imgpproducto.SetBitmap(b)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_imgpproducto" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_b.getObject())));
 BA.debugLineNum = 54;BA.debugLine="lblhora.Text=\"3:00PM-5:00PM\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblhora" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("3:00PM-5:00PM"));
 BA.debugLineNum = 55;BA.debugLine="CLVS1.Add(p,3)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_clvs1" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 57;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 59;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(menup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 115)))));
 BA.debugLineNum = 60;BA.debugLine="p.LoadLayout(\"ordenes\")";
Debug.ShouldStop(134217728);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ordenes")),__ref.getField(false, "ba"));
 BA.debugLineNum = 61;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
Debug.ShouldStop(268435456);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), menup.__c.runMethod(false,"LoadBitmapResize",(Object)(menup.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("servicio.png")),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(menup.__c.getField(true,"True"))).getObject());Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="imgpproducto.SetBitmap(b)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_imgpproducto" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((_b.getObject())));
 BA.debugLineNum = 63;BA.debugLine="lblhora.Text=\"5:30PM - ...\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblhora" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("5:30PM - ..."));
 BA.debugLineNum = 64;BA.debugLine="CLVS1.Add(p,4)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_clvs1" /*RemoteObject*/ ).runVoidMethod ("_add",(Object)(_p),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
menup._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",menup._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
menup._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",menup._xui);
 //BA.debugLineNum = 4;BA.debugLine="Public CLVS1 As CustomListView";
menup._clvs1 = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clvs1",menup._clvs1);
 //BA.debugLineNum = 5;BA.debugLine="Private lblhora As B4XView";
menup._lblhora = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblhora",menup._lblhora);
 //BA.debugLineNum = 6;BA.debugLine="Private imgpproducto As B4XView";
menup._imgpproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_imgpproducto",menup._imgpproducto);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clvs1_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLVS1_ItemClick (menup) ","menup",12,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("clvs1_itemclick")) { return __ref.runUserSub(false, "menup","clvs1_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 134;BA.debugLine="Private Sub CLVS1_ItemClick (Index As Int, Value A";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="If Index=4 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 136;BA.debugLine="Log(\"en el index 5\")";
Debug.ShouldStop(128);
menup.__c.runVoidMethod ("LogImpl","29699330",RemoteObject.createImmutable("en el index 5"),0);
 BA.debugLineNum = 137;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"menuord";
Debug.ShouldStop(256);
menup._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("menuorden")));
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (menup) ","menup",12,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "menup","initialize", __ref, _ba);}
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