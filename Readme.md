# Proceso compilación JAR y ejecución.

Comando para crear el JAR, debe encontrarse en el rais del proyecto.

```
./mvnw.cmd package
```

al terminar el proceso de creación del JAR, se crea una carpeta “target”, debe entra a esta carpeta o debe ejecutar el comando entregando la dirección:

```
java -jar .\sprint-web-0.0.1-SNAPSHOT.jar                               estando dentro de la carpeta "target"
java -jar .\target\sprint-web-0.0.1-SNAPSHOT.jar                        no estar en el directorio indicado
```