package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class opencamera_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "opencamera","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root1.LoadLayout(\"OpenCamera\")";
Debug.ShouldStop(33554432);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("OpenCamera")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="toast.Initialize(Root)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_toast" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.bctoast.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_root" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="StartCamera";
Debug.ShouldStop(268435456);
__ref.runClassMethod (com.detektor.kateenapp.opencamera.class, "_startcamera" /*void*/ );
 BA.debugLineNum = 30;BA.debugLine="B4XPages.SetTitle(Me, \"Barcode Example\")";
Debug.ShouldStop(536870912);
opencamera._b4xpages.runVoidMethod ("_settitle" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)((RemoteObject.createImmutable("Barcode Example"))));
 BA.debugLineNum = 32;BA.debugLine="CreateDetector(Array(\"AZTEC\", \"CODE_128\", \"CODE_3";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (com.detektor.kateenapp.opencamera.class, "_createdetector" /*RemoteObject*/ ,(Object)(opencamera.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {13},new Object[] {RemoteObject.createImmutable(("AZTEC")),RemoteObject.createImmutable(("CODE_128")),RemoteObject.createImmutable(("CODE_39")),RemoteObject.createImmutable(("CODE_93")),RemoteObject.createImmutable(("CODABAR")),RemoteObject.createImmutable(("DATA_MATRIX")),RemoteObject.createImmutable(("EAN_13")),RemoteObject.createImmutable(("EAN_8")),RemoteObject.createImmutable(("ITF")),RemoteObject.createImmutable(("PDF417")),RemoteObject.createImmutable(("QR_CODE")),RemoteObject.createImmutable(("UPC_A")),(RemoteObject.createImmutable("UPC_E"))})))));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsiguienteopencamera_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnsiguienteopencamera_Click (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("btnsiguienteopencamera_click")) { return __ref.runUserSub(false, "opencamera","btnsiguienteopencamera_click", __ref);}
 BA.debugLineNum = 44;BA.debugLine="Private Sub btnsiguienteopencamera_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 48;BA.debugLine="StopCamera";
Debug.ShouldStop(32768);
__ref.runClassMethod (com.detektor.kateenapp.opencamera.class, "_stopcamera" /*RemoteObject*/ );
 BA.debugLineNum = 50;BA.debugLine="ToastMessageShow(\"Camara detenida codigo leido\",F";
Debug.ShouldStop(131072);
opencamera.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Camara detenida codigo leido")),(Object)(opencamera.__c.getField(true,"False")));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camera1_preview(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera1_Preview (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("camera1_preview")) { return __ref.runUserSub(false, "opencamera","camera1_preview", __ref, _data);}
RemoteObject _framebuilder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _bb = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cs = RemoteObject.declareNull("com.detektor.kateenapp.cameraexclass._camerasize");
RemoteObject _frame = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _sparsearray = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _matches = RemoteObject.createImmutable(0);
RemoteObject _barcode = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _raw = RemoteObject.createImmutable("");
Debug.locals.put("data", _data);
 BA.debugLineNum = 80;BA.debugLine="Private Sub Camera1_Preview (data() As Byte)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="If DateTime.Now > LastPreview + IntervalBetweenPr";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",opencamera.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastpreview" /*RemoteObject*/ ),__ref.getField(true,"_intervalbetweenpreviewsms" /*RemoteObject*/ )}, "+",1, 2))) { 
 BA.debugLineNum = 83;BA.debugLine="Dim frameBuilder As JavaObject";
Debug.ShouldStop(262144);
_framebuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("frameBuilder", _framebuilder);
 BA.debugLineNum = 84;BA.debugLine="Dim bb As JavaObject";
Debug.ShouldStop(524288);
_bb = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("bb", _bb);
 BA.debugLineNum = 85;BA.debugLine="bb = bb.InitializeStatic(\"java.nio.ByteBuffer\").";
Debug.ShouldStop(1048576);
_bb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _bb.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("java.nio.ByteBuffer"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("wrap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_data)}))));Debug.locals.put("bb", _bb);
 BA.debugLineNum = 86;BA.debugLine="frameBuilder.InitializeNewInstance(\"com/google/a";
Debug.ShouldStop(2097152);
_framebuilder.runVoidMethod ("InitializeNewInstance",(Object)(RemoteObject.createImmutable("com/google/android/gms/vision/Frame.Builder").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(".")))),(Object)((opencamera.__c.getField(false,"Null"))));
 BA.debugLineNum = 87;BA.debugLine="Dim cs As CameraSize = camEx.GetPreviewSize";
Debug.ShouldStop(4194304);
_cs = __ref.getField(false,"_camex" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.cameraexclass.class, "_getpreviewsize" /*RemoteObject*/ );Debug.locals.put("cs", _cs);Debug.locals.put("cs", _cs);
 BA.debugLineNum = 88;BA.debugLine="frameBuilder.RunMethod(\"setImageData\", Array(bb,";
Debug.ShouldStop(8388608);
_framebuilder.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImageData")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_bb.getObject()),(_cs.getField(true,"Width" /*RemoteObject*/ )),(_cs.getField(true,"Height" /*RemoteObject*/ )),RemoteObject.createImmutable((842094169))})));
 BA.debugLineNum = 89;BA.debugLine="Dim frame As JavaObject = frameBuilder.RunMethod";
Debug.ShouldStop(16777216);
_frame = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_frame = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _framebuilder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((opencamera.__c.getField(false,"Null")))));Debug.locals.put("frame", _frame);Debug.locals.put("frame", _frame);
 BA.debugLineNum = 90;BA.debugLine="Dim SparseArray As JavaObject = detector.RunMeth";
Debug.ShouldStop(33554432);
_sparsearray = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sparsearray = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_detector" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("detect")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_frame.getObject())}))));Debug.locals.put("SparseArray", _sparsearray);Debug.locals.put("SparseArray", _sparsearray);
 BA.debugLineNum = 91;BA.debugLine="LastPreview = DateTime.Now";
Debug.ShouldStop(67108864);
__ref.setField ("_lastpreview" /*RemoteObject*/ ,opencamera.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 92;BA.debugLine="Dim Matches As Int = SparseArray.RunMethod(\"size";
Debug.ShouldStop(134217728);
_matches = BA.numberCast(int.class, _sparsearray.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("size")),(Object)((opencamera.__c.getField(false,"Null")))));Debug.locals.put("Matches", _matches);Debug.locals.put("Matches", _matches);
 BA.debugLineNum = 93;BA.debugLine="If Matches > 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_matches,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 94;BA.debugLine="Dim barcode As JavaObject = SparseArray.RunMeth";
Debug.ShouldStop(536870912);
_barcode = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_barcode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _sparsearray.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("valueAt")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((0))}))));Debug.locals.put("barcode", _barcode);Debug.locals.put("barcode", _barcode);
 BA.debugLineNum = 95;BA.debugLine="Dim raw As String = barcode.GetField(\"rawValue\"";
Debug.ShouldStop(1073741824);
_raw = BA.ObjectToString(_barcode.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("rawValue"))));Debug.locals.put("raw", _raw);Debug.locals.put("raw", _raw);
 BA.debugLineNum = 96;BA.debugLine="FoundBarcode(raw)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (com.detektor.kateenapp.opencamera.class, "_foundbarcode" /*RemoteObject*/ ,(Object)(_raw));
 };
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
opencamera._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",opencamera._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
opencamera._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",opencamera._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private pnlopencamera As B4XView";
opencamera._pnlopencamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlopencamera",opencamera._pnlopencamera);
 //BA.debugLineNum = 5;BA.debugLine="Private lblResult As B4XView";
opencamera._lblresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresult",opencamera._lblresult);
 //BA.debugLineNum = 6;BA.debugLine="Private btnsiguienteopencamera As B4XView";
opencamera._btnsiguienteopencamera = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnsiguienteopencamera",opencamera._btnsiguienteopencamera);
 //BA.debugLineNum = 7;BA.debugLine="Private rp As RuntimePermissions";
opencamera._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",opencamera._rp);
 //BA.debugLineNum = 8;BA.debugLine="Private detector As JavaObject";
opencamera._detector = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_detector",opencamera._detector);
 //BA.debugLineNum = 9;BA.debugLine="Private camEx As CameraExClass";
opencamera._camex = RemoteObject.createNew ("com.detektor.kateenapp.cameraexclass");__ref.setField("_camex",opencamera._camex);
 //BA.debugLineNum = 10;BA.debugLine="Private LastPreview As Long";
opencamera._lastpreview = RemoteObject.createImmutable(0L);__ref.setField("_lastpreview",opencamera._lastpreview);
 //BA.debugLineNum = 11;BA.debugLine="Private IntervalBetweenPreviewsMs As Int = 100";
opencamera._intervalbetweenpreviewsms = BA.numberCast(int.class, 100);__ref.setField("_intervalbetweenpreviewsms",opencamera._intervalbetweenpreviewsms);
 //BA.debugLineNum = 12;BA.debugLine="Private toast As BCToast";
opencamera._toast = RemoteObject.createNew ("com.detektor.kateenapp.bctoast");__ref.setField("_toast",opencamera._toast);
 //BA.debugLineNum = 13;BA.debugLine="Private lblResult As B4XView";
opencamera._lblresult = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblresult",opencamera._lblresult);
 //BA.debugLineNum = 14;BA.debugLine="Private Capturing As Boolean";
opencamera._capturing = RemoteObject.createImmutable(false);__ref.setField("_capturing",opencamera._capturing);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createdetector(RemoteObject __ref,RemoteObject _codes) throws Exception{
try {
		Debug.PushSubsStack("CreateDetector (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("createdetector")) { return __ref.runUserSub(false, "opencamera","createdetector", __ref, _codes);}
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _builder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _barcodeclass = RemoteObject.createImmutable("");
RemoteObject _barcodestatic = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _format = RemoteObject.createImmutable(0);
RemoteObject _formatname = RemoteObject.createImmutable("");
RemoteObject _operational = RemoteObject.createImmutable(false);
Debug.locals.put("Codes", _codes);
 BA.debugLineNum = 59;BA.debugLine="Private Sub CreateDetector (Codes As List)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(134217728);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 61;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(268435456);
_ctxt.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 62;BA.debugLine="Dim builder As JavaObject";
Debug.ShouldStop(536870912);
_builder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("builder", _builder);
 BA.debugLineNum = 63;BA.debugLine="builder.InitializeNewInstance(\"com/google/android";
Debug.ShouldStop(1073741824);
_builder.runVoidMethod ("InitializeNewInstance",(Object)(RemoteObject.createImmutable("com/google/android/gms/vision/barcode/BarcodeDetector.Builder").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ctxt.getObject())})));
 BA.debugLineNum = 64;BA.debugLine="Dim barcodeClass As String = \"com/google/android/";
Debug.ShouldStop(-2147483648);
_barcodeclass = RemoteObject.createImmutable("com/google/android/gms/vision/barcode/Barcode").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("barcodeClass", _barcodeclass);Debug.locals.put("barcodeClass", _barcodeclass);
 BA.debugLineNum = 65;BA.debugLine="Dim barcodeStatic As JavaObject";
Debug.ShouldStop(1);
_barcodestatic = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("barcodeStatic", _barcodestatic);
 BA.debugLineNum = 66;BA.debugLine="barcodeStatic.InitializeStatic(barcodeClass)";
Debug.ShouldStop(2);
_barcodestatic.runVoidMethod ("InitializeStatic",(Object)(_barcodeclass));
 BA.debugLineNum = 67;BA.debugLine="Dim format As Int";
Debug.ShouldStop(4);
_format = RemoteObject.createImmutable(0);Debug.locals.put("format", _format);
 BA.debugLineNum = 68;BA.debugLine="For Each formatName As String In Codes";
Debug.ShouldStop(8);
{
final RemoteObject group9 = _codes;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_formatname = BA.ObjectToString(group9.runMethod(false,"Get",index9));Debug.locals.put("formatName", _formatname);
Debug.locals.put("formatName", _formatname);
 BA.debugLineNum = 69;BA.debugLine="format = Bit.Or(format, barcodeStatic.GetField(f";
Debug.ShouldStop(16);
_format = opencamera.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_format),(Object)(BA.numberCast(int.class, _barcodestatic.runMethod(false,"GetField",(Object)(_formatname)))));Debug.locals.put("format", _format);
 }
}Debug.locals.put("formatName", _formatname);
;
 BA.debugLineNum = 71;BA.debugLine="builder.RunMethod(\"setBarcodeFormats\", Array(form";
Debug.ShouldStop(64);
_builder.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBarcodeFormats")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_format)})));
 BA.debugLineNum = 72;BA.debugLine="detector = builder.RunMethod(\"build\", Null)";
Debug.ShouldStop(128);
__ref.getField(false,"_detector" /*RemoteObject*/ ).setObject (_builder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((opencamera.__c.getField(false,"Null")))));
 BA.debugLineNum = 73;BA.debugLine="Dim operational As Boolean = detector.RunMethod(\"";
Debug.ShouldStop(256);
_operational = BA.ObjectToBoolean(__ref.getField(false,"_detector" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isOperational")),(Object)((opencamera.__c.getField(false,"Null")))));Debug.locals.put("operational", _operational);Debug.locals.put("operational", _operational);
 BA.debugLineNum = 74;BA.debugLine="If operational = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_operational,opencamera.__c.getField(true,"False"))) { 
 BA.debugLineNum = 75;BA.debugLine="toast.Show(\"Failed to create detector\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_toast" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.createImmutable("Failed to create detector")));
 };
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
public static RemoteObject  _foundbarcode(RemoteObject __ref,RemoteObject _msg) throws Exception{
try {
		Debug.PushSubsStack("FoundBarcode (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("foundbarcode")) { return __ref.runUserSub(false, "opencamera","foundbarcode", __ref, _msg);}
Debug.locals.put("msg", _msg);
 BA.debugLineNum = 53;BA.debugLine="Private Sub FoundBarcode (msg As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="lblResult.Text = msg";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblresult" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_msg));
 BA.debugLineNum = 55;BA.debugLine="toast.Show($\"Found [Color=Blue][b][plain]${msg}[/";
Debug.ShouldStop(4194304);
__ref.getField(false,"_toast" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.bctoast.class, "_show" /*void*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Found [Color=Blue][b][plain]"),opencamera.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_msg))),RemoteObject.createImmutable("[/plain][/b][/Color]")))));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Initialize (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "opencamera","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Return Me";
Debug.ShouldStop(262144);
if (true) return __ref;
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _startcamera(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartCamera (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("startcamera")) { __ref.runUserSub(false, "opencamera","startcamera", __ref); return;}
ResumableSub_StartCamera rsub = new ResumableSub_StartCamera(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartCamera extends BA.ResumableSub {
public ResumableSub_StartCamera(com.detektor.kateenapp.opencamera parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
com.detektor.kateenapp.opencamera parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartCamera (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,101);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 102;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
Debug.ShouldStop(32);
__ref.getField(false,"_rp" /*RemoteObject*/ ).runVoidMethod ("CheckAndRequest",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_rp" /*RemoteObject*/ ).getField(true,"PERMISSION_CAMERA")));
 BA.debugLineNum = 103;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","b4xpage_permissionresult", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "opencamera", "startcamera"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 104;BA.debugLine="If Result = False Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 105;BA.debugLine="toast.Show(\"No permission!\")";
Debug.ShouldStop(256);
__ref.getField(false,"_toast" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.createImmutable("No permission!")));
 BA.debugLineNum = 106;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 108;BA.debugLine="StartCameraShared";
Debug.ShouldStop(2048);
__ref.runClassMethod (com.detektor.kateenapp.opencamera.class, "_startcamerashared" /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="camEx.Initialize(pnlopencamera, False, Me, \"Camer";
Debug.ShouldStop(4096);
__ref.getField(false,"_camex" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.cameraexclass.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_pnlopencamera" /*RemoteObject*/ ).getObject()),(Object)(parent.__c.getField(true,"False")),(Object)(__ref),(Object)(RemoteObject.createImmutable("Camera1")));
 BA.debugLineNum = 110;BA.debugLine="Wait For Camera1_Ready (Success As Boolean)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","camera1_ready", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "opencamera", "startcamera"), null);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 111;BA.debugLine="If Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 10;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 112;BA.debugLine="camEx.SetContinuousAutoFocus";
Debug.ShouldStop(32768);
__ref.getField(false,"_camex" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.cameraexclass.class, "_setcontinuousautofocus" /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="camEx.CommitParameters";
Debug.ShouldStop(65536);
__ref.getField(false,"_camex" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.cameraexclass.class, "_commitparameters" /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="camEx.StartPreview";
Debug.ShouldStop(131072);
__ref.getField(false,"_camex" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.cameraexclass.class, "_startpreview" /*RemoteObject*/ );
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 116;BA.debugLine="toast.Show(\"Error opening camera\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_toast" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.bctoast.class, "_show" /*void*/ ,(Object)(RemoteObject.createImmutable("Error opening camera")));
 BA.debugLineNum = 117;BA.debugLine="StopCamera";
Debug.ShouldStop(1048576);
__ref.runClassMethod (com.detektor.kateenapp.opencamera.class, "_stopcamera" /*RemoteObject*/ );
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _b4xpage_permissionresult(RemoteObject __ref,RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static void  _camera1_ready(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _startcamerashared(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartCameraShared (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("startcamerashared")) { return __ref.runUserSub(false, "opencamera","startcamerashared", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Private Sub StartCameraShared";
Debug.ShouldStop(32);
 BA.debugLineNum = 136;BA.debugLine="pnlopencamera.Visible = True";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlopencamera" /*RemoteObject*/ ).runMethod(true,"setVisible",opencamera.__c.getField(true,"True"));
 BA.debugLineNum = 137;BA.debugLine="Capturing = True";
Debug.ShouldStop(256);
__ref.setField ("_capturing" /*RemoteObject*/ ,opencamera.__c.getField(true,"True"));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopcamera(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopCamera (opencamera) ","opencamera",5,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("stopcamera")) { return __ref.runUserSub(false, "opencamera","stopcamera", __ref);}
 BA.debugLineNum = 121;BA.debugLine="Private Sub StopCamera";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Capturing = False";
Debug.ShouldStop(33554432);
__ref.setField ("_capturing" /*RemoteObject*/ ,opencamera.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="pnlopencamera.Visible = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlopencamera" /*RemoteObject*/ ).runMethod(true,"setVisible",opencamera.__c.getField(true,"False"));
 BA.debugLineNum = 126;BA.debugLine="If camEx.IsInitialized Then";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_camex" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 127;BA.debugLine="camEx.Release";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_camex" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.cameraexclass.class, "_release" /*RemoteObject*/ );
 };
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}