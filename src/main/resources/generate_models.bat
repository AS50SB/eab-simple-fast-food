@echo off
chcp 65001 >nul
setlocal enabledelayedexpansion

echo ========================================
echo   食物模型文件生成器  
echo   模组ID: eab_fast_food
echo ========================================
echo.

REM 设置模组ID（根据你的实际情况修改）
set MOD_ID=eab_fast_food  
REM 设置模型文件存放路径（相对于此bat文件的路径）
set MODEL_PATH=assets\%MOD_ID%\models\item

REM 检查并创建目录
if not exist "%MODEL_PATH%" (
    echo 创建目录: %MODEL_PATH%
    mkdir "%MODEL_PATH%"
)

echo 正在生成模型文件...
echo.

REM ===== 汉堡类 =====
call :create_model "beef_burger"
call :create_model "pork_burger"
call :create_model "mutton_burger"
call :create_model "chicken_burger"
call :create_model "beef_cheese_burger"
call :create_model "pork_cheese_burger"
call :create_model "mutton_cheese_burger"
call :create_model "chicken_cheese_burger"
call :create_model "salmon_burger"
call :create_model "cod_burger"
call :create_model "salmon_cheese_burger"
call :create_model "cod_cheese_burger"
call :create_model "mixin_burger"

REM ===== 普通食物类 =====
call :create_model "scrambled_egg"
call :create_model "fried_scrambled_egg"
call :create_model "cheese"
call :create_model "chicken_nugget"
call :create_model "cooked_chicken_nugget"
call :create_model "raw_fries"
call :create_model "fries"

echo.
echo ========================================
echo   所有模型文件生成完毕！
echo   位置: %MODEL_PATH%
echo ========================================
pause
exit /b

REM ===== 创建模型的子程序 =====
:create_model
set ITEM_NAME=%~1
set FILE_PATH=%MODEL_PATH%\%ITEM_NAME%.json

REM 检查文件是否已存在
if exist "%FILE_PATH%" (
    echo [跳过] %ITEM_NAME%.json - 文件已存在
    exit /b
)

REM 生成模型文件
(
echo {
echo     "parent": "item/generated",
echo     "textures": {
echo         "layer0": "%MOD_ID%:item/%ITEM_NAME%"
echo     }
echo }
) > "%FILE_PATH%"

echo [生成] %ITEM_NAME%.json
exit /b