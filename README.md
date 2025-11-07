# Simulador de Monte Carlo en Scala

Este proyecto implementa un **simulador de Monte Carlo** en **Scala**, utilizando funciones como parámetros (programación funcional).  
Permite **estimar probabilidades** de distintos eventos de manera experimental, generando resultados aproximados mediante simulación aleatoria.
Cambie el parámetro por valores mayores a 9 en los dados para calcular su probabilidad y la de algún otro evento, agregue una función booleana que representa un evento.

---

##  ¿Qué hace este programa?

Permite ejecutar experimentos aleatorios múltiples veces y calcular la probabilidad aproximada de que ocurra un evento.

Por ejemplo:

Lanzar un dado y estimar la probabilidad de sacar un número mayor a 9.
Contar cuántas veces cae cara en un volado.
Cualquier otro evento que se pueda simular.

El programa define una función principal llamada `estimarProbabilidad`, que recibe:

- Una **función booleana** (`experimento`) que representa un evento.
- Un número de **repeticiones**.

Luego, ejecuta el experimento muchas veces y calcula la frecuencia relativa de que ocurra, devolviendo así una **probabilidad estimada**.

---

##  Ejemplos incluidos

###  Ejemplo 1: Probabilidad de que la suma de dos dados sea mayor que 9

El programa lanza dos dados al azar y estima la probabilidad de que su suma sea mayor que 9 (es decir, 10, 11 o 12).  
El resultado teórico es ≈ 16.67%, y el programa lo aproxima mediante simulaciones.

###  Ejemplo 2: Estimación del número PI (π)

También incluye un ejemplo clásico del método de Monte Carlo:  
genera puntos aleatorios en un cuadrado y estima π calculando cuántos caen dentro del círculo unitario.

---

## 🧩 Estructura del proyecto

