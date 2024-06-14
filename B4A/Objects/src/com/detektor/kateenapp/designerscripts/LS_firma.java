package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_firma{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 3;BA.debugLine="pnlmenu.Top=2%y"[firma/General script]
views.get("pnlmenu").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 4;BA.debugLine="pnlfirma.Top=pnlmenu.Bottom+2%y"[firma/General script]
views.get("pnlfirma").vw.setTop((int)((views.get("pnlmenu").vw.getTop() + views.get("pnlmenu").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 5;BA.debugLine="pnlfirma.Width=90%x"[firma/General script]
views.get("pnlfirma").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 6;BA.debugLine="pnlfirma.Height=50%y"[firma/General script]
views.get("pnlfirma").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 7;BA.debugLine="pnldondesefirma.Width=88%x"[firma/General script]
views.get("pnldondesefirma").vw.setWidth((int)((88d / 100 * width)));
//BA.debugLineNum = 8;BA.debugLine="pnldondesefirma.Height=48%y"[firma/General script]
views.get("pnldondesefirma").vw.setHeight((int)((48d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="pnldondesefirma.HorizontalCenter=pnlfirma.Width/2"[firma/General script]
views.get("pnldondesefirma").vw.setLeft((int)((views.get("pnlfirma").vw.getWidth())/2d - (views.get("pnldondesefirma").vw.getWidth() / 2)));
//BA.debugLineNum = 10;BA.debugLine="pnldondesefirma.VerticalCenter=pnlfirma.Height/2"[firma/General script]
views.get("pnldondesefirma").vw.setTop((int)((views.get("pnlfirma").vw.getHeight())/2d - (views.get("pnldondesefirma").vw.getHeight() / 2)));
//BA.debugLineNum = 12;BA.debugLine="pnlfirma.HorizontalCenter=50%x"[firma/General script]
views.get("pnlfirma").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlfirma").vw.getWidth() / 2)));
//BA.debugLineNum = 13;BA.debugLine="btnlimpiar.Top=pnlfirma.Bottom+1%y"[firma/General script]
views.get("btnlimpiar").vw.setTop((int)((views.get("pnlfirma").vw.getTop() + views.get("pnlfirma").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 14;BA.debugLine="btnlimpiar.HorizontalCenter=50%x"[firma/General script]
views.get("btnlimpiar").vw.setLeft((int)((50d / 100 * width) - (views.get("btnlimpiar").vw.getWidth() / 2)));
//BA.debugLineNum = 15;BA.debugLine="lblmail.Top=btnlimpiar.Bottom+5%y"[firma/General script]
views.get("lblmail").vw.setTop((int)((views.get("btnlimpiar").vw.getTop() + views.get("btnlimpiar").vw.getHeight())+(5d / 100 * height)));
//BA.debugLineNum = 16;BA.debugLine="pnlmail.Top=lblmail.Bottom"[firma/General script]
views.get("pnlmail").vw.setTop((int)((views.get("lblmail").vw.getTop() + views.get("lblmail").vw.getHeight())));
//BA.debugLineNum = 17;BA.debugLine="btncontinuarfirma.Top=pnlmail.Bottom+2%y"[firma/General script]
views.get("btncontinuarfirma").vw.setTop((int)((views.get("pnlmail").vw.getTop() + views.get("pnlmail").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 18;BA.debugLine="imgviewfirma.Top=pnlfirma.Bottom+1dip"[firma/General script]
views.get("imgviewfirma").vw.setTop((int)((views.get("pnlfirma").vw.getTop() + views.get("pnlfirma").vw.getHeight())+(1d * scale)));
//BA.debugLineNum = 19;BA.debugLine="imgviewfirma.Left=btnlimpiar.Right+1dip"[firma/General script]
views.get("imgviewfirma").vw.setLeft((int)((views.get("btnlimpiar").vw.getLeft() + views.get("btnlimpiar").vw.getWidth())+(1d * scale)));

}
}