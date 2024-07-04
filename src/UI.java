import java.util.Scanner;

public class UI{

public static void main(String[] args) {
    calc calc = new calc();
    Scanner scanner = new Scanner(System.in);

 
    System.out.print("Ingresa el primer número: ");
    int n1 = scanner.nextInt();

    System.out.print("Ingresa el segundo número: ");
    int n2 = scanner.nextInt();

    System.out.println("Suma de " + n1 + " y " + n2 + ": " + calc.suma(n1, n2));
    System.out.println("Resta de " + n1 + " y " + n2 + ": " + calc.resta(n1, n2));
    System.out.println("Multiplicación de " + n1 + " y " + n2 + ": " + calc.multiplicacion(n1, n2));

    scanner.close();
    }
}
