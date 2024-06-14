package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class menup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.menup");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.menup.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _clvs1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblhora = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _imgpproducto = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(com.detektor.kateenapp.menup __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="menup";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(com.detektor.kateenapp.menup __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="menup";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Root1.LoadLayout(\"menup\")";
_root1.LoadLayout("menup",ba);
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="p.SetLayoutAnimated(100, 0,0, 100%x, 115dip)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (115)));
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="p.LoadLayout(\"ordenes\")";
_p.LoadLayout("ordenes",ba);
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAssets";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"gpssat.png",__c.DipToCurrent((int) (52)),__c.DipToCurrent((int) (52)),__c.True).getObject()));
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="imgpproducto.SetBitmap(b)";
__ref._imgpproducto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="lblhora.Text=\"8:00AM-9:00AM\"";
__ref._lblhora /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("8:00AM-9:00AM"));
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="CLVS1.Add(p,0)";
__ref._clvs1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(0));
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (115)));
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="p.LoadLayout(\"ordenes\")";
_p.LoadLayout("ordenes",ba);
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"radiogps.png",__c.DipToCurrent((int) (52)),__c.DipToCurrent((int) (52)),__c.True).getObject()));
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="imgpproducto.SetBitmap(b)";
__ref._imgpproducto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="lblhora.Text=\"10:00AM-11:00AM\"";
__ref._lblhora /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("10:00AM-11:00AM"));
RDebugUtils.currentLine=9633813;
 //BA.debugLineNum = 9633813;BA.debugLine="CLVS1.Add(p,1)";
__ref._clvs1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(1));
RDebugUtils.currentLine=9633816;
 //BA.debugLineNum = 9633816;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633818;
 //BA.debugLineNum = 9633818;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (115)));
RDebugUtils.currentLine=9633819;
 //BA.debugLineNum = 9633819;BA.debugLine="p.LoadLayout(\"ordenes\")";
_p.LoadLayout("ordenes",ba);
RDebugUtils.currentLine=9633820;
 //BA.debugLineNum = 9633820;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"sergpsradio.png",__c.DipToCurrent((int) (52)),__c.DipToCurrent((int) (52)),__c.True).getObject()));
RDebugUtils.currentLine=9633821;
 //BA.debugLineNum = 9633821;BA.debugLine="imgpproducto.SetBitmap(b)";
__ref._imgpproducto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=9633822;
 //BA.debugLineNum = 9633822;BA.debugLine="lblhora.Text=\"11:30AM-1:30PM\"";
__ref._lblhora /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("11:30AM-1:30PM"));
RDebugUtils.currentLine=9633823;
 //BA.debugLineNum = 9633823;BA.debugLine="CLVS1.Add(p,2)";
__ref._clvs1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(2));
RDebugUtils.currentLine=9633825;
 //BA.debugLineNum = 9633825;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633827;
 //BA.debugLineNum = 9633827;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (115)));
RDebugUtils.currentLine=9633828;
 //BA.debugLineNum = 9633828;BA.debugLine="p.LoadLayout(\"ordenes\")";
_p.LoadLayout("ordenes",ba);
RDebugUtils.currentLine=9633829;
 //BA.debugLineNum = 9633829;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"servariagpsrad.png",__c.DipToCurrent((int) (52)),__c.DipToCurrent((int) (52)),__c.True).getObject()));
RDebugUtils.currentLine=9633830;
 //BA.debugLineNum = 9633830;BA.debugLine="imgpproducto.SetBitmap(b)";
__ref._imgpproducto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=9633831;
 //BA.debugLineNum = 9633831;BA.debugLine="lblhora.Text=\"3:00PM-5:00PM\"";
__ref._lblhora /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("3:00PM-5:00PM"));
RDebugUtils.currentLine=9633832;
 //BA.debugLineNum = 9633832;BA.debugLine="CLVS1.Add(p,3)";
__ref._clvs1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(3));
RDebugUtils.currentLine=9633834;
 //BA.debugLineNum = 9633834;BA.debugLine="Dim p As B4XView= xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633836;
 //BA.debugLineNum = 9633836;BA.debugLine="p.SetLayoutAnimated(100,0,0,100%x,115dip)";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (115)));
RDebugUtils.currentLine=9633837;
 //BA.debugLineNum = 9633837;BA.debugLine="p.LoadLayout(\"ordenes\")";
_p.LoadLayout("ordenes",ba);
RDebugUtils.currentLine=9633838;
 //BA.debugLineNum = 9633838;BA.debugLine="Dim b As B4XBitmap=LoadBitmapResize(File.DirAsset";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"servicio.png",__c.DipToCurrent((int) (52)),__c.DipToCurrent((int) (52)),__c.True).getObject()));
RDebugUtils.currentLine=9633839;
 //BA.debugLineNum = 9633839;BA.debugLine="imgpproducto.SetBitmap(b)";
__ref._imgpproducto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_b.getObject()));
RDebugUtils.currentLine=9633840;
 //BA.debugLineNum = 9633840;BA.debugLine="lblhora.Text=\"5:30PM - ...\"";
__ref._lblhora /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("5:30PM - ..."));
RDebugUtils.currentLine=9633841;
 //BA.debugLineNum = 9633841;BA.debugLine="CLVS1.Add(p,4)";
__ref._clvs1 /*b4a.example3.customlistview*/ ._add(_p,(Object)(4));
RDebugUtils.currentLine=9633844;
 //BA.debugLineNum = 9633844;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.menup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menup";
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Public CLVS1 As CustomListView";
_clvs1 = new b4a.example3.customlistview();
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Private lblhora As B4XView";
_lblhora = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Private imgpproducto As B4XView";
_imgpproducto = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="End Sub";
return "";
}
public String  _clvs1_itemclick(com.detektor.kateenapp.menup __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="menup";
if (Debug.shouldDelegate(ba, "clvs1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvs1_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub CLVS1_ItemClick (Index As Int, Value A";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="If Index=4 Then";
if (_index==4) { 
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Log(\"en el index 5\")";
__c.LogImpl("29699330","en el index 5",0);
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"menuord";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"menuorden");
 };
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="End Sub";
return "";
}
}