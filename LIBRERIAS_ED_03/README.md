#Librerias 2

En este ejemplo vamos a importar las librerias que hemos hecho en el proyecto "LIBRERIAS_ED_02".

Para importar librerias en java podemos hacer los siguientes pasos.

1. Crear un proyecto y crear la carpeta "lib" en la raiz.
2. Copiar el ".jar" que queramos en la carpeta lib.
3. Debemos modificar el "classpath" del proyecto java para que se puedan usar las clases que estan 
en el fichero ".jar". El classpath es fundamental en todos los proyectos java. Es un fichero dodne decios al proyecto
donde tiene que ir a buscar los ".class" para que puedan ser usados.
4. Modificamos el "classpath", para ello, boton derecho sobre el proyecto y elegimos "build path" -> "configure build path"
5. Vamos a la pestaña "libreries" y pulsamos "classpath", se nos deberia habilitar el boton de "add JARs"
6. Una vez habilitado el boton, lo pulsamos y buscamos el fichero ".jar" que queremos añadir a nuestro proyecto. Pulsamos
"OK" y luego "Apply and close"
7. Ya deberiamos poder usar las librerias en nuestro proyecto, podemos crear una clase "main" e importar las clases para poder usarlas.