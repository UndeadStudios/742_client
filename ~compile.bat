@echo off
title Client compiler
echo Compiling..
"C:\Program Files\Java\jdk1.7.0_25\bin\javac.exe" -d bin -cp libs/clientlibs.jar; -sourcepath src src/*.java
pause

