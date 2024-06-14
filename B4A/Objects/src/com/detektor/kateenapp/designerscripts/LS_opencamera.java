package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_opencamera{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("btnsiguienteopencamera").vw.setLeft((int)((50d / 100 * width) - (views.get("btnsiguienteopencamera").vw.getWidth() / 2)));
views.get("lblresult").vw.setLeft((int)((50d / 100 * width) - (views.get("lblresult").vw.getWidth() / 2)));

}
}