package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class opencamera extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.opencamera");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.opencamera.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlopencamera = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresult = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsiguienteopencamera = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4j.object.JavaObject _detector = null;
public com.detektor.kateenapp.cameraexclass _camex = null;
public long _lastpreview = 0L;
public int _intervalbetweenpreviewsms = 0;
public com.detektor.kateenapp.bctoast _toast = null;
public boolean _capturing = false;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(com.detektor.kateenapp.opencamera __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(com.detektor.kateenapp.opencamera __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Root1.LoadLayout(\"OpenCamera\")";
_root1.LoadLayout("OpenCamera",ba);
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="toast.Initialize(Root)";
__ref._toast /*com.detektor.kateenapp.bctoast*/ ._initialize /*String*/ (null,ba,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="StartCamera";
__ref._startcamera /*void*/ (null);
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="B4XPages.SetTitle(Me, \"Barcode Example\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Barcode Example"));
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="CreateDetector(Array(\"AZTEC\", \"CODE_128\", \"CODE_3";
__ref._createdetector /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("AZTEC"),(Object)("CODE_128"),(Object)("CODE_39"),(Object)("CODE_93"),(Object)("CODABAR"),(Object)("DATA_MATRIX"),(Object)("EAN_13"),(Object)("EAN_8"),(Object)("ITF"),(Object)("PDF417"),(Object)("QR_CODE"),(Object)("UPC_A"),(Object)("UPC_E")}));
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="End Sub";
return "";
}
public void  _startcamera(com.detektor.kateenapp.opencamera __ref) throws Exception{
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "startcamera", false))
	 {Debug.delegate(ba, "startcamera", null); return;}
ResumableSub_StartCamera rsub = new ResumableSub_StartCamera(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_StartCamera extends BA.ResumableSub {
public ResumableSub_StartCamera(com.detektor.kateenapp.opencamera parent,com.detektor.kateenapp.opencamera __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.detektor.kateenapp.opencamera __ref;
com.detektor.kateenapp.opencamera parent;
String _permission = "";
boolean _result = false;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="opencamera";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(ba,__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_CAMERA);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "opencamera", "startcamera"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_permission = (String) result[1];
_result = (Boolean) result[2];
;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="If Result = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="toast.Show(\"No permission!\")";
__ref._toast /*com.detektor.kateenapp.bctoast*/ ._show /*void*/ (null,"No permission!");
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="StartCameraShared";
__ref._startcamerashared /*String*/ (null);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="camEx.Initialize(pnlopencamera, False, Me, \"Camer";
__ref._camex /*com.detektor.kateenapp.cameraexclass*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._pnlopencamera /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())),parent.__c.False,parent,"Camera1");
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="Wait For Camera1_Ready (Success As Boolean)";
parent.__c.WaitFor("camera1_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "opencamera", "startcamera"), null);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="If Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_success) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="camEx.SetContinuousAutoFocus";
__ref._camex /*com.detektor.kateenapp.cameraexclass*/ ._setcontinuousautofocus /*String*/ (null);
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="camEx.CommitParameters";
__ref._camex /*com.detektor.kateenapp.cameraexclass*/ ._commitparameters /*String*/ (null);
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="camEx.StartPreview";
__ref._camex /*com.detektor.kateenapp.cameraexclass*/ ._startpreview /*String*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="toast.Show(\"Error opening camera\")";
__ref._toast /*com.detektor.kateenapp.bctoast*/ ._show /*void*/ (null,"Error opening camera");
RDebugUtils.currentLine=3342352;
 //BA.debugLineNum = 3342352;BA.debugLine="StopCamera";
__ref._stopcamera /*String*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=3342354;
 //BA.debugLineNum = 3342354;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _createdetector(com.detektor.kateenapp.opencamera __ref,anywheresoftware.b4a.objects.collections.List _codes) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "createdetector", false))
	 {return ((String) Debug.delegate(ba, "createdetector", new Object[] {_codes}));}
anywheresoftware.b4j.object.JavaObject _ctxt = null;
anywheresoftware.b4j.object.JavaObject _builder = null;
String _barcodeclass = "";
anywheresoftware.b4j.object.JavaObject _barcodestatic = null;
int _format = 0;
String _formatname = "";
boolean _operational = false;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Private Sub CreateDetector (Codes As List)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="builder.InitializeNewInstance(\"com/google/android";
_builder.InitializeNewInstance("com/google/android/gms/vision/barcode/BarcodeDetector.Builder".replace("/","."),new Object[]{(Object)(_ctxt.getObject())});
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Dim barcodeClass As String = \"com/google/android/";
_barcodeclass = "com/google/android/gms/vision/barcode/Barcode".replace("/",".");
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="Dim barcodeStatic As JavaObject";
_barcodestatic = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="barcodeStatic.InitializeStatic(barcodeClass)";
_barcodestatic.InitializeStatic(_barcodeclass);
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="Dim format As Int";
_format = 0;
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="For Each formatName As String In Codes";
{
final anywheresoftware.b4a.BA.IterableList group9 = _codes;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_formatname = BA.ObjectToString(group9.Get(index9));
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="format = Bit.Or(format, barcodeStatic.GetField(f";
_format = __c.Bit.Or(_format,(int)(BA.ObjectToNumber(_barcodestatic.GetField(_formatname))));
 }
};
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="builder.RunMethod(\"setBarcodeFormats\", Array(form";
_builder.RunMethod("setBarcodeFormats",new Object[]{(Object)(_format)});
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="detector = builder.RunMethod(\"build\", Null)";
__ref._detector /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_builder.RunMethod("build",(Object[])(__c.Null))));
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="Dim operational As Boolean = detector.RunMethod(\"";
_operational = BA.ObjectToBoolean(__ref._detector /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("isOperational",(Object[])(__c.Null)));
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="If operational = False Then";
if (_operational==__c.False) { 
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="toast.Show(\"Failed to create detector\")";
__ref._toast /*com.detektor.kateenapp.bctoast*/ ._show /*void*/ (null,"Failed to create detector");
 };
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="End Sub";
return "";
}
public String  _btnsiguienteopencamera_click(com.detektor.kateenapp.opencamera __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "btnsiguienteopencamera_click", false))
	 {return ((String) Debug.delegate(ba, "btnsiguienteopencamera_click", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub btnsiguienteopencamera_Click";
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="StopCamera";
__ref._stopcamera /*String*/ (null);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="ToastMessageShow(\"Camara detenida codigo leido\",F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Camara detenida codigo leido"),__c.False);
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="End Sub";
return "";
}
public String  _stopcamera(com.detektor.kateenapp.opencamera __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "stopcamera", false))
	 {return ((String) Debug.delegate(ba, "stopcamera", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub StopCamera";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Capturing = False";
__ref._capturing /*boolean*/  = __c.False;
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="pnlopencamera.Visible = False";
__ref._pnlopencamera /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="If camEx.IsInitialized Then";
if (__ref._camex /*com.detektor.kateenapp.cameraexclass*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="camEx.Release";
__ref._camex /*com.detektor.kateenapp.cameraexclass*/ ._release /*String*/ (null);
 };
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="End Sub";
return "";
}
public String  _camera1_preview(com.detektor.kateenapp.opencamera __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "camera1_preview", false))
	 {return ((String) Debug.delegate(ba, "camera1_preview", new Object[] {_data}));}
anywheresoftware.b4j.object.JavaObject _framebuilder = null;
anywheresoftware.b4j.object.JavaObject _bb = null;
com.detektor.kateenapp.cameraexclass._camerasize _cs = null;
anywheresoftware.b4j.object.JavaObject _frame = null;
anywheresoftware.b4j.object.JavaObject _sparsearray = null;
int _matches = 0;
anywheresoftware.b4j.object.JavaObject _barcode = null;
String _raw = "";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub Camera1_Preview (data() As Byte)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If DateTime.Now > LastPreview + IntervalBetweenPr";
if (__c.DateTime.getNow()>__ref._lastpreview /*long*/ +__ref._intervalbetweenpreviewsms /*int*/ ) { 
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Dim frameBuilder As JavaObject";
_framebuilder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="Dim bb As JavaObject";
_bb = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="bb = bb.InitializeStatic(\"java.nio.ByteBuffer\").";
_bb = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_bb.InitializeStatic("java.nio.ByteBuffer").RunMethod("wrap",new Object[]{(Object)(_data)})));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="frameBuilder.InitializeNewInstance(\"com/google/a";
_framebuilder.InitializeNewInstance("com/google/android/gms/vision/Frame.Builder".replace("/","."),(Object[])(__c.Null));
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Dim cs As CameraSize = camEx.GetPreviewSize";
_cs = __ref._camex /*com.detektor.kateenapp.cameraexclass*/ ._getpreviewsize /*com.detektor.kateenapp.cameraexclass._camerasize*/ (null);
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="frameBuilder.RunMethod(\"setImageData\", Array(bb,";
_framebuilder.RunMethod("setImageData",new Object[]{(Object)(_bb.getObject()),(Object)(_cs.Width /*int*/ ),(Object)(_cs.Height /*int*/ ),(Object)(842094169)});
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="Dim frame As JavaObject = frameBuilder.RunMethod";
_frame = new anywheresoftware.b4j.object.JavaObject();
_frame = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_framebuilder.RunMethod("build",(Object[])(__c.Null))));
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Dim SparseArray As JavaObject = detector.RunMeth";
_sparsearray = new anywheresoftware.b4j.object.JavaObject();
_sparsearray = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._detector /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("detect",new Object[]{(Object)(_frame.getObject())})));
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="LastPreview = DateTime.Now";
__ref._lastpreview /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Dim Matches As Int = SparseArray.RunMethod(\"size";
_matches = (int)(BA.ObjectToNumber(_sparsearray.RunMethod("size",(Object[])(__c.Null))));
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="If Matches > 0 Then";
if (_matches>0) { 
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="Dim barcode As JavaObject = SparseArray.RunMeth";
_barcode = new anywheresoftware.b4j.object.JavaObject();
_barcode = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sparsearray.RunMethod("valueAt",new Object[]{(Object)(0)})));
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="Dim raw As String = barcode.GetField(\"rawValue\"";
_raw = BA.ObjectToString(_barcode.GetField("rawValue"));
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="FoundBarcode(raw)";
__ref._foundbarcode /*String*/ (null,_raw);
 };
 };
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="End Sub";
return "";
}
public String  _foundbarcode(com.detektor.kateenapp.opencamera __ref,String _msg) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "foundbarcode", false))
	 {return ((String) Debug.delegate(ba, "foundbarcode", new Object[] {_msg}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Private Sub FoundBarcode (msg As String)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="lblResult.Text = msg";
__ref._lblresult /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(_msg));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="toast.Show($\"Found [Color=Blue][b][plain]${msg}[/";
__ref._toast /*com.detektor.kateenapp.bctoast*/ ._show /*void*/ (null,("Found [Color=Blue][b][plain]"+__c.SmartStringFormatter("",(Object)(_msg))+"[/plain][/b][/Color]"));
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.opencamera __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Private pnlopencamera As B4XView";
_pnlopencamera = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Private lblResult As B4XView";
_lblresult = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Private btnsiguienteopencamera As B4XView";
_btnsiguienteopencamera = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Private detector As JavaObject";
_detector = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Private camEx As CameraExClass";
_camex = new com.detektor.kateenapp.cameraexclass();
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Private LastPreview As Long";
_lastpreview = 0L;
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="Private IntervalBetweenPreviewsMs As Int = 100";
_intervalbetweenpreviewsms = (int) (100);
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Private toast As BCToast";
_toast = new com.detektor.kateenapp.bctoast();
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="Private lblResult As B4XView";
_lblresult = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Private Capturing As Boolean";
_capturing = false;
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="End Sub";
return "";
}
public String  _startcamerashared(com.detektor.kateenapp.opencamera __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="opencamera";
if (Debug.shouldDelegate(ba, "startcamerashared", false))
	 {return ((String) Debug.delegate(ba, "startcamerashared", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub StartCameraShared";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="pnlopencamera.Visible = True";
__ref._pnlopencamera /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Capturing = True";
__ref._capturing /*boolean*/  = __c.True;
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return "";
}
}