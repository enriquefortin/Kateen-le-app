package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label1").vw.setTop((int)((10d / 100 * height) - (views.get("label1").vw.getHeight() / 2)));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(5d / 100 * height)));
views.get("panel2").vw.setLeft((int)((50d / 100 * width) - (views.get("panel2").vw.getWidth() / 2)));
views.get("panel2").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("label2").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("label3").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("panel3").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("panel3").vw.setLeft((int)((50d / 100 * width) - (views.get("panel3").vw.getWidth() / 2)));
views.get("label3").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
views.get("checkbox1").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
views.get("checkbox1").vw.setTop((int)((views.get("panel3").vw.getTop() + views.get("panel3").vw.getHeight())+(1d / 100 * height)));
views.get("label4").vw.setLeft((int)((views.get("checkbox1").vw.getLeft() + views.get("checkbox1").vw.getWidth())+(1d / 100 * width)));
views.get("label4").vw.setTop((int)((views.get("checkbox1").vw.getTop())));
views.get("button1").vw.setLeft((int)((50d / 100 * width) - (views.get("button1").vw.getWidth() / 2)));
views.get("button1").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())+(10d / 100 * width)));
views.get("label5").vw.setTop((int)((views.get("button1").vw.getTop() + views.get("button1").vw.getHeight())+(5d / 100 * height)));
views.get("label5").vw.setLeft((int)((50d / 100 * width) - (views.get("label5").vw.getWidth() / 2)));

}
}