
package metodotrapecio;
import java.util.Scanner;
import java.util.function.Function;

public class MetodoTrapecio {
    // Función que calcula la integral aproximada usando el método del trapecio
    public static double trapecio(double a, double b, int n, Function<Double, Double> func) {
        double h = (b - a) / n; // Ancho de cada subintervalo
        double integral = 0.5 * (func.apply(a) + func.apply(b)); // Suma de los extremos del intervalo
        
        // Suma de los valores de la función en los puntos interiores de los subintervalos
        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            integral += func.apply(x);
        }
        
        integral *= h; // Multiplicar por el ancho de los subintervalos
        return integral;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir la función que se desea integrar
        System.out.println("Ingrese la función que desea resolver:");
        int opc = scanner.nextInt();
        
        // Funciones
        Function<Double, Double> funcion = x -> Math.sin(x); // Ejemplo: integral de sin(x)
        switch(opc){
            case 1:
                funcion = x -> Math.sin(x); // f(x) = sin(x)
                break;
            case 2:
                funcion = x -> 2 * x + 3; // f(x) = 2x + 3
                break;
            case 3:
                funcion = x -> x * x; // f(x) = x^2
                break;
            case 4:
                funcion = x -> Math.exp(x); // f(x) = e^x
                break;
            case 5:
                funcion = x -> Math.sqrt(x); // f(x) = sqrt(x)
                break;
        }
        
        // Pedir al usuario que ingrese los límites del intervalo [a, b]
        System.out.println("Ingrese el límite inferior (a):");
        double a = scanner.nextDouble();
        
        System.out.println("Ingrese el límite superior (b):");
        double b = scanner.nextDouble();
        
        // Pedir al usuario que ingrese el número de subintervalos
        System.out.println("Ingrese el número de subintervalos:");
        int n = scanner.nextInt();
        
        // Calcular la integral aproximada usando el método del trapecio
        double resultado = trapecio(a, b, n, funcion);
        System.out.println("El resultado aproximado de la integral es: " + resultado);
        
        scanner.close();
    }
}
