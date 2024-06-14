package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_menuorden{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel1").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(1d / 100 * height)));
views.get("label1").vw.setLeft((int)((30d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(2d / 100 * height)));
views.get("label2").vw.setLeft((int)((30d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));
views.get("panel2").vw.setWidth((int)((90d / 100 * width)));
views.get("panel2").vw.setLeft((int)((50d / 100 * width) - (views.get("panel2").vw.getWidth() / 2)));
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(2d / 100 * height)));
views.get("label3").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("panel2").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("label8").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("label8").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(1d / 100 * height)));
views.get("b4xcombobox1").vw.setTop((int)((views.get("label8").vw.getTop() + views.get("label8").vw.getHeight())));
views.get("b4xcombobox1").vw.setWidth((int)((90d / 100 * width)));
views.get("b4xcombobox1").vw.setLeft((int)((views.get("label8").vw.getLeft())));
views.get("label9").vw.setWidth((int)((90d / 100 * width)));
views.get("label9").vw.setTop((int)((views.get("b4xcombobox1").vw.getTop() + views.get("b4xcombobox1").vw.getHeight())));
views.get("label9").vw.setLeft((int)((views.get("b4xcombobox1").vw.getLeft())));
views.get("panel3").vw.setLeft((int)((views.get("label9").vw.getLeft())));
views.get("panel3").vw.setTop((int)((views.get("label9").vw.getTop() + views.get("label9").vw.getHeight())));
views.get("panel3").vw.setWidth((int)((90d / 100 * width)));
views.get("panel9").vw.setWidth((int)((90d / 100 * width)));
views.get("label10").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
views.get("label10").vw.setTop((int)((views.get("panel3").vw.getTop() + views.get("panel3").vw.getHeight())));
views.get("label10").vw.setWidth((int)((90d / 100 * width)));
views.get("panel9").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 33;BA.debugLine="Panel9.Left=Panel3.Left"[menuorden/General script]
views.get("panel9").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
//BA.debugLineNum = 34;BA.debugLine="Panel9.Top=Label10.Bottom"[menuorden/General script]
views.get("panel9").vw.setTop((int)((views.get("label10").vw.getTop() + views.get("label10").vw.getHeight())));
//BA.debugLineNum = 36;BA.debugLine="Label11.Top=Panel9.Bottom"[menuorden/General script]
views.get("label11").vw.setTop((int)((views.get("panel9").vw.getTop() + views.get("panel9").vw.getHeight())));
//BA.debugLineNum = 37;BA.debugLine="Label11.HorizontalCenter=40%x"[menuorden/General script]
views.get("label11").vw.setLeft((int)((40d / 100 * width) - (views.get("label11").vw.getWidth() / 2)));
//BA.debugLineNum = 38;BA.debugLine="Label12.Left=Label11.left"[menuorden/General script]
views.get("label12").vw.setLeft((int)((views.get("label11").vw.getLeft())));
//BA.debugLineNum = 39;BA.debugLine="Label12.Top=Label11.Bottom"[menuorden/General script]
views.get("label12").vw.setTop((int)((views.get("label11").vw.getTop() + views.get("label11").vw.getHeight())));
//BA.debugLineNum = 40;BA.debugLine="B4XSwitch1.Left=Label11.Right"[menuorden/General script]
views.get("b4xswitch1").vw.setLeft((int)((views.get("label11").vw.getLeft() + views.get("label11").vw.getWidth())));
//BA.debugLineNum = 41;BA.debugLine="B4XSwitch1.Top=Label11.Top"[menuorden/General script]
views.get("b4xswitch1").vw.setTop((int)((views.get("label11").vw.getTop())));
//BA.debugLineNum = 42;BA.debugLine="B4XSwitch2.Left=B4XSwitch1.Left"[menuorden/General script]
views.get("b4xswitch2").vw.setLeft((int)((views.get("b4xswitch1").vw.getLeft())));
//BA.debugLineNum = 43;BA.debugLine="B4XSwitch2.Top=B4XSwitch1.Bottom"[menuorden/General script]
views.get("b4xswitch2").vw.setTop((int)((views.get("b4xswitch1").vw.getTop() + views.get("b4xswitch1").vw.getHeight())));
//BA.debugLineNum = 44;BA.debugLine="B4XSwitch1.VerticalCenter=Label11.VerticalCenter"[menuorden/General script]
views.get("b4xswitch1").vw.setTop((int)((views.get("label11").vw.getTop() + views.get("label11").vw.getHeight()/2) - (views.get("b4xswitch1").vw.getHeight() / 2)));
//BA.debugLineNum = 45;BA.debugLine="B4XSwitch2.VerticalCenter=Label12.VerticalCenter"[menuorden/General script]
views.get("b4xswitch2").vw.setTop((int)((views.get("label12").vw.getTop() + views.get("label12").vw.getHeight()/2) - (views.get("b4xswitch2").vw.getHeight() / 2)));
//BA.debugLineNum = 46;BA.debugLine="Button1.Top=Label12.Bottom"[menuorden/General script]
views.get("button1").vw.setTop((int)((views.get("label12").vw.getTop() + views.get("label12").vw.getHeight())));
//BA.debugLineNum = 47;BA.debugLine="Button1.HorizontalCenter=50%x"[menuorden/General script]
views.get("button1").vw.setLeft((int)((50d / 100 * width) - (views.get("button1").vw.getWidth() / 2)));
//BA.debugLineNum = 48;BA.debugLine="Panel15.Width=100%x"[menuorden/General script]
views.get("panel15").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 49;BA.debugLine="Panel15.Height=50%y"[menuorden/General script]
views.get("panel15").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 50;BA.debugLine="Panel15.HorizontalCenter=50%x"[menuorden/General script]
views.get("panel15").vw.setLeft((int)((50d / 100 * width) - (views.get("panel15").vw.getWidth() / 2)));
//BA.debugLineNum = 52;BA.debugLine="Panel16.Width=100%x"[menuorden/General script]
views.get("panel16").vw.setWidth((int)((100d / 100 * width)));
//BA.debugLineNum = 53;BA.debugLine="Panel16.Height=50%y"[menuorden/General script]
views.get("panel16").vw.setHeight((int)((50d / 100 * height)));
//BA.debugLineNum = 54;BA.debugLine="Panel16.HorizontalCenter=50%x"[menuorden/General script]
views.get("panel16").vw.setLeft((int)((50d / 100 * width) - (views.get("panel16").vw.getWidth() / 2)));

}
}