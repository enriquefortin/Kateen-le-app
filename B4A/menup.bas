B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Public CLVS1 As CustomListView
	Private lblhora As B4XView
	Private imgpproducto As B4XView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root1.LoadLayout("menup")
	
Dim p As B4XView = xui.CreatePanel("")
'If GetDeviceLayoutValues.ApproximateScreenSize < 4.5 Then height = 210dip '310dip
p.SetLayoutAnimated(100, 0,0, 100%x, 115dip)
p.LoadLayout("ordenes")
Dim b As B4XBitmap=LoadBitmapResize(File.DirAssets, "gpssat.png", 52dip, 52dip, True)
imgpproducto.SetBitmap(b)
'Get_Image(row(11),imgpproducto)
lblhora.Text="8:00AM-9:00AM"
CLVS1.Add(p,0)

Dim p As B4XView= xui.CreatePanel("")
p.SetLayoutAnimated(100,0,0,100%x,115dip)
p.LoadLayout("ordenes")
	Dim b As B4XBitmap=LoadBitmapResize(File.DirAssets, "radiogps.png", 52dip, 52dip, True)
					imgpproducto.SetBitmap(b)
	lblhora.Text="10:00AM-11:00AM"
	CLVS1.Add(p,1)
	
	
	Dim p As B4XView= xui.CreatePanel("")
	
	p.SetLayoutAnimated(100,0,0,100%x,115dip)
	p.LoadLayout("ordenes")
	Dim b As B4XBitmap=LoadBitmapResize(File.DirAssets, "sergpsradio.png", 52dip, 52dip, True)
	imgpproducto.SetBitmap(b)
	lblhora.Text="11:30AM-1:30PM"
	CLVS1.Add(p,2)
	
	Dim p As B4XView= xui.CreatePanel("")
	
	p.SetLayoutAnimated(100,0,0,100%x,115dip)
	p.LoadLayout("ordenes")
	Dim b As B4XBitmap=LoadBitmapResize(File.DirAssets, "servariagpsrad.png", 52dip, 52dip, True)
	imgpproducto.SetBitmap(b)
	lblhora.Text="3:00PM-5:00PM"
	CLVS1.Add(p,3)
	
	Dim p As B4XView= xui.CreatePanel("")
	
	p.SetLayoutAnimated(100,0,0,100%x,115dip)
	p.LoadLayout("ordenes")
	Dim b As B4XBitmap=LoadBitmapResize(File.DirAssets, "servicio.png", 52dip, 52dip, True)
	imgpproducto.SetBitmap(b)
	lblhora.Text="5:30PM - ..."
	CLVS1.Add(p,4)
	

End Sub




'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

'Sub Get_Image(strImage As String,imgd1 As ImageView)
'	Try
'		Dim j As HttpJob
'		j.Initialize("", Me)
'		j.Download("http://localhost/img/"& strImage)
'		Wait For (j) JobDone (j As HttpJob)
'		If j.Success Then
'			Try
'				Wait For (ImageLoader.LoadFromHttpJob(j, imgd1.Width, imgd1.Height)) Complete (bmp As B4XBitmap)
'				MakeRoundedImages(imgd1,bmp.Crop(0,0,bmp.Width,imgd1.Height))
'
'			Catch
'				Log(LastException)
'			End Try
'		End If
'		j.Release
'	Catch
'		
'		Log(LastException)
'	End Try
'	
' 
'End Sub
'
'Sub CreateRoundRectBitmap (Input As B4XBitmap, Radius As Float,realwidth As Int,realhight As Int) As B4XBitmap
'	Input.Resize(realwidth,realhight,True)
'	Dim BorderColor As Int = xui.Color_Transparent
'	Dim BorderWidth As Int = 0
'	Dim c As B4XCanvas
'	Dim xview As B4XView = xui.CreatePanel("")
'	xview.SetLayoutAnimated(0, 0, 0, realwidth,realhight)
'	c.Initialize(xview)
'	Dim path As B4XPath
'	path.InitializeRoundedRect(c.TargetRect, Radius)
'	c.ClipPath(path)
'	c.DrawRect(c.TargetRect, BorderColor, True, BorderWidth) 'border
'	c.RemoveClip
'	Dim r As B4XRect
'	r.Initialize(BorderWidth, BorderWidth, c.TargetRect.Width - BorderWidth, c.TargetRect.Height - BorderWidth)
'	path.InitializeRoundedRect(r, Radius - 0.7 * BorderWidth)
'	c.ClipPath(path)
'	c.DrawBitmap(Input, r)
'	c.RemoveClip
'	c.Invalidate
'	Dim res As B4XBitmap = c.CreateBitmap
'	c.Release
'	Return res
'	
'End Sub
'Sub MakeRoundedImages(iv As ImageView,bmp As Bitmap)
'	Try
'		Dim xIV As B4XView = iv
'		xIV.SetBitmap(CreateRoundRectBitmap(bmp, 3%x,iv.Width,iv.Height))
'		
'	Catch
'		Log(LastException)
'	End Try
'End Sub


Private Sub CLVS1_ItemClick (Index As Int, Value As Object)
	If Index=4 Then
		Log("en el index 5")
		B4XPages.ShowPageAndRemovePreviousPages("menuorden")
	End If
	
	
End Sub