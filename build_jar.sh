#!/bin/bash
PROJECT_ROOT="/mnt/01DC4DD213371480/Github/Sonic-2-N95-Decomp"
CLASSES="$PROJECT_ROOT/build/classes/java/main"
RESOURCES="$PROJECT_ROOT/src/main/resources"
DIST="$PROJECT_ROOT/dist"
# El archivo que creaste manualmente
TEMP_MANIFEST="$PROJECT_ROOT/META-INF/MANIFEST.MF" 

echo "--- Empaquetando para Hardware Real (N95) ---"

# 1. Crear área de ensamblaje limpia
STAGING="$PROJECT_ROOT/build/staging"
rm -rf "$STAGING"
mkdir -p "$STAGING/META-INF"
mkdir -p "$DIST"

# 2. Copiar Clases (ya preverificadas) y Recursos
cp -r "$CLASSES"/* "$STAGING/"
if [ -d "$RESOURCES" ]; then
    cp -r "$RESOURCES"/* "$STAGING/"
fi

# 3. Copiar el Manifiesto manual al lugar correcto
cp "$TEMP_MANIFEST" "$STAGING/META-INF/MANIFEST.MF"

# 4. Asegurar línea final en el Manifest (Vital para Symbian S60)
sed -i '$a\\' "$STAGING/META-INF/MANIFEST.MF"

# 5. Generar el JAR final
cd "$STAGING"
# c=create, m=manifest, f=file, 0=sin compresión (mejor para móviles viejos)
jar cvf0m "$DIST/Sonic2C3.jar" "META-INF/MANIFEST.MF" .

echo "--- ÉXITO: JAR generado en $DIST/Sonic2C3.jar ---"
