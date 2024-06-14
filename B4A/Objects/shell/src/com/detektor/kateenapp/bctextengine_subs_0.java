package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bctextengine_subs_0 {


public static RemoteObject  _addltritems(RemoteObject __ref,RemoteObject _ltrlist,RemoteObject _newlist) throws Exception{
try {
		Debug.PushSubsStack("AddLTRItems (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("addltritems")) { return __ref.runUserSub(false, "bctextengine","addltritems", __ref, _ltrlist, _newlist);}
RemoteObject _startindex = RemoteObject.createImmutable(0);
RemoteObject _lastindex = RemoteObject.createImmutable(0);
RemoteObject _lastun = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _prev = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
int _i = 0;
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
Debug.locals.put("LTRList", _ltrlist);
Debug.locals.put("NewList", _newlist);
 BA.debugLineNum = 341;BA.debugLine="Private Sub AddLTRItems (LTRList As List, NewList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 342;BA.debugLine="If LTRList.Size = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ltrlist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 343;BA.debugLine="NewList.AddAll(LTRList)";
Debug.JustUpdateDeviceLine();
_newlist.runVoidMethod ("AddAll",(Object)(_ltrlist));
 BA.debugLineNum = 344;BA.debugLine="If LTRList.Size > 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_ltrlist.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 345;BA.debugLine="Dim StartIndex As Int = 1";
Debug.JustUpdateDeviceLine();
_startindex = BA.numberCast(int.class, 1);Debug.locals.put("StartIndex", _startindex);Debug.locals.put("StartIndex", _startindex);
 BA.debugLineNum = 346;BA.debugLine="If IsUNSeparator(LTRList.Get(0)) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_isunseparator" /*RemoteObject*/ ,(Object)((_ltrlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 347;BA.debugLine="StartIndex = 2";
Debug.JustUpdateDeviceLine();
_startindex = BA.numberCast(int.class, 2);Debug.locals.put("StartIndex", _startindex);
 };
 BA.debugLineNum = 349;BA.debugLine="Dim LastIndex As Int = LTRList.Size - 1";
Debug.JustUpdateDeviceLine();
_lastindex = RemoteObject.solve(new RemoteObject[] {_ltrlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("LastIndex", _lastindex);Debug.locals.put("LastIndex", _lastindex);
 BA.debugLineNum = 350;BA.debugLine="If LastIndex > StartIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_lastindex,BA.numberCast(double.class, _startindex))) { 
 BA.debugLineNum = 351;BA.debugLine="If IsUNSeparator(LTRList.Get(LastIndex)) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_isunseparator" /*RemoteObject*/ ,(Object)((_ltrlist.runMethod(false,"Get",(Object)(_lastindex))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 352;BA.debugLine="LastIndex = LastIndex - 1";
Debug.JustUpdateDeviceLine();
_lastindex = RemoteObject.solve(new RemoteObject[] {_lastindex,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("LastIndex", _lastindex);
 };
 };
 BA.debugLineNum = 355;BA.debugLine="If LastIndex > StartIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_lastindex,BA.numberCast(double.class, _startindex))) { 
 BA.debugLineNum = 356;BA.debugLine="Dim lastun As BCUnbreakableText = LTRList.Get(L";
Debug.JustUpdateDeviceLine();
_lastun = (_ltrlist.runMethod(false,"Get",(Object)(_lastindex)));Debug.locals.put("lastun", _lastun);Debug.locals.put("lastun", _lastun);
 BA.debugLineNum = 357;BA.debugLine="Dim prev As BCUnbreakableText = LTRList.Get(Sta";
Debug.JustUpdateDeviceLine();
_prev = (_ltrlist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_startindex,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("prev", _prev);Debug.locals.put("prev", _prev);
 BA.debugLineNum = 358;BA.debugLine="prev.StartX = lastun.StartX";
Debug.JustUpdateDeviceLine();
_prev.setField ("StartX" /*RemoteObject*/ ,_lastun.getField(true,"StartX" /*RemoteObject*/ ));
 BA.debugLineNum = 359;BA.debugLine="For i = StartIndex To LastIndex";
Debug.JustUpdateDeviceLine();
{
final int step18 = 1;
final int limit18 = _lastindex.<Integer>get().intValue();
_i = _startindex.<Integer>get().intValue() ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 360;BA.debugLine="Dim un As BCUnbreakableText = LTRList.Get(i)";
Debug.JustUpdateDeviceLine();
_un = (_ltrlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("un", _un);Debug.locals.put("un", _un);
 BA.debugLineNum = 361;BA.debugLine="un.StartX = prev.StartX + prev.Width + mSpaceB";
Debug.JustUpdateDeviceLine();
_un.setField ("StartX" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_prev.getField(true,"StartX" /*RemoteObject*/ ),_prev.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "++",2, 0)));
 BA.debugLineNum = 362;BA.debugLine="prev = un";
Debug.JustUpdateDeviceLine();
_prev = _un;Debug.locals.put("prev", _prev);
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 366;BA.debugLine="LTRList.Clear";
Debug.JustUpdateDeviceLine();
_ltrlist.runVoidMethod ("Clear");
 BA.debugLineNum = 367;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addparagraphviews(RemoteObject __ref,RemoteObject _par) throws Exception{
try {
		Debug.PushSubsStack("AddParagraphViews (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("addparagraphviews")) { return __ref.runUserSub(false, "bctextengine","addparagraphviews", __ref, _par);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("par", _par);
 BA.debugLineNum = 220;BA.debugLine="Public Sub AddParagraphViews (par As BCParagraph)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 221;BA.debugLine="If par.Views.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_par.getField(false,"Views" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 222;BA.debugLine="For Each v As B4XView In par.Views";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group2 = _par.getField(false,"Views" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group2.runMethod(false,"Get",index2));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 223;BA.debugLine="v.SetLayoutAnimated(0, par.Style.Padding.Left +";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getLeft"),_v.runMethod(true,"getLeft")}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getTop"),_v.runMethod(true,"getTop")}, "+",1, 0))),(Object)(_v.runMethod(true,"getWidth")),(Object)(_v.runMethod(true,"getHeight")));
 }
}Debug.locals.put("v", _v);
;
 };
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bytestoint(RemoteObject __ref,RemoteObject _bytes,RemoteObject _startindex) throws Exception{
try {
		Debug.PushSubsStack("BytesToInt (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,920);
if (RapidSub.canDelegate("bytestoint")) { return __ref.runUserSub(false, "bctextengine","bytestoint", __ref, _bytes, _startindex);}
RemoteObject _cp = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Bytes", _bytes);
Debug.locals.put("StartIndex", _startindex);
 BA.debugLineNum = 920;BA.debugLine="Private Sub BytesToInt (Bytes() As Byte, StartInde";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 921;BA.debugLine="Dim cp As Int";
Debug.JustUpdateDeviceLine();
_cp = RemoteObject.createImmutable(0);Debug.locals.put("cp", _cp);
 BA.debugLineNum = 922;BA.debugLine="For i = 0 To 3";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = 3;
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 923;BA.debugLine="cp = Bit.Or(cp, Bit.ShiftLeft(Bit.And(0xff, Byte";
Debug.JustUpdateDeviceLine();
_cp = bctextengine.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_cp),(Object)(bctextengine.__c.getField(false,"Bit").runMethod(true,"ShiftLeft",(Object)(bctextengine.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, _bytes.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_startindex}, "+",1, 1)))))),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(8),RemoteObject.createImmutable(_i)}, "*",0, 1)))));Debug.locals.put("cp", _cp);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 925;BA.debugLine="Return cp";
Debug.JustUpdateDeviceLine();
if (true) return _cp;
 BA.debugLineNum = 926;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
bctextengine._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bctextengine._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public cvs As B4XCanvas";
bctextengine._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",bctextengine._cvs);
 //BA.debugLineNum = 4;BA.debugLine="Type BCFontMetrics (Glyphs As Map, DefaultColorMe";
;
 //BA.debugLineNum = 6;BA.debugLine="Type BCTextChars (Buffer() As String, StartIndex";
;
 //BA.debugLineNum = 8;BA.debugLine="Type BCParagraphStyle (HorizontalAlignment As Str";
;
 //BA.debugLineNum = 10;BA.debugLine="Type BCTextRun (TextFont As B4XFont, TextColor As";
;
 //BA.debugLineNum = 13;BA.debugLine="Type BCConnectedRuns (ConnectedWidth As Int, Runs";
;
 //BA.debugLineNum = 14;BA.debugLine="Type BCStyledUnderline (Clr As Int, Style As Stri";
;
 //BA.debugLineNum = 15;BA.debugLine="Public const EXTRA_CONNECTEDRUNS = \"ConnectedRuns";
bctextengine._extra_connectedruns = BA.ObjectToString("ConnectedRuns");__ref.setField("_extra_connectedruns",bctextengine._extra_connectedruns);
bctextengine._extra_styledunderline = BA.ObjectToString("StyledUnderline");__ref.setField("_extra_styledunderline",bctextengine._extra_styledunderline);
 //BA.debugLineNum = 18;BA.debugLine="Type BCParagraph (TextLines As List, CurrentLine";
;
 //BA.debugLineNum = 21;BA.debugLine="Type BCTextLine (StartX As Int, BaselineY As Int,";
;
 //BA.debugLineNum = 23;BA.debugLine="Type BCUnbreakableText (Width As Int, StartX As I";
;
 //BA.debugLineNum = 25;BA.debugLine="Type BCSingleStyleSection (AbsoluteStartX As Int,";
;
 //BA.debugLineNum = 27;BA.debugLine="Type BCGlyphAndOffset (Glyph As BCGlyph, SpaceBet";
;
 //BA.debugLineNum = 28;BA.debugLine="Type BCGlyph (cbc As CompressedBC, baseline As In";
;
 //BA.debugLineNum = 29;BA.debugLine="Private CharBC As BitmapCreator";
bctextengine._charbc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_charbc",bctextengine._charbc);
 //BA.debugLineNum = 30;BA.debugLine="Private cbccache As InternalCompressedBCCache";
bctextengine._cbccache = RemoteObject.createNew ("b4a.example.bitmapcreator._internalcompressedbccache");__ref.setField("_cbccache",bctextengine._cbccache);
 //BA.debugLineNum = 31;BA.debugLine="Public DefaultUnderlineStyle As BCStyledUnderline";
bctextengine._defaultunderlinestyle = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcstyledunderline");__ref.setField("_defaultunderlinestyle",bctextengine._defaultunderlinestyle);
 //BA.debugLineNum = 32;BA.debugLine="Public mScale As Float = 1";
bctextengine._mscale = BA.numberCast(float.class, 1);__ref.setField("_mscale",bctextengine._mscale);
 //BA.debugLineNum = 33;BA.debugLine="Private mSpaceBetweenCharacters As Float";
bctextengine._mspacebetweencharacters = RemoteObject.createImmutable(0f);__ref.setField("_mspacebetweencharacters",bctextengine._mspacebetweencharacters);
 //BA.debugLineNum = 34;BA.debugLine="Private mSpaceBetweenLines As Int";
bctextengine._mspacebetweenlines = RemoteObject.createImmutable(0);__ref.setField("_mspacebetweenlines",bctextengine._mspacebetweenlines);
 //BA.debugLineNum = 35;BA.debugLine="Private FontMetricsCache As Map";
bctextengine._fontmetricscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_fontmetricscache",bctextengine._fontmetricscache);
 //BA.debugLineNum = 36;BA.debugLine="Private ForegroundBC, BackgroundBC As BitmapCreat";
bctextengine._foregroundbc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_foregroundbc",bctextengine._foregroundbc);
bctextengine._backgroundbc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_backgroundbc",bctextengine._backgroundbc);
 //BA.debugLineNum = 37;BA.debugLine="Public DefaultColor As Int = xui.Color_Black";
bctextengine._defaultcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");__ref.setField("_defaultcolor",bctextengine._defaultcolor);
 //BA.debugLineNum = 38;BA.debugLine="Public WordBoundaries As String = \"&*+-/.<>=\\' ,:";
bctextengine._wordboundaries = RemoteObject.concat(RemoteObject.createImmutable("&*+-/.<>=\\' ,:{}"),bctextengine.__c.getField(true,"TAB"),bctextengine.__c.getField(true,"CRLF"),bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))));__ref.setField("_wordboundaries",bctextengine._wordboundaries);
 //BA.debugLineNum = 39;BA.debugLine="Public WordBoundariesThatCanConnectToPrevWord As";
bctextengine._wordboundariesthatcanconnecttoprevword = BA.ObjectToString(".,:");__ref.setField("_wordboundariesthatcanconnecttoprevword",bctextengine._wordboundariesthatcanconnecttoprevword);
 //BA.debugLineNum = 40;BA.debugLine="Private Brushes As Map";
bctextengine._brushes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_brushes",bctextengine._brushes);
 //BA.debugLineNum = 41;BA.debugLine="Public DefaultStyle As BCParagraphStyle";
bctextengine._defaultstyle = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcparagraphstyle");__ref.setField("_defaultstyle",bctextengine._defaultstyle);
 //BA.debugLineNum = 42;BA.debugLine="Public DefaultFont As B4XFont";
bctextengine._defaultfont = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");__ref.setField("_defaultfont",bctextengine._defaultfont);
 //BA.debugLineNum = 43;BA.debugLine="Private mMinGapBetweenLines As Int = 5dip";
bctextengine._mmingapbetweenlines = bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));__ref.setField("_mmingapbetweenlines",bctextengine._mmingapbetweenlines);
 //BA.debugLineNum = 45;BA.debugLine="Private stubForContext As Panel 'ignore";
bctextengine._stubforcontext = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_stubforcontext",bctextengine._stubforcontext);
 //BA.debugLineNum = 50;BA.debugLine="Private const TabWidthMeasuredInX As Int = 4";
bctextengine._tabwidthmeasuredinx = BA.numberCast(int.class, 4);__ref.setField("_tabwidthmeasuredinx",bctextengine._tabwidthmeasuredinx);
 //BA.debugLineNum = 51;BA.debugLine="Public TagParser As BBCodeParser";
bctextengine._tagparser = RemoteObject.createNew ("com.detektor.kateenapp.bbcodeparser");__ref.setField("_tagparser",bctextengine._tagparser);
 //BA.debugLineNum = 52;BA.debugLine="Private EmptyTextChars As BCTextChars";
bctextengine._emptytextchars = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bctextchars");__ref.setField("_emptytextchars",bctextengine._emptytextchars);
 //BA.debugLineNum = 53;BA.debugLine="Private Emojis As B4XSet";
bctextengine._emojis = RemoteObject.createNew ("com.detektor.kateenapp.b4xset");__ref.setField("_emojis",bctextengine._emojis);
 //BA.debugLineNum = 54;BA.debugLine="Public const Charset As String = \"UTF-32LE\"";
bctextengine._charset = BA.ObjectToString("UTF-32LE");__ref.setField("_charset",bctextengine._charset);
 //BA.debugLineNum = 55;BA.debugLine="Public LookForComplexCharacters As Boolean = True";
bctextengine._lookforcomplexcharacters = bctextengine.__c.getField(true,"True");__ref.setField("_lookforcomplexcharacters",bctextengine._lookforcomplexcharacters);
 //BA.debugLineNum = 56;BA.debugLine="Public CustomFonts As Map";
bctextengine._customfonts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_customfonts",bctextengine._customfonts);
 //BA.debugLineNum = 57;BA.debugLine="Public KerningEnabled As Boolean = True";
bctextengine._kerningenabled = bctextengine.__c.getField(true,"True");__ref.setField("_kerningenabled",bctextengine._kerningenabled);
 //BA.debugLineNum = 58;BA.debugLine="Private IndentWidth As Int";
bctextengine._indentwidth = RemoteObject.createImmutable(0);__ref.setField("_indentwidth",bctextengine._indentwidth);
 //BA.debugLineNum = 59;BA.debugLine="Public VowelsCodePoints As B4XSet";
bctextengine._vowelscodepoints = RemoteObject.createNew ("com.detektor.kateenapp.b4xset");__ref.setField("_vowelscodepoints",bctextengine._vowelscodepoints);
 //BA.debugLineNum = 60;BA.debugLine="Private AsyncBCs As B4XOrderedMap";
bctextengine._asyncbcs = RemoteObject.createNew ("com.detektor.kateenapp.b4xorderedmap");__ref.setField("_asyncbcs",bctextengine._asyncbcs);
 //BA.debugLineNum = 61;BA.debugLine="Private AsyncBC As BitmapCreator";
bctextengine._asyncbc = RemoteObject.createNew ("b4a.example.bitmapcreator");__ref.setField("_asyncbc",bctextengine._asyncbc);
 //BA.debugLineNum = 62;BA.debugLine="Private AsyncTasks As List";
bctextengine._asynctasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_asynctasks",bctextengine._asynctasks);
 //BA.debugLineNum = 63;BA.debugLine="Private AsyncMode As Boolean";
bctextengine._asyncmode = RemoteObject.createImmutable(false);__ref.setField("_asyncmode",bctextengine._asyncmode);
 //BA.debugLineNum = 64;BA.debugLine="Private RTLChars As B4XSet";
bctextengine._rtlchars = RemoteObject.createNew ("com.detektor.kateenapp.b4xset");__ref.setField("_rtlchars",bctextengine._rtlchars);
 //BA.debugLineNum = 65;BA.debugLine="Public Const TextDirectionLTR = 1, TextDirectionU";
bctextengine._textdirectionltr = BA.numberCast(int.class, 1);__ref.setField("_textdirectionltr",bctextengine._textdirectionltr);
bctextengine._textdirectionunknown = BA.numberCast(int.class, 0);__ref.setField("_textdirectionunknown",bctextengine._textdirectionunknown);
bctextengine._textdirectionrtl = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_textdirectionrtl",bctextengine._textdirectionrtl);
 //BA.debugLineNum = 66;BA.debugLine="Private ArabicMap As Map";
bctextengine._arabicmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_arabicmap",bctextengine._arabicmap);
 //BA.debugLineNum = 67;BA.debugLine="Private ArabicNonLinkedLetters As B4XSet";
bctextengine._arabicnonlinkedletters = RemoteObject.createNew ("com.detektor.kateenapp.b4xset");__ref.setField("_arabicnonlinkedletters",bctextengine._arabicnonlinkedletters);
 //BA.debugLineNum = 68;BA.debugLine="Private ArabicCharsConnectedPrev As B4XSet";
bctextengine._arabiccharsconnectedprev = RemoteObject.createNew ("com.detektor.kateenapp.b4xset");__ref.setField("_arabiccharsconnectedprev",bctextengine._arabiccharsconnectedprev);
 //BA.debugLineNum = 69;BA.debugLine="Private PMDefaultColor As PremultipliedColor";
bctextengine._pmdefaultcolor = RemoteObject.createNew ("b4a.example.bitmapcreator._premultipliedcolor");__ref.setField("_pmdefaultcolor",bctextengine._pmdefaultcolor);
 //BA.debugLineNum = 70;BA.debugLine="Public RTLAware As Boolean";
bctextengine._rtlaware = RemoteObject.createImmutable(false);__ref.setField("_rtlaware",bctextengine._rtlaware);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createbctextchars(RemoteObject __ref,RemoteObject _buffer,RemoteObject _startindex,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("CreateBCTextChars (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1105);
if (RapidSub.canDelegate("createbctextchars")) { return __ref.runUserSub(false, "bctextengine","createbctextchars", __ref, _buffer, _startindex, _length);}
RemoteObject _t1 = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextchars");
Debug.locals.put("Buffer", _buffer);
Debug.locals.put("StartIndex", _startindex);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 1105;BA.debugLine="Public Sub CreateBCTextChars (Buffer() As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1106;BA.debugLine="Dim t1 As BCTextChars";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bctextchars");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1107;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1108;BA.debugLine="t1.Buffer = Buffer";
Debug.JustUpdateDeviceLine();
_t1.setField ("Buffer" /*RemoteObject*/ ,_buffer);
 BA.debugLineNum = 1109;BA.debugLine="t1.StartIndex = StartIndex";
Debug.JustUpdateDeviceLine();
_t1.setField ("StartIndex" /*RemoteObject*/ ,_startindex);
 BA.debugLineNum = 1110;BA.debugLine="t1.Length = Length";
Debug.JustUpdateDeviceLine();
_t1.setField ("Length" /*RemoteObject*/ ,_length);
 BA.debugLineNum = 1111;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbctextcharsfromstring(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("CreateBCTextCharsFromString (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1052);
if (RapidSub.canDelegate("createbctextcharsfromstring")) { return __ref.runUserSub(false, "bctextengine","createbctextcharsfromstring", __ref, _s);}
RemoteObject _b = null;
RemoteObject _chars = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _bi = RemoteObject.createImmutable(0);
RemoteObject _shouldaddtoprevchar = RemoteObject.createImmutable(false);
RemoteObject _therearevowels = RemoteObject.createImmutable(false);
RemoteObject _cp = RemoteObject.createImmutable(0);
Debug.locals.put("s", _s);
 BA.debugLineNum = 1052;BA.debugLine="Public Sub CreateBCTextCharsFromString (s As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1053;BA.debugLine="If RTLAware Then LoadArabicData";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rtlaware" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_loadarabicdata" /*RemoteObject*/ );};
 BA.debugLineNum = 1054;BA.debugLine="Dim b() As Byte = s.GetBytes(Charset)";
Debug.JustUpdateDeviceLine();
_b = _s.runMethod(false,"getBytes",(Object)(__ref.getField(true,"_charset" /*RemoteObject*/ )));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 1055;BA.debugLine="Dim chars(b.Length / 4) As String";
Debug.JustUpdateDeviceLine();
_chars = RemoteObject.createNewArray ("String", new int[] {(int) (0 + RemoteObject.solve(new RemoteObject[] {_b.getField(true,"length"),RemoteObject.createImmutable(4)}, "/",0, 0).<Double>get().doubleValue())}, new Object[]{});Debug.locals.put("chars", _chars);
 BA.debugLineNum = 1056;BA.debugLine="Dim i, bi As Int = 0";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_bi = BA.numberCast(int.class, 0);Debug.locals.put("bi", _bi);Debug.locals.put("bi", _bi);
 BA.debugLineNum = 1057;BA.debugLine="Dim ShouldAddToPrevChar As Boolean";
Debug.JustUpdateDeviceLine();
_shouldaddtoprevchar = RemoteObject.createImmutable(false);Debug.locals.put("ShouldAddToPrevChar", _shouldaddtoprevchar);
 BA.debugLineNum = 1058;BA.debugLine="Dim ThereAreVowels As Boolean = VowelsCodePoints.";
Debug.JustUpdateDeviceLine();
_therearevowels = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_vowelscodepoints" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0)));Debug.locals.put("ThereAreVowels", _therearevowels);Debug.locals.put("ThereAreVowels", _therearevowels);
 BA.debugLineNum = 1059;BA.debugLine="Do While bi <= chars.Length - 1";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("k",_bi,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_chars.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))) {
 BA.debugLineNum = 1060;BA.debugLine="chars(i) = BytesToString(b, bi * 4, 4, Charset)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (bctextengine.__c.runMethod(true,"BytesToString",(Object)(_b),(Object)(RemoteObject.solve(new RemoteObject[] {_bi,RemoteObject.createImmutable(4)}, "*",0, 1)),(Object)(BA.numberCast(int.class, 4)),(Object)(__ref.getField(true,"_charset" /*RemoteObject*/ ))),_i);
 BA.debugLineNum = 1061;BA.debugLine="If LookForComplexCharacters Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_lookforcomplexcharacters" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1062;BA.debugLine="Dim cp As Int = BytesToInt(b, bi * 4)";
Debug.JustUpdateDeviceLine();
_cp = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_bytestoint" /*RemoteObject*/ ,(Object)(_b),(Object)(RemoteObject.solve(new RemoteObject[] {_bi,RemoteObject.createImmutable(4)}, "*",0, 1)));Debug.locals.put("cp", _cp);Debug.locals.put("cp", _cp);
 BA.debugLineNum = 1063;BA.debugLine="If i > 0 And (cp = 0x200d Or (cp >= 0xFE00 And";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_cp,BA.numberCast(double.class, ((int)0x200d))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_cp,BA.numberCast(double.class, ((int)0xfe00))) && RemoteObject.solveBoolean("k",_cp,BA.numberCast(double.class, ((int)0xfe0f)))))))))) { 
 BA.debugLineNum = 1064;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (RemoteObject.concat(_chars.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)),_chars.getArrayElement(true,_i)),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 1065;BA.debugLine="i = i - 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 1066;BA.debugLine="ShouldAddToPrevChar = True";
Debug.JustUpdateDeviceLine();
_shouldaddtoprevchar = bctextengine.__c.getField(true,"True");Debug.locals.put("ShouldAddToPrevChar", _shouldaddtoprevchar);
 }else 
{ BA.debugLineNum = 1067;BA.debugLine="Else If i > 0 And (cp >= 0x1F3FB And cp <= 0x1F";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_cp,BA.numberCast(double.class, ((int)0x1f3fb))) && RemoteObject.solveBoolean("k",_cp,BA.numberCast(double.class, ((int)0x1f3ff))))))) { 
 BA.debugLineNum = 1068;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (RemoteObject.concat(_chars.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)),_chars.getArrayElement(true,_i)),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 1069;BA.debugLine="i = i - 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 1070;BA.debugLine="ShouldAddToPrevChar = False";
Debug.JustUpdateDeviceLine();
_shouldaddtoprevchar = bctextengine.__c.getField(true,"False");Debug.locals.put("ShouldAddToPrevChar", _shouldaddtoprevchar);
 }else 
{ BA.debugLineNum = 1071;BA.debugLine="Else If i > 0 And (ThereAreVowels And VowelsCod";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",_therearevowels) && RemoteObject.solveBoolean(".",__ref.getField(false,"_vowelscodepoints" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_cp)))))))) { 
 BA.debugLineNum = 1072;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (RemoteObject.concat(_chars.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)),_chars.getArrayElement(true,_i)),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 1073;BA.debugLine="i = i - 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 1074;BA.debugLine="ShouldAddToPrevChar = False";
Debug.JustUpdateDeviceLine();
_shouldaddtoprevchar = bctextengine.__c.getField(true,"False");Debug.locals.put("ShouldAddToPrevChar", _shouldaddtoprevchar);
 }else 
{ BA.debugLineNum = 1075;BA.debugLine="Else If RTLAware And i > 0 And chars(i - 1) = \"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_rtlaware" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("=",_chars.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)),BA.ObjectToString("ل")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_cp,BA.numberCast(double.class, ((int)0x622))) || RemoteObject.solveBoolean("=",_cp,BA.numberCast(double.class, ((int)0x623))) || RemoteObject.solveBoolean("=",_cp,BA.numberCast(double.class, ((int)0x625))) || RemoteObject.solveBoolean("=",_cp,BA.numberCast(double.class, ((int)0x627))))))) { 
 BA.debugLineNum = 1076;BA.debugLine="Select cp";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_cp,BA.numberCast(int.class, ((int)0x622)),BA.numberCast(int.class, ((int)0x623)),BA.numberCast(int.class, ((int)0x625)),BA.numberCast(int.class, ((int)0x627)))) {
case 0: {
 BA.debugLineNum = 1078;BA.debugLine="chars(i - 1) = Chr(0xFEF5)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xfef5))))),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 break; }
case 1: {
 BA.debugLineNum = 1080;BA.debugLine="chars(i - 1) = Chr(0xFEF7)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xfef7))))),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 break; }
case 2: {
 BA.debugLineNum = 1082;BA.debugLine="chars(i - 1) = Chr(0xFEF9)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xfef9))))),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 break; }
case 3: {
 BA.debugLineNum = 1084;BA.debugLine="chars(i - 1) = Chr(0xFEFB)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xfefb))))),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 break; }
}
;
 BA.debugLineNum = 1086;BA.debugLine="i = i - 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 1087;BA.debugLine="ShouldAddToPrevChar = False";
Debug.JustUpdateDeviceLine();
_shouldaddtoprevchar = bctextengine.__c.getField(true,"False");Debug.locals.put("ShouldAddToPrevChar", _shouldaddtoprevchar);
 }else 
{ BA.debugLineNum = 1088;BA.debugLine="Else If i > 0 And ShouldAddToPrevChar Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_shouldaddtoprevchar)) { 
 BA.debugLineNum = 1089;BA.debugLine="chars(i - 1) = chars(i - 1) & chars(i)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (RemoteObject.concat(_chars.getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)),_chars.getArrayElement(true,_i)),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 1090;BA.debugLine="i = i - 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 1091;BA.debugLine="ShouldAddToPrevChar = False";
Debug.JustUpdateDeviceLine();
_shouldaddtoprevchar = bctextengine.__c.getField(true,"False");Debug.locals.put("ShouldAddToPrevChar", _shouldaddtoprevchar);
 }else {
 BA.debugLineNum = 1093;BA.debugLine="ShouldAddToPrevChar = False";
Debug.JustUpdateDeviceLine();
_shouldaddtoprevchar = bctextengine.__c.getField(true,"False");Debug.locals.put("ShouldAddToPrevChar", _shouldaddtoprevchar);
 }}}}}
;
 };
 BA.debugLineNum = 1096;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 1097;BA.debugLine="bi = bi + 1";
Debug.JustUpdateDeviceLine();
_bi = RemoteObject.solve(new RemoteObject[] {_bi,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("bi", _bi);
 }
;
 BA.debugLineNum = 1099;BA.debugLine="If RTLAware Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rtlaware" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1100;BA.debugLine="PreprocessArabic(chars, i)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_preprocessarabic" /*RemoteObject*/ ,(Object)(_chars),(Object)(_i));
 };
 BA.debugLineNum = 1102;BA.debugLine="Return CreateBCTextChars(chars, 0, i)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createbctextchars" /*RemoteObject*/ ,(Object)(_chars),(Object)(BA.numberCast(int.class, 0)),(Object)(_i));
 BA.debugLineNum = 1103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createconnectedparent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateConnectedParent (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("createconnectedparent")) { return __ref.runUserSub(false, "bctextengine","createconnectedparent", __ref);}
RemoteObject _connected = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcconnectedruns");
RemoteObject _parent = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextrun");
 BA.debugLineNum = 159;BA.debugLine="Public Sub CreateConnectedParent As BCTextRun";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="Dim connected As BCConnectedRuns";
Debug.JustUpdateDeviceLine();
_connected = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcconnectedruns");Debug.locals.put("connected", _connected);
 BA.debugLineNum = 161;BA.debugLine="connected.Initialize";
Debug.JustUpdateDeviceLine();
_connected.runVoidMethod ("Initialize");
 BA.debugLineNum = 162;BA.debugLine="connected.Runs.Initialize";
Debug.JustUpdateDeviceLine();
_connected.getField(false,"Runs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 163;BA.debugLine="Dim parent As BCTextRun = CreateRun(\"\")";
Debug.JustUpdateDeviceLine();
_parent = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createrun" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 164;BA.debugLine="parent.Extra.Initialize";
Debug.JustUpdateDeviceLine();
_parent.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 165;BA.debugLine="parent.Extra.Put(EXTRA_CONNECTEDRUNS, connected)";
Debug.JustUpdateDeviceLine();
_parent.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((__ref.getField(true,"_extra_connectedruns" /*RemoteObject*/ ))),(Object)((_connected)));
 BA.debugLineNum = 166;BA.debugLine="Return parent";
Debug.JustUpdateDeviceLine();
if (true) return _parent;
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createglyph(RemoteObject __ref,RemoteObject _c,RemoteObject _fontmetrics,RemoteObject _justmeasure) throws Exception{
try {
		Debug.PushSubsStack("CreateGlyph (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,828);
if (RapidSub.canDelegate("createglyph")) { return __ref.runUserSub(false, "bctextengine","createglyph", __ref, _c, _fontmetrics, _justmeasure);}
RemoteObject _g = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyph");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _leftoffset = RemoteObject.createImmutable(0);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _r2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _cbc = RemoteObject.declareNull("b4a.example.bitmapcreator._compressedbc");
Debug.locals.put("c", _c);
Debug.locals.put("FontMetrics", _fontmetrics);
Debug.locals.put("JustMeasure", _justmeasure);
 BA.debugLineNum = 828;BA.debugLine="Private Sub CreateGlyph (c As String, FontMetrics";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 829;BA.debugLine="Dim g As BCGlyph = FontMetrics.Glyphs.Get(c)";
Debug.JustUpdateDeviceLine();
_g = (_fontmetrics.getField(false,"Glyphs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_c))));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 830;BA.debugLine="If g <> Null Then Return g";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_g)) { 
if (true) return _g;};
 BA.debugLineNum = 831;BA.debugLine="If FontMetrics.clr <> DefaultColor Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_fontmetrics.getField(true,"Clr" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_defaultcolor" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 832;BA.debugLine="Return CreateGlyphFromDefaultColor(c, FontMetric";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyphfromdefaultcolor" /*RemoteObject*/ ,(Object)(_c),(Object)(_fontmetrics.getField(false,"DefaultColorMetrics" /*RemoteObject*/ )),(Object)(_fontmetrics.getField(true,"Clr" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 834;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 835;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(c, FontMetric";
Debug.JustUpdateDeviceLine();
_r = __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"MeasureText",(Object)(_c),(Object)(_fontmetrics.getField(false,"Fnt" /*RemoteObject*/ )));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 836;BA.debugLine="Dim BaseLine As Int = -r.Top + 5";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, -(double) (0 + _r.runMethod(true,"getTop").<Float>get().floatValue())+(double) (0 + 5));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 837;BA.debugLine="r.Left = r.Left * mScale";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setLeft",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 838;BA.debugLine="r.Top = r.Top * mScale";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setTop",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 839;BA.debugLine="r.Right = r.Right * mScale";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setRight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 840;BA.debugLine="r.Bottom = r.Bottom * mScale";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setBottom",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 841;BA.debugLine="If CharBC.mWidth < r.Width + 20 * mScale Or Char";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_charbc" /*RemoteObject*/ ).getField(true,"_mwidth"),RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(20),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "+*",1, 0)) || RemoteObject.solveBoolean("<",__ref.getField(false,"_charbc" /*RemoteObject*/ ).getField(true,"_mheight"),RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(20),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "+*",1, 0))) { 
 BA.debugLineNum = 842;BA.debugLine="ResizeCharBC(r.Width + 30 * mScale, r.Height +";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_resizecharbc" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(30),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "+*",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(30),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "+*",1, 0))));
 };
 BA.debugLineNum = 845;BA.debugLine="Dim leftOffset As Int = 5";
Debug.JustUpdateDeviceLine();
_leftoffset = BA.numberCast(int.class, 5);Debug.locals.put("leftOffset", _leftoffset);Debug.locals.put("leftOffset", _leftoffset);
 BA.debugLineNum = 846;BA.debugLine="cvs.DrawText(c, leftOffset, BaseLine, FontMetric";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(_c),(Object)(BA.numberCast(float.class, _leftoffset)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fontmetrics.getField(false,"Fnt" /*RemoteObject*/ )),(Object)(_fontmetrics.getField(true,"Clr" /*RemoteObject*/ )),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("LEFT"))));
 BA.debugLineNum = 848;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = __ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"CreateBitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 859;BA.debugLine="CharBC.CopyPixelsFromBitmap(bmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 860;BA.debugLine="Dim r2 As B4XRect = FindMinRect(leftOffset + r.R";
Debug.JustUpdateDeviceLine();
_r2 = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_findminrect" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_leftoffset,_r.runMethod(true,"getRight"),RemoteObject.createImmutable(20),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "++*",2, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(20),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "+*",1, 0))));Debug.locals.put("r2", _r2);Debug.locals.put("r2", _r2);
 BA.debugLineNum = 862;BA.debugLine="Dim g As BCGlyph";
Debug.JustUpdateDeviceLine();
_g = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcglyph");Debug.locals.put("g", _g);
 BA.debugLineNum = 863;BA.debugLine="g.Initialize";
Debug.JustUpdateDeviceLine();
_g.runVoidMethod ("Initialize");
 BA.debugLineNum = 864;BA.debugLine="g.baseline = BaseLine * mScale - r2.Top";
Debug.JustUpdateDeviceLine();
_g.setField ("baseline" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_baseline,__ref.getField(true,"_mscale" /*RemoteObject*/ ),_r2.runMethod(true,"getTop")}, "*-",1, 0)));
 BA.debugLineNum = 865;BA.debugLine="If r2.Width > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_r2.runMethod(true,"getWidth"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 866;BA.debugLine="r2.Left = Floor(r2.Left)";
Debug.JustUpdateDeviceLine();
_r2.runMethod(true,"setLeft",BA.numberCast(float.class, bctextengine.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _r2.runMethod(true,"getLeft"))))));
 BA.debugLineNum = 867;BA.debugLine="r2.Right = Ceil(r2.Right)";
Debug.JustUpdateDeviceLine();
_r2.runMethod(true,"setRight",BA.numberCast(float.class, bctextengine.__c.runMethod(true,"Ceil",(Object)(BA.numberCast(double.class, _r2.runMethod(true,"getRight"))))));
 BA.debugLineNum = 868;BA.debugLine="If RTLAware Then RecolorEdgesOfConnectedCharact";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_rtlaware" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_recoloredgesofconnectedcharacters" /*RemoteObject*/ ,(Object)(_c),(Object)(_r2));};
 BA.debugLineNum = 874;BA.debugLine="Dim cbc As CompressedBC = CharBC.ExtractCompres";
Debug.JustUpdateDeviceLine();
_cbc = __ref.getField(false,"_charbc" /*RemoteObject*/ ).runMethod(false,"_extractcompressedbc",(Object)(_r2),(Object)(__ref.getField(false,"_cbccache" /*RemoteObject*/ )));Debug.locals.put("cbc", _cbc);Debug.locals.put("cbc", _cbc);
 BA.debugLineNum = 875;BA.debugLine="g.cbc = cbc";
Debug.JustUpdateDeviceLine();
_g.setField ("cbc" /*RemoteObject*/ ,_cbc);
 BA.debugLineNum = 876;BA.debugLine="g.width = cbc.mWidth";
Debug.JustUpdateDeviceLine();
_g.setField ("Width" /*RemoteObject*/ ,_cbc.getField(true,"mWidth"));
 }else {
 BA.debugLineNum = 878;BA.debugLine="g.Empty = True";
Debug.JustUpdateDeviceLine();
_g.setField ("Empty" /*RemoteObject*/ ,bctextengine.__c.getField(true,"True"));
 BA.debugLineNum = 879;BA.debugLine="If c = TAB Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,bctextengine.__c.getField(true,"TAB"))) { 
 BA.debugLineNum = 880;BA.debugLine="g.Width = FontMetrics.xWidth * TabWidthMeasure";
Debug.JustUpdateDeviceLine();
_g.setField ("Width" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_fontmetrics.getField(true,"xWidth" /*RemoteObject*/ ),__ref.getField(true,"_tabwidthmeasuredinx" /*RemoteObject*/ )}, "*",0, 1));
 }else 
{ BA.debugLineNum = 881;BA.debugLine="Else if c = \" \" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString(" "))) { 
 BA.debugLineNum = 882;BA.debugLine="g.width = CreateGlyph(\"x x\", FontMetrics, True";
Debug.JustUpdateDeviceLine();
_g.setField ("Width" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(BA.ObjectToString("x x")),(Object)(_fontmetrics),(Object)(bctextengine.__c.getField(true,"True"))).getField(true,"Width" /*RemoteObject*/ ),_fontmetrics.getField(true,"xWidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-*",1, 1));
 }else 
{ BA.debugLineNum = 883;BA.debugLine="Else If c = \"x\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString("x"))) { 
 BA.debugLineNum = 884;BA.debugLine="g = CreateGlyph(\"X\", FontMetrics, True)";
Debug.JustUpdateDeviceLine();
_g = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(BA.ObjectToString("X")),(Object)(_fontmetrics),(Object)(bctextengine.__c.getField(true,"True")));Debug.locals.put("g", _g);
 }else 
{ BA.debugLineNum = 885;BA.debugLine="Else If c = \"x x\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString("x x"))) { 
 BA.debugLineNum = 886;BA.debugLine="g = CreateGlyph(\"X X\", FontMetrics, True)";
Debug.JustUpdateDeviceLine();
_g = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(BA.ObjectToString("X X")),(Object)(_fontmetrics),(Object)(bctextengine.__c.getField(true,"True")));Debug.locals.put("g", _g);
 }else {
 BA.debugLineNum = 888;BA.debugLine="g.Width = CreateGlyph(\" \", FontMetrics, False)";
Debug.JustUpdateDeviceLine();
_g.setField ("Width" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(BA.ObjectToString(" ")),(Object)(_fontmetrics),(Object)(bctextengine.__c.getField(true,"False"))).getField(true,"Width" /*RemoteObject*/ ));
 }}}}
;
 };
 BA.debugLineNum = 891;BA.debugLine="If xui.IsB4J = False And MightBeAnEmoji(c) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J"),bctextengine.__c.getField(true,"False")) && RemoteObject.solveBoolean(".",__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_mightbeanemoji" /*RemoteObject*/ ,(Object)(_c)))) { 
 BA.debugLineNum = 892;BA.debugLine="If Emojis.IsInitialized = False Then LoadData(E";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_emojis" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),bctextengine.__c.getField(true,"False"))) { 
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_loaddata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_emojis" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("emoji-data.txt")));};
 BA.debugLineNum = 893;BA.debugLine="g.Emoji = Emojis.Contains(BytesToInt(c.GetBytes";
Debug.JustUpdateDeviceLine();
_g.setField ("Emoji" /*RemoteObject*/ ,__ref.getField(false,"_emojis" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_bytestoint" /*RemoteObject*/ ,(Object)(_c.runMethod(false,"getBytes",(Object)(__ref.getField(true,"_charset" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 0)))))));
 };
 BA.debugLineNum = 895;BA.debugLine="If JustMeasure = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_justmeasure,bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 896;BA.debugLine="FontMetrics.Glyphs.Put(c, g)";
Debug.JustUpdateDeviceLine();
_fontmetrics.getField(false,"Glyphs" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_c)),(Object)((_g)));
 };
 BA.debugLineNum = 898;BA.debugLine="Return g";
Debug.JustUpdateDeviceLine();
if (true) return _g;
 };
 BA.debugLineNum = 900;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createglyphfromdefaultcolor(RemoteObject __ref,RemoteObject _c,RemoteObject _defaultcolormetrics,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("CreateGlyphFromDefaultColor (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,934);
if (RapidSub.canDelegate("createglyphfromdefaultcolor")) { return __ref.runUserSub(false, "bctextengine","createglyphfromdefaultcolor", __ref, _c, _defaultcolormetrics, _clr);}
RemoteObject _blackglyph = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyph");
RemoteObject _g = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyph");
RemoteObject _buffer = null;
RemoteObject _argb = RemoteObject.declareNull("b4a.example.bitmapcreator._argbcolor");
RemoteObject _ai = RemoteObject.createImmutable(0);
RemoteObject _ri = RemoteObject.createImmutable(0);
RemoteObject _gi = RemoteObject.createImmutable(0);
RemoteObject _bi = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _a = RemoteObject.createImmutable(0);
RemoteObject _af = RemoteObject.createImmutable(0f);
Debug.locals.put("c", _c);
Debug.locals.put("DefaultColorMetrics", _defaultcolormetrics);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 934;BA.debugLine="Private Sub CreateGlyphFromDefaultColor(c As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 935;BA.debugLine="Dim BlackGlyph As BCGlyph = CreateGlyph(c, Defaul";
Debug.JustUpdateDeviceLine();
_blackglyph = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(_c),(Object)(_defaultcolormetrics),(Object)(bctextengine.__c.getField(true,"False")));Debug.locals.put("BlackGlyph", _blackglyph);Debug.locals.put("BlackGlyph", _blackglyph);
 BA.debugLineNum = 936;BA.debugLine="If BlackGlyph.cbc.IsInitialized = False Or BlackG";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(true,"IsInitialized"),bctextengine.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",_blackglyph.getField(true,"Emoji" /*RemoteObject*/ ))) { 
if (true) return _blackglyph;};
 BA.debugLineNum = 937;BA.debugLine="Dim g As BCGlyph";
Debug.JustUpdateDeviceLine();
_g = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcglyph");Debug.locals.put("g", _g);
 BA.debugLineNum = 938;BA.debugLine="g.Initialize";
Debug.JustUpdateDeviceLine();
_g.runVoidMethod ("Initialize");
 BA.debugLineNum = 939;BA.debugLine="g.baseline = BlackGlyph.baseline";
Debug.JustUpdateDeviceLine();
_g.setField ("baseline" /*RemoteObject*/ ,_blackglyph.getField(true,"baseline" /*RemoteObject*/ ));
 BA.debugLineNum = 940;BA.debugLine="g.width = BlackGlyph.width";
Debug.JustUpdateDeviceLine();
_g.setField ("Width" /*RemoteObject*/ ,_blackglyph.getField(true,"Width" /*RemoteObject*/ ));
 BA.debugLineNum = 941;BA.debugLine="g.cbc.Initialize";
Debug.JustUpdateDeviceLine();
_g.getField(false,"cbc" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 942;BA.debugLine="g.cbc.Cache = BlackGlyph.cbc.Cache";
Debug.JustUpdateDeviceLine();
_g.getField(false,"cbc" /*RemoteObject*/ ).setField ("Cache",_blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(false,"Cache"));
 BA.debugLineNum = 943;BA.debugLine="g.cbc.mHeight = BlackGlyph.cbc.mHeight";
Debug.JustUpdateDeviceLine();
_g.getField(false,"cbc" /*RemoteObject*/ ).setField ("mHeight",_blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(true,"mHeight"));
 BA.debugLineNum = 944;BA.debugLine="g.cbc.mWidth = BlackGlyph.cbc.mWidth";
Debug.JustUpdateDeviceLine();
_g.getField(false,"cbc" /*RemoteObject*/ ).setField ("mWidth",_blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(true,"mWidth"));
 BA.debugLineNum = 945;BA.debugLine="g.cbc.Rows = BlackGlyph.cbc.Rows";
Debug.JustUpdateDeviceLine();
_g.getField(false,"cbc" /*RemoteObject*/ ).setField ("Rows",_blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(false,"Rows"));
 BA.debugLineNum = 946;BA.debugLine="g.cbc.TargetRect = BlackGlyph.cbc.TargetRect";
Debug.JustUpdateDeviceLine();
_g.getField(false,"cbc" /*RemoteObject*/ ).setField ("TargetRect",_blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(false,"TargetRect"));
 BA.debugLineNum = 947;BA.debugLine="Dim buffer(BlackGlyph.cbc.mBuffer.Length) As Byte";
Debug.JustUpdateDeviceLine();
_buffer = RemoteObject.createNewArray ("byte", new int[] {_blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(false,"mBuffer").getField(true,"length").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("buffer", _buffer);
 BA.debugLineNum = 948;BA.debugLine="Dim argb As ARGBColor";
Debug.JustUpdateDeviceLine();
_argb = RemoteObject.createNew ("b4a.example.bitmapcreator._argbcolor");Debug.locals.put("argb", _argb);
 BA.debugLineNum = 949;BA.debugLine="CharBC.ColorToARGB(clr, argb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).runVoidMethod ("_colortoargb",(Object)(_clr),(Object)(_argb));
 BA.debugLineNum = 950;BA.debugLine="Dim ai, ri, gi, bi As Int";
Debug.JustUpdateDeviceLine();
_ai = RemoteObject.createImmutable(0);Debug.locals.put("ai", _ai);
_ri = RemoteObject.createImmutable(0);Debug.locals.put("ri", _ri);
_gi = RemoteObject.createImmutable(0);Debug.locals.put("gi", _gi);
_bi = RemoteObject.createImmutable(0);Debug.locals.put("bi", _bi);
 BA.debugLineNum = 952;BA.debugLine="ai = 3";
Debug.JustUpdateDeviceLine();
_ai = BA.numberCast(int.class, 3);Debug.locals.put("ai", _ai);
 BA.debugLineNum = 953;BA.debugLine="ri = 0";
Debug.JustUpdateDeviceLine();
_ri = BA.numberCast(int.class, 0);Debug.locals.put("ri", _ri);
 BA.debugLineNum = 954;BA.debugLine="gi = 1";
Debug.JustUpdateDeviceLine();
_gi = BA.numberCast(int.class, 1);Debug.locals.put("gi", _gi);
 BA.debugLineNum = 955;BA.debugLine="bi = 2";
Debug.JustUpdateDeviceLine();
_bi = BA.numberCast(int.class, 2);Debug.locals.put("bi", _bi);
 BA.debugLineNum = 962;BA.debugLine="For i = 0 To buffer.Length - 1 Step 4";
Debug.JustUpdateDeviceLine();
{
final int step21 = 4;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_buffer.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 971;BA.debugLine="Dim a As Int = Bit.And(0xff, BlackGlyph.cbc.mBuf";
Debug.JustUpdateDeviceLine();
_a = bctextengine.__c.getField(false,"Bit").runMethod(true,"And",(Object)(BA.numberCast(int.class, ((int)0xff))),(Object)(BA.numberCast(int.class, _blackglyph.getField(false,"cbc" /*RemoteObject*/ ).getField(false,"mBuffer").getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_ai}, "+",1, 1)))));Debug.locals.put("a", _a);Debug.locals.put("a", _a);
 BA.debugLineNum = 972;BA.debugLine="Dim af As Float = a / 255";
Debug.JustUpdateDeviceLine();
_af = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_a,RemoteObject.createImmutable(255)}, "/",0, 0));Debug.locals.put("af", _af);Debug.locals.put("af", _af);
 BA.debugLineNum = 973;BA.debugLine="buffer(i + ai) = a";
Debug.JustUpdateDeviceLine();
_buffer.setArrayElement (BA.numberCast(byte.class, _a),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_ai}, "+",1, 1));
 BA.debugLineNum = 974;BA.debugLine="buffer(i + ri) = argb.r * af";
Debug.JustUpdateDeviceLine();
_buffer.setArrayElement (BA.numberCast(byte.class, RemoteObject.solve(new RemoteObject[] {_argb.getField(true,"r"),_af}, "*",0, 0)),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_ri}, "+",1, 1));
 BA.debugLineNum = 975;BA.debugLine="buffer(i + gi) = argb.g * af";
Debug.JustUpdateDeviceLine();
_buffer.setArrayElement (BA.numberCast(byte.class, RemoteObject.solve(new RemoteObject[] {_argb.getField(true,"g"),_af}, "*",0, 0)),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_gi}, "+",1, 1));
 BA.debugLineNum = 976;BA.debugLine="buffer(i + bi) = argb.b * af";
Debug.JustUpdateDeviceLine();
_buffer.setArrayElement (BA.numberCast(byte.class, RemoteObject.solve(new RemoteObject[] {_argb.getField(true,"b"),_af}, "*",0, 0)),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_bi}, "+",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 979;BA.debugLine="g.cbc.mBuffer = buffer";
Debug.JustUpdateDeviceLine();
_g.getField(false,"cbc" /*RemoteObject*/ ).setField ("mBuffer",_buffer);
 BA.debugLineNum = 980;BA.debugLine="Return g";
Debug.JustUpdateDeviceLine();
if (true) return _g;
 BA.debugLineNum = 981;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createline(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("CreateLine (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("createline")) { return __ref.runUserSub(false, "bctextengine","createline", __ref, _p);}
RemoteObject _line = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextline");
Debug.locals.put("p", _p);
 BA.debugLineNum = 399;BA.debugLine="Private Sub CreateLine(p As BCParagraph)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 400;BA.debugLine="Dim line As BCTextLine";
Debug.JustUpdateDeviceLine();
_line = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bctextline");Debug.locals.put("line", _line);
 BA.debugLineNum = 401;BA.debugLine="line.Initialize";
Debug.JustUpdateDeviceLine();
_line.runVoidMethod ("Initialize");
 BA.debugLineNum = 402;BA.debugLine="line.Unbreakables.Initialize";
Debug.JustUpdateDeviceLine();
_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 403;BA.debugLine="line.ParentParagraph = p";
Debug.JustUpdateDeviceLine();
_line.setField ("ParentParagraph" /*RemoteObject*/ ,_p);
 BA.debugLineNum = 404;BA.debugLine="p.TextLines.Add(line)";
Debug.JustUpdateDeviceLine();
_p.getField(false,"TextLines" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_line)));
 BA.debugLineNum = 405;BA.debugLine="p.CurrentLine = line";
Debug.JustUpdateDeviceLine();
_p.setField ("CurrentLine" /*RemoteObject*/ ,_line);
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrun(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateRun (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("createrun")) { return __ref.runUserSub(false, "bctextengine","createrun", __ref, _text);}
RemoteObject _r = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextrun");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 147;BA.debugLine="Public Sub CreateRun (Text As String) As BCTextRun";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="Dim r As BCTextRun";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bctextrun");Debug.locals.put("r", _r);
 BA.debugLineNum = 149;BA.debugLine="r.Initialize";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize");
 BA.debugLineNum = 150;BA.debugLine="r.BackgroundColor = 0";
Debug.JustUpdateDeviceLine();
_r.setField ("BackgroundColor" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 151;BA.debugLine="r.CharacterSpacingFactor = 1";
Debug.JustUpdateDeviceLine();
_r.setField ("CharacterSpacingFactor" /*RemoteObject*/ ,BA.numberCast(float.class, 1));
 BA.debugLineNum = 152;BA.debugLine="r.TextFont = DefaultFont";
Debug.JustUpdateDeviceLine();
_r.setField ("TextFont" /*RemoteObject*/ ,__ref.getField(false,"_defaultfont" /*RemoteObject*/ ));
 BA.debugLineNum = 153;BA.debugLine="r.TextChars = CreateBCTextCharsFromString(Text)";
Debug.JustUpdateDeviceLine();
_r.setField ("TextChars" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createbctextcharsfromstring" /*RemoteObject*/ ,(Object)(_text)));
 BA.debugLineNum = 154;BA.debugLine="r.Text = Text";
Debug.JustUpdateDeviceLine();
_r.setField ("Text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 155;BA.debugLine="r.TextColor = DefaultColor";
Debug.JustUpdateDeviceLine();
_r.setField ("TextColor" /*RemoteObject*/ ,__ref.getField(true,"_defaultcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 156;BA.debugLine="Return r";
Debug.JustUpdateDeviceLine();
if (true) return _r;
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsinglesection(RemoteObject __ref,RemoteObject _run,RemoteObject _textchars,RemoteObject _fontmetrics) throws Exception{
try {
		Debug.PushSubsStack("CreateSingleSection (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,569);
if (RapidSub.canDelegate("createsinglesection")) { return __ref.runUserSub(false, "bctextengine","createsinglesection", __ref, _run, _textchars, _fontmetrics);}
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
RemoteObject _prevchar = RemoteObject.createImmutable("");
RemoteObject _prevgo = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyphandoffset");
int _i = 0;
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _go = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyphandoffset");
RemoteObject _g = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyph");
RemoteObject _u = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcstyledunderline");
Debug.locals.put("Run", _run);
Debug.locals.put("TextChars", _textchars);
Debug.locals.put("FontMetrics", _fontmetrics);
 BA.debugLineNum = 569;BA.debugLine="Private Sub CreateSingleSection (Run As BCTextRun,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 570;BA.debugLine="Dim single As BCSingleStyleSection";
Debug.JustUpdateDeviceLine();
_single = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcsinglestylesection");Debug.locals.put("single", _single);
 BA.debugLineNum = 571;BA.debugLine="single.Initialize";
Debug.JustUpdateDeviceLine();
_single.runVoidMethod ("Initialize");
 BA.debugLineNum = 572;BA.debugLine="single.GlyphsAndOffsets.Initialize";
Debug.JustUpdateDeviceLine();
_single.getField(false,"GlyphsAndOffsets" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 573;BA.debugLine="single.Run = Run";
Debug.JustUpdateDeviceLine();
_single.setField ("Run" /*RemoteObject*/ ,_run);
 BA.debugLineNum = 574;BA.debugLine="single.fm = FontMetrics";
Debug.JustUpdateDeviceLine();
_single.setField ("fm" /*RemoteObject*/ ,_fontmetrics);
 BA.debugLineNum = 575;BA.debugLine="Dim PrevChar As String";
Debug.JustUpdateDeviceLine();
_prevchar = RemoteObject.createImmutable("");Debug.locals.put("PrevChar", _prevchar);
 BA.debugLineNum = 576;BA.debugLine="Dim PrevGO As BCGlyphAndOffset";
Debug.JustUpdateDeviceLine();
_prevgo = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcglyphandoffset");Debug.locals.put("PrevGO", _prevgo);
 BA.debugLineNum = 577;BA.debugLine="For i = 0 To TextChars.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_textchars.getField(true,"Length" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 578;BA.debugLine="Dim s As String = TextChars.Buffer(i + TextChars";
Debug.JustUpdateDeviceLine();
_s = _textchars.getField(false,"Buffer" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_textchars.getField(true,"StartIndex" /*RemoteObject*/ )}, "+",1, 1));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 579;BA.debugLine="Dim go As BCGlyphAndOffset";
Debug.JustUpdateDeviceLine();
_go = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcglyphandoffset");Debug.locals.put("go", _go);
 BA.debugLineNum = 580;BA.debugLine="Dim g As BCGlyph = CreateGlyph(s, FontMetrics, F";
Debug.JustUpdateDeviceLine();
_g = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(_s),(Object)(_fontmetrics),(Object)(bctextengine.__c.getField(true,"False")));Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 581;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 582;BA.debugLine="If KerningEnabled Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_kerningenabled" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 583;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = GetKernSpaceB";
Debug.JustUpdateDeviceLine();
_prevgo.setField ("SpaceBetweenThisAndNext" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getkernspacebetweenchars" /*RemoteObject*/ ,(Object)(_fontmetrics),(Object)(_prevchar),(Object)(_s),(Object)(_prevgo.getField(false,"Glyph" /*RemoteObject*/ )),(Object)(_g)));
 }else {
 BA.debugLineNum = 585;BA.debugLine="PrevGO.SpaceBetweenThisAndNext = mSpaceBetween";
Debug.JustUpdateDeviceLine();
_prevgo.setField ("SpaceBetweenThisAndNext" /*RemoteObject*/ ,BA.numberCast(int.class, __ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 588;BA.debugLine="go.Glyph = g";
Debug.JustUpdateDeviceLine();
_go.setField ("Glyph" /*RemoteObject*/ ,_g);
 BA.debugLineNum = 589;BA.debugLine="single.GlyphsAndOffsets.Add(go)";
Debug.JustUpdateDeviceLine();
_single.getField(false,"GlyphsAndOffsets" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_go)));
 BA.debugLineNum = 590;BA.debugLine="If g.cbc.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_g.getField(false,"cbc" /*RemoteObject*/ ).getField(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 591;BA.debugLine="single.MaxHeightAboveBaseLine = Max(single.MaxH";
Debug.JustUpdateDeviceLine();
_single.setField ("MaxHeightAboveBaseLine" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _single.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ ))),(Object)(RemoteObject.solve(new RemoteObject[] {_g.getField(true,"baseline" /*RemoteObject*/ ),_run.getField(true,"VerticalOffset" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "-*",1, 0)))));
 BA.debugLineNum = 592;BA.debugLine="single.MaxHeightBelowBaseLine = Max(single.MaxH";
Debug.JustUpdateDeviceLine();
_single.setField ("MaxHeightBelowBaseLine" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _single.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ ))),(Object)(RemoteObject.solve(new RemoteObject[] {_g.getField(false,"cbc" /*RemoteObject*/ ).getField(true,"mHeight"),_g.getField(true,"baseline" /*RemoteObject*/ ),_run.getField(true,"VerticalOffset" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "-+*",2, 0)))));
 };
 BA.debugLineNum = 594;BA.debugLine="single.Width = single.Width + g.Width";
Debug.JustUpdateDeviceLine();
_single.setField ("Width" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_single.getField(true,"Width" /*RemoteObject*/ ),_g.getField(true,"Width" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 595;BA.debugLine="If i > 0 Then single.Width = single.Width + Prev";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_single.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_single.getField(true,"Width" /*RemoteObject*/ ),_prevgo.getField(true,"SpaceBetweenThisAndNext" /*RemoteObject*/ ),_run.getField(true,"CharacterSpacingFactor" /*RemoteObject*/ )}, "+*",1, 0)));};
 BA.debugLineNum = 596;BA.debugLine="If Run.Underline Or Run.AutoUnderline Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_run.getField(true,"Underline" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",_run.getField(true,"AutoUnderline" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 597;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
Debug.JustUpdateDeviceLine();
_u = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getunderlinestyle" /*RemoteObject*/ ,(Object)(_run));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 598;BA.debugLine="single.MaxHeightBelowBaseLine = Max((u.Thicknes";
Debug.JustUpdateDeviceLine();
_single.setField ("MaxHeightBelowBaseLine" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_u.getField(true,"Thickness" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+",1, 0)),__ref.getField(true,"_mscale" /*RemoteObject*/ ),_run.getField(true,"VerticalOffset" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*+*",1, 0)),(Object)(BA.numberCast(double.class, _single.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ ))))));
 };
 BA.debugLineNum = 600;BA.debugLine="PrevGO = go";
Debug.JustUpdateDeviceLine();
_prevgo = _go;Debug.locals.put("PrevGO", _prevgo);
 BA.debugLineNum = 601;BA.debugLine="PrevChar = s";
Debug.JustUpdateDeviceLine();
_prevchar = _s;Debug.locals.put("PrevChar", _prevchar);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 603;BA.debugLine="If i > 0 Then single.Width = single.Width + PrevG";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
_single.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_single.getField(true,"Width" /*RemoteObject*/ ),_prevgo.getField(true,"SpaceBetweenThisAndNext" /*RemoteObject*/ ),_run.getField(true,"CharacterSpacingFactor" /*RemoteObject*/ )}, "+*",1, 0)));};
 BA.debugLineNum = 604;BA.debugLine="If TextChars.Length = 0 And Run.View.IsInitialize";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_textchars.getField(true,"Length" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 605;BA.debugLine="Run.View.Left = 0";
Debug.JustUpdateDeviceLine();
_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 606;BA.debugLine="Run.View.Top = 0";
Debug.JustUpdateDeviceLine();
_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, 0));
 BA.debugLineNum = 607;BA.debugLine="single.Width = Run.View.Width * mScale + mSpaceB";
Debug.JustUpdateDeviceLine();
_single.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(true,"_mscale" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "*+*",1, 0)));
 BA.debugLineNum = 608;BA.debugLine="single.MaxHeightAboveBaseLine = (Run.View.Height";
Debug.JustUpdateDeviceLine();
_single.setField ("MaxHeightAboveBaseLine" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"getHeight"),_run.getField(true,"VerticalOffset" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 609;BA.debugLine="single.MaxHeightBelowBaseLine = Run.View.Height";
Debug.JustUpdateDeviceLine();
_single.setField ("MaxHeightBelowBaseLine" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(true,"_mscale" /*RemoteObject*/ ),_single.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )}, "*-",1, 0)));
 };
 BA.debugLineNum = 612;BA.debugLine="Return single";
Debug.JustUpdateDeviceLine();
if (true) return _single;
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateStyle (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("createstyle")) { return __ref.runUserSub(false, "bctextengine","createstyle", __ref);}
RemoteObject _s = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcparagraphstyle");
 BA.debugLineNum = 136;BA.debugLine="Public Sub CreateStyle As BCParagraphStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="Dim s As BCParagraphStyle";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcparagraphstyle");Debug.locals.put("s", _s);
 BA.debugLineNum = 138;BA.debugLine="s.Initialize";
Debug.JustUpdateDeviceLine();
_s.runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="s.LineSpacingFactor = 1";
Debug.JustUpdateDeviceLine();
_s.setField ("LineSpacingFactor" /*RemoteObject*/ ,BA.numberCast(float.class, 1));
 BA.debugLineNum = 140;BA.debugLine="s.HorizontalAlignment = \"Left\"";
Debug.JustUpdateDeviceLine();
_s.setField ("HorizontalAlignment" /*RemoteObject*/ ,BA.ObjectToString("Left"));
 BA.debugLineNum = 141;BA.debugLine="s.MaxWidth = 300dip";
Debug.JustUpdateDeviceLine();
_s.setField ("MaxWidth" /*RemoteObject*/ ,bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))));
 BA.debugLineNum = 142;BA.debugLine="s.Padding.Initialize(5dip, 5dip, 5dip, 5dip)";
Debug.JustUpdateDeviceLine();
_s.getField(false,"Padding" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))))));
 BA.debugLineNum = 143;BA.debugLine="s.WordWrap = True";
Debug.JustUpdateDeviceLine();
_s.setField ("WordWrap" /*RemoteObject*/ ,bctextengine.__c.getField(true,"True"));
 BA.debugLineNum = 144;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createunbreakable(RemoteObject __ref,RemoteObject _run,RemoteObject _textchars,RemoteObject _fontmetrics,RemoteObject _isseparator,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("CreateUnbreakable (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,478);
if (RapidSub.canDelegate("createunbreakable")) { return __ref.runUserSub(false, "bctextengine","createunbreakable", __ref, _run, _textchars, _fontmetrics, _isseparator, _style);}
RemoteObject _unbreakable = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
Debug.locals.put("Run", _run);
Debug.locals.put("TextChars", _textchars);
Debug.locals.put("FontMetrics", _fontmetrics);
Debug.locals.put("IsSeparator", _isseparator);
Debug.locals.put("style", _style);
 BA.debugLineNum = 478;BA.debugLine="Private Sub CreateUnbreakable (Run As BCTextRun, T";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 479;BA.debugLine="Dim unbreakable As BCUnbreakableText";
Debug.JustUpdateDeviceLine();
_unbreakable = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcunbreakabletext");Debug.locals.put("unbreakable", _unbreakable);
 BA.debugLineNum = 480;BA.debugLine="unbreakable.Initialize";
Debug.JustUpdateDeviceLine();
_unbreakable.runVoidMethod ("Initialize");
 BA.debugLineNum = 481;BA.debugLine="unbreakable.SingleStyleSections.Initialize";
Debug.JustUpdateDeviceLine();
_unbreakable.getField(false,"SingleStyleSections" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 482;BA.debugLine="unbreakable.IsMergable = Not(IsSeparator) And Not";
Debug.JustUpdateDeviceLine();
_unbreakable.setField ("IsMergable" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(".",bctextengine.__c.runMethod(true,"Not",(Object)(_isseparator))) && RemoteObject.solveBoolean(".",bctextengine.__c.runMethod(true,"Not",(Object)(_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))))));
 BA.debugLineNum = 483;BA.debugLine="Dim single As BCSingleStyleSection = CreateSingle";
Debug.JustUpdateDeviceLine();
_single = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createsinglesection" /*RemoteObject*/ ,(Object)(_run),(Object)(_textchars),(Object)(_fontmetrics));Debug.locals.put("single", _single);Debug.locals.put("single", _single);
 BA.debugLineNum = 484;BA.debugLine="single.ParentUN = unbreakable";
Debug.JustUpdateDeviceLine();
_single.setField ("ParentUN" /*RemoteObject*/ ,_unbreakable);
 BA.debugLineNum = 485;BA.debugLine="unbreakable.SingleStyleSections.Add(single)";
Debug.JustUpdateDeviceLine();
_unbreakable.getField(false,"SingleStyleSections" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_single)));
 BA.debugLineNum = 486;BA.debugLine="unbreakable.Width = single.Width";
Debug.JustUpdateDeviceLine();
_unbreakable.setField ("Width" /*RemoteObject*/ ,_single.getField(true,"Width" /*RemoteObject*/ ));
 BA.debugLineNum = 487;BA.debugLine="unbreakable.NotFullTextChars = TextChars";
Debug.JustUpdateDeviceLine();
_unbreakable.setField ("NotFullTextChars" /*RemoteObject*/ ,_textchars);
 BA.debugLineNum = 488;BA.debugLine="If style.RTL Then";
Debug.JustUpdateDeviceLine();
if (_style.getField(true,"RTL" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 489;BA.debugLine="unbreakable.RTL = Run.TextDirection = TextDirect";
Debug.JustUpdateDeviceLine();
_unbreakable.setField ("RTL" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_run.getField(true,"TextDirection" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_textdirectionrtl" /*RemoteObject*/ ))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_run.getField(true,"TextDirection" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_textdirectionunknown" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_detectrtl" /*RemoteObject*/ ,(Object)(_unbreakable)),bctextengine.__c.getField(true,"True")))))));
 };
 BA.debugLineNum = 491;BA.debugLine="unbreakable.Anchor = GetRunAnchorIfCurrentNotSet(";
Debug.JustUpdateDeviceLine();
_unbreakable.setField ("Anchor" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getrunanchorifcurrentnotset" /*RemoteObject*/ ,(Object)(_run),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 492;BA.debugLine="Return unbreakable";
Debug.JustUpdateDeviceLine();
if (true) return _unbreakable;
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _detectrtl(RemoteObject __ref,RemoteObject _un) throws Exception{
try {
		Debug.PushSubsStack("DetectRTL (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("detectrtl")) { return __ref.runUserSub(false, "bctextengine","detectrtl", __ref, _un);}
RemoteObject _firstchar = RemoteObject.createImmutable("");
RemoteObject _cp = RemoteObject.createImmutable(0);
Debug.locals.put("un", _un);
 BA.debugLineNum = 495;BA.debugLine="Private Sub DetectRTL (un As BCUnbreakableText) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 496;BA.debugLine="If un.NotFullTextChars.Length = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_un.getField(false,"NotFullTextChars" /*RemoteObject*/ ).getField(true,"Length" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 497;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return bctextengine.__c.getField(true,"True");
 };
 BA.debugLineNum = 499;BA.debugLine="If RTLChars.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_rtlchars" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 500;BA.debugLine="LoadData(RTLChars, \"rtl-data.txt\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_loaddata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_rtlchars" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("rtl-data.txt")));
 };
 BA.debugLineNum = 502;BA.debugLine="Dim firstChar As String = un.NotFullTextChars.Buf";
Debug.JustUpdateDeviceLine();
_firstchar = _un.getField(false,"NotFullTextChars" /*RemoteObject*/ ).getField(false,"Buffer" /*RemoteObject*/ ).getArrayElement(true,_un.getField(false,"NotFullTextChars" /*RemoteObject*/ ).getField(true,"StartIndex" /*RemoteObject*/ ));Debug.locals.put("firstChar", _firstchar);Debug.locals.put("firstChar", _firstchar);
 BA.debugLineNum = 503;BA.debugLine="Dim cp As Int = BytesToInt(firstChar.GetBytes(Cha";
Debug.JustUpdateDeviceLine();
_cp = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_bytestoint" /*RemoteObject*/ ,(Object)(_firstchar.runMethod(false,"getBytes",(Object)(__ref.getField(true,"_charset" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("cp", _cp);Debug.locals.put("cp", _cp);
 BA.debugLineNum = 504;BA.debugLine="Return RTLChars.Contains(cp)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_rtlchars" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_cp)));
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawline(RemoteObject __ref,RemoteObject _line,RemoteObject _offsety) throws Exception{
try {
		Debug.PushSubsStack("DrawLine (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,696);
if (RapidSub.canDelegate("drawline")) { return __ref.runUserSub(false, "bctextengine","drawline", __ref, _line, _offsety);}
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
Debug.locals.put("line", _line);
Debug.locals.put("OffsetY", _offsety);
 BA.debugLineNum = 696;BA.debugLine="Private Sub DrawLine(line As BCTextLine, OffsetY A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 697;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreaka";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_un = (group1.runMethod(false,"Get",index1));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 698;BA.debugLine="DrawUnbreakable(un, OffsetY)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawunbreakable" /*RemoteObject*/ ,(Object)(_un),(Object)(_offsety));
 }
}Debug.locals.put("un", _un);
;
 BA.debugLineNum = 700;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawparagraph(RemoteObject __ref,RemoteObject _paragraph) throws Exception{
try {
		Debug.PushSubsStack("DrawParagraph (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,630);
if (RapidSub.canDelegate("drawparagraph")) { return __ref.runUserSub(false, "bctextengine","drawparagraph", __ref, _paragraph);}
RemoteObject _line = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextline");
Debug.locals.put("Paragraph", _paragraph);
 BA.debugLineNum = 630;BA.debugLine="Private Sub DrawParagraph (Paragraph As BCParagrap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 631;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _paragraph.getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (group1.runMethod(false,"Get",index1));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 632;BA.debugLine="DrawLine(line, line.BaselineY)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawline" /*RemoteObject*/ ,(Object)(_line),(Object)(_line.getField(true,"BaselineY" /*RemoteObject*/ )));
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 634;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawsingleline(RemoteObject __ref,RemoteObject _line,RemoteObject _iv,RemoteObject _par) throws Exception{
try {
		Debug.PushSubsStack("DrawSingleLine (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,636);
if (RapidSub.canDelegate("drawsingleline")) { return __ref.runUserSub(false, "bctextengine","drawsingleline", __ref, _line, _iv, _par);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("line", _line);
Debug.locals.put("iv", _iv);
Debug.locals.put("par", _par);
 BA.debugLineNum = 636;BA.debugLine="Public Sub DrawSingleLine (line As BCTextLine, iv";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 637;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
Debug.JustUpdateDeviceLine();
_r = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawsinglelineshared" /*RemoteObject*/ ,(Object)(_line),(Object)(_iv),(Object)(_par));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 638;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_r.runMethod(true,"getWidth"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_r.runMethod(true,"getHeight"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 639;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(xui.Color_Tra";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runVoidMethod ("_drawrect2",(Object)(_r),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getbrush" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")))),(Object)(bctextengine.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 640;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawline" /*RemoteObject*/ ,(Object)(_line),(Object)(_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )));
 BA.debugLineNum = 641;BA.debugLine="ForegroundBC.SetBitmapToImageView(ForegroundBC.B";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runVoidMethod ("_setbitmaptoimageview",(Object)(__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runMethod(false,"_getbitmap").runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _r.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _r.runMethod(true,"getHeight"))))),(Object)(_iv));
 };
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawsinglelineasync(RemoteObject __ref,RemoteObject _line,RemoteObject _iv,RemoteObject _par,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("DrawSingleLineAsync (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,653);
if (RapidSub.canDelegate("drawsinglelineasync")) { return __ref.runUserSub(false, "bctextengine","drawsinglelineasync", __ref, _line, _iv, _par, _target);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("line", _line);
Debug.locals.put("iv", _iv);
Debug.locals.put("par", _par);
Debug.locals.put("Target", _target);
 BA.debugLineNum = 653;BA.debugLine="Public Sub DrawSingleLineAsync (line As BCTextLine";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 654;BA.debugLine="Dim r As B4XRect = DrawSingleLineShared(line, iv,";
Debug.JustUpdateDeviceLine();
_r = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawsinglelineshared" /*RemoteObject*/ ,(Object)(_line),(Object)(_iv),(Object)(_par));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 655;BA.debugLine="If r.Width > 0 And r.Height > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_r.runMethod(true,"getWidth"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_r.runMethod(true,"getHeight"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 656;BA.debugLine="AsyncMode = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_asyncmode" /*RemoteObject*/ ,bctextengine.__c.getField(true,"True"));
 BA.debugLineNum = 657;BA.debugLine="If AsyncBCs.IsInitialized = False Then AsyncBCs.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ),bctextengine.__c.getField(true,"False"))) { 
__ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));};
 BA.debugLineNum = 658;BA.debugLine="Dim AsyncTasks As List";
Debug.JustUpdateDeviceLine();
bctextengine._asynctasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_asynctasks",bctextengine._asynctasks);
 BA.debugLineNum = 659;BA.debugLine="AsyncTasks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asynctasks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 660;BA.debugLine="AsyncBC = FindAsyncBC (r.Width, r.Height)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_asyncbc" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_findasyncbc" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _r.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _r.runMethod(true,"getHeight")))));
 BA.debugLineNum = 661;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBrush";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asynctasks" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_asyncbc" /*RemoteObject*/ ).runMethod(false,"_asyncdrawrect",(Object)(_r),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getbrush" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")))),(Object)(bctextengine.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 662;BA.debugLine="DrawLine(line, line.MaxHeightAboveBaseLine)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawline" /*RemoteObject*/ ,(Object)(_line),(Object)(_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )));
 BA.debugLineNum = 663;BA.debugLine="AsyncBC.DrawBitmapCreatorsAsync(Target, \"BC\", As";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asyncbc" /*RemoteObject*/ ).runVoidMethod ("_drawbitmapcreatorsasync",(Object)(_target),(Object)(BA.ObjectToString("BC")),(Object)(__ref.getField(false,"_asynctasks" /*RemoteObject*/ )));
 BA.debugLineNum = 664;BA.debugLine="AsyncMode = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_asyncmode" /*RemoteObject*/ ,bctextengine.__c.getField(true,"False"));
 BA.debugLineNum = 665;BA.debugLine="Return AsyncBC";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_asyncbc" /*RemoteObject*/ );
 };
 BA.debugLineNum = 667;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (bctextengine.__c.getField(false,"Null"));
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawsinglelineshared(RemoteObject __ref,RemoteObject _line,RemoteObject _iv,RemoteObject _par) throws Exception{
try {
		Debug.PushSubsStack("DrawSingleLineShared (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,645);
if (RapidSub.canDelegate("drawsinglelineshared")) { return __ref.runUserSub(false, "bctextengine","drawsinglelineshared", __ref, _line, _iv, _par);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("line", _line);
Debug.locals.put("iv", _iv);
Debug.locals.put("par", _par);
 BA.debugLineNum = 645;BA.debugLine="Private Sub DrawSingleLineShared (line As BCTextLi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 646;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 647;BA.debugLine="r.Initialize(0, 0, ForegroundBC.mWidth, line.MaxH";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).getField(true,"_mwidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ ),_line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ )}, "+",1, 1))));
 BA.debugLineNum = 648;BA.debugLine="iv.SetLayoutAnimated(0,  par.Style.Padding.Left,";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getLeft"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getTop"),(RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )}, "-",1, 1)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "+/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 650;BA.debugLine="Return r";
Debug.JustUpdateDeviceLine();
if (true) return _r;
 BA.debugLineNum = 651;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawsinglestylesection(RemoteObject __ref,RemoteObject _single,RemoteObject _offsety) throws Exception{
try {
		Debug.PushSubsStack("DrawSingleStyleSection (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,708);
if (RapidSub.canDelegate("drawsinglestylesection")) { return __ref.runUserSub(false, "bctextengine","drawsinglestylesection", __ref, _single, _offsety);}
RemoteObject _offsetx = RemoteObject.createImmutable(0);
RemoteObject _rtl = RemoteObject.createImmutable(false);
RemoteObject _go = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyphandoffset");
RemoteObject _g = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcglyph");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _dt = RemoteObject.declareNull("b4a.example.bitmapcreator._drawtask");
RemoteObject _u = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcstyledunderline");
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
Debug.locals.put("single", _single);
Debug.locals.put("OffsetY", _offsety);
 BA.debugLineNum = 708;BA.debugLine="Private Sub DrawSingleStyleSection (single As BCSi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 709;BA.debugLine="Dim OffsetX As Int = single.AbsoluteStartX";
Debug.JustUpdateDeviceLine();
_offsetx = _single.getField(true,"AbsoluteStartX" /*RemoteObject*/ );Debug.locals.put("OffsetX", _offsetx);Debug.locals.put("OffsetX", _offsetx);
 BA.debugLineNum = 710;BA.debugLine="Dim rtl As Boolean = single.ParentUN.RTL";
Debug.JustUpdateDeviceLine();
_rtl = _single.getField(false,"ParentUN" /*RemoteObject*/ ).getField(true,"RTL" /*RemoteObject*/ );Debug.locals.put("rtl", _rtl);Debug.locals.put("rtl", _rtl);
 BA.debugLineNum = 711;BA.debugLine="If rtl Then OffsetX = single.AbsoluteStartX + sin";
Debug.JustUpdateDeviceLine();
if (_rtl.<Boolean>get().booleanValue()) { 
_offsetx = RemoteObject.solve(new RemoteObject[] {_single.getField(true,"AbsoluteStartX" /*RemoteObject*/ ),_single.getField(true,"Width" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("OffsetX", _offsetx);};
 BA.debugLineNum = 712;BA.debugLine="For Each go As BCGlyphAndOffset In single.GlyphsA";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _single.getField(false,"GlyphsAndOffsets" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_go = (group4.runMethod(false,"Get",index4));Debug.locals.put("go", _go);
Debug.locals.put("go", _go);
 BA.debugLineNum = 713;BA.debugLine="Dim g As BCGlyph = go.Glyph";
Debug.JustUpdateDeviceLine();
_g = _go.getField(false,"Glyph" /*RemoteObject*/ );Debug.locals.put("g", _g);Debug.locals.put("g", _g);
 BA.debugLineNum = 715;BA.debugLine="If g = Null Then Continue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_g)) { 
if (true) continue;};
 BA.debugLineNum = 717;BA.debugLine="Dim x As Int = OffsetX";
Debug.JustUpdateDeviceLine();
_x = _offsetx;Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 718;BA.debugLine="If rtl Then x = x - g.cbc.mWidth";
Debug.JustUpdateDeviceLine();
if (_rtl.<Boolean>get().booleanValue()) { 
_x = RemoteObject.solve(new RemoteObject[] {_x,_g.getField(false,"cbc" /*RemoteObject*/ ).getField(true,"mWidth")}, "-",1, 1);Debug.locals.put("x", _x);};
 BA.debugLineNum = 719;BA.debugLine="If g.cbc.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_g.getField(false,"cbc" /*RemoteObject*/ ).getField(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 720;BA.debugLine="If AsyncMode Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_asyncmode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 721;BA.debugLine="Dim dt As DrawTask = AsyncBC.CreateDrawTask(g.";
Debug.JustUpdateDeviceLine();
_dt = __ref.getField(false,"_asyncbc" /*RemoteObject*/ ).runMethod(false,"_createdrawtask",(Object)((_g.getField(false,"cbc" /*RemoteObject*/ ))),(Object)(_g.getField(false,"cbc" /*RemoteObject*/ ).getField(false,"TargetRect")),(Object)(_x),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_offsety,_g.getField(true,"baseline" /*RemoteObject*/ ),_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"VerticalOffset" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "-+*",2, 0))),(Object)(bctextengine.__c.getField(true,"True")));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 722;BA.debugLine="dt.IsCompressedSource = True";
Debug.JustUpdateDeviceLine();
_dt.setField ("IsCompressedSource",bctextengine.__c.getField(true,"True"));
 BA.debugLineNum = 723;BA.debugLine="AsyncTasks.Add(dt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asynctasks" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_dt)));
 }else {
 BA.debugLineNum = 725;BA.debugLine="ForegroundBC.DrawCompressedBitmap(g.cbc, g.cbc";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runVoidMethod ("_drawcompressedbitmap",(Object)(_g.getField(false,"cbc" /*RemoteObject*/ )),(Object)(_g.getField(false,"cbc" /*RemoteObject*/ ).getField(false,"TargetRect")),(Object)(_x),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_offsety,_g.getField(true,"baseline" /*RemoteObject*/ ),_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"VerticalOffset" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "-+*",2, 0))));
 };
 };
 BA.debugLineNum = 728;BA.debugLine="If single.Run.Underline Then";
Debug.JustUpdateDeviceLine();
if (_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"Underline" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 729;BA.debugLine="Dim u As BCStyledUnderline = GetUnderlineStyle(";
Debug.JustUpdateDeviceLine();
_u = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getunderlinestyle" /*RemoteObject*/ ,(Object)(_single.getField(false,"Run" /*RemoteObject*/ )));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 730;BA.debugLine="Dim clr As Int = u.Clr";
Debug.JustUpdateDeviceLine();
_clr = _u.getField(true,"Clr" /*RemoteObject*/ );Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 731;BA.debugLine="If clr = 0 Then clr = single.Run.TextColor";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_clr,BA.numberCast(double.class, 0))) { 
_clr = _single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ );Debug.locals.put("clr", _clr);};
 BA.debugLineNum = 732;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 733;BA.debugLine="r.Initialize(x, single.Run.VerticalOffset * mSc";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, _x)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"VerticalOffset" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ ),_offsety,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*++",2, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,_g.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ ),_go.getField(true,"SpaceBetweenThisAndNext" /*RemoteObject*/ ),_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"CharacterSpacingFactor" /*RemoteObject*/ )}, "+++*",3, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_offsety,__ref.getField(true,"_mscale" /*RemoteObject*/ ),_u.getField(true,"Thickness" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ ),_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"VerticalOffset" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "++*+*",3, 0))));
 BA.debugLineNum = 735;BA.debugLine="If AsyncMode Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_asyncmode" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 736;BA.debugLine="AsyncTasks.Add(AsyncBC.AsyncDrawRect(r, GetBru";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asynctasks" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_asyncbc" /*RemoteObject*/ ).runMethod(false,"_asyncdrawrect",(Object)(_r),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getbrush" /*RemoteObject*/ ,(Object)(_clr))),(Object)(bctextengine.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0))))));
 }else {
 BA.debugLineNum = 738;BA.debugLine="ForegroundBC.DrawRect2(r, GetBrush(clr), True,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runVoidMethod ("_drawrect2",(Object)(_r),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getbrush" /*RemoteObject*/ ,(Object)(_clr))),(Object)(bctextengine.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 };
 };
 BA.debugLineNum = 741;BA.debugLine="If rtl Then";
Debug.JustUpdateDeviceLine();
if (_rtl.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 742;BA.debugLine="OffsetX = OffsetX - g.Width - go.SpaceBetweenTh";
Debug.JustUpdateDeviceLine();
_offsetx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_offsetx,_g.getField(true,"Width" /*RemoteObject*/ ),_go.getField(true,"SpaceBetweenThisAndNext" /*RemoteObject*/ ),_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"CharacterSpacingFactor" /*RemoteObject*/ )}, "--*",2, 0));Debug.locals.put("OffsetX", _offsetx);
 }else {
 BA.debugLineNum = 744;BA.debugLine="OffsetX = OffsetX + g.Width + go.SpaceBetweenTh";
Debug.JustUpdateDeviceLine();
_offsetx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_offsetx,_g.getField(true,"Width" /*RemoteObject*/ ),_go.getField(true,"SpaceBetweenThisAndNext" /*RemoteObject*/ ),_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"CharacterSpacingFactor" /*RemoteObject*/ )}, "++*",2, 0));Debug.locals.put("OffsetX", _offsetx);
 };
 }
}Debug.locals.put("go", _go);
;
 BA.debugLineNum = 747;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtext(RemoteObject __ref,RemoteObject _runs,RemoteObject _style,RemoteObject _foregroundimageview,RemoteObject _sv) throws Exception{
try {
		Debug.PushSubsStack("DrawText (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("drawtext")) { return __ref.runUserSub(false, "bctextengine","drawtext", __ref, _runs, _style, _foregroundimageview, _sv);}
RemoteObject _par = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcparagraph");
Debug.locals.put("Runs", _runs);
Debug.locals.put("Style", _style);
Debug.locals.put("ForegroundImageView", _foregroundimageview);
Debug.locals.put("sv", _sv);
 BA.debugLineNum = 204;BA.debugLine="Public Sub DrawText (Runs As List, Style As BCPara";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
Debug.JustUpdateDeviceLine();
_par = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_prepare" /*RemoteObject*/ ,(Object)(_runs),(Object)(_style));Debug.locals.put("par", _par);Debug.locals.put("par", _par);
 BA.debugLineNum = 208;BA.debugLine="ResizeLayers(par.Width / mScale, par.Height / mSc";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_resizelayers" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(true,"Height" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 209;BA.debugLine="DrawParagraph(par)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawparagraph" /*RemoteObject*/ ,(Object)(_par));
 BA.debugLineNum = 210;BA.debugLine="If par.Width > 0 And par.Height > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_par.getField(true,"Width" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_par.getField(true,"Height" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 211;BA.debugLine="ResizeImageView(ForegroundBC, par, ForegroundIma";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_resizeimageview" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_foregroundbc" /*RemoteObject*/ )),(Object)(_par),(Object)(_foregroundimageview),(Object)(_par.getField(false,"Style" /*RemoteObject*/ ).getField(true,"ResizeHeightAutomatically" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 213;BA.debugLine="If par.Style.ResizeHeightAutomatically And sv.IsI";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_par.getField(false,"Style" /*RemoteObject*/ ).getField(true,"ResizeHeightAutomatically" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",_sv.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 214;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2di";
Debug.JustUpdateDeviceLine();
_sv.runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_sv.runMethod(true,"getHeight"),bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {_foregroundimageview.runMethod(true,"getHeight"),_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getTop"),_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getBottom")}, "++",2, 0)))));
 };
 BA.debugLineNum = 216;BA.debugLine="AddParagraphViews(par)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_addparagraphviews" /*RemoteObject*/ ,(Object)(_par));
 BA.debugLineNum = 217;BA.debugLine="Return par";
Debug.JustUpdateDeviceLine();
if (true) return _par;
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawunbreakable(RemoteObject __ref,RemoteObject _un,RemoteObject _offsety) throws Exception{
try {
		Debug.PushSubsStack("DrawUnbreakable (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,702);
if (RapidSub.canDelegate("drawunbreakable")) { return __ref.runUserSub(false, "bctextengine","drawunbreakable", __ref, _un, _offsety);}
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
Debug.locals.put("un", _un);
Debug.locals.put("OffsetY", _offsety);
 BA.debugLineNum = 702;BA.debugLine="Private Sub DrawUnbreakable (un As BCUnbreakableTe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 703;BA.debugLine="For Each single As BCSingleStyleSection In un.Sin";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _un.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_single = (group1.runMethod(false,"Get",index1));Debug.locals.put("single", _single);
Debug.locals.put("single", _single);
 BA.debugLineNum = 704;BA.debugLine="DrawSingleStyleSection(single, OffsetY)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_drawsinglestylesection" /*RemoteObject*/ ,(Object)(_single),(Object)(_offsety));
 }
}Debug.locals.put("single", _single);
;
 BA.debugLineNum = 706;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findasyncbc(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("FindAsyncBC (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("findasyncbc")) { return __ref.runUserSub(false, "bctextengine","findasyncbc", __ref, _width, _height);}
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _used = RemoteObject.createImmutable(false);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _b = RemoteObject.createImmutable(false);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 670;BA.debugLine="Private Sub FindAsyncBC (Width As Int, Height As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 671;BA.debugLine="For Each bc As BitmapCreator In AsyncBCs.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_bc = (group1.runMethod(false,"Get",index1));Debug.locals.put("bc", _bc);
Debug.locals.put("bc", _bc);
 BA.debugLineNum = 672;BA.debugLine="If bc.mWidth = Width And bc.mHeight = Height The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bc.getField(true,"_mwidth"),BA.numberCast(double.class, _width)) && RemoteObject.solveBoolean("=",_bc.getField(true,"_mheight"),BA.numberCast(double.class, _height))) { 
 BA.debugLineNum = 673;BA.debugLine="Dim Used As Boolean = AsyncBCs.Get(bc)";
Debug.JustUpdateDeviceLine();
_used = BA.ObjectToBoolean(__ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_bc))));Debug.locals.put("Used", _used);Debug.locals.put("Used", _used);
 BA.debugLineNum = 674;BA.debugLine="If Used = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_used,bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 675;BA.debugLine="AsyncBCs.Put(bc, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_bc)),(Object)((bctextengine.__c.getField(true,"True"))));
 BA.debugLineNum = 676;BA.debugLine="Return bc";
Debug.JustUpdateDeviceLine();
if (true) return _bc;
 };
 };
 }
}Debug.locals.put("bc", _bc);
;
 BA.debugLineNum = 680;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 681;BA.debugLine="bc.Initialize(Width, Height)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 682;BA.debugLine="AsyncBCs.Put(bc, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_bc)),(Object)((bctextengine.__c.getField(true,"True"))));
 BA.debugLineNum = 683;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 684;BA.debugLine="For Each b As Boolean In AsyncBCs.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group14 = __ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_b = BA.ObjectToBoolean(group14.runMethod(false,"Get",index14));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 685;BA.debugLine="If b Then i = i + 1";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);};
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 687;BA.debugLine="Return bc";
Debug.JustUpdateDeviceLine();
if (true) return _bc;
 BA.debugLineNum = 688;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findminrect(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("FindMinRect (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,984);
if (RapidSub.canDelegate("findminrect")) { return __ref.runUserSub(false, "bctextengine","findminrect", __ref, _width, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
int _y = 0;
int _x = 0;
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 984;BA.debugLine="Private Sub FindMinRect (width As Int, height As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 985;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 986;BA.debugLine="r.Initialize(width / 2, -1, -1, 0)";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, -(double) (0 + 1))),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 987;BA.debugLine="For y = 0 To height - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step3 > 0 && _y <= limit3) || (step3 < 0 && _y >= limit3) ;_y = ((int)(0 + _y + step3))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 988;BA.debugLine="For x = 0 To width - 1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step4 > 0 && _x <= limit4) || (step4 < 0 && _x >= limit4) ;_x = ((int)(0 + _x + step4))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 989;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_charbc" /*RemoteObject*/ ).runMethod(true,"_istransparent",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y))),bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 990;BA.debugLine="r.Left = Min(r.Left, x)";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setLeft",BA.numberCast(float.class, bctextengine.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _r.runMethod(true,"getLeft"))),(Object)(BA.numberCast(double.class, _x)))));
 BA.debugLineNum = 991;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 994;BA.debugLine="If x < width Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_x),BA.numberCast(double.class, _width))) { 
 BA.debugLineNum = 995;BA.debugLine="If r.Top = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r.runMethod(true,"getTop"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 996;BA.debugLine="r.Top = y";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setTop",BA.numberCast(float.class, _y));
 }else {
 BA.debugLineNum = 998;BA.debugLine="r.Bottom = y + 1";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setBottom",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(1)}, "+",1, 1)));
 };
 BA.debugLineNum = 1000;BA.debugLine="For x = width - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step16 = -1;
final int limit16 = 0;
_x = RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step16 > 0 && _x <= limit16) || (step16 < 0 && _x >= limit16) ;_x = ((int)(0 + _x + step16))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 1001;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_charbc" /*RemoteObject*/ ).runMethod(true,"_istransparent",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y))),bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1002;BA.debugLine="r.Right = Max(r.Right, x + 1)";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setRight",BA.numberCast(float.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _r.runMethod(true,"getRight"))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(1)}, "+",1, 1))))));
 BA.debugLineNum = 1003;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("x", _x);
;
 };
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 1008;BA.debugLine="r.Bottom = Max(r.Bottom, r.Top + 1)";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setBottom",BA.numberCast(float.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _r.runMethod(true,"getBottom"))),(Object)(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),RemoteObject.createImmutable(1)}, "+",1, 0)))));
 BA.debugLineNum = 1009;BA.debugLine="Return r";
Debug.JustUpdateDeviceLine();
if (true) return _r;
 BA.debugLineNum = 1010;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findsinglestylesection(RemoteObject __ref,RemoteObject _paragraph,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("FindSingleStyleSection (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,776);
if (RapidSub.canDelegate("findsinglestylesection")) { return __ref.runUserSub(false, "bctextengine","findsinglestylesection", __ref, _paragraph, _x, _y);}
RemoteObject _line = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextline");
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _s = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
Debug.locals.put("Paragraph", _paragraph);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 776;BA.debugLine="Public Sub FindSingleStyleSection (Paragraph As BC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 777;BA.debugLine="x = x * mScale";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("X", _x);
 BA.debugLineNum = 778;BA.debugLine="y = y * mScale";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("Y", _y);
 BA.debugLineNum = 779;BA.debugLine="For Each line As BCTextLine In Paragraph.TextLine";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _paragraph.getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (group3.runMethod(false,"Get",index3));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 781;BA.debugLine="If line.BaseLineY - line.MaxHeightAboveBaseLine";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )}, "-",1, 1),BA.numberCast(double.class, _y)) && RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ )}, "+",1, 1),BA.numberCast(double.class, _y))) { 
 BA.debugLineNum = 782;BA.debugLine="For Each un As BCUnbreakableText In line.Unbrea";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_un = (group5.runMethod(false,"Get",index5));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 783;BA.debugLine="If (Paragraph.Style.RTL = False And line.Start";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_paragraph.getField(false,"Style" /*RemoteObject*/ ).getField(true,"RTL" /*RemoteObject*/ ),bctextengine.__c.getField(true,"False")) && RemoteObject.solveBoolean("k",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"StartX" /*RemoteObject*/ ),_un.getField(true,"StartX" /*RemoteObject*/ )}, "+",1, 1),BA.numberCast(double.class, _x)) && RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"StartX" /*RemoteObject*/ ),_un.getField(true,"StartX" /*RemoteObject*/ ),_un.getField(true,"Width" /*RemoteObject*/ )}, "++",2, 1),BA.numberCast(double.class, _x))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",_paragraph.getField(false,"Style" /*RemoteObject*/ ).getField(true,"RTL" /*RemoteObject*/ )) && RemoteObject.solveBoolean("k",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ )}, "-",1, 1),BA.numberCast(double.class, _y)) && RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),_line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ )}, "+",1, 1),BA.numberCast(double.class, _y)))))) { 
 BA.debugLineNum = 785;BA.debugLine="For Each s As BCSingleStyleSection In un.Sing";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = _un.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_s = (group7.runMethod(false,"Get",index7));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 786;BA.debugLine="If s.AbsoluteStartX <= x And s.AbsoluteStart";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_s.getField(true,"AbsoluteStartX" /*RemoteObject*/ ),BA.numberCast(double.class, _x)) && RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_s.getField(true,"AbsoluteStartX" /*RemoteObject*/ ),_s.getField(true,"Width" /*RemoteObject*/ )}, "+",1, 1),BA.numberCast(double.class, _x))) { 
if (true) return _s;};
 }
}Debug.locals.put("s", _s);
;
 };
 }
}Debug.locals.put("un", _un);
;
 };
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 792;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (bctextengine.__c.getField(false,"Null"));
 BA.debugLineNum = 793;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fonttokey(RemoteObject __ref,RemoteObject _fnt,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("FontToKey (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1012);
if (RapidSub.canDelegate("fonttokey")) { return __ref.runUserSub(false, "bctextengine","fonttokey", __ref, _fnt, _clr);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("fnt", _fnt);
Debug.locals.put("Clr", _clr);
 BA.debugLineNum = 1012;BA.debugLine="Private Sub FontToKey (fnt As B4XFont, Clr As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1014;BA.debugLine="Dim jo As JavaObject = fnt.ToNativeFont";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _fnt.runMethod(false,"ToNativeFont").getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1015;BA.debugLine="Return Clr + jo.RunMethod(\"hashCode\", Null) + fnt";
Debug.JustUpdateDeviceLine();
if (true) return BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_clr,BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("hashCode")),(Object)((bctextengine.__c.getField(false,"Null"))))),_fnt.runMethod(true,"getSize")}, "++",2, 0));
 BA.debugLineNum = 1021;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbrush(RemoteObject __ref,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("GetBrush (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,799);
if (RapidSub.canDelegate("getbrush")) { return __ref.runUserSub(false, "bctextengine","getbrush", __ref, _clr);}
RemoteObject _b = RemoteObject.declareNull("b4a.example.bcpath._bcbrush");
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 799;BA.debugLine="Private Sub GetBrush(clr As Int) As BCBrush";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 800;BA.debugLine="If Brushes.ContainsKey(clr) Then Return Brushes.G";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_brushes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_clr))).<Boolean>get().booleanValue()) { 
if (true) return (__ref.getField(false,"_brushes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_clr))));};
 BA.debugLineNum = 801;BA.debugLine="Dim b As BCBrush = ForegroundBC.CreateBrushFromCo";
Debug.JustUpdateDeviceLine();
_b = __ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runMethod(false,"_createbrushfromcolor",(Object)(_clr));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 802;BA.debugLine="Brushes.Put(clr, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_brushes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_clr)),(Object)((_b)));
 BA.debugLineNum = 803;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 BA.debugLineNum = 804;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstsinglestyle(RemoteObject __ref,RemoteObject _line) throws Exception{
try {
		Debug.PushSubsStack("GetFirstSingleStyle (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("getfirstsinglestyle")) { return __ref.runUserSub(false, "bctextengine","getfirstsinglestyle", __ref, _line);}
RemoteObject _firstun = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
Debug.locals.put("Line", _line);
 BA.debugLineNum = 394;BA.debugLine="Private Sub GetFirstSingleStyle (Line As BCTextLin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 395;BA.debugLine="Dim FirstUN As BCUnbreakableText = Line.Unbreakab";
Debug.JustUpdateDeviceLine();
_firstun = (_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FirstUN", _firstun);Debug.locals.put("FirstUN", _firstun);
 BA.debugLineNum = 396;BA.debugLine="Return FirstUN.SingleStyleSections.Get(0)";
Debug.JustUpdateDeviceLine();
if (true) return (_firstun.getField(false,"SingleStyleSections" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfontmetrics(RemoteObject __ref,RemoteObject _fnt,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("GetFontMetrics (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,807);
if (RapidSub.canDelegate("getfontmetrics")) { return __ref.runUserSub(false, "bctextengine","getfontmetrics", __ref, _fnt, _clr);}
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _fm = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcfontmetrics");
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 807;BA.debugLine="Public Sub GetFontMetrics(Fnt As B4XFont, clr As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 808;BA.debugLine="Dim key As String = FontToKey(Fnt, clr)";
Debug.JustUpdateDeviceLine();
_key = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_fonttokey" /*RemoteObject*/ ,(Object)(_fnt),(Object)(_clr));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 809;BA.debugLine="If FontMetricsCache.ContainsKey(key) Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_fontmetricscache" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_key))).<Boolean>get().booleanValue()) { 
if (true) return (__ref.getField(false,"_fontmetricscache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_key))));};
 BA.debugLineNum = 810;BA.debugLine="Dim fm As BCFontMetrics";
Debug.JustUpdateDeviceLine();
_fm = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcfontmetrics");Debug.locals.put("fm", _fm);
 BA.debugLineNum = 811;BA.debugLine="fm.Initialize";
Debug.JustUpdateDeviceLine();
_fm.runVoidMethod ("Initialize");
 BA.debugLineNum = 812;BA.debugLine="fm.Glyphs.Initialize";
Debug.JustUpdateDeviceLine();
_fm.getField(false,"Glyphs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 813;BA.debugLine="fm.Clr = clr";
Debug.JustUpdateDeviceLine();
_fm.setField ("Clr" /*RemoteObject*/ ,_clr);
 BA.debugLineNum = 814;BA.debugLine="fm.Fnt = Fnt";
Debug.JustUpdateDeviceLine();
_fm.setField ("Fnt" /*RemoteObject*/ ,_fnt);
 BA.debugLineNum = 815;BA.debugLine="If clr = DefaultColor Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_clr,BA.numberCast(double.class, __ref.getField(true,"_defaultcolor" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 816;BA.debugLine="fm.KerningTable.Initialize";
Debug.JustUpdateDeviceLine();
_fm.getField(false,"KerningTable" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 817;BA.debugLine="fm.DefaultColorMetrics = fm";
Debug.JustUpdateDeviceLine();
_fm.setField ("DefaultColorMetrics" /*RemoteObject*/ ,_fm);
 BA.debugLineNum = 818;BA.debugLine="fm.xWidth = CreateGlyph(\"x\", fm, False).Width";
Debug.JustUpdateDeviceLine();
_fm.setField ("xWidth" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(BA.ObjectToString("x")),(Object)(_fm),(Object)(bctextengine.__c.getField(true,"False"))).getField(true,"Width" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 820;BA.debugLine="fm.DefaultColorMetrics = GetFontMetrics(Fnt, Def";
Debug.JustUpdateDeviceLine();
_fm.setField ("DefaultColorMetrics" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getfontmetrics" /*RemoteObject*/ ,(Object)(_fnt),(Object)(__ref.getField(true,"_defaultcolor" /*RemoteObject*/ ))));
 BA.debugLineNum = 821;BA.debugLine="fm.xWidth = fm.DefaultColorMetrics.xWidth";
Debug.JustUpdateDeviceLine();
_fm.setField ("xWidth" /*RemoteObject*/ ,_fm.getField(false,"DefaultColorMetrics" /*RemoteObject*/ ).getField(true,"xWidth" /*RemoteObject*/ ));
 BA.debugLineNum = 822;BA.debugLine="fm.KerningTable = fm.DefaultColorMetrics.Kerning";
Debug.JustUpdateDeviceLine();
_fm.setField ("KerningTable" /*RemoteObject*/ ,_fm.getField(false,"DefaultColorMetrics" /*RemoteObject*/ ).getField(false,"KerningTable" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 824;BA.debugLine="FontMetricsCache.Put(key, fm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fontmetricscache" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_fm)));
 BA.debugLineNum = 825;BA.debugLine="Return fm";
Debug.JustUpdateDeviceLine();
if (true) return _fm;
 BA.debugLineNum = 826;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getkernspacebetweenchars(RemoteObject __ref,RemoteObject _fm,RemoteObject _prevchar,RemoteObject _thischar,RemoteObject _prevglyph,RemoteObject _thisglyph) throws Exception{
try {
		Debug.PushSubsStack("GetKernSpaceBetweenChars (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,615);
if (RapidSub.canDelegate("getkernspacebetweenchars")) { return __ref.runUserSub(false, "bctextengine","getkernspacebetweenchars", __ref, _fm, _prevchar, _thischar, _prevglyph, _thisglyph);}
RemoteObject _together = RemoteObject.createImmutable("");
RemoteObject _space = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _w = RemoteObject.createImmutable(0);
Debug.locals.put("fm", _fm);
Debug.locals.put("PrevChar", _prevchar);
Debug.locals.put("ThisChar", _thischar);
Debug.locals.put("PrevGlyph", _prevglyph);
Debug.locals.put("ThisGlyph", _thisglyph);
 BA.debugLineNum = 615;BA.debugLine="Private Sub GetKernSpaceBetweenChars (fm As BCFont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 616;BA.debugLine="Dim together As String = PrevChar & ThisChar";
Debug.JustUpdateDeviceLine();
_together = RemoteObject.concat(_prevchar,_thischar);Debug.locals.put("together", _together);Debug.locals.put("together", _together);
 BA.debugLineNum = 617;BA.debugLine="Dim Space As Int = fm.KerningTable.GetDefault(tog";
Debug.JustUpdateDeviceLine();
_space = BA.numberCast(int.class, _fm.getField(false,"KerningTable" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_together)),(Object)(RemoteObject.createImmutable((-(double) (0 + 1000))))));Debug.locals.put("Space", _space);Debug.locals.put("Space", _space);
 BA.debugLineNum = 618;BA.debugLine="If Space > -1000 Then Return Space";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_space,BA.numberCast(double.class, -(double) (0 + 1000)))) { 
if (true) return _space;};
 BA.debugLineNum = 619;BA.debugLine="Dim res As Int";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 620;BA.debugLine="If ThisGlyph.Empty Or PrevGlyph.Empty Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_thisglyph.getField(true,"Empty" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",_prevglyph.getField(true,"Empty" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 621;BA.debugLine="res = mSpaceBetweenCharacters";
Debug.JustUpdateDeviceLine();
_res = BA.numberCast(int.class, __ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ ));Debug.locals.put("res", _res);
 }else {
 BA.debugLineNum = 623;BA.debugLine="Dim w As Int = CreateGlyph(together, fm, True).W";
Debug.JustUpdateDeviceLine();
_w = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createglyph" /*RemoteObject*/ ,(Object)(_together),(Object)(_fm),(Object)(bctextengine.__c.getField(true,"True"))).getField(true,"Width" /*RemoteObject*/ );Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 624;BA.debugLine="res = w - PrevGlyph.Width - ThisGlyph.Width";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.solve(new RemoteObject[] {_w,_prevglyph.getField(true,"Width" /*RemoteObject*/ ),_thisglyph.getField(true,"Width" /*RemoteObject*/ )}, "--",2, 1);Debug.locals.put("res", _res);
 };
 BA.debugLineNum = 626;BA.debugLine="fm.KerningTable.Put(together, res)";
Debug.JustUpdateDeviceLine();
_fm.getField(false,"KerningTable" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_together)),(Object)((_res)));
 BA.debugLineNum = 627;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 628;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmingapbetweenlines(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMinGapBetweenLines (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1046);
if (RapidSub.canDelegate("getmingapbetweenlines")) { return __ref.runUserSub(false, "bctextengine","getmingapbetweenlines", __ref);}
 BA.debugLineNum = 1046;BA.debugLine="Public Sub getMinGapBetweenLines As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1047;BA.debugLine="Return mMinGapBetweenLines";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mmingapbetweenlines" /*RemoteObject*/ );
 BA.debugLineNum = 1048;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrunanchorifcurrentnotset(RemoteObject __ref,RemoteObject _textrun,RemoteObject _current) throws Exception{
try {
		Debug.PushSubsStack("GetRunAnchorIfCurrentNotSet (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("getrunanchorifcurrentnotset")) { return __ref.runUserSub(false, "bctextengine","getrunanchorifcurrentnotset", __ref, _textrun, _current);}
Debug.locals.put("TextRun", _textrun);
Debug.locals.put("Current", _current);
 BA.debugLineNum = 561;BA.debugLine="Private Sub GetRunAnchorIfCurrentNotSet(TextRun As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 562;BA.debugLine="If Current <> \"\" Then Return Current";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_current,BA.ObjectToString(""))) { 
if (true) return _current;};
 BA.debugLineNum = 563;BA.debugLine="If TextRun.Extra.IsInitialized = False Then Retur";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_textrun.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),bctextengine.__c.getField(true,"False"))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 564;BA.debugLine="Return TextRun.Extra.GetDefault(\"a\", \"\")";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_textrun.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("a"))),(Object)((RemoteObject.createImmutable("")))));
 BA.debugLineNum = 565;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getspacebetweencharacters(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSpaceBetweenCharacters (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1024);
if (RapidSub.canDelegate("getspacebetweencharacters")) { return __ref.runUserSub(false, "bctextengine","getspacebetweencharacters", __ref);}
 BA.debugLineNum = 1024;BA.debugLine="Public Sub getSpaceBetweenCharacters As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1025;BA.debugLine="Return mSpaceBetweenCharacters / mScale";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0));
 BA.debugLineNum = 1026;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getspacebetweenlines(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSpaceBetweenLines (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1033);
if (RapidSub.canDelegate("getspacebetweenlines")) { return __ref.runUserSub(false, "bctextengine","getspacebetweenlines", __ref);}
 BA.debugLineNum = 1033;BA.debugLine="Public Sub getSpaceBetweenLines As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1034;BA.debugLine="Return mSpaceBetweenLines / mScale";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mspacebetweenlines" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0));
 BA.debugLineNum = 1035;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getunderlinestyle(RemoteObject __ref,RemoteObject _run) throws Exception{
try {
		Debug.PushSubsStack("GetUnderlineStyle (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,749);
if (RapidSub.canDelegate("getunderlinestyle")) { return __ref.runUserSub(false, "bctextengine","getunderlinestyle", __ref, _run);}
Debug.locals.put("run", _run);
 BA.debugLineNum = 749;BA.debugLine="Private Sub GetUnderlineStyle(run As BCTextRun) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 750;BA.debugLine="If run.Extra.IsInitialized = False Then Return De";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_run.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),bctextengine.__c.getField(true,"False"))) { 
if (true) return __ref.getField(false,"_defaultunderlinestyle" /*RemoteObject*/ );};
 BA.debugLineNum = 751;BA.debugLine="Return run.Extra.GetDefault(EXTRA_STYLEDUNDERLINE";
Debug.JustUpdateDeviceLine();
if (true) return (_run.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((__ref.getField(true,"_extra_styledunderline" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_defaultunderlinestyle" /*RemoteObject*/ )))));
 BA.debugLineNum = 752;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handleconnectedtextruns(RemoteObject __ref,RemoteObject _run,RemoteObject _unbreakables,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("HandleConnectedTextRuns (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,409);
if (RapidSub.canDelegate("handleconnectedtextruns")) { return __ref.runUserSub(false, "bctextengine","handleconnectedtextruns", __ref, _run, _unbreakables, _style);}
RemoteObject _children = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cr = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcconnectedruns");
RemoteObject _r = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextrun");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _fm = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcfontmetrics");
RemoteObject _connectedwidth = RemoteObject.createImmutable(0);
RemoteObject _u = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
int _i = 0;
RemoteObject _leftoffset = RemoteObject.createImmutable(0);
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
Debug.locals.put("Run", _run);
Debug.locals.put("Unbreakables", _unbreakables);
Debug.locals.put("Style", _style);
 BA.debugLineNum = 409;BA.debugLine="Private Sub HandleConnectedTextRuns (Run As BCText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 410;BA.debugLine="Dim children As List";
Debug.JustUpdateDeviceLine();
_children = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("children", _children);
 BA.debugLineNum = 411;BA.debugLine="children.Initialize";
Debug.JustUpdateDeviceLine();
_children.runVoidMethod ("Initialize");
 BA.debugLineNum = 412;BA.debugLine="Dim cr As BCConnectedRuns = Run.EXTRA.Get(EXTRA_C";
Debug.JustUpdateDeviceLine();
_cr = (_run.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((__ref.getField(true,"_extra_connectedruns" /*RemoteObject*/ )))));Debug.locals.put("cr", _cr);Debug.locals.put("cr", _cr);
 BA.debugLineNum = 413;BA.debugLine="For Each r As BCTextRun In cr.Runs";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _cr.getField(false,"Runs" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_r = (group4.runMethod(false,"Get",index4));Debug.locals.put("r", _r);
Debug.locals.put("r", _r);
 BA.debugLineNum = 414;BA.debugLine="HandleTextRun(r, children, Style)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_handletextrun" /*RemoteObject*/ ,(Object)(_r),(Object)(_children),(Object)(_style));
 }
}Debug.locals.put("r", _r);
;
 BA.debugLineNum = 416;BA.debugLine="Dim width As Int";
Debug.JustUpdateDeviceLine();
_width = RemoteObject.createImmutable(0);Debug.locals.put("width", _width);
 BA.debugLineNum = 417;BA.debugLine="For Each un As BCUnbreakableText In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = _children;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_un = (group8.runMethod(false,"Get",index8));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 418;BA.debugLine="un.IsMergable = True";
Debug.JustUpdateDeviceLine();
_un.setField ("IsMergable" /*RemoteObject*/ ,bctextengine.__c.getField(true,"True"));
 BA.debugLineNum = 419;BA.debugLine="width = width + un.Width";
Debug.JustUpdateDeviceLine();
_width = RemoteObject.solve(new RemoteObject[] {_width,_un.getField(true,"Width" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("width", _width);
 }
}Debug.locals.put("un", _un);
;
 BA.debugLineNum = 421;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
Debug.JustUpdateDeviceLine();
_fm = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getfontmetrics" /*RemoteObject*/ ,(Object)(_run.getField(false,"TextFont" /*RemoteObject*/ )),(Object)(_run.getField(true,"TextColor" /*RemoteObject*/ )));Debug.locals.put("fm", _fm);Debug.locals.put("fm", _fm);
 BA.debugLineNum = 422;BA.debugLine="Dim ConnectedWidth As Int = cr.ConnectedWidth * m";
Debug.JustUpdateDeviceLine();
_connectedwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_cr.getField(true,"ConnectedWidth" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("ConnectedWidth", _connectedwidth);Debug.locals.put("ConnectedWidth", _connectedwidth);
 BA.debugLineNum = 424;BA.debugLine="Dim u As BCUnbreakableText = children.Get(0)";
Debug.JustUpdateDeviceLine();
_u = (_children.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("u", _u);Debug.locals.put("u", _u);
 BA.debugLineNum = 425;BA.debugLine="For i = 1 To children.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {_children.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 426;BA.debugLine="MergeUnbreakables(u, children.Get(i))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_mergeunbreakables" /*RemoteObject*/ ,(Object)(_u),(Object)((_children.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 428;BA.debugLine="If width < ConnectedWidth Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_width,BA.numberCast(double.class, _connectedwidth))) { 
 BA.debugLineNum = 429;BA.debugLine="Dim leftOffset As Int";
Debug.JustUpdateDeviceLine();
_leftoffset = RemoteObject.createImmutable(0);Debug.locals.put("leftOffset", _leftoffset);
 BA.debugLineNum = 430;BA.debugLine="Select cr.Alignment.ToLowerCase";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_cr.getField(true,"Alignment" /*RemoteObject*/ ).runMethod(true,"toLowerCase"),BA.ObjectToString("center"),BA.ObjectToString("right"))) {
case 0: {
 BA.debugLineNum = 432;BA.debugLine="leftOffset = (ConnectedWidth - u.Width) / 2";
Debug.JustUpdateDeviceLine();
_leftoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_connectedwidth,_u.getField(true,"Width" /*RemoteObject*/ )}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("leftOffset", _leftoffset);
 break; }
case 1: {
 BA.debugLineNum = 434;BA.debugLine="leftOffset = ConnectedWidth - u.Width - mSpace";
Debug.JustUpdateDeviceLine();
_leftoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_connectedwidth,_u.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "--",2, 0));Debug.locals.put("leftOffset", _leftoffset);
 break; }
}
;
 BA.debugLineNum = 436;BA.debugLine="u.Width = ConnectedWidth";
Debug.JustUpdateDeviceLine();
_u.setField ("Width" /*RemoteObject*/ ,_connectedwidth);
 BA.debugLineNum = 437;BA.debugLine="If leftOffset > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_leftoffset,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 438;BA.debugLine="Dim single As BCSingleStyleSection = CreateSing";
Debug.JustUpdateDeviceLine();
_single = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createsinglesection" /*RemoteObject*/ ,(Object)(_run),(Object)(__ref.getField(false,"_emptytextchars" /*RemoteObject*/ )),(Object)(_fm));Debug.locals.put("single", _single);Debug.locals.put("single", _single);
 BA.debugLineNum = 439;BA.debugLine="single.Width = leftOffset";
Debug.JustUpdateDeviceLine();
_single.setField ("Width" /*RemoteObject*/ ,_leftoffset);
 BA.debugLineNum = 440;BA.debugLine="u.SingleStyleSections.InsertAt(0, single)";
Debug.JustUpdateDeviceLine();
_u.getField(false,"SingleStyleSections" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_single)));
 };
 };
 BA.debugLineNum = 443;BA.debugLine="u.IsMergable = False";
Debug.JustUpdateDeviceLine();
_u.setField ("IsMergable" /*RemoteObject*/ ,bctextengine.__c.getField(true,"False"));
 BA.debugLineNum = 444;BA.debugLine="Unbreakables.Add(u)";
Debug.JustUpdateDeviceLine();
_unbreakables.runVoidMethod ("Add",(Object)((_u)));
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _handletextrun(RemoteObject __ref,RemoteObject _run,RemoteObject _unbreakables,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("HandleTextRun (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,447);
if (RapidSub.canDelegate("handletextrun")) { return __ref.runUserSub(false, "bctextengine","handletextrun", __ref, _run, _unbreakables, _style);}
RemoteObject _fm = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcfontmetrics");
RemoteObject _i1 = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _c = RemoteObject.createImmutable("");
RemoteObject _separatorgoestogetherwithtext = RemoteObject.createImmutable(false);
RemoteObject _offset = RemoteObject.createImmutable(0);
Debug.locals.put("Run", _run);
Debug.locals.put("Unbreakables", _unbreakables);
Debug.locals.put("style", _style);
 BA.debugLineNum = 447;BA.debugLine="Private Sub HandleTextRun (Run As BCTextRun, Unbre";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 448;BA.debugLine="Dim fm As BCFontMetrics = GetFontMetrics(Run.Text";
Debug.JustUpdateDeviceLine();
_fm = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getfontmetrics" /*RemoteObject*/ ,(Object)(_run.getField(false,"TextFont" /*RemoteObject*/ )),(Object)(_run.getField(true,"TextColor" /*RemoteObject*/ )));Debug.locals.put("fm", _fm);Debug.locals.put("fm", _fm);
 BA.debugLineNum = 449;BA.debugLine="Dim i1 As Int";
Debug.JustUpdateDeviceLine();
_i1 = RemoteObject.createImmutable(0);Debug.locals.put("i1", _i1);
 BA.debugLineNum = 450;BA.debugLine="For i = 0 To Run.TextChars.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_run.getField(false,"TextChars" /*RemoteObject*/ ).getField(true,"Length" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 451;BA.debugLine="Dim c As String = Run.TextChars.Buffer(Run.TextC";
Debug.JustUpdateDeviceLine();
_c = _run.getField(false,"TextChars" /*RemoteObject*/ ).getField(false,"Buffer" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {_run.getField(false,"TextChars" /*RemoteObject*/ ).getField(true,"StartIndex" /*RemoteObject*/ ),RemoteObject.createImmutable(_i)}, "+",1, 1));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 452;BA.debugLine="If WordBoundaries.Contains(c) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_wordboundaries" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(_c)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 453;BA.debugLine="Dim SeparatorGoesTogetherWithText As Boolean";
Debug.JustUpdateDeviceLine();
_separatorgoestogetherwithtext = RemoteObject.createImmutable(false);Debug.locals.put("SeparatorGoesTogetherWithText", _separatorgoestogetherwithtext);
 BA.debugLineNum = 454;BA.debugLine="If i >= i1 + 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_i1,RemoteObject.createImmutable(1)}, "+",1, 1)))) { 
 BA.debugLineNum = 455;BA.debugLine="Dim offset As Int";
Debug.JustUpdateDeviceLine();
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 456;BA.debugLine="If WordBoundariesThatCanConnectToPrevWord.Inde";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_wordboundariesthatcanconnecttoprevword" /*RemoteObject*/ ).runMethod(true,"indexOf",(Object)(_c)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 457;BA.debugLine="offset = 1";
Debug.JustUpdateDeviceLine();
_offset = BA.numberCast(int.class, 1);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 458;BA.debugLine="SeparatorGoesTogetherWithText = True";
Debug.JustUpdateDeviceLine();
_separatorgoestogetherwithtext = bctextengine.__c.getField(true,"True");Debug.locals.put("SeparatorGoesTogetherWithText", _separatorgoestogetherwithtext);
 };
 BA.debugLineNum = 460;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
Debug.JustUpdateDeviceLine();
_unbreakables.runVoidMethod ("Add",(Object)((__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createunbreakable" /*RemoteObject*/ ,(Object)(_run),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_textcharssubstring" /*RemoteObject*/ ,(Object)(_run.getField(false,"TextChars" /*RemoteObject*/ )),(Object)(_i1),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_offset}, "+",1, 1)))),(Object)(_fm),(Object)(bctextengine.__c.getField(true,"True")),(Object)(_style)))));
 };
 BA.debugLineNum = 462;BA.debugLine="If SeparatorGoesTogetherWithText = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_separatorgoestogetherwithtext,bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 463;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, TextCh";
Debug.JustUpdateDeviceLine();
_unbreakables.runVoidMethod ("Add",(Object)((__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createunbreakable" /*RemoteObject*/ ,(Object)(_run),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_textcharssubstring" /*RemoteObject*/ ,(Object)(_run.getField(false,"TextChars" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _i)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))),(Object)(_fm),(Object)(bctextengine.__c.getField(true,"True")),(Object)(_style)))));
 }else {
 BA.debugLineNum = 465;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyT";
Debug.JustUpdateDeviceLine();
_unbreakables.runVoidMethod ("Add",(Object)((__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createunbreakable" /*RemoteObject*/ ,(Object)(_run),(Object)(__ref.getField(false,"_emptytextchars" /*RemoteObject*/ )),(Object)(_fm),(Object)(bctextengine.__c.getField(true,"True")),(Object)(_style)))));
 };
 BA.debugLineNum = 467;BA.debugLine="i1 = i + 1";
Debug.JustUpdateDeviceLine();
_i1 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i1", _i1);
 }else 
{ BA.debugLineNum = 468;BA.debugLine="Else If c = Chr(13) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_c,BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13)))))) { 
 BA.debugLineNum = 469;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 472;BA.debugLine="If i1 < Run.TextChars.Length Then Unbreakables.Ad";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_i1,BA.numberCast(double.class, _run.getField(false,"TextChars" /*RemoteObject*/ ).getField(true,"Length" /*RemoteObject*/ )))) { 
_unbreakables.runVoidMethod ("Add",(Object)((__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createunbreakable" /*RemoteObject*/ ,(Object)(_run),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_textcharssubstring" /*RemoteObject*/ ,(Object)(_run.getField(false,"TextChars" /*RemoteObject*/ )),(Object)(_i1),(Object)(_run.getField(false,"TextChars" /*RemoteObject*/ ).getField(true,"Length" /*RemoteObject*/ )))),(Object)(_fm),(Object)(bctextengine.__c.getField(true,"False")),(Object)(_style)))));};
 BA.debugLineNum = 473;BA.debugLine="If Run.View.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_run.getField(false,"View" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 474;BA.debugLine="Unbreakables.Add(CreateUnbreakable(Run, EmptyTex";
Debug.JustUpdateDeviceLine();
_unbreakables.runVoidMethod ("Add",(Object)((__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createunbreakable" /*RemoteObject*/ ,(Object)(_run),(Object)(__ref.getField(false,"_emptytextchars" /*RemoteObject*/ )),(Object)(_fm),(Object)(bctextengine.__c.getField(true,"False")),(Object)(_style)))));
 };
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bctextengine","initialize", __ref, _ba, _parent);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _b = null;
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 74;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="CustomFonts.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_customfonts" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="VowelsCodePoints.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vowelscodepoints" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 77;BA.debugLine="EmptyTextChars = CreateBCTextCharsFromString(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_emptytextchars" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createbctextcharsfromstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 78;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 79;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 92;BA.debugLine="setSpaceBetweenCharacters(100dip / 100)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_setspacebetweencharacters" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),RemoteObject.createImmutable(100)}, "/",0, 0))));
 BA.debugLineNum = 93;BA.debugLine="setSpaceBetweenLines(20dip)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_setspacebetweenlines" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))));
 BA.debugLineNum = 94;BA.debugLine="cvs.Initialize(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_p));
 BA.debugLineNum = 95;BA.debugLine="ResizeCharBC(50dip * mScale, 50dip * mScale)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_resizecharbc" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 96;BA.debugLine="Brushes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_brushes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="ResizeLayers(200dip, 100dip)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_resizelayers" /*RemoteObject*/ ,(Object)(bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 98;BA.debugLine="cbccache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cbccache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 99;BA.debugLine="cbccache.ColorsMap.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cbccache" /*RemoteObject*/ ).getField(false,"ColorsMap").runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="FontMetricsCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fontmetricscache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 101;BA.debugLine="Dim b(CharBC.SAME_COLOR_LENGTH_FOR_CACHE * 4 * Ch";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNewArray ("byte", new int[] {RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_charbc" /*RemoteObject*/ ).getField(true,"_same_color_length_for_cache"),RemoteObject.createImmutable(4),__ref.getField(false,"_charbc" /*RemoteObject*/ ).getField(true,"_max_same_color_size"),RemoteObject.createImmutable(4)}, "**+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("b", _b);
 BA.debugLineNum = 102;BA.debugLine="cbccache.mBuffer = b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cbccache" /*RemoteObject*/ ).setField ("mBuffer",_b);
 BA.debugLineNum = 103;BA.debugLine="DefaultFont = xui.CreateDefaultFont(16)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 16))));
 BA.debugLineNum = 104;BA.debugLine="DefaultStyle = CreateStyle";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultstyle" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createstyle" /*RemoteObject*/ ));
 BA.debugLineNum = 105;BA.debugLine="TagParser.Initialize (Me)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tagparser" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.bbcodeparser.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)));
 BA.debugLineNum = 106;BA.debugLine="DefaultUnderlineStyle.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultunderlinestyle" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 107;BA.debugLine="DefaultUnderlineStyle.Clr = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultunderlinestyle" /*RemoteObject*/ ).setField ("Clr" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 108;BA.debugLine="DefaultUnderlineStyle.Style = \"line\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultunderlinestyle" /*RemoteObject*/ ).setField ("Style" /*RemoteObject*/ ,BA.ObjectToString("line"));
 BA.debugLineNum = 109;BA.debugLine="DefaultUnderlineStyle.Thickness = 1dip";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultunderlinestyle" /*RemoteObject*/ ).setField ("Thickness" /*RemoteObject*/ ,BA.numberCast(float.class, bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 110;BA.debugLine="For Each v As B4XView In Parent.GetAllViewsRecurs";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group24 = _parent.runMethod(false,"GetAllViewsRecursive");
final int groupLen24 = group24.runMethod(true,"getSize").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group24.runMethod(false,"Get",index24));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 111;BA.debugLine="If v.Tag Is BBCodeView Or v.Tag Is BBLabel Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_v.runMethod(false,"getTag"), RemoteObject.createImmutable("com.detektor.kateenapp.bbcodeview")) || RemoteObject.solveBoolean("i",_v.runMethod(false,"getTag"), RemoteObject.createImmutable("com.detektor.kateenapp.bblabel"))) { 
 BA.debugLineNum = 112;BA.debugLine="CallSub2(v.Tag, \"setTextEngine\", Me)";
Debug.JustUpdateDeviceLine();
bctextengine.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_v.runMethod(false,"getTag")),(Object)(BA.ObjectToString("setTextEngine")),(Object)(__ref));
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isspace(RemoteObject __ref,RemoteObject _tc) throws Exception{
try {
		Debug.PushSubsStack("IsSpace (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,795);
if (RapidSub.canDelegate("isspace")) { return __ref.runUserSub(false, "bctextengine","isspace", __ref, _tc);}
Debug.locals.put("TC", _tc);
 BA.debugLineNum = 795;BA.debugLine="Private Sub IsSpace(TC As BCTextChars) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 796;BA.debugLine="Return TextCharEquals(TC, \" \")";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_textcharequals" /*RemoteObject*/ ,(Object)(_tc),(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 797;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isunseparator(RemoteObject __ref,RemoteObject _un) throws Exception{
try {
		Debug.PushSubsStack("IsUNSeparator (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("isunseparator")) { return __ref.runUserSub(false, "bctextengine","isunseparator", __ref, _un);}
Debug.locals.put("un", _un);
 BA.debugLineNum = 369;BA.debugLine="Private Sub IsUNSeparator (un As BCUnbreakableText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 370;BA.debugLine="If un.NotFullTextChars.Length = 0 Then Return Fal";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_un.getField(false,"NotFullTextChars" /*RemoteObject*/ ).getField(true,"Length" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return bctextengine.__c.getField(true,"False");};
 BA.debugLineNum = 371;BA.debugLine="Return WordBoundaries.Contains(un.NotFullTextChar";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_wordboundaries" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(_un.getField(false,"NotFullTextChars" /*RemoteObject*/ ).getField(false,"Buffer" /*RemoteObject*/ ).getArrayElement(true,_un.getField(false,"NotFullTextChars" /*RemoteObject*/ ).getField(true,"StartIndex" /*RemoteObject*/ ))));
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadarabicdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadArabicData (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1126);
if (RapidSub.canDelegate("loadarabicdata")) { return __ref.runUserSub(false, "bctextengine","loadarabicdata", __ref);}
RemoteObject _a = RemoteObject.declareNull("b4a.example.bitmapcreator._argbcolor");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _split = null;
 BA.debugLineNum = 1126;BA.debugLine="Private Sub LoadArabicData";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1127;BA.debugLine="If ArabicMap.IsInitialized = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_arabicmap" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1128;BA.debugLine="ArabicMap.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_arabicmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1129;BA.debugLine="ArabicNonLinkedLetters.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_arabicnonlinkedletters" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1130;BA.debugLine="ArabicCharsConnectedPrev.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_arabiccharsconnectedprev" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1131;BA.debugLine="Dim a As ARGBColor";
Debug.JustUpdateDeviceLine();
_a = RemoteObject.createNew ("b4a.example.bitmapcreator._argbcolor");Debug.locals.put("a", _a);
 BA.debugLineNum = 1132;BA.debugLine="CharBC.ColorToARGB(DefaultColor, a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).runVoidMethod ("_colortoargb",(Object)(__ref.getField(true,"_defaultcolor" /*RemoteObject*/ )),(Object)(_a));
 BA.debugLineNum = 1133;BA.debugLine="CharBC.ARGBToPremultipliedColor(a, PMDefaultColo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).runVoidMethod ("_argbtopremultipliedcolor",(Object)(_a),(Object)(__ref.getField(false,"_pmdefaultcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 1134;BA.debugLine="For Each line As String In File.ReadList(File.Di";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = bctextengine.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(bctextengine.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("arabic_mapping.txt")));
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_line = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 1135;BA.debugLine="Dim split() As String = Regex.Split(\",\", line)";
Debug.JustUpdateDeviceLine();
_split = bctextengine.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_line));Debug.locals.put("split", _split);Debug.locals.put("split", _split);
 BA.debugLineNum = 1136;BA.debugLine="If split.Length = 2 And split(1) = \"0\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_split.getField(true,"length"),BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean("=",_split.getArrayElement(true,BA.numberCast(int.class, 1)),BA.ObjectToString("0"))) { 
 BA.debugLineNum = 1137;BA.debugLine="VowelsCodePoints.Add(Bit.ParseInt(split(0), 16";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vowelscodepoints" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((bctextengine.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_split.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(BA.numberCast(int.class, 16))))));
 }else {
 BA.debugLineNum = 1139;BA.debugLine="ArabicMap.Put(Chr(Bit.ParseInt(split(0), 16)).";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_arabicmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(((BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(bctextengine.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_split.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(BA.numberCast(int.class, 16))))))))),(Object)((bctextengine.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_split.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(BA.numberCast(int.class, 16))))));
 BA.debugLineNum = 1140;BA.debugLine="If 2 = split(2) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(2),BA.numberCast(double.class, _split.getArrayElement(true,BA.numberCast(int.class, 2))))) { 
 BA.debugLineNum = 1141;BA.debugLine="ArabicNonLinkedLetters.Add(Chr(Bit.ParseInt(s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_arabicnonlinkedletters" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_add" /*RemoteObject*/ ,(Object)(((BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(bctextengine.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_split.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(BA.numberCast(int.class, 16))))))))));
 };
 };
 }
}Debug.locals.put("line", _line);
;
 };
 BA.debugLineNum = 1146;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddata(RemoteObject __ref,RemoteObject _set,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("LoadData (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1200);
if (RapidSub.canDelegate("loaddata")) { return __ref.runUserSub(false, "bctextengine","loaddata", __ref, _set, _filename);}
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
int _a = 0;
Debug.locals.put("Set", _set);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1200;BA.debugLine="Private Sub LoadData(Set As B4XSet, FileName As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1201;BA.debugLine="Set.Initialize";
Debug.JustUpdateDeviceLine();
_set.runClassMethod (com.detektor.kateenapp.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 1202;BA.debugLine="For Each line As String In File.ReadList(File.Dir";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = bctextengine.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(bctextengine.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_line = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 1203;BA.debugLine="line = line.Trim";
Debug.JustUpdateDeviceLine();
_line = _line.runMethod(true,"trim");Debug.locals.put("line", _line);
 BA.debugLineNum = 1204;BA.debugLine="Dim i As Int = line.IndexOf(\".\")";
Debug.JustUpdateDeviceLine();
_i = _line.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1205;BA.debugLine="If i = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1206;BA.debugLine="Set.Add(Bit.ParseInt(line, 16))";
Debug.JustUpdateDeviceLine();
_set.runClassMethod (com.detektor.kateenapp.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((bctextengine.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_line),(Object)(BA.numberCast(int.class, 16))))));
 }else {
 BA.debugLineNum = 1208;BA.debugLine="For a = Bit.ParseInt(line.SubString2(0, i), 16)";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = bctextengine.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_line.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "+",1, 1)))),(Object)(BA.numberCast(int.class, 16))).<Integer>get().intValue();
_a = bctextengine.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_line.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_i))),(Object)(BA.numberCast(int.class, 16))).<Integer>get().intValue() ;
for (;(step8 > 0 && _a <= limit8) || (step8 < 0 && _a >= limit8) ;_a = ((int)(0 + _a + step8))  ) {
Debug.locals.put("a", _a);
 BA.debugLineNum = 1209;BA.debugLine="Set.Add(a)";
Debug.JustUpdateDeviceLine();
_set.runClassMethod (com.detektor.kateenapp.b4xset.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable((_a))));
 }
}Debug.locals.put("a", _a);
;
 };
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 1213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mergeunbreakables(RemoteObject __ref,RemoteObject _un1,RemoteObject _un2) throws Exception{
try {
		Debug.PushSubsStack("MergeUnbreakables (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,551);
if (RapidSub.canDelegate("mergeunbreakables")) { return __ref.runUserSub(false, "bctextengine","mergeunbreakables", __ref, _un1, _un2);}
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
Debug.locals.put("un1", _un1);
Debug.locals.put("un2", _un2);
 BA.debugLineNum = 551;BA.debugLine="Private Sub MergeUnbreakables (un1 As BCUnbreakabl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 552;BA.debugLine="un1.Width = un1.Width + un2.Width + mSpaceBetween";
Debug.JustUpdateDeviceLine();
_un1.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_un1.getField(true,"Width" /*RemoteObject*/ ),_un2.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "++",2, 0)));
 BA.debugLineNum = 553;BA.debugLine="For Each single As BCSingleStyleSection In un2.Si";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _un2.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_single = (group2.runMethod(false,"Get",index2));Debug.locals.put("single", _single);
Debug.locals.put("single", _single);
 BA.debugLineNum = 554;BA.debugLine="single.ParentUN = un1";
Debug.JustUpdateDeviceLine();
_single.setField ("ParentUN" /*RemoteObject*/ ,_un1);
 BA.debugLineNum = 555;BA.debugLine="un1.Anchor = GetRunAnchorIfCurrentNotSet(single.";
Debug.JustUpdateDeviceLine();
_un1.setField ("Anchor" /*RemoteObject*/ ,__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getrunanchorifcurrentnotset" /*RemoteObject*/ ,(Object)(_single.getField(false,"Run" /*RemoteObject*/ )),(Object)(_un1.getField(true,"Anchor" /*RemoteObject*/ ))));
 }
}Debug.locals.put("single", _single);
;
 BA.debugLineNum = 557;BA.debugLine="un1.SingleStyleSections.AddAll(un2.SingleStyleSec";
Debug.JustUpdateDeviceLine();
_un1.getField(false,"SingleStyleSections" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(_un2.getField(false,"SingleStyleSections" /*RemoteObject*/ )));
 BA.debugLineNum = 558;BA.debugLine="If un1.NotFullTextChars.Length = 0 Then un1.NotFu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_un1.getField(false,"NotFullTextChars" /*RemoteObject*/ ).getField(true,"Length" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
_un1.setField ("NotFullTextChars" /*RemoteObject*/ ,_un2.getField(false,"NotFullTextChars" /*RemoteObject*/ ));};
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mightbeanemoji(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("MightBeAnEmoji (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,928);
if (RapidSub.canDelegate("mightbeanemoji")) { return __ref.runUserSub(false, "bctextengine","mightbeanemoji", __ref, _c);}
RemoteObject _cp = RemoteObject.createImmutable(0);
Debug.locals.put("c", _c);
 BA.debugLineNum = 928;BA.debugLine="Private Sub MightBeAnEmoji(c As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 929;BA.debugLine="Dim cp As Int = Asc(c)";
Debug.JustUpdateDeviceLine();
_cp = bctextengine.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(_c)));Debug.locals.put("cp", _cp);Debug.locals.put("cp", _cp);
 BA.debugLineNum = 930;BA.debugLine="Return cp >= 0x231A Or c.Length > 1";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_cp,BA.numberCast(double.class, ((int)0x231a))) || RemoteObject.solveBoolean(">",_c.runMethod(true,"length"),BA.numberCast(double.class, 1)));
 BA.debugLineNum = 931;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _organizelines(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("OrganizeLines (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("organizelines")) { return __ref.runUserSub(false, "bctextengine","organizelines", __ref, _p);}
RemoteObject _paralignment = RemoteObject.createImmutable("");
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _prevlinebelowbaselineheight = RemoteObject.createImmutable(0);
RemoteObject _line = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextline");
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
RemoteObject _maxwidth = RemoteObject.createImmutable(0);
RemoteObject _alignment = RemoteObject.createImmutable("");
RemoteObject _linestyle = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
RemoteObject _last = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _numberofgaps = RemoteObject.createImmutable(0);
RemoteObject _delta = RemoteObject.createImmutable(0f);
RemoteObject _accumalated = RemoteObject.createImmutable(0f);
Debug.locals.put("p", _p);
 BA.debugLineNum = 237;BA.debugLine="Private Sub OrganizeLines (p As BCParagraph)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="Dim ParAlignment As String = p.Style.HorizontalAl";
Debug.JustUpdateDeviceLine();
_paralignment = _p.getField(false,"Style" /*RemoteObject*/ ).getField(true,"HorizontalAlignment" /*RemoteObject*/ ).runMethod(true,"toLowerCase");Debug.locals.put("ParAlignment", _paralignment);Debug.locals.put("ParAlignment", _paralignment);
 BA.debugLineNum = 239;BA.debugLine="Dim count As Int";
Debug.JustUpdateDeviceLine();
_count = RemoteObject.createImmutable(0);Debug.locals.put("count", _count);
 BA.debugLineNum = 240;BA.debugLine="Dim PrevLineBelowBaselineHeight As Int";
Debug.JustUpdateDeviceLine();
_prevlinebelowbaselineheight = RemoteObject.createImmutable(0);Debug.locals.put("PrevLineBelowBaselineHeight", _prevlinebelowbaselineheight);
 BA.debugLineNum = 241;BA.debugLine="For Each line As BCTextLine In p.TextLines";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _p.getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (group4.runMethod(false,"Get",index4));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 242;BA.debugLine="p.Width = Max(p.Width, line.Width)";
Debug.JustUpdateDeviceLine();
_p.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _p.getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _line.getField(true,"Width" /*RemoteObject*/ ))))));
 BA.debugLineNum = 243;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (group6.runMethod(false,"Get",index6));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 244;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = _un.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_single = (group7.runMethod(false,"Get",index7));Debug.locals.put("single", _single);
Debug.locals.put("single", _single);
 BA.debugLineNum = 245;BA.debugLine="line.MaxHeightAboveBaseLine = Max(single.MaxHe";
Debug.JustUpdateDeviceLine();
_line.setField ("MaxHeightAboveBaseLine" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _single.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ ))))));
 BA.debugLineNum = 246;BA.debugLine="line.MaxHeightBelowBaseLine = Max(single.MaxHe";
Debug.JustUpdateDeviceLine();
_line.setField ("MaxHeightBelowBaseLine" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _single.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ ))))));
 }
}Debug.locals.put("single", _single);
;
 }
}Debug.locals.put("un", _un);
;
 BA.debugLineNum = 249;BA.debugLine="If count = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_count,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 250;BA.debugLine="line.Height = line.MaxHeightAboveBaseLine";
Debug.JustUpdateDeviceLine();
_line.setField ("Height" /*RemoteObject*/ ,_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 252;BA.debugLine="line.Height =  Max(line.MaxHeightAboveBaseLine";
Debug.JustUpdateDeviceLine();
_line.setField ("Height" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ ),_prevlinebelowbaselineheight,__ref.getField(true,"_mmingapbetweenlines" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "++*",2, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mspacebetweenlines" /*RemoteObject*/ ),_p.getField(false,"Style" /*RemoteObject*/ ).getField(true,"LineSpacingFactor" /*RemoteObject*/ )}, "*",0, 0)))));
 };
 BA.debugLineNum = 254;BA.debugLine="p.Height = p.Height + line.Height";
Debug.JustUpdateDeviceLine();
_p.setField ("Height" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_p.getField(true,"Height" /*RemoteObject*/ ),_line.getField(true,"Height" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 255;BA.debugLine="line.BaselineY = p.Height";
Debug.JustUpdateDeviceLine();
_line.setField ("BaselineY" /*RemoteObject*/ ,_p.getField(true,"Height" /*RemoteObject*/ ));
 BA.debugLineNum = 256;BA.debugLine="PrevLineBelowBaselineHeight = line.MaxHeightBelo";
Debug.JustUpdateDeviceLine();
_prevlinebelowbaselineheight = _line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ );Debug.locals.put("PrevLineBelowBaselineHeight", _prevlinebelowbaselineheight);
 BA.debugLineNum = 257;BA.debugLine="count = count + 1";
Debug.JustUpdateDeviceLine();
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 259;BA.debugLine="Dim MaxWidth As Int = (p.Style.MaxWidth - p.Style";
Debug.JustUpdateDeviceLine();
_maxwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_p.getField(false,"Style" /*RemoteObject*/ ).getField(true,"MaxWidth" /*RemoteObject*/ ),_p.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getLeft"),_p.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getRight")}, "--",2, 0)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("MaxWidth", _maxwidth);Debug.locals.put("MaxWidth", _maxwidth);
 BA.debugLineNum = 260;BA.debugLine="p.Width = Min(MaxWidth, p.Width)";
Debug.JustUpdateDeviceLine();
_p.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _maxwidth)),(Object)(BA.numberCast(double.class, _p.getField(true,"Width" /*RemoteObject*/ ))))));
 BA.debugLineNum = 261;BA.debugLine="p.Height = p.Height + line.MaxHeightBelowBaseLine";
Debug.JustUpdateDeviceLine();
_p.setField ("Height" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_p.getField(true,"Height" /*RemoteObject*/ ),_line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ )}, "+",1, 1));
 BA.debugLineNum = 262;BA.debugLine="Dim alignment As String";
Debug.JustUpdateDeviceLine();
_alignment = RemoteObject.createImmutable("");Debug.locals.put("alignment", _alignment);
 BA.debugLineNum = 263;BA.debugLine="For Each line As BCTextLine In p.TextLines";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group26 = _p.getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen26 = group26.runMethod(true,"getSize").<Integer>get()
;int index26 = 0;
;
for (; index26 < groupLen26;index26++){
_line = (group26.runMethod(false,"Get",index26));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 264;BA.debugLine="If line.Unbreakables.Size = 0 Then Continue";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) continue;};
 BA.debugLineNum = 265;BA.debugLine="Dim linestyle As BCSingleStyleSection = GetFirst";
Debug.JustUpdateDeviceLine();
_linestyle = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getfirstsinglestyle" /*RemoteObject*/ ,(Object)(_line));Debug.locals.put("linestyle", _linestyle);Debug.locals.put("linestyle", _linestyle);
 BA.debugLineNum = 266;BA.debugLine="If linestyle.Run.HorizontalAlignment = \"\" Then a";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_linestyle.getField(false,"Run" /*RemoteObject*/ ).getField(true,"HorizontalAlignment" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_alignment = _paralignment;Debug.locals.put("alignment", _alignment);}
else {
_alignment = _linestyle.getField(false,"Run" /*RemoteObject*/ ).getField(true,"HorizontalAlignment" /*RemoteObject*/ ).runMethod(true,"toLowerCase");Debug.locals.put("alignment", _alignment);};
 BA.debugLineNum = 267;BA.debugLine="If alignment = \"left\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_alignment,BA.ObjectToString("left"))) { 
 BA.debugLineNum = 268;BA.debugLine="If linestyle.Run.IndentLevel > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_linestyle.getField(false,"Run" /*RemoteObject*/ ).getField(true,"IndentLevel" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 269;BA.debugLine="line.StartX = IndentWidth * linestyle.Run.Inde";
Debug.JustUpdateDeviceLine();
_line.setField ("StartX" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_indentwidth" /*RemoteObject*/ ),_linestyle.getField(false,"Run" /*RemoteObject*/ ).getField(true,"IndentLevel" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 270;BA.debugLine="p.Width = Max(p.Width, Min(MaxWidth, line.Widt";
Debug.JustUpdateDeviceLine();
_p.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _p.getField(true,"Width" /*RemoteObject*/ ))),(Object)(bctextengine.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _maxwidth)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_line.getField(true,"Width" /*RemoteObject*/ ),_line.getField(true,"StartX" /*RemoteObject*/ )}, "+",1, 1))))))));
 };
 }else {
 BA.debugLineNum = 273;BA.debugLine="p.Width = MaxWidth";
Debug.JustUpdateDeviceLine();
_p.setField ("Width" /*RemoteObject*/ ,_maxwidth);
 };
 BA.debugLineNum = 275;BA.debugLine="Select alignment";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_alignment,BA.ObjectToString("center"),BA.ObjectToString("right"),BA.ObjectToString("justify"))) {
case 0: {
 BA.debugLineNum = 277;BA.debugLine="line.StartX = p.Width / 2 - line.Width / 2";
Debug.JustUpdateDeviceLine();
_line.setField ("StartX" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p.getField(true,"Width" /*RemoteObject*/ ),RemoteObject.createImmutable(2),_line.getField(true,"Width" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0)));
 break; }
case 1: {
 BA.debugLineNum = 279;BA.debugLine="line.StartX = p.Width - line.Width";
Debug.JustUpdateDeviceLine();
_line.setField ("StartX" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_p.getField(true,"Width" /*RemoteObject*/ ),_line.getField(true,"Width" /*RemoteObject*/ )}, "-",1, 1));
 break; }
case 2: {
 BA.debugLineNum = 281;BA.debugLine="If line.EndsWithSoftLineBreak Then";
Debug.JustUpdateDeviceLine();
if (_line.getField(true,"EndsWithSoftLineBreak" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 282;BA.debugLine="Dim last As BCUnbreakableText = line.Unbreaka";
Debug.JustUpdateDeviceLine();
_last = (_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("last", _last);Debug.locals.put("last", _last);
 BA.debugLineNum = 283;BA.debugLine="If IsSpace(last.NotFullTextChars) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_isspace" /*RemoteObject*/ ,(Object)(_last.getField(false,"NotFullTextChars" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 284;BA.debugLine="line.Unbreakables.RemoveAt(line.Unbreakables";
Debug.JustUpdateDeviceLine();
_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(RemoteObject.solve(new RemoteObject[] {_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 285;BA.debugLine="line.Width = line.Width - last.Width";
Debug.JustUpdateDeviceLine();
_line.setField ("Width" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_line.getField(true,"Width" /*RemoteObject*/ ),_last.getField(true,"Width" /*RemoteObject*/ )}, "-",1, 1));
 };
 BA.debugLineNum = 287;BA.debugLine="Dim NumberOfGaps As Int = line.Unbreakables.S";
Debug.JustUpdateDeviceLine();
_numberofgaps = RemoteObject.solve(new RemoteObject[] {_line.getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("NumberOfGaps", _numberofgaps);Debug.locals.put("NumberOfGaps", _numberofgaps);
 BA.debugLineNum = 288;BA.debugLine="If NumberOfGaps > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_numberofgaps,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 289;BA.debugLine="Dim delta As Float = (p.Width - line.Width)";
Debug.JustUpdateDeviceLine();
_delta = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_p.getField(true,"Width" /*RemoteObject*/ ),_line.getField(true,"Width" /*RemoteObject*/ )}, "-",1, 1)),_numberofgaps}, "/",0, 0));Debug.locals.put("delta", _delta);Debug.locals.put("delta", _delta);
 BA.debugLineNum = 290;BA.debugLine="Dim accumalated As Float = 0";
Debug.JustUpdateDeviceLine();
_accumalated = BA.numberCast(float.class, 0);Debug.locals.put("accumalated", _accumalated);Debug.locals.put("accumalated", _accumalated);
 BA.debugLineNum = 291;BA.debugLine="For Each un As BCUnbreakableText In line.Unb";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group54 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen54 = group54.runMethod(true,"getSize").<Integer>get()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_un = (group54.runMethod(false,"Get",index54));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 292;BA.debugLine="un.StartX = un.StartX + accumalated";
Debug.JustUpdateDeviceLine();
_un.setField ("StartX" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_un.getField(true,"StartX" /*RemoteObject*/ ),_accumalated}, "+",1, 0)));
 BA.debugLineNum = 293;BA.debugLine="accumalated = accumalated + delta";
Debug.JustUpdateDeviceLine();
_accumalated = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_accumalated,_delta}, "+",1, 0));Debug.locals.put("accumalated", _accumalated);
 }
}Debug.locals.put("un", _un);
;
 };
 };
 break; }
}
;
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _organizertlparagraph(RemoteObject __ref,RemoteObject _par) throws Exception{
try {
		Debug.PushSubsStack("OrganizeRTLParagraph (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("organizertlparagraph")) { return __ref.runUserSub(false, "bctextengine","organizertlparagraph", __ref, _par);}
RemoteObject _ltrlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _line = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextline");
RemoteObject _newlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("par", _par);
 BA.debugLineNum = 301;BA.debugLine="Private Sub OrganizeRTLParagraph (par As BCParagra";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="Dim LTRList As List";
Debug.JustUpdateDeviceLine();
_ltrlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("LTRList", _ltrlist);
 BA.debugLineNum = 303;BA.debugLine="LTRList.Initialize";
Debug.JustUpdateDeviceLine();
_ltrlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 305;BA.debugLine="For Each line As BCTextLine In par.TextLines";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _par.getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_line = (group3.runMethod(false,"Get",index3));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 306;BA.debugLine="Dim NewList As List";
Debug.JustUpdateDeviceLine();
_newlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("NewList", _newlist);
 BA.debugLineNum = 307;BA.debugLine="NewList.Initialize";
Debug.JustUpdateDeviceLine();
_newlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 311;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_un = (group6.runMethod(false,"Get",index6));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 312;BA.debugLine="If un.RTL Then";
Debug.JustUpdateDeviceLine();
if (_un.getField(true,"RTL" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 313;BA.debugLine="AddLTRItems(LTRList, NewList)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_addltritems" /*RemoteObject*/ ,(Object)(_ltrlist),(Object)(_newlist));
 BA.debugLineNum = 314;BA.debugLine="NewList.Add(un)";
Debug.JustUpdateDeviceLine();
_newlist.runVoidMethod ("Add",(Object)((_un)));
 }else {
 BA.debugLineNum = 316;BA.debugLine="LTRList.InsertAt(0, un)";
Debug.JustUpdateDeviceLine();
_ltrlist.runVoidMethod ("InsertAt",(Object)(BA.numberCast(int.class, 0)),(Object)((_un)));
 };
 }
}Debug.locals.put("un", _un);
;
 BA.debugLineNum = 319;BA.debugLine="AddLTRItems(LTRList, NewList)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_addltritems" /*RemoteObject*/ ,(Object)(_ltrlist),(Object)(_newlist));
 BA.debugLineNum = 320;BA.debugLine="line.Unbreakables = NewList";
Debug.JustUpdateDeviceLine();
_line.setField ("Unbreakables" /*RemoteObject*/ ,_newlist);
 BA.debugLineNum = 325;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group16 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_un = (group16.runMethod(false,"Get",index16));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 326;BA.debugLine="un.StartX = line.Width - un.StartX";
Debug.JustUpdateDeviceLine();
_un.setField ("StartX" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_line.getField(true,"Width" /*RemoteObject*/ ),_un.getField(true,"StartX" /*RemoteObject*/ )}, "-",1, 1));
 BA.debugLineNum = 327;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.solve(new RemoteObject[] {_line.getField(true,"StartX" /*RemoteObject*/ ),_un.getField(true,"StartX" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 328;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group19 = _un.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_single = (group19.runMethod(false,"Get",index19));Debug.locals.put("single", _single);
Debug.locals.put("single", _single);
 BA.debugLineNum = 329;BA.debugLine="x = x - single.Width";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.solve(new RemoteObject[] {_x,_single.getField(true,"Width" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("x", _x);
 BA.debugLineNum = 330;BA.debugLine="single.AbsoluteStartX = x";
Debug.JustUpdateDeviceLine();
_single.setField ("AbsoluteStartX" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 331;BA.debugLine="x = x - mSpaceBetweenCharacters";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("x", _x);
 BA.debugLineNum = 332;BA.debugLine="If single.Run.View.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_single.getField(false,"Run" /*RemoteObject*/ ).getField(false,"View" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 333;BA.debugLine="Dim v As B4XView = single.Run.View";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = _single.getField(false,"Run" /*RemoteObject*/ ).getField(false,"View" /*RemoteObject*/ );Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 334;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "+",1, 0)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0)));
 };
 }
}Debug.locals.put("single", _single);
;
 }
}Debug.locals.put("un", _un);
;
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _organizesinglestyles(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("OrganizeSingleStyles (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("organizesinglestyles")) { return __ref.runUserSub(false, "bctextengine","organizesinglestyles", __ref, _p);}
RemoteObject _line = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextline");
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _single = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _par = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcparagraph");
Debug.locals.put("p", _p);
 BA.debugLineNum = 374;BA.debugLine="Private Sub OrganizeSingleStyles (p As BCParagraph";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 375;BA.debugLine="For Each line As BCTextLine In p.TextLines";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _p.getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_line = (group1.runMethod(false,"Get",index1));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 376;BA.debugLine="For Each un As BCUnbreakableText In line.Unbreak";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _line.getField(false,"Unbreakables" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_un = (group2.runMethod(false,"Get",index2));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 377;BA.debugLine="Dim x As Int = line.StartX + un.StartX";
Debug.JustUpdateDeviceLine();
_x = RemoteObject.solve(new RemoteObject[] {_line.getField(true,"StartX" /*RemoteObject*/ ),_un.getField(true,"StartX" /*RemoteObject*/ )}, "+",1, 1);Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 378;BA.debugLine="For Each single As BCSingleStyleSection In un.S";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _un.getField(false,"SingleStyleSections" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_single = (group4.runMethod(false,"Get",index4));Debug.locals.put("single", _single);
Debug.locals.put("single", _single);
 BA.debugLineNum = 379;BA.debugLine="single.AbsoluteStartX = x";
Debug.JustUpdateDeviceLine();
_single.setField ("AbsoluteStartX" /*RemoteObject*/ ,_x);
 BA.debugLineNum = 380;BA.debugLine="If single.GlyphsAndOffsets.Size = 0 And single";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_single.getField(false,"GlyphsAndOffsets" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_single.getField(false,"Run" /*RemoteObject*/ ).getField(false,"View" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 381;BA.debugLine="Dim v As B4XView = single.Run.View";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_v = _single.getField(false,"Run" /*RemoteObject*/ ).getField(false,"View" /*RemoteObject*/ );Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 382;BA.debugLine="Dim par As BCParagraph = single.ParentUN.Pare";
Debug.JustUpdateDeviceLine();
_par = _single.getField(false,"ParentUN" /*RemoteObject*/ ).getField(false,"ParentLine" /*RemoteObject*/ ).getField(false,"ParentParagraph" /*RemoteObject*/ );Debug.locals.put("par", _par);Debug.locals.put("par", _par);
 BA.debugLineNum = 383;BA.debugLine="If par.Views.IsInitialized = False Then par.V";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_par.getField(false,"Views" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),bctextengine.__c.getField(true,"False"))) { 
_par.getField(false,"Views" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 384;BA.debugLine="v.Left = (x + mSpaceBetweenCharacters) / mSca";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "+",1, 0)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0)));
 BA.debugLineNum = 385;BA.debugLine="v.Top = line.BaselineY / mScale - v.Height +";
Debug.JustUpdateDeviceLine();
_v.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_line.getField(true,"BaselineY" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ ),_v.runMethod(true,"getHeight"),_single.getField(false,"Run" /*RemoteObject*/ ).getField(true,"VerticalOffset" /*RemoteObject*/ )}, "/-+",2, 0)));
 BA.debugLineNum = 386;BA.debugLine="par.Views.Add(v)";
Debug.JustUpdateDeviceLine();
_par.getField(false,"Views" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_v.getObject())));
 };
 BA.debugLineNum = 388;BA.debugLine="x = x + single.Width + mSpaceBetweenCharacters";
Debug.JustUpdateDeviceLine();
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,_single.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("x", _x);
 }
}Debug.locals.put("single", _single);
;
 }
}Debug.locals.put("un", _un);
;
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 392;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _organizeunbreakables(RemoteObject __ref,RemoteObject _p,RemoteObject _unbreakables) throws Exception{
try {
		Debug.PushSubsStack("OrganizeUnbreakables (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,507);
if (RapidSub.canDelegate("organizeunbreakables")) { return __ref.runUserSub(false, "bctextengine","organizeunbreakables", __ref, _p, _unbreakables);}
RemoteObject _un = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _nextun = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcunbreakabletext");
RemoteObject _singlestyle = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcsinglestylesection");
RemoteObject _indent = RemoteObject.createImmutable(0);
Debug.locals.put("p", _p);
Debug.locals.put("unbreakables", _unbreakables);
 BA.debugLineNum = 507;BA.debugLine="Private Sub OrganizeUnbreakables (p As BCParagraph";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 508;BA.debugLine="If unbreakables.Size = 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_unbreakables.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 509;BA.debugLine="Dim un As BCUnbreakableText = unbreakables.Get(0)";
Debug.JustUpdateDeviceLine();
_un = (_unbreakables.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("un", _un);Debug.locals.put("un", _un);
 BA.debugLineNum = 510;BA.debugLine="Dim i As Int = 1";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 1);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 511;BA.debugLine="Do While i < unbreakables.Size";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, _unbreakables.runMethod(true,"getSize")))) {
 BA.debugLineNum = 512;BA.debugLine="Dim NextUn As BCUnbreakableText = unbreakables.G";
Debug.JustUpdateDeviceLine();
_nextun = (_unbreakables.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("NextUn", _nextun);Debug.locals.put("NextUn", _nextun);
 BA.debugLineNum = 513;BA.debugLine="If un.IsMergable = True And NextUn.IsMergable =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_un.getField(true,"IsMergable" /*RemoteObject*/ ),bctextengine.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_nextun.getField(true,"IsMergable" /*RemoteObject*/ ),bctextengine.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_un.getField(true,"RTL" /*RemoteObject*/ ),_nextun.getField(true,"RTL" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 514;BA.debugLine="MergeUnbreakables(un, NextUn)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_mergeunbreakables" /*RemoteObject*/ ,(Object)(_un),(Object)(_nextun));
 BA.debugLineNum = 515;BA.debugLine="unbreakables.RemoveAt(i)";
Debug.JustUpdateDeviceLine();
_unbreakables.runVoidMethod ("RemoveAt",(Object)(_i));
 BA.debugLineNum = 516;BA.debugLine="i = i - 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 }else {
 BA.debugLineNum = 518;BA.debugLine="un = NextUn";
Debug.JustUpdateDeviceLine();
_un = _nextun;Debug.locals.put("un", _un);
 };
 BA.debugLineNum = 520;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 BA.debugLineNum = 522;BA.debugLine="For Each un As BCUnbreakableText In unbreakables";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group15 = _unbreakables;
final int groupLen15 = group15.runMethod(true,"getSize").<Integer>get()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_un = (group15.runMethod(false,"Get",index15));Debug.locals.put("un", _un);
Debug.locals.put("un", _un);
 BA.debugLineNum = 523;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(13))";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_textcharequals" /*RemoteObject*/ ,(Object)(_un.getField(false,"NotFullTextChars" /*RemoteObject*/ )),(Object)(BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13)))))).<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 524;BA.debugLine="If TextCharEquals(un.NotFullTextChars, Chr(10))";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_textcharequals" /*RemoteObject*/ ,(Object)(_un.getField(false,"NotFullTextChars" /*RemoteObject*/ )),(Object)(BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 525;BA.debugLine="CreateLine(p)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createline" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 526;BA.debugLine="Continue";
Debug.JustUpdateDeviceLine();
if (true) continue;
 };
 BA.debugLineNum = 528;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 And p.Sty";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_p.getField(false,"Style" /*RemoteObject*/ ).getField(true,"WordWrap" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 529;BA.debugLine="Dim SingleStyle As BCSingleStyleSection = un.Si";
Debug.JustUpdateDeviceLine();
_singlestyle = (_un.getField(false,"SingleStyleSections" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("SingleStyle", _singlestyle);Debug.locals.put("SingleStyle", _singlestyle);
 BA.debugLineNum = 530;BA.debugLine="Dim indent As Int = IndentWidth * SingleStyle.R";
Debug.JustUpdateDeviceLine();
_indent = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_indentwidth" /*RemoteObject*/ ),_singlestyle.getField(false,"Run" /*RemoteObject*/ ).getField(true,"IndentLevel" /*RemoteObject*/ )}, "*",0, 1);Debug.locals.put("indent", _indent);Debug.locals.put("indent", _indent);
 BA.debugLineNum = 531;BA.debugLine="If p.CurrentLine.Width + mSpaceBetweenCharacter";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ ),_un.getField(true,"Width" /*RemoteObject*/ ),_indent}, "+++",3, 0),RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_p.getField(false,"Style" /*RemoteObject*/ ).getField(true,"MaxWidth" /*RemoteObject*/ ),_p.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getLeft"),_p.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getRight")}, "--",2, 0)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))) { 
 BA.debugLineNum = 532;BA.debugLine="p.CurrentLine.EndsWithSoftLineBreak = True";
Debug.JustUpdateDeviceLine();
_p.getField(false,"CurrentLine" /*RemoteObject*/ ).setField ("EndsWithSoftLineBreak" /*RemoteObject*/ ,bctextengine.__c.getField(true,"True"));
 BA.debugLineNum = 533;BA.debugLine="CreateLine(p)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createline" /*RemoteObject*/ ,(Object)(_p));
 };
 };
 BA.debugLineNum = 536;BA.debugLine="p.CurrentLine.Unbreakables.Add(un)";
Debug.JustUpdateDeviceLine();
_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(false,"Unbreakables" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_un)));
 BA.debugLineNum = 537;BA.debugLine="un.ParentLine = p.CurrentLine";
Debug.JustUpdateDeviceLine();
_un.setField ("ParentLine" /*RemoteObject*/ ,_p.getField(false,"CurrentLine" /*RemoteObject*/ ));
 BA.debugLineNum = 538;BA.debugLine="If un.Anchor <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_un.getField(true,"Anchor" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 539;BA.debugLine="If p.Anchors.IsInitialized = False Then p.Ancho";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p.getField(false,"Anchors" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),bctextengine.__c.getField(true,"False"))) { 
_p.getField(false,"Anchors" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 540;BA.debugLine="p.Anchors.Put(un.Anchor, p.CurrentLine)";
Debug.JustUpdateDeviceLine();
_p.getField(false,"Anchors" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_un.getField(true,"Anchor" /*RemoteObject*/ ))),(Object)((_p.getField(false,"CurrentLine" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 542;BA.debugLine="If IsSpace(un.NotFullTextChars) And p.CurrentLin";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_isspace" /*RemoteObject*/ ,(Object)(_un.getField(false,"NotFullTextChars" /*RemoteObject*/ )))) && RemoteObject.solveBoolean("=",_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 543;BA.debugLine="un.Width = 0";
Debug.JustUpdateDeviceLine();
_un.setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 545;BA.debugLine="If p.CurrentLine.Unbreakables.Size > 0 Then p.Cu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(false,"Unbreakables" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_p.getField(false,"CurrentLine" /*RemoteObject*/ ).setField ("Width" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mspacebetweencharacters" /*RemoteObject*/ )}, "+",1, 0)));};
 BA.debugLineNum = 546;BA.debugLine="un.StartX = p.CurrentLine.Width";
Debug.JustUpdateDeviceLine();
_un.setField ("StartX" /*RemoteObject*/ ,_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ));
 BA.debugLineNum = 547;BA.debugLine="p.CurrentLine.Width = p.CurrentLine.Width + un.W";
Debug.JustUpdateDeviceLine();
_p.getField(false,"CurrentLine" /*RemoteObject*/ ).setField ("Width" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_p.getField(false,"CurrentLine" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ),_un.getField(true,"Width" /*RemoteObject*/ )}, "+",1, 1));
 }
}Debug.locals.put("un", _un);
;
 BA.debugLineNum = 549;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepare(RemoteObject __ref,RemoteObject _runs,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("Prepare (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("prepare")) { return __ref.runUserSub(false, "bctextengine","prepare", __ref, _runs, _style);}
RemoteObject _par = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcparagraph");
RemoteObject _unbreakeables = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _run = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextrun");
Debug.locals.put("Runs", _runs);
Debug.locals.put("Style", _style);
 BA.debugLineNum = 169;BA.debugLine="Private Sub Prepare (Runs As List, Style As BCPara";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="Dim par As BCParagraph";
Debug.JustUpdateDeviceLine();
_par = RemoteObject.createNew ("com.detektor.kateenapp.bctextengine._bcparagraph");Debug.locals.put("par", _par);
 BA.debugLineNum = 171;BA.debugLine="par.Initialize";
Debug.JustUpdateDeviceLine();
_par.runVoidMethod ("Initialize");
 BA.debugLineNum = 172;BA.debugLine="par.TextLines.Initialize";
Debug.JustUpdateDeviceLine();
_par.getField(false,"TextLines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 173;BA.debugLine="par.Style = Style";
Debug.JustUpdateDeviceLine();
_par.setField ("Style" /*RemoteObject*/ ,_style);
 BA.debugLineNum = 174;BA.debugLine="IndentWidth = GetFontMetrics(DefaultFont, Default";
Debug.JustUpdateDeviceLine();
__ref.setField ("_indentwidth" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getfontmetrics" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_defaultfont" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_defaultcolor" /*RemoteObject*/ ))).getField(true,"xWidth" /*RemoteObject*/ ),__ref.getField(true,"_tabwidthmeasuredinx" /*RemoteObject*/ )}, "*",0, 1));
 BA.debugLineNum = 175;BA.debugLine="Dim unbreakeables As List";
Debug.JustUpdateDeviceLine();
_unbreakeables = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("unbreakeables", _unbreakeables);
 BA.debugLineNum = 176;BA.debugLine="unbreakeables.Initialize";
Debug.JustUpdateDeviceLine();
_unbreakeables.runVoidMethod ("Initialize");
 BA.debugLineNum = 177;BA.debugLine="For Each run As BCTextRun In Runs";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = _runs;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_run = (group8.runMethod(false,"Get",index8));Debug.locals.put("run", _run);
Debug.locals.put("run", _run);
 BA.debugLineNum = 178;BA.debugLine="If run.Extra.IsInitialized And run.Extra.Contain";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_run.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",_run.getField(false,"Extra" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((__ref.getField(true,"_extra_connectedruns" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 179;BA.debugLine="HandleConnectedTextRuns(run, unbreakeables, Sty";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_handleconnectedtextruns" /*RemoteObject*/ ,(Object)(_run),(Object)(_unbreakeables),(Object)(_style));
 }else {
 BA.debugLineNum = 181;BA.debugLine="HandleTextRun(run, unbreakeables, Style)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_handletextrun" /*RemoteObject*/ ,(Object)(_run),(Object)(_unbreakeables),(Object)(_style));
 };
 }
}Debug.locals.put("run", _run);
;
 BA.debugLineNum = 184;BA.debugLine="CreateLine(par)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createline" /*RemoteObject*/ ,(Object)(_par));
 BA.debugLineNum = 185;BA.debugLine="OrganizeUnbreakables(par, unbreakeables)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_organizeunbreakables" /*RemoteObject*/ ,(Object)(_par),(Object)(_unbreakeables));
 BA.debugLineNum = 186;BA.debugLine="OrganizeLines(par)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_organizelines" /*RemoteObject*/ ,(Object)(_par));
 BA.debugLineNum = 187;BA.debugLine="OrganizeSingleStyles(par)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_organizesinglestyles" /*RemoteObject*/ ,(Object)(_par));
 BA.debugLineNum = 188;BA.debugLine="If par.Style.RTL Then OrganizeRTLParagraph(par)";
Debug.JustUpdateDeviceLine();
if (_par.getField(false,"Style" /*RemoteObject*/ ).getField(true,"RTL" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_organizertlparagraph" /*RemoteObject*/ ,(Object)(_par));};
 BA.debugLineNum = 189;BA.debugLine="Return par";
Debug.JustUpdateDeviceLine();
if (true) return _par;
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepareforlazydrawing(RemoteObject __ref,RemoteObject _runs,RemoteObject _style,RemoteObject _sv) throws Exception{
try {
		Debug.PushSubsStack("PrepareForLazyDrawing (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("prepareforlazydrawing")) { return __ref.runUserSub(false, "bctextengine","prepareforlazydrawing", __ref, _runs, _style, _sv);}
RemoteObject _par = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bcparagraph");
RemoteObject _maxheight = RemoteObject.createImmutable(0);
RemoteObject _line = RemoteObject.declareNull("com.detektor.kateenapp.bctextengine._bctextline");
Debug.locals.put("Runs", _runs);
Debug.locals.put("Style", _style);
Debug.locals.put("sv", _sv);
 BA.debugLineNum = 192;BA.debugLine="Public Sub PrepareForLazyDrawing (Runs As List, St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="Dim par As BCParagraph = Prepare(Runs, Style)";
Debug.JustUpdateDeviceLine();
_par = __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_prepare" /*RemoteObject*/ ,(Object)(_runs),(Object)(_style));Debug.locals.put("par", _par);Debug.locals.put("par", _par);
 BA.debugLineNum = 194;BA.debugLine="sv.ScrollViewContentHeight = Max(sv.Height - 2dip";
Debug.JustUpdateDeviceLine();
_sv.runMethod(true,"setScrollViewContentHeight",BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_sv.runMethod(true,"getHeight"),bctextengine.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1))),(Object)(RemoteObject.solve(new RemoteObject[] {_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getTop"),_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getBottom"),_par.getField(true,"Height" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "++/",2, 0)))));
 BA.debugLineNum = 195;BA.debugLine="Dim MaxHeight As Int";
Debug.JustUpdateDeviceLine();
_maxheight = RemoteObject.createImmutable(0);Debug.locals.put("MaxHeight", _maxheight);
 BA.debugLineNum = 196;BA.debugLine="For Each line As BCTextLine In par.TextLines";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _par.getField(false,"TextLines" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_line = (group4.runMethod(false,"Get",index4));Debug.locals.put("line", _line);
Debug.locals.put("line", _line);
 BA.debugLineNum = 197;BA.debugLine="MaxHeight = Max(MaxHeight, line.MaxHeightAboveBa";
Debug.JustUpdateDeviceLine();
_maxheight = BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _maxheight)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_line.getField(true,"MaxHeightAboveBaseLine" /*RemoteObject*/ ),_line.getField(true,"MaxHeightBelowBaseLine" /*RemoteObject*/ )}, "+",1, 1)))));Debug.locals.put("MaxHeight", _maxheight);
 }
}Debug.locals.put("line", _line);
;
 BA.debugLineNum = 199;BA.debugLine="ResizeLayers(par.Width / mScale, MaxHeight / mSca";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_resizelayers" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_maxheight,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0))));
 BA.debugLineNum = 200;BA.debugLine="AddParagraphViews(par)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_addparagraphviews" /*RemoteObject*/ ,(Object)(_par));
 BA.debugLineNum = 201;BA.debugLine="Return par";
Debug.JustUpdateDeviceLine();
if (true) return _par;
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preprocessarabic(RemoteObject __ref,RemoteObject _chars,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("PreprocessArabic (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1148);
if (RapidSub.canDelegate("preprocessarabic")) { return __ref.runUserSub(false, "bctextengine","preprocessarabic", __ref, _chars, _length);}
RemoteObject _arabicchars = RemoteObject.declareNull("com.detektor.kateenapp.b4xbitset");
RemoteObject _arabicnonlinked = RemoteObject.declareNull("com.detektor.kateenapp.b4xbitset");
RemoteObject _fullchars = null;
RemoteObject _found = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _connecttoprev = RemoteObject.createImmutable(false);
RemoteObject _connecttonext = RemoteObject.createImmutable(false);
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _targetcp = RemoteObject.createImmutable(0);
Debug.locals.put("chars", _chars);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 1148;BA.debugLine="Public Sub PreprocessArabic(chars() As String, Len";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1149;BA.debugLine="LoadArabicData";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_loadarabicdata" /*RemoteObject*/ );
 BA.debugLineNum = 1150;BA.debugLine="Dim ArabicChars, ArabicNonLinked As B4XBitSet";
Debug.JustUpdateDeviceLine();
_arabicchars = RemoteObject.createNew ("com.detektor.kateenapp.b4xbitset");Debug.locals.put("ArabicChars", _arabicchars);
_arabicnonlinked = RemoteObject.createNew ("com.detektor.kateenapp.b4xbitset");Debug.locals.put("ArabicNonLinked", _arabicnonlinked);
 BA.debugLineNum = 1151;BA.debugLine="Dim FullChars(Length) As String";
Debug.JustUpdateDeviceLine();
_fullchars = RemoteObject.createNewArray ("String", new int[] {_length.<Integer>get().intValue()}, new Object[]{});Debug.locals.put("FullChars", _fullchars);
 BA.debugLineNum = 1152;BA.debugLine="Dim Found As Boolean";
Debug.JustUpdateDeviceLine();
_found = RemoteObject.createImmutable(false);Debug.locals.put("Found", _found);
 BA.debugLineNum = 1153;BA.debugLine="For i = 0 To Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1154;BA.debugLine="If ArabicMap.ContainsKey(chars(i).CharAt(0).As(S";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_arabicmap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)(((BA.ObjectToString(_chars.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0)))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1155;BA.debugLine="If chars(i).Length > 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_chars.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1156;BA.debugLine="FullChars(i) = chars(i).SubString(1)";
Debug.JustUpdateDeviceLine();
_fullchars.setArrayElement (_chars.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1157;BA.debugLine="chars(i) = chars(i).CharAt(0).As(String)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement ((BA.ObjectToString(_chars.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"charAt",(Object)(BA.numberCast(int.class, 0))))),BA.numberCast(int.class, _i));
 };
 BA.debugLineNum = 1159;BA.debugLine="If Found = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_found,bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1160;BA.debugLine="Found = True";
Debug.JustUpdateDeviceLine();
_found = bctextengine.__c.getField(true,"True");Debug.locals.put("Found", _found);
 BA.debugLineNum = 1161;BA.debugLine="ArabicChars.Initialize(Length)";
Debug.JustUpdateDeviceLine();
_arabicchars.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_length));
 BA.debugLineNum = 1162;BA.debugLine="ArabicNonLinked.Initialize(Length)";
Debug.JustUpdateDeviceLine();
_arabicnonlinked.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_length));
 };
 BA.debugLineNum = 1164;BA.debugLine="ArabicChars.Set(i, True)";
Debug.JustUpdateDeviceLine();
_arabicchars.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_set" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)),(Object)(bctextengine.__c.getField(true,"True")));
 BA.debugLineNum = 1165;BA.debugLine="If ArabicNonLinkedLetters.Contains(chars(i)) Th";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_arabicnonlinkedletters" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_chars.getArrayElement(true,BA.numberCast(int.class, _i))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1166;BA.debugLine="ArabicNonLinked.Set(i, True)";
Debug.JustUpdateDeviceLine();
_arabicnonlinked.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_set" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)),(Object)(bctextengine.__c.getField(true,"True")));
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1170;BA.debugLine="If Found = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_found,bctextengine.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1171;BA.debugLine="For i = 0 To Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1172;BA.debugLine="If ArabicChars.Get(i) Then";
Debug.JustUpdateDeviceLine();
if (_arabicchars.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_get" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1173;BA.debugLine="Dim ConnectToPrev As Boolean = i > 0 And Arabic";
Debug.JustUpdateDeviceLine();
_connecttoprev = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(".",_arabicchars.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)))) && RemoteObject.solveBoolean("=",_arabicnonlinked.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))),bctextengine.__c.getField(true,"False")));Debug.locals.put("ConnectToPrev", _connecttoprev);Debug.locals.put("ConnectToPrev", _connecttoprev);
 BA.debugLineNum = 1174;BA.debugLine="Dim ConnectToNext As Boolean = i < Length - 1 A";
Debug.JustUpdateDeviceLine();
_connecttonext = BA.ObjectToBoolean(RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(1)}, "-",1, 1))) && RemoteObject.solveBoolean(".",_arabicchars.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))) && RemoteObject.solveBoolean("=",_arabicnonlinked.runClassMethod (com.detektor.kateenapp.b4xbitset.class, "_get" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))),bctextengine.__c.getField(true,"False")));Debug.locals.put("ConnectToNext", _connecttonext);Debug.locals.put("ConnectToNext", _connecttonext);
 BA.debugLineNum = 1175;BA.debugLine="If ConnectToNext = False And ConnectToPrev = Fa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_connecttonext,bctextengine.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_connecttoprev,bctextengine.__c.getField(true,"False"))) { 
if (true) continue;};
 BA.debugLineNum = 1176;BA.debugLine="Dim offset As Int = IIf(ConnectToPrev And Conne";
Debug.JustUpdateDeviceLine();
_offset = BA.numberCast(int.class, ((RemoteObject.solveBoolean(".",_connecttoprev) && RemoteObject.solveBoolean(".",_connecttonext)) ? (RemoteObject.createImmutable((3))) : (((_connecttoprev.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((2)))))));Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 1177;BA.debugLine="Dim TargetCP As Int = ArabicMap.Get(chars(i))";
Debug.JustUpdateDeviceLine();
_targetcp = BA.numberCast(int.class, __ref.getField(false,"_arabicmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_chars.getArrayElement(true,BA.numberCast(int.class, _i))))));Debug.locals.put("TargetCP", _targetcp);Debug.locals.put("TargetCP", _targetcp);
 BA.debugLineNum = 1178;BA.debugLine="If TargetCP = Asc(chars(i)) Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_targetcp,BA.numberCast(double.class, bctextengine.__c.runMethod(true,"Asc",(Object)(BA.ObjectToChar(_chars.getArrayElement(true,BA.numberCast(int.class, _i)))))))) { 
 BA.debugLineNum = 1179;BA.debugLine="offset = 0";
Debug.JustUpdateDeviceLine();
_offset = BA.numberCast(int.class, 0);Debug.locals.put("offset", _offset);
 };
 BA.debugLineNum = 1181;BA.debugLine="TargetCP = TargetCP + offset";
Debug.JustUpdateDeviceLine();
_targetcp = RemoteObject.solve(new RemoteObject[] {_targetcp,_offset}, "+",1, 1);Debug.locals.put("TargetCP", _targetcp);
 BA.debugLineNum = 1182;BA.debugLine="chars(i) = Chr(TargetCP)";
Debug.JustUpdateDeviceLine();
_chars.setArrayElement (BA.ObjectToString(bctextengine.__c.runMethod(true,"Chr",(Object)(_targetcp))),BA.numberCast(int.class, _i));
 BA.debugLineNum = 1183;BA.debugLine="If FullChars(i).Length > 0 Then chars(i) = char";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_fullchars.getArrayElement(true,BA.numberCast(int.class, _i)).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
_chars.setArrayElement (RemoteObject.concat(_chars.getArrayElement(true,BA.numberCast(int.class, _i)),_fullchars.getArrayElement(true,BA.numberCast(int.class, _i))),BA.numberCast(int.class, _i));};
 BA.debugLineNum = 1184;BA.debugLine="If ConnectToPrev Then ArabicCharsConnectedPrev.";
Debug.JustUpdateDeviceLine();
if (_connecttoprev.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_arabiccharsconnectedprev" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_chars.getArrayElement(true,BA.numberCast(int.class, _i)))));};
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1187;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _printtextchars(RemoteObject __ref,RemoteObject _tc) throws Exception{
try {
		Debug.PushSubsStack("PrintTextChars (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1191);
if (RapidSub.canDelegate("printtextchars")) { return __ref.runUserSub(false, "bctextengine","printtextchars", __ref, _tc);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("TC", _tc);
 BA.debugLineNum = 1191;BA.debugLine="Public Sub PrintTextChars(TC As BCTextChars)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1192;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1193;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1194;BA.debugLine="For i = TC.StartIndex To TC.StartIndex + TC.Lengt";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_tc.getField(true,"StartIndex" /*RemoteObject*/ ),_tc.getField(true,"Length" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+-",2, 1).<Integer>get().intValue();
_i = _tc.getField(true,"StartIndex" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1195;BA.debugLine="sb.Append(TC.Buffer(i))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_tc.getField(false,"Buffer" /*RemoteObject*/ ).getArrayElement(true,BA.numberCast(int.class, _i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1197;BA.debugLine="Log(sb.ToString)";
Debug.JustUpdateDeviceLine();
bctextengine.__c.runVoidMethod ("LogImpl","953215238",_sb.runMethod(true,"ToString"),0);
 BA.debugLineNum = 1198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recoloredgesofconnectedcharacters(RemoteObject __ref,RemoteObject _c,RemoteObject _r2) throws Exception{
try {
		Debug.PushSubsStack("RecolorEdgesOfConnectedCharacters (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,902);
if (RapidSub.canDelegate("recoloredgesofconnectedcharacters")) { return __ref.runUserSub(false, "bctextengine","recoloredgesofconnectedcharacters", __ref, _c, _r2);}
RemoteObject _first = RemoteObject.createImmutable(false);
int _y = 0;
int _x = 0;
Debug.locals.put("c", _c);
Debug.locals.put("r2", _r2);
 BA.debugLineNum = 902;BA.debugLine="Private Sub RecolorEdgesOfConnectedCharacters(c As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 903;BA.debugLine="If ArabicCharsConnectedPrev.Contains(c) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_arabiccharsconnectedprev" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_c))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 904;BA.debugLine="Dim First As Boolean = True";
Debug.JustUpdateDeviceLine();
_first = bctextengine.__c.getField(true,"True");Debug.locals.put("First", _first);Debug.locals.put("First", _first);
 BA.debugLineNum = 905;BA.debugLine="For y = r2.Top To r2.Bottom - 1";
Debug.JustUpdateDeviceLine();
{
final int step3 = 1;
final int limit3 = (int) (0 + RemoteObject.solve(new RemoteObject[] {_r2.runMethod(true,"getBottom"),RemoteObject.createImmutable(1)}, "-",1, 0).<Double>get().doubleValue());
_y = (int) (0 + _r2.runMethod(true,"getTop").<Float>get().floatValue()) ;
for (;(step3 > 0 && _y <= limit3) || (step3 < 0 && _y >= limit3) ;_y = ((int)(0 + _y + step3))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 906;BA.debugLine="For x = r2.Right - 1 To Max(r2.Left, r2.Right -";
Debug.JustUpdateDeviceLine();
{
final int step4 = -1;
final int limit4 = (int) (0 + bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _r2.runMethod(true,"getLeft"))),(Object)(RemoteObject.solve(new RemoteObject[] {_r2.runMethod(true,"getRight"),RemoteObject.createImmutable(5)}, "-",1, 0))).<Double>get().doubleValue());
_x = (int) (0 + RemoteObject.solve(new RemoteObject[] {_r2.runMethod(true,"getRight"),RemoteObject.createImmutable(1)}, "-",1, 0).<Double>get().doubleValue()) ;
for (;(step4 > 0 && _x <= limit4) || (step4 < 0 && _x >= limit4) ;_x = ((int)(0 + _x + step4))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 907;BA.debugLine="If CharBC.IsTransparent(x, y) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_charbc" /*RemoteObject*/ ).runMethod(true,"_istransparent",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y))),bctextengine.__c.getField(true,"False"))) { 
 BA.debugLineNum = 908;BA.debugLine="If First Then";
Debug.JustUpdateDeviceLine();
if (_first.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 909;BA.debugLine="First = False";
Debug.JustUpdateDeviceLine();
_first = bctextengine.__c.getField(true,"False");Debug.locals.put("First", _first);
 }else {
 BA.debugLineNum = 911;BA.debugLine="CharBC.SetPremultipliedColor(x, y, PMDefault";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).runVoidMethod ("_setpremultipliedcolor",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(__ref.getField(false,"_pmdefaultcolor" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 913;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 };
 BA.debugLineNum = 918;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _releaseasyncbc(RemoteObject __ref,RemoteObject _bc) throws Exception{
try {
		Debug.PushSubsStack("ReleaseAsyncBC (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,690);
if (RapidSub.canDelegate("releaseasyncbc")) { return __ref.runUserSub(false, "bctextengine","releaseasyncbc", __ref, _bc);}
Debug.locals.put("bc", _bc);
 BA.debugLineNum = 690;BA.debugLine="Public Sub ReleaseAsyncBC(bc As BitmapCreator)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 691;BA.debugLine="AsyncBCs.Put(bc, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_asyncbcs" /*RemoteObject*/ ).runClassMethod (com.detektor.kateenapp.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_bc)),(Object)((bctextengine.__c.getField(true,"False"))));
 BA.debugLineNum = 692;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizecharbc(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("ResizeCharBC (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,754);
if (RapidSub.canDelegate("resizecharbc")) { return __ref.runUserSub(false, "bctextengine","resizecharbc", __ref, _width, _height);}
RemoteObject _scaledwidth = RemoteObject.createImmutable(0);
RemoteObject _scaledheight = RemoteObject.createImmutable(0);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 754;BA.debugLine="Private Sub ResizeCharBC(width As Int, height As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 755;BA.debugLine="Dim ScaledWidth As Int = (width + 5) / mScale";
Debug.JustUpdateDeviceLine();
_scaledwidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(5)}, "+",1, 1)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("ScaledWidth", _scaledwidth);Debug.locals.put("ScaledWidth", _scaledwidth);
 BA.debugLineNum = 756;BA.debugLine="Dim ScaledHeight As Int = (height + 5) / mScale";
Debug.JustUpdateDeviceLine();
_scaledheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(5)}, "+",1, 1)),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("ScaledHeight", _scaledheight);Debug.locals.put("ScaledHeight", _scaledheight);
 BA.debugLineNum = 757;BA.debugLine="CharBC.Initialize(ScaledWidth * mScale, ScaledHei";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_scaledwidth,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_scaledheight,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 758;BA.debugLine="CharBC.MAX_SAME_COLOR_SIZE = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).setField ("_max_same_color_size",BA.numberCast(int.class, 0));
 BA.debugLineNum = 759;BA.debugLine="CharBC.AlphaThresholdForCBCExtraction = 0";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_charbc" /*RemoteObject*/ ).setField ("_alphathresholdforcbcextraction",BA.numberCast(int.class, 0));
 BA.debugLineNum = 760;BA.debugLine="cvs.Resize(ScaledWidth, ScaledHeight)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(BA.numberCast(float.class, _scaledwidth)),(Object)(BA.numberCast(float.class, _scaledheight)));
 BA.debugLineNum = 774;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizeimageview(RemoteObject __ref,RemoteObject _bc,RemoteObject _par,RemoteObject _iv,RemoteObject _resizeheight) throws Exception{
try {
		Debug.PushSubsStack("ResizeImageView (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("resizeimageview")) { return __ref.runUserSub(false, "bctextengine","resizeimageview", __ref, _bc, _par, _iv, _resizeheight);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _ivheight = RemoteObject.createImmutable(0);
Debug.locals.put("bc", _bc);
Debug.locals.put("par", _par);
Debug.locals.put("iv", _iv);
Debug.locals.put("ResizeHeight", _resizeheight);
 BA.debugLineNum = 228;BA.debugLine="Private Sub ResizeImageView (bc As BitmapCreator,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 229;BA.debugLine="Dim bmp As B4XBitmap = bc.Bitmap";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _bc.runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 230;BA.debugLine="Dim ivHeight As Int = par.Height / mScale";
Debug.JustUpdateDeviceLine();
_ivheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(true,"Height" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("ivHeight", _ivheight);Debug.locals.put("ivHeight", _ivheight);
 BA.debugLineNum = 231;BA.debugLine="If ResizeHeight = False Then ivHeight = Min(ivHei";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_resizeheight,bctextengine.__c.getField(true,"False"))) { 
_ivheight = BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _ivheight)),(Object)(RemoteObject.solve(new RemoteObject[] {_iv.runMethod(false,"getParent").runMethod(true,"getHeight"),_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getTop"),_par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getBottom")}, "--",2, 0))));Debug.locals.put("ivHeight", _ivheight);};
 BA.debugLineNum = 232;BA.debugLine="iv.SetLayoutAnimated(0, par.Style.Padding.Left, p";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getLeft"))),(Object)(BA.numberCast(int.class, _par.getField(false,"Style" /*RemoteObject*/ ).getField(false,"Padding" /*RemoteObject*/ ).runMethod(true,"getTop"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_par.getField(true,"Width" /*RemoteObject*/ ),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "/",0, 0))),(Object)(_ivheight));
 BA.debugLineNum = 233;BA.debugLine="bc.SetBitmapToImageView(bmp.Crop(0, 0, iv.Width *";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_setbitmaptoimageview",(Object)(_bmp.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_iv.runMethod(true,"getWidth"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_iv.runMethod(true,"getHeight"),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0))))),(Object)(_iv));
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizelayers(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("ResizeLayers (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("resizelayers")) { return __ref.runUserSub(false, "bctextengine","resizelayers", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 118;BA.debugLine="Private Sub ResizeLayers (Width As Int, Height As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Width = Max(Width, 2) * mScale";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, 2))),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("Width", _width);
 BA.debugLineNum = 120;BA.debugLine="Height = Max(Height, 2) * mScale";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _height)),(Object)(BA.numberCast(double.class, 2))),__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0));Debug.locals.put("Height", _height);
 BA.debugLineNum = 121;BA.debugLine="If ForegroundBC.IsInitialized = False Or Width >";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),bctextengine.__c.getField(true,"False")) || RemoteObject.solveBoolean(">",_width,BA.numberCast(double.class, __ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).getField(true,"_mwidth"))) || RemoteObject.solveBoolean(">",_height,BA.numberCast(double.class, __ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).getField(true,"_mheight")))) { 
 BA.debugLineNum = 122;BA.debugLine="If ForegroundBC.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="Width = Max(Width, ForegroundBC.mWidth)";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _width)),(Object)(BA.numberCast(double.class, __ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).getField(true,"_mwidth")))));Debug.locals.put("Width", _width);
 BA.debugLineNum = 124;BA.debugLine="Height = Max(Height, ForegroundBC.mHeight)";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, bctextengine.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _height)),(Object)(BA.numberCast(double.class, __ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).getField(true,"_mheight")))));Debug.locals.put("Height", _height);
 };
 BA.debugLineNum = 129;BA.debugLine="Brushes.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_brushes" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 130;BA.debugLine="ForegroundBC.Initialize(Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(_width),(Object)(_height));
 }else {
 BA.debugLineNum = 132;BA.debugLine="ForegroundBC.DrawRect2(ForegroundBC.TargetRect,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).runVoidMethod ("_drawrect2",(Object)(__ref.getField(false,"_foregroundbc" /*RemoteObject*/ ).getField(false,"_targetrect")),(Object)(__ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_getbrush" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")))),(Object)(bctextengine.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 0)));
 };
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmingapbetweenlines(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setMinGapBetweenLines (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1042);
if (RapidSub.canDelegate("setmingapbetweenlines")) { return __ref.runUserSub(false, "bctextengine","setmingapbetweenlines", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 1042;BA.debugLine="Public Sub setMinGapBetweenLines(i As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1043;BA.debugLine="mMinGapBetweenLines = i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmingapbetweenlines" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 1044;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setspacebetweencharacters(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("setSpaceBetweenCharacters (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1028);
if (RapidSub.canDelegate("setspacebetweencharacters")) { return __ref.runUserSub(false, "bctextengine","setspacebetweencharacters", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 1028;BA.debugLine="Public Sub setSpaceBetweenCharacters(f As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1029;BA.debugLine="mSpaceBetweenCharacters = f * mScale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mspacebetweencharacters" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_f,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 1030;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setspacebetweenlines(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("setSpaceBetweenLines (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1037);
if (RapidSub.canDelegate("setspacebetweenlines")) { return __ref.runUserSub(false, "bctextengine","setspacebetweenlines", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 1037;BA.debugLine="Public Sub setSpaceBetweenLines(f As Float)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1038;BA.debugLine="mSpaceBetweenLines = f * mScale";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mspacebetweenlines" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_f,__ref.getField(true,"_mscale" /*RemoteObject*/ )}, "*",0, 0)));
 BA.debugLineNum = 1039;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textcharequals(RemoteObject __ref,RemoteObject _tc,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("TextCharEquals (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1118);
if (RapidSub.canDelegate("textcharequals")) { return __ref.runUserSub(false, "bctextengine","textcharequals", __ref, _tc, _s);}
int _i = 0;
Debug.locals.put("TC", _tc);
Debug.locals.put("s", _s);
 BA.debugLineNum = 1118;BA.debugLine="Private Sub TextCharEquals (TC As BCTextChars, s A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1119;BA.debugLine="If TC.Length <> s.Length Then Return False";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_tc.getField(true,"Length" /*RemoteObject*/ ),BA.numberCast(double.class, _s.runMethod(true,"length")))) { 
if (true) return bctextengine.__c.getField(true,"False");};
 BA.debugLineNum = 1120;BA.debugLine="For i = 0 To TC.Length - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_tc.getField(true,"Length" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1121;BA.debugLine="If TC.Buffer(i + TC.StartIndex) <> s.CharAt(i) T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_tc.getField(false,"Buffer" /*RemoteObject*/ ).getArrayElement(true,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_tc.getField(true,"StartIndex" /*RemoteObject*/ )}, "+",1, 1)),BA.ObjectToString(_s.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)))))) { 
if (true) return bctextengine.__c.getField(true,"False");};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1123;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return bctextengine.__c.getField(true,"True");
 BA.debugLineNum = 1124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textcharssubstring(RemoteObject __ref,RemoteObject _tc,RemoteObject _startindex,RemoteObject _endindex) throws Exception{
try {
		Debug.PushSubsStack("TextCharsSubstring (bctextengine) ","bctextengine",58,__ref.getField(false, "ba"),__ref,1114);
if (RapidSub.canDelegate("textcharssubstring")) { return __ref.runUserSub(false, "bctextengine","textcharssubstring", __ref, _tc, _startindex, _endindex);}
Debug.locals.put("TC", _tc);
Debug.locals.put("StartIndex", _startindex);
Debug.locals.put("EndIndex", _endindex);
 BA.debugLineNum = 1114;BA.debugLine="Private Sub TextCharsSubstring(TC As BCTextChars,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1115;BA.debugLine="Return CreateBCTextChars(TC.Buffer, StartIndex +";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (com.detektor.kateenapp.bctextengine.class, "_createbctextchars" /*RemoteObject*/ ,(Object)(_tc.getField(false,"Buffer" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {_startindex,_tc.getField(true,"StartIndex" /*RemoteObject*/ )}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_endindex,_startindex}, "-",1, 1)));
 BA.debugLineNum = 1116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}