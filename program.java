import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            double addition = number + 10;
            double subtraction = number - 10;
            double multiplication = number * 10;
            double division = number / 10;

            System.out.println("Addition (number + 10): " + addition);
            System.out.println("Subtraction (number - 10): " + subtraction);
            System.out.println("Multiplication (number * 10): " + multiplication);
            System.out.println("Division (number / 10): " + division);
        }

       
    }
}
