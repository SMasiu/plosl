@echo off

set /p "x=Podaj x: "
set /p "y=Podaj y: "

set /a "c=%x%+%y%"
echo Suma %c%

set /a "c=%x%-%y%"
echo Roznica %c%

set /a "c=%x%*%y%"
echo Iloczyn %c%

set /a "c=%x%/%y%"
echo Iloraz %c%

echo on