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
        System.out.println("Welcome to Distance converter");
        int user = 0;
        double initial = 0;
        double fin = 0;
        while (cont){
            System.out.println("Choose conversion direction:\n1. Convert Miles to Kilometers \n2. Kilometers to Miles\n3. Leave:  ");
            System.out.println("Enter your choice: ");
            user = sc.nextInt();
            switch (user){
                case 1:
                    System.out.println("Enter Miles:  ");
                    initial = sc.nextDouble();
                    fin = initial*1.60935;
                    System.out.println("Kilometers is " + fin);
                    break;
                case 2:
                    System.out.println("Enter Kilometers:  ");
                    initial = sc.nextDouble();
                    fin = initial / 1.60935;
                    System.out.println("Miles is " + fin);
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