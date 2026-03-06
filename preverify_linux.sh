#!/bin/bash
PREVERIFIER_EXE="C:/WTK2.5.2_01/bin/preverify.exe"

PROJECT_ROOT="/mnt/01DC4DD213371480/Github/Sonic-2-N95-Decomp"
LIBS="$PROJECT_ROOT/libs"

# RUTA PARA GRADLE (Donde realmente están tus .class)
CLASSES_DIR="$PROJECT_ROOT/build/classes/java/main"

# Traducción manual a rutas de Wine
WIN_CP="Z:$(echo $LIBS/cldcapi11.jar | sed 's/\//\\/g');Z:$(echo $LIBS/midpapi20.jar | sed 's/\//\\/g');Z:$(echo $CLASSES_DIR | sed 's/\//\\/g')"
WIN_OUT="Z:$(echo $CLASSES_DIR | sed 's/\//\\/g')"

echo "--- Iniciando Preverificación (Modo Gradle) ---"

if [ -d "$CLASSES_DIR" ]; then
    cd "$CLASSES_DIR" || exit 1
    
    # Preverificamos el directorio actual (.)
    wine "$PREVERIFIER_EXE" -classpath "$WIN_CP" -d "$WIN_OUT" .
    
    if [ $? -eq 0 ]; then
        echo "--- ÉXITO: Clases preverificadas en build/ ---"
    else
        echo "--- ERROR: El preverificador falló ---"
        exit 1
    fi
else
    echo "ERROR: No se encontró la carpeta: $CLASSES_DIR"
    echo "Prueba a ejecutar la tarea 'classes' de Gradle en IntelliJ primero."
    exit 1
fi
