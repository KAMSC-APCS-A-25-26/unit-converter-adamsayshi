import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // TODO: Implement temperature converter
        // Requirements:
        // - Menu with options: 1. Convert Fahrenheit to Celsius, 2. Convert Celsius to Fahrenheit, 3. Exit
        // - Loop until user chooses to exit
        // - Use formulas: C = (F - 32) * 5/9 and F = C * 9/5 + 32
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        System.out.println("Welcome to temperature converter");
        int user = 0;
        double initial = 0;
        double fin = 0;
        while (cont){
            System.out.println("\nChoose conversion direction:\n1. Celsius \n2. Fahrenheit\n3. Exit");
            System.out.println("Enter your choice (1, 2, 3): ");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter temperature in Fahrenheit:  ");
                    initial = sc.nextDouble();
                    fin = (initial-32) * 5 / 9;
                    System.out.println("Fahrenheit: " + initial);
                    System.out.println("Celsius: " + fin);
                    break;
                case 2:
                    System.out.println("Enter temperature in Celsius:  ");
                    initial = sc.nextDouble();
                    fin = initial * (9.0 /5.0) + 32;
                    System.out.println("Celsius: " + initial);
                    System.out.println("Fahrenheit: " + fin);
                    break;
                case 3:
                    System.out.println("Bye bye");
                    cont = false;
                    break;
                default:
                    System.out.println("I don't know that");
                    break;
            }
        }
    }
}