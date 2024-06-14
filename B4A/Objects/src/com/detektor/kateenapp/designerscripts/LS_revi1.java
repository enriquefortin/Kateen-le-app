package com.detektor.kateenapp.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_revi1{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("pnlmenu").vw.setTop((int)((2d / 100 * height)));
views.get("label1").vw.setLeft((int)((views.get("panel1").vw.getLeft())+((views.get("panel1").vw.getWidth()))*0.05d));
views.get("label1").vw.setTop((int)((views.get("pnlmenu").vw.getTop() + views.get("pnlmenu").vw.getHeight())));
views.get("label2").vw.setLeft((int)((views.get("panel1").vw.getLeft())+((views.get("panel1").vw.getWidth()))*0.05d));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
views.get("label3").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
views.get("label4").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
views.get("label4").vw.setLeft((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth()) - (views.get("label4").vw.getWidth())));
views.get("label3").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d));
views.get("panel1").vw.setWidth((int)((90d / 100 * width)));
views.get("panel1").vw.setLeft((int)((50d / 100 * width) - (views.get("panel1").vw.getWidth() / 2)));
views.get("panel1").vw.setHeight((int)((35d / 100 * height)));
views.get("panel1").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(2d / 100 * height)));
views.get("panel2").vw.setWidth((int)((90d / 100 * width)));
views.get("panel2").vw.setLeft((int)((50d / 100 * width) - (views.get("panel2").vw.getWidth() / 2)));
views.get("panel2").vw.setHeight((int)((39d / 100 * height)));
views.get("btnrevi1").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("btnrevi1").vw.setLeft((int)((50d / 100 * width) - (views.get("btnrevi1").vw.getWidth() / 2)));
views.get("label5").vw.setLeft((int)(((views.get("panel1").vw.getWidth()))*0.05d));
views.get("label5").vw.setTop((int)(((views.get("panel1").vw.getWidth()))*0.10d));
views.get("label6").vw.setTop((int)(((views.get("panel1").vw.getWidth()))*0.25d));
views.get("label6").vw.setLeft((int)((views.get("label5").vw.getLeft())));
views.get("label7").vw.setLeft((int)((views.get("label5").vw.getLeft())));
views.get("label8").vw.setLeft((int)((views.get("label5").vw.getLeft())));
views.get("label9").vw.setLeft((int)((views.get("label5").vw.getLeft())));
views.get("label7").vw.setTop((int)(((views.get("panel1").vw.getWidth()))*0.40d));
views.get("label8").vw.setTop((int)(((views.get("panel1").vw.getWidth()))*0.55d));
views.get("label9").vw.setTop((int)(((views.get("panel1").vw.getWidth()))*0.70d));
views.get("label10").vw.setTop((int)(0d));
views.get("label11").vw.setTop((int)(0d));
views.get("label12").vw.setTop((int)(0d));
views.get("label13").vw.setTop((int)(0d));
views.get("label10").vw.setLeft((int)((views.get("panel1").vw.getWidth())/2d-((views.get("label10").vw.getWidth())/2d)));
views.get("label11").vw.setLeft((int)((views.get("label10").vw.getLeft() + views.get("label10").vw.getWidth())));
views.get("label13").vw.setLeft((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth())-(views.get("label13").vw.getWidth())/2d - (views.get("label13").vw.getWidth())));
views.get("label12").vw.setLeft((int)((views.get("label13").vw.getLeft()) - (views.get("label12").vw.getWidth())));
views.get("checkbox1").vw.setLeft((int)((views.get("label10").vw.getLeft() + views.get("label10").vw.getWidth()/2) - (views.get("checkbox1").vw.getWidth() / 2)));
views.get("checkbox2").vw.setLeft((int)((views.get("label11").vw.getLeft() + views.get("label11").vw.getWidth()/2) - (views.get("checkbox2").vw.getWidth() / 2)));
views.get("checkbox3").vw.setLeft((int)((views.get("label12").vw.getLeft() + views.get("label12").vw.getWidth()/2) - (views.get("checkbox3").vw.getWidth() / 2)));
views.get("checkbox4").vw.setLeft((int)((views.get("label13").vw.getLeft() + views.get("label13").vw.getWidth()/2) - (views.get("checkbox4").vw.getWidth() / 2)));
views.get("checkbox1").vw.setTop((int)((views.get("label5").vw.getTop())));
views.get("checkbox2").vw.setTop((int)((views.get("label5").vw.getTop())));
views.get("checkbox3").vw.setTop((int)((views.get("label5").vw.getTop())));
views.get("checkbox4").vw.setTop((int)((views.get("label5").vw.getTop())));
views.get("checkbox5").vw.setLeft((int)((views.get("label10").vw.getLeft() + views.get("label10").vw.getWidth()/2) - (views.get("checkbox5").vw.getWidth() / 2)));
//BA.debugLineNum = 56;BA.debugLine="CheckBox6.HorizontalCenter=Label11.HorizontalCenter"[revi1/General script]
views.get("checkbox6").vw.setLeft((int)((views.get("label11").vw.getLeft() + views.get("label11").vw.getWidth()/2) - (views.get("checkbox6").vw.getWidth() / 2)));
//BA.debugLineNum = 57;BA.debugLine="CheckBox7.HorizontalCenter=Label12.HorizontalCenter"[revi1/General script]
views.get("checkbox7").vw.setLeft((int)((views.get("label12").vw.getLeft() + views.get("label12").vw.getWidth()/2) - (views.get("checkbox7").vw.getWidth() / 2)));
//BA.debugLineNum = 58;BA.debugLine="CheckBox8.HorizontalCenter=Label13.HorizontalCenter"[revi1/General script]
views.get("checkbox8").vw.setLeft((int)((views.get("label13").vw.getLeft() + views.get("label13").vw.getWidth()/2) - (views.get("checkbox8").vw.getWidth() / 2)));
//BA.debugLineNum = 60;BA.debugLine="CheckBox5.Top=Label6.Top"[revi1/General script]
views.get("checkbox5").vw.setTop((int)((views.get("label6").vw.getTop())));
//BA.debugLineNum = 61;BA.debugLine="CheckBox6.Top=Label6.Top"[revi1/General script]
views.get("checkbox6").vw.setTop((int)((views.get("label6").vw.getTop())));
//BA.debugLineNum = 62;BA.debugLine="CheckBox7.Top=Label6.Top"[revi1/General script]
views.get("checkbox7").vw.setTop((int)((views.get("label6").vw.getTop())));
//BA.debugLineNum = 63;BA.debugLine="CheckBox8.top=Label6.Top"[revi1/General script]
views.get("checkbox8").vw.setTop((int)((views.get("label6").vw.getTop())));
//BA.debugLineNum = 65;BA.debugLine="CheckBox9.HorizontalCenter=Label10.HorizontalCenter"[revi1/General script]
views.get("checkbox9").vw.setLeft((int)((views.get("label10").vw.getLeft() + views.get("label10").vw.getWidth()/2) - (views.get("checkbox9").vw.getWidth() / 2)));
//BA.debugLineNum = 66;BA.debugLine="CheckBox10.HorizontalCenter=Label11.HorizontalCenter"[revi1/General script]
views.get("checkbox10").vw.setLeft((int)((views.get("label11").vw.getLeft() + views.get("label11").vw.getWidth()/2) - (views.get("checkbox10").vw.getWidth() / 2)));
//BA.debugLineNum = 67;BA.debugLine="CheckBox11.HorizontalCenter=Label12.HorizontalCenter"[revi1/General script]
views.get("checkbox11").vw.setLeft((int)((views.get("label12").vw.getLeft() + views.get("label12").vw.getWidth()/2) - (views.get("checkbox11").vw.getWidth() / 2)));
//BA.debugLineNum = 68;BA.debugLine="CheckBox12.HorizontalCenter=Label13.HorizontalCenter"[revi1/General script]
views.get("checkbox12").vw.setLeft((int)((views.get("label13").vw.getLeft() + views.get("label13").vw.getWidth()/2) - (views.get("checkbox12").vw.getWidth() / 2)));
//BA.debugLineNum = 70;BA.debugLine="CheckBox9.Top=Label7.Top"[revi1/General script]
views.get("checkbox9").vw.setTop((int)((views.get("label7").vw.getTop())));
//BA.debugLineNum = 71;BA.debugLine="CheckBox10.Top=Label7.Top"[revi1/General script]
views.get("checkbox10").vw.setTop((int)((views.get("label7").vw.getTop())));
//BA.debugLineNum = 72;BA.debugLine="CheckBox11.Top=Label7.Top"[revi1/General script]
views.get("checkbox11").vw.setTop((int)((views.get("label7").vw.getTop())));
//BA.debugLineNum = 73;BA.debugLine="CheckBox12.top=Label7.Top"[revi1/General script]
views.get("checkbox12").vw.setTop((int)((views.get("label7").vw.getTop())));
//BA.debugLineNum = 75;BA.debugLine="CheckBox13.HorizontalCenter=Label10.HorizontalCenter"[revi1/General script]
views.get("checkbox13").vw.setLeft((int)((views.get("label10").vw.getLeft() + views.get("label10").vw.getWidth()/2) - (views.get("checkbox13").vw.getWidth() / 2)));
//BA.debugLineNum = 76;BA.debugLine="CheckBox14.HorizontalCenter=Label11.HorizontalCenter"[revi1/General script]
views.get("checkbox14").vw.setLeft((int)((views.get("label11").vw.getLeft() + views.get("label11").vw.getWidth()/2) - (views.get("checkbox14").vw.getWidth() / 2)));
//BA.debugLineNum = 77;BA.debugLine="CheckBox15.HorizontalCenter=Label12.HorizontalCenter"[revi1/General script]
views.get("checkbox15").vw.setLeft((int)((views.get("label12").vw.getLeft() + views.get("label12").vw.getWidth()/2) - (views.get("checkbox15").vw.getWidth() / 2)));
//BA.debugLineNum = 78;BA.debugLine="CheckBox16.HorizontalCenter=Label13.HorizontalCenter"[revi1/General script]
views.get("checkbox16").vw.setLeft((int)((views.get("label13").vw.getLeft() + views.get("label13").vw.getWidth()/2) - (views.get("checkbox16").vw.getWidth() / 2)));
//BA.debugLineNum = 80;BA.debugLine="CheckBox13.Top=Label8.Top"[revi1/General script]
views.get("checkbox13").vw.setTop((int)((views.get("label8").vw.getTop())));
//BA.debugLineNum = 81;BA.debugLine="CheckBox14.Top=Label8.Top"[revi1/General script]
views.get("checkbox14").vw.setTop((int)((views.get("label8").vw.getTop())));
//BA.debugLineNum = 82;BA.debugLine="CheckBox15.Top=Label8.Top"[revi1/General script]
views.get("checkbox15").vw.setTop((int)((views.get("label8").vw.getTop())));
//BA.debugLineNum = 83;BA.debugLine="CheckBox16.top=Label8.Top"[revi1/General script]
views.get("checkbox16").vw.setTop((int)((views.get("label8").vw.getTop())));
//BA.debugLineNum = 85;BA.debugLine="CheckBox17.HorizontalCenter=Label10.HorizontalCenter"[revi1/General script]
views.get("checkbox17").vw.setLeft((int)((views.get("label10").vw.getLeft() + views.get("label10").vw.getWidth()/2) - (views.get("checkbox17").vw.getWidth() / 2)));
//BA.debugLineNum = 86;BA.debugLine="CheckBox18.HorizontalCenter=Label11.HorizontalCenter"[revi1/General script]
views.get("checkbox18").vw.setLeft((int)((views.get("label11").vw.getLeft() + views.get("label11").vw.getWidth()/2) - (views.get("checkbox18").vw.getWidth() / 2)));
//BA.debugLineNum = 87;BA.debugLine="CheckBox19.HorizontalCenter=Label12.HorizontalCenter"[revi1/General script]
views.get("checkbox19").vw.setLeft((int)((views.get("label12").vw.getLeft() + views.get("label12").vw.getWidth()/2) - (views.get("checkbox19").vw.getWidth() / 2)));
//BA.debugLineNum = 88;BA.debugLine="CheckBox20.HorizontalCenter=Label13.HorizontalCenter"[revi1/General script]
views.get("checkbox20").vw.setLeft((int)((views.get("label13").vw.getLeft() + views.get("label13").vw.getWidth()/2) - (views.get("checkbox20").vw.getWidth() / 2)));
//BA.debugLineNum = 90;BA.debugLine="CheckBox17.Top=Label9.Top"[revi1/General script]
views.get("checkbox17").vw.setTop((int)((views.get("label9").vw.getTop())));
//BA.debugLineNum = 91;BA.debugLine="CheckBox18.Top=Label9.Top"[revi1/General script]
views.get("checkbox18").vw.setTop((int)((views.get("label9").vw.getTop())));
//BA.debugLineNum = 92;BA.debugLine="CheckBox19.Top=Label9.Top"[revi1/General script]
views.get("checkbox19").vw.setTop((int)((views.get("label9").vw.getTop())));
//BA.debugLineNum = 93;BA.debugLine="CheckBox20.top=Label9.Top"[revi1/General script]
views.get("checkbox20").vw.setTop((int)((views.get("label9").vw.getTop())));
//BA.debugLineNum = 95;BA.debugLine="Label14.Top=0"[revi1/General script]
views.get("label14").vw.setTop((int)(0d));
//BA.debugLineNum = 96;BA.debugLine="Label14.Left=(Panel2.Width)*0.05"[revi1/General script]
views.get("label14").vw.setLeft((int)(((views.get("panel2").vw.getWidth()))*0.05d));
//BA.debugLineNum = 97;BA.debugLine="Label15.HorizontalCenter=Panel2.Width/2-Label15.Width/4"[revi1/General script]
views.get("label15").vw.setLeft((int)((views.get("panel2").vw.getWidth())/2d-(views.get("label15").vw.getWidth())/4d - (views.get("label15").vw.getWidth() / 2)));
//BA.debugLineNum = 98;BA.debugLine="Label15.Top=Label14.Bottom"[revi1/General script]
views.get("label15").vw.setTop((int)((views.get("label14").vw.getTop() + views.get("label14").vw.getHeight())));
//BA.debugLineNum = 99;BA.debugLine="Label16.Left=Label15.Left"[revi1/General script]
views.get("label16").vw.setLeft((int)((views.get("label15").vw.getLeft())));
//BA.debugLineNum = 100;BA.debugLine="Label17.Left=Label15.Left"[revi1/General script]
views.get("label17").vw.setLeft((int)((views.get("label15").vw.getLeft())));
//BA.debugLineNum = 101;BA.debugLine="Label18.Left=Label15.Left"[revi1/General script]
views.get("label18").vw.setLeft((int)((views.get("label15").vw.getLeft())));
//BA.debugLineNum = 102;BA.debugLine="Label19.Left=Label15.Left"[revi1/General script]
views.get("label19").vw.setLeft((int)((views.get("label15").vw.getLeft())));
//BA.debugLineNum = 103;BA.debugLine="Label20.Left=Label15.Left"[revi1/General script]
views.get("label20").vw.setLeft((int)((views.get("label15").vw.getLeft())));
//BA.debugLineNum = 104;BA.debugLine="Label21.Left=Label15.Left"[revi1/General script]
views.get("label21").vw.setLeft((int)((views.get("label15").vw.getLeft())));
//BA.debugLineNum = 105;BA.debugLine="Label22.Left=Label15.Left"[revi1/General script]
views.get("label22").vw.setLeft((int)((views.get("label15").vw.getLeft())));
//BA.debugLineNum = 106;BA.debugLine="Label16.Top=Label15.Bottom+Panel2.Height*0.05"[revi1/General script]
views.get("label16").vw.setTop((int)((views.get("label15").vw.getTop() + views.get("label15").vw.getHeight())+(views.get("panel2").vw.getHeight())*0.05d));
//BA.debugLineNum = 107;BA.debugLine="Label17.Top=Label16.Bottom+Panel2.Height*0.05"[revi1/General script]
views.get("label17").vw.setTop((int)((views.get("label16").vw.getTop() + views.get("label16").vw.getHeight())+(views.get("panel2").vw.getHeight())*0.05d));
//BA.debugLineNum = 108;BA.debugLine="Label18.Top=Label17.Bottom+Panel2.Height*0.05"[revi1/General script]
views.get("label18").vw.setTop((int)((views.get("label17").vw.getTop() + views.get("label17").vw.getHeight())+(views.get("panel2").vw.getHeight())*0.05d));
//BA.debugLineNum = 109;BA.debugLine="Label19.Top=Label18.Bottom+Panel2.Height*0.05"[revi1/General script]
views.get("label19").vw.setTop((int)((views.get("label18").vw.getTop() + views.get("label18").vw.getHeight())+(views.get("panel2").vw.getHeight())*0.05d));
//BA.debugLineNum = 110;BA.debugLine="Label20.Top=Label19.Bottom+Panel2.Height*0.05"[revi1/General script]
views.get("label20").vw.setTop((int)((views.get("label19").vw.getTop() + views.get("label19").vw.getHeight())+(views.get("panel2").vw.getHeight())*0.05d));
//BA.debugLineNum = 111;BA.debugLine="Label21.Top=Label20.Bottom+Panel2.Height*0.05"[revi1/General script]
views.get("label21").vw.setTop((int)((views.get("label20").vw.getTop() + views.get("label20").vw.getHeight())+(views.get("panel2").vw.getHeight())*0.05d));
//BA.debugLineNum = 112;BA.debugLine="Label22.Top=Label21.Bottom+Panel2.Height*0.05"[revi1/General script]
views.get("label22").vw.setTop((int)((views.get("label21").vw.getTop() + views.get("label21").vw.getHeight())+(views.get("panel2").vw.getHeight())*0.05d));
//BA.debugLineNum = 113;BA.debugLine="CheckBox21.Left=Label15.Right"[revi1/General script]
views.get("checkbox21").vw.setLeft((int)((views.get("label15").vw.getLeft() + views.get("label15").vw.getWidth())));
//BA.debugLineNum = 114;BA.debugLine="CheckBox21.Top=Label15.top"[revi1/General script]
views.get("checkbox21").vw.setTop((int)((views.get("label15").vw.getTop())));
//BA.debugLineNum = 115;BA.debugLine="CheckBox21.VerticalCenter=Label15.VerticalCenter"[revi1/General script]
views.get("checkbox21").vw.setTop((int)((views.get("label15").vw.getTop() + views.get("label15").vw.getHeight()/2) - (views.get("checkbox21").vw.getHeight() / 2)));
//BA.debugLineNum = 117;BA.debugLine="CheckBox22.Left=Label16.Right"[revi1/General script]
views.get("checkbox22").vw.setLeft((int)((views.get("label16").vw.getLeft() + views.get("label16").vw.getWidth())));
//BA.debugLineNum = 118;BA.debugLine="CheckBox22.Top=Label16.top"[revi1/General script]
views.get("checkbox22").vw.setTop((int)((views.get("label16").vw.getTop())));
//BA.debugLineNum = 119;BA.debugLine="CheckBox22.VerticalCenter=Label16.VerticalCenter"[revi1/General script]
views.get("checkbox22").vw.setTop((int)((views.get("label16").vw.getTop() + views.get("label16").vw.getHeight()/2) - (views.get("checkbox22").vw.getHeight() / 2)));
//BA.debugLineNum = 121;BA.debugLine="CheckBox23.Left=Label17.Right"[revi1/General script]
views.get("checkbox23").vw.setLeft((int)((views.get("label17").vw.getLeft() + views.get("label17").vw.getWidth())));
//BA.debugLineNum = 122;BA.debugLine="CheckBox23.Top=Label17.top"[revi1/General script]
views.get("checkbox23").vw.setTop((int)((views.get("label17").vw.getTop())));
//BA.debugLineNum = 123;BA.debugLine="CheckBox23.VerticalCenter=Label17.VerticalCenter"[revi1/General script]
views.get("checkbox23").vw.setTop((int)((views.get("label17").vw.getTop() + views.get("label17").vw.getHeight()/2) - (views.get("checkbox23").vw.getHeight() / 2)));
//BA.debugLineNum = 125;BA.debugLine="CheckBox24.Left=Label18.Right"[revi1/General script]
views.get("checkbox24").vw.setLeft((int)((views.get("label18").vw.getLeft() + views.get("label18").vw.getWidth())));
//BA.debugLineNum = 126;BA.debugLine="CheckBox24.Top=Label18.top"[revi1/General script]
views.get("checkbox24").vw.setTop((int)((views.get("label18").vw.getTop())));
//BA.debugLineNum = 127;BA.debugLine="CheckBox24.VerticalCenter=Label18.VerticalCenter"[revi1/General script]
views.get("checkbox24").vw.setTop((int)((views.get("label18").vw.getTop() + views.get("label18").vw.getHeight()/2) - (views.get("checkbox24").vw.getHeight() / 2)));
//BA.debugLineNum = 129;BA.debugLine="CheckBox25.Left=Label19.Right"[revi1/General script]
views.get("checkbox25").vw.setLeft((int)((views.get("label19").vw.getLeft() + views.get("label19").vw.getWidth())));
//BA.debugLineNum = 130;BA.debugLine="CheckBox25.Top=Label19.top"[revi1/General script]
views.get("checkbox25").vw.setTop((int)((views.get("label19").vw.getTop())));
//BA.debugLineNum = 131;BA.debugLine="CheckBox25.VerticalCenter=Label19.VerticalCenter"[revi1/General script]
views.get("checkbox25").vw.setTop((int)((views.get("label19").vw.getTop() + views.get("label19").vw.getHeight()/2) - (views.get("checkbox25").vw.getHeight() / 2)));
//BA.debugLineNum = 133;BA.debugLine="CheckBox26.Left=Label20.Right"[revi1/General script]
views.get("checkbox26").vw.setLeft((int)((views.get("label20").vw.getLeft() + views.get("label20").vw.getWidth())));
//BA.debugLineNum = 134;BA.debugLine="CheckBox26.Top=Label20.top"[revi1/General script]
views.get("checkbox26").vw.setTop((int)((views.get("label20").vw.getTop())));
//BA.debugLineNum = 135;BA.debugLine="CheckBox26.VerticalCenter=Label20.VerticalCenter"[revi1/General script]
views.get("checkbox26").vw.setTop((int)((views.get("label20").vw.getTop() + views.get("label20").vw.getHeight()/2) - (views.get("checkbox26").vw.getHeight() / 2)));
//BA.debugLineNum = 137;BA.debugLine="CheckBox27.Left=Label21.Right"[revi1/General script]
views.get("checkbox27").vw.setLeft((int)((views.get("label21").vw.getLeft() + views.get("label21").vw.getWidth())));
//BA.debugLineNum = 138;BA.debugLine="CheckBox27.Top=Label21.top"[revi1/General script]
views.get("checkbox27").vw.setTop((int)((views.get("label21").vw.getTop())));
//BA.debugLineNum = 139;BA.debugLine="CheckBox27.VerticalCenter=Label21.VerticalCenter"[revi1/General script]
views.get("checkbox27").vw.setTop((int)((views.get("label21").vw.getTop() + views.get("label21").vw.getHeight()/2) - (views.get("checkbox27").vw.getHeight() / 2)));
//BA.debugLineNum = 141;BA.debugLine="CheckBox28.Left=Label22.Right"[revi1/General script]
views.get("checkbox28").vw.setLeft((int)((views.get("label22").vw.getLeft() + views.get("label22").vw.getWidth())));
//BA.debugLineNum = 142;BA.debugLine="CheckBox28.Top=Label22.top"[revi1/General script]
views.get("checkbox28").vw.setTop((int)((views.get("label22").vw.getTop())));
//BA.debugLineNum = 143;BA.debugLine="CheckBox28.VerticalCenter=Label22.VerticalCenter"[revi1/General script]
views.get("checkbox28").vw.setTop((int)((views.get("label22").vw.getTop() + views.get("label22").vw.getHeight()/2) - (views.get("checkbox28").vw.getHeight() / 2)));

}
}