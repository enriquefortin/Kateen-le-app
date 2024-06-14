B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lst As List 
	Private Button1 As B4XView
	Private B4XComboBox1 As B4XComboBox
	Private listacombo As List
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root1.LoadLayout("MainPage")
	Log("desde el menu principal")
	listacombo.Initialize
    listacombo.AddAll(Array As String ("No","Si"))
	B4XComboBox1.SetItems(listacombo)
	' Contraseña a encriptar
	Dim password As String = "mi_contraseña_secreta"
	' Cifrar la contraseña
	Dim su As StringUtils
	Dim Encoded64 As String
	Private s As String = password
	Dim su As StringUtils
	Encoded64 = su.EncodeBase64(s.GetBytes("utf8"))
	
	' Descifrar la contraseña
	Dim su As StringUtils
	Dim b() As Byte = su.DecodeBase64(Encoded64)
	

     
	' Mostrar resultados
	Log("Contraseña original: " & password)
	Log("Contraseña cifrada: " & Encoded64)
	Log(BytesToString(b, 0, b.Length, "utf8"))
	
End Sub


Sub CreateRequest As DBRequestManager
	Dim req As DBRequestManager
	req.Initialize(Me, Main.rdcLink)
	Return req
End Sub
Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmdc As DBCommand
	cmdc.Initialize
	cmdc.Name = Name
	If Parameters <> Null Then cmdc.Parameters = Parameters
	Return cmdc
End Sub


Private Sub Button1_Click
	lst.Initialize
	Dim req As DBRequestManager =  CreateRequest
	Dim cmdc As DBCommand = CreateCommand("consultaweb", Null)
	Wait For (req.ExecuteQuery(cmdc, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_result(res As DBResult)
		
		req.PrintTable(res)
'		If res.Rows.Size > 0 Then
'			For Each row() As Object In res.Rows
'				lst.AddAll(row)
		'
'			Next
'		End If
		
'		For i = 0 To lst.Size - 1
'			Log("Elemento " & i & ": " & lst.Get(i))
'		Next

	End If
	j.Release
End Sub
'Private Sub Button1_Click
'	lst.Initialize
'	Dim req As DBRequestManager =  CreateRequest
'	Dim cmdc As DBCommand = CreateCommand("Primeros5", Null)
'	Wait For (req.ExecuteBatch(Array(cmdc), Null)) JobDone(j As HttpJob)
'	If j.Success Then
'		req.HandleJobAsync(j, "req")
'		Wait For (req) req_result(res As DBResult)
'		
'		req.PrintTable(res)
''		If res.Rows.Size > 0 Then
''			For Each row() As Object In res.Rows
''				lst.AddAll(row)
''
''			Next
''		End If
'		
''		For i = 0 To lst.Size - 1
''			Log("Elemento " & i & ": " & lst.Get(i))
''		Next
'
'	End If
'	j.Release
'End Sub



