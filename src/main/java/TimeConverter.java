import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        // TODO: Implement time converter
        // Requirements:
        // - Prompt for hours, minutes, and seconds
        // - Display conversion results and calculation breakdown
        // - Ask user if they want to convert another time (y/n)
        // - Loop until user chooses to exit
        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        String maybe = "";
        while (cont){
            System.out.println("\nConvert time to total seconds\n");
            System.out.print("Enter hours: ");
            hours = sc.nextInt();
            System.out.print("Enter minutes: ");
            minutes = sc.nextInt();
            System.out.print("Enter seconds: ");
            seconds = sc.nextInt();

            System.out.println("\nTime Conversion: ");
            System.out.println("Input: " + hours + " hour, " + minutes + " minute, " + seconds + " second");
            System.out.println("Total Seconds: " + (hours*3600 + minutes * 60 + seconds));

            System.out.println("\nCalculation: ");
            System.out.println(hours + " hour * 3600 = " + (hours*3600));
            System.out.println(minutes + " minute * 60 = " + (minutes*60));
            System.out.println(seconds + " seconds = " + (seconds));
            System.out.println("Total Seconds: " + (hours*3600 + minutes * 60 + seconds));

            System.out.print("\nDo you want to convert another time? (y/n): ");
            maybe = sc.next();
            if (maybe.equals("y")) {
                continue;
            } else{
                System.out.println("Goodbye!");
                cont = false;
            }
        }
    }
}