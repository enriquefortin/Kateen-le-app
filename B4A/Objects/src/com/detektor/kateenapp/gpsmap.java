package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gpsmap extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.gpsmap");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.gpsmap.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _label2 = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapfragment1 = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlhora = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlmenu = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnplace = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(com.detektor.kateenapp.gpsmap __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gpsmap";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return null;
}
public void  _addmap(com.detektor.kateenapp.gpsmap __ref) throws Exception{
RDebugUtils.currentModule="gpsmap";
if (Debug.shouldDelegate(ba, "addmap", false))
	 {Debug.delegate(ba, "addmap", null); return;}
ResumableSub_AddMap rsub = new ResumableSub_AddMap(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_AddMap extends BA.ResumableSub {
public ResumableSub_AddMap(com.detektor.kateenapp.gpsmap parent,com.detektor.kateenapp.gpsmap __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
com.detektor.kateenapp.gpsmap __ref;
com.detektor.kateenapp.gpsmap parent;
String _permission = "";
boolean _result = false;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _iniii = null;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cp = null;
anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _loc = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="gpsmap";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Wait For MapFragment1_Ready";
parent.__c.WaitFor("mapfragment1_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "gpsmap", "addmap"), null);
this.state = 26;
return;
case 26:
//C
this.state = 1;
;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Log(\"====Map is ready====\")";
parent.__c.LogImpl("21310722","====Map is ready====",0);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="gmap = MapFragment1.GetMap";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/  = __ref._mapfragment1 /*anywheresoftware.b4a.objects.MapFragmentWrapper*/ .GetMap();
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="Log(\"mapa get\")";
parent.__c.LogImpl("21310724","mapa get",0);
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_FINE_LOCAT";
__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(ba,__ref._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As S";
parent.__c.WaitFor("b4xpage_permissionresult", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "gpsmap", "addmap"), null);
this.state = 27;
return;
case 27:
//C
this.state = 1;
_permission = (String) result[1];
_result = (Boolean) result[2];
;
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="If Result = True  Then";
if (true) break;

case 1:
//if
this.state = 13;
if (_result==parent.__c.True) { 
this.state = 3;
}else {
this.state = 12;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="gmap.MyLocationEnabled = True";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .setMyLocationEnabled(parent.__c.True);
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Dim iniii As CameraPosition";
_iniii = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="iniii.Initialize(14.06669638968808, -87.171479165";
_iniii.Initialize(14.06669638968808,-87.17147916555405,(float) (12));
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="gmap.MoveCamera(iniii)";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .MoveCamera((com.google.android.gms.maps.model.CameraPosition)(_iniii.getObject()));
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="Do While gmap.MyLocation.IsInitialized = False";
if (true) break;

case 4:
//do while
this.state = 7;
while (__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation().IsInitialized()==parent.__c.False) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "gpsmap", "addmap"),(int) (100));
this.state = 28;
return;
case 28:
//C
this.state = 4;
;
 if (true) break;
;
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="If gmap.MyLocation.IsInitialized=True Then";

case 7:
//if
this.state = 10;
if (__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation().IsInitialized()==parent.__c.True) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1310742;
 //BA.debugLineNum = 1310742;BA.debugLine="Dim cp As CameraPosition";
_cp = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="cp.Initialize(gmap.MyLocation.Latitude, gmap.MyL";
_cp.Initialize(__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation().getLatitude(),__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation().getLongitude(),(float) (17));
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="gmap.MoveCamera(cp)";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .MoveCamera((com.google.android.gms.maps.model.CameraPosition)(_cp.getObject()));
 if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="Log(gmap.MyLocation)";
parent.__c.LogImpl("21310747",BA.ObjectToString(__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation()),0);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="Log(\"No permission!\")";
parent.__c.LogImpl("21310750","No permission!",0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="gmap.MapType = gmap.MAP_TYPE_NORMAL";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .setMapType(__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .MAP_TYPE_NORMAL);
RDebugUtils.currentLine=1310753;
 //BA.debugLineNum = 1310753;BA.debugLine="If gmap.IsInitialized  Then";
if (true) break;

case 14:
//if
this.state = 25;
if (__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .IsInitialized()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=1310755;
 //BA.debugLineNum = 1310755;BA.debugLine="Do While gmap.MyLocation.IsInitialized = False";
if (true) break;

case 17:
//do while
this.state = 20;
while (__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation().IsInitialized()==parent.__c.False) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 17;
RDebugUtils.currentLine=1310756;
 //BA.debugLineNum = 1310756;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "gpsmap", "addmap"),(int) (100));
this.state = 29;
return;
case 29:
//C
this.state = 17;
;
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=1310759;
 //BA.debugLineNum = 1310759;BA.debugLine="Dim cp As CameraPosition";
_cp = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=1310760;
 //BA.debugLineNum = 1310760;BA.debugLine="Dim loc As LatLng = gmap.MyLocation";
_loc = new anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper();
_loc = __ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation();
RDebugUtils.currentLine=1310761;
 //BA.debugLineNum = 1310761;BA.debugLine="If loc.IsInitialized Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_loc.IsInitialized()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=1310762;
 //BA.debugLineNum = 1310762;BA.debugLine="cp.Initialize(gmap.MyLocation.Latitude, gmap.My";
_cp.Initialize(__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation().getLatitude(),__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .getMyLocation().getLongitude(),(float) (17));
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="gmap.AnimateCamera(cp)";
__ref._gmap /*anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper*/ .AnimateCamera((com.google.android.gms.maps.model.CameraPosition)(_cp.getObject()));
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=1310768;
 //BA.debugLineNum = 1310768;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xpage_created(com.detektor.kateenapp.gpsmap __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="gpsmap";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Root1.LoadLayout(\"gpsmap\")";
_root1.LoadLayout("gpsmap",ba);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Root1.LoadLayout(\"selectloc\")";
_root1.LoadLayout("selectloc",ba);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Label2.BringToFront";
__ref._label2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="AddMap";
__ref._addmap /*void*/ (null);
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="pnlmenu.BringToFront";
__ref._pnlmenu /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="pnlhora.BringToFront";
__ref._pnlhora /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="Label2.BringToFront";
__ref._label2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=1245195;
 //BA.debugLineNum = 1245195;BA.debugLine="End Sub";
return "";
}
public String  _btnplace_click(com.detektor.kateenapp.gpsmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gpsmap";
if (Debug.shouldDelegate(ba, "btnplace_click", false))
	 {return ((String) Debug.delegate(ba, "btnplace_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub btnplace_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"question";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"questioninterface");
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.gpsmap __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gpsmap";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Private Label2 As B4XView";
_label2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Public MapFragment1 As MapFragment";
_mapfragment1 = new anywheresoftware.b4a.objects.MapFragmentWrapper();
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Public rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Private gmap As GoogleMap";
_gmap = new anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper();
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Private pnlhora As B4XView";
_pnlhora = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Private pnlmenu As B4XView";
_pnlmenu = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Private Label2 As B4XView";
_label2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Private btnplace As B4XView";
_btnplace = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="End Sub";
return "";
}
}