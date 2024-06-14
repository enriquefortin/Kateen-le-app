B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.85
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Public rp As RuntimePermissions
	Public GPS1 As GPS
	Private gpsStarted As Boolean
	Private context As JavaObject
	Private nmea As JavaObject
	Private phone As Phone
	Private LocationManager As JavaObject
End Sub

Sub Service_Create
	GPS1.Initialize("GPS")
	context.InitializeContext
	Dim LocationManager As JavaObject = context.RunMethod("getSystemService", Array("location"))

End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

Public Sub StartGps
	If gpsStarted = False Then
		GPS1.Start(0, 0)
		gpsStarted = True
		If phone.SdkVersion >= 24 Then
			nmea.InitializeNewInstance(Application.PackageName & ".starter$MyNmeaMessageListener", Null)
			LocationManager.RunMethod("addNmeaListener", Array(nmea))
		End If
	End If
End Sub

Private Sub NMEA_Event (Message As String, Timestamp As Long)
	Log($"$Time{Timestamp}: ${Message.Trim}"$)
End Sub

Public Sub StopGps
	If gpsStarted Then
		GPS1.Stop
		gpsStarted = False
		If phone.SdkVersion >= 24 Then
			LocationManager.RunMethod("removeNmeaListener", Array(nmea))
		End If
	End If
End Sub

Sub GPS_NMEA (TimeStamp As Long, Sentence As String)
	If phone.SdkVersion >= 24 Then Return
	Log("GPS_NMEA: " & Sentence)
End Sub

Sub GPS_LocationChanged (Location1 As Location)
	CallSub2(Main, "LocationChanged", Location1)
End Sub


Sub GPS_GpsStatus (Satellites As List)
	CallSub2(Main, "GpsStatus", Satellites)
End Sub

Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	StopGps
End Sub

#if Java
public static class MyNmeaMessageListener implements android.location.OnNmeaMessageListener
{
	public void onNmeaMessage(String message, long timestamp) {
		processBA.raiseEventFromDifferentThread(null, null, 0, "nmea_event", false, new Object[] {message, timestamp});
	}
	
}
#End If