package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class login extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.login");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.login.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _lst = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _button1 = null;
public anywheresoftware.b4a.objects.collections.List _listacombo = null;
public anywheresoftware.b4a.objects.IME _ime1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.IME _ime = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(com.detektor.kateenapp.login __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(com.detektor.kateenapp.login __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
String _password = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
String _encoded64 = "";
String _s = "";
byte[] _b = null;
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="Root1.LoadLayout(\"login\")";
_root1.LoadLayout("login",ba);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Log(\"desde el menu principal\")";
__c.LogImpl("28716292","desde el menu principal",0);
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="listacombo.Initialize";
__ref._listacombo /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="listacombo.AddAll(Array As String (\"No\",\"Si\"))";
__ref._listacombo /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"No","Si"}));
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="Dim password As String = \"mi_contraseña_secreta\"";
_password = "mi_contraseña_secreta";
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="Dim Encoded64 As String";
_encoded64 = "";
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="Private s As String = password";
_s = _password;
RDebugUtils.currentLine=8716302;
 //BA.debugLineNum = 8716302;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=8716303;
 //BA.debugLineNum = 8716303;BA.debugLine="Encoded64 = su.EncodeBase64(s.GetBytes(\"utf8\"))";
_encoded64 = _su.EncodeBase64(_s.getBytes("utf8"));
RDebugUtils.currentLine=8716306;
 //BA.debugLineNum = 8716306;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=8716307;
 //BA.debugLineNum = 8716307;BA.debugLine="Dim b() As Byte = su.DecodeBase64(Encoded64)";
_b = _su.DecodeBase64(_encoded64);
RDebugUtils.currentLine=8716312;
 //BA.debugLineNum = 8716312;BA.debugLine="Log(\"Contraseña original: \" & password)";
__c.LogImpl("28716312","Contraseña original: "+_password,0);
RDebugUtils.currentLine=8716313;
 //BA.debugLineNum = 8716313;BA.debugLine="Log(\"Contraseña cifrada: \" & Encoded64)";
__c.LogImpl("28716313","Contraseña cifrada: "+_encoded64,0);
RDebugUtils.currentLine=8716314;
 //BA.debugLineNum = 8716314;BA.debugLine="Log(BytesToString(b, 0, b.Length, \"utf8\"))";
__c.LogImpl("28716314",__c.BytesToString(_b,(int) (0),_b.length,"utf8"),0);
RDebugUtils.currentLine=8716316;
 //BA.debugLineNum = 8716316;BA.debugLine="ime.SetCustomFilter( EditText1, EditText1.INPUT_T";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .SetCustomFilter((android.widget.EditText)(__ref._edittext1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getObject()),(int) (__ref._edittext1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .INPUT_TYPE_TEXT+4096),"ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789.");
RDebugUtils.currentLine=8716317;
 //BA.debugLineNum = 8716317;BA.debugLine="End Sub";
return "";
}
public String  _button1_click(com.detektor.kateenapp.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub Button1_Click";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"gps\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"gps");
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Private lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="Private Button1 As B4XView";
_button1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Private listacombo As List";
_listacombo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="Private IME1 As IME";
_ime1 = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=8585223;
 //BA.debugLineNum = 8585223;BA.debugLine="Private Panel4 As B4XView";
_panel4 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8585224;
 //BA.debugLineNum = 8585224;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="Private ime As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.main._dbcommand  _createcommand(com.detektor.kateenapp.login __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((com.detektor.kateenapp.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
com.detektor.kateenapp.main._dbcommand _cmdc = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim cmdc As DBCommand";
_cmdc = new com.detektor.kateenapp.main._dbcommand();
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="cmdc.Initialize";
_cmdc.Initialize();
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="cmdc.Name = Name";
_cmdc.Name /*String*/  = _name;
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="If Parameters <> Null Then cmdc.Parameters = Para";
if (_parameters!= null) { 
_cmdc.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Return cmdc";
if (true) return _cmdc;
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.dbrequestmanager  _createrequest(com.detektor.kateenapp.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((com.detektor.kateenapp.dbrequestmanager) Debug.delegate(ba, "createrequest", null));}
com.detektor.kateenapp.dbrequestmanager _req = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub CreateRequest As DBRequestManager";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim req As DBRequestManager";
_req = new com.detektor.kateenapp.dbrequestmanager();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="req.Initialize(Me, Main.rdcLink)";
_req._initialize /*String*/ (null,ba,this,_main._rdclink /*String*/ );
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="End Sub";
return null;
}
public String  _pnlnoclick_touch(com.detektor.kateenapp.login __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "pnlnoclick_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlnoclick_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Private Sub pnlnoclick_Touch (Action As Int, X As";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="IME1.HideKeyboard";
__ref._ime1 /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return "";
}
}