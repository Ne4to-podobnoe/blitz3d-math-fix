; FUNCTIONS FIX ;
; by Ne4to ;
; This functions slower than usual functions, but accurate. ;
Function Bin$(number%) ;32 bit max number
	Local returnstring$, retmod
	While number > 0
		retmod = number Mod 2
		number = number / 2
		returnstring = returnstring + Str(retmod)
	Wend
	Return ReverseString(returnstring)
End Function
Function Oct(number%) ; 295600127 max number for Octal
	Local returnstring$, retmod
	While number > 0
		retmod = number Mod 8
		number = number / 8
		returnstring = returnstring + Str(retmod)
	Wend
	Return ReverseString(returnstring)
End Function
Function BinToDec(s$)
	Local returnint
    For i = 0 to Len(s)-1
       if Mid(s,i+1,1) = "1" Then
			Local int2 = Len(s)-1-i
			returnint = returnint + 2^int2
       EndIf
    Next
    Return returnint
End Function
Function OctToDec(in)
	Local returnint, retmod
	While in > 0
		retmod = in Mod 10
		in = in / 10
		returnint = returnint + retmod * 8^i
		i = i + 1
	Wend
	Return returnint
End Function
Function ReverseString$(s$)
	Local returnstring$
	For i = 0 To Len(s)-1
		returnstring = returnstring + Mid(s,Len(s)-i,1)
	Next
	Return returnstring
End Function