package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bctextengine extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.detektor.kateenapp.bctextengine");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.detektor.kateenapp.bctextengine.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bcfontmetrics{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.Map Glyphs;
public com.detektor.kateenapp.bctextengine._bcfontmetrics DefaultColorMetrics;
public int xWidth;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont Fnt;
public int Clr;
public anywheresoftware.b4a.objects.collections.Map KerningTable;
public void Initialize() {
IsInitialized = true;
Glyphs = new anywheresoftware.b4a.objects.collections.Map();
DefaultColorMetrics = new com.detektor.kateenapp.bctextengine._bcfontmetrics();
xWidth = 0;
Fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
Clr = 0;
KerningTable = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextchars{
public boolean IsInitialized;
public String[] Buffer;
public int StartIndex;
public int Length;
public void Initialize() {
IsInitialized = true;
Buffer = new String[0];
java.util.Arrays.fill(Buffer,"");
StartIndex = 0;
Length = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraphstyle{
public boolean IsInitialized;
public String HorizontalAlignment;
public float LineSpacingFactor;
public int MaxWidth;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect Padding;
public boolean WordWrap;
public boolean ResizeHeightAutomatically;
public boolean RTL;
public void Initialize() {
IsInitialized = true;
HorizontalAlignment = "";
LineSpacingFactor = 0f;
MaxWidth = 0;
Padding = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
WordWrap = false;
ResizeHeightAutomatically = false;
RTL = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextrun{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public int TextColor;
public String Text;
public com.detektor.kateenapp.bctextengine._bctextchars TextChars;
public float CharacterSpacingFactor;
public int VerticalOffset;
public boolean Underline;
public boolean AutoUnderline;
public int BackgroundColor;
public int IndentLevel;
public anywheresoftware.b4a.objects.B4XViewWrapper View;
public String HorizontalAlignment;
public Object Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public int TextDirection;
public void Initialize() {
IsInitialized = true;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Text = "";
TextChars = new com.detektor.kateenapp.bctextengine._bctextchars();
CharacterSpacingFactor = 0f;
VerticalOffset = 0;
Underline = false;
AutoUnderline = false;
BackgroundColor = 0;
IndentLevel = 0;
View = new anywheresoftware.b4a.objects.B4XViewWrapper();
HorizontalAlignment = "";
Tag = new Object();
Extra = new anywheresoftware.b4a.objects.collections.Map();
TextDirection = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcconnectedruns{
public boolean IsInitialized;
public int ConnectedWidth;
public anywheresoftware.b4a.objects.collections.List Runs;
public String Alignment;
public void Initialize() {
IsInitialized = true;
ConnectedWidth = 0;
Runs = new anywheresoftware.b4a.objects.collections.List();
Alignment = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcstyledunderline{
public boolean IsInitialized;
public int Clr;
public String Style;
public float Thickness;
public void Initialize() {
IsInitialized = true;
Clr = 0;
Style = "";
Thickness = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcparagraph{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List TextLines;
public com.detektor.kateenapp.bctextengine._bctextline CurrentLine;
public com.detektor.kateenapp.bctextengine._bcparagraphstyle Style;
public boolean TwoLayers;
public int Width;
public int Height;
public anywheresoftware.b4a.objects.collections.List Views;
public anywheresoftware.b4a.objects.collections.Map Anchors;
public void Initialize() {
IsInitialized = true;
TextLines = new anywheresoftware.b4a.objects.collections.List();
CurrentLine = new com.detektor.kateenapp.bctextengine._bctextline();
Style = new com.detektor.kateenapp.bctextengine._bcparagraphstyle();
TwoLayers = false;
Width = 0;
Height = 0;
Views = new anywheresoftware.b4a.objects.collections.List();
Anchors = new anywheresoftware.b4a.objects.collections.Map();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bctextline{
public boolean IsInitialized;
public int StartX;
public int BaselineY;
public int Height;
public anywheresoftware.b4a.objects.collections.List Unbreakables;
public int Width;
public boolean EndsWithSoftLineBreak;
public int MaxHeightAboveBaseLine;
public com.detektor.kateenapp.bctextengine._bcparagraph ParentParagraph;
public int MaxHeightBelowBaseLine;
public void Initialize() {
IsInitialized = true;
StartX = 0;
BaselineY = 0;
Height = 0;
Unbreakables = new anywheresoftware.b4a.objects.collections.List();
Width = 0;
EndsWithSoftLineBreak = false;
MaxHeightAboveBaseLine = 0;
ParentParagraph = new com.detektor.kateenapp.bctextengine._bcparagraph();
MaxHeightBelowBaseLine = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcunbreakabletext{
public boolean IsInitialized;
public int Width;
public int StartX;
public com.detektor.kateenapp.bctextengine._bctextchars NotFullTextChars;
public boolean IsMergable;
public anywheresoftware.b4a.objects.collections.List SingleStyleSections;
public com.detektor.kateenapp.bctextengine._bctextline ParentLine;
public boolean RTL;
public String Anchor;
public void Initialize() {
IsInitialized = true;
Width = 0;
StartX = 0;
NotFullTextChars = new com.detektor.kateenapp.bctextengine._bctextchars();
IsMergable = false;
SingleStyleSections = new anywheresoftware.b4a.objects.collections.List();
ParentLine = new com.detektor.kateenapp.bctextengine._bctextline();
RTL = false;
Anchor = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcsinglestylesection{
public boolean IsInitialized;
public int AbsoluteStartX;
public anywheresoftware.b4a.objects.collections.List GlyphsAndOffsets;
public com.detektor.kateenapp.bctextengine._bctextrun Run;
public int Width;
public int MaxHeightBelowBaseLine;
public int MaxHeightAboveBaseLine;
public com.detektor.kateenapp.bctextengine._bcunbreakabletext ParentUN;
public com.detektor.kateenapp.bctextengine._bcfontmetrics fm;
public void Initialize() {
IsInitialized = true;
AbsoluteStartX = 0;
GlyphsAndOffsets = new anywheresoftware.b4a.objects.collections.List();
Run = new com.detektor.kateenapp.bctextengine._bctextrun();
Width = 0;
MaxHeightBelowBaseLine = 0;
MaxHeightAboveBaseLine = 0;
ParentUN = new com.detektor.kateenapp.bctextengine._bcunbreakabletext();
fm = new com.detektor.kateenapp.bctextengine._bcfontmetrics();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyphandoffset{
public boolean IsInitialized;
public com.detektor.kateenapp.bctextengine._bcglyph Glyph;
public int SpaceBetweenThisAndNext;
public void Initialize() {
IsInitialized = true;
Glyph = new com.detektor.kateenapp.bctextengine._bcglyph();
SpaceBetweenThisAndNext = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bcglyph{
public boolean IsInitialized;
public b4a.example.bitmapcreator._compressedbc cbc;
public int baseline;
public int Width;
public boolean Emoji;
public boolean Empty;
public void Initialize() {
IsInitialized = true;
cbc = new b4a.example.bitmapcreator._compressedbc();
baseline = 0;
Width = 0;
Emoji = false;
Empty = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public String _extra_connectedruns = "";
public String _extra_styledunderline = "";
public b4a.example.bitmapcreator _charbc = null;
public b4a.example.bitmapcreator._internalcompressedbccache _cbccache = null;
public com.detektor.kateenapp.bctextengine._bcstyledunderline _defaultunderlinestyle = null;
public float _mscale = 0f;
public float _mspacebetweencharacters = 0f;
public int _mspacebetweenlines = 0;
public anywheresoftware.b4a.objects.collections.Map _fontmetricscache = null;
public b4a.example.bitmapcreator _foregroundbc = null;
public b4a.example.bitmapcreator _backgroundbc = null;
public int _defaultcolor = 0;
public String _wordboundaries = "";
public String _wordboundariesthatcanconnecttoprevword = "";
public anywheresoftware.b4a.objects.collections.Map _brushes = null;
public com.detektor.kateenapp.bctextengine._bcparagraphstyle _defaultstyle = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _defaultfont = null;
public int _mmingapbetweenlines = 0;
public anywheresoftware.b4a.objects.PanelWrapper _stubforcontext = null;
public int _tabwidthmeasuredinx = 0;
public com.detektor.kateenapp.bbcodeparser _tagparser = null;
public com.detektor.kateenapp.bctextengine._bctextchars _emptytextchars = null;
public com.detektor.kateenapp.b4xset _emojis = null;
public String _charset = "";
public boolean _lookforcomplexcharacters = false;
public anywheresoftware.b4a.objects.collections.Map _customfonts = null;
public boolean _kerningenabled = false;
public int _indentwidth = 0;
public com.detektor.kateenapp.b4xset _vowelscodepoints = null;
public com.detektor.kateenapp.b4xorderedmap _asyncbcs = null;
public b4a.example.bitmapcreator _asyncbc = null;
public anywheresoftware.b4a.objects.collections.List _asynctasks = null;
public boolean _asyncmode = false;
public com.detektor.kateenapp.b4xset _rtlchars = null;
public int _textdirectionltr = 0;
public int _textdirectionunknown = 0;
public int _textdirectionrtl = 0;
public anywheresoftware.b4a.objects.collections.Map _arabicmap = null;
public com.detektor.kateenapp.b4xset _arabicnonlinkedletters = null;
public com.detektor.kateenapp.b4xset _arabiccharsconnectedprev = null;
public b4a.example.bitmapcreator._premultipliedcolor _pmdefaultcolor = null;
public boolean _rtlaware = false;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(com.detektor.kateenapp.bctextengine __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_parent}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
byte[] _b = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="CustomFonts.Initialize";
__ref._customfonts /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="VowelsCodePoints.Initialize";
__ref._vowelscodepoints /*com.detektor.kateenapp.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="EmptyTextChars = CreateBCTextCharsFromString(\"\")";
__ref._emptytextchars /*com.detektor.kateenapp.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*com.detektor.kateenapp.bctextengine._bctextchars*/ (null,"");
RDebugUtils.currentLine=49283076;
 //BA.debugLineNum = 49283076;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=49283077;
 //BA.debugLineNum = 49283077;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=49283090;
 //BA.debugLineNum = 49283090;BA.debugLine="setSpaceBetweenCharacters(100dip / 100)";
__ref._setspacebetweencharacters /*String*/ (null,(float) (__c.DipToCurrent((int) (100))/(double)100));
RDebugUtils.currentLine=49283091;
 //BA.debugLineNum = 49283091;BA.debugLine="setSpaceBetweenLines(20dip)";
__ref._setspacebetweenlines /*String*/ (null,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=49283092;
 //BA.debugLineNum = 49283092;BA.debugLine="cvs.Initialize(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_p);
RDebugUtils.currentLine=49283093;
 //BA.debugLineNum = 49283093;BA.debugLine="ResizeCharBC(50dip * mScale, 50dip * mScale)";
__ref._resizecharbc /*String*/ (null,(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ),(int) (__c.DipToCurrent((int) (50))*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=49283094;
 //BA.debugLineNum = 49283094;BA.debugLine="Brushes.Initialize";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49283095;
 //BA.debugLineNum = 49283095;BA.debugLine="ResizeLayers(200dip, 100dip)";
__ref._resizelayers /*String*/ (null,__c.DipToCurrent((int) (200)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=49283096;
 //BA.debugLineNum = 49283096;BA.debugLine="cbccache.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .Initialize();
RDebugUtils.currentLine=49283097;
 //BA.debugLineNum = 49283097;BA.debugLine="cbccache.ColorsMap.Initialize";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .ColorsMap.Initialize();
RDebugUtils.currentLine=49283098;
 //BA.debugLineNum = 49283098;BA.debugLine="FontMetricsCache.Initialize";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49283099;
 //BA.debugLineNum = 49283099;BA.debugLine="Dim b(CharBC.SAME_COLOR_LENGTH_FOR_CACHE * 4 * Ch";
_b = new byte[(int) (__ref._charbc /*b4a.example.bitmapcreator*/ ._same_color_length_for_cache*4*__ref._charbc /*b4a.example.bitmapcreator*/ ._max_same_color_size+4)];
;
RDebugUtils.currentLine=49283100;
 //BA.debugLineNum = 49283100;BA.debugLine="cbccache.mBuffer = b";
__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ .mBuffer = _b;
RDebugUtils.currentLine=49283101;
 //BA.debugLineNum = 49283101;BA.debugLine="DefaultFont = xui.CreateDefaultFont(16)";
__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (16));
RDebugUtils.currentLine=49283102;
 //BA.debugLineNum = 49283102;BA.debugLine="DefaultStyle = CreateStyle";
__ref._defaultstyle /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/  = __ref._createstyle /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ (null);
RDebugUtils.currentLine=49283103;
 //BA.debugLineNum = 49283103;BA.debugLine="TagParser.Initialize (Me)";
__ref._tagparser /*com.detektor.kateenapp.bbcodeparser*/ ._initialize /*String*/ (null,ba,(com.detektor.kateenapp.bctextengine)(this));
RDebugUtils.currentLine=49283104;
 //BA.debugLineNum = 49283104;BA.debugLine="DefaultUnderlineStyle.Initialize";
__ref._defaultunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ .Initialize();
RDebugUtils.currentLine=49283105;
 //BA.debugLineNum = 49283105;BA.debugLine="DefaultUnderlineStyle.Clr = 0";
__ref._defaultunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ .Clr /*int*/  = (int) (0);
RDebugUtils.currentLine=49283106;
 //BA.debugLineNum = 49283106;BA.debugLine="DefaultUnderlineStyle.Style = \"line\"";
__ref._defaultunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ .Style /*String*/  = "line";
RDebugUtils.currentLine=49283107;
 //BA.debugLineNum = 49283107;BA.debugLine="DefaultUnderlineStyle.Thickness = 1dip";
__ref._defaultunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ .Thickness /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=49283108;
 //BA.debugLineNum = 49283108;BA.debugLine="For Each v As B4XView In Parent.GetAllViewsRecurs";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group24 = _parent.GetAllViewsRecursive();
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group24.Get(index24)));
RDebugUtils.currentLine=49283109;
 //BA.debugLineNum = 49283109;BA.debugLine="If v.Tag Is BBCodeView Or v.Tag Is BBLabel Then";
if (_v.getTag() instanceof com.detektor.kateenapp.bbcodeview || _v.getTag() instanceof com.detektor.kateenapp.bblabel) { 
RDebugUtils.currentLine=49283110;
 //BA.debugLineNum = 49283110;BA.debugLine="CallSub2(v.Tag, \"setTextEngine\", Me)";
__c.CallSubDebug2(ba,_v.getTag(),"setTextEngine",this);
 };
 }
};
RDebugUtils.currentLine=49283114;
 //BA.debugLineNum = 49283114;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bctextchars  _createbctextcharsfromstring(com.detektor.kateenapp.bctextengine __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextcharsfromstring", true))
	 {return ((com.detektor.kateenapp.bctextengine._bctextchars) Debug.delegate(ba, "createbctextcharsfromstring", new Object[] {_s}));}
byte[] _b = null;
String[] _chars = null;
int _i = 0;
int _bi = 0;
boolean _shouldaddtoprevchar = false;
boolean _therearevowels = false;
int _cp = 0;
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Public Sub CreateBCTextCharsFromString (s As Strin";
RDebugUtils.currentLine=52822017;
 //BA.debugLineNum = 52822017;BA.debugLine="If RTLAware Then LoadArabicData";
if (__ref._rtlaware /*boolean*/ ) { 
__ref._loadarabicdata /*String*/ (null);};
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="Dim b() As Byte = s.GetBytes(Charset)";
_b = _s.getBytes(__ref._charset /*String*/ );
RDebugUtils.currentLine=52822019;
 //BA.debugLineNum = 52822019;BA.debugLine="Dim chars(b.Length / 4) As String";
_chars = new String[(int) (_b.length/(double)4)];
java.util.Arrays.fill(_chars,"");
RDebugUtils.currentLine=52822020;
 //BA.debugLineNum = 52822020;BA.debugLine="Dim i, bi As Int = 0";
_i = 0;
_bi = (int) (0);
RDebugUtils.currentLine=52822021;
 //BA.debugLineNum = 52822021;BA.debugLine="Dim ShouldAddToPrevChar As Boolean";
_shouldaddtoprevchar = false;
RDebugUtils.currentLine=52822022;
 //BA.debugLineNum = 52822022;BA.debugLine="Dim ThereAreVowels As Boolean = VowelsCodePoints.";
_therearevowels = __ref._vowelscodepoints /*com.detektor.kateenapp.b4xset*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=52822023;
 //BA.debugLineNum = 52822023;BA.debugLine="Do While bi <= chars.Length - 1";
while (_bi<=_chars.length-1) {
RDebugUtils.currentLine=52822024;
 //BA.debugLineNum = 52822024;BA.debugLine="chars(i) = BytesToString(b, bi * 4, 4, Charset)";
_chars[_i] = __c.BytesToString(_b,(int) (_bi*4),(int) (4),__ref._charset /*String*/ );
RDebugUtils.currentLine=52822025;
 //BA.debugLineNum = 52822025;BA.debugLine="If LookForComplexCharacters Then";
if (__ref._lookforcomplexcharacters /*boolean*/ ) { 
RDebugUtils.currentLine=52822026;
 //BA.debugLineNum = 52822026;BA.debugLine="Dim cp As Int = BytesToInt(b, bi * 4)";
_cp = __ref._bytestoint /*int*/ (null,_b,(int) (_bi*4));
RDebugUtils.currentLine=52822027;
 //BA.debugLineNum = 52822027;BA.debugLine="If i > 0 And (cp = 0x200d Or (cp >= 0xFE00 And";
if (_i>0 && (_cp==((int)0x200d) || (_cp>=((int)0xfe00) && _cp<=((int)0xfe0f)))) { 
RDebugUtils.currentLine=52822028;
 //BA.debugLineNum = 52822028;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=52822029;
 //BA.debugLineNum = 52822029;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=52822030;
 //BA.debugLineNum = 52822030;BA.debugLine="ShouldAddToPrevChar = True";
_shouldaddtoprevchar = __c.True;
 }else 
{RDebugUtils.currentLine=52822031;
 //BA.debugLineNum = 52822031;BA.debugLine="Else If i > 0 And (cp >= 0x1F3FB And cp <= 0x1F";
if (_i>0 && (_cp>=((int)0x1f3fb) && _cp<=((int)0x1f3ff))) { 
RDebugUtils.currentLine=52822032;
 //BA.debugLineNum = 52822032;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=52822033;
 //BA.debugLineNum = 52822033;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=52822034;
 //BA.debugLineNum = 52822034;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=52822035;
 //BA.debugLineNum = 52822035;BA.debugLine="Else If i > 0 And (ThereAreVowels And VowelsCod";
if (_i>0 && (_therearevowels && __ref._vowelscodepoints /*com.detektor.kateenapp.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp)))) { 
RDebugUtils.currentLine=52822036;
 //BA.debugLineNum = 52822036;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=52822037;
 //BA.debugLineNum = 52822037;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=52822038;
 //BA.debugLineNum = 52822038;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=52822039;
 //BA.debugLineNum = 52822039;BA.debugLine="Else If RTLAware And i > 0 And chars(i - 1) = \"";
if (__ref._rtlaware /*boolean*/  && _i>0 && (_chars[(int) (_i-1)]).equals("ل") && (_cp==((int)0x622) || _cp==((int)0x623) || _cp==((int)0x625) || _cp==((int)0x627))) { 
RDebugUtils.currentLine=52822040;
 //BA.debugLineNum = 52822040;BA.debugLine="Select cp";
switch (_cp) {
case 0x622: {
RDebugUtils.currentLine=52822042;
 //BA.debugLineNum = 52822042;BA.debugLine="chars(i - 1) = Chr(0xFEF5)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef5)));
 break; }
case 0x623: {
RDebugUtils.currentLine=52822044;
 //BA.debugLineNum = 52822044;BA.debugLine="chars(i - 1) = Chr(0xFEF7)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef7)));
 break; }
case 0x625: {
RDebugUtils.currentLine=52822046;
 //BA.debugLineNum = 52822046;BA.debugLine="chars(i - 1) = Chr(0xFEF9)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfef9)));
 break; }
case 0x627: {
RDebugUtils.currentLine=52822048;
 //BA.debugLineNum = 52822048;BA.debugLine="chars(i - 1) = Chr(0xFEFB)";
_chars[(int) (_i-1)] = BA.ObjectToString(__c.Chr(((int)0xfefb)));
 break; }
}
;
RDebugUtils.currentLine=52822050;
 //BA.debugLineNum = 52822050;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=52822051;
 //BA.debugLineNum = 52822051;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else 
{RDebugUtils.currentLine=52822052;
 //BA.debugLineNum = 52822052;BA.debugLine="Else If i > 0 And ShouldAddToPrevChar Then";
if (_i>0 && _shouldaddtoprevchar) { 
RDebugUtils.currentLine=52822053;
 //BA.debugLineNum = 52822053;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
_chars[(int) (_i-1)] = _chars[(int) (_i-1)]+_chars[_i];
RDebugUtils.currentLine=52822054;
 //BA.debugLineNum = 52822054;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
RDebugUtils.currentLine=52822055;
 //BA.debugLineNum = 52822055;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }else {
RDebugUtils.currentLine=52822057;
 //BA.debugLineNum = 52822057;BA.debugLine="ShouldAddToPrevChar = False";
_shouldaddtoprevchar = __c.False;
 }}}}}
;
 };
RDebugUtils.currentLine=52822060;
 //BA.debugLineNum = 52822060;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
RDebugUtils.currentLine=52822061;
 //BA.debugLineNum = 52822061;BA.debugLine="bi = bi + 1";
_bi = (int) (_bi+1);
 }
;
RDebugUtils.currentLine=52822063;
 //BA.debugLineNum = 52822063;BA.debugLine="If RTLAware Then";
if (__ref._rtlaware /*boolean*/ ) { 
RDebugUtils.currentLine=52822064;
 //BA.debugLineNum = 52822064;BA.debugLine="PreprocessArabic(chars, i)";
__ref._preprocessarabic /*String*/ (null,_chars,_i);
 };
RDebugUtils.currentLine=52822066;
 //BA.debugLineNum = 52822066;BA.debugLine="Return CreateBCTextChars(chars, 0, i)";
if (true) return __ref._createbctextchars /*com.detektor.kateenapp.bctextengine._bctextchars*/ (null,_chars,(int) (0),_i);
RDebugUtils.currentLine=52822067;
 //BA.debugLineNum = 52822067;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bctextrun  _createconnectedparent(com.detektor.kateenapp.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createconnectedparent", true))
	 {return ((com.detektor.kateenapp.bctextengine._bctextrun) Debug.delegate(ba, "createconnectedparent", null));}
com.detektor.kateenapp.bctextengine._bcconnectedruns _connected = null;
com.detektor.kateenapp.bctextengine._bctextrun _parent = null;
RDebugUtils.currentLine=49545216;
 //BA.debugLineNum = 49545216;BA.debugLine="Public Sub CreateConnectedParent As BCTextRun";
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="Dim connected As BCConnectedRuns";
_connected = new com.detektor.kateenapp.bctextengine._bcconnectedruns();
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="connected.Initialize";
_connected.Initialize();
RDebugUtils.currentLine=49545219;
 //BA.debugLineNum = 49545219;BA.debugLine="connected.Runs.Initialize";
_connected.Runs /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=49545220;
 //BA.debugLineNum = 49545220;BA.debugLine="Dim parent As BCTextRun = CreateRun(\"\")";
_parent = __ref._createrun /*com.detektor.kateenapp.bctextengine._bctextrun*/ (null,"");
RDebugUtils.currentLine=49545221;
 //BA.debugLineNum = 49545221;BA.debugLine="parent.Extra.Initialize";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49545222;
 //BA.debugLineNum = 49545222;BA.debugLine="parent.Extra.Put(EXTRA_CONNECTEDRUNS, connected)";
_parent.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._extra_connectedruns /*String*/ ),(Object)(_connected));
RDebugUtils.currentLine=49545223;
 //BA.debugLineNum = 49545223;BA.debugLine="Return parent";
if (true) return _parent;
RDebugUtils.currentLine=49545224;
 //BA.debugLineNum = 49545224;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bcfontmetrics  _getfontmetrics(com.detektor.kateenapp.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfontmetrics", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcfontmetrics) Debug.delegate(ba, "getfontmetrics", new Object[] {_fnt,_clr}));}
String _key = "";
com.detektor.kateenapp.bctextengine._bcfontmetrics _fm = null;
RDebugUtils.currentLine=51904512;
 //BA.debugLineNum = 51904512;BA.debugLine="Public Sub GetFontMetrics(Fnt As B4XFont, clr As I";
RDebugUtils.currentLine=51904513;
 //BA.debugLineNum = 51904513;BA.debugLine="Dim key As String = FontToKey(Fnt, clr)";
_key = __ref._fonttokey /*String*/ (null,_fnt,_clr);
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="If FontMetricsCache.ContainsKey(key) Then Return";
if (__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_key))) { 
if (true) return (com.detektor.kateenapp.bctextengine._bcfontmetrics)(__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));};
RDebugUtils.currentLine=51904515;
 //BA.debugLineNum = 51904515;BA.debugLine="Dim fm As BCFontMetrics";
_fm = new com.detektor.kateenapp.bctextengine._bcfontmetrics();
RDebugUtils.currentLine=51904516;
 //BA.debugLineNum = 51904516;BA.debugLine="fm.Initialize";
_fm.Initialize();
RDebugUtils.currentLine=51904517;
 //BA.debugLineNum = 51904517;BA.debugLine="fm.Glyphs.Initialize";
_fm.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51904518;
 //BA.debugLineNum = 51904518;BA.debugLine="fm.Clr = clr";
_fm.Clr /*int*/  = _clr;
RDebugUtils.currentLine=51904519;
 //BA.debugLineNum = 51904519;BA.debugLine="fm.Fnt = Fnt";
_fm.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _fnt;
RDebugUtils.currentLine=51904520;
 //BA.debugLineNum = 51904520;BA.debugLine="If clr = DefaultColor Then";
if (_clr==__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=51904521;
 //BA.debugLineNum = 51904521;BA.debugLine="fm.KerningTable.Initialize";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=51904522;
 //BA.debugLineNum = 51904522;BA.debugLine="fm.DefaultColorMetrics = fm";
_fm.DefaultColorMetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/  = _fm;
RDebugUtils.currentLine=51904523;
 //BA.debugLineNum = 51904523;BA.debugLine="fm.xWidth = CreateGlyph(\"x\", fm, False).Width";
_fm.xWidth /*int*/  = __ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,"x",_fm,__c.False).Width /*int*/ ;
 }else {
RDebugUtils.currentLine=51904525;
 //BA.debugLineNum = 51904525;BA.debugLine="fm.DefaultColorMetrics = GetFontMetrics(Fnt, Def";
_fm.DefaultColorMetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/  = __ref._getfontmetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/ (null,_fnt,__ref._defaultcolor /*int*/ );
RDebugUtils.currentLine=51904526;
 //BA.debugLineNum = 51904526;BA.debugLine="fm.xWidth = fm.DefaultColorMetrics.xWidth";
_fm.xWidth /*int*/  = _fm.DefaultColorMetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/ .xWidth /*int*/ ;
RDebugUtils.currentLine=51904527;
 //BA.debugLineNum = 51904527;BA.debugLine="fm.KerningTable = fm.DefaultColorMetrics.Kerning";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/  = _fm.DefaultColorMetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/ .KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ ;
 };
RDebugUtils.currentLine=51904529;
 //BA.debugLineNum = 51904529;BA.debugLine="FontMetricsCache.Put(key, fm)";
__ref._fontmetricscache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_fm));
RDebugUtils.currentLine=51904530;
 //BA.debugLineNum = 51904530;BA.debugLine="Return fm";
if (true) return _fm;
RDebugUtils.currentLine=51904531;
 //BA.debugLineNum = 51904531;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bctextrun  _createrun(com.detektor.kateenapp.bctextengine __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createrun", true))
	 {return ((com.detektor.kateenapp.bctextengine._bctextrun) Debug.delegate(ba, "createrun", new Object[] {_text}));}
com.detektor.kateenapp.bctextengine._bctextrun _r = null;
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Public Sub CreateRun (Text As String) As BCTextRun";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="Dim r As BCTextRun";
_r = new com.detektor.kateenapp.bctextengine._bctextrun();
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="r.Initialize";
_r.Initialize();
RDebugUtils.currentLine=49479683;
 //BA.debugLineNum = 49479683;BA.debugLine="r.BackgroundColor = 0";
_r.BackgroundColor /*int*/  = (int) (0);
RDebugUtils.currentLine=49479684;
 //BA.debugLineNum = 49479684;BA.debugLine="r.CharacterSpacingFactor = 1";
_r.CharacterSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=49479685;
 //BA.debugLineNum = 49479685;BA.debugLine="r.TextFont = DefaultFont";
_r.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=49479686;
 //BA.debugLineNum = 49479686;BA.debugLine="r.TextChars = CreateBCTextCharsFromString(Text)";
_r.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/  = __ref._createbctextcharsfromstring /*com.detektor.kateenapp.bctextengine._bctextchars*/ (null,_text);
RDebugUtils.currentLine=49479687;
 //BA.debugLineNum = 49479687;BA.debugLine="r.Text = Text";
_r.Text /*String*/  = _text;
RDebugUtils.currentLine=49479688;
 //BA.debugLineNum = 49479688;BA.debugLine="r.TextColor = DefaultColor";
_r.TextColor /*int*/  = __ref._defaultcolor /*int*/ ;
RDebugUtils.currentLine=49479689;
 //BA.debugLineNum = 49479689;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=49479690;
 //BA.debugLineNum = 49479690;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bctextchars  _createbctextchars(com.detektor.kateenapp.bctextengine __ref,String[] _buffer,int _startindex,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createbctextchars", true))
	 {return ((com.detektor.kateenapp.bctextengine._bctextchars) Debug.delegate(ba, "createbctextchars", new Object[] {_buffer,_startindex,_length}));}
com.detektor.kateenapp.bctextengine._bctextchars _t1 = null;
RDebugUtils.currentLine=52887552;
 //BA.debugLineNum = 52887552;BA.debugLine="Public Sub CreateBCTextChars (Buffer() As String,";
RDebugUtils.currentLine=52887553;
 //BA.debugLineNum = 52887553;BA.debugLine="Dim t1 As BCTextChars";
_t1 = new com.detektor.kateenapp.bctextengine._bctextchars();
RDebugUtils.currentLine=52887554;
 //BA.debugLineNum = 52887554;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=52887555;
 //BA.debugLineNum = 52887555;BA.debugLine="t1.Buffer = Buffer";
_t1.Buffer /*String[]*/  = _buffer;
RDebugUtils.currentLine=52887556;
 //BA.debugLineNum = 52887556;BA.debugLine="t1.StartIndex = StartIndex";
_t1.StartIndex /*int*/  = _startindex;
RDebugUtils.currentLine=52887557;
 //BA.debugLineNum = 52887557;BA.debugLine="t1.Length = Length";
_t1.Length /*int*/  = _length;
RDebugUtils.currentLine=52887558;
 //BA.debugLineNum = 52887558;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=52887559;
 //BA.debugLineNum = 52887559;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bcsinglestylesection  _findsinglestylesection(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _paragraph,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findsinglestylesection", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcsinglestylesection) Debug.delegate(ba, "findsinglestylesection", new Object[] {_paragraph,_x,_y}));}
com.detektor.kateenapp.bctextengine._bctextline _line = null;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _s = null;
RDebugUtils.currentLine=51707904;
 //BA.debugLineNum = 51707904;BA.debugLine="Public Sub FindSingleStyleSection (Paragraph As BC";
RDebugUtils.currentLine=51707905;
 //BA.debugLineNum = 51707905;BA.debugLine="x = x * mScale";
_x = (int) (_x*__ref._mscale /*float*/ );
RDebugUtils.currentLine=51707906;
 //BA.debugLineNum = 51707906;BA.debugLine="y = y * mScale";
_y = (int) (_y*__ref._mscale /*float*/ );
RDebugUtils.currentLine=51707907;
 //BA.debugLineNum = 51707907;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group3 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=51707909;
 //BA.debugLineNum = 51707909;BA.debugLine="If line.BaseLineY - line.MaxHeightAboveBaseLine";
if (_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y) { 
RDebugUtils.currentLine=51707910;
 //BA.debugLineNum = 51707910;BA.debugLine="For Each un As BCUnbreakableText In line.Unbrea";
{
final anywheresoftware.b4a.BA.IterableList group5 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group5.Get(index5));
RDebugUtils.currentLine=51707911;
 //BA.debugLineNum = 51707911;BA.debugLine="If (Paragraph.Style.RTL = False And line.Start";
if ((_paragraph.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ==__c.False && _line.StartX /*int*/ +_un.StartX /*int*/ <=_x && _line.StartX /*int*/ +_un.StartX /*int*/ +_un.Width /*int*/ >=_x) || (_paragraph.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/  && _line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ <=_y && _line.BaselineY /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ >=_y)) { 
RDebugUtils.currentLine=51707913;
 //BA.debugLineNum = 51707913;BA.debugLine="For Each s As BCSingleStyleSection In un.Sing";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_s = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=51707914;
 //BA.debugLineNum = 51707914;BA.debugLine="If s.AbsoluteStartX <= x And s.AbsoluteStart";
if (_s.AbsoluteStartX /*int*/ <=_x && _s.AbsoluteStartX /*int*/ +_s.Width /*int*/ >=_x) { 
if (true) return _s;};
 }
};
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=51707920;
 //BA.debugLineNum = 51707920;BA.debugLine="Return Null";
if (true) return (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(__c.Null);
RDebugUtils.currentLine=51707921;
 //BA.debugLineNum = 51707921;BA.debugLine="End Sub";
return null;
}
public String  _drawsingleline(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,com.detektor.kateenapp.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsingleline", true))
	 {return ((String) Debug.delegate(ba, "drawsingleline", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=51052544;
 //BA.debugLineNum = 51052544;BA.debugLine="Public Sub DrawSingleLine (line As BCTextLine, iv";
RDebugUtils.currentLine=51052545;
 //BA.debugLineNum = 51052545;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=51052546;
 //BA.debugLineNum = 51052546;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=51052547;
 //BA.debugLineNum = 51052547;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(xui.Color_Tra";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
RDebugUtils.currentLine=51052548;
 //BA.debugLineNum = 51052548;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=51052549;
 //BA.debugLineNum = 51052549;BA.debugLine="ForegroundBC.SetBitmapToImageView(ForegroundBC.B";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._getbitmap().Crop((int) (0),(int) (0),(int) (_r.getWidth()),(int) (_r.getHeight())),_iv);
 };
RDebugUtils.currentLine=51052551;
 //BA.debugLineNum = 51052551;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bcparagraphstyle  _createstyle(com.detektor.kateenapp.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createstyle", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcparagraphstyle) Debug.delegate(ba, "createstyle", null));}
com.detektor.kateenapp.bctextengine._bcparagraphstyle _s = null;
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Public Sub CreateStyle As BCParagraphStyle";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="Dim s As BCParagraphStyle";
_s = new com.detektor.kateenapp.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="s.Initialize";
_s.Initialize();
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="s.LineSpacingFactor = 1";
_s.LineSpacingFactor /*float*/  = (float) (1);
RDebugUtils.currentLine=49414148;
 //BA.debugLineNum = 49414148;BA.debugLine="s.HorizontalAlignment = \"Left\"";
_s.HorizontalAlignment /*String*/  = "Left";
RDebugUtils.currentLine=49414149;
 //BA.debugLineNum = 49414149;BA.debugLine="s.MaxWidth = 300dip";
_s.MaxWidth /*int*/  = __c.DipToCurrent((int) (300));
RDebugUtils.currentLine=49414150;
 //BA.debugLineNum = 49414150;BA.debugLine="s.Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
_s.Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=49414151;
 //BA.debugLineNum = 49414151;BA.debugLine="s.WordWrap = True";
_s.WordWrap /*boolean*/  = __c.True;
RDebugUtils.currentLine=49414152;
 //BA.debugLineNum = 49414152;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=49414153;
 //BA.debugLineNum = 49414153;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bcparagraph  _prepareforlazydrawing(com.detektor.kateenapp.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,com.detektor.kateenapp.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepareforlazydrawing", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcparagraph) Debug.delegate(ba, "prepareforlazydrawing", new Object[] {_runs,_style,_sv}));}
com.detektor.kateenapp.bctextengine._bcparagraph _par = null;
int _maxheight = 0;
com.detektor.kateenapp.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=49676288;
 //BA.debugLineNum = 49676288;BA.debugLine="Public Sub PrepareForLazyDrawing (Runs As List, St";
RDebugUtils.currentLine=49676289;
 //BA.debugLineNum = 49676289;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*com.detektor.kateenapp.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=49676290;
 //BA.debugLineNum = 49676290;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2dip";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()+_par.Height /*int*/ /(double)__ref._mscale /*float*/ )));
RDebugUtils.currentLine=49676291;
 //BA.debugLineNum = 49676291;BA.debugLine="Dim MaxHeight As Int";
_maxheight = 0;
RDebugUtils.currentLine=49676292;
 //BA.debugLineNum = 49676292;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=49676293;
 //BA.debugLineNum = 49676293;BA.debugLine="MaxHeight = Max(MaxHeight, line.MaxHeightAboveBa";
_maxheight = (int) (__c.Max(_maxheight,_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
RDebugUtils.currentLine=49676295;
 //BA.debugLineNum = 49676295;BA.debugLine="ResizeLayers(par.Width / mScale, MaxHeight / mSca";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_maxheight/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=49676296;
 //BA.debugLineNum = 49676296;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=49676297;
 //BA.debugLineNum = 49676297;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=49676298;
 //BA.debugLineNum = 49676298;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bcparagraph  _drawtext(com.detektor.kateenapp.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,com.detektor.kateenapp.bctextengine._bcparagraphstyle _style,anywheresoftware.b4a.objects.B4XViewWrapper _foregroundimageview,anywheresoftware.b4a.objects.B4XViewWrapper _sv) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawtext", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcparagraph) Debug.delegate(ba, "drawtext", new Object[] {_runs,_style,_foregroundimageview,_sv}));}
com.detektor.kateenapp.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=49741824;
 //BA.debugLineNum = 49741824;BA.debugLine="Public Sub DrawText (Runs As List, Style As BCPara";
RDebugUtils.currentLine=49741826;
 //BA.debugLineNum = 49741826;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
_par = __ref._prepare /*com.detektor.kateenapp.bctextengine._bcparagraph*/ (null,_runs,_style);
RDebugUtils.currentLine=49741828;
 //BA.debugLineNum = 49741828;BA.debugLine="ResizeLayers(par.Width / mScale, par.Height / mSc";
__ref._resizelayers /*String*/ (null,(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),(int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=49741829;
 //BA.debugLineNum = 49741829;BA.debugLine="DrawParagraph(par)";
__ref._drawparagraph /*String*/ (null,_par);
RDebugUtils.currentLine=49741830;
 //BA.debugLineNum = 49741830;BA.debugLine="If par.Width > 0 And par.Height > 0 Then";
if (_par.Width /*int*/ >0 && _par.Height /*int*/ >0) { 
RDebugUtils.currentLine=49741831;
 //BA.debugLineNum = 49741831;BA.debugLine="ResizeImageView(ForegroundBC, par, ForegroundIma";
__ref._resizeimageview /*String*/ (null,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ,_par,_foregroundimageview,_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/ );
 };
RDebugUtils.currentLine=49741833;
 //BA.debugLineNum = 49741833;BA.debugLine="If par.Style.ResizeHeightAutomatically And sv.IsI";
if (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .ResizeHeightAutomatically /*boolean*/  && _sv.IsInitialized()) { 
RDebugUtils.currentLine=49741834;
 //BA.debugLineNum = 49741834;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2di";
_sv.setScrollViewContentHeight((int) (__c.Max(_sv.getHeight()-__c.DipToCurrent((int) (2)),_foregroundimageview.getHeight()+_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom())));
 };
RDebugUtils.currentLine=49741836;
 //BA.debugLineNum = 49741836;BA.debugLine="AddParagraphViews(par)";
__ref._addparagraphviews /*String*/ (null,_par);
RDebugUtils.currentLine=49741837;
 //BA.debugLineNum = 49741837;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=49741838;
 //BA.debugLineNum = 49741838;BA.debugLine="End Sub";
return null;
}
public String  _addltritems(com.detektor.kateenapp.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _ltrlist,anywheresoftware.b4a.objects.collections.List _newlist) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addltritems", true))
	 {return ((String) Debug.delegate(ba, "addltritems", new Object[] {_ltrlist,_newlist}));}
int _startindex = 0;
int _lastindex = 0;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _lastun = null;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _prev = null;
int _i = 0;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Private Sub AddLTRItems (LTRList As List, NewList";
RDebugUtils.currentLine=50069505;
 //BA.debugLineNum = 50069505;BA.debugLine="If LTRList.Size = 0 Then Return";
if (_ltrlist.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="NewList.AddAll(LTRList)";
_newlist.AddAll(_ltrlist);
RDebugUtils.currentLine=50069507;
 //BA.debugLineNum = 50069507;BA.debugLine="If LTRList.Size > 1 Then";
if (_ltrlist.getSize()>1) { 
RDebugUtils.currentLine=50069508;
 //BA.debugLineNum = 50069508;BA.debugLine="Dim StartIndex As Int = 1";
_startindex = (int) (1);
RDebugUtils.currentLine=50069509;
 //BA.debugLineNum = 50069509;BA.debugLine="If IsUNSeparator(LTRList.Get(0)) Then";
if (__ref._isunseparator /*boolean*/ (null,(com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (0))))) { 
RDebugUtils.currentLine=50069510;
 //BA.debugLineNum = 50069510;BA.debugLine="StartIndex = 2";
_startindex = (int) (2);
 };
RDebugUtils.currentLine=50069512;
 //BA.debugLineNum = 50069512;BA.debugLine="Dim LastIndex As Int = LTRList.Size - 1";
_lastindex = (int) (_ltrlist.getSize()-1);
RDebugUtils.currentLine=50069513;
 //BA.debugLineNum = 50069513;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=50069514;
 //BA.debugLineNum = 50069514;BA.debugLine="If IsUNSeparator(LTRList.Get(LastIndex)) Then";
if (__ref._isunseparator /*boolean*/ (null,(com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex)))) { 
RDebugUtils.currentLine=50069515;
 //BA.debugLineNum = 50069515;BA.debugLine="LastIndex = LastIndex - 1";
_lastindex = (int) (_lastindex-1);
 };
 };
RDebugUtils.currentLine=50069518;
 //BA.debugLineNum = 50069518;BA.debugLine="If LastIndex > StartIndex Then";
if (_lastindex>_startindex) { 
RDebugUtils.currentLine=50069519;
 //BA.debugLineNum = 50069519;BA.debugLine="Dim lastun As BCUnbreakableText = LTRList.Get(L";
_lastun = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_ltrlist.Get(_lastindex));
RDebugUtils.currentLine=50069520;
 //BA.debugLineNum = 50069520;BA.debugLine="Dim prev As BCUnbreakableText = LTRList.Get(Sta";
_prev = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_ltrlist.Get((int) (_startindex-1)));
RDebugUtils.currentLine=50069521;
 //BA.debugLineNum = 50069521;BA.debugLine="prev.StartX = lastun.StartX";
_prev.StartX /*int*/  = _lastun.StartX /*int*/ ;
RDebugUtils.currentLine=50069522;
 //BA.debugLineNum = 50069522;BA.debugLine="For i = StartIndex To LastIndex";
{
final int step18 = 1;
final int limit18 = _lastindex;
_i = _startindex ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=50069523;
 //BA.debugLineNum = 50069523;BA.debugLine="Dim un As BCUnbreakableText = LTRList.Get(i)";
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_ltrlist.Get(_i));
RDebugUtils.currentLine=50069524;
 //BA.debugLineNum = 50069524;BA.debugLine="un.StartX = prev.StartX + prev.Width + mSpaceB";
_un.StartX /*int*/  = (int) (_prev.StartX /*int*/ +_prev.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=50069525;
 //BA.debugLineNum = 50069525;BA.debugLine="prev = un";
_prev = _un;
 }
};
 };
 };
RDebugUtils.currentLine=50069529;
 //BA.debugLineNum = 50069529;BA.debugLine="LTRList.Clear";
_ltrlist.Clear();
RDebugUtils.currentLine=50069530;
 //BA.debugLineNum = 50069530;BA.debugLine="End Sub";
return "";
}
public boolean  _isunseparator(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isunseparator", true))
	 {return ((Boolean) Debug.delegate(ba, "isunseparator", new Object[] {_un}));}
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Private Sub IsUNSeparator (un As BCUnbreakableText";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="If un.NotFullTextChars.Length = 0 Then Return Fal";
if (_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
if (true) return __c.False;};
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="Return WordBoundaries.Contains(un.NotFullTextChar";
if (true) return __ref._wordboundaries /*String*/ .contains(_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .StartIndex /*int*/ ]);
RDebugUtils.currentLine=50135043;
 //BA.debugLineNum = 50135043;BA.debugLine="End Sub";
return false;
}
public String  _addparagraphviews(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "addparagraphviews", true))
	 {return ((String) Debug.delegate(ba, "addparagraphviews", new Object[] {_par}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=49807360;
 //BA.debugLineNum = 49807360;BA.debugLine="Public Sub AddParagraphViews (par As BCParagraph)";
RDebugUtils.currentLine=49807361;
 //BA.debugLineNum = 49807361;BA.debugLine="If par.Views.IsInitialized Then";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=49807362;
 //BA.debugLineNum = 49807362;BA.debugLine="For Each v As B4XView In par.Views";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _par.Views /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=49807363;
 //BA.debugLineNum = 49807363;BA.debugLine="v.SetLayoutAnimated(0, par.Style.Padding.Left +";
_v.SetLayoutAnimated((int) (0),(int) (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()+_v.getLeft()),(int) (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+_v.getTop()),_v.getWidth(),_v.getHeight());
 }
};
 };
RDebugUtils.currentLine=49807366;
 //BA.debugLineNum = 49807366;BA.debugLine="End Sub";
return "";
}
public int  _bytestoint(com.detektor.kateenapp.bctextengine __ref,byte[] _bytes,int _startindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "bytestoint", true))
	 {return ((Integer) Debug.delegate(ba, "bytestoint", new Object[] {_bytes,_startindex}));}
int _cp = 0;
int _i = 0;
RDebugUtils.currentLine=52101120;
 //BA.debugLineNum = 52101120;BA.debugLine="Private Sub BytesToInt (Bytes() As Byte, StartInde";
RDebugUtils.currentLine=52101121;
 //BA.debugLineNum = 52101121;BA.debugLine="Dim cp As Int";
_cp = 0;
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="For i = 0 To 3";
{
final int step2 = 1;
final int limit2 = (int) (3);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=52101123;
 //BA.debugLineNum = 52101123;BA.debugLine="cp = Bit.Or(cp, Bit.ShiftLeft(Bit.And(0xff, Byte";
_cp = __c.Bit.Or(_cp,__c.Bit.ShiftLeft(__c.Bit.And(((int)0xff),(int) (_bytes[(int) (_i+_startindex)])),(int) (8*_i)));
 }
};
RDebugUtils.currentLine=52101125;
 //BA.debugLineNum = 52101125;BA.debugLine="Return cp";
if (true) return _cp;
RDebugUtils.currentLine=52101126;
 //BA.debugLineNum = 52101126;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(com.detektor.kateenapp.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="Public cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=49217539;
 //BA.debugLineNum = 49217539;BA.debugLine="Type BCFontMetrics (Glyphs As Map, DefaultColorMe";
;
RDebugUtils.currentLine=49217541;
 //BA.debugLineNum = 49217541;BA.debugLine="Type BCTextChars (Buffer() As String, StartIndex";
;
RDebugUtils.currentLine=49217543;
 //BA.debugLineNum = 49217543;BA.debugLine="Type BCParagraphStyle (HorizontalAlignment As Str";
;
RDebugUtils.currentLine=49217545;
 //BA.debugLineNum = 49217545;BA.debugLine="Type BCTextRun (TextFont As B4XFont, TextColor As";
;
RDebugUtils.currentLine=49217548;
 //BA.debugLineNum = 49217548;BA.debugLine="Type BCConnectedRuns (ConnectedWidth As Int, Runs";
;
RDebugUtils.currentLine=49217549;
 //BA.debugLineNum = 49217549;BA.debugLine="Type BCStyledUnderline (Clr As Int, Style As Stri";
;
RDebugUtils.currentLine=49217550;
 //BA.debugLineNum = 49217550;BA.debugLine="Public const EXTRA_CONNECTEDRUNS = \"ConnectedRuns";
_extra_connectedruns = "ConnectedRuns";
_extra_styledunderline = "StyledUnderline";
RDebugUtils.currentLine=49217553;
 //BA.debugLineNum = 49217553;BA.debugLine="Type BCParagraph (TextLines As List, CurrentLine";
;
RDebugUtils.currentLine=49217556;
 //BA.debugLineNum = 49217556;BA.debugLine="Type BCTextLine (StartX As Int, BaselineY As Int,";
;
RDebugUtils.currentLine=49217558;
 //BA.debugLineNum = 49217558;BA.debugLine="Type BCUnbreakableText (Width As Int, StartX As I";
;
RDebugUtils.currentLine=49217560;
 //BA.debugLineNum = 49217560;BA.debugLine="Type BCSingleStyleSection (AbsoluteStartX As Int,";
;
RDebugUtils.currentLine=49217562;
 //BA.debugLineNum = 49217562;BA.debugLine="Type BCGlyphAndOffset (Glyph As BCGlyph, SpaceBet";
;
RDebugUtils.currentLine=49217563;
 //BA.debugLineNum = 49217563;BA.debugLine="Type BCGlyph (cbc As CompressedBC, baseline As In";
;
RDebugUtils.currentLine=49217564;
 //BA.debugLineNum = 49217564;BA.debugLine="Private CharBC As BitmapCreator";
_charbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=49217565;
 //BA.debugLineNum = 49217565;BA.debugLine="Private cbccache As InternalCompressedBCCache";
_cbccache = new b4a.example.bitmapcreator._internalcompressedbccache();
RDebugUtils.currentLine=49217566;
 //BA.debugLineNum = 49217566;BA.debugLine="Public DefaultUnderlineStyle As BCStyledUnderline";
_defaultunderlinestyle = new com.detektor.kateenapp.bctextengine._bcstyledunderline();
RDebugUtils.currentLine=49217567;
 //BA.debugLineNum = 49217567;BA.debugLine="Public mScale As Float = 1";
_mscale = (float) (1);
RDebugUtils.currentLine=49217568;
 //BA.debugLineNum = 49217568;BA.debugLine="Private mSpaceBetweenCharacters As Float";
_mspacebetweencharacters = 0f;
RDebugUtils.currentLine=49217569;
 //BA.debugLineNum = 49217569;BA.debugLine="Private mSpaceBetweenLines As Int";
_mspacebetweenlines = 0;
RDebugUtils.currentLine=49217570;
 //BA.debugLineNum = 49217570;BA.debugLine="Private FontMetricsCache As Map";
_fontmetricscache = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49217571;
 //BA.debugLineNum = 49217571;BA.debugLine="Private ForegroundBC, BackgroundBC As BitmapCreat";
_foregroundbc = new b4a.example.bitmapcreator();
_backgroundbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=49217572;
 //BA.debugLineNum = 49217572;BA.debugLine="Public DefaultColor As Int = xui.Color_Black";
_defaultcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=49217573;
 //BA.debugLineNum = 49217573;BA.debugLine="Public WordBoundaries As String = \"&*+-/.<>=\\' ,:";
_wordboundaries = "&*+-/.<>=\\' ,:{}"+__c.TAB+__c.CRLF+BA.ObjectToString(__c.Chr((int) (13)));
RDebugUtils.currentLine=49217574;
 //BA.debugLineNum = 49217574;BA.debugLine="Public WordBoundariesThatCanConnectToPrevWord As";
_wordboundariesthatcanconnecttoprevword = ".,:";
RDebugUtils.currentLine=49217575;
 //BA.debugLineNum = 49217575;BA.debugLine="Private Brushes As Map";
_brushes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49217576;
 //BA.debugLineNum = 49217576;BA.debugLine="Public DefaultStyle As BCParagraphStyle";
_defaultstyle = new com.detektor.kateenapp.bctextengine._bcparagraphstyle();
RDebugUtils.currentLine=49217577;
 //BA.debugLineNum = 49217577;BA.debugLine="Public DefaultFont As B4XFont";
_defaultfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=49217578;
 //BA.debugLineNum = 49217578;BA.debugLine="Private mMinGapBetweenLines As Int = 5dip";
_mmingapbetweenlines = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=49217580;
 //BA.debugLineNum = 49217580;BA.debugLine="Private stubForContext As Panel 'ignore";
_stubforcontext = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=49217585;
 //BA.debugLineNum = 49217585;BA.debugLine="Private const TabWidthMeasuredInX As Int = 4";
_tabwidthmeasuredinx = (int) (4);
RDebugUtils.currentLine=49217586;
 //BA.debugLineNum = 49217586;BA.debugLine="Public TagParser As BBCodeParser";
_tagparser = new com.detektor.kateenapp.bbcodeparser();
RDebugUtils.currentLine=49217587;
 //BA.debugLineNum = 49217587;BA.debugLine="Private EmptyTextChars As BCTextChars";
_emptytextchars = new com.detektor.kateenapp.bctextengine._bctextchars();
RDebugUtils.currentLine=49217588;
 //BA.debugLineNum = 49217588;BA.debugLine="Private Emojis As B4XSet";
_emojis = new com.detektor.kateenapp.b4xset();
RDebugUtils.currentLine=49217589;
 //BA.debugLineNum = 49217589;BA.debugLine="Public const Charset As String = \"UTF-32LE\"";
_charset = "UTF-32LE";
RDebugUtils.currentLine=49217590;
 //BA.debugLineNum = 49217590;BA.debugLine="Public LookForComplexCharacters As Boolean = True";
_lookforcomplexcharacters = __c.True;
RDebugUtils.currentLine=49217591;
 //BA.debugLineNum = 49217591;BA.debugLine="Public CustomFonts As Map";
_customfonts = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49217592;
 //BA.debugLineNum = 49217592;BA.debugLine="Public KerningEnabled As Boolean = True";
_kerningenabled = __c.True;
RDebugUtils.currentLine=49217593;
 //BA.debugLineNum = 49217593;BA.debugLine="Private IndentWidth As Int";
_indentwidth = 0;
RDebugUtils.currentLine=49217594;
 //BA.debugLineNum = 49217594;BA.debugLine="Public VowelsCodePoints As B4XSet";
_vowelscodepoints = new com.detektor.kateenapp.b4xset();
RDebugUtils.currentLine=49217595;
 //BA.debugLineNum = 49217595;BA.debugLine="Private AsyncBCs As B4XOrderedMap";
_asyncbcs = new com.detektor.kateenapp.b4xorderedmap();
RDebugUtils.currentLine=49217596;
 //BA.debugLineNum = 49217596;BA.debugLine="Private AsyncBC As BitmapCreator";
_asyncbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=49217597;
 //BA.debugLineNum = 49217597;BA.debugLine="Private AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49217598;
 //BA.debugLineNum = 49217598;BA.debugLine="Private AsyncMode As Boolean";
_asyncmode = false;
RDebugUtils.currentLine=49217599;
 //BA.debugLineNum = 49217599;BA.debugLine="Private RTLChars As B4XSet";
_rtlchars = new com.detektor.kateenapp.b4xset();
RDebugUtils.currentLine=49217600;
 //BA.debugLineNum = 49217600;BA.debugLine="Public Const TextDirectionLTR = 1, TextDirectionU";
_textdirectionltr = (int) (1);
_textdirectionunknown = (int) (0);
_textdirectionrtl = (int) (-1);
RDebugUtils.currentLine=49217601;
 //BA.debugLineNum = 49217601;BA.debugLine="Private ArabicMap As Map";
_arabicmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49217602;
 //BA.debugLineNum = 49217602;BA.debugLine="Private ArabicNonLinkedLetters As B4XSet";
_arabicnonlinkedletters = new com.detektor.kateenapp.b4xset();
RDebugUtils.currentLine=49217603;
 //BA.debugLineNum = 49217603;BA.debugLine="Private ArabicCharsConnectedPrev As B4XSet";
_arabiccharsconnectedprev = new com.detektor.kateenapp.b4xset();
RDebugUtils.currentLine=49217604;
 //BA.debugLineNum = 49217604;BA.debugLine="Private PMDefaultColor As PremultipliedColor";
_pmdefaultcolor = new b4a.example.bitmapcreator._premultipliedcolor();
RDebugUtils.currentLine=49217605;
 //BA.debugLineNum = 49217605;BA.debugLine="Public RTLAware As Boolean";
_rtlaware = false;
RDebugUtils.currentLine=49217606;
 //BA.debugLineNum = 49217606;BA.debugLine="End Sub";
return "";
}
public String  _loadarabicdata(com.detektor.kateenapp.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loadarabicdata", true))
	 {return ((String) Debug.delegate(ba, "loadarabicdata", null));}
b4a.example.bitmapcreator._argbcolor _a = null;
String _line = "";
String[] _split = null;
RDebugUtils.currentLine=53084160;
 //BA.debugLineNum = 53084160;BA.debugLine="Private Sub LoadArabicData";
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="If ArabicMap.IsInitialized = False Then";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="ArabicMap.Initialize";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=53084163;
 //BA.debugLineNum = 53084163;BA.debugLine="ArabicNonLinkedLetters.Initialize";
__ref._arabicnonlinkedletters /*com.detektor.kateenapp.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=53084164;
 //BA.debugLineNum = 53084164;BA.debugLine="ArabicCharsConnectedPrev.Initialize";
__ref._arabiccharsconnectedprev /*com.detektor.kateenapp.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=53084165;
 //BA.debugLineNum = 53084165;BA.debugLine="Dim a As ARGBColor";
_a = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=53084166;
 //BA.debugLineNum = 53084166;BA.debugLine="CharBC.ColorToARGB(DefaultColor, a)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._defaultcolor /*int*/ ,_a);
RDebugUtils.currentLine=53084167;
 //BA.debugLineNum = 53084167;BA.debugLine="CharBC.ARGBToPremultipliedColor(a, PMDefaultColo";
__ref._charbc /*b4a.example.bitmapcreator*/ ._argbtopremultipliedcolor(_a,__ref._pmdefaultcolor /*b4a.example.bitmapcreator._premultipliedcolor*/ );
RDebugUtils.currentLine=53084168;
 //BA.debugLineNum = 53084168;BA.debugLine="For Each line As String In File.ReadList(File.Di";
{
final anywheresoftware.b4a.BA.IterableList group8 = __c.File.ReadList(__c.File.getDirAssets(),"arabic_mapping.txt");
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_line = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=53084169;
 //BA.debugLineNum = 53084169;BA.debugLine="Dim split() As String = Regex.Split(\",\", line)";
_split = __c.Regex.Split(",",_line);
RDebugUtils.currentLine=53084170;
 //BA.debugLineNum = 53084170;BA.debugLine="If split.Length = 2 And split(1) = \"0\" Then";
if (_split.length==2 && (_split[(int) (1)]).equals("0")) { 
RDebugUtils.currentLine=53084171;
 //BA.debugLineNum = 53084171;BA.debugLine="VowelsCodePoints.Add(Bit.ParseInt(split(0), 16";
__ref._vowelscodepoints /*com.detektor.kateenapp.b4xset*/ ._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_split[(int) (0)],(int) (16))));
 }else {
RDebugUtils.currentLine=53084173;
 //BA.debugLineNum = 53084173;BA.debugLine="ArabicMap.Put(Chr(Bit.ParseInt(split(0), 16)).";
__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))),(Object)(__c.Bit.ParseInt(_split[(int) (1)],(int) (16))));
RDebugUtils.currentLine=53084174;
 //BA.debugLineNum = 53084174;BA.debugLine="If 2 = split(2) Then";
if (2==(double)(Double.parseDouble(_split[(int) (2)]))) { 
RDebugUtils.currentLine=53084175;
 //BA.debugLineNum = 53084175;BA.debugLine="ArabicNonLinkedLetters.Add(Chr(Bit.ParseInt(s";
__ref._arabicnonlinkedletters /*com.detektor.kateenapp.b4xset*/ ._add /*String*/ (null,(Object)((BA.ObjectToString(__c.Chr(__c.Bit.ParseInt(_split[(int) (0)],(int) (16)))))));
 };
 };
 }
};
 };
RDebugUtils.currentLine=53084180;
 //BA.debugLineNum = 53084180;BA.debugLine="End Sub";
return "";
}
public String  _preprocessarabic(com.detektor.kateenapp.bctextengine __ref,String[] _chars,int _length) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "preprocessarabic", true))
	 {return ((String) Debug.delegate(ba, "preprocessarabic", new Object[] {_chars,_length}));}
com.detektor.kateenapp.b4xbitset _arabicchars = null;
com.detektor.kateenapp.b4xbitset _arabicnonlinked = null;
String[] _fullchars = null;
boolean _found = false;
int _i = 0;
boolean _connecttoprev = false;
boolean _connecttonext = false;
int _offset = 0;
int _targetcp = 0;
RDebugUtils.currentLine=53149696;
 //BA.debugLineNum = 53149696;BA.debugLine="Public Sub PreprocessArabic(chars() As String, Len";
RDebugUtils.currentLine=53149697;
 //BA.debugLineNum = 53149697;BA.debugLine="LoadArabicData";
__ref._loadarabicdata /*String*/ (null);
RDebugUtils.currentLine=53149698;
 //BA.debugLineNum = 53149698;BA.debugLine="Dim ArabicChars, ArabicNonLinked As B4XBitSet";
_arabicchars = new com.detektor.kateenapp.b4xbitset();
_arabicnonlinked = new com.detektor.kateenapp.b4xbitset();
RDebugUtils.currentLine=53149699;
 //BA.debugLineNum = 53149699;BA.debugLine="Dim FullChars(Length) As String";
_fullchars = new String[_length];
java.util.Arrays.fill(_fullchars,"");
RDebugUtils.currentLine=53149700;
 //BA.debugLineNum = 53149700;BA.debugLine="Dim Found As Boolean";
_found = false;
RDebugUtils.currentLine=53149701;
 //BA.debugLineNum = 53149701;BA.debugLine="For i = 0 To Length - 1";
{
final int step5 = 1;
final int limit5 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=53149702;
 //BA.debugLineNum = 53149702;BA.debugLine="If ArabicMap.ContainsKey(chars(i).CharAt(0).As(S";
if (__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)((BA.ObjectToString(_chars[_i].charAt((int) (0))))))) { 
RDebugUtils.currentLine=53149703;
 //BA.debugLineNum = 53149703;BA.debugLine="If chars(i).Length > 1 Then";
if (_chars[_i].length()>1) { 
RDebugUtils.currentLine=53149704;
 //BA.debugLineNum = 53149704;BA.debugLine="FullChars(i) = chars(i).SubString(1)";
_fullchars[_i] = _chars[_i].substring((int) (1));
RDebugUtils.currentLine=53149705;
 //BA.debugLineNum = 53149705;BA.debugLine="chars(i) = chars(i).CharAt(0).As(String)";
_chars[_i] = (BA.ObjectToString(_chars[_i].charAt((int) (0))));
 };
RDebugUtils.currentLine=53149707;
 //BA.debugLineNum = 53149707;BA.debugLine="If Found = False Then";
if (_found==__c.False) { 
RDebugUtils.currentLine=53149708;
 //BA.debugLineNum = 53149708;BA.debugLine="Found = True";
_found = __c.True;
RDebugUtils.currentLine=53149709;
 //BA.debugLineNum = 53149709;BA.debugLine="ArabicChars.Initialize(Length)";
_arabicchars._initialize /*String*/ (null,ba,_length);
RDebugUtils.currentLine=53149710;
 //BA.debugLineNum = 53149710;BA.debugLine="ArabicNonLinked.Initialize(Length)";
_arabicnonlinked._initialize /*String*/ (null,ba,_length);
 };
RDebugUtils.currentLine=53149712;
 //BA.debugLineNum = 53149712;BA.debugLine="ArabicChars.Set(i, True)";
_arabicchars._set /*String*/ (null,_i,__c.True);
RDebugUtils.currentLine=53149713;
 //BA.debugLineNum = 53149713;BA.debugLine="If ArabicNonLinkedLetters.Contains(chars(i)) Th";
if (__ref._arabicnonlinkedletters /*com.detektor.kateenapp.b4xset*/ ._contains /*boolean*/ (null,(Object)(_chars[_i]))) { 
RDebugUtils.currentLine=53149714;
 //BA.debugLineNum = 53149714;BA.debugLine="ArabicNonLinked.Set(i, True)";
_arabicnonlinked._set /*String*/ (null,_i,__c.True);
 };
 };
 }
};
RDebugUtils.currentLine=53149718;
 //BA.debugLineNum = 53149718;BA.debugLine="If Found = False Then Return";
if (_found==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=53149719;
 //BA.debugLineNum = 53149719;BA.debugLine="For i = 0 To Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_length-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=53149720;
 //BA.debugLineNum = 53149720;BA.debugLine="If ArabicChars.Get(i) Then";
if (_arabicchars._get /*boolean*/ (null,_i)) { 
RDebugUtils.currentLine=53149721;
 //BA.debugLineNum = 53149721;BA.debugLine="Dim ConnectToPrev As Boolean = i > 0 And Arabic";
_connecttoprev = _i>0 && _arabicchars._get /*boolean*/ (null,(int) (_i-1)) && _arabicnonlinked._get /*boolean*/ (null,(int) (_i-1))==__c.False;
RDebugUtils.currentLine=53149722;
 //BA.debugLineNum = 53149722;BA.debugLine="Dim ConnectToNext As Boolean = i < Length - 1 A";
_connecttonext = _i<_length-1 && _arabicchars._get /*boolean*/ (null,(int) (_i+1)) && _arabicnonlinked._get /*boolean*/ (null,_i)==__c.False;
RDebugUtils.currentLine=53149723;
 //BA.debugLineNum = 53149723;BA.debugLine="If ConnectToNext = False And ConnectToPrev = Fa";
if (_connecttonext==__c.False && _connecttoprev==__c.False) { 
if (true) continue;};
RDebugUtils.currentLine=53149724;
 //BA.debugLineNum = 53149724;BA.debugLine="Dim offset As Int = IIf(ConnectToPrev And Conne";
_offset = (int)(BA.ObjectToNumber(((_connecttoprev && _connecttonext) ? ((Object)(3)) : (((_connecttoprev) ? ((Object)(1)) : ((Object)(2)))))));
RDebugUtils.currentLine=53149725;
 //BA.debugLineNum = 53149725;BA.debugLine="Dim TargetCP As Int = ArabicMap.Get(chars(i))";
_targetcp = (int)(BA.ObjectToNumber(__ref._arabicmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_chars[_i]))));
RDebugUtils.currentLine=53149726;
 //BA.debugLineNum = 53149726;BA.debugLine="If TargetCP = Asc(chars(i)) Then";
if (_targetcp==__c.Asc(BA.ObjectToChar(_chars[_i]))) { 
RDebugUtils.currentLine=53149727;
 //BA.debugLineNum = 53149727;BA.debugLine="offset = 0";
_offset = (int) (0);
 };
RDebugUtils.currentLine=53149729;
 //BA.debugLineNum = 53149729;BA.debugLine="TargetCP = TargetCP + offset";
_targetcp = (int) (_targetcp+_offset);
RDebugUtils.currentLine=53149730;
 //BA.debugLineNum = 53149730;BA.debugLine="chars(i) = Chr(TargetCP)";
_chars[_i] = BA.ObjectToString(__c.Chr(_targetcp));
RDebugUtils.currentLine=53149731;
 //BA.debugLineNum = 53149731;BA.debugLine="If FullChars(i).Length > 0 Then chars(i) = char";
if (_fullchars[_i].length()>0) { 
_chars[_i] = _chars[_i]+_fullchars[_i];};
RDebugUtils.currentLine=53149732;
 //BA.debugLineNum = 53149732;BA.debugLine="If ConnectToPrev Then ArabicCharsConnectedPrev.";
if (_connecttoprev) { 
__ref._arabiccharsconnectedprev /*com.detektor.kateenapp.b4xset*/ ._add /*String*/ (null,(Object)(_chars[_i]));};
 };
 }
};
RDebugUtils.currentLine=53149735;
 //BA.debugLineNum = 53149735;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bcglyph  _createglyph(com.detektor.kateenapp.bctextengine __ref,String _c,com.detektor.kateenapp.bctextengine._bcfontmetrics _fontmetrics,boolean _justmeasure) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyph", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcglyph) Debug.delegate(ba, "createglyph", new Object[] {_c,_fontmetrics,_justmeasure}));}
com.detektor.kateenapp.bctextengine._bcglyph _g = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
int _leftoffset = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2 = null;
b4a.example.bitmapcreator._compressedbc _cbc = null;
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Private Sub CreateGlyph (c As String, FontMetrics";
RDebugUtils.currentLine=51970049;
 //BA.debugLineNum = 51970049;BA.debugLine="Dim g As BCGlyph = FontMetrics.Glyphs.Get(c)";
_g = (com.detektor.kateenapp.bctextengine._bcglyph)(_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_c)));
RDebugUtils.currentLine=51970050;
 //BA.debugLineNum = 51970050;BA.debugLine="If g <> Null Then Return g";
if (_g!= null) { 
if (true) return _g;};
RDebugUtils.currentLine=51970051;
 //BA.debugLineNum = 51970051;BA.debugLine="If FontMetrics.clr <> DefaultColor Then";
if (_fontmetrics.Clr /*int*/ !=__ref._defaultcolor /*int*/ ) { 
RDebugUtils.currentLine=51970052;
 //BA.debugLineNum = 51970052;BA.debugLine="Return CreateGlyphFromDefaultColor(c, FontMetric";
if (true) return __ref._createglyphfromdefaultcolor /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,_c,_fontmetrics.DefaultColorMetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/ ,_fontmetrics.Clr /*int*/ );
 }else {
RDebugUtils.currentLine=51970054;
 //BA.debugLineNum = 51970054;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=51970055;
 //BA.debugLineNum = 51970055;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(c, FontMetric";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_c,_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=51970056;
 //BA.debugLineNum = 51970056;BA.debugLine="Dim BaseLine As Int = -r.Top + 5";
_baseline = (int) (-_r.getTop()+5);
RDebugUtils.currentLine=51970057;
 //BA.debugLineNum = 51970057;BA.debugLine="r.Left = r.Left * mScale";
_r.setLeft((float) (_r.getLeft()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51970058;
 //BA.debugLineNum = 51970058;BA.debugLine="r.Top = r.Top * mScale";
_r.setTop((float) (_r.getTop()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51970059;
 //BA.debugLineNum = 51970059;BA.debugLine="r.Right = r.Right * mScale";
_r.setRight((float) (_r.getRight()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51970060;
 //BA.debugLineNum = 51970060;BA.debugLine="r.Bottom = r.Bottom * mScale";
_r.setBottom((float) (_r.getBottom()*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51970061;
 //BA.debugLineNum = 51970061;BA.debugLine="If CharBC.mWidth < r.Width + 20 * mScale Or Char";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._mwidth<_r.getWidth()+20*__ref._mscale /*float*/  || __ref._charbc /*b4a.example.bitmapcreator*/ ._mheight<_r.getHeight()+20*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=51970062;
 //BA.debugLineNum = 51970062;BA.debugLine="ResizeCharBC(r.Width + 30 * mScale, r.Height +";
__ref._resizecharbc /*String*/ (null,(int) (_r.getWidth()+30*__ref._mscale /*float*/ ),(int) (_r.getHeight()+30*__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=51970065;
 //BA.debugLineNum = 51970065;BA.debugLine="Dim leftOffset As Int = 5";
_leftoffset = (int) (5);
RDebugUtils.currentLine=51970066;
 //BA.debugLineNum = 51970066;BA.debugLine="cvs.DrawText(c, leftOffset, BaseLine, FontMetric";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_c,(float) (_leftoffset),(float) (_baseline),_fontmetrics.Fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_fontmetrics.Clr /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=51970068;
 //BA.debugLineNum = 51970068;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .CreateBitmap();
RDebugUtils.currentLine=51970079;
 //BA.debugLineNum = 51970079;BA.debugLine="CharBC.CopyPixelsFromBitmap(bmp)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._copypixelsfrombitmap(_bmp);
RDebugUtils.currentLine=51970080;
 //BA.debugLineNum = 51970080;BA.debugLine="Dim r2 As B4XRect = FindMinRect(leftOffset + r.R";
_r2 = __ref._findminrect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,(int) (_leftoffset+_r.getRight()+20*__ref._mscale /*float*/ ),(int) (_r.getHeight()+20*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51970082;
 //BA.debugLineNum = 51970082;BA.debugLine="Dim g As BCGlyph";
_g = new com.detektor.kateenapp.bctextengine._bcglyph();
RDebugUtils.currentLine=51970083;
 //BA.debugLineNum = 51970083;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=51970084;
 //BA.debugLineNum = 51970084;BA.debugLine="g.baseline = BaseLine * mScale - r2.Top";
_g.baseline /*int*/  = (int) (_baseline*__ref._mscale /*float*/ -_r2.getTop());
RDebugUtils.currentLine=51970085;
 //BA.debugLineNum = 51970085;BA.debugLine="If r2.Width > 0 Then";
if (_r2.getWidth()>0) { 
RDebugUtils.currentLine=51970086;
 //BA.debugLineNum = 51970086;BA.debugLine="r2.Left = Floor(r2.Left)";
_r2.setLeft((float) (__c.Floor(_r2.getLeft())));
RDebugUtils.currentLine=51970087;
 //BA.debugLineNum = 51970087;BA.debugLine="r2.Right = Ceil(r2.Right)";
_r2.setRight((float) (__c.Ceil(_r2.getRight())));
RDebugUtils.currentLine=51970088;
 //BA.debugLineNum = 51970088;BA.debugLine="If RTLAware Then RecolorEdgesOfConnectedCharact";
if (__ref._rtlaware /*boolean*/ ) { 
__ref._recoloredgesofconnectedcharacters /*String*/ (null,_c,_r2);};
RDebugUtils.currentLine=51970094;
 //BA.debugLineNum = 51970094;BA.debugLine="Dim cbc As CompressedBC = CharBC.ExtractCompres";
_cbc = __ref._charbc /*b4a.example.bitmapcreator*/ ._extractcompressedbc(_r2,__ref._cbccache /*b4a.example.bitmapcreator._internalcompressedbccache*/ );
RDebugUtils.currentLine=51970095;
 //BA.debugLineNum = 51970095;BA.debugLine="g.cbc = cbc";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/  = _cbc;
RDebugUtils.currentLine=51970096;
 //BA.debugLineNum = 51970096;BA.debugLine="g.width = cbc.mWidth";
_g.Width /*int*/  = _cbc.mWidth;
 }else {
RDebugUtils.currentLine=51970098;
 //BA.debugLineNum = 51970098;BA.debugLine="g.Empty = True";
_g.Empty /*boolean*/  = __c.True;
RDebugUtils.currentLine=51970099;
 //BA.debugLineNum = 51970099;BA.debugLine="If c = TAB Then";
if ((_c).equals(__c.TAB)) { 
RDebugUtils.currentLine=51970100;
 //BA.debugLineNum = 51970100;BA.debugLine="g.Width = FontMetrics.xWidth * TabWidthMeasure";
_g.Width /*int*/  = (int) (_fontmetrics.xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
 }else 
{RDebugUtils.currentLine=51970101;
 //BA.debugLineNum = 51970101;BA.debugLine="Else if c = \" \" Then";
if ((_c).equals(" ")) { 
RDebugUtils.currentLine=51970102;
 //BA.debugLineNum = 51970102;BA.debugLine="g.width = CreateGlyph(\"x x\", FontMetrics, True";
_g.Width /*int*/  = (int) (__ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,"x x",_fontmetrics,__c.True).Width /*int*/ -_fontmetrics.xWidth /*int*/ *2);
 }else 
{RDebugUtils.currentLine=51970103;
 //BA.debugLineNum = 51970103;BA.debugLine="Else If c = \"x\" Then";
if ((_c).equals("x")) { 
RDebugUtils.currentLine=51970104;
 //BA.debugLineNum = 51970104;BA.debugLine="g = CreateGlyph(\"X\", FontMetrics, True)";
_g = __ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,"X",_fontmetrics,__c.True);
 }else 
{RDebugUtils.currentLine=51970105;
 //BA.debugLineNum = 51970105;BA.debugLine="Else If c = \"x x\" Then";
if ((_c).equals("x x")) { 
RDebugUtils.currentLine=51970106;
 //BA.debugLineNum = 51970106;BA.debugLine="g = CreateGlyph(\"X X\", FontMetrics, True)";
_g = __ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,"X X",_fontmetrics,__c.True);
 }else {
RDebugUtils.currentLine=51970108;
 //BA.debugLineNum = 51970108;BA.debugLine="g.Width = CreateGlyph(\" \", FontMetrics, False)";
_g.Width /*int*/  = __ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null," ",_fontmetrics,__c.False).Width /*int*/ ;
 }}}}
;
 };
RDebugUtils.currentLine=51970111;
 //BA.debugLineNum = 51970111;BA.debugLine="If xui.IsB4J = False And MightBeAnEmoji(c) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()==__c.False && __ref._mightbeanemoji /*boolean*/ (null,_c)) { 
RDebugUtils.currentLine=51970112;
 //BA.debugLineNum = 51970112;BA.debugLine="If Emojis.IsInitialized = False Then LoadData(E";
if (__ref._emojis /*com.detektor.kateenapp.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._loaddata /*String*/ (null,__ref._emojis /*com.detektor.kateenapp.b4xset*/ ,"emoji-data.txt");};
RDebugUtils.currentLine=51970113;
 //BA.debugLineNum = 51970113;BA.debugLine="g.Emoji = Emojis.Contains(BytesToInt(c.GetBytes";
_g.Emoji /*boolean*/  = __ref._emojis /*com.detektor.kateenapp.b4xset*/ ._contains /*boolean*/ (null,(Object)(__ref._bytestoint /*int*/ (null,_c.getBytes(__ref._charset /*String*/ ),(int) (0))));
 };
RDebugUtils.currentLine=51970115;
 //BA.debugLineNum = 51970115;BA.debugLine="If JustMeasure = False Then";
if (_justmeasure==__c.False) { 
RDebugUtils.currentLine=51970116;
 //BA.debugLineNum = 51970116;BA.debugLine="FontMetrics.Glyphs.Put(c, g)";
_fontmetrics.Glyphs /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_c),(Object)(_g));
 };
RDebugUtils.currentLine=51970118;
 //BA.debugLineNum = 51970118;BA.debugLine="Return g";
if (true) return _g;
 };
RDebugUtils.currentLine=51970120;
 //BA.debugLineNum = 51970120;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bcglyph  _createglyphfromdefaultcolor(com.detektor.kateenapp.bctextengine __ref,String _c,com.detektor.kateenapp.bctextengine._bcfontmetrics _defaultcolormetrics,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createglyphfromdefaultcolor", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcglyph) Debug.delegate(ba, "createglyphfromdefaultcolor", new Object[] {_c,_defaultcolormetrics,_clr}));}
com.detektor.kateenapp.bctextengine._bcglyph _blackglyph = null;
com.detektor.kateenapp.bctextengine._bcglyph _g = null;
byte[] _buffer = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
int _ai = 0;
int _ri = 0;
int _gi = 0;
int _bi = 0;
int _i = 0;
int _a = 0;
float _af = 0f;
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Private Sub CreateGlyphFromDefaultColor(c As Strin";
RDebugUtils.currentLine=52232193;
 //BA.debugLineNum = 52232193;BA.debugLine="Dim BlackGlyph As BCGlyph = CreateGlyph(c, Defaul";
_blackglyph = __ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,_c,_defaultcolormetrics,__c.False);
RDebugUtils.currentLine=52232194;
 //BA.debugLineNum = 52232194;BA.debugLine="If BlackGlyph.cbc.IsInitialized = False Or BlackG";
if (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized==__c.False || _blackglyph.Emoji /*boolean*/ ) { 
if (true) return _blackglyph;};
RDebugUtils.currentLine=52232195;
 //BA.debugLineNum = 52232195;BA.debugLine="Dim g As BCGlyph";
_g = new com.detektor.kateenapp.bctextengine._bcglyph();
RDebugUtils.currentLine=52232196;
 //BA.debugLineNum = 52232196;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=52232197;
 //BA.debugLineNum = 52232197;BA.debugLine="g.baseline = BlackGlyph.baseline";
_g.baseline /*int*/  = _blackglyph.baseline /*int*/ ;
RDebugUtils.currentLine=52232198;
 //BA.debugLineNum = 52232198;BA.debugLine="g.width = BlackGlyph.width";
_g.Width /*int*/  = _blackglyph.Width /*int*/ ;
RDebugUtils.currentLine=52232199;
 //BA.debugLineNum = 52232199;BA.debugLine="g.cbc.Initialize";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Initialize();
RDebugUtils.currentLine=52232200;
 //BA.debugLineNum = 52232200;BA.debugLine="g.cbc.Cache = BlackGlyph.cbc.Cache";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Cache;
RDebugUtils.currentLine=52232201;
 //BA.debugLineNum = 52232201;BA.debugLine="g.cbc.mHeight = BlackGlyph.cbc.mHeight";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight;
RDebugUtils.currentLine=52232202;
 //BA.debugLineNum = 52232202;BA.debugLine="g.cbc.mWidth = BlackGlyph.cbc.mWidth";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth;
RDebugUtils.currentLine=52232203;
 //BA.debugLineNum = 52232203;BA.debugLine="g.cbc.Rows = BlackGlyph.cbc.Rows";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .Rows;
RDebugUtils.currentLine=52232204;
 //BA.debugLineNum = 52232204;BA.debugLine="g.cbc.TargetRect = BlackGlyph.cbc.TargetRect";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect = _blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect;
RDebugUtils.currentLine=52232205;
 //BA.debugLineNum = 52232205;BA.debugLine="Dim buffer(BlackGlyph.cbc.mBuffer.Length) As Byte";
_buffer = new byte[_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer.length];
;
RDebugUtils.currentLine=52232206;
 //BA.debugLineNum = 52232206;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=52232207;
 //BA.debugLineNum = 52232207;BA.debugLine="CharBC.ColorToARGB(clr, argb)";
__ref._charbc /*b4a.example.bitmapcreator*/ ._colortoargb(_clr,_argb);
RDebugUtils.currentLine=52232208;
 //BA.debugLineNum = 52232208;BA.debugLine="Dim ai, ri, gi, bi As Int";
_ai = 0;
_ri = 0;
_gi = 0;
_bi = 0;
RDebugUtils.currentLine=52232210;
 //BA.debugLineNum = 52232210;BA.debugLine="ai = 3";
_ai = (int) (3);
RDebugUtils.currentLine=52232211;
 //BA.debugLineNum = 52232211;BA.debugLine="ri = 0";
_ri = (int) (0);
RDebugUtils.currentLine=52232212;
 //BA.debugLineNum = 52232212;BA.debugLine="gi = 1";
_gi = (int) (1);
RDebugUtils.currentLine=52232213;
 //BA.debugLineNum = 52232213;BA.debugLine="bi = 2";
_bi = (int) (2);
RDebugUtils.currentLine=52232220;
 //BA.debugLineNum = 52232220;BA.debugLine="For i = 0 To buffer.Length - 1 Step 4";
{
final int step21 = 4;
final int limit21 = (int) (_buffer.length-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=52232229;
 //BA.debugLineNum = 52232229;BA.debugLine="Dim a As Int = Bit.And(0xff, BlackGlyph.cbc.mBuf";
_a = __c.Bit.And(((int)0xff),(int) (_blackglyph.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer[(int) (_i+_ai)]));
RDebugUtils.currentLine=52232230;
 //BA.debugLineNum = 52232230;BA.debugLine="Dim af As Float = a / 255";
_af = (float) (_a/(double)255);
RDebugUtils.currentLine=52232231;
 //BA.debugLineNum = 52232231;BA.debugLine="buffer(i + ai) = a";
_buffer[(int) (_i+_ai)] = (byte) (_a);
RDebugUtils.currentLine=52232232;
 //BA.debugLineNum = 52232232;BA.debugLine="buffer(i + ri) = argb.r * af";
_buffer[(int) (_i+_ri)] = (byte) (_argb.r*_af);
RDebugUtils.currentLine=52232233;
 //BA.debugLineNum = 52232233;BA.debugLine="buffer(i + gi) = argb.g * af";
_buffer[(int) (_i+_gi)] = (byte) (_argb.g*_af);
RDebugUtils.currentLine=52232234;
 //BA.debugLineNum = 52232234;BA.debugLine="buffer(i + bi) = argb.b * af";
_buffer[(int) (_i+_bi)] = (byte) (_argb.b*_af);
 }
};
RDebugUtils.currentLine=52232237;
 //BA.debugLineNum = 52232237;BA.debugLine="g.cbc.mBuffer = buffer";
_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mBuffer = _buffer;
RDebugUtils.currentLine=52232238;
 //BA.debugLineNum = 52232238;BA.debugLine="Return g";
if (true) return _g;
RDebugUtils.currentLine=52232239;
 //BA.debugLineNum = 52232239;BA.debugLine="End Sub";
return null;
}
public String  _resizecharbc(com.detektor.kateenapp.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizecharbc", true))
	 {return ((String) Debug.delegate(ba, "resizecharbc", new Object[] {_width,_height}));}
int _scaledwidth = 0;
int _scaledheight = 0;
RDebugUtils.currentLine=51642368;
 //BA.debugLineNum = 51642368;BA.debugLine="Private Sub ResizeCharBC(width As Int, height As I";
RDebugUtils.currentLine=51642369;
 //BA.debugLineNum = 51642369;BA.debugLine="Dim ScaledWidth As Int = (width + 5) / mScale";
_scaledwidth = (int) ((_width+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=51642370;
 //BA.debugLineNum = 51642370;BA.debugLine="Dim ScaledHeight As Int = (height + 5) / mScale";
_scaledheight = (int) ((_height+5)/(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=51642371;
 //BA.debugLineNum = 51642371;BA.debugLine="CharBC.Initialize(ScaledWidth * mScale, ScaledHei";
__ref._charbc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_scaledwidth*__ref._mscale /*float*/ ),(int) (_scaledheight*__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51642372;
 //BA.debugLineNum = 51642372;BA.debugLine="CharBC.MAX_SAME_COLOR_SIZE = 0";
__ref._charbc /*b4a.example.bitmapcreator*/ ._max_same_color_size = (int) (0);
RDebugUtils.currentLine=51642373;
 //BA.debugLineNum = 51642373;BA.debugLine="CharBC.AlphaThresholdForCBCExtraction = 0";
__ref._charbc /*b4a.example.bitmapcreator*/ ._alphathresholdforcbcextraction = (int) (0);
RDebugUtils.currentLine=51642374;
 //BA.debugLineNum = 51642374;BA.debugLine="cvs.Resize(ScaledWidth, ScaledHeight)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_scaledwidth),(float) (_scaledheight));
RDebugUtils.currentLine=51642388;
 //BA.debugLineNum = 51642388;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _findminrect(com.detektor.kateenapp.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findminrect", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "findminrect", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Private Sub FindMinRect (width As Int, height As I";
RDebugUtils.currentLine=52297729;
 //BA.debugLineNum = 52297729;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="r.Initialize(width / 2, -1, -1, 0)";
_r.Initialize((float) (_width/(double)2),(float) (-1),(float) (-1),(float) (0));
RDebugUtils.currentLine=52297731;
 //BA.debugLineNum = 52297731;BA.debugLine="For y = 0 To height - 1";
{
final int step3 = 1;
final int limit3 = (int) (_height-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=52297732;
 //BA.debugLineNum = 52297732;BA.debugLine="For x = 0 To width - 1";
{
final int step4 = 1;
final int limit4 = (int) (_width-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=52297733;
 //BA.debugLineNum = 52297733;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=52297734;
 //BA.debugLineNum = 52297734;BA.debugLine="r.Left = Min(r.Left, x)";
_r.setLeft((float) (__c.Min(_r.getLeft(),_x)));
RDebugUtils.currentLine=52297735;
 //BA.debugLineNum = 52297735;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=52297738;
 //BA.debugLineNum = 52297738;BA.debugLine="If x < width Then";
if (_x<_width) { 
RDebugUtils.currentLine=52297739;
 //BA.debugLineNum = 52297739;BA.debugLine="If r.Top = -1 Then";
if (_r.getTop()==-1) { 
RDebugUtils.currentLine=52297740;
 //BA.debugLineNum = 52297740;BA.debugLine="r.Top = y";
_r.setTop((float) (_y));
 }else {
RDebugUtils.currentLine=52297742;
 //BA.debugLineNum = 52297742;BA.debugLine="r.Bottom = y + 1";
_r.setBottom((float) (_y+1));
 };
RDebugUtils.currentLine=52297744;
 //BA.debugLineNum = 52297744;BA.debugLine="For x = width - 1 To 0 Step -1";
{
final int step16 = -1;
final int limit16 = (int) (0);
_x = (int) (_width-1) ;
for (;_x >= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=52297745;
 //BA.debugLineNum = 52297745;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=52297746;
 //BA.debugLineNum = 52297746;BA.debugLine="r.Right = Max(r.Right, x + 1)";
_r.setRight((float) (__c.Max(_r.getRight(),_x+1)));
RDebugUtils.currentLine=52297747;
 //BA.debugLineNum = 52297747;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=52297752;
 //BA.debugLineNum = 52297752;BA.debugLine="r.Bottom = Max(r.Bottom, r.Top + 1)";
_r.setBottom((float) (__c.Max(_r.getBottom(),_r.getTop()+1)));
RDebugUtils.currentLine=52297753;
 //BA.debugLineNum = 52297753;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=52297754;
 //BA.debugLineNum = 52297754;BA.debugLine="End Sub";
return null;
}
public String  _recoloredgesofconnectedcharacters(com.detektor.kateenapp.bctextengine __ref,String _c,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "recoloredgesofconnectedcharacters", true))
	 {return ((String) Debug.delegate(ba, "recoloredgesofconnectedcharacters", new Object[] {_c,_r2}));}
boolean _first = false;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Private Sub RecolorEdgesOfConnectedCharacters(c As";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="If ArabicCharsConnectedPrev.Contains(c) Then";
if (__ref._arabiccharsconnectedprev /*com.detektor.kateenapp.b4xset*/ ._contains /*boolean*/ (null,(Object)(_c))) { 
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="Dim First As Boolean = True";
_first = __c.True;
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="For y = r2.Top To r2.Bottom - 1";
{
final int step3 = 1;
final int limit3 = (int) (_r2.getBottom()-1);
_y = (int) (_r2.getTop()) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=52035588;
 //BA.debugLineNum = 52035588;BA.debugLine="For x = r2.Right - 1 To Max(r2.Left, r2.Right -";
{
final int step4 = -1;
final int limit4 = (int) (__c.Max(_r2.getLeft(),_r2.getRight()-5));
_x = (int) (_r2.getRight()-1) ;
for (;_x >= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=52035589;
 //BA.debugLineNum = 52035589;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
if (__ref._charbc /*b4a.example.bitmapcreator*/ ._istransparent(_x,_y)==__c.False) { 
RDebugUtils.currentLine=52035590;
 //BA.debugLineNum = 52035590;BA.debugLine="If First Then";
if (_first) { 
RDebugUtils.currentLine=52035591;
 //BA.debugLineNum = 52035591;BA.debugLine="First = False";
_first = __c.False;
 }else {
RDebugUtils.currentLine=52035593;
 //BA.debugLineNum = 52035593;BA.debugLine="CharBC.SetPremultipliedColor(x, y, PMDefault";
__ref._charbc /*b4a.example.bitmapcreator*/ ._setpremultipliedcolor(_x,_y,__ref._pmdefaultcolor /*b4a.example.bitmapcreator._premultipliedcolor*/ );
 };
RDebugUtils.currentLine=52035595;
 //BA.debugLineNum = 52035595;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=52035600;
 //BA.debugLineNum = 52035600;BA.debugLine="End Sub";
return "";
}
public boolean  _mightbeanemoji(com.detektor.kateenapp.bctextengine __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mightbeanemoji", true))
	 {return ((Boolean) Debug.delegate(ba, "mightbeanemoji", new Object[] {_c}));}
int _cp = 0;
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Private Sub MightBeAnEmoji(c As String) As Boolean";
RDebugUtils.currentLine=52166657;
 //BA.debugLineNum = 52166657;BA.debugLine="Dim cp As Int = Asc(c)";
_cp = __c.Asc(BA.ObjectToChar(_c));
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="Return cp >= 0x231A Or c.Length > 1";
if (true) return _cp>=((int)0x231a) || _c.length()>1;
RDebugUtils.currentLine=52166659;
 //BA.debugLineNum = 52166659;BA.debugLine="End Sub";
return false;
}
public String  _loaddata(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.b4xset _set,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "loaddata", true))
	 {return ((String) Debug.delegate(ba, "loaddata", new Object[] {_set,_filename}));}
String _line = "";
int _i = 0;
int _a = 0;
RDebugUtils.currentLine=53280768;
 //BA.debugLineNum = 53280768;BA.debugLine="Private Sub LoadData(Set As B4XSet, FileName As St";
RDebugUtils.currentLine=53280769;
 //BA.debugLineNum = 53280769;BA.debugLine="Set.Initialize";
_set._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
{
final anywheresoftware.b4a.BA.IterableList group2 = __c.File.ReadList(__c.File.getDirAssets(),_filename);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=53280771;
 //BA.debugLineNum = 53280771;BA.debugLine="line = line.Trim";
_line = _line.trim();
RDebugUtils.currentLine=53280772;
 //BA.debugLineNum = 53280772;BA.debugLine="Dim i As Int = line.IndexOf(\".\")";
_i = _line.indexOf(".");
RDebugUtils.currentLine=53280773;
 //BA.debugLineNum = 53280773;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=53280774;
 //BA.debugLineNum = 53280774;BA.debugLine="Set.Add(Bit.ParseInt(line, 16))";
_set._add /*String*/ (null,(Object)(__c.Bit.ParseInt(_line,(int) (16))));
 }else {
RDebugUtils.currentLine=53280776;
 //BA.debugLineNum = 53280776;BA.debugLine="For a = Bit.ParseInt(line.SubString2(0, i), 16)";
{
final int step8 = 1;
final int limit8 = __c.Bit.ParseInt(_line.substring((int) (_i+2)),(int) (16));
_a = __c.Bit.ParseInt(_line.substring((int) (0),_i),(int) (16)) ;
for (;_a <= limit8 ;_a = _a + step8 ) {
RDebugUtils.currentLine=53280777;
 //BA.debugLineNum = 53280777;BA.debugLine="Set.Add(a)";
_set._add /*String*/ (null,(Object)(_a));
 }
};
 };
 }
};
RDebugUtils.currentLine=53280781;
 //BA.debugLineNum = 53280781;BA.debugLine="End Sub";
return "";
}
public String  _createline(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createline", true))
	 {return ((String) Debug.delegate(ba, "createline", new Object[] {_p}));}
com.detektor.kateenapp.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Private Sub CreateLine(p As BCParagraph)";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="Dim line As BCTextLine";
_line = new com.detektor.kateenapp.bctextengine._bctextline();
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="line.Initialize";
_line.Initialize();
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="line.Unbreakables.Initialize";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=50331652;
 //BA.debugLineNum = 50331652;BA.debugLine="line.ParentParagraph = p";
_line.ParentParagraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/  = _p;
RDebugUtils.currentLine=50331653;
 //BA.debugLineNum = 50331653;BA.debugLine="p.TextLines.Add(line)";
_p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_line));
RDebugUtils.currentLine=50331654;
 //BA.debugLineNum = 50331654;BA.debugLine="p.CurrentLine = line";
_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/  = _line;
RDebugUtils.currentLine=50331656;
 //BA.debugLineNum = 50331656;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bcsinglestylesection  _createsinglesection(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextrun _run,com.detektor.kateenapp.bctextengine._bctextchars _textchars,com.detektor.kateenapp.bctextengine._bcfontmetrics _fontmetrics) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createsinglesection", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcsinglestylesection) Debug.delegate(ba, "createsinglesection", new Object[] {_run,_textchars,_fontmetrics}));}
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
String _prevchar = "";
com.detektor.kateenapp.bctextengine._bcglyphandoffset _prevgo = null;
int _i = 0;
String _s = "";
com.detektor.kateenapp.bctextengine._bcglyphandoffset _go = null;
com.detektor.kateenapp.bctextengine._bcglyph _g = null;
com.detektor.kateenapp.bctextengine._bcstyledunderline _u = null;
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Private Sub CreateSingleSection (Run As BCTextRun,";
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="Dim single As BCSingleStyleSection";
_single = new com.detektor.kateenapp.bctextengine._bcsinglestylesection();
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="single.Initialize";
_single.Initialize();
RDebugUtils.currentLine=50855939;
 //BA.debugLineNum = 50855939;BA.debugLine="single.GlyphsAndOffsets.Initialize";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=50855940;
 //BA.debugLineNum = 50855940;BA.debugLine="single.Run = Run";
_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/  = _run;
RDebugUtils.currentLine=50855941;
 //BA.debugLineNum = 50855941;BA.debugLine="single.fm = FontMetrics";
_single.fm /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/  = _fontmetrics;
RDebugUtils.currentLine=50855942;
 //BA.debugLineNum = 50855942;BA.debugLine="Dim PrevChar As String";
_prevchar = "";
RDebugUtils.currentLine=50855943;
 //BA.debugLineNum = 50855943;BA.debugLine="Dim PrevGO As BCGlyphAndOffset";
_prevgo = new com.detektor.kateenapp.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=50855944;
 //BA.debugLineNum = 50855944;BA.debugLine="For i = 0 To TextChars.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_textchars.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=50855945;
 //BA.debugLineNum = 50855945;BA.debugLine="Dim s As String = TextChars.Buffer(i + TextChars";
_s = _textchars.Buffer /*String[]*/ [(int) (_i+_textchars.StartIndex /*int*/ )];
RDebugUtils.currentLine=50855946;
 //BA.debugLineNum = 50855946;BA.debugLine="Dim go As BCGlyphAndOffset";
_go = new com.detektor.kateenapp.bctextengine._bcglyphandoffset();
RDebugUtils.currentLine=50855947;
 //BA.debugLineNum = 50855947;BA.debugLine="Dim g As BCGlyph = CreateGlyph(s, FontMetrics, F";
_g = __ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,_s,_fontmetrics,__c.False);
RDebugUtils.currentLine=50855948;
 //BA.debugLineNum = 50855948;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=50855949;
 //BA.debugLineNum = 50855949;BA.debugLine="If KerningEnabled Then";
if (__ref._kerningenabled /*boolean*/ ) { 
RDebugUtils.currentLine=50855950;
 //BA.debugLineNum = 50855950;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = GetKernSpaceB";
_prevgo.SpaceBetweenThisAndNext /*int*/  = __ref._getkernspacebetweenchars /*int*/ (null,_fontmetrics,_prevchar,_s,_prevgo.Glyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ ,_g);
 }else {
RDebugUtils.currentLine=50855952;
 //BA.debugLineNum = 50855952;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = mSpaceBetween";
_prevgo.SpaceBetweenThisAndNext /*int*/  = (int) (__ref._mspacebetweencharacters /*float*/ );
 };
 };
RDebugUtils.currentLine=50855955;
 //BA.debugLineNum = 50855955;BA.debugLine="go.Glyph = g";
_go.Glyph /*com.detektor.kateenapp.bctextengine._bcglyph*/  = _g;
RDebugUtils.currentLine=50855956;
 //BA.debugLineNum = 50855956;BA.debugLine="single.GlyphsAndOffsets.Add(go)";
_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_go));
RDebugUtils.currentLine=50855957;
 //BA.debugLineNum = 50855957;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=50855958;
 //BA.debugLineNum = 50855958;BA.debugLine="single.MaxHeightAboveBaseLine = Max(single.MaxH";
_single.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_g.baseline /*int*/ -_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=50855959;
 //BA.debugLineNum = 50855959;BA.debugLine="single.MaxHeightBelowBaseLine = Max(single.MaxH";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mHeight-_g.baseline /*int*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
RDebugUtils.currentLine=50855961;
 //BA.debugLineNum = 50855961;BA.debugLine="single.Width = single.Width + g.Width";
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_g.Width /*int*/ );
RDebugUtils.currentLine=50855962;
 //BA.debugLineNum = 50855962;BA.debugLine="If i > 0 Then single.Width = single.Width + Prev";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=50855963;
 //BA.debugLineNum = 50855963;BA.debugLine="If Run.Underline Or Run.AutoUnderline Then";
if (_run.Underline /*boolean*/  || _run.AutoUnderline /*boolean*/ ) { 
RDebugUtils.currentLine=50855964;
 //BA.debugLineNum = 50855964;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ (null,_run);
RDebugUtils.currentLine=50855965;
 //BA.debugLineNum = 50855965;BA.debugLine="single.MaxHeightBelowBaseLine = Max((u.Thicknes";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max((_u.Thickness /*float*/ +2)*__ref._mscale /*float*/ +_run.VerticalOffset /*int*/ *__ref._mscale /*float*/ ,_single.MaxHeightBelowBaseLine /*int*/ ));
 };
RDebugUtils.currentLine=50855967;
 //BA.debugLineNum = 50855967;BA.debugLine="PrevGO = go";
_prevgo = _go;
RDebugUtils.currentLine=50855968;
 //BA.debugLineNum = 50855968;BA.debugLine="PrevChar = s";
_prevchar = _s;
 }
};
RDebugUtils.currentLine=50855970;
 //BA.debugLineNum = 50855970;BA.debugLine="If i > 0 Then single.Width = single.Width + PrevG";
if (_i>0) { 
_single.Width /*int*/  = (int) (_single.Width /*int*/ +_prevgo.SpaceBetweenThisAndNext /*int*/ *_run.CharacterSpacingFactor /*float*/ );};
RDebugUtils.currentLine=50855971;
 //BA.debugLineNum = 50855971;BA.debugLine="If TextChars.Length = 0 And Run.View.IsInitialize";
if (_textchars.Length /*int*/ ==0 && _run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=50855972;
 //BA.debugLineNum = 50855972;BA.debugLine="Run.View.Left = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=50855973;
 //BA.debugLineNum = 50855973;BA.debugLine="Run.View.Top = 0";
_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=50855974;
 //BA.debugLineNum = 50855974;BA.debugLine="single.Width = Run.View.Width * mScale + mSpaceB";
_single.Width /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*__ref._mscale /*float*/ +__ref._mspacebetweencharacters /*float*/ *2);
RDebugUtils.currentLine=50855975;
 //BA.debugLineNum = 50855975;BA.debugLine="single.MaxHeightAboveBaseLine = (Run.View.Height";
_single.MaxHeightAboveBaseLine /*int*/  = (int) ((_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_run.VerticalOffset /*int*/ )*__ref._mscale /*float*/ );
RDebugUtils.currentLine=50855976;
 //BA.debugLineNum = 50855976;BA.debugLine="single.MaxHeightBelowBaseLine = Run.View.Height";
_single.MaxHeightBelowBaseLine /*int*/  = (int) (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*__ref._mscale /*float*/ -_single.MaxHeightAboveBaseLine /*int*/ );
 };
RDebugUtils.currentLine=50855979;
 //BA.debugLineNum = 50855979;BA.debugLine="Return single";
if (true) return _single;
RDebugUtils.currentLine=50855980;
 //BA.debugLineNum = 50855980;BA.debugLine="End Sub";
return null;
}
public int  _getkernspacebetweenchars(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcfontmetrics _fm,String _prevchar,String _thischar,com.detektor.kateenapp.bctextengine._bcglyph _prevglyph,com.detektor.kateenapp.bctextengine._bcglyph _thisglyph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getkernspacebetweenchars", true))
	 {return ((Integer) Debug.delegate(ba, "getkernspacebetweenchars", new Object[] {_fm,_prevchar,_thischar,_prevglyph,_thisglyph}));}
String _together = "";
int _space = 0;
int _res = 0;
int _w = 0;
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Private Sub GetKernSpaceBetweenChars (fm As BCFont";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="Dim together As String = PrevChar & ThisChar";
_together = _prevchar+_thischar;
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="Dim Space As Int = fm.KerningTable.GetDefault(tog";
_space = (int)(BA.ObjectToNumber(_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_together),(Object)(-1000))));
RDebugUtils.currentLine=50921475;
 //BA.debugLineNum = 50921475;BA.debugLine="If Space > -1000 Then Return Space";
if (_space>-1000) { 
if (true) return _space;};
RDebugUtils.currentLine=50921476;
 //BA.debugLineNum = 50921476;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=50921477;
 //BA.debugLineNum = 50921477;BA.debugLine="If ThisGlyph.Empty Or PrevGlyph.Empty Then";
if (_thisglyph.Empty /*boolean*/  || _prevglyph.Empty /*boolean*/ ) { 
RDebugUtils.currentLine=50921478;
 //BA.debugLineNum = 50921478;BA.debugLine="res = mSpaceBetweenCharacters";
_res = (int) (__ref._mspacebetweencharacters /*float*/ );
 }else {
RDebugUtils.currentLine=50921480;
 //BA.debugLineNum = 50921480;BA.debugLine="Dim w As Int = CreateGlyph(together, fm, True).W";
_w = __ref._createglyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ (null,_together,_fm,__c.True).Width /*int*/ ;
RDebugUtils.currentLine=50921481;
 //BA.debugLineNum = 50921481;BA.debugLine="res = w - PrevGlyph.Width - ThisGlyph.Width";
_res = (int) (_w-_prevglyph.Width /*int*/ -_thisglyph.Width /*int*/ );
 };
RDebugUtils.currentLine=50921483;
 //BA.debugLineNum = 50921483;BA.debugLine="fm.KerningTable.Put(together, res)";
_fm.KerningTable /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_together),(Object)(_res));
RDebugUtils.currentLine=50921484;
 //BA.debugLineNum = 50921484;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=50921485;
 //BA.debugLineNum = 50921485;BA.debugLine="End Sub";
return 0;
}
public com.detektor.kateenapp.bctextengine._bcstyledunderline  _getunderlinestyle(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextrun _run) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getunderlinestyle", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcstyledunderline) Debug.delegate(ba, "getunderlinestyle", new Object[] {_run}));}
RDebugUtils.currentLine=51576832;
 //BA.debugLineNum = 51576832;BA.debugLine="Private Sub GetUnderlineStyle(run As BCTextRun) As";
RDebugUtils.currentLine=51576833;
 //BA.debugLineNum = 51576833;BA.debugLine="If run.Extra.IsInitialized = False Then Return De";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return __ref._defaultunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ ;};
RDebugUtils.currentLine=51576834;
 //BA.debugLineNum = 51576834;BA.debugLine="Return run.Extra.GetDefault(EXTRA_STYLEDUNDERLINE";
if (true) return (com.detektor.kateenapp.bctextengine._bcstyledunderline)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._extra_styledunderline /*String*/ ),(Object)(__ref._defaultunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ )));
RDebugUtils.currentLine=51576835;
 //BA.debugLineNum = 51576835;BA.debugLine="End Sub";
return null;
}
public com.detektor.kateenapp.bctextengine._bcunbreakabletext  _createunbreakable(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextrun _run,com.detektor.kateenapp.bctextengine._bctextchars _textchars,com.detektor.kateenapp.bctextengine._bcfontmetrics _fontmetrics,boolean _isseparator,com.detektor.kateenapp.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "createunbreakable", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcunbreakabletext) Debug.delegate(ba, "createunbreakable", new Object[] {_run,_textchars,_fontmetrics,_isseparator,_style}));}
com.detektor.kateenapp.bctextengine._bcunbreakabletext _unbreakable = null;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Private Sub CreateUnbreakable (Run As BCTextRun, T";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="Dim unbreakable As BCUnbreakableText";
_unbreakable = new com.detektor.kateenapp.bctextengine._bcunbreakabletext();
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="unbreakable.Initialize";
_unbreakable.Initialize();
RDebugUtils.currentLine=50528259;
 //BA.debugLineNum = 50528259;BA.debugLine="unbreakable.SingleStyleSections.Initialize";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=50528260;
 //BA.debugLineNum = 50528260;BA.debugLine="unbreakable.IsMergable = Not(IsSeparator) And Not";
_unbreakable.IsMergable /*boolean*/  = __c.Not(_isseparator) && __c.Not(_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized());
RDebugUtils.currentLine=50528261;
 //BA.debugLineNum = 50528261;BA.debugLine="Dim single As BCSingleStyleSection = CreateSingle";
_single = __ref._createsinglesection /*com.detektor.kateenapp.bctextengine._bcsinglestylesection*/ (null,_run,_textchars,_fontmetrics);
RDebugUtils.currentLine=50528262;
 //BA.debugLineNum = 50528262;BA.debugLine="single.ParentUN = unbreakable";
_single.ParentUN /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/  = _unbreakable;
RDebugUtils.currentLine=50528263;
 //BA.debugLineNum = 50528263;BA.debugLine="unbreakable.SingleStyleSections.Add(single)";
_unbreakable.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_single));
RDebugUtils.currentLine=50528264;
 //BA.debugLineNum = 50528264;BA.debugLine="unbreakable.Width = single.Width";
_unbreakable.Width /*int*/  = _single.Width /*int*/ ;
RDebugUtils.currentLine=50528265;
 //BA.debugLineNum = 50528265;BA.debugLine="unbreakable.NotFullTextChars = TextChars";
_unbreakable.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/  = _textchars;
RDebugUtils.currentLine=50528266;
 //BA.debugLineNum = 50528266;BA.debugLine="If style.RTL Then";
if (_style.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=50528267;
 //BA.debugLineNum = 50528267;BA.debugLine="unbreakable.RTL = Run.TextDirection = TextDirect";
_unbreakable.RTL /*boolean*/  = _run.TextDirection /*int*/ ==__ref._textdirectionrtl /*int*/  || (_run.TextDirection /*int*/ ==__ref._textdirectionunknown /*int*/  && __ref._detectrtl /*boolean*/ (null,_unbreakable)==__c.True);
 };
RDebugUtils.currentLine=50528269;
 //BA.debugLineNum = 50528269;BA.debugLine="unbreakable.Anchor = GetRunAnchorIfCurrentNotSet(";
_unbreakable.Anchor /*String*/  = __ref._getrunanchorifcurrentnotset /*String*/ (null,_run,"");
RDebugUtils.currentLine=50528270;
 //BA.debugLineNum = 50528270;BA.debugLine="Return unbreakable";
if (true) return _unbreakable;
RDebugUtils.currentLine=50528271;
 //BA.debugLineNum = 50528271;BA.debugLine="End Sub";
return null;
}
public boolean  _detectrtl(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcunbreakabletext _un) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "detectrtl", true))
	 {return ((Boolean) Debug.delegate(ba, "detectrtl", new Object[] {_un}));}
String _firstchar = "";
int _cp = 0;
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Private Sub DetectRTL (un As BCUnbreakableText) As";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="If un.NotFullTextChars.Length = 0 Then";
if (_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=50593796;
 //BA.debugLineNum = 50593796;BA.debugLine="If RTLChars.IsInitialized = False Then";
if (__ref._rtlchars /*com.detektor.kateenapp.b4xset*/ .IsInitialized /*boolean*/ ()==__c.False) { 
RDebugUtils.currentLine=50593797;
 //BA.debugLineNum = 50593797;BA.debugLine="LoadData(RTLChars, \"rtl-data.txt\")";
__ref._loaddata /*String*/ (null,__ref._rtlchars /*com.detektor.kateenapp.b4xset*/ ,"rtl-data.txt");
 };
RDebugUtils.currentLine=50593799;
 //BA.debugLineNum = 50593799;BA.debugLine="Dim firstChar As String = un.NotFullTextChars.Buf";
_firstchar = _un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Buffer /*String[]*/ [_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .StartIndex /*int*/ ];
RDebugUtils.currentLine=50593800;
 //BA.debugLineNum = 50593800;BA.debugLine="Dim cp As Int = BytesToInt(firstChar.GetBytes(Cha";
_cp = __ref._bytestoint /*int*/ (null,_firstchar.getBytes(__ref._charset /*String*/ ),(int) (0));
RDebugUtils.currentLine=50593801;
 //BA.debugLineNum = 50593801;BA.debugLine="Return RTLChars.Contains(cp)";
if (true) return __ref._rtlchars /*com.detektor.kateenapp.b4xset*/ ._contains /*boolean*/ (null,(Object)(_cp));
RDebugUtils.currentLine=50593802;
 //BA.debugLineNum = 50593802;BA.debugLine="End Sub";
return false;
}
public String  _getrunanchorifcurrentnotset(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextrun _textrun,String _current) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getrunanchorifcurrentnotset", true))
	 {return ((String) Debug.delegate(ba, "getrunanchorifcurrentnotset", new Object[] {_textrun,_current}));}
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Private Sub GetRunAnchorIfCurrentNotSet(TextRun As";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="If Current <> \"\" Then Return Current";
if ((_current).equals("") == false) { 
if (true) return _current;};
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="If TextRun.Extra.IsInitialized = False Then Retur";
if (_textrun.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=50790403;
 //BA.debugLineNum = 50790403;BA.debugLine="Return TextRun.Extra.GetDefault(\"a\", \"\")";
if (true) return BA.ObjectToString(_textrun.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("a"),(Object)("")));
RDebugUtils.currentLine=50790404;
 //BA.debugLineNum = 50790404;BA.debugLine="End Sub";
return "";
}
public String  _drawline(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextline _line,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawline", true))
	 {return ((String) Debug.delegate(ba, "drawline", new Object[] {_line,_offsety}));}
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
RDebugUtils.currentLine=51380224;
 //BA.debugLineNum = 51380224;BA.debugLine="Private Sub DrawLine(line As BCTextLine, OffsetY A";
RDebugUtils.currentLine=51380225;
 //BA.debugLineNum = 51380225;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreaka";
{
final anywheresoftware.b4a.BA.IterableList group1 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group1.Get(index1));
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="DrawUnbreakable(un, OffsetY)";
__ref._drawunbreakable /*String*/ (null,_un,_offsety);
 }
};
RDebugUtils.currentLine=51380228;
 //BA.debugLineNum = 51380228;BA.debugLine="End Sub";
return "";
}
public String  _drawunbreakable(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcunbreakabletext _un,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawunbreakable", true))
	 {return ((String) Debug.delegate(ba, "drawunbreakable", new Object[] {_un,_offsety}));}
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=51445760;
 //BA.debugLineNum = 51445760;BA.debugLine="Private Sub DrawUnbreakable (un As BCUnbreakableTe";
RDebugUtils.currentLine=51445761;
 //BA.debugLineNum = 51445761;BA.debugLine="For Each single As BCSingleStyleSection In un.Sin";
{
final anywheresoftware.b4a.BA.IterableList group1 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_single = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(group1.Get(index1));
RDebugUtils.currentLine=51445762;
 //BA.debugLineNum = 51445762;BA.debugLine="DrawSingleStyleSection(single, OffsetY)";
__ref._drawsinglestylesection /*String*/ (null,_single,_offsety);
 }
};
RDebugUtils.currentLine=51445764;
 //BA.debugLineNum = 51445764;BA.debugLine="End Sub";
return "";
}
public String  _drawparagraph(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _paragraph) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawparagraph", true))
	 {return ((String) Debug.delegate(ba, "drawparagraph", new Object[] {_paragraph}));}
com.detektor.kateenapp.bctextengine._bctextline _line = null;
RDebugUtils.currentLine=50987008;
 //BA.debugLineNum = 50987008;BA.debugLine="Private Sub DrawParagraph (Paragraph As BCParagrap";
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
{
final anywheresoftware.b4a.BA.IterableList group1 = _paragraph.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="DrawLine(line, line.BaselineY)";
__ref._drawline /*String*/ (null,_line,_line.BaselineY /*int*/ );
 }
};
RDebugUtils.currentLine=50987012;
 //BA.debugLineNum = 50987012;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _drawsinglelineshared(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,com.detektor.kateenapp.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineshared", true))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(ba, "drawsinglelineshared", new Object[] {_line,_iv,_par}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Private Sub DrawSingleLineShared (line As BCTextLi";
RDebugUtils.currentLine=51118081;
 //BA.debugLineNum = 51118081;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=51118082;
 //BA.debugLineNum = 51118082;BA.debugLine="r.Initialize(0, 0, ForegroundBC.mWidth, line.MaxH";
_r.Initialize((float) (0),(float) (0),(float) (__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth),(float) (_line.MaxHeightAboveBaseLine /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ ));
RDebugUtils.currentLine=51118083;
 //BA.debugLineNum = 51118083;BA.debugLine="iv.SetLayoutAnimated(0,  par.Style.Padding.Left,";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()+(_line.BaselineY /*int*/ -_line.MaxHeightAboveBaseLine /*int*/ )/(double)__ref._mscale /*float*/ ),(int) (_r.getWidth()/(double)__ref._mscale /*float*/ ),(int) (_r.getHeight()/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51118085;
 //BA.debugLineNum = 51118085;BA.debugLine="Return r";
if (true) return _r;
RDebugUtils.currentLine=51118086;
 //BA.debugLineNum = 51118086;BA.debugLine="End Sub";
return null;
}
public b4a.example.bcpath._bcbrush  _getbrush(com.detektor.kateenapp.bctextengine __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getbrush", true))
	 {return ((b4a.example.bcpath._bcbrush) Debug.delegate(ba, "getbrush", new Object[] {_clr}));}
b4a.example.bcpath._bcbrush _b = null;
RDebugUtils.currentLine=51838976;
 //BA.debugLineNum = 51838976;BA.debugLine="Private Sub GetBrush(clr As Int) As BCBrush";
RDebugUtils.currentLine=51838977;
 //BA.debugLineNum = 51838977;BA.debugLine="If Brushes.ContainsKey(clr) Then Return Brushes.G";
if (__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_clr))) { 
if (true) return (b4a.example.bcpath._bcbrush)(__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_clr)));};
RDebugUtils.currentLine=51838978;
 //BA.debugLineNum = 51838978;BA.debugLine="Dim b As BCBrush = ForegroundBC.CreateBrushFromCo";
_b = __ref._foregroundbc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(_clr);
RDebugUtils.currentLine=51838979;
 //BA.debugLineNum = 51838979;BA.debugLine="Brushes.Put(clr, b)";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_clr),(Object)(_b));
RDebugUtils.currentLine=51838980;
 //BA.debugLineNum = 51838980;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=51838981;
 //BA.debugLineNum = 51838981;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _drawsinglelineasync(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextline _line,anywheresoftware.b4a.objects.B4XViewWrapper _iv,com.detektor.kateenapp.bctextengine._bcparagraph _par,Object _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglelineasync", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "drawsinglelineasync", new Object[] {_line,_iv,_par,_target}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Public Sub DrawSingleLineAsync (line As BCTextLine";
RDebugUtils.currentLine=51183617;
 //BA.debugLineNum = 51183617;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
_r = __ref._drawsinglelineshared /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ (null,_line,_iv,_par);
RDebugUtils.currentLine=51183618;
 //BA.debugLineNum = 51183618;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
if (_r.getWidth()>0 && _r.getHeight()>0) { 
RDebugUtils.currentLine=51183619;
 //BA.debugLineNum = 51183619;BA.debugLine="AsyncMode = True";
__ref._asyncmode /*boolean*/  = __c.True;
RDebugUtils.currentLine=51183620;
 //BA.debugLineNum = 51183620;BA.debugLine="If AsyncBCs.IsInitialized = False Then AsyncBCs.";
if (__ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ .IsInitialized /*boolean*/ ()==__c.False) { 
__ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ ._initialize /*String*/ (null,ba);};
RDebugUtils.currentLine=51183621;
 //BA.debugLineNum = 51183621;BA.debugLine="Dim AsyncTasks As List";
_asynctasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=51183622;
 //BA.debugLineNum = 51183622;BA.debugLine="AsyncTasks.Initialize";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=51183623;
 //BA.debugLineNum = 51183623;BA.debugLine="AsyncBC = FindAsyncBC (r.Width, r.Height)";
__ref._asyncbc /*b4a.example.bitmapcreator*/  = __ref._findasyncbc /*b4a.example.bitmapcreator*/ (null,(int) (_r.getWidth()),(int) (_r.getHeight()));
RDebugUtils.currentLine=51183624;
 //BA.debugLineNum = 51183624;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBrush";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0))));
RDebugUtils.currentLine=51183625;
 //BA.debugLineNum = 51183625;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
__ref._drawline /*String*/ (null,_line,_line.MaxHeightAboveBaseLine /*int*/ );
RDebugUtils.currentLine=51183626;
 //BA.debugLineNum = 51183626;BA.debugLine="AsyncBC.DrawBitmapCreatorsAsync(Target, \"BC\", As";
__ref._asyncbc /*b4a.example.bitmapcreator*/ ._drawbitmapcreatorsasync(_target,"BC",__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=51183627;
 //BA.debugLineNum = 51183627;BA.debugLine="AsyncMode = False";
__ref._asyncmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=51183628;
 //BA.debugLineNum = 51183628;BA.debugLine="Return AsyncBC";
if (true) return __ref._asyncbc /*b4a.example.bitmapcreator*/ ;
 };
RDebugUtils.currentLine=51183630;
 //BA.debugLineNum = 51183630;BA.debugLine="Return Null";
if (true) return (b4a.example.bitmapcreator)(__c.Null);
RDebugUtils.currentLine=51183631;
 //BA.debugLineNum = 51183631;BA.debugLine="End Sub";
return null;
}
public b4a.example.bitmapcreator  _findasyncbc(com.detektor.kateenapp.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "findasyncbc", true))
	 {return ((b4a.example.bitmapcreator) Debug.delegate(ba, "findasyncbc", new Object[] {_width,_height}));}
b4a.example.bitmapcreator _bc = null;
boolean _used = false;
int _i = 0;
boolean _b = false;
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Private Sub FindAsyncBC (Width As Int, Height As I";
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="For Each bc As BitmapCreator In AsyncBCs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_bc = (b4a.example.bitmapcreator)(group1.Get(index1));
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="If bc.mWidth = Width And bc.mHeight = Height The";
if (_bc._mwidth==_width && _bc._mheight==_height) { 
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="Dim Used As Boolean = AsyncBCs.Get(bc)";
_used = BA.ObjectToBoolean(__ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_bc)));
RDebugUtils.currentLine=51249156;
 //BA.debugLineNum = 51249156;BA.debugLine="If Used = False Then";
if (_used==__c.False) { 
RDebugUtils.currentLine=51249157;
 //BA.debugLineNum = 51249157;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=51249158;
 //BA.debugLineNum = 51249158;BA.debugLine="Return bc";
if (true) return _bc;
 };
 };
 }
};
RDebugUtils.currentLine=51249162;
 //BA.debugLineNum = 51249162;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=51249163;
 //BA.debugLineNum = 51249163;BA.debugLine="bc.Initialize(Width, Height)";
_bc._initialize(ba,_width,_height);
RDebugUtils.currentLine=51249164;
 //BA.debugLineNum = 51249164;BA.debugLine="AsyncBCs.Put(bc, True)";
__ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.True));
RDebugUtils.currentLine=51249165;
 //BA.debugLineNum = 51249165;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=51249166;
 //BA.debugLineNum = 51249166;BA.debugLine="For Each b As Boolean In AsyncBCs.Values";
{
final anywheresoftware.b4a.BA.IterableList group14 = __ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_b = BA.ObjectToBoolean(group14.Get(index14));
RDebugUtils.currentLine=51249167;
 //BA.debugLineNum = 51249167;BA.debugLine="If b Then i = i + 1";
if (_b) { 
_i = (int) (_i+1);};
 }
};
RDebugUtils.currentLine=51249169;
 //BA.debugLineNum = 51249169;BA.debugLine="Return bc";
if (true) return _bc;
RDebugUtils.currentLine=51249170;
 //BA.debugLineNum = 51249170;BA.debugLine="End Sub";
return null;
}
public String  _drawsinglestylesection(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcsinglestylesection _single,int _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "drawsinglestylesection", true))
	 {return ((String) Debug.delegate(ba, "drawsinglestylesection", new Object[] {_single,_offsety}));}
int _offsetx = 0;
boolean _rtl = false;
com.detektor.kateenapp.bctextengine._bcglyphandoffset _go = null;
com.detektor.kateenapp.bctextengine._bcglyph _g = null;
int _x = 0;
b4a.example.bitmapcreator._drawtask _dt = null;
com.detektor.kateenapp.bctextengine._bcstyledunderline _u = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=51511296;
 //BA.debugLineNum = 51511296;BA.debugLine="Private Sub DrawSingleStyleSection (single As BCSi";
RDebugUtils.currentLine=51511297;
 //BA.debugLineNum = 51511297;BA.debugLine="Dim OffsetX As Int = single.AbsoluteStartX";
_offsetx = _single.AbsoluteStartX /*int*/ ;
RDebugUtils.currentLine=51511298;
 //BA.debugLineNum = 51511298;BA.debugLine="Dim rtl As Boolean = single.ParentUN.RTL";
_rtl = _single.ParentUN /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/ .RTL /*boolean*/ ;
RDebugUtils.currentLine=51511299;
 //BA.debugLineNum = 51511299;BA.debugLine="If rtl Then OffsetX = single.AbsoluteStartX + sin";
if (_rtl) { 
_offsetx = (int) (_single.AbsoluteStartX /*int*/ +_single.Width /*int*/ );};
RDebugUtils.currentLine=51511300;
 //BA.debugLineNum = 51511300;BA.debugLine="For Each go As BCGlyphAndOffset In single.GlyphsA";
{
final anywheresoftware.b4a.BA.IterableList group4 = _single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_go = (com.detektor.kateenapp.bctextengine._bcglyphandoffset)(group4.Get(index4));
RDebugUtils.currentLine=51511301;
 //BA.debugLineNum = 51511301;BA.debugLine="Dim g As BCGlyph = go.Glyph";
_g = _go.Glyph /*com.detektor.kateenapp.bctextengine._bcglyph*/ ;
RDebugUtils.currentLine=51511303;
 //BA.debugLineNum = 51511303;BA.debugLine="If g = Null Then Continue";
if (_g== null) { 
if (true) continue;};
RDebugUtils.currentLine=51511305;
 //BA.debugLineNum = 51511305;BA.debugLine="Dim x As Int = OffsetX";
_x = _offsetx;
RDebugUtils.currentLine=51511306;
 //BA.debugLineNum = 51511306;BA.debugLine="If rtl Then x = x - g.cbc.mWidth";
if (_rtl) { 
_x = (int) (_x-_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .mWidth);};
RDebugUtils.currentLine=51511307;
 //BA.debugLineNum = 51511307;BA.debugLine="If g.cbc.IsInitialized Then";
if (_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .IsInitialized) { 
RDebugUtils.currentLine=51511308;
 //BA.debugLineNum = 51511308;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=51511309;
 //BA.debugLineNum = 51511309;BA.debugLine="Dim dt As DrawTask = AsyncBC.CreateDrawTask(g.";
_dt = __ref._asyncbc /*b4a.example.bitmapcreator*/ ._createdrawtask((Object)(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ),_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ),__c.True);
RDebugUtils.currentLine=51511310;
 //BA.debugLineNum = 51511310;BA.debugLine="dt.IsCompressedSource = True";
_dt.IsCompressedSource = __c.True;
RDebugUtils.currentLine=51511311;
 //BA.debugLineNum = 51511311;BA.debugLine="AsyncTasks.Add(dt)";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_dt));
 }else {
RDebugUtils.currentLine=51511313;
 //BA.debugLineNum = 51511313;BA.debugLine="ForegroundBC.DrawCompressedBitmap(g.cbc, g.cbc";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawcompressedbitmap(_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ ,_g.cbc /*b4a.example.bitmapcreator._compressedbc*/ .TargetRect,_x,(int) (_offsety-_g.baseline /*int*/ +_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
 };
 };
RDebugUtils.currentLine=51511316;
 //BA.debugLineNum = 51511316;BA.debugLine="If single.Run.Underline Then";
if (_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .Underline /*boolean*/ ) { 
RDebugUtils.currentLine=51511317;
 //BA.debugLineNum = 51511317;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
_u = __ref._getunderlinestyle /*com.detektor.kateenapp.bctextengine._bcstyledunderline*/ (null,_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ );
RDebugUtils.currentLine=51511318;
 //BA.debugLineNum = 51511318;BA.debugLine="Dim clr As Int = u.Clr";
_clr = _u.Clr /*int*/ ;
RDebugUtils.currentLine=51511319;
 //BA.debugLineNum = 51511319;BA.debugLine="If clr = 0 Then clr = single.Run.TextColor";
if (_clr==0) { 
_clr = _single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .TextColor /*int*/ ;};
RDebugUtils.currentLine=51511320;
 //BA.debugLineNum = 51511320;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=51511321;
 //BA.debugLineNum = 51511321;BA.debugLine="r.Initialize(x, single.Run.VerticalOffset * mSc";
_r.Initialize((float) (_x),(float) (_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ +_offsety+__ref._mscale /*float*/ ),(float) (_x+_g.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ ),(float) (_offsety+__ref._mscale /*float*/ +_u.Thickness /*float*/ *__ref._mscale /*float*/ +_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .VerticalOffset /*int*/ *__ref._mscale /*float*/ ));
RDebugUtils.currentLine=51511323;
 //BA.debugLineNum = 51511323;BA.debugLine="If AsyncMode Then";
if (__ref._asyncmode /*boolean*/ ) { 
RDebugUtils.currentLine=51511324;
 //BA.debugLineNum = 51511324;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBru";
__ref._asynctasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._asyncbc /*b4a.example.bitmapcreator*/ ._asyncdrawrect(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0))));
 }else {
RDebugUtils.currentLine=51511326;
 //BA.debugLineNum = 51511326;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(clr), True,";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(_r,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,_clr),__c.True,(int) (0));
 };
 };
RDebugUtils.currentLine=51511329;
 //BA.debugLineNum = 51511329;BA.debugLine="If rtl Then";
if (_rtl) { 
RDebugUtils.currentLine=51511330;
 //BA.debugLineNum = 51511330;BA.debugLine="OffsetX = OffsetX - g.Width - go.SpaceBetweenTh";
_offsetx = (int) (_offsetx-_g.Width /*int*/ -_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 }else {
RDebugUtils.currentLine=51511332;
 //BA.debugLineNum = 51511332;BA.debugLine="OffsetX = OffsetX + g.Width + go.SpaceBetweenTh";
_offsetx = (int) (_offsetx+_g.Width /*int*/ +_go.SpaceBetweenThisAndNext /*int*/ *_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .CharacterSpacingFactor /*float*/ );
 };
 }
};
RDebugUtils.currentLine=51511335;
 //BA.debugLineNum = 51511335;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bcparagraph  _prepare(com.detektor.kateenapp.bctextengine __ref,anywheresoftware.b4a.objects.collections.List _runs,com.detektor.kateenapp.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "prepare", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcparagraph) Debug.delegate(ba, "prepare", new Object[] {_runs,_style}));}
com.detektor.kateenapp.bctextengine._bcparagraph _par = null;
anywheresoftware.b4a.objects.collections.List _unbreakeables = null;
com.detektor.kateenapp.bctextengine._bctextrun _run = null;
RDebugUtils.currentLine=49610752;
 //BA.debugLineNum = 49610752;BA.debugLine="Private Sub Prepare (Runs As List, Style As BCPara";
RDebugUtils.currentLine=49610753;
 //BA.debugLineNum = 49610753;BA.debugLine="Dim par As BCParagraph";
_par = new com.detektor.kateenapp.bctextengine._bcparagraph();
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="par.Initialize";
_par.Initialize();
RDebugUtils.currentLine=49610755;
 //BA.debugLineNum = 49610755;BA.debugLine="par.TextLines.Initialize";
_par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=49610756;
 //BA.debugLineNum = 49610756;BA.debugLine="par.Style = Style";
_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/  = _style;
RDebugUtils.currentLine=49610757;
 //BA.debugLineNum = 49610757;BA.debugLine="IndentWidth = GetFontMetrics(DefaultFont, Default";
__ref._indentwidth /*int*/  = (int) (__ref._getfontmetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/ (null,__ref._defaultfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._defaultcolor /*int*/ ).xWidth /*int*/ *__ref._tabwidthmeasuredinx /*int*/ );
RDebugUtils.currentLine=49610758;
 //BA.debugLineNum = 49610758;BA.debugLine="Dim unbreakeables As List";
_unbreakeables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49610759;
 //BA.debugLineNum = 49610759;BA.debugLine="unbreakeables.Initialize";
_unbreakeables.Initialize();
RDebugUtils.currentLine=49610760;
 //BA.debugLineNum = 49610760;BA.debugLine="For Each run As BCTextRun In Runs";
{
final anywheresoftware.b4a.BA.IterableList group8 = _runs;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_run = (com.detektor.kateenapp.bctextengine._bctextrun)(group8.Get(index8));
RDebugUtils.currentLine=49610761;
 //BA.debugLineNum = 49610761;BA.debugLine="If run.Extra.IsInitialized And run.Extra.Contain";
if (_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized() && _run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__ref._extra_connectedruns /*String*/ ))) { 
RDebugUtils.currentLine=49610762;
 //BA.debugLineNum = 49610762;BA.debugLine="HandleConnectedTextRuns(run, unbreakeables, Sty";
__ref._handleconnectedtextruns /*String*/ (null,_run,_unbreakeables,_style);
 }else {
RDebugUtils.currentLine=49610764;
 //BA.debugLineNum = 49610764;BA.debugLine="HandleTextRun(run, unbreakeables, Style)";
__ref._handletextrun /*String*/ (null,_run,_unbreakeables,_style);
 };
 }
};
RDebugUtils.currentLine=49610767;
 //BA.debugLineNum = 49610767;BA.debugLine="CreateLine(par)";
__ref._createline /*String*/ (null,_par);
RDebugUtils.currentLine=49610768;
 //BA.debugLineNum = 49610768;BA.debugLine="OrganizeUnbreakables(par, unbreakeables)";
__ref._organizeunbreakables /*String*/ (null,_par,_unbreakeables);
RDebugUtils.currentLine=49610769;
 //BA.debugLineNum = 49610769;BA.debugLine="OrganizeLines(par)";
__ref._organizelines /*String*/ (null,_par);
RDebugUtils.currentLine=49610770;
 //BA.debugLineNum = 49610770;BA.debugLine="OrganizeSingleStyles(par)";
__ref._organizesinglestyles /*String*/ (null,_par);
RDebugUtils.currentLine=49610771;
 //BA.debugLineNum = 49610771;BA.debugLine="If par.Style.RTL Then OrganizeRTLParagraph(par)";
if (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .RTL /*boolean*/ ) { 
__ref._organizertlparagraph /*String*/ (null,_par);};
RDebugUtils.currentLine=49610772;
 //BA.debugLineNum = 49610772;BA.debugLine="Return par";
if (true) return _par;
RDebugUtils.currentLine=49610773;
 //BA.debugLineNum = 49610773;BA.debugLine="End Sub";
return null;
}
public String  _resizelayers(com.detektor.kateenapp.bctextengine __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizelayers", true))
	 {return ((String) Debug.delegate(ba, "resizelayers", new Object[] {_width,_height}));}
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Private Sub ResizeLayers (Width As Int, Height As";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="Width = Max(Width, 2) * mScale";
_width = (int) (__c.Max(_width,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="Height = Max(Height, 2) * mScale";
_height = (int) (__c.Max(_height,2)*__ref._mscale /*float*/ );
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="If ForegroundBC.IsInitialized = False Or Width >";
if (__ref._foregroundbc /*b4a.example.bitmapcreator*/ .IsInitialized()==__c.False || _width>__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth || _height>__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mheight) { 
RDebugUtils.currentLine=49348612;
 //BA.debugLineNum = 49348612;BA.debugLine="If ForegroundBC.IsInitialized Then";
if (__ref._foregroundbc /*b4a.example.bitmapcreator*/ .IsInitialized()) { 
RDebugUtils.currentLine=49348613;
 //BA.debugLineNum = 49348613;BA.debugLine="Width = Max(Width, ForegroundBC.mWidth)";
_width = (int) (__c.Max(_width,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mwidth));
RDebugUtils.currentLine=49348614;
 //BA.debugLineNum = 49348614;BA.debugLine="Height = Max(Height, ForegroundBC.mHeight)";
_height = (int) (__c.Max(_height,__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._mheight));
 };
RDebugUtils.currentLine=49348619;
 //BA.debugLineNum = 49348619;BA.debugLine="Brushes.Clear";
__ref._brushes /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=49348620;
 //BA.debugLineNum = 49348620;BA.debugLine="ForegroundBC.Initialize(Width, Height)";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._initialize(ba,_width,_height);
 }else {
RDebugUtils.currentLine=49348622;
 //BA.debugLineNum = 49348622;BA.debugLine="ForegroundBC.DrawRect2(ForegroundBC.TargetRect,";
__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._foregroundbc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._getbrush /*b4a.example.bcpath._bcbrush*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent),__c.True,(int) (0));
 };
RDebugUtils.currentLine=49348624;
 //BA.debugLineNum = 49348624;BA.debugLine="End Sub";
return "";
}
public String  _resizeimageview(com.detektor.kateenapp.bctextengine __ref,b4a.example.bitmapcreator _bc,com.detektor.kateenapp.bctextengine._bcparagraph _par,anywheresoftware.b4a.objects.B4XViewWrapper _iv,boolean _resizeheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "resizeimageview", true))
	 {return ((String) Debug.delegate(ba, "resizeimageview", new Object[] {_bc,_par,_iv,_resizeheight}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
int _ivheight = 0;
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Private Sub ResizeImageView (bc As BitmapCreator,";
RDebugUtils.currentLine=49872897;
 //BA.debugLineNum = 49872897;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _bc._getbitmap();
RDebugUtils.currentLine=49872898;
 //BA.debugLineNum = 49872898;BA.debugLine="Dim ivHeight As Int = par.Height / mScale";
_ivheight = (int) (_par.Height /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=49872899;
 //BA.debugLineNum = 49872899;BA.debugLine="If ResizeHeight = False Then ivHeight = Min(ivHei";
if (_resizeheight==__c.False) { 
_ivheight = (int) (__c.Min(_ivheight,_iv.getParent().getHeight()-_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()-_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getBottom()));};
RDebugUtils.currentLine=49872900;
 //BA.debugLineNum = 49872900;BA.debugLine="iv.SetLayoutAnimated(0, par.Style.Padding.Left, p";
_iv.SetLayoutAnimated((int) (0),(int) (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()),(int) (_par.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getTop()),(int) (_par.Width /*int*/ /(double)__ref._mscale /*float*/ ),_ivheight);
RDebugUtils.currentLine=49872901;
 //BA.debugLineNum = 49872901;BA.debugLine="bc.SetBitmapToImageView(bmp.Crop(0, 0, iv.Width *";
_bc._setbitmaptoimageview(_bmp.Crop((int) (0),(int) (0),(int) (_iv.getWidth()*__ref._mscale /*float*/ ),(int) (_iv.getHeight()*__ref._mscale /*float*/ )),_iv);
RDebugUtils.currentLine=49872902;
 //BA.debugLineNum = 49872902;BA.debugLine="End Sub";
return "";
}
public String  _fonttokey(com.detektor.kateenapp.bctextengine __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "fonttokey", true))
	 {return ((String) Debug.delegate(ba, "fonttokey", new Object[] {_fnt,_clr}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=52363264;
 //BA.debugLineNum = 52363264;BA.debugLine="Private Sub FontToKey (fnt As B4XFont, Clr As Int)";
RDebugUtils.currentLine=52363266;
 //BA.debugLineNum = 52363266;BA.debugLine="Dim jo As JavaObject = fnt.ToNativeFont";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_fnt.ToNativeFont().getObject()));
RDebugUtils.currentLine=52363267;
 //BA.debugLineNum = 52363267;BA.debugLine="Return Clr + jo.RunMethod(\"hashCode\", Null) + fnt";
if (true) return BA.NumberToString(_clr+(double)(BA.ObjectToNumber(_jo.RunMethod("hashCode",(Object[])(__c.Null))))+_fnt.getSize());
RDebugUtils.currentLine=52363273;
 //BA.debugLineNum = 52363273;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bcsinglestylesection  _getfirstsinglestyle(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextline _line) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getfirstsinglestyle", true))
	 {return ((com.detektor.kateenapp.bctextengine._bcsinglestylesection) Debug.delegate(ba, "getfirstsinglestyle", new Object[] {_line}));}
com.detektor.kateenapp.bctextengine._bcunbreakabletext _firstun = null;
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Private Sub GetFirstSingleStyle (Line As BCTextLin";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="Dim FirstUN As BCUnbreakableText = Line.Unbreakab";
_firstun = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="Return FirstUN.SingleStyleSections.Get(0)";
if (true) return (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(_firstun.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=50266115;
 //BA.debugLineNum = 50266115;BA.debugLine="End Sub";
return null;
}
public int  _getmingapbetweenlines(com.detektor.kateenapp.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getmingapbetweenlines", true))
	 {return ((Integer) Debug.delegate(ba, "getmingapbetweenlines", null));}
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Public Sub getMinGapBetweenLines As Int";
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="Return mMinGapBetweenLines";
if (true) return __ref._mmingapbetweenlines /*int*/ ;
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="End Sub";
return 0;
}
public float  _getspacebetweencharacters(com.detektor.kateenapp.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweencharacters", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweencharacters", null));}
RDebugUtils.currentLine=52428800;
 //BA.debugLineNum = 52428800;BA.debugLine="Public Sub getSpaceBetweenCharacters As Float";
RDebugUtils.currentLine=52428801;
 //BA.debugLineNum = 52428801;BA.debugLine="Return mSpaceBetweenCharacters / mScale";
if (true) return (float) (__ref._mspacebetweencharacters /*float*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=52428802;
 //BA.debugLineNum = 52428802;BA.debugLine="End Sub";
return 0f;
}
public float  _getspacebetweenlines(com.detektor.kateenapp.bctextengine __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "getspacebetweenlines", true))
	 {return ((Float) Debug.delegate(ba, "getspacebetweenlines", null));}
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Public Sub getSpaceBetweenLines As Float";
RDebugUtils.currentLine=52559873;
 //BA.debugLineNum = 52559873;BA.debugLine="Return mSpaceBetweenLines / mScale";
if (true) return (float) (__ref._mspacebetweenlines /*int*/ /(double)__ref._mscale /*float*/ );
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="End Sub";
return 0f;
}
public String  _handleconnectedtextruns(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,com.detektor.kateenapp.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handleconnectedtextruns", true))
	 {return ((String) Debug.delegate(ba, "handleconnectedtextruns", new Object[] {_run,_unbreakables,_style}));}
anywheresoftware.b4a.objects.collections.List _children = null;
com.detektor.kateenapp.bctextengine._bcconnectedruns _cr = null;
com.detektor.kateenapp.bctextengine._bctextrun _r = null;
int _width = 0;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
com.detektor.kateenapp.bctextengine._bcfontmetrics _fm = null;
int _connectedwidth = 0;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _u = null;
int _i = 0;
int _leftoffset = 0;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Private Sub HandleConnectedTextRuns (Run As BCText";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="Dim children As List";
_children = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="children.Initialize";
_children.Initialize();
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="Dim cr As BCConnectedRuns = Run.EXTRA.Get(EXTRA_C";
_cr = (com.detektor.kateenapp.bctextengine._bcconnectedruns)(_run.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__ref._extra_connectedruns /*String*/ )));
RDebugUtils.currentLine=50397188;
 //BA.debugLineNum = 50397188;BA.debugLine="For Each r As BCTextRun In cr.Runs";
{
final anywheresoftware.b4a.BA.IterableList group4 = _cr.Runs /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = (com.detektor.kateenapp.bctextengine._bctextrun)(group4.Get(index4));
RDebugUtils.currentLine=50397189;
 //BA.debugLineNum = 50397189;BA.debugLine="HandleTextRun(r, children, Style)";
__ref._handletextrun /*String*/ (null,_r,_children,_style);
 }
};
RDebugUtils.currentLine=50397191;
 //BA.debugLineNum = 50397191;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=50397192;
 //BA.debugLineNum = 50397192;BA.debugLine="For Each un As BCUnbreakableText In children";
{
final anywheresoftware.b4a.BA.IterableList group8 = _children;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group8.Get(index8));
RDebugUtils.currentLine=50397193;
 //BA.debugLineNum = 50397193;BA.debugLine="un.IsMergable = True";
_un.IsMergable /*boolean*/  = __c.True;
RDebugUtils.currentLine=50397194;
 //BA.debugLineNum = 50397194;BA.debugLine="width = width + un.Width";
_width = (int) (_width+_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=50397196;
 //BA.debugLineNum = 50397196;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=50397197;
 //BA.debugLineNum = 50397197;BA.debugLine="Dim ConnectedWidth As Int = cr.ConnectedWidth * m";
_connectedwidth = (int) (_cr.ConnectedWidth /*int*/ *__ref._mscale /*float*/ );
RDebugUtils.currentLine=50397199;
 //BA.debugLineNum = 50397199;BA.debugLine="Dim u As BCUnbreakableText = children.Get(0)";
_u = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_children.Get((int) (0)));
RDebugUtils.currentLine=50397200;
 //BA.debugLineNum = 50397200;BA.debugLine="For i = 1 To children.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_children.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=50397201;
 //BA.debugLineNum = 50397201;BA.debugLine="MergeUnbreakables(u, children.Get(i))";
__ref._mergeunbreakables /*String*/ (null,_u,(com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_children.Get(_i)));
 }
};
RDebugUtils.currentLine=50397203;
 //BA.debugLineNum = 50397203;BA.debugLine="If width < ConnectedWidth Then";
if (_width<_connectedwidth) { 
RDebugUtils.currentLine=50397204;
 //BA.debugLineNum = 50397204;BA.debugLine="Dim leftOffset As Int";
_leftoffset = 0;
RDebugUtils.currentLine=50397205;
 //BA.debugLineNum = 50397205;BA.debugLine="Select cr.Alignment.ToLowerCase";
switch (BA.switchObjectToInt(_cr.Alignment /*String*/ .toLowerCase(),"center","right")) {
case 0: {
RDebugUtils.currentLine=50397207;
 //BA.debugLineNum = 50397207;BA.debugLine="leftOffset = (ConnectedWidth - u.Width) / 2";
_leftoffset = (int) ((_connectedwidth-_u.Width /*int*/ )/(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=50397209;
 //BA.debugLineNum = 50397209;BA.debugLine="leftOffset = ConnectedWidth - u.Width - mSpace";
_leftoffset = (int) (_connectedwidth-_u.Width /*int*/ -__ref._mspacebetweencharacters /*float*/ );
 break; }
}
;
RDebugUtils.currentLine=50397211;
 //BA.debugLineNum = 50397211;BA.debugLine="u.Width = ConnectedWidth";
_u.Width /*int*/  = _connectedwidth;
RDebugUtils.currentLine=50397212;
 //BA.debugLineNum = 50397212;BA.debugLine="If leftOffset > 0 Then";
if (_leftoffset>0) { 
RDebugUtils.currentLine=50397213;
 //BA.debugLineNum = 50397213;BA.debugLine="Dim single As BCSingleStyleSection = CreateSing";
_single = __ref._createsinglesection /*com.detektor.kateenapp.bctextengine._bcsinglestylesection*/ (null,_run,__ref._emptytextchars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,_fm);
RDebugUtils.currentLine=50397214;
 //BA.debugLineNum = 50397214;BA.debugLine="single.Width = leftOffset";
_single.Width /*int*/  = _leftoffset;
RDebugUtils.currentLine=50397215;
 //BA.debugLineNum = 50397215;BA.debugLine="u.SingleStyleSections.InsertAt(0, single)";
_u.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt((int) (0),(Object)(_single));
 };
 };
RDebugUtils.currentLine=50397218;
 //BA.debugLineNum = 50397218;BA.debugLine="u.IsMergable = False";
_u.IsMergable /*boolean*/  = __c.False;
RDebugUtils.currentLine=50397219;
 //BA.debugLineNum = 50397219;BA.debugLine="Unbreakables.Add(u)";
_unbreakables.Add((Object)(_u));
RDebugUtils.currentLine=50397220;
 //BA.debugLineNum = 50397220;BA.debugLine="End Sub";
return "";
}
public String  _handletextrun(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextrun _run,anywheresoftware.b4a.objects.collections.List _unbreakables,com.detektor.kateenapp.bctextengine._bcparagraphstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "handletextrun", true))
	 {return ((String) Debug.delegate(ba, "handletextrun", new Object[] {_run,_unbreakables,_style}));}
com.detektor.kateenapp.bctextengine._bcfontmetrics _fm = null;
int _i1 = 0;
int _i = 0;
String _c = "";
boolean _separatorgoestogetherwithtext = false;
int _offset = 0;
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Private Sub HandleTextRun (Run As BCTextRun, Unbre";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
_fm = __ref._getfontmetrics /*com.detektor.kateenapp.bctextengine._bcfontmetrics*/ (null,_run.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_run.TextColor /*int*/ );
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="Dim i1 As Int";
_i1 = 0;
RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="For i = 0 To Run.TextChars.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=50462724;
 //BA.debugLineNum = 50462724;BA.debugLine="Dim c As String = Run.TextChars.Buffer(Run.TextC";
_c = _run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Buffer /*String[]*/ [(int) (_run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .StartIndex /*int*/ +_i)];
RDebugUtils.currentLine=50462725;
 //BA.debugLineNum = 50462725;BA.debugLine="If WordBoundaries.Contains(c) Then";
if (__ref._wordboundaries /*String*/ .contains(_c)) { 
RDebugUtils.currentLine=50462726;
 //BA.debugLineNum = 50462726;BA.debugLine="Dim SeparatorGoesTogetherWithText As Boolean";
_separatorgoestogetherwithtext = false;
RDebugUtils.currentLine=50462727;
 //BA.debugLineNum = 50462727;BA.debugLine="If i >= i1 + 1 Then";
if (_i>=_i1+1) { 
RDebugUtils.currentLine=50462728;
 //BA.debugLineNum = 50462728;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=50462729;
 //BA.debugLineNum = 50462729;BA.debugLine="If WordBoundariesThatCanConnectToPrevWord.Inde";
if (__ref._wordboundariesthatcanconnecttoprevword /*String*/ .indexOf(_c)>-1) { 
RDebugUtils.currentLine=50462730;
 //BA.debugLineNum = 50462730;BA.debugLine="offset = 1";
_offset = (int) (1);
RDebugUtils.currentLine=50462731;
 //BA.debugLineNum = 50462731;BA.debugLine="SeparatorGoesTogetherWithText = True";
_separatorgoestogetherwithtext = __c.True;
 };
RDebugUtils.currentLine=50462733;
 //BA.debugLineNum = 50462733;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*com.detektor.kateenapp.bctextengine._bctextchars*/ (null,_run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,_i1,(int) (_i+_offset)),_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=50462735;
 //BA.debugLineNum = 50462735;BA.debugLine="If SeparatorGoesTogetherWithText = False Then";
if (_separatorgoestogetherwithtext==__c.False) { 
RDebugUtils.currentLine=50462736;
 //BA.debugLineNum = 50462736;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
_unbreakables.Add((Object)(__ref._createunbreakable /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*com.detektor.kateenapp.bctextengine._bctextchars*/ (null,_run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,_i,(int) (_i+1)),_fm,__c.True,_style)));
 }else {
RDebugUtils.currentLine=50462738;
 //BA.debugLineNum = 50462738;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyT";
_unbreakables.Add((Object)(__ref._createunbreakable /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,_fm,__c.True,_style)));
 };
RDebugUtils.currentLine=50462740;
 //BA.debugLineNum = 50462740;BA.debugLine="i1 = i + 1";
_i1 = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=50462741;
 //BA.debugLineNum = 50462741;BA.debugLine="Else If c = Chr(13) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
RDebugUtils.currentLine=50462742;
 //BA.debugLineNum = 50462742;BA.debugLine="Continue";
if (true) continue;
 }}
;
 }
};
RDebugUtils.currentLine=50462745;
 //BA.debugLineNum = 50462745;BA.debugLine="If i1 < Run.TextChars.Length Then Unbreakables.Ad";
if (_i1<_run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Length /*int*/ ) { 
_unbreakables.Add((Object)(__ref._createunbreakable /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/ (null,_run,__ref._textcharssubstring /*com.detektor.kateenapp.bctextengine._bctextchars*/ (null,_run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,_i1,_run.TextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Length /*int*/ ),_fm,__c.False,_style)));};
RDebugUtils.currentLine=50462746;
 //BA.debugLineNum = 50462746;BA.debugLine="If Run.View.IsInitialized Then";
if (_run.View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=50462747;
 //BA.debugLineNum = 50462747;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyTex";
_unbreakables.Add((Object)(__ref._createunbreakable /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/ (null,_run,__ref._emptytextchars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,_fm,__c.False,_style)));
 };
RDebugUtils.currentLine=50462749;
 //BA.debugLineNum = 50462749;BA.debugLine="End Sub";
return "";
}
public String  _mergeunbreakables(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcunbreakabletext _un1,com.detektor.kateenapp.bctextengine._bcunbreakabletext _un2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "mergeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "mergeunbreakables", new Object[] {_un1,_un2}));}
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Private Sub MergeUnbreakables (un1 As BCUnbreakabl";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="un1.Width = un1.Width + un2.Width + mSpaceBetween";
_un1.Width /*int*/  = (int) (_un1.Width /*int*/ +_un2.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="For Each single As BCSingleStyleSection In un2.Si";
{
final anywheresoftware.b4a.BA.IterableList group2 = _un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_single = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(group2.Get(index2));
RDebugUtils.currentLine=50724867;
 //BA.debugLineNum = 50724867;BA.debugLine="single.ParentUN = un1";
_single.ParentUN /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/  = _un1;
RDebugUtils.currentLine=50724868;
 //BA.debugLineNum = 50724868;BA.debugLine="un1.Anchor = GetRunAnchorIfCurrentNotSet(single.";
_un1.Anchor /*String*/  = __ref._getrunanchorifcurrentnotset /*String*/ (null,_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ ,_un1.Anchor /*String*/ );
 }
};
RDebugUtils.currentLine=50724870;
 //BA.debugLineNum = 50724870;BA.debugLine="un1.SingleStyleSections.AddAll(un2.SingleStyleSec";
_un1.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_un2.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=50724871;
 //BA.debugLineNum = 50724871;BA.debugLine="If un1.NotFullTextChars.Length = 0 Then un1.NotFu";
if (_un1.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ .Length /*int*/ ==0) { 
_un1.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/  = _un2.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ;};
RDebugUtils.currentLine=50724872;
 //BA.debugLineNum = 50724872;BA.debugLine="End Sub";
return "";
}
public com.detektor.kateenapp.bctextengine._bctextchars  _textcharssubstring(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextchars _tc,int _startindex,int _endindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharssubstring", true))
	 {return ((com.detektor.kateenapp.bctextengine._bctextchars) Debug.delegate(ba, "textcharssubstring", new Object[] {_tc,_startindex,_endindex}));}
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Private Sub TextCharsSubstring(TC As BCTextChars,";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="Return CreateBCTextChars(TC.Buffer, StartIndex +";
if (true) return __ref._createbctextchars /*com.detektor.kateenapp.bctextengine._bctextchars*/ (null,_tc.Buffer /*String[]*/ ,(int) (_startindex+_tc.StartIndex /*int*/ ),(int) (_endindex-_startindex));
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="End Sub";
return null;
}
public String  _setspacebetweencharacters(com.detektor.kateenapp.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweencharacters", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweencharacters", new Object[] {_f}));}
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Public Sub setSpaceBetweenCharacters(f As Float)";
RDebugUtils.currentLine=52494337;
 //BA.debugLineNum = 52494337;BA.debugLine="mSpaceBetweenCharacters = f * mScale";
__ref._mspacebetweencharacters /*float*/  = (float) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=52494338;
 //BA.debugLineNum = 52494338;BA.debugLine="End Sub";
return "";
}
public String  _setspacebetweenlines(com.detektor.kateenapp.bctextengine __ref,float _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setspacebetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setspacebetweenlines", new Object[] {_f}));}
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Public Sub setSpaceBetweenLines(f As Float)";
RDebugUtils.currentLine=52625409;
 //BA.debugLineNum = 52625409;BA.debugLine="mSpaceBetweenLines = f * mScale";
__ref._mspacebetweenlines /*int*/  = (int) (_f*__ref._mscale /*float*/ );
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="End Sub";
return "";
}
public boolean  _isspace(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "isspace", true))
	 {return ((Boolean) Debug.delegate(ba, "isspace", new Object[] {_tc}));}
RDebugUtils.currentLine=51773440;
 //BA.debugLineNum = 51773440;BA.debugLine="Private Sub IsSpace(TC As BCTextChars) As Boolean";
RDebugUtils.currentLine=51773441;
 //BA.debugLineNum = 51773441;BA.debugLine="Return TextCharEquals(TC, \" \")";
if (true) return __ref._textcharequals /*boolean*/ (null,_tc," ");
RDebugUtils.currentLine=51773442;
 //BA.debugLineNum = 51773442;BA.debugLine="End Sub";
return false;
}
public boolean  _textcharequals(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextchars _tc,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "textcharequals", true))
	 {return ((Boolean) Debug.delegate(ba, "textcharequals", new Object[] {_tc,_s}));}
int _i = 0;
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Private Sub TextCharEquals (TC As BCTextChars, s A";
RDebugUtils.currentLine=53018625;
 //BA.debugLineNum = 53018625;BA.debugLine="If TC.Length <> s.Length Then Return False";
if (_tc.Length /*int*/ !=_s.length()) { 
if (true) return __c.False;};
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="For i = 0 To TC.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_tc.Length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=53018627;
 //BA.debugLineNum = 53018627;BA.debugLine="If TC.Buffer(i + TC.StartIndex) <> s.CharAt(i) T";
if ((_tc.Buffer /*String[]*/ [(int) (_i+_tc.StartIndex /*int*/ )]).equals(BA.ObjectToString(_s.charAt(_i))) == false) { 
if (true) return __c.False;};
 }
};
RDebugUtils.currentLine=53018629;
 //BA.debugLineNum = 53018629;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=53018630;
 //BA.debugLineNum = 53018630;BA.debugLine="End Sub";
return false;
}
public String  _organizelines(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizelines", true))
	 {return ((String) Debug.delegate(ba, "organizelines", new Object[] {_p}));}
String _paralignment = "";
int _count = 0;
int _prevlinebelowbaselineheight = 0;
com.detektor.kateenapp.bctextengine._bctextline _line = null;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
int _maxwidth = 0;
String _alignment = "";
com.detektor.kateenapp.bctextengine._bcsinglestylesection _linestyle = null;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _last = null;
int _numberofgaps = 0;
float _delta = 0f;
float _accumalated = 0f;
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Private Sub OrganizeLines (p As BCParagraph)";
RDebugUtils.currentLine=49938433;
 //BA.debugLineNum = 49938433;BA.debugLine="Dim ParAlignment As String = p.Style.HorizontalAl";
_paralignment = _p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .HorizontalAlignment /*String*/ .toLowerCase();
RDebugUtils.currentLine=49938434;
 //BA.debugLineNum = 49938434;BA.debugLine="Dim count As Int";
_count = 0;
RDebugUtils.currentLine=49938435;
 //BA.debugLineNum = 49938435;BA.debugLine="Dim PrevLineBelowBaselineHeight As Int";
_prevlinebelowbaselineheight = 0;
RDebugUtils.currentLine=49938436;
 //BA.debugLineNum = 49938436;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group4.Get(index4));
RDebugUtils.currentLine=49938437;
 //BA.debugLineNum = 49938437;BA.debugLine="p.Width = Max(p.Width, line.Width)";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,_line.Width /*int*/ ));
RDebugUtils.currentLine=49938438;
 //BA.debugLineNum = 49938438;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=49938439;
 //BA.debugLineNum = 49938439;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group7 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_single = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(group7.Get(index7));
RDebugUtils.currentLine=49938440;
 //BA.debugLineNum = 49938440;BA.debugLine="line.MaxHeightAboveBaseLine = Max(single.MaxHe";
_line.MaxHeightAboveBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightAboveBaseLine /*int*/ ,_line.MaxHeightAboveBaseLine /*int*/ ));
RDebugUtils.currentLine=49938441;
 //BA.debugLineNum = 49938441;BA.debugLine="line.MaxHeightBelowBaseLine = Max(single.MaxHe";
_line.MaxHeightBelowBaseLine /*int*/  = (int) (__c.Max(_single.MaxHeightBelowBaseLine /*int*/ ,_line.MaxHeightBelowBaseLine /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=49938444;
 //BA.debugLineNum = 49938444;BA.debugLine="If count = 0 Then";
if (_count==0) { 
RDebugUtils.currentLine=49938445;
 //BA.debugLineNum = 49938445;BA.debugLine="line.Height = line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = _line.MaxHeightAboveBaseLine /*int*/ ;
 }else {
RDebugUtils.currentLine=49938447;
 //BA.debugLineNum = 49938447;BA.debugLine="line.Height =  Max(line.MaxHeightAboveBaseLine";
_line.Height /*int*/  = (int) (__c.Max(_line.MaxHeightAboveBaseLine /*int*/ +_prevlinebelowbaselineheight+__ref._mmingapbetweenlines /*int*/ *__ref._mscale /*float*/ ,__ref._mspacebetweenlines /*int*/ *_p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .LineSpacingFactor /*float*/ ));
 };
RDebugUtils.currentLine=49938449;
 //BA.debugLineNum = 49938449;BA.debugLine="p.Height = p.Height + line.Height";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.Height /*int*/ );
RDebugUtils.currentLine=49938450;
 //BA.debugLineNum = 49938450;BA.debugLine="line.BaselineY = p.Height";
_line.BaselineY /*int*/  = _p.Height /*int*/ ;
RDebugUtils.currentLine=49938451;
 //BA.debugLineNum = 49938451;BA.debugLine="PrevLineBelowBaselineHeight = line.MaxHeightBelo";
_prevlinebelowbaselineheight = _line.MaxHeightBelowBaseLine /*int*/ ;
RDebugUtils.currentLine=49938452;
 //BA.debugLineNum = 49938452;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
};
RDebugUtils.currentLine=49938454;
 //BA.debugLineNum = 49938454;BA.debugLine="Dim MaxWidth As Int = (p.Style.MaxWidth - p.Style";
_maxwidth = (int) ((_p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ );
RDebugUtils.currentLine=49938455;
 //BA.debugLineNum = 49938455;BA.debugLine="p.Width = Min(MaxWidth, p.Width)";
_p.Width /*int*/  = (int) (__c.Min(_maxwidth,_p.Width /*int*/ ));
RDebugUtils.currentLine=49938456;
 //BA.debugLineNum = 49938456;BA.debugLine="p.Height = p.Height + line.MaxHeightBelowBaseLine";
_p.Height /*int*/  = (int) (_p.Height /*int*/ +_line.MaxHeightBelowBaseLine /*int*/ );
RDebugUtils.currentLine=49938457;
 //BA.debugLineNum = 49938457;BA.debugLine="Dim alignment As String";
_alignment = "";
RDebugUtils.currentLine=49938458;
 //BA.debugLineNum = 49938458;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group26 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen26 = group26.getSize()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group26.Get(index26));
RDebugUtils.currentLine=49938459;
 //BA.debugLineNum = 49938459;BA.debugLine="If line.Unbreakables.Size = 0 Then Continue";
if (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) continue;};
RDebugUtils.currentLine=49938460;
 //BA.debugLineNum = 49938460;BA.debugLine="Dim linestyle As BCSingleStyleSection = GetFirst";
_linestyle = __ref._getfirstsinglestyle /*com.detektor.kateenapp.bctextengine._bcsinglestylesection*/ (null,_line);
RDebugUtils.currentLine=49938461;
 //BA.debugLineNum = 49938461;BA.debugLine="If linestyle.Run.HorizontalAlignment = \"\" Then a";
if ((_linestyle.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ ).equals("")) { 
_alignment = _paralignment;}
else {
_alignment = _linestyle.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .HorizontalAlignment /*String*/ .toLowerCase();};
RDebugUtils.currentLine=49938462;
 //BA.debugLineNum = 49938462;BA.debugLine="If alignment = \"left\" Then";
if ((_alignment).equals("left")) { 
RDebugUtils.currentLine=49938463;
 //BA.debugLineNum = 49938463;BA.debugLine="If linestyle.Run.IndentLevel > 0 Then";
if (_linestyle.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .IndentLevel /*int*/ >0) { 
RDebugUtils.currentLine=49938464;
 //BA.debugLineNum = 49938464;BA.debugLine="line.StartX = IndentWidth * linestyle.Run.Inde";
_line.StartX /*int*/  = (int) (__ref._indentwidth /*int*/ *_linestyle.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=49938465;
 //BA.debugLineNum = 49938465;BA.debugLine="p.Width = Max(p.Width, Min(MaxWidth, line.Widt";
_p.Width /*int*/  = (int) (__c.Max(_p.Width /*int*/ ,__c.Min(_maxwidth,_line.Width /*int*/ +_line.StartX /*int*/ )));
 };
 }else {
RDebugUtils.currentLine=49938468;
 //BA.debugLineNum = 49938468;BA.debugLine="p.Width = MaxWidth";
_p.Width /*int*/  = _maxwidth;
 };
RDebugUtils.currentLine=49938470;
 //BA.debugLineNum = 49938470;BA.debugLine="Select alignment";
switch (BA.switchObjectToInt(_alignment,"center","right","justify")) {
case 0: {
RDebugUtils.currentLine=49938472;
 //BA.debugLineNum = 49938472;BA.debugLine="line.StartX = p.Width / 2 - line.Width / 2";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ /(double)2-_line.Width /*int*/ /(double)2);
 break; }
case 1: {
RDebugUtils.currentLine=49938474;
 //BA.debugLineNum = 49938474;BA.debugLine="line.StartX = p.Width - line.Width";
_line.StartX /*int*/  = (int) (_p.Width /*int*/ -_line.Width /*int*/ );
 break; }
case 2: {
RDebugUtils.currentLine=49938476;
 //BA.debugLineNum = 49938476;BA.debugLine="If line.EndsWithSoftLineBreak Then";
if (_line.EndsWithSoftLineBreak /*boolean*/ ) { 
RDebugUtils.currentLine=49938477;
 //BA.debugLineNum = 49938477;BA.debugLine="Dim last As BCUnbreakableText = line.Unbreaka";
_last = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=49938478;
 //BA.debugLineNum = 49938478;BA.debugLine="If IsSpace(last.NotFullTextChars) Then";
if (__ref._isspace /*boolean*/ (null,_last.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ )) { 
RDebugUtils.currentLine=49938479;
 //BA.debugLineNum = 49938479;BA.debugLine="line.Unbreakables.RemoveAt(line.Unbreakables";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=49938480;
 //BA.debugLineNum = 49938480;BA.debugLine="line.Width = line.Width - last.Width";
_line.Width /*int*/  = (int) (_line.Width /*int*/ -_last.Width /*int*/ );
 };
RDebugUtils.currentLine=49938482;
 //BA.debugLineNum = 49938482;BA.debugLine="Dim NumberOfGaps As Int = line.Unbreakables.S";
_numberofgaps = (int) (_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=49938483;
 //BA.debugLineNum = 49938483;BA.debugLine="If NumberOfGaps > 0 Then";
if (_numberofgaps>0) { 
RDebugUtils.currentLine=49938484;
 //BA.debugLineNum = 49938484;BA.debugLine="Dim delta As Float = (p.Width - line.Width)";
_delta = (float) ((_p.Width /*int*/ -_line.Width /*int*/ )/(double)_numberofgaps);
RDebugUtils.currentLine=49938485;
 //BA.debugLineNum = 49938485;BA.debugLine="Dim accumalated As Float = 0";
_accumalated = (float) (0);
RDebugUtils.currentLine=49938486;
 //BA.debugLineNum = 49938486;BA.debugLine="For Each un As BCUnbreakableText In line.Unb";
{
final anywheresoftware.b4a.BA.IterableList group54 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen54 = group54.getSize()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group54.Get(index54));
RDebugUtils.currentLine=49938487;
 //BA.debugLineNum = 49938487;BA.debugLine="un.StartX = un.StartX + accumalated";
_un.StartX /*int*/  = (int) (_un.StartX /*int*/ +_accumalated);
RDebugUtils.currentLine=49938488;
 //BA.debugLineNum = 49938488;BA.debugLine="accumalated = accumalated + delta";
_accumalated = (float) (_accumalated+_delta);
 }
};
 };
 };
 break; }
}
;
 }
};
RDebugUtils.currentLine=49938494;
 //BA.debugLineNum = 49938494;BA.debugLine="End Sub";
return "";
}
public String  _organizertlparagraph(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _par) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizertlparagraph", true))
	 {return ((String) Debug.delegate(ba, "organizertlparagraph", new Object[] {_par}));}
anywheresoftware.b4a.objects.collections.List _ltrlist = null;
com.detektor.kateenapp.bctextengine._bctextline _line = null;
anywheresoftware.b4a.objects.collections.List _newlist = null;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=50003968;
 //BA.debugLineNum = 50003968;BA.debugLine="Private Sub OrganizeRTLParagraph (par As BCParagra";
RDebugUtils.currentLine=50003969;
 //BA.debugLineNum = 50003969;BA.debugLine="Dim LTRList As List";
_ltrlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="LTRList.Initialize";
_ltrlist.Initialize();
RDebugUtils.currentLine=50003972;
 //BA.debugLineNum = 50003972;BA.debugLine="For Each line As BCTextLine In par.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group3 = _par.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group3.Get(index3));
RDebugUtils.currentLine=50003973;
 //BA.debugLineNum = 50003973;BA.debugLine="Dim NewList As List";
_newlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50003974;
 //BA.debugLineNum = 50003974;BA.debugLine="NewList.Initialize";
_newlist.Initialize();
RDebugUtils.currentLine=50003978;
 //BA.debugLineNum = 50003978;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group6 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group6.Get(index6));
RDebugUtils.currentLine=50003979;
 //BA.debugLineNum = 50003979;BA.debugLine="If un.RTL Then";
if (_un.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=50003980;
 //BA.debugLineNum = 50003980;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=50003981;
 //BA.debugLineNum = 50003981;BA.debugLine="NewList.Add(un)";
_newlist.Add((Object)(_un));
 }else {
RDebugUtils.currentLine=50003983;
 //BA.debugLineNum = 50003983;BA.debugLine="LTRList.InsertAt(0, un)";
_ltrlist.InsertAt((int) (0),(Object)(_un));
 };
 }
};
RDebugUtils.currentLine=50003986;
 //BA.debugLineNum = 50003986;BA.debugLine="AddLTRItems(LTRList, NewList)";
__ref._addltritems /*String*/ (null,_ltrlist,_newlist);
RDebugUtils.currentLine=50003987;
 //BA.debugLineNum = 50003987;BA.debugLine="line.Unbreakables = NewList";
_line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/  = _newlist;
RDebugUtils.currentLine=50003992;
 //BA.debugLineNum = 50003992;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group16 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group16.Get(index16));
RDebugUtils.currentLine=50003993;
 //BA.debugLineNum = 50003993;BA.debugLine="un.StartX = line.Width - un.StartX";
_un.StartX /*int*/  = (int) (_line.Width /*int*/ -_un.StartX /*int*/ );
RDebugUtils.currentLine=50003994;
 //BA.debugLineNum = 50003994;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=50003995;
 //BA.debugLineNum = 50003995;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group19 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_single = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(group19.Get(index19));
RDebugUtils.currentLine=50003996;
 //BA.debugLineNum = 50003996;BA.debugLine="x = x - single.Width";
_x = (int) (_x-_single.Width /*int*/ );
RDebugUtils.currentLine=50003997;
 //BA.debugLineNum = 50003997;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=50003998;
 //BA.debugLineNum = 50003998;BA.debugLine="x = x - mSpaceBetweenCharacters";
_x = (int) (_x-__ref._mspacebetweencharacters /*float*/ );
RDebugUtils.currentLine=50003999;
 //BA.debugLineNum = 50003999;BA.debugLine="If single.Run.View.IsInitialized Then";
if (_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=50004000;
 //BA.debugLineNum = 50004000;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=50004001;
 //BA.debugLineNum = 50004001;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ ));
 };
 }
};
 }
};
 }
};
RDebugUtils.currentLine=50004006;
 //BA.debugLineNum = 50004006;BA.debugLine="End Sub";
return "";
}
public String  _organizesinglestyles(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizesinglestyles", true))
	 {return ((String) Debug.delegate(ba, "organizesinglestyles", new Object[] {_p}));}
com.detektor.kateenapp.bctextengine._bctextline _line = null;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
int _x = 0;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _single = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
com.detektor.kateenapp.bctextengine._bcparagraph _par = null;
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Private Sub OrganizeSingleStyles (p As BCParagraph";
RDebugUtils.currentLine=50200577;
 //BA.debugLineNum = 50200577;BA.debugLine="For Each line As BCTextLine In p.TextLines";
{
final anywheresoftware.b4a.BA.IterableList group1 = _p.TextLines /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (com.detektor.kateenapp.bctextengine._bctextline)(group1.Get(index1));
RDebugUtils.currentLine=50200578;
 //BA.debugLineNum = 50200578;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
{
final anywheresoftware.b4a.BA.IterableList group2 = _line.Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group2.Get(index2));
RDebugUtils.currentLine=50200579;
 //BA.debugLineNum = 50200579;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
_x = (int) (_line.StartX /*int*/ +_un.StartX /*int*/ );
RDebugUtils.currentLine=50200580;
 //BA.debugLineNum = 50200580;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
{
final anywheresoftware.b4a.BA.IterableList group4 = _un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_single = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(group4.Get(index4));
RDebugUtils.currentLine=50200581;
 //BA.debugLineNum = 50200581;BA.debugLine="single.AbsoluteStartX = x";
_single.AbsoluteStartX /*int*/  = _x;
RDebugUtils.currentLine=50200582;
 //BA.debugLineNum = 50200582;BA.debugLine="If single.GlyphsAndOffsets.Size = 0 And single";
if (_single.GlyphsAndOffsets /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0 && _single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=50200583;
 //BA.debugLineNum = 50200583;BA.debugLine="Dim v As B4XView = single.Run.View";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .View /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=50200584;
 //BA.debugLineNum = 50200584;BA.debugLine="Dim par As BCParagraph = single.ParentUN.Pare";
_par = _single.ParentUN /*com.detektor.kateenapp.bctextengine._bcunbreakabletext*/ .ParentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .ParentParagraph /*com.detektor.kateenapp.bctextengine._bcparagraph*/ ;
RDebugUtils.currentLine=50200585;
 //BA.debugLineNum = 50200585;BA.debugLine="If par.Views.IsInitialized = False Then par.V";
if (_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=50200586;
 //BA.debugLineNum = 50200586;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
_v.setLeft((int) ((_x+__ref._mspacebetweencharacters /*float*/ )/(double)__ref._mscale /*float*/ ));
RDebugUtils.currentLine=50200587;
 //BA.debugLineNum = 50200587;BA.debugLine="v.Top = line.BaselineY / mScale - v.Height +";
_v.setTop((int) (_line.BaselineY /*int*/ /(double)__ref._mscale /*float*/ -_v.getHeight()+_single.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .VerticalOffset /*int*/ ));
RDebugUtils.currentLine=50200588;
 //BA.debugLineNum = 50200588;BA.debugLine="par.Views.Add(v)";
_par.Views /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_v.getObject()));
 };
RDebugUtils.currentLine=50200590;
 //BA.debugLineNum = 50200590;BA.debugLine="x = x + single.Width + mSpaceBetweenCharacters";
_x = (int) (_x+_single.Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );
 }
};
 }
};
 }
};
RDebugUtils.currentLine=50200594;
 //BA.debugLineNum = 50200594;BA.debugLine="End Sub";
return "";
}
public String  _organizeunbreakables(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bcparagraph _p,anywheresoftware.b4a.objects.collections.List _unbreakables) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "organizeunbreakables", true))
	 {return ((String) Debug.delegate(ba, "organizeunbreakables", new Object[] {_p,_unbreakables}));}
com.detektor.kateenapp.bctextengine._bcunbreakabletext _un = null;
int _i = 0;
com.detektor.kateenapp.bctextengine._bcunbreakabletext _nextun = null;
com.detektor.kateenapp.bctextengine._bcsinglestylesection _singlestyle = null;
int _indent = 0;
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="Private Sub OrganizeUnbreakables (p As BCParagraph";
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="If unbreakables.Size = 0 Then Return";
if (_unbreakables.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=50659330;
 //BA.debugLineNum = 50659330;BA.debugLine="Dim un As BCUnbreakableText = unbreakables.Get(0)";
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_unbreakables.Get((int) (0)));
RDebugUtils.currentLine=50659331;
 //BA.debugLineNum = 50659331;BA.debugLine="Dim i As Int = 1";
_i = (int) (1);
RDebugUtils.currentLine=50659332;
 //BA.debugLineNum = 50659332;BA.debugLine="Do While i < unbreakables.Size";
while (_i<_unbreakables.getSize()) {
RDebugUtils.currentLine=50659333;
 //BA.debugLineNum = 50659333;BA.debugLine="Dim NextUn As BCUnbreakableText = unbreakables.G";
_nextun = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(_unbreakables.Get(_i));
RDebugUtils.currentLine=50659334;
 //BA.debugLineNum = 50659334;BA.debugLine="If un.IsMergable = True And NextUn.IsMergable =";
if (_un.IsMergable /*boolean*/ ==__c.True && _nextun.IsMergable /*boolean*/ ==__c.True && _un.RTL /*boolean*/ ==_nextun.RTL /*boolean*/ ) { 
RDebugUtils.currentLine=50659335;
 //BA.debugLineNum = 50659335;BA.debugLine="MergeUnbreakables(un, NextUn)";
__ref._mergeunbreakables /*String*/ (null,_un,_nextun);
RDebugUtils.currentLine=50659336;
 //BA.debugLineNum = 50659336;BA.debugLine="unbreakables.RemoveAt(i)";
_unbreakables.RemoveAt(_i);
RDebugUtils.currentLine=50659337;
 //BA.debugLineNum = 50659337;BA.debugLine="i = i - 1";
_i = (int) (_i-1);
 }else {
RDebugUtils.currentLine=50659339;
 //BA.debugLineNum = 50659339;BA.debugLine="un = NextUn";
_un = _nextun;
 };
RDebugUtils.currentLine=50659341;
 //BA.debugLineNum = 50659341;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=50659343;
 //BA.debugLineNum = 50659343;BA.debugLine="For Each un As BCUnbreakableText In unbreakables";
{
final anywheresoftware.b4a.BA.IterableList group15 = _unbreakables;
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_un = (com.detektor.kateenapp.bctextengine._bcunbreakabletext)(group15.Get(index15));
RDebugUtils.currentLine=50659344;
 //BA.debugLineNum = 50659344;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(13))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (13))))) { 
if (true) continue;};
RDebugUtils.currentLine=50659345;
 //BA.debugLineNum = 50659345;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(10))";
if (__ref._textcharequals /*boolean*/ (null,_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ,BA.ObjectToString(__c.Chr((int) (10))))) { 
RDebugUtils.currentLine=50659346;
 //BA.debugLineNum = 50659346;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
RDebugUtils.currentLine=50659347;
 //BA.debugLineNum = 50659347;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=50659349;
 //BA.debugLineNum = 50659349;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 And p.Sty";
if (_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0 && _p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .WordWrap /*boolean*/ ) { 
RDebugUtils.currentLine=50659350;
 //BA.debugLineNum = 50659350;BA.debugLine="Dim SingleStyle As BCSingleStyleSection = un.Si";
_singlestyle = (com.detektor.kateenapp.bctextengine._bcsinglestylesection)(_un.SingleStyleSections /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=50659351;
 //BA.debugLineNum = 50659351;BA.debugLine="Dim indent As Int = IndentWidth * SingleStyle.R";
_indent = (int) (__ref._indentwidth /*int*/ *_singlestyle.Run /*com.detektor.kateenapp.bctextengine._bctextrun*/ .IndentLevel /*int*/ );
RDebugUtils.currentLine=50659352;
 //BA.debugLineNum = 50659352;BA.debugLine="If p.CurrentLine.Width + mSpaceBetweenCharacter";
if (_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ +_un.Width /*int*/ +_indent>(_p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .MaxWidth /*int*/ -_p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getLeft()-_p.Style /*com.detektor.kateenapp.bctextengine._bcparagraphstyle*/ .Padding /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .getRight())*__ref._mscale /*float*/ ) { 
RDebugUtils.currentLine=50659353;
 //BA.debugLineNum = 50659353;BA.debugLine="p.CurrentLine.EndsWithSoftLineBreak = True";
_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .EndsWithSoftLineBreak /*boolean*/  = __c.True;
RDebugUtils.currentLine=50659354;
 //BA.debugLineNum = 50659354;BA.debugLine="CreateLine(p)";
__ref._createline /*String*/ (null,_p);
 };
 };
RDebugUtils.currentLine=50659357;
 //BA.debugLineNum = 50659357;BA.debugLine="p.CurrentLine.Unbreakables.Add(un)";
_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_un));
RDebugUtils.currentLine=50659358;
 //BA.debugLineNum = 50659358;BA.debugLine="un.ParentLine = p.CurrentLine";
_un.ParentLine /*com.detektor.kateenapp.bctextengine._bctextline*/  = _p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ ;
RDebugUtils.currentLine=50659359;
 //BA.debugLineNum = 50659359;BA.debugLine="If un.Anchor <> \"\" Then";
if ((_un.Anchor /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=50659360;
 //BA.debugLineNum = 50659360;BA.debugLine="If p.Anchors.IsInitialized = False Then p.Ancho";
if (_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=50659361;
 //BA.debugLineNum = 50659361;BA.debugLine="p.Anchors.Put(un.Anchor, p.CurrentLine)";
_p.Anchors /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_un.Anchor /*String*/ ),(Object)(_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ ));
 };
RDebugUtils.currentLine=50659363;
 //BA.debugLineNum = 50659363;BA.debugLine="If IsSpace(un.NotFullTextChars) And p.CurrentLin";
if (__ref._isspace /*boolean*/ (null,_un.NotFullTextChars /*com.detektor.kateenapp.bctextengine._bctextchars*/ ) && _p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=50659364;
 //BA.debugLineNum = 50659364;BA.debugLine="un.Width = 0";
_un.Width /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=50659366;
 //BA.debugLineNum = 50659366;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 Then p.Cu";
if (_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Unbreakables /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Width /*int*/ +__ref._mspacebetweencharacters /*float*/ );};
RDebugUtils.currentLine=50659367;
 //BA.debugLineNum = 50659367;BA.debugLine="un.StartX = p.CurrentLine.Width";
_un.StartX /*int*/  = _p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Width /*int*/ ;
RDebugUtils.currentLine=50659368;
 //BA.debugLineNum = 50659368;BA.debugLine="p.CurrentLine.Width = p.CurrentLine.Width + un.W";
_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Width /*int*/  = (int) (_p.CurrentLine /*com.detektor.kateenapp.bctextengine._bctextline*/ .Width /*int*/ +_un.Width /*int*/ );
 }
};
RDebugUtils.currentLine=50659370;
 //BA.debugLineNum = 50659370;BA.debugLine="End Sub";
return "";
}
public String  _printtextchars(com.detektor.kateenapp.bctextengine __ref,com.detektor.kateenapp.bctextengine._bctextchars _tc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "printtextchars", true))
	 {return ((String) Debug.delegate(ba, "printtextchars", new Object[] {_tc}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=53215232;
 //BA.debugLineNum = 53215232;BA.debugLine="Public Sub PrintTextChars(TC As BCTextChars)";
RDebugUtils.currentLine=53215233;
 //BA.debugLineNum = 53215233;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=53215234;
 //BA.debugLineNum = 53215234;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=53215235;
 //BA.debugLineNum = 53215235;BA.debugLine="For i = TC.StartIndex To TC.StartIndex + TC.Lengt";
{
final int step3 = 1;
final int limit3 = (int) (_tc.StartIndex /*int*/ +_tc.Length /*int*/ -1);
_i = _tc.StartIndex /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=53215236;
 //BA.debugLineNum = 53215236;BA.debugLine="sb.Append(TC.Buffer(i))";
_sb.Append(_tc.Buffer /*String[]*/ [_i]);
 }
};
RDebugUtils.currentLine=53215238;
 //BA.debugLineNum = 53215238;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("953215238",_sb.ToString(),0);
RDebugUtils.currentLine=53215239;
 //BA.debugLineNum = 53215239;BA.debugLine="End Sub";
return "";
}
public String  _releaseasyncbc(com.detektor.kateenapp.bctextengine __ref,b4a.example.bitmapcreator _bc) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "releaseasyncbc", true))
	 {return ((String) Debug.delegate(ba, "releaseasyncbc", new Object[] {_bc}));}
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Public Sub ReleaseAsyncBC(bc As BitmapCreator)";
RDebugUtils.currentLine=51314689;
 //BA.debugLineNum = 51314689;BA.debugLine="AsyncBCs.Put(bc, False)";
__ref._asyncbcs /*com.detektor.kateenapp.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_bc),(Object)(__c.False));
RDebugUtils.currentLine=51314690;
 //BA.debugLineNum = 51314690;BA.debugLine="End Sub";
return "";
}
public String  _setmingapbetweenlines(com.detektor.kateenapp.bctextengine __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="bctextengine";
if (Debug.shouldDelegate(ba, "setmingapbetweenlines", true))
	 {return ((String) Debug.delegate(ba, "setmingapbetweenlines", new Object[] {_i}));}
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Public Sub setMinGapBetweenLines(i As Int)";
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="mMinGapBetweenLines = i";
__ref._mmingapbetweenlines /*int*/  = _i;
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="End Sub";
return "";
}
}