package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_selectloc{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("selectloc").vw.setHeight((int)((20d / 100 * width)));
views.get("selectloc").vw.setWidth((int)((20d / 100 * width)));
views.get("selectloc").vw.setLeft((int)((40d / 100 * width)));
views.get("selectloc").vw.setTop((int)((40d / 100 * height)));

}
}