; BIN FUNCTION FIX ;
; by Ne4to ;
; This binary function slower than usual function, but accurate. ;
Function Bin$(number%, calc = 2)
	Local returnstring$, retmod
	While number > 0
		retmod = number Mod calc
		number = number / calc
		returnstring = returnstring + Str(retmod)
	Wend
	Return ReverseString(returnstring)
End Function
Function BinToDec(s$) ;string because the % won't fit
	Local returnint
    For i = 0 to Len(s)-1
       if Mid(s,i+1,1) = "1" Then
			Local int2 = Len(s)-1-i
			returnint = returnint + 2^int2
       EndIf
    Next
    return returnint+1
End Function
Function ReverseString$(s$)
	Local returnstring$
	For i = 0 To Len(s)-1
		returnstring = returnstring + Mid(s,Len(s)-i,1)
	Next
	Return returnstring
End Function