package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _projectid = "";
public static String _serviceaccountfilepath = "";
public static String _token = "";
public static b4j.example.httputils2service _httputils2service = null;
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="Send(\"ios_general\", \"Nueva notificacíon\", \"Tiene";
_send("ios_general","Nueva notificacíon","Tiene una nueva orden de servicio");
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="End Sub";
return "";
}
public static void  _send(String _topic,String _title,String _body) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "send", false))
	 {Debug.delegate(ba, "send", new Object[] {_topic,_title,_body}); return;}
ResumableSub_Send rsub = new ResumableSub_Send(null,_topic,_title,_body);
rsub.resume(ba, null);
}
public static class ResumableSub_Send extends BA.ResumableSub {
public ResumableSub_Send(b4j.example.main parent,String _topic,String _title,String _body) {
this.parent = parent;
this._topic = _topic;
this._title = _title;
this._body = _body;
}
b4j.example.main parent;
String _topic;
String _title;
String _body;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim Token As String = GetTokenValue(ServiceAccoun";
parent._token = _gettokenvalue(parent._serviceaccountfilepath);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Wait For (SendMessage(topic, title, body)) Comple";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "send"), _sendmessage(_topic,_title,_body));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[0];
;
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Wait For (SendMessage(\"ios_\" & topic, title, body";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "send"), _sendmessage("ios_"+_topic,_title,_body));
this.state = 2;
return;
case 2:
//C
this.state = -1;
_success = (boolean) result[0];
;
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _gettokenvalue(String _filepath) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "gettokenvalue", false))
	 {return ((String) Debug.delegate(ba, "gettokenvalue", new Object[] {_filepath}));}
anywheresoftware.b4j.object.JavaObject _googlecredentials = null;
anywheresoftware.b4j.object.JavaObject _credentials = null;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub GetTokenValue (FilePath As String) As";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Dim GoogleCredentials As JavaObject";
_googlecredentials = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="GoogleCredentials.InitializeStatic(\"com.google.au";
_googlecredentials.InitializeStatic("com.google.auth.oauth2.GoogleCredentials");
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Dim Credentials As JavaObject = GoogleCredentials";
_credentials = new anywheresoftware.b4j.object.JavaObject();
_credentials = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_googlecredentials.RunMethodJO("fromStream",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.File.OpenInput(_filepath,"").getObject())}).RunMethod("createScoped",new Object[]{(Object)(new String[]{"https://www.googleapis.com/auth/firebase.messaging"})})));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Credentials.RunMethod(\"refreshIfExpired\", Null)";
_credentials.RunMethod("refreshIfExpired",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Return Credentials.RunMethodJO(\"getAccessToken\",";
if (true) return BA.ObjectToString(_credentials.RunMethodJO("getAccessToken",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("getTokenValue",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendmessage(String _topic,String _title,String _body) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "sendmessage", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "sendmessage", new Object[] {_topic,_title,_body}));}
ResumableSub_SendMessage rsub = new ResumableSub_SendMessage(null,_topic,_title,_body);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendMessage extends BA.ResumableSub {
public ResumableSub_SendMessage(b4j.example.main parent,String _topic,String _title,String _body) {
this.parent = parent;
this._topic = _topic;
this._title = _title;
this._body = _body;
}
b4j.example.main parent;
String _topic;
String _title;
String _body;
b4j.example.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.Map _message = null;
int _badge = 0;
anywheresoftware.b4a.objects.collections.Map _iosalert = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim Job As HttpJob";
_job = new b4j.example.httpjob();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",main.getObject());
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim data As Map = CreateMap(\"title\": Title, \"body";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)(_title),(Object)("body"),(Object)(_body)});
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Dim message As Map = CreateMap(\"topic\": Topic, \"d";
_message = new anywheresoftware.b4a.objects.collections.Map();
_message = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("topic"),(Object)(_topic),(Object)("data"),(Object)(_data.getObject())});
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="If Topic.StartsWith(\"ios_\") Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_topic.startsWith("ios_")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="Dim Badge As Int = 0";
_badge = (int) (0);
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="Dim iosalert As Map =  CreateMap(\"title\": Title,";
_iosalert = new anywheresoftware.b4a.objects.collections.Map();
_iosalert = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)(_title),(Object)("body"),(Object)(_body)});
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="message.Put(\"notification\", iosalert)";
_message.Put((Object)("notification"),(Object)(_iosalert.getObject()));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="message.Put(\"apns\", CreateMap(\"headers\": _ 			Cr";
_message.Put((Object)("apns"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("headers"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("apns-priority"),(Object)("10")}).getObject()),(Object)("payload"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("aps"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("sound"),(Object)("default"),(Object)("badge"),(Object)(_badge)}).getObject())}).getObject())}).getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="message.Put(\"android\", CreateMap(\"priority\": \"hi";
_message.Put((Object)("android"),(Object)(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("priority"),(Object)("high")}).getObject()));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="jg.Initialize(CreateMap(\"message\": message))";
_jg.Initialize(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("message"),(Object)(_message.getObject())}));
RDebugUtils.currentLine=196627;
 //BA.debugLineNum = 196627;BA.debugLine="Log(jg.ToPrettyString(4))";
anywheresoftware.b4a.keywords.Common.LogImpl("3196627",_jg.ToPrettyString((int) (4)),0);
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="Job.PostString($\"https://fcm.googleapis.com/v1/pr";
_job._poststring /*String*/ (null,("https://fcm.googleapis.com/v1/projects/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._projectid))+"/messages:send"),_jg.ToString());
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="Job.GetRequest.SetContentType(\"application/json;c";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json;charset=UTF-8");
RDebugUtils.currentLine=196630;
 //BA.debugLineNum = 196630;BA.debugLine="Job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+parent._token);
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "sendmessage"), (Object)(_job));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_job = (b4j.example.httpjob) result[0];
;
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="If Job.Success Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_job._success /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("3196633",_job._getstring /*String*/ (null),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=196636;
 //BA.debugLineNum = 196636;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}