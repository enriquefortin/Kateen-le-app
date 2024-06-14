package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class revisiones_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "revisiones","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 35;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Root = Root1";
Debug.ShouldStop(8);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 38;BA.debugLine="Root1.LoadLayout(\"revi1\")";
Debug.ShouldStop(32);
_root1.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("revi1")),__ref.getField(false, "ba"));
 BA.debugLineNum = 39;BA.debugLine="autos.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_autos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="autos.AddAll(Array As String(\"Sedan\",\"PickUp Senc";
Debug.ShouldStop(128);
__ref.getField(false,"_autos" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(revisiones.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString("Sedan"),BA.ObjectToString("PickUp Sencillo"),BA.ObjectToString("PickUp Doble Cabina"),BA.ObjectToString("Panel"),BA.ObjectToString("Motocicleta"),BA.ObjectToString("Furgon"),BA.ObjectToString("Camioneta"),BA.ObjectToString("Camion"),RemoteObject.createImmutable("Avion")})))));
 BA.debugLineNum = 41;BA.debugLine="ime.Initialize(\"\")";
Debug.ShouldStop(256);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 42;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"rayo.";
Debug.ShouldStop(512);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 BA.debugLineNum = 44;BA.debugLine="SignatureTemplate.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_signaturetemplate" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xsignaturetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
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
public static RemoteObject  _b4xseekbar1_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("B4XSeekBar1_ValueChanged (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("b4xseekbar1_valuechanged")) { return __ref.runUserSub(false, "revisiones","b4xseekbar1_valuechanged", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 59;BA.debugLine="Private Sub B4XSeekBar1_ValueChanged (Value As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="edtcombustible.Text=Value&\"%\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_edtcombustible" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_value,RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncontinuarfirma_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btncontinuarfirma_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("btncontinuarfirma_click")) { return __ref.runUserSub(false, "revisiones","btncontinuarfirma_click", __ref);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _paglog = RemoteObject.declareNull("com.detektor.kateenapp.questioninterface");
 BA.debugLineNum = 181;BA.debugLine="Private Sub btncontinuarfirma_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.Di";
Debug.ShouldStop(4194304);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = revisiones.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("signature.png")),(Object)(revisiones.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 184;BA.debugLine="SignatureTemplate.Bitmap.WriteToStream(out, 100,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_signaturetemplate" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xsignaturetemplate.class, "_getbitmap" /*RemoteObject*/ ).runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("PNG"))));
 BA.debugLineNum = 185;BA.debugLine="out.Close";
Debug.ShouldStop(16777216);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 186;BA.debugLine="ToastMessageShow(\"Firma guardada\", False)";
Debug.ShouldStop(33554432);
revisiones.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Firma guardada")),(Object)(revisiones.__c.getField(true,"False")));
 BA.debugLineNum = 189;BA.debugLine="Dim paglog As questioninterface";
Debug.ShouldStop(268435456);
_paglog = RemoteObject.createNew ("com.detektor.kateenapp.questioninterface");Debug.locals.put("paglog", _paglog);
 BA.debugLineNum = 191;BA.debugLine="paglog=B4XPages.GetPage(\"questioninterface\")";
Debug.ShouldStop(1073741824);
_paglog = (revisiones._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("questioninterface"))));Debug.locals.put("paglog", _paglog);
 BA.debugLineNum = 192;BA.debugLine="paglog.lblmsj.Text=\"Favor Lea el código del dispo";
Debug.ShouldStop(-2147483648);
_paglog.getField(false,"_lblmsj" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Favor Lea el código del dispositivo a instalar"));
 BA.debugLineNum = 193;BA.debugLine="paglog.B4XSwitchllego.mBase.Visible=False";
Debug.ShouldStop(1);
_paglog.getField(false,"_b4xswitchllego" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"setVisible",revisiones.__c.getField(true,"False"));
 BA.debugLineNum = 194;BA.debugLine="paglog.lblno.Visible=False";
Debug.ShouldStop(2);
_paglog.getField(false,"_lblno" /*RemoteObject*/ ).runMethod(true,"setVisible",revisiones.__c.getField(true,"False"));
 BA.debugLineNum = 195;BA.debugLine="paglog.lblsi.Visible=False";
Debug.ShouldStop(4);
_paglog.getField(false,"_lblsi" /*RemoteObject*/ ).runMethod(true,"setVisible",revisiones.__c.getField(true,"False"));
 BA.debugLineNum = 196;BA.debugLine="paglog.btnnotificar.Text=\"Leer\"";
Debug.ShouldStop(8);
_paglog.getField(false,"_btnnotificar" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Leer"));
 BA.debugLineNum = 197;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"question";
Debug.ShouldStop(16);
revisiones._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("questioninterface")));
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncontinuargolpe_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btncontinuargolpe_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("btncontinuargolpe_click")) { return __ref.runUserSub(false, "revisiones","btncontinuargolpe_click", __ref);}
 BA.debugLineNum = 170;BA.debugLine="Private Sub btncontinuargolpe_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(1024);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 172;BA.debugLine="Root.LoadLayout(\"firma\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("firma")),__ref.getField(false, "ba"));
 BA.debugLineNum = 173;BA.debugLine="pnldondesefirma.AddView(SignatureTemplate.mBase,";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_signaturetemplate" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 174;BA.debugLine="SignatureTemplate.Resize(pnldondesefirma.Width,pn";
Debug.ShouldStop(8192);
__ref.getField(false,"_signaturetemplate" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xsignaturetemplate.class, "_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncontinuarrevi2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btncontinuarrevi2_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("btncontinuarrevi2_click")) { return __ref.runUserSub(false, "revisiones","btncontinuarrevi2_click", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Private Sub btncontinuarrevi2_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 65;BA.debugLine="Root.LoadLayout(\"golpes\")";
Debug.ShouldStop(1);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("golpes")),__ref.getField(false, "ba"));
 BA.debugLineNum = 66;BA.debugLine="cmbauto.SetItems(autos)";
Debug.ShouldStop(2);
__ref.getField(false,"_cmbauto" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xcombobox.class, "_setitems" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_autos" /*RemoteObject*/ )));
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
public static RemoteObject  _btnlimpiar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnlimpiar_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("btnlimpiar_click")) { return __ref.runUserSub(false, "revisiones","btnlimpiar_click", __ref);}
 BA.debugLineNum = 200;BA.debugLine="Private Sub btnlimpiar_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 206;BA.debugLine="pnldondesefirma.RemoveAllViews";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 207;BA.debugLine="SignatureTemplate.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_signaturetemplate" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xsignaturetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 208;BA.debugLine="pnldondesefirma.AddView(SignatureTemplate.mBase,";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_signaturetemplate" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 209;BA.debugLine="SignatureTemplate.Resize(pnldondesefirma.Width,pn";
Debug.ShouldStop(65536);
__ref.getField(false,"_signaturetemplate" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xsignaturetemplate.class, "_resize" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnldondesefirma" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrevi1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnrevi1_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("btnrevi1_click")) { return __ref.runUserSub(false, "revisiones","btnrevi1_click", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Private Sub btnrevi1_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Root.RemoveAllViews";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 56;BA.debugLine="Root.LoadLayout(\"revi2\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("revi2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
revisiones._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",revisiones._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
revisiones._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",revisiones._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private autos As List";
revisiones._autos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_autos",revisiones._autos);
 //BA.debugLineNum = 5;BA.debugLine="Private btnrevi1 As B4XView";
revisiones._btnrevi1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnrevi1",revisiones._btnrevi1);
 //BA.debugLineNum = 6;BA.debugLine="Private B4XSeekBar1 As B4XSeekBar";
revisiones._b4xseekbar1 = RemoteObject.createNew ("com.detektor.kateenapp.b4xseekbar");__ref.setField("_b4xseekbar1",revisiones._b4xseekbar1);
 //BA.debugLineNum = 7;BA.debugLine="Private edtcombustible As EditText";
revisiones._edtcombustible = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edtcombustible",revisiones._edtcombustible);
 //BA.debugLineNum = 8;BA.debugLine="Private cmbauto As B4XComboBox";
revisiones._cmbauto = RemoteObject.createNew ("com.detektor.kateenapp.b4xcombobox");__ref.setField("_cmbauto",revisiones._cmbauto);
 //BA.debugLineNum = 9;BA.debugLine="Private btncontinuarrevi2 As B4XView";
revisiones._btncontinuarrevi2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btncontinuarrevi2",revisiones._btncontinuarrevi2);
 //BA.debugLineNum = 10;BA.debugLine="Private ImageView1 As B4XView";
revisiones._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_imageview1",revisiones._imageview1);
 //BA.debugLineNum = 11;BA.debugLine="Private ime As IME";
revisiones._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_ime",revisiones._ime);
 //BA.debugLineNum = 12;BA.debugLine="Private textobs As B4XView";
revisiones._textobs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_textobs",revisiones._textobs);
 //BA.debugLineNum = 13;BA.debugLine="Private pnlnoclick As B4XView";
revisiones._pnlnoclick = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlnoclick",revisiones._pnlnoclick);
 //BA.debugLineNum = 14;BA.debugLine="Private pnlrayo As B4XView";
revisiones._pnlrayo = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlrayo",revisiones._pnlrayo);
 //BA.debugLineNum = 15;BA.debugLine="Private pnlguion As B4XView";
revisiones._pnlguion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlguion",revisiones._pnlguion);
 //BA.debugLineNum = 16;BA.debugLine="Private pnlgolpe As B4XView";
revisiones._pnlgolpe = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlgolpe",revisiones._pnlgolpe);
 //BA.debugLineNum = 17;BA.debugLine="Private img As B4XBitmap";
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");__ref.setField("_img",revisiones._img);
 //BA.debugLineNum = 18;BA.debugLine="Private pnlclickcarro As B4XView";
revisiones._pnlclickcarro = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnlclickcarro",revisiones._pnlclickcarro);
 //BA.debugLineNum = 19;BA.debugLine="Private btncontinuargolpe As B4XView";
revisiones._btncontinuargolpe = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btncontinuargolpe",revisiones._btncontinuargolpe);
 //BA.debugLineNum = 20;BA.debugLine="Private btnlimpiar As B4XView";
revisiones._btnlimpiar = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btnlimpiar",revisiones._btnlimpiar);
 //BA.debugLineNum = 21;BA.debugLine="Private btncontinuarfirma As B4XView";
revisiones._btncontinuarfirma = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btncontinuarfirma",revisiones._btncontinuarfirma);
 //BA.debugLineNum = 22;BA.debugLine="Private pnldondesefirma As B4XView";
revisiones._pnldondesefirma = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_pnldondesefirma",revisiones._pnldondesefirma);
 //BA.debugLineNum = 23;BA.debugLine="Private SignatureTemplate As B4XSignatureTemplate";
revisiones._signaturetemplate = RemoteObject.createNew ("com.detektor.kateenapp.b4xsignaturetemplate");__ref.setField("_signaturetemplate",revisiones._signaturetemplate);
 //BA.debugLineNum = 26;BA.debugLine="Private imgviewfirma As B4XView";
revisiones._imgviewfirma = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_imgviewfirma",revisiones._imgviewfirma);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _cmbauto_selectedindexchanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("cmbauto_SelectedIndexChanged (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("cmbauto_selectedindexchanged")) { return __ref.runUserSub(false, "revisiones","cmbauto_selectedindexchanged", __ref, _index);}
RemoteObject _selectedauto = RemoteObject.createImmutable("");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 69;BA.debugLine="Private Sub cmbauto_SelectedIndexChanged (Index As";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="Dim selectedAuto As String = cmbauto.GetItem(Inde";
Debug.ShouldStop(64);
_selectedauto = __ref.getField(false,"_cmbauto" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xcombobox.class, "_getitem" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("selectedAuto", _selectedauto);Debug.locals.put("selectedAuto", _selectedauto);
 BA.debugLineNum = 74;BA.debugLine="Select selectedAuto";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(_selectedauto,BA.ObjectToString("Sedan"),BA.ObjectToString("PickUp Sencillo"),BA.ObjectToString("PickUp Doble Cabina"),BA.ObjectToString("Panel"),BA.ObjectToString("Motocicleta"),BA.ObjectToString("Furgon"),BA.ObjectToString("Camioneta"),BA.ObjectToString("Camion"),BA.ObjectToString("Avion"))) {
case 0: {
 BA.debugLineNum = 76;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(2048);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("fsedan.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 77;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(4096);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 78;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 79;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(16384);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 1: {
 BA.debugLineNum = 81;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(65536);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("ffsencillo.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 82;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(131072);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 83;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 84;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(524288);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 2: {
 BA.debugLineNum = 86;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(2097152);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("ffpdoble.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 87;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 88;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 89;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(16777216);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 3: {
 BA.debugLineNum = 91;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(67108864);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("ffpanel.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 92;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 93;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 94;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(536870912);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 4: {
 BA.debugLineNum = 96;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(-2147483648);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("fmoto.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 97;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(1);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 98;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 99;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(4);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 5: {
 BA.debugLineNum = 101;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(16);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("FFURGON.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 102;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(32);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 103;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(64);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 104;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(128);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 6: {
 BA.debugLineNum = 106;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(512);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("FCAMIONETA.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 107;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(1024);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 108;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 109;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(4096);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 7: {
 BA.debugLineNum = 111;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(16384);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("FFCAMION.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 112;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(32768);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 113;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 114;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(131072);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
case 8: {
 BA.debugLineNum = 116;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
Debug.ShouldStop(524288);
revisiones._img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
revisiones._img = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("ffavioneta.jpg")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(revisiones.__c.getField(true,"True")));__ref.setField("_img",revisiones._img);
 BA.debugLineNum = 117;BA.debugLine="ImageView1.SetBitmap(img)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_imageview1" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_img" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 118;BA.debugLine="pnlclickcarro.RemoveAllViews";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 119;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(4194304);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 break; }
}
;
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Initialize (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "revisiones","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.ShouldStop(1073741824);
if (true) return __ref;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblgolpe_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblgolpe_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("lblgolpe_click")) { return __ref.runUserSub(false, "revisiones","lblgolpe_click", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Private Sub lblgolpe_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"equi";
Debug.ShouldStop(1073741824);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("equis.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblguion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblguion_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("lblguion_click")) { return __ref.runUserSub(false, "revisiones","lblguion_click", __ref);}
 BA.debugLineNum = 162;BA.debugLine="Private Sub lblguion_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"guio";
Debug.ShouldStop(4);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("guion.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblrajado_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lblrajado_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("lblrajado_click")) { return __ref.runUserSub(false, "revisiones","lblrajado_click", __ref);}
 BA.debugLineNum = 166;BA.debugLine="Private Sub lblrajado_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 167;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"rayo";
Debug.ShouldStop(64);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlclickcarro_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("pnlclickcarro_Touch (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("pnlclickcarro_touch")) { return __ref.runUserSub(false, "revisiones","pnlclickcarro_touch", __ref, _action, _x, _y);}
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _size = RemoteObject.createImmutable(0);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 144;BA.debugLine="Private Sub pnlclickcarro_Touch (Action As Int, X";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="If Action = pnlclickcarro.TOUCH_ACTION_DOWN Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN")))) { 
 BA.debugLineNum = 147;BA.debugLine="Dim iv As ImageView";
Debug.ShouldStop(262144);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 148;BA.debugLine="iv.Initialize(\"\")";
Debug.ShouldStop(524288);
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 151;BA.debugLine="iv.Bitmap = img";
Debug.ShouldStop(4194304);
_iv.runMethod(false,"setBitmap",(__ref.getField(false,"_img" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 153;BA.debugLine="Dim size As Int = 16dip";
Debug.ShouldStop(16777216);
_size = revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)));Debug.locals.put("size", _size);Debug.locals.put("size", _size);
 BA.debugLineNum = 154;BA.debugLine="pnlclickcarro.AddView(iv, X - size / 2, Y - size";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlclickcarro" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_iv.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,_size,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,_size,RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(_size),(Object)(_size));
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlgolpe_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlgolpe_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("pnlgolpe_click")) { return __ref.runUserSub(false, "revisiones","pnlgolpe_click", __ref);}
 BA.debugLineNum = 128;BA.debugLine="Private Sub pnlgolpe_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"equi";
Debug.ShouldStop(1);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("equis.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlguion_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlguion_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("pnlguion_click")) { return __ref.runUserSub(false, "revisiones","pnlguion_click", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Private Sub pnlguion_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"guio";
Debug.ShouldStop(16);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("guion.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlnoclick_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlnoclick_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("pnlnoclick_click")) { return __ref.runUserSub(false, "revisiones","pnlnoclick_click", __ref);}
 BA.debugLineNum = 124;BA.debugLine="Private Sub pnlnoclick_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="ime.HideKeyboard";
Debug.ShouldStop(268435456);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("HideKeyboard",__ref.getField(false, "ba"));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlrayo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("pnlrayo_Click (revisiones) ","revisiones",4,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("pnlrayo_click")) { return __ref.runUserSub(false, "revisiones","pnlrayo_click", __ref);}
 BA.debugLineNum = 136;BA.debugLine="Private Sub pnlrayo_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"ray";
Debug.ShouldStop(256);
__ref.setField ("_img" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"LoadBitmapResize",(Object)(revisiones.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("rayo.png")),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(revisiones.__c.getField(true,"True"))));
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
}