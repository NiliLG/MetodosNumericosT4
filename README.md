
# Índice
* [Método de trapecio](#Método_de_trapecio)
* [Regla de Simpson](#Regla_de_Simpson)
* * [Regla de Simpson 1/3](#Regla_de Simpson_1/3).
* [Método de la cuadratura gaussiana](#MÉTODO_DE_ELIMINACIÓN_GAUSSSIANA)
* [Fórmula de tres puntos](#MÉTODO_DE_ELIMINACIÓN_GAUSSSIANA)
* [Fórmula de cinco puntos](#MÉTODO_DE_ELIMINACIÓN_GAUSSSIANA)

# Método_de _trapecio

En matemática la regla del trapecio es un método de integración numérica, es decir, un método para calcular aproximadamente el valor de la integral definida

![Captura de pantalla 2024-04-24 224227](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/c9f23672-d1c8-4a10-ba3e-36db3694dd26)

La regla se basa en aproximar el valor de la integral de f(x) por el de la función lineal que pasa a través de los puntos (a, f(a)) y (b, f(b)). La integral de ésta es igual al área del trapecio bajo la gráfica de la función lineal. Se sigue que

![Captura de pantalla 2024-04-24 224331](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/69fa7bd1-c58a-4bdb-bb8a-f4ed8edaa118)

y donde el término error corresponde a:

![Captura de pantalla 2024-04-24 224352](https://github.com/NiliLG/MetodosNumericosT4/assets/147437701/3096a201-d558-4d70-b8d8-f37ed8660480)

[Ejemplos](https://github.com/NiliLG/MetodosNumericosT3/tree/main/GaussJordan)

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

[Ejemplos](https://github.com/NiliLG/MetodosNumericosT3/tree/main/GaussJordan)
