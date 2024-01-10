import java.util.Scanner;

public class exercise17 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of terms for Fibonacci series: ");
            int n = scanner.nextInt();

            System.out.println("Fibonacci series of " + n + " terms:");

            int firstNumber = 0, secondNumber = 1;

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstNumber + " ");

                int nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }

            scanner.close();
        }
    }


