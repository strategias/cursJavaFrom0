import java.util.Scanner;

public class exercise18 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            double sum = 0.0;

            for (int i = 1; i <= n; ++i) {
                sum += 1.0 / i; // Adding the reciprocal of each number to the sum
            }

            System.out.println("Sum of the series is: " + sum);

            scanner.close();
        }
    }

