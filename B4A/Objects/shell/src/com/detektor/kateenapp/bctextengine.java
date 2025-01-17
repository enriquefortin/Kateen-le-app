
package com.detektor.kateenapp;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bctextengine {
    public static RemoteObject myClass;
	public bctextengine() {
	}
    public static PCBA staticBA = new PCBA(null, bctextengine.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _extra_connectedruns = RemoteObject.createImmutable("");
public static RemoteObject _extra_styledunderline = RemoteObject.createImmutable("");
public static RemoteObject _charbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _cbccache = RemoteObject.declareNull("b4a.example.bitmapcreator._internalcompressedbccache");
public static RemoteObject _defaultunderlinestyle = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcstyledunderline");
public static RemoteObject _mscale = RemoteObject.createImmutable(0f);
public static RemoteObject _mspacebetweencharacters = RemoteObject.createImmutable(0f);
public static RemoteObject _mspacebetweenlines = RemoteObject.createImmutable(0);
public static RemoteObject _fontmetricscache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _foregroundbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _backgroundbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _defaultcolor = RemoteObject.createImmutable(0);
public static RemoteObject _wordboundaries = RemoteObject.createImmutable("");
public static RemoteObject _wordboundariesthatcanconnecttoprevword = RemoteObject.createImmutable("");
public static RemoteObject _brushes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _defaultstyle = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcparagraphstyle");
public static RemoteObject _defaultfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _mmingapbetweenlines = RemoteObject.createImmutable(0);
public static RemoteObject _stubforcontext = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tabwidthmeasuredinx = RemoteObject.createImmutable(0);
public static RemoteObject _tagparser = RemoteObject.declareNull("com.detektor.kateenapp.bbcodeparser");
public static RemoteObject _emptytextchars = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextchars");
public static RemoteObject _emojis = RemoteObject.declareNull("com.detektor.kateenapp.b4xset");
public static RemoteObject _charset = RemoteObject.createImmutable("");
public static RemoteObject _lookforcomplexcharacters = RemoteObject.createImmutable(false);
public static RemoteObject _customfonts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _kerningenabled = RemoteObject.createImmutable(false);
public static RemoteObject _indentwidth = RemoteObject.createImmutable(0);
public static RemoteObject _vowelscodepoints = RemoteObject.declareNull("com.detektor.kateenapp.b4xset");
public static RemoteObject _asyncbcs = RemoteObject.declareNull("com.detektor.kateenapp.b4xorderedmap");
public static RemoteObject _asyncbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _asynctasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _asyncmode = RemoteObject.createImmutable(false);
public static RemoteObject _rtlchars = RemoteObject.declareNull("com.detektor.kateenapp.b4xset");
public static RemoteObject _textdirectionltr = RemoteObject.createImmutable(0);
public static RemoteObject _textdirectionunknown = RemoteObject.createImmutable(0);
public static RemoteObject _textdirectionrtl = RemoteObject.createImmutable(0);
public static RemoteObject _arabicmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _arabicnonlinkedletters = RemoteObject.declareNull("com.detektor.kateenapp.b4xset");
public static RemoteObject _arabiccharsconnectedprev = RemoteObject.declareNull("com.detektor.kateenapp.b4xset");
public static RemoteObject _pmdefaultcolor = RemoteObject.declareNull("b4a.example.bitmapcreator._premultipliedcolor");
public static RemoteObject _rtlaware = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.detektor.kateenapp.main _main = null;
public static com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public static com.detektor.kateenapp.starter _starter = null;
public static com.detektor.kateenapp.b4xpages _b4xpages = null;
public static com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public static com.detektor.kateenapp.httputils2service _httputils2service = null;
public static com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ArabicCharsConnectedPrev",_ref.getField(false, "_arabiccharsconnectedprev"),"ArabicMap",_ref.getField(false, "_arabicmap"),"ArabicNonLinkedLetters",_ref.getField(false, "_arabicnonlinkedletters"),"AsyncBC",_ref.getField(false, "_asyncbc"),"AsyncBCs",_ref.getField(false, "_asyncbcs"),"AsyncMode",_ref.getField(false, "_asyncmode"),"AsyncTasks",_ref.getField(false, "_asynctasks"),"BackgroundBC",_ref.getField(false, "_backgroundbc"),"Brushes",_ref.getField(false, "_brushes"),"cbccache",_ref.getField(false, "_cbccache"),"CharBC",_ref.getField(false, "_charbc"),"Charset",_ref.getField(false, "_charset"),"CustomFonts",_ref.getField(false, "_customfonts"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultColor",_ref.getField(false, "_defaultcolor"),"DefaultFont",_ref.getField(false, "_defaultfont"),"DefaultStyle",_ref.getField(false, "_defaultstyle"),"DefaultUnderlineStyle",_ref.getField(false, "_defaultunderlinestyle"),"Emojis",_ref.getField(false, "_emojis"),"EmptyTextChars",_ref.getField(false, "_emptytextchars"),"EXTRA_CONNECTEDRUNS",_ref.getField(false, "_extra_connectedruns"),"EXTRA_STYLEDUNDERLINE",_ref.getField(false, "_extra_styledunderline"),"FontMetricsCache",_ref.getField(false, "_fontmetricscache"),"ForegroundBC",_ref.getField(false, "_foregroundbc"),"IndentWidth",_ref.getField(false, "_indentwidth"),"KerningEnabled",_ref.getField(false, "_kerningenabled"),"LookForComplexCharacters",_ref.getField(false, "_lookforcomplexcharacters"),"mMinGapBetweenLines",_ref.getField(false, "_mmingapbetweenlines"),"mScale",_ref.getField(false, "_mscale"),"mSpaceBetweenCharacters",_ref.getField(false, "_mspacebetweencharacters"),"mSpaceBetweenLines",_ref.getField(false, "_mspacebetweenlines"),"PMDefaultColor",_ref.getField(false, "_pmdefaultcolor"),"RTLAware",_ref.getField(false, "_rtlaware"),"RTLChars",_ref.getField(false, "_rtlchars"),"stubForContext",_ref.getField(false, "_stubforcontext"),"TabWidthMeasuredInX",_ref.getField(false, "_tabwidthmeasuredinx"),"TagParser",_ref.getField(false, "_tagparser"),"TextDirectionLTR",_ref.getField(false, "_textdirectionltr"),"TextDirectionRTL",_ref.getField(false, "_textdirectionrtl"),"TextDirectionUnknown",_ref.getField(false, "_textdirectionunknown"),"VowelsCodePoints",_ref.getField(false, "_vowelscodepoints"),"WordBoundaries",_ref.getField(false, "_wordboundaries"),"WordBoundariesThatCanConnectToPrevWord",_ref.getField(false, "_wordboundariesthatcanconnecttoprevword"),"xui",_ref.getField(false, "_xui")};
}
}