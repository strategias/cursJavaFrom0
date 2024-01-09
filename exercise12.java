import java.util.Scanner;

public class exercise12 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            int reversedNumber = reverseNumber(number);
            System.out.println("The reversed number is: " + reversedNumber);

            scanner.close();
        }

        // Function to reverse the digits of a number
        public static int reverseNumber(int number) {
            int reversedNumber = 0;

            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            return reversedNumber;
        }
    }


