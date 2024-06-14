package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_gps{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel2").vw.setLeft((int)((views.get("panel1").vw.getHeight())/2d - (views.get("panel2").vw.getWidth() / 2)));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getWidth())/2d - (views.get("panel2").vw.getHeight() / 2)));
views.get("panel1").vw.setTop((int)((30d / 100 * height) - (views.get("panel1").vw.getHeight() / 2)));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("label1").vw.setWidth((int)((100d / 100 * width)));
views.get("label1").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())));
views.get("button1").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(5d / 100 * height)));
views.get("button1").vw.setLeft((int)((50d / 100 * width) - (views.get("button1").vw.getWidth() / 2)));
views.get("label2").vw.setWidth((int)((100d / 100 * width)));
views.get("label2").vw.setLeft((int)((50d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));
views.get("label2").vw.setTop((int)((95d / 100 * height) - (views.get("label2").vw.getHeight())));

}
}