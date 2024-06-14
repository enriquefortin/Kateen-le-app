package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_questioninterfaz{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("pnlmenu").vw.setTop((int)((2d / 100 * height)));
views.get("btnnotificar").vw.setTop((int)((70d / 100 * height)));
views.get("btnnotificar").vw.setLeft((int)((50d / 100 * width) - (views.get("btnnotificar").vw.getWidth() / 2)));
views.get("imginstaphoto").vw.setTop((int)((20d / 100 * height) - (views.get("imginstaphoto").vw.getHeight() / 2)));
views.get("imginstaphoto").vw.setLeft((int)((50d / 100 * width) - (views.get("imginstaphoto").vw.getWidth() / 2)));
views.get("lblname").vw.setWidth((int)((100d / 100 * width)));
views.get("lblname").vw.setLeft((int)((50d / 100 * width) - (views.get("lblname").vw.getWidth() / 2)));
views.get("lblname").vw.setTop((int)((views.get("imginstaphoto").vw.getTop() + views.get("imginstaphoto").vw.getHeight())));
views.get("btnnotificar").vw.setTop((int)((views.get("lblname").vw.getTop() + views.get("lblname").vw.getHeight())+(2d / 100 * height)));
views.get("lblmsj").vw.setTop((int)((views.get("btnnotificar").vw.getTop() + views.get("btnnotificar").vw.getHeight())+(5d / 100 * height)));
views.get("btnnotificar").vw.setLeft((int)((50d / 100 * width) - (views.get("btnnotificar").vw.getWidth() / 2)));
views.get("lblmsj").vw.setLeft((int)((50d / 100 * width) - (views.get("lblmsj").vw.getWidth() / 2)));
views.get("b4xswitchllego").vw.setTop((int)((views.get("lblmsj").vw.getTop() + views.get("lblmsj").vw.getHeight())));
views.get("b4xswitchllego").vw.setLeft((int)((50d / 100 * width) - (views.get("b4xswitchllego").vw.getWidth() / 2)));
views.get("lblno").vw.setTop((int)((views.get("b4xswitchllego").vw.getTop())));
views.get("lblsi").vw.setTop((int)((views.get("b4xswitchllego").vw.getTop())));
views.get("lblno").vw.setLeft((int)((views.get("b4xswitchllego").vw.getLeft()) - (views.get("lblno").vw.getWidth())));
views.get("lblsi").vw.setLeft((int)((views.get("b4xswitchllego").vw.getLeft() + views.get("b4xswitchllego").vw.getWidth())));

}
}