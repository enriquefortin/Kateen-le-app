package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class nb6_subs_0 {


public static RemoteObject  _addbuttonaction(RemoteObject __ref,RemoteObject _bmp,RemoteObject _title,RemoteObject _service,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("AddButtonAction (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("addbuttonaction")) { return __ref.runUserSub(false, "nb6","addbuttonaction", __ref, _bmp, _title, _service, _action);}
RemoteObject _ac = RemoteObject.declareNull("Object");
Debug.locals.put("Bmp", _bmp);
Debug.locals.put("Title", _title);
Debug.locals.put("Service", _service);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 82;BA.debugLine="Public Sub AddButtonAction (Bmp As Bitmap, Title A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="If IsBuilder = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ),nb6.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 84;BA.debugLine="Dim ac As Object = CreateAction(Bmp, Title, Creat";
Debug.JustUpdateDeviceLine();
_ac = __ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createaction" /*RemoteObject*/ ,(Object)(_bmp),(Object)(_title),(Object)(__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createreceiverpendingintent" /*RemoteObject*/ ,(Object)(_service),(Object)(_action))));Debug.locals.put("ac", _ac);Debug.locals.put("ac", _ac);
 BA.debugLineNum = 85;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAction")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_ac})));
 BA.debugLineNum = 86;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbuttonaction2(RemoteObject __ref,RemoteObject _bmp,RemoteObject _title,RemoteObject _activity,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("AddButtonAction2 (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("addbuttonaction2")) { return __ref.runUserSub(false, "nb6","addbuttonaction2", __ref, _bmp, _title, _activity, _action);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pendingintent = RemoteObject.declareNull("Object");
RemoteObject _ac = RemoteObject.declareNull("Object");
Debug.locals.put("Bmp", _bmp);
Debug.locals.put("Title", _title);
Debug.locals.put("Activity", _activity);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 90;BA.debugLine="Public Sub AddButtonAction2 (Bmp As Bitmap, Title";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="If IsBuilder = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ),nb6.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 92;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = __ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createintent" /*RemoteObject*/ ,(Object)(_activity),(Object)(nb6.__c.getField(true,"False")));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 93;BA.debugLine="in.Action = Action";
Debug.JustUpdateDeviceLine();
_in.runMethod(true,"setAction",_action);
 BA.debugLineNum = 94;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIVI";
Debug.JustUpdateDeviceLine();
_in.runMethod(true,"setFlags",nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 268435456)),(Object)(BA.numberCast(int.class, 131072))));
 BA.debugLineNum = 95;BA.debugLine="Dim PendingIntent As Object = PendingIntentStatic";
Debug.JustUpdateDeviceLine();
_pendingintent = __ref.getField(false,"_pendingintentstatic" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getActivity")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),(nb6.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, ((int)0x7fffffff))))),(_in.getObject()),(__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_getpendingintentflag" /*RemoteObject*/ ))})));Debug.locals.put("PendingIntent", _pendingintent);Debug.locals.put("PendingIntent", _pendingintent);
 BA.debugLineNum = 96;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentIntent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_pendingintent})));
 BA.debugLineNum = 97;BA.debugLine="Dim Ac As Object = CreateAction(Bmp, Title, Pendi";
Debug.JustUpdateDeviceLine();
_ac = __ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createaction" /*RemoteObject*/ ,(Object)(_bmp),(Object)(_title),(Object)(_pendingintent));Debug.locals.put("Ac", _ac);Debug.locals.put("Ac", _ac);
 BA.debugLineNum = 98;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAction")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_ac})));
 BA.debugLineNum = 99;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addremoteinput(RemoteObject __ref,RemoteObject _bmp,RemoteObject _title,RemoteObject _resultkey,RemoteObject _service) throws Exception{
try {
		Debug.PushSubsStack("AddRemoteInput (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("addremoteinput")) { return __ref.runUserSub(false, "nb6","addremoteinput", __ref, _bmp, _title, _resultkey, _service);}
RemoteObject _remoteinputbuilder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _builder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ac = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Bmp", _bmp);
Debug.locals.put("Title", _title);
Debug.locals.put("ResultKey", _resultkey);
Debug.locals.put("Service", _service);
 BA.debugLineNum = 102;BA.debugLine="Public Sub AddRemoteInput (Bmp As Bitmap, Title As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="If IsBuilder = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ),nb6.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 104;BA.debugLine="Dim RemoteInputBuilder As JavaObject";
Debug.JustUpdateDeviceLine();
_remoteinputbuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("RemoteInputBuilder", _remoteinputbuilder);
 BA.debugLineNum = 105;BA.debugLine="RemoteInputBuilder.InitializeNewInstance(\"android";
Debug.JustUpdateDeviceLine();
_remoteinputbuilder.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.RemoteInput$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_resultkey)})));
 BA.debugLineNum = 106;BA.debugLine="RemoteInputBuilder.RunMethod(\"setLabel\", Array(Ti";
Debug.JustUpdateDeviceLine();
_remoteinputbuilder.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLabel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_title})));
 BA.debugLineNum = 107;BA.debugLine="Dim builder As JavaObject";
Debug.JustUpdateDeviceLine();
_builder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("builder", _builder);
 BA.debugLineNum = 108;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
Debug.JustUpdateDeviceLine();
_builder.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.Notification$Action$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createiconfrombitmap" /*RemoteObject*/ ,(Object)(_bmp)),_title,__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createreceiverpendingintent" /*RemoteObject*/ ,(Object)(_service),(Object)(_resultkey))})));
 BA.debugLineNum = 109;BA.debugLine="builder.RunMethod(\"addRemoteInput\", Array(RemoteI";
Debug.JustUpdateDeviceLine();
_builder.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addRemoteInput")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_remoteinputbuilder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((nb6.__c.getField(false,"Null"))))})));
 BA.debugLineNum = 110;BA.debugLine="Dim ac As JavaObject = builder.RunMethod(\"build\",";
Debug.JustUpdateDeviceLine();
_ac = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_ac = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _builder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((nb6.__c.getField(false,"Null")))));Debug.locals.put("ac", _ac);Debug.locals.put("ac", _ac);
 BA.debugLineNum = 111;BA.debugLine="NotificationBuilder.RunMethod(\"addAction\", Array(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addAction")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ac.getObject())})));
 BA.debugLineNum = 112;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _autocancel(RemoteObject __ref,RemoteObject _cancel) throws Exception{
try {
		Debug.PushSubsStack("AutoCancel (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("autocancel")) { return __ref.runUserSub(false, "nb6","autocancel", __ref, _cancel);}
Debug.locals.put("Cancel", _cancel);
 BA.debugLineNum = 160;BA.debugLine="Public Sub AutoCancel (Cancel As Boolean) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="If IsOld Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 162;BA.debugLine="OldNotification.AutoCancel = Cancel";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setAutoCancel",_cancel);
 }else {
 BA.debugLineNum = 164;BA.debugLine="NotificationBuilder.RunMethod(\"setAutoCancel\", A";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAutoCancel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cancel)})));
 };
 BA.debugLineNum = 166;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _badgeicontype(RemoteObject __ref,RemoteObject _icontype) throws Exception{
try {
		Debug.PushSubsStack("BadgeIconType (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("badgeicontype")) { return __ref.runUserSub(false, "nb6","badgeicontype", __ref, _icontype);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("IconType", _icontype);
 BA.debugLineNum = 180;BA.debugLine="Public Sub BadgeIconType (IconType As String) As N";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="If SdkLevel >= 26 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 182;BA.debugLine="Dim m As Map = CreateMap(\"LARGE\": 2, \"NONE\": 0,";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("LARGE")),RemoteObject.createImmutable((2)),RemoteObject.createImmutable(("NONE")),RemoteObject.createImmutable((0)),RemoteObject.createImmutable(("SMALL")),RemoteObject.createImmutable((1))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 183;BA.debugLine="NotificationBuilder.RunMethod(\"setBadgeIconType\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBadgeIconType")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_m.runMethod(false,"Get",(Object)((_icontype)))})));
 };
 BA.debugLineNum = 185;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bigpicturestyle(RemoteObject __ref,RemoteObject _largeiconbmp,RemoteObject _picture,RemoteObject _contenttitle,RemoteObject _summarytext) throws Exception{
try {
		Debug.PushSubsStack("BigPictureStyle (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("bigpicturestyle")) { return __ref.runUserSub(false, "nb6","bigpicturestyle", __ref, _largeiconbmp, _picture, _contenttitle, _summarytext);}
Debug.locals.put("LargeIconBmp", _largeiconbmp);
Debug.locals.put("Picture", _picture);
Debug.locals.put("ContentTitle", _contenttitle);
Debug.locals.put("SummaryText", _summarytext);
 BA.debugLineNum = 304;BA.debugLine="Public Sub BigPictureStyle(LargeIconBmp As Bitmap,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 305;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 306;BA.debugLine="SetStyle(\"android.app.Notification$BigPictureSty";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("android.app.Notification$BigPictureStyle")),(Object)(nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("bigLargeIcon")),(_largeiconbmp.getObject()),RemoteObject.createImmutable(("bigPicture")),(_picture.getObject()),RemoteObject.createImmutable(("setBigContentTitle")),_contenttitle,RemoteObject.createImmutable(("setSummaryText")),_summarytext}))));
 };
 BA.debugLineNum = 312;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bigtextstyle(RemoteObject __ref,RemoteObject _contenttitle,RemoteObject _summarytext,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("BigTextStyle (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("bigtextstyle")) { return __ref.runUserSub(false, "nb6","bigtextstyle", __ref, _contenttitle, _summarytext, _text);}
Debug.locals.put("ContentTitle", _contenttitle);
Debug.locals.put("SummaryText", _summarytext);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 324;BA.debugLine="Public Sub BigTextStyle (ContentTitle As Object, S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 326;BA.debugLine="SetStyle(\"android.app.Notification$BigTextStyle\"";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("android.app.Notification$BigTextStyle")),(Object)(nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("bigText")),_text,RemoteObject.createImmutable(("setBigContentTitle")),_contenttitle,RemoteObject.createImmutable(("setSummaryText")),_summarytext}))));
 };
 BA.debugLineNum = 329;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _build(RemoteObject __ref,RemoteObject _contenttitle,RemoteObject _contenttext,RemoteObject _tag,RemoteObject _activity) throws Exception{
try {
		Debug.PushSubsStack("Build (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,357);
if (RapidSub.canDelegate("build")) { return __ref.runUserSub(false, "nb6","build", __ref, _contenttitle, _contenttext, _tag, _activity);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pendingintent = RemoteObject.declareNull("Object");
RemoteObject _manager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ContentTitle", _contenttitle);
Debug.locals.put("ContentText", _contenttext);
Debug.locals.put("Tag", _tag);
Debug.locals.put("Activity", _activity);
 BA.debugLineNum = 357;BA.debugLine="Public Sub Build (ContentTitle As Object, ContentT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 358;BA.debugLine="If IsOld Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 359;BA.debugLine="OldNotification.SetInfo2(ContentTitle, ContentTe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("SetInfo2New",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence(_contenttitle)),(Object)(BA.ObjectToCharSequence(_contenttext)),(Object)(BA.ObjectToCharSequence(_tag)),(Object)(_activity));
 BA.debugLineNum = 360;BA.debugLine="Return OldNotification";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_oldnotification" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 362;BA.debugLine="Dim in As Intent = CreateIntent(Activity, False)";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = __ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createintent" /*RemoteObject*/ ,(Object)(_activity),(Object)(nb6.__c.getField(true,"False")));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 363;BA.debugLine="in.Flags = Bit.Or(268435456, 131072) 'FLAG_ACTIV";
Debug.JustUpdateDeviceLine();
_in.runMethod(true,"setFlags",nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 268435456)),(Object)(BA.numberCast(int.class, 131072))));
 BA.debugLineNum = 364;BA.debugLine="in.PutExtra(\"Notification_Tag\", Tag)";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("Notification_Tag")),(Object)((_tag)));
 BA.debugLineNum = 366;BA.debugLine="Dim PendingIntent As Object = PendingIntentStati";
Debug.JustUpdateDeviceLine();
_pendingintent = __ref.getField(false,"_pendingintentstatic" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getActivity")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),(nb6.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, ((int)0x7fffffff))))),(_in.getObject()),(__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_getpendingintentflag" /*RemoteObject*/ ))})));Debug.locals.put("PendingIntent", _pendingintent);Debug.locals.put("PendingIntent", _pendingintent);
 BA.debugLineNum = 367;BA.debugLine="NotificationBuilder.RunMethodJO(\"setContentTitle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("setContentTitle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_contenttitle}))).runVoidMethod ("RunMethodJO",(Object)(BA.ObjectToString("setContentText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_contenttext})));
 BA.debugLineNum = 368;BA.debugLine="NotificationBuilder.RunMethod(\"setContentIntent\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setContentIntent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_pendingintent})));
 BA.debugLineNum = 370;BA.debugLine="If IsChannel Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 371;BA.debugLine="Dim manager As JavaObject = ctxt.RunMethod(\"get";
Debug.JustUpdateDeviceLine();
_manager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_manager = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_ctxt" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSystemService")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("notification"))}))));Debug.locals.put("manager", _manager);Debug.locals.put("manager", _manager);
 BA.debugLineNum = 372;BA.debugLine="manager.RunMethod(\"createNotificationChannel\",";
Debug.JustUpdateDeviceLine();
_manager.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("createNotificationChannel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_channel" /*RemoteObject*/ ).getObject())})));
 };
 BA.debugLineNum = 375;BA.debugLine="Return NotificationBuilder.RunMethod(\"build\", Nu";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.NotificationWrapper"), __ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((nb6.__c.getField(false,"Null")))));
 };
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Channel As JavaObject";
nb6._channel = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_channel",nb6._channel);
 //BA.debugLineNum = 3;BA.debugLine="Private NotificationBuilder As JavaObject";
nb6._notificationbuilder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_notificationbuilder",nb6._notificationbuilder);
 //BA.debugLineNum = 4;BA.debugLine="Private SdkLevel As Int";
nb6._sdklevel = RemoteObject.createImmutable(0);__ref.setField("_sdklevel",nb6._sdklevel);
 //BA.debugLineNum = 5;BA.debugLine="Private ctxt As JavaObject";
nb6._ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_ctxt",nb6._ctxt);
 //BA.debugLineNum = 6;BA.debugLine="Private const S_OLD = 0, S_BUILDER = 1, S_CHANNEL";
nb6._s_old = BA.numberCast(int.class, 0);__ref.setField("_s_old",nb6._s_old);
nb6._s_builder = BA.numberCast(int.class, 1);__ref.setField("_s_builder",nb6._s_builder);
nb6._s_channel = BA.numberCast(int.class, 2);__ref.setField("_s_channel",nb6._s_channel);
 //BA.debugLineNum = 7;BA.debugLine="Private SupportLevel As Int";
nb6._supportlevel = RemoteObject.createImmutable(0);__ref.setField("_supportlevel",nb6._supportlevel);
 //BA.debugLineNum = 8;BA.debugLine="Private OldNotification As Notification";
nb6._oldnotification = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");__ref.setField("_oldnotification",nb6._oldnotification);
 //BA.debugLineNum = 9;BA.debugLine="Private PendingIntentStatic As JavaObject";
nb6._pendingintentstatic = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_pendingintentstatic",nb6._pendingintentstatic);
 //BA.debugLineNum = 10;BA.debugLine="Private NotificationStatic As JavaObject";
nb6._notificationstatic = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_notificationstatic",nb6._notificationstatic);
 //BA.debugLineNum = 11;BA.debugLine="Private common As JavaObject";
nb6._common = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_common",nb6._common);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _color(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("Color (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("color")) { return __ref.runUserSub(false, "nb6","color", __ref, _clr);}
Debug.locals.put("Clr", _clr);
 BA.debugLineNum = 197;BA.debugLine="Public Sub Color (Clr As Int) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 199;BA.debugLine="NotificationBuilder.RunMethod(\"setColor\", Array(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr)})));
 };
 BA.debugLineNum = 201;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorized(RemoteObject __ref,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("Colorized (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("colorized")) { return __ref.runUserSub(false, "nb6","colorized", __ref, _enabled);}
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 206;BA.debugLine="Public Sub Colorized (Enabled As Boolean) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 208;BA.debugLine="If SdkLevel >= 26 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 209;BA.debugLine="NotificationBuilder.RunMethod(\"setColorized\", A";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColorized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(nb6.__c.getField(true,"True"))})));
 };
 };
 BA.debugLineNum = 212;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createaction(RemoteObject __ref,RemoteObject _bmp,RemoteObject _title,RemoteObject _pendingintent) throws Exception{
try {
		Debug.PushSubsStack("CreateAction (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("createaction")) { return __ref.runUserSub(false, "nb6","createaction", __ref, _bmp, _title, _pendingintent);}
RemoteObject _builder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Bmp", _bmp);
Debug.locals.put("Title", _title);
Debug.locals.put("PendingIntent", _pendingintent);
 BA.debugLineNum = 398;BA.debugLine="Private Sub CreateAction (Bmp As Bitmap, Title As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 399;BA.debugLine="Dim builder As JavaObject";
Debug.JustUpdateDeviceLine();
_builder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("builder", _builder);
 BA.debugLineNum = 400;BA.debugLine="builder.InitializeNewInstance(\"android.app.Notifi";
Debug.JustUpdateDeviceLine();
_builder.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.Notification$Action$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createiconfrombitmap" /*RemoteObject*/ ,(Object)(_bmp)),_title,_pendingintent})));
 BA.debugLineNum = 401;BA.debugLine="Return builder.RunMethod(\"build\", Null)";
Debug.JustUpdateDeviceLine();
if (true) return _builder.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((nb6.__c.getField(false,"Null"))));
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createiconfrombitmap(RemoteObject __ref,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("CreateIconFromBitmap (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,404);
if (RapidSub.canDelegate("createiconfrombitmap")) { return __ref.runUserSub(false, "nb6","createiconfrombitmap", __ref, _bmp);}
RemoteObject _icon = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 404;BA.debugLine="Private Sub CreateIconFromBitmap(bmp As Bitmap) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 405;BA.debugLine="If bmp = Null Or bmp.IsInitialized = False Then R";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_bmp) || RemoteObject.solveBoolean("=",_bmp.runMethod(true,"IsInitialized"),nb6.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable((0));};
 BA.debugLineNum = 406;BA.debugLine="Dim icon As JavaObject";
Debug.JustUpdateDeviceLine();
_icon = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("icon", _icon);
 BA.debugLineNum = 407;BA.debugLine="Return icon.InitializeStatic(\"android.graphics.dr";
Debug.JustUpdateDeviceLine();
if (true) return _icon.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.graphics.drawable.Icon"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createWithBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_bmp.getObject())})));
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createintent(RemoteObject __ref,RemoteObject _target,RemoteObject _receiver) throws Exception{
try {
		Debug.PushSubsStack("CreateIntent (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,391);
if (RapidSub.canDelegate("createintent")) { return __ref.runUserSub(false, "nb6","createintent", __ref, _target, _receiver);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Target", _target);
Debug.locals.put("Receiver", _receiver);
 BA.debugLineNum = 391;BA.debugLine="Private Sub CreateIntent (Target As Object, Receiv";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 392;BA.debugLine="Target = common.RunMethod(\"getComponentClass\", Ar";
Debug.JustUpdateDeviceLine();
_target = __ref.getField(false,"_common" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getComponentClass")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {nb6.__c.getField(false,"Null"),_target,(_receiver)})));Debug.locals.put("Target", _target);
 BA.debugLineNum = 393;BA.debugLine="Dim in As JavaObject";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("in", _in);
 BA.debugLineNum = 394;BA.debugLine="in.InitializeNewInstance(\"android.content.Intent\"";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.Intent")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),_target})));
 BA.debugLineNum = 395;BA.debugLine="Return in";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _in.getObject());
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createreceiverpendingintent(RemoteObject __ref,RemoteObject _service,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("CreateReceiverPendingIntent (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("createreceiverpendingintent")) { return __ref.runUserSub(false, "nb6","createreceiverpendingintent", __ref, _service, _action);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("Service", _service);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 379;BA.debugLine="Private Sub CreateReceiverPendingIntent (Service A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 380;BA.debugLine="Dim in As Intent = CreateIntent(Service, True)";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = __ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createintent" /*RemoteObject*/ ,(Object)(_service),(Object)(nb6.__c.getField(true,"True")));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 381;BA.debugLine="in.Action = Action";
Debug.JustUpdateDeviceLine();
_in.runMethod(true,"setAction",_action);
 BA.debugLineNum = 382;BA.debugLine="Return PendingIntentStatic.RunMethod(\"getBroadcas";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_pendingintentstatic" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBroadcast")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),RemoteObject.createImmutable((1)),(_in.getObject()),(__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_getpendingintentflag" /*RemoteObject*/ ))})));
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customsound(RemoteObject __ref,RemoteObject _fileprovideruri) throws Exception{
try {
		Debug.PushSubsStack("CustomSound (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("customsound")) { return __ref.runUserSub(false, "nb6","customsound", __ref, _fileprovideruri);}
Debug.locals.put("FileProviderUri", _fileprovideruri);
 BA.debugLineNum = 277;BA.debugLine="Public Sub CustomSound (FileProviderUri As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="If IsOld Then Return Me";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return (__ref);};
 BA.debugLineNum = 279;BA.debugLine="ctxt.RunMethod(\"grantUriPermission\", Array(\"com.a";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ctxt" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("grantUriPermission")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("com.android.systemui")),_fileprovideruri,RemoteObject.createImmutable((1))})));
 BA.debugLineNum = 280;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 281;BA.debugLine="NotificationBuilder.RunMethod(\"setSound\", Array(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSound")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_fileprovideruri,__ref.getField(false,"_notificationstatic" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("AUDIO_ATTRIBUTES_DEFAULT")))})));
 BA.debugLineNum = 282;BA.debugLine="If IsChannel Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 283;BA.debugLine="Channel.RunMethod(\"setSound\", Array(FileProvide";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSound")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_fileprovideruri,__ref.getField(false,"_notificationstatic" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("AUDIO_ATTRIBUTES_DEFAULT")))})));
 };
 };
 BA.debugLineNum = 286;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleteaction(RemoteObject __ref,RemoteObject _service,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("DeleteAction (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("deleteaction")) { return __ref.runUserSub(false, "nb6","deleteaction", __ref, _service, _action);}
Debug.locals.put("Service", _service);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 120;BA.debugLine="Public Sub DeleteAction (Service As Object, Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 122;BA.debugLine="NotificationBuilder.RunMethod(\"setDeleteIntent\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDeleteIntent")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createreceiverpendingintent" /*RemoteObject*/ ,(Object)(_service),(Object)(_action))})));
 };
 BA.debugLineNum = 124;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpendingintentflag(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPendingIntentFlag (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("getpendingintentflag")) { return __ref.runUserSub(false, "nb6","getpendingintentflag", __ref);}
RemoteObject _flags = RemoteObject.createImmutable(0);
 BA.debugLineNum = 385;BA.debugLine="Private Sub GetPendingIntentFlag As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 386;BA.debugLine="Dim flags As Int = 0";
Debug.JustUpdateDeviceLine();
_flags = BA.numberCast(int.class, 0);Debug.locals.put("flags", _flags);Debug.locals.put("flags", _flags);
 BA.debugLineNum = 387;BA.debugLine="If SdkLevel >= 31 Then flags = Bit.Or(flags, 3355";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 31))) { 
_flags = nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_flags),(Object)(BA.numberCast(int.class, 33554432)));Debug.locals.put("flags", _flags);};
 BA.debugLineNum = 388;BA.debugLine="Return flags";
Debug.JustUpdateDeviceLine();
if (true) return _flags;
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _channelid,RemoteObject _channelname,RemoteObject _importancelevel) throws Exception{
try {
		Debug.PushSubsStack("Initialize (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "nb6","initialize", __ref, _ba, _channelid, _channelname, _importancelevel);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _im = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _pm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("ChannelId", _channelid);
Debug.locals.put("ChannelName", _channelname);
Debug.locals.put("ImportanceLevel", _importancelevel);
 BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (ChannelId As String, Channe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="ctxt.InitializeContext";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ctxt" /*RemoteObject*/ ).runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="PendingIntentStatic.InitializeStatic(\"android.app";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pendingintentstatic" /*RemoteObject*/ ).runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.app.PendingIntent")));
 BA.debugLineNum = 29;BA.debugLine="NotificationStatic.InitializeStatic(\"android.app.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationstatic" /*RemoteObject*/ ).runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.app.Notification")));
 BA.debugLineNum = 30;BA.debugLine="common.InitializeStatic(\"anywheresoftware.b4a.key";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_common" /*RemoteObject*/ ).runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("anywheresoftware.b4a.keywords.Common")));
 BA.debugLineNum = 31;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 32;BA.debugLine="SdkLevel = jo.InitializeStatic(\"android.os.Build$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sdklevel" /*RemoteObject*/ ,BA.numberCast(int.class, _jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build$VERSION"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))));
 BA.debugLineNum = 33;BA.debugLine="If SdkLevel < 23 Or (SdkLevel = 23 And IsIncompat";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 23)) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 23)) && RemoteObject.solveBoolean(".",__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isincompatibledevice" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 34;BA.debugLine="SupportLevel = S_OLD";
Debug.JustUpdateDeviceLine();
__ref.setField ("_supportlevel" /*RemoteObject*/ ,__ref.getField(true,"_s_old" /*RemoteObject*/ ));
 }else 
{ BA.debugLineNum = 35;BA.debugLine="Else if SdkLevel >= 26 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 36;BA.debugLine="SupportLevel = S_CHANNEL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_supportlevel" /*RemoteObject*/ ,__ref.getField(true,"_s_channel" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 38;BA.debugLine="SupportLevel = S_BUILDER";
Debug.JustUpdateDeviceLine();
__ref.setField ("_supportlevel" /*RemoteObject*/ ,__ref.getField(true,"_s_builder" /*RemoteObject*/ ));
 }}
;
 BA.debugLineNum = 40;BA.debugLine="If IsOld Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 41;BA.debugLine="OldNotification.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="OldNotification.Icon = \"icon\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 }else 
{ BA.debugLineNum = 43;BA.debugLine="Else if IsChannel Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 44;BA.debugLine="ChannelId = ChannelId & \"_\" & ImportanceLevel";
Debug.JustUpdateDeviceLine();
_channelid = RemoteObject.concat(_channelid,RemoteObject.createImmutable("_"),_importancelevel);Debug.locals.put("ChannelId", _channelid);
 BA.debugLineNum = 45;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.Notification$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject()),(_channelid)})));
 BA.debugLineNum = 46;BA.debugLine="Dim im As Map = CreateMap(\"MIN\": 1, \"LOW\": 2, \"D";
Debug.JustUpdateDeviceLine();
_im = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_im = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("MIN")),RemoteObject.createImmutable((1)),RemoteObject.createImmutable(("LOW")),RemoteObject.createImmutable((2)),RemoteObject.createImmutable(("DEFAULT")),RemoteObject.createImmutable((3)),RemoteObject.createImmutable(("HIGH")),RemoteObject.createImmutable((4))}));Debug.locals.put("im", _im);Debug.locals.put("im", _im);
 BA.debugLineNum = 47;BA.debugLine="Dim i As Int = im.Get(ImportanceLevel)";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, _im.runMethod(false,"Get",(Object)((_importancelevel))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 48;BA.debugLine="Channel.InitializeNewInstance(\"android.app.Notif";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.NotificationChannel")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_channelid),_channelname,(_i)})));
 }else {
 BA.debugLineNum = 50;BA.debugLine="NotificationBuilder.InitializeNewInstance(\"andro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.Notification$Builder")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_ctxt" /*RemoteObject*/ ).getObject())})));
 BA.debugLineNum = 51;BA.debugLine="Dim pm As Map = CreateMap(\"MIN\": -2, \"LOW\": -1,";
Debug.JustUpdateDeviceLine();
_pm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pm = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("MIN")),RemoteObject.createImmutable((-(double) (0 + 2))),RemoteObject.createImmutable(("LOW")),RemoteObject.createImmutable((-(double) (0 + 1))),RemoteObject.createImmutable(("DEFAULT")),RemoteObject.createImmutable((0)),RemoteObject.createImmutable(("HIGH")),RemoteObject.createImmutable((1))}));Debug.locals.put("pm", _pm);Debug.locals.put("pm", _pm);
 BA.debugLineNum = 52;BA.debugLine="Dim p As Int = pm.Get(ImportanceLevel)";
Debug.JustUpdateDeviceLine();
_p = BA.numberCast(int.class, _pm.runMethod(false,"Get",(Object)((_importancelevel))));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 53;BA.debugLine="NotificationBuilder.RunMethod(\"setPriority\", Arr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPriority")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_p)})));
 }}
;
 BA.debugLineNum = 55;BA.debugLine="If ImportanceLevel = \"DEFAULT\" Or ImportanceLevel";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_importancelevel,BA.ObjectToString("DEFAULT")) || RemoteObject.solveBoolean("=",_importancelevel,BA.ObjectToString("HIGH"))) { 
 BA.debugLineNum = 56;BA.debugLine="SetDefaults(True, True, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_setdefaults" /*RemoteObject*/ ,(Object)(nb6.__c.getField(true,"True")),(Object)(nb6.__c.getField(true,"True")),(Object)(nb6.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 58;BA.debugLine="SetDefaults(False, True, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_setdefaults" /*RemoteObject*/ ,(Object)(nb6.__c.getField(true,"False")),(Object)(nb6.__c.getField(true,"True")),(Object)(nb6.__c.getField(true,"True")));
 };
 BA.debugLineNum = 60;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isbuilder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsBuilder (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,410);
if (RapidSub.canDelegate("isbuilder")) { return __ref.runUserSub(false, "nb6","isbuilder", __ref);}
 BA.debugLineNum = 410;BA.debugLine="Private Sub IsBuilder As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 411;BA.debugLine="Return SupportLevel >= S_BUILDER";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",__ref.getField(true,"_supportlevel" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_s_builder" /*RemoteObject*/ ))));
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ischannel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsChannel (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("ischannel")) { return __ref.runUserSub(false, "nb6","ischannel", __ref);}
 BA.debugLineNum = 418;BA.debugLine="Private Sub IsChannel As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 419;BA.debugLine="Return SupportLevel = S_CHANNEL";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_supportlevel" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_s_channel" /*RemoteObject*/ ))));
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isincompatibledevice(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsIncompatibleDevice (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("isincompatibledevice")) { return __ref.runUserSub(false, "nb6","isincompatibledevice", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _model = RemoteObject.createImmutable("");
RemoteObject _manufacturer = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _problematicdevices = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 63;BA.debugLine="Private Sub IsIncompatibleDevice As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 65;BA.debugLine="Dim model As String = jo.InitializeStatic(\"androi";
Debug.JustUpdateDeviceLine();
_model = BA.ObjectToString(_jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("MODEL"))));Debug.locals.put("model", _model);Debug.locals.put("model", _model);
 BA.debugLineNum = 66;BA.debugLine="Dim manufacturer As String = jo.InitializeStatic(";
Debug.JustUpdateDeviceLine();
_manufacturer = BA.ObjectToString(_jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("MANUFACTURER"))));Debug.locals.put("manufacturer", _manufacturer);Debug.locals.put("manufacturer", _manufacturer);
 BA.debugLineNum = 67;BA.debugLine="Dim key As String = manufacturer & \" \" & model";
Debug.JustUpdateDeviceLine();
_key = RemoteObject.concat(_manufacturer,RemoteObject.createImmutable(" "),_model);Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 68;BA.debugLine="Log(\"key: \" & key)";
Debug.JustUpdateDeviceLine();
nb6.__c.runVoidMethod ("LogImpl","919529733",RemoteObject.concat(RemoteObject.createImmutable("key: "),_key),0);
 BA.debugLineNum = 69;BA.debugLine="Dim ProblematicDevices As Map = CreateMap(\"Samsun";
Debug.JustUpdateDeviceLine();
_problematicdevices = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_problematicdevices = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("Samsung Galaxy S5")),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("Sony XPreria M5")),(RemoteObject.createImmutable(""))}));Debug.locals.put("ProblematicDevices", _problematicdevices);Debug.locals.put("ProblematicDevices", _problematicdevices);
 BA.debugLineNum = 70;BA.debugLine="If ProblematicDevices.ContainsKey(key) Then";
Debug.JustUpdateDeviceLine();
if (_problematicdevices.runMethod(true,"ContainsKey",(Object)((_key))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 71;BA.debugLine="Log(\"Problematic device. Switching to 'old' mode";
Debug.JustUpdateDeviceLine();
nb6.__c.runVoidMethod ("LogImpl","919529736",RemoteObject.createImmutable("Problematic device. Switching to 'old' mode."),0);
 BA.debugLineNum = 72;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return nb6.__c.getField(true,"True");
 };
 BA.debugLineNum = 74;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return nb6.__c.getField(true,"False");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isold(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsOld (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,414);
if (RapidSub.canDelegate("isold")) { return __ref.runUserSub(false, "nb6","isold", __ref);}
 BA.debugLineNum = 414;BA.debugLine="Private Sub IsOld As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 415;BA.debugLine="Return SupportLevel = S_OLD";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_supportlevel" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_s_old" /*RemoteObject*/ ))));
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _largeicon(RemoteObject __ref,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("LargeIcon (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("largeicon")) { return __ref.runUserSub(false, "nb6","largeicon", __ref, _icon);}
Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 144;BA.debugLine="Public Sub LargeIcon (Icon As Bitmap) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 146;BA.debugLine="NotificationBuilder.RunMethod(\"setLargeIcon\", Ar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLargeIcon")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createiconfrombitmap" /*RemoteObject*/ ,(Object)(_icon))})));
 };
 BA.debugLineNum = 148;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mediastyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MediaStyle (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("mediastyle")) { return __ref.runUserSub(false, "nb6","mediastyle", __ref);}
 BA.debugLineNum = 316;BA.debugLine="Public Sub MediaStyle As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 317;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 318;BA.debugLine="SetStyle(\"android.app.Notification$MediaStyle\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("android.app.Notification$MediaStyle")),(Object)(nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("setShowActionsInCompactView")),(RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2)}))}))));
 };
 BA.debugLineNum = 320;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _number(RemoteObject __ref,RemoteObject _num) throws Exception{
try {
		Debug.PushSubsStack("Number (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("number")) { return __ref.runUserSub(false, "nb6","number", __ref, _num);}
Debug.locals.put("Num", _num);
 BA.debugLineNum = 216;BA.debugLine="Public Sub Number (Num As Int) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="If IsOld Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 218;BA.debugLine="OldNotification.Number = Num";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runMethod(true,"setNumber",_num);
 }else {
 BA.debugLineNum = 220;BA.debugLine="NotificationBuilder.RunMethod(\"setNumber\", Array";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setNumber")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_num)})));
 };
 BA.debugLineNum = 222;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _oldnotificationicon(RemoteObject __ref,RemoteObject _resourcename) throws Exception{
try {
		Debug.PushSubsStack("OldNotificationIcon (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("oldnotificationicon")) { return __ref.runUserSub(false, "nb6","oldnotificationicon", __ref, _resourcename);}
Debug.locals.put("ResourceName", _resourcename);
 BA.debugLineNum = 128;BA.debugLine="Public Sub OldNotificationIcon (ResourceName As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="If IsOld Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 130;BA.debugLine="OldNotification.Icon = ResourceName";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setIcon",_resourcename);
 };
 BA.debugLineNum = 132;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ongoing(RemoteObject __ref,RemoteObject _ongoingevent) throws Exception{
try {
		Debug.PushSubsStack("OnGoing (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("ongoing")) { return __ref.runUserSub(false, "nb6","ongoing", __ref, _ongoingevent);}
Debug.locals.put("OnGoingEvent", _ongoingevent);
 BA.debugLineNum = 169;BA.debugLine="Public Sub OnGoing (OnGoingEvent As Boolean) As NB";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="If IsOld Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 171;BA.debugLine="OldNotification.OnGoingEvent = OnGoingEvent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setOnGoingEvent",_ongoingevent);
 }else {
 BA.debugLineNum = 173;BA.debugLine="NotificationBuilder.RunMethod(\"setOngoing\", Arra";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOngoing")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_ongoingevent)})));
 };
 BA.debugLineNum = 175;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onlyalertonce(RemoteObject __ref,RemoteObject _once) throws Exception{
try {
		Debug.PushSubsStack("OnlyAlertOnce (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("onlyalertonce")) { return __ref.runUserSub(false, "nb6","onlyalertonce", __ref, _once);}
Debug.locals.put("Once", _once);
 BA.debugLineNum = 152;BA.debugLine="Public Sub OnlyAlertOnce (Once As Boolean) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 154;BA.debugLine="NotificationBuilder.RunMethod(\"setOnlyAlertOnce\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnlyAlertOnce")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_once)})));
 };
 BA.debugLineNum = 156;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _progress(RemoteObject __ref,RemoteObject _value,RemoteObject _maxvalue,RemoteObject _indeterminate) throws Exception{
try {
		Debug.PushSubsStack("Progress (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("progress")) { return __ref.runUserSub(false, "nb6","progress", __ref, _value, _maxvalue, _indeterminate);}
Debug.locals.put("Value", _value);
Debug.locals.put("MaxValue", _maxvalue);
Debug.locals.put("Indeterminate", _indeterminate);
 BA.debugLineNum = 238;BA.debugLine="Public Sub Progress (Value As Int, MaxValue As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 239;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 240;BA.debugLine="NotificationBuilder.RunMethod(\"setProgress\", Arr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setProgress")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_maxvalue),(_value),(_indeterminate)})));
 };
 BA.debugLineNum = 242;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaults(RemoteObject __ref,RemoteObject _sound,RemoteObject _light,RemoteObject _vibrate) throws Exception{
try {
		Debug.PushSubsStack("SetDefaults (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("setdefaults")) { return __ref.runUserSub(false, "nb6","setdefaults", __ref, _sound, _light, _vibrate);}
RemoteObject _currentdefaults = RemoteObject.createImmutable(0);
Debug.locals.put("Sound", _sound);
Debug.locals.put("Light", _light);
Debug.locals.put("Vibrate", _vibrate);
 BA.debugLineNum = 255;BA.debugLine="Public Sub SetDefaults (Sound As Boolean, Light As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 256;BA.debugLine="If IsOld Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 257;BA.debugLine="OldNotification.Sound = Sound";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setSound",_sound);
 BA.debugLineNum = 258;BA.debugLine="OldNotification.Light = Light";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setLight",_light);
 BA.debugLineNum = 259;BA.debugLine="OldNotification.Vibrate = Vibrate";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oldnotification" /*RemoteObject*/ ).runVoidMethod ("setVibrate",_vibrate);
 }else {
 BA.debugLineNum = 261;BA.debugLine="If IsChannel Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_ischannel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 262;BA.debugLine="Channel.RunMethod(\"enableLights\", Array(Light))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enableLights")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_light)})));
 BA.debugLineNum = 263;BA.debugLine="Channel.RunMethod(\"enableVibration\", Array(Vibr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enableVibration")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_vibrate)})));
 }else {
 BA.debugLineNum = 265;BA.debugLine="Dim CurrentDefaults As Int";
Debug.JustUpdateDeviceLine();
_currentdefaults = RemoteObject.createImmutable(0);Debug.locals.put("CurrentDefaults", _currentdefaults);
 BA.debugLineNum = 266;BA.debugLine="If Sound Then CurrentDefaults = 1";
Debug.JustUpdateDeviceLine();
if (_sound.<Boolean>get().booleanValue()) { 
_currentdefaults = BA.numberCast(int.class, 1);Debug.locals.put("CurrentDefaults", _currentdefaults);};
 BA.debugLineNum = 267;BA.debugLine="If Vibrate Then CurrentDefaults = Bit.Or(Curren";
Debug.JustUpdateDeviceLine();
if (_vibrate.<Boolean>get().booleanValue()) { 
_currentdefaults = nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_currentdefaults),(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("CurrentDefaults", _currentdefaults);};
 BA.debugLineNum = 268;BA.debugLine="If Light Then CurrentDefaults = Bit.Or(CurrentD";
Debug.JustUpdateDeviceLine();
if (_light.<Boolean>get().booleanValue()) { 
_currentdefaults = nb6.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_currentdefaults),(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("CurrentDefaults", _currentdefaults);};
 BA.debugLineNum = 269;BA.debugLine="NotificationBuilder.RunMethod(\"setDefaults\", Ar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDefaults")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_currentdefaults)})));
 };
 };
 BA.debugLineNum = 272;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlights(RemoteObject __ref,RemoteObject _clr,RemoteObject _onms,RemoteObject _offms) throws Exception{
try {
		Debug.PushSubsStack("SetLights (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("setlights")) { return __ref.runUserSub(false, "nb6","setlights", __ref, _clr, _onms, _offms);}
Debug.locals.put("Clr", _clr);
Debug.locals.put("OnMs", _onms);
Debug.locals.put("OffMs", _offms);
 BA.debugLineNum = 332;BA.debugLine="Public Sub SetLights (Clr As Int, OnMs As Int, Off";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 333;BA.debugLine="NotificationBuilder.RunMethod(\"setLights\", Array(";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setLights")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_clr),(_onms),(_offms)})));
 BA.debugLineNum = 334;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _stylename,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "nb6","setstyle", __ref, _stylename, _props);}
RemoteObject _style = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
Debug.locals.put("StyleName", _stylename);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 340;BA.debugLine="Private Sub SetStyle(StyleName As String, Props As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 341;BA.debugLine="Dim style As JavaObject";
Debug.JustUpdateDeviceLine();
_style = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("style", _style);
 BA.debugLineNum = 342;BA.debugLine="style.InitializeNewInstance(StyleName, Null)";
Debug.JustUpdateDeviceLine();
_style.runVoidMethod ("InitializeNewInstance",(Object)(_stylename),(Object)((nb6.__c.getField(false,"Null"))));
 BA.debugLineNum = 343;BA.debugLine="For Each method As String In Props.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _props.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("method", _method);
Debug.locals.put("method", _method);
 BA.debugLineNum = 344;BA.debugLine="Dim value As Object = Props.Get(method)";
Debug.JustUpdateDeviceLine();
_value = _props.runMethod(false,"Get",(Object)((_method)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 345;BA.debugLine="If value <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_value)) { 
 BA.debugLineNum = 346;BA.debugLine="style.RunMethod(method, Array(value))";
Debug.JustUpdateDeviceLine();
_style.runVoidMethod ("RunMethod",(Object)(_method),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value})));
 };
 }
}Debug.locals.put("method", _method);
;
 BA.debugLineNum = 349;BA.debugLine="NotificationBuilder.RunMethod(\"setStyle\", Array(s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_style.getObject())})));
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showbadge(RemoteObject __ref,RemoteObject _show) throws Exception{
try {
		Debug.PushSubsStack("ShowBadge (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("showbadge")) { return __ref.runUserSub(false, "nb6","showbadge", __ref, _show);}
Debug.locals.put("Show", _show);
 BA.debugLineNum = 189;BA.debugLine="Public Sub ShowBadge (Show As Boolean) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 190;BA.debugLine="If SdkLevel >= 26 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sdklevel" /*RemoteObject*/ ),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 191;BA.debugLine="Channel.RunMethod(\"setShowBadge\", Array(Show))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_channel" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setShowBadge")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_show)})));
 };
 BA.debugLineNum = 193;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showwhen(RemoteObject __ref,RemoteObject _time) throws Exception{
try {
		Debug.PushSubsStack("ShowWhen (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("showwhen")) { return __ref.runUserSub(false, "nb6","showwhen", __ref, _time);}
Debug.locals.put("Time", _time);
 BA.debugLineNum = 226;BA.debugLine="Public Sub ShowWhen (Time As Long) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 228;BA.debugLine="NotificationBuilder.RunMethod(\"setShowWhen\", Arr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setShowWhen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(nb6.__c.getField(true,"True"))})));
 BA.debugLineNum = 229;BA.debugLine="NotificationBuilder.RunMethod(\"setWhen\", Array(T";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setWhen")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_time)})));
 };
 BA.debugLineNum = 231;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _smallicon(RemoteObject __ref,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("SmallIcon (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("smallicon")) { return __ref.runUserSub(false, "nb6","smallicon", __ref, _icon);}
Debug.locals.put("Icon", _icon);
 BA.debugLineNum = 136;BA.debugLine="Public Sub SmallIcon (Icon As Bitmap) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 138;BA.debugLine="NotificationBuilder.RunMethod(\"setSmallIcon\", Ar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSmallIcon")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_createiconfrombitmap" /*RemoteObject*/ ,(Object)(_icon))})));
 };
 BA.debugLineNum = 140;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _subtext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SubText (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("subtext")) { return __ref.runUserSub(false, "nb6","subtext", __ref, _text);}
Debug.locals.put("Text", _text);
 BA.debugLineNum = 246;BA.debugLine="Public Sub SubText (Text As Object) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 248;BA.debugLine="NotificationBuilder.RunMethod(\"setSubText\", Arra";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSubText")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_text})));
 };
 BA.debugLineNum = 250;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visibility(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Visibility (nb6) ","nb6",25,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("visibility")) { return __ref.runUserSub(false, "nb6","visibility", __ref, _value);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 294;BA.debugLine="Public Sub Visibility (Value As String) As NB6";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 295;BA.debugLine="If IsBuilder Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.nb6.class, "_isbuilder" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 296;BA.debugLine="Dim m As Map = CreateMap(\"PUBLIC\": 1, \"SECRET\":";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = nb6.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("PUBLIC")),RemoteObject.createImmutable((1)),RemoteObject.createImmutable(("SECRET")),RemoteObject.createImmutable((-(double) (0 + 1))),RemoteObject.createImmutable(("PRIVATE")),RemoteObject.createImmutable((0))}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 297;BA.debugLine="Dim i As Int = m.Get(Value)";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((_value))));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 298;BA.debugLine="NotificationBuilder.RunMethod(\"setVisibility\", A";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_notificationbuilder" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_i)})));
 };
 BA.debugLineNum = 300;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}