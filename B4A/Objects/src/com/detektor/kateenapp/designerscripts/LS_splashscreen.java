package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_splashscreen{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("imglogo").vw.setTop((int)((20d / 100 * height) - (views.get("imglogo").vw.getHeight() / 2)));
views.get("imglogo").vw.setLeft((int)((50d / 100 * width) - (views.get("imglogo").vw.getWidth() / 2)));
views.get("imglogo").vw.setHeight((int)((70d / 100 * width)));
views.get("imglogo").vw.setWidth((int)((50d / 100 * width)));
views.get("label1").vw.setTop((int)((views.get("imglogo").vw.getTop() + views.get("imglogo").vw.getHeight())));
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(10d / 100 * height)));
views.get("label2").vw.setLeft((int)((50d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));

}
}