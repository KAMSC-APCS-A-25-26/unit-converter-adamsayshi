import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // TODO: Implement distance converter
        // Requirements:
        // - Menu with options: 1. Convert Miles to Kilometers, 2. Convert Kilometers to Miles, 3. Exit
        // - Loop until user chooses to exit
        // - Use conversion factor: 1 mile = 1.60935 kilometers
        // - Display conversion results
        // - Handle invalid menu choices
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int user = 0;
        double initial = 0;
        double fin = 0;
        while (cont){
            System.out.println("\nChoose conversion direction:\n1. Convert Miles to Kilometers\n2. Kilometers to Miles\n3. Exit\n");
            System.out.print("Enter your choice (1, 2, or 3): ");
            user = sc.nextInt();

            switch (user){
                case 1:
                    System.out.print("Enter distance in miles:  ");
                    initial = sc.nextDouble();
                    fin = initial*1.60935;
                    System.out.println("\nConversion Results: ");
                    System.out.println("Miles: " + initial);
                    System.out.println("Kilometers: " + fin);
                    break;
                case 2:
                    System.out.print("Enter distance in kilometers:  ");
                    initial = sc.nextDouble();
                    fin = initial / 1.60935;
                    System.out.println("\nConversion Results: ");
                    System.out.println("Kilometers: " + initial);
                    System.out.println("Miles: " + fin);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    cont = false;
                    break;
                default:
                    System.out.println("I don't know that");
                    break;
            }
        }
    }
}