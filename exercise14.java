import java.util.Scanner;

public class exercise14 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            char choice;

            do {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                smallest = number < smallest ? number : smallest; // Update smallest number
                largest = number > largest ? number : largest;    // Update largest number

                System.out.print("Do you want to enter another number? (Y/N): ");
                choice = scanner.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');

            System.out.println("Smallest number entered: " + smallest);
            System.out.println("Largest number entered: " + largest);


        }
    }

