@echo off
pushd %~dp0
call .\usage-one %* && ^
.\dpp %1 CPL_8a270edd-4f9d-4681-b15c-adcf0c7d5cf7.xml "%~2\Chimera23" ..\chimera23\metadata.xml "chimera23-default" %3