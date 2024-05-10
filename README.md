# PROBLEMA DE PARAR
### URL
https://github.com/miriampgez/Problema-de-parar.git

### JavaDoc
file:///C:/Users/miria/OneDrive/Documentos/GitHub/Problema-de-parar/index.html

# Paquete Controlador
## Clase CountDownController
Esta clase representa un controlador para la cuenta regresiva. Implementa la interfaz Controlador y proporciona un método para ejecutar una cuenta regresiva desde un número dado hasta cero.

### Descripción
**`CountDownController`** se encarga de iniciar y controlar una cuenta regresiva en la aplicación. Utiliza el método **`execute(int input)`** para comenzar la cuenta regresiva a partir del número especificado en `input` y contar hacia abajo hasta cero.

### Métodos
- **`execute(int input)`**: Inicia una cuenta regresiva desde el número dado hasta cero.

## Clase InfiniteCountController

Esta clase representa un controlador para la cuenta infinita. Implementa la interfaz Controlador y proporciona un método para ejecutar una cuenta infinita a partir de un número dado.

### Descripción

**`InfiniteCountController`** se encarga de iniciar y controlar una cuenta infinita en la aplicación. Utiliza el método **`execute(int input)`** para comenzar la cuenta infinita a partir del número especificado en `input` y continuar contando indefinidamente.

### Métodos

- **`execute(int input)`**: Inicia una cuenta infinita a partir del número dado.

##  Clase HaltChecker

Esta clase proporciona un mecanismo para verificar si un programa se detendrá o no con una entrada dada. 

### Descripción

**`HaltChecker`** implementa la lógica para determinar si un programa controlado por un controlador dado se detendrá o continuará ejecutándose con la entrada proporcionada. Utiliza el método **`check(Controlador controlador, int input)`** para realizar esta verificación.

### Métodos

- **`check(Controlador controlador, int input)`**: Comprueba si un programa controlado por el controlador dado se detendrá o no con la entrada especificada.

## Clase Reverser

Esta clase implementa la funcionalidad para invertir el comportamiento de un programa. Utiliza un HaltChecker para determinar si el programa se detendrá y, en función de eso, inicia un bucle infinito o termina inmediatamente.

### Descripción

**`Reverser`** proporciona la capacidad de invertir el comportamiento de un programa en la aplicación. Utiliza un **`HaltChecker`** para determinar si el programa se detendrá con una entrada dada. Si el programa se detiene, **`Reverser`** inicia un bucle infinito; de lo contrario, termina inmediatamente.

### Métodos

- **`reverse(Controlador controlador, int input)`**: Inicia un programa con la entrada dada y, basado en el resultado del HaltChecker, inicia un bucle infinito o termina inmediatamente.


# Paquete Modelo
## Clase CuentaAtras

Esta clase implementa la funcionalidad para una cuenta regresiva. Implementa la interfaz Controlador y proporciona un método para ejecutar una cuenta regresiva desde un número dado hasta cero.

### Descripción

**`CuentaAtras`** representa una cuenta regresiva en la aplicación. Utiliza el método **`execute(int input)`** para iniciar y controlar la cuenta regresiva a partir del número especificado en `input` y contar hacia abajo hasta cero.

### Métodos

- **`execute(int input)`**: Inicia una cuenta regresiva desde el número dado hasta cero.

## Clase CuentaInfinita

Esta clase implementa la funcionalidad para una cuenta infinita. Implementa la interfaz Controlador y proporciona un método para ejecutar una cuenta infinita a partir de un número dado.

### Descripción

**`CuentaInfinita`** representa una cuenta infinita en la aplicación. Utiliza el método **`execute(int input)`** para iniciar y controlar la cuenta infinita a partir del número especificado en `input` y continuar contando indefinidamente.

### Métodos

- **`execute(int input)`**: Inicia una cuenta infinita a partir del número dado.

## Interfaz Controlador

Esta interfaz define el comportamiento común para todos los controladores en la aplicación.

### Descripción

**`Controlador`** define un conjunto de métodos que deben ser implementados por todas las clases que actúan como controladores en la aplicación. Este conjunto de métodos proporciona una interfaz común para iniciar y controlar diferentes procesos en la aplicación.

### Métodos

- **`execute(int input)`**: Método que debe ser implementado por las clases que actúan como controladores. Define la lógica para iniciar y controlar un proceso específico en la aplicación, utilizando la entrada proporcionada en `input`. La implementación de este método puede variar según el tipo de controlador y la funcionalidad que esté destinado a realizar. 

# Paquete Vista
## Clase Vista

Esta clase representa la interfaz gráfica de usuario de la aplicación. Proporciona métodos para iniciar una cuenta regresiva o una cuenta infinita.

### Descripción

**`Vista`** maneja la interacción del usuario con la aplicación a través de una interfaz gráfica. Proporciona métodos **`empezarCuentaAtras(Controlador countDownController)`** y **`empezarCuentaInfinita(Controlador infiniteCountController)`** para iniciar una cuenta regresiva o una cuenta infinita, respectivamente.

### Métodos

- **`empezarCuentaAtras(Controlador countDownController)`**: Inicia una cuenta regresiva utilizando el controlador proporcionado.
- **`empezarCuentaInfinita(Controlador infiniteCountController)`**: Inicia una cuenta infinita utilizando el controlador proporcionado.

# Paquete Main
## Main

Esta clase contiene el método main que inicia la aplicación. También almacena referencias a los controladores y puede realizar operaciones relacionadas con la configuración inicial de la aplicación.

### Descripción

**`Main`** es la clase principal de la aplicación. Contiene el método **`main(String[] args)`** que se ejecuta cuando se inicia la aplicación. Además, almacena referencias a los controladores utilizados en la aplicación y puede realizar operaciones de configuración inicial.

### Métodos

- **`main(String[] args)`**: Método principal que inicia la aplicación.
