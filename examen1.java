import java.util.Scanner;

public class PrimeraSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el valor de x:");
        double x1 = scanner.nextDouble();
        System.out.println("Resultado: " + (x1 + 2 * x1));

        
        System.out.print("Ingresa el valor de x:");
        double x2 = scanner.nextDouble();
        System.out.println("Resultado: " + (x2 * x2 - 3 * x2));

        
        System.out.print(" Ingresa tres valores a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Resultado: " + ((a + b + c) / 3));

        
        System.out.print("Ingresa el valor de x:");
        double x4 = scanner.nextDouble();
        System.out.println("Resultado: " + (x4 * x4 + 2 * (x4 + 1)));

    }
}

