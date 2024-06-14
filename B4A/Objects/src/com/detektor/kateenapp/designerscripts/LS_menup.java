package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_menup{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("label1").vw.setWidth((int)((100d / 100 * width)));
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label1").vw.setTop((int)((10d / 100 * height)));
views.get("clvs1").vw.setWidth((int)((100d / 100 * width)));
views.get("label2").vw.setTop((int)((100d / 100 * height) - (views.get("label2").vw.getHeight())));
views.get("label2").vw.setWidth((int)((100d / 100 * width)));
views.get("label2").vw.setLeft((int)((50d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));
views.get("clvs1").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));

}
}