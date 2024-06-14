package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class signaturecapture {
private static signaturecapture mostCurrent = new signaturecapture();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _signaturedata{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper Canvas;
public anywheresoftware.b4a.objects.PanelWrapper Panel;
public int SignatureColor;
public int SignatureWidth;
public void Initialize() {
IsInitialized = true;
Canvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
Panel = new anywheresoftware.b4a.objects.PanelWrapper();
SignatureColor = 0;
SignatureWidth = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _px = 0;
public static int _py = 0;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.firebasemessaging _firebasemessaging = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static String  _save(anywheresoftware.b4a.BA _ba,com.detektor.kateenapp.signaturecapture._signaturedata _sd,String _dir,String _name) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "save", false))
	 {return ((String) Debug.delegate(null, "save", new Object[] {_ba,_sd,_dir,_name}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Sub Save(SD As SignatureData, Dir As String, Name";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="out = File.OpenOutput(Dir, Name, False)";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_name,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="SD.Canvas.Bitmap.WriteToStream(out, 100, \"PNG\")";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="End Sub";
return "";
}
public static String  _clear(anywheresoftware.b4a.BA _ba,com.detektor.kateenapp.signaturecapture._signaturedata _sd) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "clear", false))
	 {return ((String) Debug.delegate(null, "clear", new Object[] {_ba,_sd}));}
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Sub Clear(SD As SignatureData)";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="SD.Canvas.DrawColor(Colors.White)";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="SD.Panel.Invalidate";
_sd.Panel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="End Sub";
return "";
}
public static String  _panel_touch(anywheresoftware.b4a.BA _ba,com.detektor.kateenapp.signaturecapture._signaturedata _sd,int _x,int _y,int _action) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "panel_touch", false))
	 {return ((String) Debug.delegate(null, "panel_touch", new Object[] {_ba,_sd,_x,_y,_action}));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Sub Panel_Touch(SD As SignatureData, x As Int,y As";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="If Action = 0 Then 'mouse down constant";
if (_action==0) { 
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="px = x";
_px = _x;
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="py = y";
_py = _y;
 }else {
RDebugUtils.currentLine=41680901;
 //BA.debugLineNum = 41680901;BA.debugLine="SD.Canvas.DrawLine(px, py, x, y, SD.SignatureCol";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawLine((float) (_px),(float) (_py),(float) (_x),(float) (_y),_sd.SignatureColor /*int*/ ,(float) (_sd.SignatureWidth /*int*/ ));
RDebugUtils.currentLine=41680902;
 //BA.debugLineNum = 41680902;BA.debugLine="SD.Canvas.DrawCircle(px, py, SD.SignatureWidth/2";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawCircle((float) (_px),(float) (_py),(float) (_sd.SignatureWidth /*int*/ /(double)2),_sd.SignatureColor /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (_sd.SignatureWidth /*int*/ /(double)2));
RDebugUtils.currentLine=41680903;
 //BA.debugLineNum = 41680903;BA.debugLine="SD.Panel.Invalidate";
_sd.Panel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=41680904;
 //BA.debugLineNum = 41680904;BA.debugLine="px = x";
_px = _x;
RDebugUtils.currentLine=41680905;
 //BA.debugLineNum = 41680905;BA.debugLine="py = y";
_py = _y;
 };
RDebugUtils.currentLine=41680907;
 //BA.debugLineNum = 41680907;BA.debugLine="End Sub";
return "";
}
}