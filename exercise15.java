import java.util.Scanner;

public class exercise15 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;

            char choice;

            do {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();

                smallest = Math.min(smallest, number); // Update smallest number
                largest = Math.max(largest, number);   // Update largest number

                System.out.print("Do you want to enter another number? (Y/N): ");
                choice = scanner.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');

            if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
                System.out.println("Smallest number entered: " + smallest);
                System.out.println("Largest number entered: " + largest);
            } else {
                System.out.println("No numbers were entered.");
            }


        }
    }

