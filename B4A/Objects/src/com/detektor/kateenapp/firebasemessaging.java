package com.detektor.kateenapp;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ReceiverHelper;
import anywheresoftware.b4a.debug.*;

public class firebasemessaging extends android.content.BroadcastReceiver{
		
    static firebasemessaging mostCurrent;
	public static BA processBA;
    private ReceiverHelper _receiver;
    private static boolean firstTime = true;
    public static Class<?> getObject() {
		return firebasemessaging.class;
	}
	@Override
	public void onReceive(android.content.Context context, android.content.Intent intent) {
        mostCurrent = this;
       
        if (processBA == null) {
           
		    processBA = new anywheresoftware.b4a.ShellBA(context, null, null, anywheresoftware.b4a.BA.SharedProcessBA.ModuleType.RECEIVER, "com.detektor.kateenapp.firebasemessaging");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
        }
         _receiver = new ReceiverHelper(this);
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "com.detektor.kateenapp.firebasemessaging", processBA, _receiver, anywheresoftware.b4a.keywords.Common.Density);
		}
        processBA.setActivityPaused(false);
        BA.LogInfo("*** Receiver (firebasemessaging) Receive " + (firstTime ? "(first time)" : "") + " ***");
        anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
        iw.setObject(intent);
        processBA.raiseEvent(null, "receiver_receive", firstTime, iw);
        firstTime = false;
    }
	

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper _fm = null;
public b4a.example.dateutils _dateutils = null;
public com.detektor.kateenapp.main _main = null;
public com.detektor.kateenapp.starter _starter = null;
public com.detektor.kateenapp.b4xpages _b4xpages = null;
public com.detektor.kateenapp.b4xcollections _b4xcollections = null;
public com.detektor.kateenapp.httputils2service _httputils2service = null;
public com.detektor.kateenapp.xuiviewsutils _xuiviewsutils = null;
public static String  _fm_messagearrived(anywheresoftware.b4a.objects.FirebaseNotificationsService.RemoteMessageWrapper _message) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "fm_messagearrived", false))
	 {return ((String) Debug.delegate(processBA, "fm_messagearrived", new Object[] {_message}));}
anywheresoftware.b4a.objects.NotificationWrapper _n2 = null;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub fm_MessageArrived (Message As RemoteMessage)";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Log(\"Message arrived\")";
anywheresoftware.b4a.keywords.Common.LogImpl("28454145","Message arrived",0);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="Log($\"Message data: ${Message.GetData}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("28454146",("Message data: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_message.GetData().getObject()))+""),0);
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="If B4XPages.IsInitialized And B4XPages.GetManager";
if (mostCurrent._b4xpages._isinitialized /*boolean*/ (processBA) && mostCurrent._b4xpages._getmanager /*com.detektor.kateenapp.b4xpagesmanager*/ (processBA)._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Log(\"App is in the foreground. In iOS a notifica";
anywheresoftware.b4a.keywords.Common.LogImpl("28454148","App is in the foreground. In iOS a notification will not appear while the app is in the foreground (unless UserNotificationCenter is used).",0);
 };
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Dim n2 As Notification";
_n2 = new anywheresoftware.b4a.objects.NotificationWrapper();
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="n2.Initialize2(n2.IMPORTANCE_HIGH)";
_n2.Initialize2(_n2.IMPORTANCE_HIGH);
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="n2.Icon = \"icon\"";
_n2.setIcon("icon");
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="n2.SetInfo(Message.GetData.Get(\"title\"), Message.";
_n2.SetInfoNew(processBA,BA.ObjectToCharSequence(_message.GetData().Get((Object)("title"))),BA.ObjectToCharSequence(_message.GetData().Get((Object)("body"))),(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="n2.Notify(1)";
_n2.Notify((int) (1));
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="End Sub";
return "";
}
public static String  _fm_tokenrefresh(String _token) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "fm_tokenrefresh", false))
	 {return ((String) Debug.delegate(processBA, "fm_tokenrefresh", new Object[] {_token}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub fm_TokenRefresh (Token As String)";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Log(\"TokenRefresh: \" & Token)";
anywheresoftware.b4a.keywords.Common.LogImpl("28519681","TokenRefresh: "+_token,0);
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public static String  _receiver_receive(boolean _firsttime,anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "receiver_receive", false))
	 {return ((String) Debug.delegate(processBA, "receiver_receive", new Object[] {_firsttime,_startingintent}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="fm.Initialize(\"fm\")";
_fm.Initialize(processBA,"fm");
 };
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="fm.HandleIntent(StartingIntent)";
_fm.HandleIntent((android.content.Intent)(_startingintent.getObject()));
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="End Sub";
return "";
}
public static String  _subscribetotopics(Object[] _topics) throws Exception{
RDebugUtils.currentModule="firebasemessaging";
if (Debug.shouldDelegate(processBA, "subscribetotopics", false))
	 {return ((String) Debug.delegate(processBA, "subscribetotopics", new Object[] {_topics}));}
String _topic = "";
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub SubscribeToTopics (Topics() As Object)";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="For Each topic As String In Topics";
{
final Object[] group1 = _topics;
final int groupLen1 = group1.length
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_topic = BA.ObjectToString(group1[index1]);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="fm.SubscribeToTopic(topic)";
_fm.SubscribeToTopic(_topic);
 }
};
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="End Sub";
return "";
}
}