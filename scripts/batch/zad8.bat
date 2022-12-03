@echo off

echo 1. Uruchom
echo 2. Backup
echo 3. Informacje
echo 4. Koniec

set /p "x=Podaj opcje: "

if /I %x%==1 call zad1.bat
if /I %x%==2 copy src\* dist
if /I %x%==3 echo Szymon Masko

@echo on