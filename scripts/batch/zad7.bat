@echo off

set /p "x=Podaj nazwe miesiaca: "

if /I %x%==styczen echo 1
if /I %x%==luty echo 2
if /I %x%==marzec echo 3
if /I %x%==kwiecien echo 4
if /I %x%==maj echo 5
if /I %x%==czerwiec echo 6
if /I %x%==lipiec echo 7
if /I %x%==sierpien echo 8
if /I %x%==wrzesien echo 9
if /I %x%==październik echo 10
if /I %x%==listopad echo 11
if /I %x%==grudzien echo 12

echo on