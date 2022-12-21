## 🚀 prueba-tecnica
Desarrolla un pipeline de análisis de datos utilizando los datos de la Ciudad de Mexico

### Configuracion de PostgreSQL  <img width="23px" src="https://cdn-icons-png.flaticon.com/512/5968/5968342.png" alt="pg Icon" />

en la carpeta **baseDatos** esta el respaldo sql y el _docker-composer_
para usar el docker-composer se debe ejecutar el comando

```bash
  cd baseDatos
  docker-compose up
```



la base de datos ya esta lista, la configuracion 
es siguiente

| Dato       | credenciales |
|------------|--------------|
| Usuario    | admin        |
| Contraseña | admin        |
| Host       | localhost    |
| Puerto     | 9008         |

### Configuracion del API <img width="23px" src="https://cdn-icons-png.flaticon.com/512/5968/5968282.png" alt="pg Icon" />

su desarrollo se realizo en SprindBoot JAVA, usando Orientacion a Objectos,
el codigo que se hizo es muy simple y facil de entender

```bash
  cd api
  gradle clean build
  java -jar api-0.0.1-SNAPSHOT.jar
```
_informacion del endpoint_

endpoint: http://localhost:9002/page/{numero_pagina}
METHOD POST

| KEY        | TIPO DE VALOR |
|------------|---------------|
| colonia    | string        |
| id | string        |
| latitud       | float         |
| longitud     | float         |

### Configuracion del cliente <img width="23px" src="https://cdn-icons-png.flaticon.com/512/9205/9205980.png" alt="pg Icon" />

es una simple HTML con vue js, se uso la libreria de diseño tailwind, para abrirlo consta de darle doble clic al archivo index.html
o bien desde la terminal abrirlo con el navegador.

```bash
  cd cliente
  ./index.html
```