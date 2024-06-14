B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	Dim p, g, a, b, k, m, c1, c2 As Int
	Dim privateKey, publicKey As Map
	
	' Inicializa el formulario y demás configuraciones aquí
	' Genera claves pública y privada
	privateKey = ElGamal_GeneratePrivateKey
	publicKey = ElGamal_GeneratePublicKey(privateKey)
    
	' Mensaje a cifrar
	m = 123
    
	' Cifrado ElGamal
	Dim ciphertext As Map = ElGamal_Encrypt(publicKey, m)
	c1 = ciphertext.Get("c1")
	c2 = ciphertext.Get("c2")
    
	' Descifrado ElGamal
	Dim decryptedMsg As Int = ElGamal_Decrypt(privateKey, c1, c2)
    
	' Muestra los resultados en el Log
	Log("Mensaje original: " & m)
	Log("Mensaje cifrado (c1): " & c1)
	Log("Mensaje cifrado (c2): " & c2)
	Log("Mensaje descifrado: " & decryptedMsg)
End Sub

Sub ElGamal_GeneratePrivateKey As Map
	' Genera una clave privada aleatoria para ElGamal
	Dim privateKey As Map
	privateKey.Initialize
	Dim p, g, a As Int
	' Genera valores aleatorios para p, g y a dentro de rangos adecuados
	p = Rnd(10, 100) ' Modulo
	g = Rnd(2, 10)    ' Generador
	a = Rnd(2, 20)    ' Clave privada
	privateKey.Initialize
	privateKey.Put("p", p)
	privateKey.Put("g", g)
	privateKey.Put("a", a)
	Return privateKey
End Sub



Sub ElGamal_GeneratePublicKey(privateKey As Map) As Map
	' Genera una clave pública a partir de una clave privada para ElGamal
	Dim publicKey As Map
	publicKey.Initialize
	Dim p, g, a As Int
	p = privateKey.Get("p")
	g = privateKey.Get("g")
	a = privateKey.Get("a")
	publicKey.Put("p", p)
	publicKey.Put("g", g)
	publicKey.Put("y", ModPower(g, a, p)) ' Clave pública
	Return publicKey
End Sub

Sub ElGamal_Encrypt(publicKey As Map, m As Int) As Map
	' Cifra un mensaje utilizando ElGamal
	Dim p, g, y As Int
	p = publicKey.Get("p")
	g = publicKey.Get("g")
	y = publicKey.Get("y")
    
	Dim k, c1, c2 As Int
	k = Rnd(1, p - 1) ' Número aleatorio entre 1 y p-1
	c1 = ModPower(g, k, p)
	c2 = (m * ModPower(y, k, p)) Mod p
    
	Dim ciphertext As Map
	ciphertext.Initialize
	ciphertext.Put("c1", c1)
	ciphertext.Put("c2", c2)
    
	Return ciphertext
End Sub

Sub ElGamal_Decrypt(privateKey As Map, c1 As Int, c2 As Int) As Int
	' Descifra un mensaje cifrado con ElGamal
	Dim p, a As Int
	p = privateKey.Get("p")
	a = privateKey.Get("a")
    
	Dim s As Int
	s = ModPower(c1, a, p)
	Dim decryptedMsg As Int
	decryptedMsg = (c2 * ModInverse(s, p)) Mod p
    
	Return decryptedMsg
End Sub

Sub ModPower(base As Int, exponent As Int, modulus As Int) As Int
    ' Calcula la potencia modular de base elevado a exponente módulo modulus
    Dim result As Long
    result = 1
    For i = 0 To exponent - 1
        result = (result * base) Mod modulus
    Next
    Return result
End Sub

Sub ModInverse(a As Int, m As Int) As Int
    ' Encuentra el inverso modular de a módulo m utilizando el algoritmo extendido de Euclides
    Dim m0, y, x, q, t As Int
    m0 = m
    x = 0
    y = 1
    If m = 1 Then
        Return 0
    End If
    Do While a > 1
        ' q es el cociente
        q = a / m
        t = m
        ' m es el divisor, y se actualiza
        m = a Mod m
        a = t
        t = x
        ' x se actualiza
        x = y - q * x
        y = t
    Loop
    ' Hacer y positivo
    If y < 0 Then
        y = y + m0
    End If
    Return y
End Sub