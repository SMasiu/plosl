@echo off

set /p "x=Podaj tekst: "

set y=
set num=0
:LOOP
call set tmpa=%%x:~%num%,1%%%
set /a num+=1
if defined tmpa (
    set y=%tmpa%%y%
    goto :LOOP
)

echo %y%

echo on