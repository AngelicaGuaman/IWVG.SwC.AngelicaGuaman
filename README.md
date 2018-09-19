# Práctica Software Colaborativo

> ##### [Máster en Ingeniería Web por la Universidad Politécnica de Madrid (miw-upm)](http://miw.etsisi.upm.es)
> ##### Asignatura: *Ingeniería Web: Visión General*

### Estado del código

[![Build Status](https://travis-ci.org/AngelicaGuaman/IWVG.SwC.AngelicaGuaman.svg?branch=master)](https://travis-ci.org/AngelicaGuaman/IWVG.SwC.AngelicaGuaman)

![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=es.upm.miw:IWVG.SwC.AngelicaGuaman&metric=alert_status)


### Tecnologías necesarias
* Java
* Maven
* GitHub
* Travis-ci
* Sonarcloud

### Importante
1. Los commits serán en español.
1. Formatear el código con las recomendaciones propias del entorno IntelliJ.

# Descripción del proyecto
Se parte de un proyecto ya desarrollado, y se pretende realizar una ampliación del mismo.

En la actualidad, el proyecto consta de cuatro clases:

* Point, maneja coordenadas de dos dimensiones, ofreciendo diversas funcionalidades
* User, almacena un identificador, el nombre y apellido, controlando el formato del mismo y mostrando diferentes representaciones
* DecimalCollection, maneja una colección de valores decimales de tipo double
* Fraction, maneja fracciones matemáticas

Es responsabilidad del arquitecto realizar los test de cada clase en su versión inicial

## Las ampliaciones serán las siguientes:
### Point
* Poder modificar las coordenadas

### User
* Presentar el nombre en mayúsculas

### DecimalCollection
* Se incluirá el método media.

### Fraction
* Incluir métodos como isPropia, isImpropia. Las fracciones propias son aquellas cuyo numerador es menor que el denominador, y las fracciones impropias el resto
* Incluir el método isEquivalente. Dos fracciones son equivalentes cuando el producto de extremos es igual al producto de medios

# Features
Las mejoras se publicarán con un formato a elección del Arquitecto, y deberá describirlo en la Wiki. Deberán tener plazos temporales.

No olvidéis, si con tanto cambio se produce descontrol y pánico!!! enfocar un commit estable, hacer reset mediante el menú contextual y marcar Hard

## Pasos a seguir
### Fase 1. Integrantes de los proyectos
Sorteo para asignar a cada Arquitecto su equipo de tres Programadores. Incluir en la plataforma los datos menos el repositorio.

### Fase 2. Preparar proyecto en el repositorio
El Arquitecto deberá preparar el proyecto en su cuenta de GitHub.

Se llamará IWVG.SwC.Arquitecto
Creará el proyecto en local y lo subirá a Git, no subir los ficheros de configuración del IDE!!!. En el primer commit incluir en el mensaje el nombre del arquitecto
Organizará la forma de gestionar el proyecto: creará etiquetas, establecerá el formato de las mejoras...
Deberá añadir los test de cada clase y comprobar su buen funcionamiento
Actualizará el repositorio remoto
Configurará el proyecto para trabajar con Travis CI
Publicará en la plataforma de la moodle.upm los datos del proyecto, en el apartado GitHubs de la asignatura
Añadirá como colaboradores del proyecto a su la lista de Programadores

### Fase 3. Preparar proyectos en equipos locales
Los Programadores importarán este proyecto en sus equipos.

### Fase 4. Planificación de la ampliación por parte de Arquitecto
El Arquitecto establecerá UNA ampliación para las clases Point, User y DecimalCollection, y TRES ampliaciones para Fraction, una para cada programador. Cada ampliación de clase debe ir acompañada con sus ampliaciones de test y su explicación en la wiki.

### Fase 5. Crear tickets
El Arquitecto mandará tickets para implementar las mejoras. Procurará que sea equitativo el trabajo de los programadores
El Programador realizará los tickets con agilidad y corrección. Una vez que termine, deberá pasar los test, y si no hay errores, realizar la fusión con la rama develop. Finalmente cerrará el ticket

### Fase 6. Comprobación final del proyecto
El Arquitecto comprobará el buen funcionamiento de la ampliación. Si tuviera errores, creará nuevos tickets.
Finaliza la ampliación, creando una release-1.0 para liberar.

# Evaluación
La nota que se obtiene en este ejercicio es de 7 puntos por el rol de Arquitecto y 3 puntos por el rol de Programador. El Arquitecto deberá dar una nota entre 0..1 a cada uno de los programadores. Se indicará en la entrega de la práctica. Se valorará el uso adecuado de las ramas, el uso de los tickets, de la wiki, la coordinación...

Suerte chic@s!!!
