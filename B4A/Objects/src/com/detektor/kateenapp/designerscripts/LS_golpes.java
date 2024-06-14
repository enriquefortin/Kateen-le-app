package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_golpes{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("pnlimg").vw.setHeight((int)((45d / 100 * height)));
views.get("pnlimg").vw.setWidth((int)((90d / 100 * width)));
views.get("pnlimg").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlimg").vw.getWidth() / 2)));
views.get("pnlimg").vw.setTop((int)((views.get("pnlmenu").vw.getTop() + views.get("pnlmenu").vw.getHeight())+(2d / 100 * height)));
views.get("cmbauto").vw.setTop((int)((views.get("pnlimg").vw.getTop() + views.get("pnlimg").vw.getHeight())+(1d / 100 * height)));
views.get("cmbauto").vw.setLeft((int)((50d / 100 * width) - (views.get("cmbauto").vw.getWidth() / 2)));
views.get("pnlobjetos").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlobjetos").vw.getWidth() / 2)));
views.get("pnlobjetos").vw.setTop((int)((views.get("cmbauto").vw.getTop() + views.get("cmbauto").vw.getHeight())+(1d / 100 * height)));
views.get("pnlrayo").vw.setTop((int)(0d));
views.get("pnlrayo").vw.setLeft((int)(((views.get("pnlobjetos").vw.getWidth())/4d)-((views.get("pnlrayo").vw.getWidth())/2d)));
views.get("pnlguion").vw.setLeft((int)(((views.get("pnlobjetos").vw.getWidth())/2d)-((views.get("pnlguion").vw.getWidth())/2d)));
views.get("pnlgolpe").vw.setLeft((int)((3d*(views.get("pnlobjetos").vw.getWidth())/4d)-((views.get("pnlgolpe").vw.getWidth())/2d)));
views.get("lblrajado").vw.setLeft((int)((views.get("pnlrayo").vw.getLeft() + views.get("pnlrayo").vw.getWidth()/2) - (views.get("lblrajado").vw.getWidth() / 2)));
views.get("lblguion").vw.setLeft((int)((views.get("pnlguion").vw.getLeft() + views.get("pnlguion").vw.getWidth()/2) - (views.get("lblguion").vw.getWidth() / 2)));
views.get("lblgolpe").vw.setLeft((int)((views.get("pnlgolpe").vw.getLeft() + views.get("pnlgolpe").vw.getWidth()/2) - (views.get("lblgolpe").vw.getWidth() / 2)));
//BA.debugLineNum = 18;BA.debugLine="lblobs.Top=pnlobjetos.Bottom"[golpes/General script]
views.get("lblobs").vw.setTop((int)((views.get("pnlobjetos").vw.getTop() + views.get("pnlobjetos").vw.getHeight())));
//BA.debugLineNum = 19;BA.debugLine="lblobs.Left=pnlimg.Left"[golpes/General script]
views.get("lblobs").vw.setLeft((int)((views.get("pnlimg").vw.getLeft())));
//BA.debugLineNum = 20;BA.debugLine="pnlobs.Top=lblobs.Bottom"[golpes/General script]
views.get("pnlobs").vw.setTop((int)((views.get("lblobs").vw.getTop() + views.get("lblobs").vw.getHeight())));
//BA.debugLineNum = 21;BA.debugLine="pnlobs.HorizontalCenter=50%x"[golpes/General script]
views.get("pnlobs").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlobs").vw.getWidth() / 2)));
//BA.debugLineNum = 22;BA.debugLine="btncontinuargolpe.Top=pnlobs.Bottom+1%y"[golpes/General script]
views.get("btncontinuargolpe").vw.setTop((int)((views.get("pnlobs").vw.getTop() + views.get("pnlobs").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 23;BA.debugLine="ImageView1.Width=pnlimg.Width-2%x"[golpes/General script]
views.get("imageview1").vw.setWidth((int)((views.get("pnlimg").vw.getWidth())-(2d / 100 * width)));
//BA.debugLineNum = 24;BA.debugLine="ImageView1.Height=pnlimg.Height-2%y"[golpes/General script]
views.get("imageview1").vw.setHeight((int)((views.get("pnlimg").vw.getHeight())-(2d / 100 * height)));
//BA.debugLineNum = 25;BA.debugLine="ImageView1.HorizontalCenter=pnlimg.Width/2"[golpes/General script]
views.get("imageview1").vw.setLeft((int)((views.get("pnlimg").vw.getWidth())/2d - (views.get("imageview1").vw.getWidth() / 2)));
//BA.debugLineNum = 26;BA.debugLine="ImageView1.VerticalCenter=pnlimg.Height/2"[golpes/General script]
views.get("imageview1").vw.setTop((int)((views.get("pnlimg").vw.getHeight())/2d - (views.get("imageview1").vw.getHeight() / 2)));
//BA.debugLineNum = 27;BA.debugLine="pnlclickcarro.Width=ImageView1.Width"[golpes/General script]
views.get("pnlclickcarro").vw.setWidth((int)((views.get("imageview1").vw.getWidth())));
//BA.debugLineNum = 28;BA.debugLine="pnlclickcarro.Height=ImageView1.Height"[golpes/General script]
views.get("pnlclickcarro").vw.setHeight((int)((views.get("imageview1").vw.getHeight())));
//BA.debugLineNum = 29;BA.debugLine="pnlclickcarro.HorizontalCenter=pnlimg.Width/2"[golpes/General script]
views.get("pnlclickcarro").vw.setLeft((int)((views.get("pnlimg").vw.getWidth())/2d - (views.get("pnlclickcarro").vw.getWidth() / 2)));
//BA.debugLineNum = 30;BA.debugLine="pnlclickcarro.VerticalCenter=pnlimg.Height/2"[golpes/General script]
views.get("pnlclickcarro").vw.setTop((int)((views.get("pnlimg").vw.getHeight())/2d - (views.get("pnlclickcarro").vw.getHeight() / 2)));

}
}