package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bbcodeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.bbcodeview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.bbcodeview.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _internalbbviewurl{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List Lines;
public void Initialize() {
IsInitialized = true;
Lines = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.collections.List _runs = null;
public com.detektor.kateenapp.bctextengine._bcparagraphstyle _style = null;
public com.detektor.kateenapp.bctextengine _mtextengine = null;
public String _mtext = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _backgroundimageview = null;
public com.detektor.kateenapp.bctextengine._bcparagraph _paragraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _sv = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _padding = null;
public com.detektor.kateenapp.bbcodeparser._bbcodeparsedata _parsedata = null;
public Object _tag = null;
public boolean _lazyloading = false;
public anywheresoftware.b4a.objects.collections.List _imageviewscache = null;
public com.detektor.kateenapp.b4xorderedmap _usedimageviews = null;
public anywheresoftware.b4a.objects.collections.List _externalruns = null;
public boolean _disableautomaticdrawingsinlazymode = false;
public boolean _rtl = false;
public anywheresoftware.b4a.objects.collections.Map _urltolines = null;
public boolean _autounderlineurls = false;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(com.detektor.kateenapp.bbcodeview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="sv.ScrollViewContentWidth = Width";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setScrollViewContentWidth((int) (_width));
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="If Runs.IsInitialized Then";
if (__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=47316997;
 //BA.debugLineNum = 47316997;BA.debugLine="If ParseData.NeedToReparseWhenResize Then";
if (__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/ ) { 
RDebugUtils.currentLine=47316998;
 //BA.debugLineNum = 47316998;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
 }else {
RDebugUtils.currentLine=47317000;
 //BA.debugLineNum = 47317000;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
 };
 };
RDebugUtils.currentLine=47317003;
 //BA.debugLineNum = 47317003;BA.debugLine="End Sub";
return "";
}
public String  _parseanddraw(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "parseanddraw", true))
	 {return ((String) Debug.delegate(ba, "parseanddraw", null));}
anywheresoftware.b4a.objects.collections.List _pe = null;
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Public Sub ParseAndDraw";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="ParseData.NeedToReparseWhenResize = False";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .NeedToReparseWhenResize /*boolean*/  = __c.False;
RDebugUtils.currentLine=48037890;
 //BA.debugLineNum = 48037890;BA.debugLine="ParseData.Text = mText";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .Text /*String*/  = __ref._mtext /*String*/ ;
RDebugUtils.currentLine=48037891;
 //BA.debugLineNum = 48037891;BA.debugLine="ParseData.URLs.Clear";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=48037892;
 //BA.debugLineNum = 48037892;BA.debugLine="ParseData.Width = (mBase.Width - Padding.Left - P";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .Width /*int*/  = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight()));
RDebugUtils.currentLine=48037893;
 //BA.debugLineNum = 48037893;BA.debugLine="If RTL Then mTextEngine.RTLAware = True";
if (__ref._rtl /*boolean*/ ) { 
__ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._rtlaware /*boolean*/  = __c.True;};
RDebugUtils.currentLine=48037894;
 //BA.debugLineNum = 48037894;BA.debugLine="Dim pe As List = mTextEngine.TagParser.Parse(Pars";
_pe = new anywheresoftware.b4a.objects.collections.List();
_pe = __ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._tagparser /*com.detektor.kateenapp.bbcodeparser*/ ._parse /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ );
RDebugUtils.currentLine=48037895;
 //BA.debugLineNum = 48037895;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().RemoveAllViews();
RDebugUtils.currentLine=48037896;
 //BA.debugLineNum = 48037896;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=48037897;
 //BA.debugLineNum = 48037897;BA.debugLine="sv.ScrollViewInnerPanel.AddView(TouchPanel, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=48037899;
 //BA.debugLineNum = 48037899;BA.debugLine="sv.ScrollViewInnerPanel.AddView(ForegroundImageVi";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=48037900;
 //BA.debugLineNum = 48037900;BA.debugLine="If ExternalRuns.IsInitialized And ExternalRuns.Si";
if (__ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized() && __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=48037901;
 //BA.debugLineNum = 48037901;BA.debugLine="Runs = ExternalRuns";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._externalruns /*anywheresoftware.b4a.objects.collections.List*/ ;
 }else {
RDebugUtils.currentLine=48037903;
 //BA.debugLineNum = 48037903;BA.debugLine="Runs = mTextEngine.TagParser.CreateRuns(pe, Pars";
__ref._runs /*anywheresoftware.b4a.objects.collections.List*/  = __ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._tagparser /*com.detektor.kateenapp.bbcodeparser*/ ._createruns /*anywheresoftware.b4a.objects.collections.List*/ (null,_pe,__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ );
 };
RDebugUtils.currentLine=48037906;
 //BA.debugLineNum = 48037906;BA.debugLine="Redraw";
__ref._redraw /*String*/ (null);
RDebugUtils.currentLine=48037907;
 //BA.debugLineNum = 48037907;BA.debugLine="End Sub";
return "";
}
public String  _redraw(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "redraw", true))
	 {return ((String) Debug.delegate(ba, "redraw", null));}
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Public Sub Redraw";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="Dim Style As BCParagraphStyle = mTextEngine.Creat";
_style = __ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._createstyle /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="Style.Padding = Padding";
__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/  = __ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ;
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="Style.MaxWidth = mBase.Width";
__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=48103428;
 //BA.debugLineNum = 48103428;BA.debugLine="Style.ResizeHeightAutomatically = True";
__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  = __c.True;
RDebugUtils.currentLine=48103429;
 //BA.debugLineNum = 48103429;BA.debugLine="Style.RTL = RTL";
__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  = __ref._rtl /*boolean*/ ;
RDebugUtils.currentLine=48103430;
 //BA.debugLineNum = 48103430;BA.debugLine="URLToLines.Clear";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=48103431;
 //BA.debugLineNum = 48103431;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=48103432;
 //BA.debugLineNum = 48103432;BA.debugLine="CleanExistingImageViews(False, UsedImageViews.Ke";
__ref._cleanexistingimageviews /*String*/ (null,__c.False,__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null),(int) (0),(int) (0));
RDebugUtils.currentLine=48103433;
 //BA.debugLineNum = 48103433;BA.debugLine="UsedImageViews.Clear";
__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=48103434;
 //BA.debugLineNum = 48103434;BA.debugLine="Paragraph = mTextEngine.PrepareForLazyDrawing(Ru";
__ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/  = __ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._prepareforlazydrawing /*com.detektor.kateenapp.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=48103435;
 //BA.debugLineNum = 48103435;BA.debugLine="ForegroundImageView.SetLayoutAnimated(0, Style.P";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentWidth()-__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getWidth()),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewContentHeight()-__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getHeight()));
RDebugUtils.currentLine=48103436;
 //BA.debugLineNum = 48103436;BA.debugLine="If AutoUnderlineURLs And ParseData.URLs.Size > 0";
if (__ref._autounderlineurls /*boolean*/  && __ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=48103437;
 //BA.debugLineNum = 48103437;BA.debugLine="CollectURLs";
__ref._collecturls /*String*/ (null);
 };
RDebugUtils.currentLine=48103439;
 //BA.debugLineNum = 48103439;BA.debugLine="DrawVisibleRegion";
__ref._drawvisibleregion /*String*/ (null);
 }else {
RDebugUtils.currentLine=48103441;
 //BA.debugLineNum = 48103441;BA.debugLine="Paragraph = mTextEngine.DrawText(Runs, Style, Fo";
__ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/  = __ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._drawtext /*com.detektor.kateenapp.bctextengine._bcparagraph*/ (null,__ref._runs /*anywheresoftware.b4a.objects.collections.List*/ ,__ref._style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ ,__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 };
RDebugUtils.currentLine=48103443;
 //BA.debugLineNum = 48103443;BA.debugLine="If TouchPanel.IsInitialized Then";
if (__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=48103444;
 //BA.debugLineNum = 48103444;BA.debugLine="TouchPanel.SetLayoutAnimated(0, ForegroundImageV";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=48103446;
 //BA.debugLineNum = 48103446;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=46989317;
 //BA.debugLineNum = 46989317;BA.debugLine="Private Runs As List";
_runs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46989318;
 //BA.debugLineNum = 46989318;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=46989319;
 //BA.debugLineNum = 46989319;BA.debugLine="Public Style As BCParagraphStyle";
_style = new com.detektor.kateenapp.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=46989320;
 //BA.debugLineNum = 46989320;BA.debugLine="Private mTextEngine As BCTextEngine";
_mtextengine = new com.detektor.kateenapp.bctextengine();
RDebugUtils.currentLine=46989321;
 //BA.debugLineNum = 46989321;BA.debugLine="Private mText As String";
_mtext = "";
RDebugUtils.currentLine=46989322;
 //BA.debugLineNum = 46989322;BA.debugLine="Public ForegroundImageView As B4XView";
_foregroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=46989323;
 //BA.debugLineNum = 46989323;BA.debugLine="Public BackgroundImageView As B4XView";
_backgroundimageview = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=46989324;
 //BA.debugLineNum = 46989324;BA.debugLine="Public Paragraph As BCParagraph";
_paragraph = new com.detektor.kateenapp.bctextengine._bcparagraph();
RDebugUtils.currentLine=46989325;
 //BA.debugLineNum = 46989325;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=46989326;
 //BA.debugLineNum = 46989326;BA.debugLine="Public sv As B4XView";
_sv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=46989327;
 //BA.debugLineNum = 46989327;BA.debugLine="Public Padding As B4XRect";
_padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=46989328;
 //BA.debugLineNum = 46989328;BA.debugLine="Public ParseData As BBCodeParseData";
_parsedata = new com.detektor.kateenapp.bbcodeparser._bbcodeparsedata();
RDebugUtils.currentLine=46989329;
 //BA.debugLineNum = 46989329;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=46989330;
 //BA.debugLineNum = 46989330;BA.debugLine="Public LazyLoading As Boolean";
_lazyloading = false;
RDebugUtils.currentLine=46989331;
 //BA.debugLineNum = 46989331;BA.debugLine="Private ImageViewsCache As List";
_imageviewscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46989332;
 //BA.debugLineNum = 46989332;BA.debugLine="Private UsedImageViews As B4XOrderedMap";
_usedimageviews = new com.detektor.kateenapp.b4xorderedmap();
RDebugUtils.currentLine=46989333;
 //BA.debugLineNum = 46989333;BA.debugLine="Public ExternalRuns As List";
_externalruns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=46989334;
 //BA.debugLineNum = 46989334;BA.debugLine="Public DisableAutomaticDrawingsInLazyMode As Bool";
_disableautomaticdrawingsinlazymode = false;
RDebugUtils.currentLine=46989335;
 //BA.debugLineNum = 46989335;BA.debugLine="Type InternalBBViewURL (Lines As List)";
;
RDebugUtils.currentLine=46989336;
 //BA.debugLineNum = 46989336;BA.debugLine="Public RTL As Boolean";
_rtl = false;
RDebugUtils.currentLine=46989337;
 //BA.debugLineNum = 46989337;BA.debugLine="Private URLToLines As Map";
_urltolines = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=46989338;
 //BA.debugLineNum = 46989338;BA.debugLine="Public AutoUnderlineURLs As Boolean";
_autounderlineurls = false;
RDebugUtils.currentLine=46989339;
 //BA.debugLineNum = 46989339;BA.debugLine="End Sub";
return "";
}
public String  _cleanexistingimageviews(com.detektor.kateenapp.bbcodeview __ref,boolean _invisibleonly,anywheresoftware.b4a.objects.collections.List _existing,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "cleanexistingimageviews", true))
	 {return ((String) Debug.delegate(ba, "cleanexistingimageviews", new Object[] {_invisibleonly,_existing,_offset,_height}));}
com.detektor.kateenapp.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Private Sub CleanExistingImageViews (InvisibleOnly";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="For Each Line As BCTextLine In Existing";
{
final anywheresoftware.b4a.BA.IterableList group1 = _existing;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="If InvisibleOnly = False Or LineIsVisible(Line,";
if (_invisibleonly==__c.False || __ref._lineisvisible /*boolean*/ (null,_line,_offset,_height)==__c.False) { 
RDebugUtils.currentLine=47972355;
 //BA.debugLineNum = 47972355;BA.debugLine="Dim xiv As B4XView = UsedImageViews.Get(Line)";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line))));
RDebugUtils.currentLine=47972356;
 //BA.debugLineNum = 47972356;BA.debugLine="xiv.RemoveViewFromParent";
_xiv.RemoveViewFromParent();
RDebugUtils.currentLine=47972357;
 //BA.debugLineNum = 47972357;BA.debugLine="xiv.SetBitmap(Null)";
_xiv.SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=47972358;
 //BA.debugLineNum = 47972358;BA.debugLine="ImageViewsCache.Add(xiv)";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_xiv.getObject()));
RDebugUtils.currentLine=47972359;
 //BA.debugLineNum = 47972359;BA.debugLine="If InvisibleOnly = True Then UsedImageViews.Rem";
if (_invisibleonly==__c.True) { 
__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_line));};
 };
 }
};
RDebugUtils.currentLine=47972362;
 //BA.debugLineNum = 47972362;BA.debugLine="End Sub";
return "";
}
public boolean  _lineisvisible(com.detektor.kateenapp.bbcodeview __ref,com.detektor.kateenapp.bctextengine._bctextline _line,int _offset,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "lineisvisible", true))
	 {return ((Boolean) Debug.delegate(ba, "lineisvisible", new Object[] {_line,_offset,_height}));}
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Private Sub LineIsVisible(line As BCTextLine, offs";
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="Return line.BaselineY + line.MaxHeightBelowBaseLi";
if (true) return _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_offset && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_offset+_height;
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="End Sub";
return false;
}
public String  _collecturls(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "collecturls", true))
	 {return ((String) Debug.delegate(ba, "collecturls", null));}
com.detektor.kateenapp.bctextengine._bctextline _line = null;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _st = null;
com.detektor.kateenapp.bbcodeview._internalbbviewurl _extra = null;
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Private Sub CollectURLs";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=48365571;
 //BA.debugLineNum = 48365571;BA.debugLine="For Each st As BCSingleStyleSection In un.Singl";
{
final anywheresoftware.b4a.BA.IterableList group3 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_st = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(group3.Get(index3));
RDebugUtils.currentLine=48365572;
 //BA.debugLineNum = 48365572;BA.debugLine="If ParseData.URLs.ContainsKey(st.Run) Then";
if (__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ ))) { 
RDebugUtils.currentLine=48365573;
 //BA.debugLineNum = 48365573;BA.debugLine="Dim extra As InternalBBViewURL";
_extra = new com.detektor.kateenapp.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=48365574;
 //BA.debugLineNum = 48365574;BA.debugLine="If URLToLines.ContainsKey(st.Run) = False The";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_st.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ ))==__c.False) { 
RDebugUtils.currentLine=48365575;
 //BA.debugLineNum = 48365575;BA.debugLine="extra = CreateBCURLExtraData";
_extra = __ref._createbcurlextradata /*com.detektor.kateenapp.bbcodeview._internalbbviewurl*/ (null);
RDebugUtils.currentLine=48365576;
 //BA.debugLineNum = 48365576;BA.debugLine="URLToLines.Put(st.Run, extra)";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_st.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ ),(Object)(_extra));
 }else {
RDebugUtils.currentLine=48365578;
 //BA.debugLineNum = 48365578;BA.debugLine="extra = URLToLines.Get(st.Run)";
_extra = (com.detektor.kateenapp.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_st.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ )));
 };
RDebugUtils.currentLine=48365580;
 //BA.debugLineNum = 48365580;BA.debugLine="If extra.Lines.IndexOf(line) = -1 Then";
if (_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_line))==-1) { 
RDebugUtils.currentLine=48365581;
 //BA.debugLineNum = 48365581;BA.debugLine="extra.Lines.Add(line)";
_extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
 };
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=48365587;
 //BA.debugLineNum = 48365587;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bbcodeview._internalbbviewurl  _createbcurlextradata(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "createbcurlextradata", true))
	 {return ((com.detektor.kateenapp.bbcodeview._internalbbviewurl) Debug.delegate(ba, "createbcurlextradata", null));}
com.detektor.kateenapp.bbcodeview._internalbbviewurl _t1 = null;
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Private Sub CreateBCURLExtraData  As InternalBBVie";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="Dim t1 As InternalBBViewURL";
_t1 = new com.detektor.kateenapp.bbcodeview._internalbbviewurl();
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=48431107;
 //BA.debugLineNum = 48431107;BA.debugLine="t1.Lines.Initialize";
_t1.Lines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=48431108;
 //BA.debugLineNum = 48431108;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=48431109;
 //BA.debugLineNum = 48431109;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(com.detektor.kateenapp.bbcodeview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ScrollViewWrapper _sp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=47251465;
 //BA.debugLineNum = 47251465;BA.debugLine="Dim sp As ScrollView";
_sp = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=47251466;
 //BA.debugLineNum = 47251466;BA.debugLine="sp.Initialize2(50dip, \"sv\")";
_sp.Initialize2(ba,__c.DipToCurrent((int) (50)),"sv");
RDebugUtils.currentLine=47251472;
 //BA.debugLineNum = 47251472;BA.debugLine="LazyLoading = Props.GetDefault(\"LazyLoading\", Tru";
__ref._lazyloading /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.True)));
RDebugUtils.currentLine=47251473;
 //BA.debugLineNum = 47251473;BA.debugLine="AutoUnderlineURLs = Props.GetDefault(\"AutoUnderli";
__ref._autounderlineurls /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("AutoUnderline"),(Object)(__c.True)));
RDebugUtils.currentLine=47251474;
 //BA.debugLineNum = 47251474;BA.debugLine="If LazyLoading Then";
if (__ref._lazyloading /*boolean*/ ) { 
RDebugUtils.currentLine=47251475;
 //BA.debugLineNum = 47251475;BA.debugLine="ImageViewsCache.Initialize";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=47251476;
 //BA.debugLineNum = 47251476;BA.debugLine="UsedImageViews = B4XCollections.CreateOrderedMap";
__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/  = _b4xcollections._createorderedmap /*com.detektor.kateenapp.b4xorderedmap*/ (ba);
 };
RDebugUtils.currentLine=47251478;
 //BA.debugLineNum = 47251478;BA.debugLine="sv = sp";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sp.getObject()));
RDebugUtils.currentLine=47251479;
 //BA.debugLineNum = 47251479;BA.debugLine="sv.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=47251480;
 //BA.debugLineNum = 47251480;BA.debugLine="sv.ScrollViewInnerPanel.Color = mBase.Color";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().setColor(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=47251481;
 //BA.debugLineNum = 47251481;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=47251482;
 //BA.debugLineNum = 47251482;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=47251483;
 //BA.debugLineNum = 47251483;BA.debugLine="mText = xlbl.Text";
__ref._mtext /*String*/  = _xlbl.getText();
RDebugUtils.currentLine=47251484;
 //BA.debugLineNum = 47251484;BA.debugLine="ParseData.DefaultColor = xlbl.TextColor";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .DefaultColor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=47251485;
 //BA.debugLineNum = 47251485;BA.debugLine="ParseData.DefaultFont = xlbl.Font";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .DefaultFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=47251486;
 //BA.debugLineNum = 47251486;BA.debugLine="ParseData.ViewsPanel = sv.ScrollViewInnerPanel";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .ViewsPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel();
RDebugUtils.currentLine=47251487;
 //BA.debugLineNum = 47251487;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_linkcl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_linkclicked",(int) (1))) { 
RDebugUtils.currentLine=47251488;
 //BA.debugLineNum = 47251488;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
 };
RDebugUtils.currentLine=47251495;
 //BA.debugLineNum = 47251495;BA.debugLine="ParseData.DefaultBoldFont = xui.CreateFont(Typefa";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .DefaultBoldFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont(__c.Typeface.CreateNew(_lbl.getTypeface(),__c.Typeface.STYLE_BOLD),_xlbl.getTextSize());
RDebugUtils.currentLine=47251499;
 //BA.debugLineNum = 47251499;BA.debugLine="End Sub";
return "";
}
public String  _drawvisibleregion(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "drawvisibleregion", true))
	 {return ((String) Debug.delegate(ba, "drawvisibleregion", null));}
RDebugUtils.currentLine=47644672;
 //BA.debugLineNum = 47644672;BA.debugLine="Private Sub DrawVisibleRegion";
RDebugUtils.currentLine=47644673;
 //BA.debugLineNum = 47644673;BA.debugLine="If DisableAutomaticDrawingsInLazyMode Then Return";
if (__ref._disableautomaticdrawingsinlazymode /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="UpdateVisibleRegion(sv.ScrollViewOffsetY * mTextE";
__ref._updatevisibleregion /*String*/ (null,(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewOffsetY()*__ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._mscale /*float*/ ),(int) (__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._mscale /*float*/ ));
RDebugUtils.currentLine=47644675;
 //BA.debugLineNum = 47644675;BA.debugLine="End Sub";
return "";
}
public String  _updatevisibleregion(com.detektor.kateenapp.bbcodeview __ref,int _offsety,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "updatevisibleregion", true))
	 {return ((String) Debug.delegate(ba, "updatevisibleregion", new Object[] {_offsety,_height}));}
boolean _foundfirst = false;
anywheresoftware.b4a.objects.collections.List _existing = null;
com.detektor.kateenapp.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="Public Sub UpdateVisibleRegion (OffsetY As Int, He";
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="Dim foundFirst As Boolean";
_foundfirst = false;
RDebugUtils.currentLine=47710210;
 //BA.debugLineNum = 47710210;BA.debugLine="Dim Existing As List";
_existing = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=47710211;
 //BA.debugLineNum = 47710211;BA.debugLine="Existing.Initialize";
_existing.Initialize();
RDebugUtils.currentLine=47710212;
 //BA.debugLineNum = 47710212;BA.debugLine="Existing.AddAll(UsedImageViews.Keys)";
_existing.AddAll(__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null));
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="CleanExistingImageViews(True, Existing, OffsetY,";
__ref._cleanexistingimageviews /*String*/ (null,__c.True,_existing,_offsety,_height);
RDebugUtils.currentLine=47710214;
 //BA.debugLineNum = 47710214;BA.debugLine="For Each Line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ .TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group6.Get(index6));
RDebugUtils.currentLine=47710215;
 //BA.debugLineNum = 47710215;BA.debugLine="If LineIsVisible (Line, OffsetY, Height) Then";
if (__ref._lineisvisible /*boolean*/ (null,_line,_offsety,_height)) { 
RDebugUtils.currentLine=47710216;
 //BA.debugLineNum = 47710216;BA.debugLine="foundFirst = True";
_foundfirst = __c.True;
RDebugUtils.currentLine=47710217;
 //BA.debugLineNum = 47710217;BA.debugLine="If UsedImageViews.ContainsKey(Line) Then";
if (__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=47710218;
 //BA.debugLineNum = 47710218;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=47710220;
 //BA.debugLineNum = 47710220;BA.debugLine="Dim xiv As B4XView";
_xiv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=47710221;
 //BA.debugLineNum = 47710221;BA.debugLine="If ImageViewsCache.Size = 0 Then";
if (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=47710222;
 //BA.debugLineNum = 47710222;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=47710223;
 //BA.debugLineNum = 47710223;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=47710224;
 //BA.debugLineNum = 47710224;BA.debugLine="xiv = iv";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 }else {
RDebugUtils.currentLine=47710226;
 //BA.debugLineNum = 47710226;BA.debugLine="xiv = ImageViewsCache.Get(ImageViewsCache.Size";
_xiv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=47710227;
 //BA.debugLineNum = 47710227;BA.debugLine="ImageViewsCache.RemoveAt(ImageViewsCache.Size";
__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._imageviewscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
RDebugUtils.currentLine=47710229;
 //BA.debugLineNum = 47710229;BA.debugLine="sv.ScrollViewInnerPanel.AddView(xiv, 0, 0, 0, 0";
__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getScrollViewInnerPanel().AddView((android.view.View)(_xiv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=47710230;
 //BA.debugLineNum = 47710230;BA.debugLine="xiv.SendToBack";
_xiv.SendToBack();
RDebugUtils.currentLine=47710231;
 //BA.debugLineNum = 47710231;BA.debugLine="mTextEngine.DrawSingleLine(Line, xiv, Paragraph";
__ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._drawsingleline /*String*/ (null,_line,_xiv,__ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ );
RDebugUtils.currentLine=47710232;
 //BA.debugLineNum = 47710232;BA.debugLine="UsedImageViews.Put(Line, xiv)";
__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_line),(Object)(_xiv.getObject()));
 }else {
RDebugUtils.currentLine=47710234;
 //BA.debugLineNum = 47710234;BA.debugLine="If foundFirst Then Exit";
if (_foundfirst) { 
if (true) break;};
 };
 }
};
RDebugUtils.currentLine=47710237;
 //BA.debugLineNum = 47710237;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bctextrun  _findtouchedrun(com.detektor.kateenapp.bbcodeview __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "findtouchedrun", true))
	 {return ((com.detektor.kateenapp.bctextengine._bctextrun) Debug.delegate(ba, "findtouchedrun", new Object[] {_x,_y}));}
int _offsetx = 0;
int _offsety = 0;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Private Sub FindTouchedRun(x As Float, y As Float)";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="For Each offsetx As Int In Array(0, -5dip, 5dip)";
{
final Object[] group1 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (5))),(Object)(__c.DipToCurrent((int) (5)))};
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_offsetx = (int)(BA.ObjectToNumber(group1[index1]));
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="For Each offsety As Int In Array(0, -3dip, 3dip)";
{
final Object[] group2 = new Object[]{(Object)(0),(Object)(-__c.DipToCurrent((int) (3))),(Object)(__c.DipToCurrent((int) (3)))};
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_offsety = (int)(BA.ObjectToNumber(group2[index2]));
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="Dim single As BCSingleStyleSection = mTextEngin";
_single = __ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._findsinglestylesection /*com.detektor.kateenapp.bctextengine._bcsinglestylesection*/ (null,__ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ ,(int) (_x+_offsetx),(int) (_y+_offsety));
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="If single <> Null Then";
if (_single!= null) { 
RDebugUtils.currentLine=48234501;
 //BA.debugLineNum = 48234501;BA.debugLine="Return single.Run";
if (true) return _single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ ;
 };
 }
};
 }
};
RDebugUtils.currentLine=48234505;
 //BA.debugLineNum = 48234505;BA.debugLine="Return Null";
if (true) return (com.detektor.kateenapp.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=48234506;
 //BA.debugLineNum = 48234506;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bctextline  _getanchorline(com.detektor.kateenapp.bbcodeview __ref,String _anchor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "getanchorline", true))
	 {return ((com.detektor.kateenapp.bctextengine._bctextline) Debug.delegate(ba, "getanchorline", new Object[] {_anchor}));}
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Private Sub GetAnchorLine (Anchor As String) As BC";
RDebugUtils.currentLine=47841281;
 //BA.debugLineNum = 47841281;BA.debugLine="If Paragraph.Anchors.IsInitialized = False Then R";
if (__ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ .Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return (com.detektor.kateenapp.bctextengine._bctextline)(__c.Null);};
RDebugUtils.currentLine=47841282;
 //BA.debugLineNum = 47841282;BA.debugLine="Return Paragraph.Anchors.Get(Anchor)";
if (true) return (com.detektor.kateenapp.bctextengine._bctextline)(__ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ .Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_anchor)));
RDebugUtils.currentLine=47841283;
 //BA.debugLineNum = 47841283;BA.debugLine="End Sub";
return null;
}
public String  _gettext(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=47579136;
 //BA.debugLineNum = 47579136;BA.debugLine="Public Sub getText As String";
RDebugUtils.currentLine=47579137;
 //BA.debugLineNum = 47579137;BA.debugLine="Return mText";
if (true) return __ref._mtext /*String*/ ;
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine  _gettextengine(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "gettextengine", true))
	 {return ((com.detektor.kateenapp.bctextengine) Debug.delegate(ba, "gettextengine", null));}
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="Public Sub getTextEngine As BCTextEngine";
RDebugUtils.currentLine=47448065;
 //BA.debugLineNum = 47448065;BA.debugLine="Return mTextEngine";
if (true) return __ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ;
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getviews(com.detektor.kateenapp.bbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "getviews", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getviews", null));}
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Public Sub getViews As Map";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="Return ParseData.Views";
if (true) return __ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="End Sub";
return null;
}
public String  _initialize(com.detektor.kateenapp.bbcodeview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=47054853;
 //BA.debugLineNum = 47054853;BA.debugLine="ForegroundImageView = iv";
__ref._foregroundimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=47054854;
 //BA.debugLineNum = 47054854;BA.debugLine="ParseData.Initialize";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .Initialize();
RDebugUtils.currentLine=47054855;
 //BA.debugLineNum = 47054855;BA.debugLine="ParseData.Views.Initialize";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=47054856;
 //BA.debugLineNum = 47054856;BA.debugLine="ParseData.URLs.Initialize";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=47054857;
 //BA.debugLineNum = 47054857;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=47054858;
 //BA.debugLineNum = 47054858;BA.debugLine="Padding.Initialize(5dip, 5dip, 20dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (20))),(float) (__c.DipToCurrent((int) (5))));
 }else {
RDebugUtils.currentLine=47054860;
 //BA.debugLineNum = 47054860;BA.debugLine="Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
__ref._padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
 };
RDebugUtils.currentLine=47054862;
 //BA.debugLineNum = 47054862;BA.debugLine="ParseData.ImageCache.Initialize";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .ImageCache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=47054863;
 //BA.debugLineNum = 47054863;BA.debugLine="URLToLines.Initialize";
__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=47054864;
 //BA.debugLineNum = 47054864;BA.debugLine="End Sub";
return "";
}
public String  _markurl(com.detektor.kateenapp.bbcodeview __ref,com.detektor.kateenapp.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "markurl", true))
	 {return ((String) Debug.delegate(ba, "markurl", new Object[] {_run}));}
com.detektor.kateenapp.bctextengine._bctextrun _r = null;
com.detektor.kateenapp.bbcodeview._internalbbviewurl _extra = null;
com.detektor.kateenapp.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Private Sub MarkURL (Run As BCTextRun)";
RDebugUtils.currentLine=48300042;
 //BA.debugLineNum = 48300042;BA.debugLine="For Each r As BCTextRun In URLToLines.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_r = (com.detektor.kateenapp.bctextengine._bctextrun)(group1.Get(index1));
RDebugUtils.currentLine=48300043;
 //BA.debugLineNum = 48300043;BA.debugLine="If r.Underline <> (r = Run) Then";
if (_r.Underline /*boolean*/ !=((_r).equals(_run))) { 
RDebugUtils.currentLine=48300044;
 //BA.debugLineNum = 48300044;BA.debugLine="r.Underline = r = Run";
_r.Underline /*boolean*/  = (_r).equals(_run);
RDebugUtils.currentLine=48300045;
 //BA.debugLineNum = 48300045;BA.debugLine="Dim extra As InternalBBViewURL = URLToLines.Get";
_extra = (com.detektor.kateenapp.bbcodeview._internalbbviewurl)(__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_r)));
RDebugUtils.currentLine=48300046;
 //BA.debugLineNum = 48300046;BA.debugLine="For Each line As BCTextLine In extra.Lines";
{
final anywheresoftware.b4a.BA.IterableList group5 = _extra.Lines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group5.Get(index5));
RDebugUtils.currentLine=48300047;
 //BA.debugLineNum = 48300047;BA.debugLine="If UsedImageViews.ContainsKey(line) Then";
if (__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_line))) { 
RDebugUtils.currentLine=48300048;
 //BA.debugLineNum = 48300048;BA.debugLine="mTextEngine.DrawSingleLine(line, UsedImageVie";
__ref._mtextengine /*com.detektor.kateenapp.bctextengine*/ ._drawsingleline /*String*/ (null,_line,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._usedimageviews /*com.detektor.kateenapp.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_line)))),__ref._paragraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ );
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=48300053;
 //BA.debugLineNum = 48300053;BA.debugLine="End Sub";
return "";
}
public String  _scrolltoanchor(com.detektor.kateenapp.bbcodeview __ref,String _anchor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "scrolltoanchor", true))
	 {return ((String) Debug.delegate(ba, "scrolltoanchor", new Object[] {_anchor}));}
com.detektor.kateenapp.bctextengine._bctextline _line = null;
int _top = 0;
anywheresoftware.b4a.objects.ScrollViewWrapper _nsv = null;
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Public Sub ScrollToAnchor(Anchor As String)";
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="Dim line As BCTextLine = GetAnchorLine(Anchor)";
_line = __ref._getanchorline /*com.detektor.kateenapp.bctextengine._bctextline*/ (null,_anchor);
RDebugUtils.currentLine=47775746;
 //BA.debugLineNum = 47775746;BA.debugLine="If line <> Null Then";
if (_line!= null) { 
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="Dim top As Int = line.BaselineY - line.MaxHeight";
_top = (int) (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=47775756;
 //BA.debugLineNum = 47775756;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_nsv = (anywheresoftware.b4a.objects.ScrollViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ScrollViewWrapper(), (android.widget.ScrollView)(__ref._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=47775757;
 //BA.debugLineNum = 47775757;BA.debugLine="nsv.ScrollPosition = top";
_nsv.setScrollPosition(_top);
 };
RDebugUtils.currentLine=47775760;
 //BA.debugLineNum = 47775760;BA.debugLine="End Sub";
return "";
}
public String  _settext(com.detektor.kateenapp.bbcodeview __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Public Sub setText(t As String)";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="mText = t";
__ref._mtext /*String*/  = _t;
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="ParseAndDraw";
__ref._parseanddraw /*String*/ (null);
RDebugUtils.currentLine=47513603;
 //BA.debugLineNum = 47513603;BA.debugLine="End Sub";
return "";
}
public String  _settextengine(com.detektor.kateenapp.bbcodeview __ref,com.detektor.kateenapp.bctextengine _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "settextengine", true))
	 {return ((String) Debug.delegate(ba, "settextengine", new Object[] {_b}));}
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Public Sub setTextEngine (b As BCTextEngine)";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="mTextEngine = b";
__ref._mtextengine /*com.detektor.kateenapp.bctextengine*/  = _b;
RDebugUtils.currentLine=47382533;
 //BA.debugLineNum = 47382533;BA.debugLine="If mText <> \"\" Then";
if ((__ref._mtext /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=47382534;
 //BA.debugLineNum = 47382534;BA.debugLine="setText(mText)";
__ref._settext /*String*/ (null,__ref._mtext /*String*/ );
 };
RDebugUtils.currentLine=47382536;
 //BA.debugLineNum = 47382536;BA.debugLine="End Sub";
return "";
}
public String  _setviews(com.detektor.kateenapp.bbcodeview __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "setviews", true))
	 {return ((String) Debug.delegate(ba, "setviews", new Object[] {_m}));}
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Public Sub setViews (m As Map)";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="ParseData.Views = m";
__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .Views /*anywheresoftware.b4a.objects.collections.Map*/  = _m;
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="End Sub";
return "";
}
public String  _sv_scrollchanged(com.detektor.kateenapp.bbcodeview __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "sv_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "sv_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Private Sub sv_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="If LazyLoading Then DrawVisibleRegion";
if (__ref._lazyloading /*boolean*/ ) { 
__ref._drawvisibleregion /*String*/ (null);};
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(com.detektor.kateenapp.bbcodeview __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bbcodeview";
if (Debug.shouldDelegate(ba, "touchpanel_touch", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
com.detektor.kateenapp.bctextengine._bctextrun _run = null;
String _url = "";
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="Dim run As BCTextRun = Null";
_run = (com.detektor.kateenapp.bctextengine._bctextrun)(__c.Null);
RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="If URLToLines.Size > 0 Or Action = TouchPanel.TOU";
if (__ref._urltolines /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0 || _action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=48168963;
 //BA.debugLineNum = 48168963;BA.debugLine="run = FindTouchedRun(X, Y)";
_run = __ref._findtouchedrun /*com.detektor.kateenapp.bctextengine._bctextrun*/ (null,_x,_y);
 };
RDebugUtils.currentLine=48168965;
 //BA.debugLineNum = 48168965;BA.debugLine="If run <> Null And ParseData.URLs.ContainsKey(run";
if (_run!= null && __ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_run))) { 
RDebugUtils.currentLine=48168966;
 //BA.debugLineNum = 48168966;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=48168967;
 //BA.debugLineNum = 48168967;BA.debugLine="Dim url As String = ParseData.Urls.Get(run)";
_url = BA.ObjectToString(__ref._parsedata /*com.detektor.kateenapp.bbcodeparser._bbcodeparsedata*/ .URLs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_run)));
RDebugUtils.currentLine=48168968;
 //BA.debugLineNum = 48168968;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_LinkC";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LinkClicked",(Object)(_url));
RDebugUtils.currentLine=48168969;
 //BA.debugLineNum = 48168969;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(com.detektor.kateenapp.bctextengine._bctextrun)(__c.Null));
 }else 
{RDebugUtils.currentLine=48168970;
 //BA.debugLineNum = 48168970;BA.debugLine="Else If (xui.IsB4i And Action = 4) Or (xui.IsB4A";
if ((__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && _action==4) || (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && _action==3)) { 
RDebugUtils.currentLine=48168971;
 //BA.debugLineNum = 48168971;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(com.detektor.kateenapp.bctextengine._bctextrun)(__c.Null));
 }else {
RDebugUtils.currentLine=48168974;
 //BA.debugLineNum = 48168974;BA.debugLine="MarkURL(run)";
__ref._markurl /*String*/ (null,_run);
 }}
;
RDebugUtils.currentLine=48168976;
 //BA.debugLineNum = 48168976;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=48168978;
 //BA.debugLineNum = 48168978;BA.debugLine="MarkURL(Null)";
__ref._markurl /*String*/ (null,(com.detektor.kateenapp.bctextengine._bctextrun)(__c.Null));
RDebugUtils.currentLine=48168979;
 //BA.debugLineNum = 48168979;BA.debugLine="End Sub";
return "";
}
}