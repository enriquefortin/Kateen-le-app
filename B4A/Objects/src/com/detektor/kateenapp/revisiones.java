package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class revisiones extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.revisiones");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.revisiones.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _autos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnrevi1 = null;
public com.detektor.kateenapp.b4xseekbar _b4xseekbar1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtcombustible = null;
public com.detektor.kateenapp.b4xcombobox _cmbauto = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btncontinuarrevi2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _textobs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlnoclick = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlrayo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlguion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlgolpe = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _img = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlclickcarro = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btncontinuargolpe = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnlimpiar = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btncontinuarfirma = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnldondesefirma = null;
public com.detektor.kateenapp.b4xsignaturetemplate _signaturetemplate = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _imgviewfirma = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(com.detektor.kateenapp.revisiones __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(com.detektor.kateenapp.revisiones __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Root1.LoadLayout(\"revi1\")";
_root1.LoadLayout("revi1",ba);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="autos.Initialize";
__ref._autos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="autos.AddAll(Array As String(\"Sedan\",\"PickUp Senc";
__ref._autos /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Sedan","PickUp Sencillo","PickUp Doble Cabina","Panel","Motocicleta","Furgon","Camioneta","Camion","Avion"}));
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="ime.Initialize(\"\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("");
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"rayo.";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="SignatureTemplate.Initialize";
__ref._signaturetemplate /*com.detektor.kateenapp.b4xsignaturetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="End Sub";
return "";
}
public String  _b4xseekbar1_valuechanged(com.detektor.kateenapp.revisiones __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "b4xseekbar1_valuechanged", false))
	 {return ((String) Debug.delegate(ba, "b4xseekbar1_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub B4XSeekBar1_ValueChanged (Value As Int";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="edtcombustible.Text=Value&\"%\"";
__ref._edtcombustible /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_value)+"%"));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _btncontinuarfirma_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "btncontinuarfirma_click", false))
	 {return ((String) Debug.delegate(ba, "btncontinuarfirma_click", null));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
com.detektor.kateenapp.questioninterface _paglog = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub btncontinuarfirma_Click";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim out As OutputStream = File.OpenOutput(File.Di";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(__c.File.getDirInternal(),"signature.png",__c.False);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="SignatureTemplate.Bitmap.WriteToStream(out, 100,";
__ref._signaturetemplate /*com.detektor.kateenapp.b4xsignaturetemplate*/ ._getbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null).WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="ToastMessageShow(\"Firma guardada\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Firma guardada"),__c.False);
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Dim paglog As questioninterface";
_paglog = new com.detektor.kateenapp.questioninterface();
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="paglog=B4XPages.GetPage(\"questioninterface\")";
_paglog = (com.detektor.kateenapp.questioninterface)(_b4xpages._getpage /*Object*/ (ba,"questioninterface"));
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="paglog.lblmsj.Text=\"Favor Lea el código del dispo";
_paglog._lblmsj /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Favor Lea el código del dispositivo a instalar"));
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="paglog.B4XSwitchllego.mBase.Visible=False";
_paglog._b4xswitchllego /*com.detektor.kateenapp.b4xswitch*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="paglog.lblno.Visible=False";
_paglog._lblno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="paglog.lblsi.Visible=False";
_paglog._lblsi /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="paglog.btnnotificar.Text=\"Leer\"";
_paglog._btnnotificar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Leer"));
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"question";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"questioninterface");
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="End Sub";
return "";
}
public String  _btncontinuargolpe_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "btncontinuargolpe_click", false))
	 {return ((String) Debug.delegate(ba, "btncontinuargolpe_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub btncontinuargolpe_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Root.LoadLayout(\"firma\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("firma",ba);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="pnldondesefirma.AddView(SignatureTemplate.mBase,";
__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._signaturetemplate /*com.detektor.kateenapp.b4xsignaturetemplate*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="SignatureTemplate.Resize(pnldondesefirma.Width,pn";
__ref._signaturetemplate /*com.detektor.kateenapp.b4xsignaturetemplate*/ ._resize /*String*/ (null,__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="End Sub";
return "";
}
public String  _btncontinuarrevi2_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "btncontinuarrevi2_click", false))
	 {return ((String) Debug.delegate(ba, "btncontinuarrevi2_click", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub btncontinuarrevi2_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Root.LoadLayout(\"golpes\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("golpes",ba);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="cmbauto.SetItems(autos)";
__ref._cmbauto /*com.detektor.kateenapp.b4xcombobox*/ ._setitems /*String*/ (null,__ref._autos /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="End Sub";
return "";
}
public String  _btnlimpiar_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "btnlimpiar_click", false))
	 {return ((String) Debug.delegate(ba, "btnlimpiar_click", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Private Sub btnlimpiar_Click";
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="pnldondesefirma.RemoveAllViews";
__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="SignatureTemplate.Initialize";
__ref._signaturetemplate /*com.detektor.kateenapp.b4xsignaturetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="pnldondesefirma.AddView(SignatureTemplate.mBase,";
__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._signaturetemplate /*com.detektor.kateenapp.b4xsignaturetemplate*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="SignatureTemplate.Resize(pnldondesefirma.Width,pn";
__ref._signaturetemplate /*com.detektor.kateenapp.b4xsignaturetemplate*/ ._resize /*String*/ (null,__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._pnldondesefirma /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="End Sub";
return "";
}
public String  _btnrevi1_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "btnrevi1_click", false))
	 {return ((String) Debug.delegate(ba, "btnrevi1_click", null));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub btnrevi1_Click";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Root.LoadLayout(\"revi2\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("revi2",ba);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Private autos As List";
_autos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Private btnrevi1 As B4XView";
_btnrevi1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Private B4XSeekBar1 As B4XSeekBar";
_b4xseekbar1 = new com.detektor.kateenapp.b4xseekbar();
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="Private edtcombustible As EditText";
_edtcombustible = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Private cmbauto As B4XComboBox";
_cmbauto = new com.detektor.kateenapp.b4xcombobox();
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Private btncontinuarrevi2 As B4XView";
_btncontinuarrevi2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="Private ImageView1 As B4XView";
_imageview1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="Private ime As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Private textobs As B4XView";
_textobs = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="Private pnlnoclick As B4XView";
_pnlnoclick = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="Private pnlrayo As B4XView";
_pnlrayo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703950;
 //BA.debugLineNum = 1703950;BA.debugLine="Private pnlguion As B4XView";
_pnlguion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="Private pnlgolpe As B4XView";
_pnlgolpe = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="Private img As B4XBitmap";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=1703953;
 //BA.debugLineNum = 1703953;BA.debugLine="Private pnlclickcarro As B4XView";
_pnlclickcarro = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703954;
 //BA.debugLineNum = 1703954;BA.debugLine="Private btncontinuargolpe As B4XView";
_btncontinuargolpe = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="Private btnlimpiar As B4XView";
_btnlimpiar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703956;
 //BA.debugLineNum = 1703956;BA.debugLine="Private btncontinuarfirma As B4XView";
_btncontinuarfirma = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703957;
 //BA.debugLineNum = 1703957;BA.debugLine="Private pnldondesefirma As B4XView";
_pnldondesefirma = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703958;
 //BA.debugLineNum = 1703958;BA.debugLine="Private SignatureTemplate As B4XSignatureTemplate";
_signaturetemplate = new com.detektor.kateenapp.b4xsignaturetemplate();
RDebugUtils.currentLine=1703961;
 //BA.debugLineNum = 1703961;BA.debugLine="Private imgviewfirma As B4XView";
_imgviewfirma = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1703962;
 //BA.debugLineNum = 1703962;BA.debugLine="End Sub";
return "";
}
public String  _cmbauto_selectedindexchanged(com.detektor.kateenapp.revisiones __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "cmbauto_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "cmbauto_selectedindexchanged", new Object[] {_index}));}
String _selectedauto = "";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub cmbauto_SelectedIndexChanged (Index As";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim selectedAuto As String = cmbauto.GetItem(Inde";
_selectedauto = __ref._cmbauto /*com.detektor.kateenapp.b4xcombobox*/ ._getitem /*String*/ (null,_index);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Select selectedAuto";
switch (BA.switchObjectToInt(_selectedauto,"Sedan","PickUp Sencillo","PickUp Doble Cabina","Panel","Motocicleta","Furgon","Camioneta","Camion","Avion")) {
case 0: {
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"fsedan.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 1: {
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"ffsencillo.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"ffpdoble.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 3: {
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"ffpanel.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097176;
 //BA.debugLineNum = 2097176;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097177;
 //BA.debugLineNum = 2097177;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 4: {
RDebugUtils.currentLine=2097179;
 //BA.debugLineNum = 2097179;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"fmoto.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097180;
 //BA.debugLineNum = 2097180;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097181;
 //BA.debugLineNum = 2097181;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097182;
 //BA.debugLineNum = 2097182;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 5: {
RDebugUtils.currentLine=2097184;
 //BA.debugLineNum = 2097184;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"FFURGON.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097185;
 //BA.debugLineNum = 2097185;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097186;
 //BA.debugLineNum = 2097186;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097187;
 //BA.debugLineNum = 2097187;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 6: {
RDebugUtils.currentLine=2097189;
 //BA.debugLineNum = 2097189;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"FCAMIONETA.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097190;
 //BA.debugLineNum = 2097190;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097191;
 //BA.debugLineNum = 2097191;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097192;
 //BA.debugLineNum = 2097192;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 7: {
RDebugUtils.currentLine=2097194;
 //BA.debugLineNum = 2097194;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"FFCAMION.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097195;
 //BA.debugLineNum = 2097195;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097196;
 //BA.debugLineNum = 2097196;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097197;
 //BA.debugLineNum = 2097197;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
case 8: {
RDebugUtils.currentLine=2097199;
 //BA.debugLineNum = 2097199;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmapResize(Fil";
_img = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_img = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"ffavioneta.jpg",__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.True);
RDebugUtils.currentLine=2097200;
 //BA.debugLineNum = 2097200;BA.debugLine="ImageView1.SetBitmap(img)";
__ref._imageview1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2097201;
 //BA.debugLineNum = 2097201;BA.debugLine="pnlclickcarro.RemoveAllViews";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=2097202;
 //BA.debugLineNum = 2097202;BA.debugLine="img = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
 break; }
}
;
RDebugUtils.currentLine=2097205;
 //BA.debugLineNum = 2097205;BA.debugLine="End Sub";
return "";
}
public String  _lblgolpe_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "lblgolpe_click", false))
	 {return ((String) Debug.delegate(ba, "lblgolpe_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Private Sub lblgolpe_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"equi";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"equis.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public String  _lblguion_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "lblguion_click", false))
	 {return ((String) Debug.delegate(ba, "lblguion_click", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub lblguion_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"guio";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"guion.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public String  _lblrajado_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "lblrajado_click", false))
	 {return ((String) Debug.delegate(ba, "lblrajado_click", null));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Private Sub lblrajado_Click";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"rayo";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public String  _pnlclickcarro_touch(com.detektor.kateenapp.revisiones __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "pnlclickcarro_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlclickcarro_touch", new Object[] {_action,_x,_y}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
int _size = 0;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub pnlclickcarro_Touch (Action As Int, X";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If Action = pnlclickcarro.TOUCH_ACTION_DOWN Then";
if (_action==__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="iv.Bitmap = img";
_iv.setBitmap((android.graphics.Bitmap)(__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Dim size As Int = 16dip";
_size = __c.DipToCurrent((int) (16));
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="pnlclickcarro.AddView(iv, X - size / 2, Y - size";
__ref._pnlclickcarro /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_iv.getObject()),(int) (_x-_size/(double)2),(int) (_y-_size/(double)2),_size,_size);
 };
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="End Sub";
return "";
}
public String  _pnlgolpe_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "pnlgolpe_click", false))
	 {return ((String) Debug.delegate(ba, "pnlgolpe_click", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub pnlgolpe_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"equi";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"equis.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public String  _pnlguion_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "pnlguion_click", false))
	 {return ((String) Debug.delegate(ba, "pnlguion_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Private Sub pnlguion_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"guio";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"guion.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public String  _pnlnoclick_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "pnlnoclick_click", false))
	 {return ((String) Debug.delegate(ba, "pnlnoclick_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub pnlnoclick_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="ime.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public String  _pnlrayo_click(com.detektor.kateenapp.revisiones __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="revisiones";
if (Debug.shouldDelegate(ba, "pnlrayo_click", false))
	 {return ((String) Debug.delegate(ba, "pnlrayo_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Private Sub pnlrayo_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="img  = xui.LoadBitmapResize(File.DirAssets, \"ray";
__ref._img /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(__c.File.getDirAssets(),"rayo.png",__c.DipToCurrent((int) (16)),__c.DipToCurrent((int) (16)),__c.True);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
}