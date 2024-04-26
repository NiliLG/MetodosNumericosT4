package reglasimpson;
import java.util.Scanner;
import java.util.function.Function;

public class ReglaSimpson {
// Función para calcular la integral usando la Regla de Simpson 1/3
    public static double integralSimpson13(Function<Double, Double> func, double a, double b) {
        double h = (b - a) / 2; // Ancho del intervalo
        double x0 = a;
        double x1 = (a + b) / 2;
        double x2 = b;

        double sum = func.apply(x0) + 4 * func.apply(x1) + func.apply(x2);
        
        return (b - a) * sum / 6;
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
        
        // Calcular e imprimir la aproximación de la integral
        double integral = integralSimpson13(funcion, a, b);
        System.out.println("Aproximación de la integral usando la Regla de Simpson 1/3: " + integral);
    }
}