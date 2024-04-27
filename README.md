
# Índice

* [Introducción](#Introducción)
* [Método de trapecio](#Método_de_trapecio)
  * [Aplicación_múltiple](#Aplicación_múltiple)
* [Regla de Simpson](#Regla_de_Simpson)
  * [Regla de Simpson 1/3](#Regla_de_Simpson_1/3)
  * [Regla de Simpson 3/8](#Regla_de_Simpson_3/8)
* [Método de la cuadratura gaussiana](#MÉTODO_DE_ELIMINACIÓN_GAUSSSIANA)
* [Fórmula de tres puntos](#MÉTODO_DE_ELIMINACIÓN_GAUSSSIANA)
* [Fórmula de cinco puntos](#MÉTODO_DE_ELIMINACIÓN_GAUSSSIANA)

# Introdución

Los métodos numéricos juegan un papel importante en la solución de problemas matemáticos y de ingeniería donde las soluciones analíticas no son posibles o prácticas de obtener. En este problemario, exploraremos varios métodos numéricos para la aproximación de integrales (aplicado en el lengauje de programación Java). Los métodos que abordaremos incluyen el Método del Trapecio, la Regla de Simpson, el Método de Cuadratura Gaussiana, la Fórmula de Tres Puntos y la Fórmula de Cinco Puntos.

# Método_de _trapecio

En matemática la regla del trapecio es un método de integración numérica, es decir, un método para calcular aproximadamente el valor de la integral definida

![Captura de pantalla 2024-04-24 224227](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/c9f23672-d1c8-4a10-ba3e-36db3694dd26)

![Captura de pantalla 2024-04-24 232445](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/7f79faca-6ef7-4f3b-8369-dcb56e0beddb)

La regla se basa en aproximar el valor de la integral de f(x) por el de la función lineal que pasa a través de los puntos (a, f(a)) y (b, f(b)). La integral de ésta es igual al área del trapecio bajo la gráfica de la función lineal. Se sigue que

![Captura de pantalla 2024-04-24 224331](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/69fa7bd1-c58a-4bdb-bb8a-f4ed8edaa118)

y donde el término error corresponde a:

![Captura de pantalla 2024-04-24 224352](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/3096a201-d558-4d70-b8d8-f37ed8660480)

## Aplicación_múltiple

Una forma de mejorar la precisión de la regla del trapecio consiste en dividir el intervalo de integración de a a b en varios segmentos, y aplicar el método a cada uno de ellos. Las áreas de los segmentos se suman después para obtener la integral en todo el intervalo. Las ecuaciones resultantes se llaman fórmulas de integración, de aplicación múltiple o compuestas.
Existen n segmentos del mismo ancho:

![Captura de pantalla 2024-04-25 000550](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/2532ed46-3a5c-47ce-afe3-a8132eeb5887)

![Captura de pantalla 2024-04-25 001051](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/a8d54c83-ab68-4b90-bc47-4fabe42e5699)

Si a y b se designan como x0 y xn, respectivamente, la integral completa se representará como:

![Captura de pantalla 2024-04-25 000720](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/233d7112-6e5a-4ce2-bd59-105be4531338)

Para expresar la ecuación (21.9) en la forma general de la ecuación

![Captura de pantalla 2024-04-25 000838](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/0d9eae92-23dc-45f7-b689-afc23ab9712a)

Como la sumatoria de los coeficientes de f(x) en el numerador dividido entre 2n es igual a 1, la altura promedio representa un promedio ponderado de los valores de la función. 
De acuerdo con la ecuación, a los puntos interiores se les da el doble de peso que a los dos puntos extremos f(x0) y f(xn).
Se tiene un error con la regla del trapecio de aplicación múltiple al sumar los errores individuales de cada segmento, así

![Captura de pantalla 2024-04-25 001009](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/08faa2e8-355e-4c95-b796-2c47a0874925)

[Ejemplos](https://github.com/NiliLG/MetodosNumericosT4/tree/main/MetodoTrapecio)

# Regla_de_Simpson

## Regla_de Simpson_1/3
La regla de Simpson 1/3 resulta cuando un polinomio de interpolación de segundo grado se sustituye en la ecuación

![Captura de pantalla 2024-04-24 224352](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/45f295f8-3c2e-48b0-adc8-032302b60aee)

![Captura de pantalla 2024-04-24 225749](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/7907ca09-2f87-4e13-b60f-0851b467c9a0)

La regla de Simpson 1/3 también se puede expresar usando el formato de la ecuación 

![Captura de pantalla 2024-04-24 225149](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/32af9516-43c7-4bc2-8fcd-ffa5403ff648)

donde a = x0, b = x2 y x1 = el punto a la mitad entre a y b, que está dado por (b + a)/2.
Se puede demostrar que la aplicación a un solo segmento de la regla de Simpson 1/3 tiene un error de truncamiento de

![Captura de pantalla 2024-04-24 225353](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/6380a784-f5df-469a-b877-02b47a821205)

o, como h = (b – a)/2,

![Captura de pantalla 2024-04-24 225413](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/228fb19b-7d33-402c-bbb3-7f3493217666)

donde ξ está en algún lugar en el intervalo de a a b.

[Ejemplos](https://github.com/NiliLG/MetodosNumericosT4/tree/main/ReglaSimpson)

## Regla_de Simpson_3/8
De manera similar a la obtención de la regla del trapecio y Simpson 1/3, es posible ajustar un polinomio de Lagrange de tercer grado a cuatro puntos e integrarlo:

![image](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/f80644ac-21e8-4b39-b168-81931f942d0d)

para obtener

![image](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/3d7d669c-7d65-40b5-9405-6d95f3f54d05)

donde h = (b – a)/3. Esta ecuación se llama regla de Simpson 3/8 debido a que h se multiplica por 3/8. Ésta es la tercera fórmula de integración cerrada de Newton-Cotes. La regla 3/8 se expresa también en la forma de la ecuación:

![image](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/cc52919a-f8f1-4dc7-8712-55ff1a6e248f)

Así los dos puntos interiores tienen pesos de tres octavos, mientras que los puntos extremos tienen un peso de un octavo. La regla de Simpson 3/8 tiene un error de

![image](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/df2c1c39-459d-4f12-8206-796beceecdf1)

[Ejemplos](https://github.com/NiliLG/MetodosNumericosT4/tree/main/ReglaSmps)
