package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,25);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);}
Debug.locals.put("Args", _args);
 BA.debugLineNum = 25;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Send(\"ios_general\", \"Nueva notificacíon\", \"Tiene";
Debug.ShouldStop(33554432);
_send(BA.ObjectToString("ios_general"),BA.ObjectToString("Nueva notificacíon"),RemoteObject.createImmutable("Tiene una nueva orden de servicio"));
 BA.debugLineNum = 27;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(67108864);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettokenvalue(RemoteObject _filepath) throws Exception{
try {
		Debug.PushSubsStack("GetTokenValue (main) ","main",0,main.ba,main.mostCurrent,68);
if (RapidSub.canDelegate("gettokenvalue")) { return b4j.example.main.remoteMe.runUserSub(false, "main","gettokenvalue", _filepath);}
RemoteObject _googlecredentials = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _credentials = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("FilePath", _filepath);
 BA.debugLineNum = 68;BA.debugLine="Private Sub GetTokenValue (FilePath As String) As";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="Dim GoogleCredentials As JavaObject";
Debug.ShouldStop(16);
_googlecredentials = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("GoogleCredentials", _googlecredentials);
 BA.debugLineNum = 70;BA.debugLine="GoogleCredentials.InitializeStatic(\"com.google.au";
Debug.ShouldStop(32);
_googlecredentials.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.google.auth.oauth2.GoogleCredentials")));
 BA.debugLineNum = 71;BA.debugLine="Dim Credentials As JavaObject = GoogleCredentials";
Debug.ShouldStop(64);
_credentials = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_credentials = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _googlecredentials.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("fromStream")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_filepath),(Object)(RemoteObject.createImmutable(""))).getObject())}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createScoped")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("https://www.googleapis.com/auth/firebase.messaging")}))}))));Debug.locals.put("Credentials", _credentials);Debug.locals.put("Credentials", _credentials);
 BA.debugLineNum = 73;BA.debugLine="Credentials.RunMethod(\"refreshIfExpired\", Null)";
Debug.ShouldStop(256);
_credentials.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("refreshIfExpired")),(Object)((main.__c.getField(false,"Null"))));
 BA.debugLineNum = 74;BA.debugLine="Return Credentials.RunMethodJO(\"getAccessToken\",";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString(_credentials.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getAccessToken")),(Object)((main.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTokenValue")),(Object)((main.__c.getField(false,"Null")))));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
httputils2service.myClass = BA.getDeviceClass ("b4j.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4j.example.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private Const ProjectId As String = \"kateen-le-ap";
main._projectid = BA.ObjectToString("kateen-le-app");
 //BA.debugLineNum = 21;BA.debugLine="Private ServiceAccountFilePath As String = \"C:\\Us";
main._serviceaccountfilepath = BA.ObjectToString("C:\\Users\\enrique.fortin\\Downloads\\kateen-le-app-firebase-adminsdk-dnsu1-7cf40274fb.json");
 //BA.debugLineNum = 22;BA.debugLine="Private Token As String";
main._token = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _send(RemoteObject _topic,RemoteObject _title,RemoteObject _body) throws Exception{
try {
		Debug.PushSubsStack("Send (main) ","main",0,main.ba,main.mostCurrent,30);
if (RapidSub.canDelegate("send")) { b4j.example.main.remoteMe.runUserSub(false, "main","send", _topic, _title, _body); return;}
ResumableSub_Send rsub = new ResumableSub_Send(null,_topic,_title,_body);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Send extends BA.ResumableSub {
public ResumableSub_Send(b4j.example.main parent,RemoteObject _topic,RemoteObject _title,RemoteObject _body) {
this.parent = parent;
this._topic = _topic;
this._title = _title;
this._body = _body;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _topic;
RemoteObject _title;
RemoteObject _body;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Send (main) ","main",0,main.ba,main.mostCurrent,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("topic", _topic);
Debug.locals.put("title", _title);
Debug.locals.put("body", _body);
 BA.debugLineNum = 31;BA.debugLine="Dim Token As String = GetTokenValue(ServiceAccoun";
Debug.ShouldStop(1073741824);
parent._token = _gettokenvalue(parent._serviceaccountfilepath);
 BA.debugLineNum = 32;BA.debugLine="Wait For (SendMessage(topic, title, body)) Comple";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "send"), _sendmessage(_topic,_title,_body));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 33;BA.debugLine="Wait For (SendMessage(\"ios_\" & topic, title, body";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "send"), _sendmessage(RemoteObject.concat(RemoteObject.createImmutable("ios_"),_topic),_title,_body));
this.state = 2;
return;
case 2:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 34;BA.debugLine="ExitApplication";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject _success) throws Exception{
}
public static RemoteObject  _sendmessage(RemoteObject _topic,RemoteObject _title,RemoteObject _body) throws Exception{
try {
		Debug.PushSubsStack("SendMessage (main) ","main",0,main.ba,main.mostCurrent,37);
if (RapidSub.canDelegate("sendmessage")) { return b4j.example.main.remoteMe.runUserSub(false, "main","sendmessage", _topic, _title, _body);}
ResumableSub_SendMessage rsub = new ResumableSub_SendMessage(null,_topic,_title,_body);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SendMessage extends BA.ResumableSub {
public ResumableSub_SendMessage(b4j.example.main parent,RemoteObject _topic,RemoteObject _title,RemoteObject _body) {
this.parent = parent;
this._topic = _topic;
this._title = _title;
this._body = _body;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _topic;
RemoteObject _title;
RemoteObject _body;
RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _message = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _badge = RemoteObject.createImmutable(0);
RemoteObject _iosalert = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jg = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendMessage (main) ","main",0,main.ba,main.mostCurrent,37);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("Topic", _topic);
Debug.locals.put("Title", _title);
Debug.locals.put("Body", _body);
 BA.debugLineNum = 38;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(32);
_job = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 39;BA.debugLine="Job.Initialize(\"\", Me)";
Debug.ShouldStop(64);
_job.runClassMethod (b4j.example.httpjob.class, "_initialize" /*RemoteObject*/ ,main.ba,(Object)(BA.ObjectToString("")),(Object)(main.getObject()));
 BA.debugLineNum = 40;BA.debugLine="Dim data As Map = CreateMap(\"title\": Title, \"body";
Debug.ShouldStop(128);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(_title),RemoteObject.createImmutable(("body")),(_body)}));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 41;BA.debugLine="Dim message As Map = CreateMap(\"topic\": Topic, \"d";
Debug.ShouldStop(256);
_message = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_message = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("topic")),(_topic),RemoteObject.createImmutable(("data")),(_data.getObject())}));Debug.locals.put("message", _message);Debug.locals.put("message", _message);
 BA.debugLineNum = 42;BA.debugLine="If Topic.StartsWith(\"ios_\") Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (_topic.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ios_"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 44;BA.debugLine="Dim Badge As Int = 0";
Debug.ShouldStop(2048);
_badge = BA.numberCast(int.class, 0);Debug.locals.put("Badge", _badge);Debug.locals.put("Badge", _badge);
 BA.debugLineNum = 45;BA.debugLine="Dim iosalert As Map =  CreateMap(\"title\": Title,";
Debug.ShouldStop(4096);
_iosalert = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_iosalert = parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(_title),RemoteObject.createImmutable(("body")),(_body)}));Debug.locals.put("iosalert", _iosalert);Debug.locals.put("iosalert", _iosalert);
 BA.debugLineNum = 46;BA.debugLine="message.Put(\"notification\", iosalert)";
Debug.ShouldStop(8192);
_message.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("notification"))),(Object)((_iosalert.getObject())));
 BA.debugLineNum = 47;BA.debugLine="message.Put(\"apns\", CreateMap(\"headers\": _ 			Cr";
Debug.ShouldStop(16384);
_message.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("apns"))),(Object)((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("headers")),(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("apns-priority")),(RemoteObject.createImmutable("10"))})).getObject()),RemoteObject.createImmutable(("payload")),(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("aps")),(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("sound")),RemoteObject.createImmutable(("default")),RemoteObject.createImmutable(("badge")),(_badge)})).getObject())})).getObject())})).getObject())));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 52;BA.debugLine="message.Put(\"android\", CreateMap(\"priority\": \"hi";
Debug.ShouldStop(524288);
_message.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("android"))),(Object)((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("priority")),(RemoteObject.createImmutable("high"))})).getObject())));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 54;BA.debugLine="Dim jg As JSONGenerator";
Debug.ShouldStop(2097152);
_jg = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("jg", _jg);
 BA.debugLineNum = 55;BA.debugLine="jg.Initialize(CreateMap(\"message\": message))";
Debug.ShouldStop(4194304);
_jg.runVoidMethod ("Initialize",(Object)(parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("message")),(_message.getObject())}))));
 BA.debugLineNum = 56;BA.debugLine="Log(jg.ToPrettyString(4))";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","3196627",_jg.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 4))),0);
 BA.debugLineNum = 57;BA.debugLine="Job.PostString($\"https://fcm.googleapis.com/v1/pr";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://fcm.googleapis.com/v1/projects/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._projectid))),RemoteObject.createImmutable("/messages:send")))),(Object)(_jg.runMethod(true,"ToString")));
 BA.debugLineNum = 58;BA.debugLine="Job.GetRequest.SetContentType(\"application/json;c";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json;charset=UTF-8")));
 BA.debugLineNum = 59;BA.debugLine="Job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4j.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent._token)));
 BA.debugLineNum = 60;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "sendmessage"), (_job));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 61;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 10;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 62;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","3196633",_job.runClassMethod (b4j.example.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 64;BA.debugLine="Job.Release";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (b4j.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 65;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject _job) throws Exception{
}
}