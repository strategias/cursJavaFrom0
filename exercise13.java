import java.util.Scanner;

public class exercise13 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of integers: ");
            int count = scanner.nextInt();

            int sumEven = 0;
            int sumOdd = 0;

            System.out.println("Enter the integers:");

            for (int i = 0; i < count; i++) {
                int num = scanner.nextInt();

                if (num % 2 == 0) {
                    sumEven += num; // Adding even number to sumEven
                } else {
                    sumOdd += num; // Adding odd number to sumOdd
                }
            }

            System.out.println("Sum of even integers: " + sumEven);
            System.out.println("Sum of odd integers: " + sumOdd);


        }
    }

