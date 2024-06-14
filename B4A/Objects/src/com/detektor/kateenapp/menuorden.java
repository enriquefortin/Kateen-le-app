package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class menuorden extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.menuorden");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.menuorden.class).invoke(this, new Object[] {null});
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
public com.detektor.kateenapp.b4xradiobutton _b4xradiobutton1 = null;
public anywheresoftware.b4a.objects.collections.List _tipodeservicios = null;
public com.detektor.kateenapp.b4xcombobox _b4xcombobox1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _label1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _label2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel15 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel16 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlcerrar = null;
public com.detektor.kateenapp.b4xradiobutton _b4xradiobutton2 = null;
public com.detektor.kateenapp.b4xradiobutton _b4xradiobutton4 = null;
public com.detektor.kateenapp.b4xradiobutton _b4xradiobutton3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _button1 = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(com.detektor.kateenapp.menuorden __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="menuorden";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(com.detektor.kateenapp.menuorden __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuorden";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Root1.LoadLayout(\"menuorden\")";
_root1.LoadLayout("menuorden",ba);
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="B4XRadioButton1.Checked=True";
__ref._b4xradiobutton1 /*com.detektor.kateenapp.b4xradiobutton*/ ._setchecked /*boolean*/ (null,__c.True);
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="tipodeservicios.Initialize";
__ref._tipodeservicios /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="tipodeservicios.AddAll(Array As String(\"Instalaci";
__ref._tipodeservicios /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Instalación","Revisión","Desmonte","Mantenimiento"}));
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="B4XComboBox1.SetItems(tipodeservicios)";
__ref._b4xcombobox1 /*com.detektor.kateenapp.b4xcombobox*/ ._setitems /*String*/ (null,__ref._tipodeservicios /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="Panel15.Top=Label1.Top+Label1.Height";
__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._label1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._label1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="Panel16.Top=Label2.Top+Label2.Height";
__ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._label2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._label2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="Panel15.LoadLayout(\"menudatoscliente\")";
__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("menudatoscliente",ba);
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="Panel16.LoadLayout(\"menudatosvehiculo\")";
__ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("menudatosvehiculo",ba);
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(com.detektor.kateenapp.menuorden __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuorden";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"gpsmap\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"gpsmap");
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.menuorden __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuorden";
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Private B4XRadioButton1 As B4XRadioButton";
_b4xradiobutton1 = new com.detektor.kateenapp.b4xradiobutton();
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Private tipodeservicios As List";
_tipodeservicios = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new com.detektor.kateenapp.b4xcombobox();
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="Private Label1 As B4XView";
_label1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Private Label2 As B4XView";
_label2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Private Panel15 As Panel";
_panel15 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="Private Panel16 As Panel";
_panel16 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="Private pnlcerrar As B4XView";
_pnlcerrar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="Private B4XRadioButton2 As B4XRadioButton";
_b4xradiobutton2 = new com.detektor.kateenapp.b4xradiobutton();
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="Private B4XRadioButton4 As B4XRadioButton";
_b4xradiobutton4 = new com.detektor.kateenapp.b4xradiobutton();
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="Private B4XRadioButton3 As B4XRadioButton";
_b4xradiobutton3 = new com.detektor.kateenapp.b4xradiobutton();
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="Private Button1 As B4XView";
_button1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9043984;
 //BA.debugLineNum = 9043984;BA.debugLine="End Sub";
return "";
}
public String  _label1_click(com.detektor.kateenapp.menuorden __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuorden";
if (Debug.shouldDelegate(ba, "label1_click", false))
	 {return ((String) Debug.delegate(ba, "label1_click", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub Label1_Click";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="If Panel15.Visible=False Then";
if (__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.False) { 
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Panel15.Visible=True";
__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Panel15.BringToFront";
__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Panel15.RequestFocus";
__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .RequestFocus();
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="B4XComboBox1.mBase.Visible=False";
__ref._b4xcombobox1 /*com.detektor.kateenapp.b4xcombobox*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="End Sub";
return "";
}
public String  _label2_click(com.detektor.kateenapp.menuorden __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuorden";
if (Debug.shouldDelegate(ba, "label2_click", false))
	 {return ((String) Debug.delegate(ba, "label2_click", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub Label2_Click";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="If Panel16.Visible=False Then";
if (__ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.False) { 
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Panel16.Visible=True";
__ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="Panel16.BringToFront";
__ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="Panel16.RequestFocus";
__ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .RequestFocus();
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="B4XComboBox1.mBase.Visible=False";
__ref._b4xcombobox1 /*com.detektor.kateenapp.b4xcombobox*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="End Sub";
return "";
}
public String  _pnlcerrar_click(com.detektor.kateenapp.menuorden __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="menuorden";
if (Debug.shouldDelegate(ba, "pnlcerrar_click", false))
	 {return ((String) Debug.delegate(ba, "pnlcerrar_click", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub pnlcerrar_Click";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="If Panel15.Visible=True Or Panel16.visible=True T";
if (__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.True || __ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.True) { 
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Panel15.Visible=False";
__ref._panel15 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Panel16.Visible=False";
__ref._panel16 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="B4XComboBox1.mBase.Visible=True";
__ref._b4xcombobox1 /*com.detektor.kateenapp.b4xcombobox*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="End Sub";
return "";
}
}