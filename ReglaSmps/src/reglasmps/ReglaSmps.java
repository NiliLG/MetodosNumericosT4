package reglasmps;

import java.util.Scanner;
import java.util.function.Function;

public class ReglaSmps {

    // Función para calcular la integral usando la Regla de Simpson 3/8
    public static double integralSimpson38(Function<Double, Double> func, double a, double b) {
        double h = (b - a) / 3; // Ancho de cada subintervalo
        double x0 = a;
        double x1 = a + h;
        double x2 = a + 2 * h;
        double x3 = b;
        
        double sum = func.apply(x0) + 3 * func.apply(x1) + 3 * func.apply(x2) + func.apply(x3);
        
        return (b - a) * sum / 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Regla de Simpson 3/8");
        
        // Definir la función que se desea integrar
        System.out.println("\nFunciones ");
        System.out.println("1.   f(x) = sin(x)");
        System.out.println("2.   f(x) = 2x + 3");
        System.out.println("3.   f(x) = x^2");
        System.out.println("4.   f(x) = e^x");
        System.out.println("5.   f(x) = sqrt(x)");
        
        System.out.println("\nIngrese la función que desea resolver:");
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

        // Calcular e imprimir la aproximación de la integral
        double integral = integralSimpson38(funcion, a, b);
        System.out.println("Aproximación de la integral usando la Regla de Simpson 3/8: " + integral);
    }
}
