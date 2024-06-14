package com.detektor.kateenapp;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class firebasemessaging_subs_0 {


public static RemoteObject  _fm_messagearrived(RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("fm_MessageArrived (firebasemessaging) ","firebasemessaging",9,firebasemessaging.processBA,firebasemessaging.mostCurrent,18);
if (RapidSub.canDelegate("fm_messagearrived")) { return com.detektor.kateenapp.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","fm_messagearrived", _message);}
RemoteObject _n2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
Debug.locals.put("Message", _message);
 BA.debugLineNum = 18;BA.debugLine="Sub fm_MessageArrived (Message As RemoteMessage)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Log(\"Message arrived\")";
Debug.ShouldStop(262144);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","28454145",RemoteObject.createImmutable("Message arrived"),0);
 BA.debugLineNum = 20;BA.debugLine="Log($\"Message data: ${Message.GetData}\"$)";
Debug.ShouldStop(524288);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","28454146",(RemoteObject.concat(RemoteObject.createImmutable("Message data: "),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_message.runMethod(false,"GetData").getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 21;BA.debugLine="If B4XPages.IsInitialized And B4XPages.GetManager";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",firebasemessaging.mostCurrent._b4xpages.runMethod(true,"_isinitialized" /*RemoteObject*/ ,firebasemessaging.processBA)) && RemoteObject.solveBoolean(".",firebasemessaging.mostCurrent._b4xpages.runMethod(false,"_getmanager" /*RemoteObject*/ ,firebasemessaging.processBA).getField(true,"_isforeground" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 22;BA.debugLine="Log(\"App is in the foreground. In iOS a notifica";
Debug.ShouldStop(2097152);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","28454148",RemoteObject.createImmutable("App is in the foreground. In iOS a notification will not appear while the app is in the foreground (unless UserNotificationCenter is used)."),0);
 };
 BA.debugLineNum = 24;BA.debugLine="Dim n2 As Notification";
Debug.ShouldStop(8388608);
_n2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");Debug.locals.put("n2", _n2);
 BA.debugLineNum = 25;BA.debugLine="n2.Initialize2(n2.IMPORTANCE_HIGH)";
Debug.ShouldStop(16777216);
_n2.runVoidMethod ("Initialize2",(Object)(_n2.getField(true,"IMPORTANCE_HIGH")));
 BA.debugLineNum = 26;BA.debugLine="n2.Icon = \"icon\"";
Debug.ShouldStop(33554432);
_n2.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 27;BA.debugLine="n2.SetInfo(Message.GetData.Get(\"title\"), Message.";
Debug.ShouldStop(67108864);
_n2.runVoidMethod ("SetInfoNew",firebasemessaging.processBA,(Object)(BA.ObjectToCharSequence(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)(BA.ObjectToCharSequence(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))))),(Object)((firebasemessaging.mostCurrent._main.getObject())));
 BA.debugLineNum = 28;BA.debugLine="n2.Notify(1)";
Debug.ShouldStop(134217728);
_n2.runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fm_tokenrefresh(RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("fm_TokenRefresh (firebasemessaging) ","firebasemessaging",9,firebasemessaging.processBA,firebasemessaging.mostCurrent,31);
if (RapidSub.canDelegate("fm_tokenrefresh")) { return com.detektor.kateenapp.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","fm_tokenrefresh", _token);}
Debug.locals.put("Token", _token);
 BA.debugLineNum = 31;BA.debugLine="Sub fm_TokenRefresh (Token As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Log(\"TokenRefresh: \" & Token)";
Debug.ShouldStop(-2147483648);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","28519681",RemoteObject.concat(RemoteObject.createImmutable("TokenRefresh: "),_token),0);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fm As FirebaseMessaging";
firebasemessaging._fm = RemoteObject.createNew ("anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper");
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _receiver_receive(RemoteObject _firsttime,RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Receiver_Receive (firebasemessaging) ","firebasemessaging",9,firebasemessaging.processBA,firebasemessaging.mostCurrent,5);
if (RapidSub.canDelegate("receiver_receive")) { return com.detektor.kateenapp.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","receiver_receive", _firsttime, _startingintent);}
Debug.locals.put("FirstTime", _firsttime);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 5;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 6;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(32);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 7;BA.debugLine="fm.Initialize(\"fm\")";
Debug.ShouldStop(64);
firebasemessaging._fm.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("fm")));
 };
 BA.debugLineNum = 9;BA.debugLine="fm.HandleIntent(StartingIntent)";
Debug.ShouldStop(256);
firebasemessaging._fm.runVoidMethod ("HandleIntent",(Object)((_startingintent.getObject())));
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _subscribetotopics(RemoteObject _topics) throws Exception{
try {
		Debug.PushSubsStack("SubscribeToTopics (firebasemessaging) ","firebasemessaging",9,firebasemessaging.processBA,firebasemessaging.mostCurrent,12);
if (RapidSub.canDelegate("subscribetotopics")) { return com.detektor.kateenapp.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","subscribetotopics", _topics);}
RemoteObject _topic = RemoteObject.createImmutable("");
Debug.locals.put("Topics", _topics);
 BA.debugLineNum = 12;BA.debugLine="Public Sub SubscribeToTopics (Topics() As Object)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="For Each topic As String In Topics";
Debug.ShouldStop(4096);
{
final RemoteObject group1 = _topics;
final int groupLen1 = group1.getField(true,"length").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_topic = BA.ObjectToString(group1.getArrayElement(false,RemoteObject.createImmutable(index1)));Debug.locals.put("topic", _topic);
Debug.locals.put("topic", _topic);
 BA.debugLineNum = 14;BA.debugLine="fm.SubscribeToTopic(topic)";
Debug.ShouldStop(8192);
firebasemessaging._fm.runVoidMethod ("SubscribeToTopic",(Object)(_topic));
 }
}Debug.locals.put("topic", _topic);
;
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}