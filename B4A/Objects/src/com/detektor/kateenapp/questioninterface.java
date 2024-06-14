package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class questioninterface extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.questioninterface");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.questioninterface.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _imginstaphoto = null;
public com.detektor.kateenapp.b4xswitch _b4xswitchllego = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnnotificar = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmsj = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblno = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsi = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(com.detektor.kateenapp.questioninterface __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="questioninterface";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(com.detektor.kateenapp.questioninterface __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="questioninterface";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Root1.LoadLayout(\"questioninterfaz\")";
_root1.LoadLayout("questioninterfaz",ba);
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public String  _btnnotificar_click(com.detektor.kateenapp.questioninterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="questioninterface";
if (Debug.shouldDelegate(ba, "btnnotificar_click", false))
	 {return ((String) Debug.delegate(ba, "btnnotificar_click", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub btnnotificar_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If B4XSwitchllego.Value=True And lblmsj.Text=\"¿Se";
if (__ref._b4xswitchllego /*com.detektor.kateenapp.b4xswitch*/ ._getvalue /*boolean*/ (null)==__c.True && (__ref._lblmsj /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("¿Se encuentra en el lugar de instalación?")) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="lblmsj.Text=\"¿Contacto con el cliente y el vehíc";
__ref._lblmsj /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("¿Contacto con el cliente y el vehículo está disponible?"));
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="B4XSwitchllego.value=False";
__ref._b4xswitchllego /*com.detektor.kateenapp.b4xswitch*/ ._setvalue /*boolean*/ (null,__c.False);
 }else 
{RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Else If B4XSwitchllego.Value=True And lblmsj.Text";
if (__ref._b4xswitchllego /*com.detektor.kateenapp.b4xswitch*/ ._getvalue /*boolean*/ (null)==__c.True && (__ref._lblmsj /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("¿Contacto con el cliente y el vehículo está disponible?")) { 
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"revisio";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"revisiones");
 }else 
{RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="else if lblmsj.Text=\"Favor Lea el código del disp";
if ((__ref._lblmsj /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("Favor Lea el código del dispositivo a instalar")) { 
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="B4XPages.ShowPage(\"OpenCamera\")";
_b4xpages._showpage /*String*/ (ba,"OpenCamera");
 }else {
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="ToastMessageShow(\"Notificar a SAC que NO \"& lbl";
__c.ToastMessageShow(BA.ObjectToCharSequence("Notificar a SAC que NO "+__ref._lblmsj /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),__c.False);
 }}}
;
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.questioninterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="questioninterface";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Private imginstaphoto As B4XView";
_imginstaphoto = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Public B4XSwitchllego As B4XSwitch";
_b4xswitchllego = new com.detektor.kateenapp.b4xswitch();
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Public btnnotificar As B4XView";
_btnnotificar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Public lblmsj As B4XView";
_lblmsj = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Public lblno As B4XView";
_lblno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Public lblsi As B4XView";
_lblsi = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="End Sub";
return "";
}
}