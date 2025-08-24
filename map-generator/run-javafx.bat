@echo off
REM Set JavaFX module path - adjust this path to where your JavaFX is installed
set JAVAFX_PATH=C:\Users\karki\.m2\repository\org\openjfx

REM Compile the Java files
echo Compiling Java files...
javac -cp "%JAVAFX_PATH%\javafx-controls\21.0.2\javafx-controls-21.0.2.jar;%JAVAFX_PATH%\javafx-fxml\21.0.2\javafx-fxml-21.0.2.jar;%JAVAFX_PATH%\javafx-base\21.0.2\javafx-base-21.0.2.jar;%JAVAFX_PATH%\javafx-graphics\21.0.2\javafx-graphics-21.0.2.jar" -d target\classes src\main\java\jkk\application\*.java src\main\java\jkk\controller\*.java src\main\java\jkk\view\*.java

REM Copy resources
echo Copying resources...
if not exist "target\classes" mkdir "target\classes"
copy "src\main\resources\*.fxml" "target\classes\" >nul 2>&1

REM Run the application
echo Running JavaFX application...
java --module-path "%JAVAFX_PATH%\javafx-controls\21.0.2;%JAVAFX_PATH%\javafx-fxml\21.0.2;%JAVAFX_PATH%\javafx-base\21.0.2;%JAVAFX_PATH%\javafx-graphics\21.0.2" --add-modules javafx.controls,javafx.fxml -cp target\classes jkk.view.Game

pause