package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_gpsmap{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel1").vw.setWidth((int)((100d / 100 * width)));
views.get("panel1").vw.setTop((int)((0d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height)));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("mapfragment1").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("mapfragment1").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("mapfragment1").vw.setLeft((int)((views.get("panel1").vw.getLeft())));
views.get("mapfragment1").vw.setTop((int)((views.get("panel1").vw.getTop())));
views.get("pnlhora").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlhora").vw.getWidth() / 2)));
views.get("pnlhora").vw.setTop((int)((5d / 100 * height)));
views.get("btnplace").vw.setTop((int)((70d / 100 * height)));
views.get("btnplace").vw.setLeft((int)((50d / 100 * width) - (views.get("btnplace").vw.getWidth() / 2)));
views.get("pnlmenu").vw.setTop((int)((2d / 100 * height)));
views.get("label2").vw.setTop((int)((views.get("btnplace").vw.getTop())));
views.get("label2").vw.setWidth((int)((views.get("btnplace").vw.getWidth())));

}
}