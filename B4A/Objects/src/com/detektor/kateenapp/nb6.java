package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class nb6 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.nb6");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.nb6.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _channel = null;
public anywheresoftware.b4j.object.JavaObject _notificationbuilder = null;
public int _sdklevel = 0;
public anywheresoftware.b4j.object.JavaObject _ctxt = null;
public int _s_old = 0;
public int _s_builder = 0;
public int _s_channel = 0;
public int _supportlevel = 0;
public anywheresoftware.b4a.objects.NotificationWrapper _oldnotification = null;
public anywheresoftware.b4j.object.JavaObject _pendingintentstatic = null;
public anywheresoftware.b4j.object.JavaObject _notificationstatic = null;
public anywheresoftware.b4j.object.JavaObject _common = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public com.detektor.kateenapp.nb6  _addbuttonaction(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _service,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "addbuttonaction", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "addbuttonaction", new Object[] {_bmp,_title,_service,_action}));}
Object _ac = null;
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub AddButtonAction (Bmp As Bitmap, Title A";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="If IsBuilder = False Then Return Me";
if (__ref._isbuilder /*boolean*/ (null)==__c.False) { 
if (true) return (com.detektor.kateenapp.nb6)(this);};
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="Dim ac As Object = CreateAction(Bmp, Title, Creat";
_ac = __ref._createaction /*Object*/ (null,_bmp,_title,__ref._createreceiverpendingintent /*Object*/ (null,_service,_action));
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addAction",new Object[]{_ac});
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="End Sub";
return null;
}
public boolean  _isbuilder(com.detektor.kateenapp.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "isbuilder", true))
	 {return ((Boolean) Debug.delegate(ba, "isbuilder", null));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub IsBuilder As Boolean";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Return SupportLevel >= S_BUILDER";
if (true) return __ref._supportlevel /*int*/ >=__ref._s_builder /*int*/ ;
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return false;
}
public Object  _createaction(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _pendingintent) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createaction", true))
	 {return ((Object) Debug.delegate(ba, "createaction", new Object[] {_bmp,_title,_pendingintent}));}
anywheresoftware.b4j.object.JavaObject _builder = null;
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Private Sub CreateAction (Bmp As Bitmap, Title As";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
_builder.InitializeNewInstance("android.app.Notification$Action$Builder",new Object[]{__ref._createiconfrombitmap /*Object*/ (null,_bmp),_title,_pendingintent});
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="Return builder.RunMethod(\"build\", Null)";
if (true) return _builder.RunMethod("build",(Object[])(__c.Null));
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="End Sub";
return null;
}
public Object  _createreceiverpendingintent(com.detektor.kateenapp.nb6 __ref,Object _service,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createreceiverpendingintent", true))
	 {return ((Object) Debug.delegate(ba, "createreceiverpendingintent", new Object[] {_service,_action}));}
anywheresoftware.b4a.objects.IntentWrapper _in = null;
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Private Sub CreateReceiverPendingIntent (Service A";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Dim in As Intent = CreateIntent(Service, True)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = __ref._createintent /*anywheresoftware.b4a.objects.IntentWrapper*/ (null,_service,__c.True);
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="in.Action = Action";
_in.setAction(_action);
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="Return PendingIntentStatic.RunMethod(\"getBroadcas";
if (true) return __ref._pendingintentstatic /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getBroadcast",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(1),(Object)(_in.getObject()),(Object)(__ref._getpendingintentflag /*int*/ (null))});
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _addbuttonaction2(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,Object _activity,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "addbuttonaction2", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "addbuttonaction2", new Object[] {_bmp,_title,_activity,_action}));}
anywheresoftware.b4a.objects.IntentWrapper _in = null;
Object _pendingintent = null;
Object _ac = null;
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub AddButtonAction2 (Bmp As Bitmap, Title";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="If IsBuilder = False Then Return Me";
if (__ref._isbuilder /*boolean*/ (null)==__c.False) { 
if (true) return (com.detektor.kateenapp.nb6)(this);};
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = __ref._createintent /*anywheresoftware.b4a.objects.IntentWrapper*/ (null,_activity,__c.False);
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="in.Action = Action";
_in.setAction(_action);
RDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIVI";
_in.setFlags(__c.Bit.Or((int) (268435456),(int) (131072)));
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="Dim PendingIntent As Object = PendingIntentStatic";
_pendingintent = __ref._pendingintentstatic /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getActivity",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(__c.Rnd((int) (0),((int)0x7fffffff))),(Object)(_in.getObject()),(Object)(__ref._getpendingintentflag /*int*/ (null))});
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\",";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setContentIntent",new Object[]{_pendingintent});
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="Dim Ac As Object = CreateAction(Bmp, Title, Pendi";
_ac = __ref._createaction /*Object*/ (null,_bmp,_title,_pendingintent);
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addAction",new Object[]{_ac});
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.IntentWrapper  _createintent(com.detektor.kateenapp.nb6 __ref,Object _target,boolean _receiver) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createintent", true))
	 {return ((anywheresoftware.b4a.objects.IntentWrapper) Debug.delegate(ba, "createintent", new Object[] {_target,_receiver}));}
anywheresoftware.b4j.object.JavaObject _in = null;
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub CreateIntent (Target As Object, Receiv";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Target = common.RunMethod(\"getComponentClass\", Ar";
_target = __ref._common /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getComponentClass",new Object[]{__c.Null,_target,(Object)(_receiver)});
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="Dim in As JavaObject";
_in = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="in.InitializeNewInstance(\"android.content.Intent\"";
_in.InitializeNewInstance("android.content.Intent",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),_target});
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="Return in";
if (true) return (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_in.getObject()));
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="End Sub";
return null;
}
public int  _getpendingintentflag(com.detektor.kateenapp.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "getpendingintentflag", true))
	 {return ((Integer) Debug.delegate(ba, "getpendingintentflag", null));}
int _flags = 0;
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub GetPendingIntentFlag As Int";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Dim flags As Int = 0";
_flags = (int) (0);
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="If SdkLevel >= 31 Then flags = Bit.Or(flags, 3355";
if (__ref._sdklevel /*int*/ >=31) { 
_flags = __c.Bit.Or(_flags,(int) (33554432));};
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="Return flags";
if (true) return _flags;
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="End Sub";
return 0;
}
public com.detektor.kateenapp.nb6  _addremoteinput(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,Object _title,String _resultkey,Object _service) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "addremoteinput", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "addremoteinput", new Object[] {_bmp,_title,_resultkey,_service}));}
anywheresoftware.b4j.object.JavaObject _remoteinputbuilder = null;
anywheresoftware.b4j.object.JavaObject _builder = null;
anywheresoftware.b4j.object.JavaObject _ac = null;
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub AddRemoteInput (Bmp As Bitmap, Title As";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="If IsBuilder = False Then Return Me";
if (__ref._isbuilder /*boolean*/ (null)==__c.False) { 
if (true) return (com.detektor.kateenapp.nb6)(this);};
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="Dim RemoteInputBuilder As JavaObject";
_remoteinputbuilder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="RemoteInputBuilder.InitializeNewInstance(\"android";
_remoteinputbuilder.InitializeNewInstance("android.app.RemoteInput$Builder",new Object[]{(Object)(_resultkey)});
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="RemoteInputBuilder.RunMethod(\"setLabel\", Array(Ti";
_remoteinputbuilder.RunMethod("setLabel",new Object[]{_title});
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
_builder.InitializeNewInstance("android.app.Notification$Action$Builder",new Object[]{__ref._createiconfrombitmap /*Object*/ (null,_bmp),_title,__ref._createreceiverpendingintent /*Object*/ (null,_service,_resultkey)});
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="builder.RunMethod(\"addRemoteInput\", Array(RemoteI";
_builder.RunMethod("addRemoteInput",new Object[]{_remoteinputbuilder.RunMethod("build",(Object[])(__c.Null))});
RDebugUtils.currentLine=19726344;
 //BA.debugLineNum = 19726344;BA.debugLine="Dim ac As JavaObject = builder.RunMethod(\"build\",";
_ac = new anywheresoftware.b4j.object.JavaObject();
_ac = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_builder.RunMethod("build",(Object[])(__c.Null))));
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addAction",new Object[]{(Object)(_ac.getObject())});
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19726347;
 //BA.debugLineNum = 19726347;BA.debugLine="End Sub";
return null;
}
public Object  _createiconfrombitmap(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "createiconfrombitmap", true))
	 {return ((Object) Debug.delegate(ba, "createiconfrombitmap", new Object[] {_bmp}));}
anywheresoftware.b4j.object.JavaObject _icon = null;
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub CreateIconFromBitmap(bmp As Bitmap) As";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="If bmp = Null Or bmp.IsInitialized = False Then R";
if (_bmp== null || _bmp.IsInitialized()==__c.False) { 
if (true) return (Object)(0);};
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Dim icon As JavaObject";
_icon = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Return icon.InitializeStatic(\"android.graphics.dr";
if (true) return _icon.InitializeStatic("android.graphics.drawable.Icon").RunMethod("createWithBitmap",new Object[]{(Object)(_bmp.getObject())});
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _autocancel(com.detektor.kateenapp.nb6 __ref,boolean _cancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "autocancel", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "autocancel", new Object[] {_cancel}));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub AutoCancel (Cancel As Boolean) As NB6";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="OldNotification.AutoCancel = Cancel";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setAutoCancel(_cancel);
 }else {
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="NotificationBuilder.RunMethod(\"setAutoCancel\", A";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setAutoCancel",new Object[]{(Object)(_cancel)});
 };
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="End Sub";
return null;
}
public boolean  _isold(com.detektor.kateenapp.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "isold", true))
	 {return ((Boolean) Debug.delegate(ba, "isold", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Private Sub IsOld As Boolean";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Return SupportLevel = S_OLD";
if (true) return __ref._supportlevel /*int*/ ==__ref._s_old /*int*/ ;
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="End Sub";
return false;
}
public com.detektor.kateenapp.nb6  _badgeicontype(com.detektor.kateenapp.nb6 __ref,String _icontype) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "badgeicontype", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "badgeicontype", new Object[] {_icontype}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub BadgeIconType (IconType As String) As N";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="If SdkLevel >= 26 Then";
if (__ref._sdklevel /*int*/ >=26) { 
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="Dim m As Map = CreateMap(\"LARGE\": 2, \"NONE\": 0,";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("LARGE"),(Object)(2),(Object)("NONE"),(Object)(0),(Object)("SMALL"),(Object)(1)});
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="NotificationBuilder.RunMethod(\"setBadgeIconType\"";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setBadgeIconType",new Object[]{_m.Get((Object)(_icontype))});
 };
RDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _bigpicturestyle(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _largeiconbmp,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture,Object _contenttitle,Object _summarytext) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "bigpicturestyle", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "bigpicturestyle", new Object[] {_largeiconbmp,_picture,_contenttitle,_summarytext}));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub BigPictureStyle(LargeIconBmp As Bitmap,";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="SetStyle(\"android.app.Notification$BigPictureSty";
__ref._setstyle /*String*/ (null,"android.app.Notification$BigPictureStyle",__c.createMap(new Object[] {(Object)("bigLargeIcon"),(Object)(_largeiconbmp.getObject()),(Object)("bigPicture"),(Object)(_picture.getObject()),(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
RDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="End Sub";
return null;
}
public String  _setstyle(com.detektor.kateenapp.nb6 __ref,String _stylename,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((String) Debug.delegate(ba, "setstyle", new Object[] {_stylename,_props}));}
anywheresoftware.b4j.object.JavaObject _style = null;
String _method = "";
Object _value = null;
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Private Sub SetStyle(StyleName As String, Props As";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Dim style As JavaObject";
_style = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="style.InitializeNewInstance(StyleName, Null)";
_style.InitializeNewInstance(_stylename,(Object[])(__c.Null));
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="For Each method As String In Props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _props.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="Dim value As Object = Props.Get(method)";
_value = _props.Get((Object)(_method));
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="If value <> Null Then";
if (_value!= null) { 
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="style.RunMethod(method, Array(value))";
_style.RunMethod(_method,new Object[]{_value});
 };
 }
};
RDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="NotificationBuilder.RunMethod(\"setStyle\", Array(s";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStyle",new Object[]{(Object)(_style.getObject())});
RDebugUtils.currentLine=21233674;
 //BA.debugLineNum = 21233674;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.nb6  _bigtextstyle(com.detektor.kateenapp.nb6 __ref,Object _contenttitle,Object _summarytext,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "bigtextstyle", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "bigtextstyle", new Object[] {_contenttitle,_summarytext,_text}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub BigTextStyle (ContentTitle As Object, S";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="SetStyle(\"android.app.Notification$BigTextStyle\"";
__ref._setstyle /*String*/ (null,"android.app.Notification$BigTextStyle",__c.createMap(new Object[] {(Object)("bigText"),_text,(Object)("setBigContentTitle"),_contenttitle,(Object)("setSummaryText"),_summarytext}));
 };
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.NotificationWrapper  _build(com.detektor.kateenapp.nb6 __ref,Object _contenttitle,Object _contenttext,String _tag,Object _activity) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "build", true))
	 {return ((anywheresoftware.b4a.objects.NotificationWrapper) Debug.delegate(ba, "build", new Object[] {_contenttitle,_contenttext,_tag,_activity}));}
anywheresoftware.b4a.objects.IntentWrapper _in = null;
Object _pendingintent = null;
anywheresoftware.b4j.object.JavaObject _manager = null;
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub Build (ContentTitle As Object, ContentT";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="OldNotification.SetInfo2(ContentTitle, ContentTe";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .SetInfo2New(ba,BA.ObjectToCharSequence(_contenttitle),BA.ObjectToCharSequence(_contenttext),BA.ObjectToCharSequence(_tag),_activity);
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="Return OldNotification";
if (true) return __ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ ;
 }else {
RDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = __ref._createintent /*anywheresoftware.b4a.objects.IntentWrapper*/ (null,_activity,__c.False);
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIV";
_in.setFlags(__c.Bit.Or((int) (268435456),(int) (131072)));
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="in.PutExtra(\"Notification_Tag\", Tag)";
_in.PutExtra("Notification_Tag",(Object)(_tag));
RDebugUtils.currentLine=21299209;
 //BA.debugLineNum = 21299209;BA.debugLine="Dim PendingIntent As Object = PendingIntentStati";
_pendingintent = __ref._pendingintentstatic /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getActivity",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(__c.Rnd((int) (0),((int)0x7fffffff))),(Object)(_in.getObject()),(Object)(__ref._getpendingintentflag /*int*/ (null))});
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="NotificationBuilder.RunMethodJO(\"setContentTitle";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("setContentTitle",new Object[]{_contenttitle}).RunMethodJO("setContentText",new Object[]{_contenttext});
RDebugUtils.currentLine=21299211;
 //BA.debugLineNum = 21299211;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\"";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setContentIntent",new Object[]{_pendingintent});
RDebugUtils.currentLine=21299213;
 //BA.debugLineNum = 21299213;BA.debugLine="If IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=21299214;
 //BA.debugLineNum = 21299214;BA.debugLine="Dim manager As JavaObject = ctxt.RunMethod(\"get";
_manager = new anywheresoftware.b4j.object.JavaObject();
_manager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSystemService",new Object[]{(Object)("notification")})));
RDebugUtils.currentLine=21299215;
 //BA.debugLineNum = 21299215;BA.debugLine="manager.RunMethod(\"createNotificationChannel\",";
_manager.RunMethod("createNotificationChannel",new Object[]{(Object)(__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .getObject())});
 };
RDebugUtils.currentLine=21299218;
 //BA.debugLineNum = 21299218;BA.debugLine="Return NotificationBuilder.RunMethod(\"build\", Nu";
if (true) return (anywheresoftware.b4a.objects.NotificationWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.NotificationWrapper(), (java.lang.Object)(__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("build",(Object[])(__c.Null))));
 };
RDebugUtils.currentLine=21299220;
 //BA.debugLineNum = 21299220;BA.debugLine="End Sub";
return null;
}
public boolean  _ischannel(com.detektor.kateenapp.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "ischannel", true))
	 {return ((Boolean) Debug.delegate(ba, "ischannel", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Private Sub IsChannel As Boolean";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Return SupportLevel = S_CHANNEL";
if (true) return __ref._supportlevel /*int*/ ==__ref._s_channel /*int*/ ;
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(com.detektor.kateenapp.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Private Channel As JavaObject";
_channel = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="Private NotificationBuilder As JavaObject";
_notificationbuilder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="Private SdkLevel As Int";
_sdklevel = 0;
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="Private ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="Private const S_OLD = 0, S_BUILDER = 1, S_CHANNEL";
_s_old = (int) (0);
_s_builder = (int) (1);
_s_channel = (int) (2);
RDebugUtils.currentLine=19398662;
 //BA.debugLineNum = 19398662;BA.debugLine="Private SupportLevel As Int";
_supportlevel = 0;
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="Private OldNotification As Notification";
_oldnotification = new anywheresoftware.b4a.objects.NotificationWrapper();
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="Private PendingIntentStatic As JavaObject";
_pendingintentstatic = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="Private NotificationStatic As JavaObject";
_notificationstatic = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="Private common As JavaObject";
_common = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19398668;
 //BA.debugLineNum = 19398668;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.nb6  _color(com.detektor.kateenapp.nb6 __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "color", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "color", new Object[] {_clr}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub Color (Clr As Int) As NB6";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="NotificationBuilder.RunMethod(\"setColor\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColor",new Object[]{(Object)(_clr)});
 };
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20381701;
 //BA.debugLineNum = 20381701;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _colorized(com.detektor.kateenapp.nb6 __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "colorized", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "colorized", new Object[] {_enabled}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub Colorized (Enabled As Boolean) As NB6";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="If SdkLevel >= 26 Then";
if (__ref._sdklevel /*int*/ >=26) { 
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="NotificationBuilder.RunMethod(\"setColorized\", A";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColorized",new Object[]{(Object)(__c.True)});
 };
 };
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _customsound(com.detektor.kateenapp.nb6 __ref,Object _fileprovideruri) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "customsound", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "customsound", new Object[] {_fileprovideruri}));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub CustomSound (FileProviderUri As Object)";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="If IsOld Then Return Me";
if (__ref._isold /*boolean*/ (null)) { 
if (true) return (com.detektor.kateenapp.nb6)(this);};
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="ctxt.RunMethod(\"grantUriPermission\", Array(\"com.a";
__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("grantUriPermission",new Object[]{(Object)("com.android.systemui"),_fileprovideruri,(Object)(1)});
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="NotificationBuilder.RunMethod(\"setSound\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSound",new Object[]{_fileprovideruri,__ref._notificationstatic /*anywheresoftware.b4j.object.JavaObject*/ .GetField("AUDIO_ATTRIBUTES_DEFAULT")});
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="If IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="Channel.RunMethod(\"setSound\", Array(FileProvide";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSound",new Object[]{_fileprovideruri,__ref._notificationstatic /*anywheresoftware.b4j.object.JavaObject*/ .GetField("AUDIO_ATTRIBUTES_DEFAULT")});
 };
 };
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20840458;
 //BA.debugLineNum = 20840458;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _deleteaction(com.detektor.kateenapp.nb6 __ref,Object _service,String _action) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "deleteaction", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "deleteaction", new Object[] {_service,_action}));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Public Sub DeleteAction (Service As Object, Action";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="NotificationBuilder.RunMethod(\"setDeleteIntent\",";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDeleteIntent",new Object[]{__ref._createreceiverpendingintent /*Object*/ (null,_service,_action)});
 };
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19791877;
 //BA.debugLineNum = 19791877;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _initialize(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.BA _ba,String _channelid,Object _channelname,String _importancelevel) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "initialize", new Object[] {_ba,_channelid,_channelname,_importancelevel}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.Map _im = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _pm = null;
int _p = 0;
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub Initialize (ChannelId As String, Channe";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="ctxt.InitializeContext";
__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .InitializeContext(ba);
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="PendingIntentStatic.InitializeStatic(\"android.app";
__ref._pendingintentstatic /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("android.app.PendingIntent");
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="NotificationStatic.InitializeStatic(\"android.app.";
__ref._notificationstatic /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("android.app.Notification");
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="common.InitializeStatic(\"anywheresoftware.b4a.key";
__ref._common /*anywheresoftware.b4j.object.JavaObject*/ .InitializeStatic("anywheresoftware.b4a.keywords.Common");
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19464198;
 //BA.debugLineNum = 19464198;BA.debugLine="SdkLevel = jo.InitializeStatic(\"android.os.Build$";
__ref._sdklevel /*int*/  = (int)(BA.ObjectToNumber(_jo.InitializeStatic("android.os.Build$VERSION").GetField("SDK_INT")));
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="If SdkLevel < 23 Or (SdkLevel = 23 And IsIncompat";
if (__ref._sdklevel /*int*/ <23 || (__ref._sdklevel /*int*/ ==23 && __ref._isincompatibledevice /*boolean*/ (null))) { 
RDebugUtils.currentLine=19464200;
 //BA.debugLineNum = 19464200;BA.debugLine="SupportLevel = S_OLD";
__ref._supportlevel /*int*/  = __ref._s_old /*int*/ ;
 }else 
{RDebugUtils.currentLine=19464201;
 //BA.debugLineNum = 19464201;BA.debugLine="Else if SdkLevel >= 26 Then";
if (__ref._sdklevel /*int*/ >=26) { 
RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="SupportLevel = S_CHANNEL";
__ref._supportlevel /*int*/  = __ref._s_channel /*int*/ ;
 }else {
RDebugUtils.currentLine=19464204;
 //BA.debugLineNum = 19464204;BA.debugLine="SupportLevel = S_BUILDER";
__ref._supportlevel /*int*/  = __ref._s_builder /*int*/ ;
 }}
;
RDebugUtils.currentLine=19464206;
 //BA.debugLineNum = 19464206;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=19464207;
 //BA.debugLineNum = 19464207;BA.debugLine="OldNotification.Initialize";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .Initialize();
RDebugUtils.currentLine=19464208;
 //BA.debugLineNum = 19464208;BA.debugLine="OldNotification.Icon = \"icon\"";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setIcon("icon");
 }else 
{RDebugUtils.currentLine=19464209;
 //BA.debugLineNum = 19464209;BA.debugLine="Else if IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=19464210;
 //BA.debugLineNum = 19464210;BA.debugLine="ChannelId = ChannelId & \"_\" & ImportanceLevel";
_channelid = _channelid+"_"+_importancelevel;
RDebugUtils.currentLine=19464211;
 //BA.debugLineNum = 19464211;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_channelid)});
RDebugUtils.currentLine=19464212;
 //BA.debugLineNum = 19464212;BA.debugLine="Dim im As Map = CreateMap(\"MIN\": 1, \"LOW\": 2, \"D";
_im = new anywheresoftware.b4a.objects.collections.Map();
_im = __c.createMap(new Object[] {(Object)("MIN"),(Object)(1),(Object)("LOW"),(Object)(2),(Object)("DEFAULT"),(Object)(3),(Object)("HIGH"),(Object)(4)});
RDebugUtils.currentLine=19464213;
 //BA.debugLineNum = 19464213;BA.debugLine="Dim i As Int = im.Get(ImportanceLevel)";
_i = (int)(BA.ObjectToNumber(_im.Get((Object)(_importancelevel))));
RDebugUtils.currentLine=19464214;
 //BA.debugLineNum = 19464214;BA.debugLine="Channel.InitializeNewInstance(\"android.app.Notif";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("android.app.NotificationChannel",new Object[]{(Object)(_channelid),_channelname,(Object)(_i)});
 }else {
RDebugUtils.currentLine=19464216;
 //BA.debugLineNum = 19464216;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("android.app.Notification$Builder",new Object[]{(Object)(__ref._ctxt /*anywheresoftware.b4j.object.JavaObject*/ .getObject())});
RDebugUtils.currentLine=19464217;
 //BA.debugLineNum = 19464217;BA.debugLine="Dim pm As Map = CreateMap(\"MIN\": -2, \"LOW\": -1,";
_pm = new anywheresoftware.b4a.objects.collections.Map();
_pm = __c.createMap(new Object[] {(Object)("MIN"),(Object)(-2),(Object)("LOW"),(Object)(-1),(Object)("DEFAULT"),(Object)(0),(Object)("HIGH"),(Object)(1)});
RDebugUtils.currentLine=19464218;
 //BA.debugLineNum = 19464218;BA.debugLine="Dim p As Int = pm.Get(ImportanceLevel)";
_p = (int)(BA.ObjectToNumber(_pm.Get((Object)(_importancelevel))));
RDebugUtils.currentLine=19464219;
 //BA.debugLineNum = 19464219;BA.debugLine="NotificationBuilder.RunMethod(\"setPriority\", Arr";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setPriority",new Object[]{(Object)(_p)});
 }}
;
RDebugUtils.currentLine=19464221;
 //BA.debugLineNum = 19464221;BA.debugLine="If ImportanceLevel = \"DEFAULT\" Or ImportanceLevel";
if ((_importancelevel).equals("DEFAULT") || (_importancelevel).equals("HIGH")) { 
RDebugUtils.currentLine=19464222;
 //BA.debugLineNum = 19464222;BA.debugLine="SetDefaults(True, True, True)";
__ref._setdefaults /*com.detektor.kateenapp.nb6*/ (null,__c.True,__c.True,__c.True);
 }else {
RDebugUtils.currentLine=19464224;
 //BA.debugLineNum = 19464224;BA.debugLine="SetDefaults(False, True, True)";
__ref._setdefaults /*com.detektor.kateenapp.nb6*/ (null,__c.False,__c.True,__c.True);
 };
RDebugUtils.currentLine=19464226;
 //BA.debugLineNum = 19464226;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19464227;
 //BA.debugLineNum = 19464227;BA.debugLine="End Sub";
return null;
}
public boolean  _isincompatibledevice(com.detektor.kateenapp.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "isincompatibledevice", true))
	 {return ((Boolean) Debug.delegate(ba, "isincompatibledevice", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
String _model = "";
String _manufacturer = "";
String _key = "";
anywheresoftware.b4a.objects.collections.Map _problematicdevices = null;
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Private Sub IsIncompatibleDevice As Boolean";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Dim model As String = jo.InitializeStatic(\"androi";
_model = BA.ObjectToString(_jo.InitializeStatic("android.os.Build").GetField("MODEL"));
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Dim manufacturer As String = jo.InitializeStatic(";
_manufacturer = BA.ObjectToString(_jo.InitializeStatic("android.os.Build").GetField("MANUFACTURER"));
RDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="Dim key As String = manufacturer & \" \" & model";
_key = _manufacturer+" "+_model;
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="Log(\"key: \" & key)";
__c.LogImpl("919529733","key: "+_key,0);
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="Dim ProblematicDevices As Map = CreateMap(\"Samsun";
_problematicdevices = new anywheresoftware.b4a.objects.collections.Map();
_problematicdevices = __c.createMap(new Object[] {(Object)("Samsung Galaxy S5"),(Object)(""),(Object)("Sony XPreria M5"),(Object)("")});
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="If ProblematicDevices.ContainsKey(key) Then";
if (_problematicdevices.ContainsKey((Object)(_key))) { 
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Log(\"Problematic device. Switching to 'old' mode";
__c.LogImpl("919529736","Problematic device. Switching to 'old' mode.",0);
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="End Sub";
return false;
}
public com.detektor.kateenapp.nb6  _setdefaults(com.detektor.kateenapp.nb6 __ref,boolean _sound,boolean _light,boolean _vibrate) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "setdefaults", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "setdefaults", new Object[] {_sound,_light,_vibrate}));}
int _currentdefaults = 0;
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub SetDefaults (Sound As Boolean, Light As";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="OldNotification.Sound = Sound";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setSound(_sound);
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="OldNotification.Light = Light";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setLight(_light);
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="OldNotification.Vibrate = Vibrate";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setVibrate(_vibrate);
 }else {
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="If IsChannel Then";
if (__ref._ischannel /*boolean*/ (null)) { 
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="Channel.RunMethod(\"enableLights\", Array(Light))";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("enableLights",new Object[]{(Object)(_light)});
RDebugUtils.currentLine=20774920;
 //BA.debugLineNum = 20774920;BA.debugLine="Channel.RunMethod(\"enableVibration\", Array(Vibr";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("enableVibration",new Object[]{(Object)(_vibrate)});
 }else {
RDebugUtils.currentLine=20774922;
 //BA.debugLineNum = 20774922;BA.debugLine="Dim CurrentDefaults As Int";
_currentdefaults = 0;
RDebugUtils.currentLine=20774923;
 //BA.debugLineNum = 20774923;BA.debugLine="If Sound Then CurrentDefaults = 1";
if (_sound) { 
_currentdefaults = (int) (1);};
RDebugUtils.currentLine=20774924;
 //BA.debugLineNum = 20774924;BA.debugLine="If Vibrate Then CurrentDefaults = Bit.Or(Curren";
if (_vibrate) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (2));};
RDebugUtils.currentLine=20774925;
 //BA.debugLineNum = 20774925;BA.debugLine="If Light Then CurrentDefaults = Bit.Or(CurrentD";
if (_light) { 
_currentdefaults = __c.Bit.Or(_currentdefaults,(int) (4));};
RDebugUtils.currentLine=20774926;
 //BA.debugLineNum = 20774926;BA.debugLine="NotificationBuilder.RunMethod(\"setDefaults\", Ar";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDefaults",new Object[]{(Object)(_currentdefaults)});
 };
 };
RDebugUtils.currentLine=20774929;
 //BA.debugLineNum = 20774929;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20774930;
 //BA.debugLineNum = 20774930;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _largeicon(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "largeicon", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "largeicon", new Object[] {_icon}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Public Sub LargeIcon (Icon As Bitmap) As NB6";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="NotificationBuilder.RunMethod(\"setLargeIcon\", Ar";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setLargeIcon",new Object[]{__ref._createiconfrombitmap /*Object*/ (null,_icon)});
 };
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19988485;
 //BA.debugLineNum = 19988485;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _mediastyle(com.detektor.kateenapp.nb6 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "mediastyle", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "mediastyle", null));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub MediaStyle As NB6";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="SetStyle(\"android.app.Notification$MediaStyle\",";
__ref._setstyle /*String*/ (null,"android.app.Notification$MediaStyle",__c.createMap(new Object[] {(Object)("setShowActionsInCompactView"),(Object)(new int[]{(int) (0),(int) (1),(int) (2)})}));
 };
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _number(com.detektor.kateenapp.nb6 __ref,int _num) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "number", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "number", new Object[] {_num}));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub Number (Num As Int) As NB6";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="OldNotification.Number = Num";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setNumber(_num);
 }else {
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="NotificationBuilder.RunMethod(\"setNumber\", Array";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setNumber",new Object[]{(Object)(_num)});
 };
RDebugUtils.currentLine=20512774;
 //BA.debugLineNum = 20512774;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20512775;
 //BA.debugLineNum = 20512775;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _oldnotificationicon(com.detektor.kateenapp.nb6 __ref,String _resourcename) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "oldnotificationicon", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "oldnotificationicon", new Object[] {_resourcename}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Public Sub OldNotificationIcon (ResourceName As St";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="OldNotification.Icon = ResourceName";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setIcon(_resourcename);
 };
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _ongoing(com.detektor.kateenapp.nb6 __ref,boolean _ongoingevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "ongoing", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "ongoing", new Object[] {_ongoingevent}));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub OnGoing (OnGoingEvent As Boolean) As NB";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="If IsOld Then";
if (__ref._isold /*boolean*/ (null)) { 
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="OldNotification.OnGoingEvent = OnGoingEvent";
__ref._oldnotification /*anywheresoftware.b4a.objects.NotificationWrapper*/ .setOnGoingEvent(_ongoingevent);
 }else {
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="NotificationBuilder.RunMethod(\"setOngoing\", Arra";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOngoing",new Object[]{(Object)(_ongoingevent)});
 };
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _onlyalertonce(com.detektor.kateenapp.nb6 __ref,boolean _once) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "onlyalertonce", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "onlyalertonce", new Object[] {_once}));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Public Sub OnlyAlertOnce (Once As Boolean) As NB6";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="NotificationBuilder.RunMethod(\"setOnlyAlertOnce\"";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setOnlyAlertOnce",new Object[]{(Object)(_once)});
 };
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _progress(com.detektor.kateenapp.nb6 __ref,int _value,int _maxvalue,boolean _indeterminate) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "progress", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "progress", new Object[] {_value,_maxvalue,_indeterminate}));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub Progress (Value As Int, MaxValue As Int";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="NotificationBuilder.RunMethod(\"setProgress\", Arr";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setProgress",new Object[]{(Object)(_maxvalue),(Object)(_value),(Object)(_indeterminate)});
 };
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _setlights(com.detektor.kateenapp.nb6 __ref,int _clr,int _onms,int _offms) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "setlights", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "setlights", new Object[] {_clr,_onms,_offms}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub SetLights (Clr As Int, OnMs As Int, Off";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="NotificationBuilder.RunMethod(\"setLights\", Array(";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setLights",new Object[]{(Object)(_clr),(Object)(_onms),(Object)(_offms)});
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _showbadge(com.detektor.kateenapp.nb6 __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "showbadge", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "showbadge", new Object[] {_show}));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub ShowBadge (Show As Boolean) As NB6";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="If SdkLevel >= 26 Then";
if (__ref._sdklevel /*int*/ >=26) { 
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="Channel.RunMethod(\"setShowBadge\", Array(Show))";
__ref._channel /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setShowBadge",new Object[]{(Object)(_show)});
 };
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _showwhen(com.detektor.kateenapp.nb6 __ref,long _time) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "showwhen", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "showwhen", new Object[] {_time}));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub ShowWhen (Time As Long) As NB6";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="NotificationBuilder.RunMethod(\"setShowWhen\", Arr";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setShowWhen",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="NotificationBuilder.RunMethod(\"setWhen\", Array(T";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setWhen",new Object[]{(Object)(_time)});
 };
RDebugUtils.currentLine=20578309;
 //BA.debugLineNum = 20578309;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _smallicon(com.detektor.kateenapp.nb6 __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "smallicon", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "smallicon", new Object[] {_icon}));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Public Sub SmallIcon (Icon As Bitmap) As NB6";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="NotificationBuilder.RunMethod(\"setSmallIcon\", Ar";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSmallIcon",new Object[]{__ref._createiconfrombitmap /*Object*/ (null,_icon)});
 };
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _subtext(com.detektor.kateenapp.nb6 __ref,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "subtext", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "subtext", new Object[] {_text}));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub SubText (Text As Object) As NB6";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="NotificationBuilder.RunMethod(\"setSubText\", Arra";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setSubText",new Object[]{_text});
 };
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.nb6  _visibility(com.detektor.kateenapp.nb6 __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="nb6";
if (Debug.shouldDelegate(ba, "visibility", true))
	 {return ((com.detektor.kateenapp.nb6) Debug.delegate(ba, "visibility", new Object[] {_value}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i = 0;
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub Visibility (Value As String) As NB6";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="If IsBuilder Then";
if (__ref._isbuilder /*boolean*/ (null)) { 
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="Dim m As Map = CreateMap(\"PUBLIC\": 1, \"SECRET\":";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("PUBLIC"),(Object)(1),(Object)("SECRET"),(Object)(-1),(Object)("PRIVATE"),(Object)(0)});
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="Dim i As Int = m.Get(Value)";
_i = (int)(BA.ObjectToNumber(_m.Get((Object)(_value))));
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="NotificationBuilder.RunMethod(\"setVisibility\", A";
__ref._notificationbuilder /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setVisibility",new Object[]{(Object)(_i)});
 };
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="Return Me";
if (true) return (com.detektor.kateenapp.nb6)(this);
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="End Sub";
return null;
}
}