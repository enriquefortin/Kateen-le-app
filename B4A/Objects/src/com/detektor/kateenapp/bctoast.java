package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bctoast extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.bctoast");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.bctoast.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _showindex = 0;
public com.detektor.kateenapp.bblabel _bb1 = null;
public com.detektor.kateenapp.bctextengine _te = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public int _durationms = 0;
public int _defaulttextcolor = 0;
public int _paddingsides = 0;
public int _paddingtopbottom = 0;
public int _maxheight = 0;
public int _verticalcenterpercentage = 0;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(com.detektor.kateenapp.bctoast __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctoast";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="pnl = xui.CreatePanel(\"\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="Parent.AddView(pnl, 0, 0, Parent.Width - 30dip, M";
_parent.AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (_parent.getWidth()-__c.DipToCurrent((int) (30))),__ref._maxheight /*int*/ );
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="pnl.LoadLayout(\"BCToast\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("BCToast",ba);
RDebugUtils.currentLine=45678596;
 //BA.debugLineNum = 45678596;BA.debugLine="pnl.SetColorAndBorder(0xFFC3C3C3, 0dip, xui.Color";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xffc3c3c3),__c.DipToCurrent((int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=45678597;
 //BA.debugLineNum = 45678597;BA.debugLine="pnl.Visible = False";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=45678598;
 //BA.debugLineNum = 45678598;BA.debugLine="te.Initialize(pnl)";
__ref._te /*com.detektor.kateenapp.bctextengine*/ ._initialize /*String*/ (null,ba,__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=45678599;
 //BA.debugLineNum = 45678599;BA.debugLine="iv = BB1.mBase.GetView(0)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=45678600;
 //BA.debugLineNum = 45678600;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=45678601;
 //BA.debugLineNum = 45678601;BA.debugLine="BB1.DisableResizeEvent = True";
__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._disableresizeevent /*boolean*/  = __c.True;
RDebugUtils.currentLine=45678603;
 //BA.debugLineNum = 45678603;BA.debugLine="Dim p As Panel = pnl";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=45678604;
 //BA.debugLineNum = 45678604;BA.debugLine="p.Elevation = 5dip";
_p.setElevation((float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=45678607;
 //BA.debugLineNum = 45678607;BA.debugLine="End Sub";
return "";
}
public void  _show(com.detektor.kateenapp.bctoast __ref,String _message) throws Exception{
RDebugUtils.currentModule="bctoast";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_message}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_message);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(com.detektor.kateenapp.bctoast parent,com.detektor.kateenapp.bctoast __ref,String _message) {
this.parent = parent;
this.__ref = __ref;
this._message = _message;
this.__ref = parent;
}
com.detektor.kateenapp.bctoast __ref;
com.detektor.kateenapp.bctoast parent;
String _message;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
int _w = 0;
int _h = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
int _newleft = 0;
int _dx = 0;
int _dy = 0;
int _myindex = 0;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="bctoast";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=45744129;
 //BA.debugLineNum = 45744129;BA.debugLine="BB1.ParseData.DefaultColor = DefaultTextColor";
__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = __ref._defaulttextcolor /*int*/ ;
RDebugUtils.currentLine=45744130;
 //BA.debugLineNum = 45744130;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=45744131;
 //BA.debugLineNum = 45744131;BA.debugLine="For Each v As B4XView In pnl.GetAllViewsRecursive";
if (true) break;

case 1:
//for
this.state = 10;
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
group3 = __ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
index3 = 0;
groupLen3 = group3.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index3 < groupLen3) {
this.state = 3;
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));}
if (true) break;

case 20:
//C
this.state = 19;
index3++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=45744132;
 //BA.debugLineNum = 45744132;BA.debugLine="If v.Tag = \"to remove\" Then v.RemoveViewFromPare";
if (true) break;

case 4:
//if
this.state = 9;
if ((_v.getTag()).equals((Object)("to remove"))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_v.RemoveViewFromParent();
if (true) break;

case 9:
//C
this.state = 20;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=45744134;
 //BA.debugLineNum = 45744134;BA.debugLine="pnl.Width = pnl.Parent.Width - 2 * PaddingSides";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getWidth()-2*__ref._paddingsides /*int*/ ));
RDebugUtils.currentLine=45744135;
 //BA.debugLineNum = 45744135;BA.debugLine="pnl.Height = MaxHeight";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._maxheight /*int*/ );
RDebugUtils.currentLine=45744136;
 //BA.debugLineNum = 45744136;BA.debugLine="BB1.mBase.Width = pnl.Width";
__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=45744137;
 //BA.debugLineNum = 45744137;BA.debugLine="BB1.mBase.Height = pnl.Height";
__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=45744138;
 //BA.debugLineNum = 45744138;BA.debugLine="BB1.mBase.AddView(iv, 0, 0, BB1.mBase.Width, BB1.";
__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=45744139;
 //BA.debugLineNum = 45744139;BA.debugLine="BB1.Text = Message";
__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._settext /*String*/ (null,_message);
RDebugUtils.currentLine=45744140;
 //BA.debugLineNum = 45744140;BA.debugLine="Dim iv As B4XView = BB1.mBase.GetView(0)";
parent._iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
parent._iv = __ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=45744141;
 //BA.debugLineNum = 45744141;BA.debugLine="iv.RemoveViewFromParent";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=45744142;
 //BA.debugLineNum = 45744142;BA.debugLine="Dim w As Int = iv.Width + 2 * PaddingSides";
_w = (int) (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+2*__ref._paddingsides /*int*/ );
RDebugUtils.currentLine=45744143;
 //BA.debugLineNum = 45744143;BA.debugLine="Dim h As Int = iv.Height + 2 * PaddingTopBottom";
_h = (int) (__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+2*__ref._paddingtopbottom /*int*/ );
RDebugUtils.currentLine=45744144;
 //BA.debugLineNum = 45744144;BA.debugLine="Dim Parent As B4XView = pnl.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = __ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent();
RDebugUtils.currentLine=45744145;
 //BA.debugLineNum = 45744145;BA.debugLine="Dim NewLeft As Int = Parent.Width / 2 - w / 2";
_newleft = (int) (_parent.getWidth()/(double)2-_w/(double)2);
RDebugUtils.currentLine=45744146;
 //BA.debugLineNum = 45744146;BA.debugLine="pnl.SetLayoutAnimated(0, NewLeft, Parent.Height *";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_newleft,(int) (_parent.getHeight()*__ref._verticalcenterpercentage /*int*/ /(double)100-_h/(double)2),_w,_h);
RDebugUtils.currentLine=45744147;
 //BA.debugLineNum = 45744147;BA.debugLine="pnl.BringToFront";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=45744148;
 //BA.debugLineNum = 45744148;BA.debugLine="Dim dx As Int = PaddingSides - iv.Left";
_dx = (int) (__ref._paddingsides /*int*/ -__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());
RDebugUtils.currentLine=45744149;
 //BA.debugLineNum = 45744149;BA.debugLine="Dim dy As Int = PaddingTopBottom - iv.Top";
_dy = (int) (__ref._paddingtopbottom /*int*/ -__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
RDebugUtils.currentLine=45744150;
 //BA.debugLineNum = 45744150;BA.debugLine="pnl.AddView(iv, PaddingSides, PaddingTopBottom, i";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__ref._paddingsides /*int*/ ,__ref._paddingtopbottom /*int*/ ,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=45744152;
 //BA.debugLineNum = 45744152;BA.debugLine="Do While BB1.mBase.NumberOfViews > 0";
if (true) break;

case 11:
//do while
this.state = 14;
while (__ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()>0) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
RDebugUtils.currentLine=45744153;
 //BA.debugLineNum = 45744153;BA.debugLine="Dim v As B4XView = BB1.mBase.GetView(0)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = __ref._bb1 /*com.detektor.kateenapp.bblabel*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=45744154;
 //BA.debugLineNum = 45744154;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=45744155;
 //BA.debugLineNum = 45744155;BA.debugLine="v.Tag = \"to remove\"";
_v.setTag((Object)("to remove"));
RDebugUtils.currentLine=45744156;
 //BA.debugLineNum = 45744156;BA.debugLine="pnl.AddView(v, dx + v.Left, dy + v.Top, v.Width,";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_v.getObject()),(int) (_dx+_v.getLeft()),(int) (_dy+_v.getTop()),_v.getWidth(),_v.getHeight());
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=45744158;
 //BA.debugLineNum = 45744158;BA.debugLine="pnl.SetVisibleAnimated(200, True)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (200),parent.__c.True);
RDebugUtils.currentLine=45744159;
 //BA.debugLineNum = 45744159;BA.debugLine="ShowIndex = ShowIndex + 1";
__ref._showindex /*int*/  = (int) (__ref._showindex /*int*/ +1);
RDebugUtils.currentLine=45744160;
 //BA.debugLineNum = 45744160;BA.debugLine="Dim MyIndex As Int = ShowIndex";
_myindex = __ref._showindex /*int*/ ;
RDebugUtils.currentLine=45744161;
 //BA.debugLineNum = 45744161;BA.debugLine="Sleep(DurationMs)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "bctoast", "show"),__ref._durationms /*int*/ );
this.state = 21;
return;
case 21:
//C
this.state = 15;
;
RDebugUtils.currentLine=45744162;
 //BA.debugLineNum = 45744162;BA.debugLine="If MyIndex = ShowIndex Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_myindex==__ref._showindex /*int*/ ) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=45744163;
 //BA.debugLineNum = 45744163;BA.debugLine="pnl.SetVisibleAnimated(200, False)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (200),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=45744166;
 //BA.debugLineNum = 45744166;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(com.detektor.kateenapp.bctoast __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctoast";
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="Public pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=45613059;
 //BA.debugLineNum = 45613059;BA.debugLine="Private ShowIndex As Int";
_showindex = 0;
RDebugUtils.currentLine=45613060;
 //BA.debugLineNum = 45613060;BA.debugLine="Public BB1 As BBLabel";
_bb1 = new com.detektor.kateenapp.bblabel();
RDebugUtils.currentLine=45613061;
 //BA.debugLineNum = 45613061;BA.debugLine="Private te As BCTextEngine";
_te = new com.detektor.kateenapp.bctextengine();
RDebugUtils.currentLine=45613062;
 //BA.debugLineNum = 45613062;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=45613063;
 //BA.debugLineNum = 45613063;BA.debugLine="Public DurationMs As Int = 3000";
_durationms = (int) (3000);
RDebugUtils.currentLine=45613064;
 //BA.debugLineNum = 45613064;BA.debugLine="Public DefaultTextColor As Int = 0xFF3E3E3E";
_defaulttextcolor = ((int)0xff3e3e3e);
RDebugUtils.currentLine=45613065;
 //BA.debugLineNum = 45613065;BA.debugLine="Public PaddingSides As Int = 15dip";
_paddingsides = __c.DipToCurrent((int) (15));
RDebugUtils.currentLine=45613066;
 //BA.debugLineNum = 45613066;BA.debugLine="Public PaddingTopBottom As Int = 10dip";
_paddingtopbottom = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=45613067;
 //BA.debugLineNum = 45613067;BA.debugLine="Public MaxHeight As Int = 100dip";
_maxheight = __c.DipToCurrent((int) (100));
RDebugUtils.currentLine=45613068;
 //BA.debugLineNum = 45613068;BA.debugLine="Public VerticalCenterPercentage As Int = 85";
_verticalcenterpercentage = (int) (85);
RDebugUtils.currentLine=45613069;
 //BA.debugLineNum = 45613069;BA.debugLine="End Sub";
return "";
}
}