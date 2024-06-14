package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_revi2{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("pnlmenu").vw.setTop((int)((2d / 100 * height)));
views.get("pnlacc").vw.setTop((int)((views.get("pnlmenu").vw.getTop() + views.get("pnlmenu").vw.getHeight())+(2d / 100 * height)));
views.get("pnlacc").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlacc").vw.getWidth() / 2)));
views.get("lblacc").vw.setTop((int)(0d));
views.get("lblacc").vw.setLeft((int)(((views.get("pnlacc").vw.getWidth()))*0.05d));
views.get("btncontinuarrevi2").vw.setLeft((int)((50d / 100 * width) - (views.get("btncontinuarrevi2").vw.getWidth() / 2)));
views.get("lblbocina").vw.setLeft((int)((views.get("pnlacc").vw.getWidth())/2d - (views.get("lblbocina").vw.getWidth() / 2)));
views.get("lblbocina").vw.setTop((int)((views.get("lblacc").vw.getTop() + views.get("lblacc").vw.getHeight())));
views.get("chkbocina").vw.setLeft((int)((views.get("lblbocina").vw.getLeft() + views.get("lblbocina").vw.getWidth())));
views.get("chkbocina").vw.setTop((int)((views.get("lblbocina").vw.getTop())));
views.get("lblencendedor").vw.setLeft((int)((views.get("lblbocina").vw.getLeft())));
views.get("chkencendedor").vw.setLeft((int)((views.get("lblencendedor").vw.getLeft() + views.get("lblencendedor").vw.getWidth())));
views.get("lblencendedor").vw.setTop((int)((views.get("lblbocina").vw.getTop() + views.get("lblbocina").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblradio").vw.setTop((int)((views.get("lblencendedor").vw.getTop() + views.get("lblencendedor").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblaire").vw.setTop((int)((views.get("lblradio").vw.getTop() + views.get("lblradio").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblcopas").vw.setTop((int)((views.get("lblaire").vw.getTop() + views.get("lblaire").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lbltapiceria").vw.setTop((int)((views.get("lblcopas").vw.getTop() + views.get("lblcopas").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblalarma").vw.setTop((int)((views.get("lbltapiceria").vw.getTop() + views.get("lbltapiceria").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblventanilla").vw.setTop((int)((views.get("lblalarma").vw.getTop() + views.get("lblalarma").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblemblema").vw.setTop((int)((views.get("lblventanilla").vw.getTop() + views.get("lblventanilla").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblmanecilla").vw.setTop((int)((views.get("lblemblema").vw.getTop() + views.get("lblemblema").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("lblpilotos").vw.setTop((int)((views.get("lblmanecilla").vw.getTop() + views.get("lblmanecilla").vw.getHeight())+(views.get("pnlacc").vw.getHeight())*0.01d));
views.get("chkencendedor").vw.setTop((int)((views.get("lblencendedor").vw.getTop())));
views.get("pnlacc").vw.setHeight((int)((40d / 100 * height)));
views.get("chkradio").vw.setTop((int)((views.get("lblradio").vw.getTop())));
views.get("chkaire").vw.setTop((int)((views.get("lblaire").vw.getTop())));
views.get("lblradio").vw.setLeft((int)((views.get("lblencendedor").vw.getLeft())));
views.get("lblaire").vw.setLeft((int)((views.get("lblradio").vw.getLeft())));
views.get("lblcopas").vw.setLeft((int)((views.get("lblaire").vw.getLeft())));
views.get("lbltapiceria").vw.setLeft((int)((views.get("lblcopas").vw.getLeft())));
views.get("lblalarma").vw.setLeft((int)((views.get("lbltapiceria").vw.getLeft())));
views.get("lblventanilla").vw.setLeft((int)((views.get("lblalarma").vw.getLeft())));
views.get("lblemblema").vw.setLeft((int)((views.get("lblventanilla").vw.getLeft())));
views.get("lblmanecilla").vw.setLeft((int)((views.get("lblemblema").vw.getLeft())));
views.get("lblpilotos").vw.setLeft((int)((views.get("lblmanecilla").vw.getLeft())));
views.get("chkradio").vw.setLeft((int)((views.get("lblradio").vw.getLeft() + views.get("lblradio").vw.getWidth())));
views.get("chkradio").vw.setTop((int)((views.get("lblradio").vw.getTop())));
views.get("chkaire").vw.setLeft((int)((views.get("lblaire").vw.getLeft() + views.get("lblaire").vw.getWidth())));
views.get("chkaire").vw.setTop((int)((views.get("lblaire").vw.getTop())));
views.get("chkcopas").vw.setLeft((int)((views.get("lblcopas").vw.getLeft() + views.get("lblcopas").vw.getWidth())));
views.get("chkcopas").vw.setTop((int)((views.get("lblcopas").vw.getTop())));
views.get("chktapiceria").vw.setLeft((int)((views.get("lbltapiceria").vw.getLeft() + views.get("lbltapiceria").vw.getWidth())));
views.get("chktapiceria").vw.setTop((int)((views.get("lbltapiceria").vw.getTop())));
views.get("chkalarma").vw.setLeft((int)((views.get("lblalarma").vw.getLeft() + views.get("lblalarma").vw.getWidth())));
views.get("chkalarma").vw.setTop((int)((views.get("lblalarma").vw.getTop())));
views.get("chkventanilla").vw.setLeft((int)((views.get("lblventanilla").vw.getLeft() + views.get("lblventanilla").vw.getWidth())));
views.get("chkventanilla").vw.setTop((int)((views.get("lblventanilla").vw.getTop())));
views.get("chkemblema").vw.setLeft((int)((views.get("lblemblema").vw.getLeft() + views.get("lblemblema").vw.getWidth())));
views.get("chkemblema").vw.setTop((int)((views.get("lblemblema").vw.getTop())));
views.get("chkmanecilla").vw.setLeft((int)((views.get("lblmanecilla").vw.getLeft() + views.get("lblmanecilla").vw.getWidth())));
views.get("chkmanecilla").vw.setTop((int)((views.get("lblmanecilla").vw.getTop())));
views.get("chkpilotos").vw.setLeft((int)((views.get("lblpilotos").vw.getLeft() + views.get("lblpilotos").vw.getWidth())));
views.get("chkpilotos").vw.setTop((int)((views.get("lblpilotos").vw.getTop())));
views.get("label1").vw.setTop((int)((views.get("pnlacc").vw.getTop() + views.get("pnlacc").vw.getHeight())));
views.get("label1").vw.setLeft((int)((50d / 100 * width) - (views.get("label1").vw.getWidth() / 2)));
views.get("pnlkm").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
views.get("label2").vw.setTop((int)((views.get("pnlkm").vw.getTop() + views.get("pnlkm").vw.getHeight())));
views.get("label2").vw.setLeft((int)((50d / 100 * width) - (views.get("label2").vw.getWidth() / 2)));
views.get("pnlkm").vw.setWidth((int)((views.get("pnlacc").vw.getWidth())));
views.get("editkm").vw.setWidth((int)((views.get("pnlkm").vw.getWidth())));
views.get("pnlkm").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlkm").vw.getWidth() / 2)));
views.get("editkm").vw.setLeft((int)((views.get("pnlkm").vw.getWidth())/2d - (views.get("editkm").vw.getWidth() / 2)));
views.get("pnlcombustible").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("edtcombustible").vw.setLeft((int)((views.get("pnlcombustible").vw.getWidth())/2d - (views.get("edtcombustible").vw.getWidth() / 2)));
views.get("pnlcombustible").vw.setLeft((int)((50d / 100 * width) - (views.get("pnlcombustible").vw.getWidth() / 2)));
views.get("b4xseekbar1").vw.setTop((int)((views.get("pnlcombustible").vw.getTop() + views.get("pnlcombustible").vw.getHeight())));
views.get("b4xseekbar1").vw.setLeft((int)((50d / 100 * width) - (views.get("b4xseekbar1").vw.getWidth() / 2)));
views.get("pnlacc2").vw.setHeight((int)((15d / 100 * height)));
views.get("btncontinuarrevi2").vw.setTop((int)((views.get("pnlacc2").vw.getTop() + views.get("pnlacc2").vw.getHeight())+(2d / 100 * height)));
views.get("label3").vw.setTop((int)(0d));
views.get("lblretrointerno").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("chkinterno").vw.setLeft((int)((views.get("lblretrointerno").vw.getLeft() + views.get("lblretrointerno").vw.getWidth())));
views.get("chkinterno").vw.setTop((int)((views.get("lblretrointerno").vw.getTop())));
views.get("label10").vw.setLeft((int)((views.get("chkinterno").vw.getLeft())));
views.get("label10").vw.setTop((int)((views.get("chkinterno").vw.getTop() + views.get("chkinterno").vw.getHeight())));
views.get("label11").vw.setTop((int)((views.get("label10").vw.getTop())));
views.get("label11").vw.setLeft((int)((views.get("label10").vw.getLeft() + views.get("label10").vw.getWidth())));
views.get("lblespejosinternos").vw.setTop((int)((views.get("label10").vw.getTop() + views.get("label10").vw.getHeight())));
views.get("lblespejosinternos").vw.setLeft((int)((views.get("lblretrointerno").vw.getLeft())));
views.get("chkexterno1").vw.setTop((int)((views.get("lblespejosinternos").vw.getTop())));
views.get("chkexterno1").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("chkexterno2").vw.setTop((int)((views.get("lblespejosinternos").vw.getTop())));
views.get("chkexterno2").vw.setLeft((int)((views.get("chkexterno1").vw.getLeft() + views.get("chkexterno1").vw.getWidth())));

}
}