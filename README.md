# Conversor de Monedas!

## Descripción:
Este proyecto es un conversor de monedas simple que permite a los usuarios convertir entre el dólar estadounidense (USD), el peso argentino (ARS), el real brasileño (BRL) y el peso colombiano (COP), a demás de poder convertir el peso colombiano (COP) en Euros (EUR). La aplicación realiza las conversiones utilizando una API de tasas de cambio actualizadas.


## Características  
Conversión de USD a ARS, BRL y COP. - Conversión de ARS, BRL y COP a USD. Conversión de COP a EUR. - Conversión de EUR a COP. - Tasas de cambio obtenidas en tiempo real mediante API.


### Tecnologías Utilizadas  
- Java 
-  Gson (para el manejo de JSON) 
-  API de [ExchangeRate-API](https://www.exchangerate-api.com/)


### Configuración 
Para ejecutar este proyecto, necesitas tener Java instalado en tu máquina. También es necesario incluir la librería Gson en el proyecto, lo cual puedes hacer descargando y  añadiendo el siguiente archivo JAR ([Maven Repository: com.google.code.gson » gson » 2.10.1 (mvnrepository.com))](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1) en tu carpeta de librerías o utilizando un gestor de dependencias como Maven o Gradle.

### Instrucciones de Uso

1.  **Inicio de la aplicación**:
    
    -   Ejecute la aplicación desde su IDE o desde la línea de comandos si ya está compilada.
    -   Asegúrese de que su entorno de ejecución tiene acceso a Internet para obtener las tasas de cambio actualizadas.
2.  **Interfaz de usuario en consola**:
    
    -   Al iniciar, se mostrará en consola un menú principal con varias opciones de conversión de monedas y una opción para salir.
    
3.  **Seleccionar una opción**:
    
    -   Introduzca el número correspondiente a la conversión de moneda que desea realizar. Las opciones disponibles son:
    
1) Dólar =>>  Peso Colombiano
2) Peso Colombiano =>> Dólar
3) Euro =>> Peso Colombiano
4) Peso Colombiano =>> Euro
5) Dólar =>> Real Brasileño
6) Real Brasileño =>> Dólar
7) Dólar =>> Peso Argentino  
8) Peso Argentino =>> Dólar
9) Salir
	 -   Presione `Enter` después de seleccionar la opción con el número correspondiente.
4.  **Introducir la cantidad a convertir**:
    
    -   Después de seleccionar la conversión deseada, se le pedirá que introduzca la cantidad de moneda origen que desea convertir.
    -   Ingrese el valor numérico de la cantidad y presione `Enter`.
5.  **Resultado de la conversión**:
    
    -   La aplicación calculará automáticamente el equivalente en la moneda destino utilizando la tasa de cambio más reciente y mostrará el resultado en la consola.
6.  **Repetir o salir**:
    
    -   Después de ver el resultado, puede elegir realizar otra conversión seleccionando otra opción del menú o salir de la aplicación seleccionando la opción `7) Salir`.
7.  **Finalizar la aplicación**:
    
    -   Si selecciona la opción de salir, la aplicación terminará su ejecución.

### Notas Adicionales

-   En caso de ingresar una opción inválida, el sistema le indicará y le pedirá que elija nuevamente una opción válida.
-   Esta aplicación necesita una conexión estable a Internet para funcionar correctamente, ya que obtiene datos en tiempo real de una API externa.
