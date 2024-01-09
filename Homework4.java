import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {

        // exercitiul 1
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);


        for (int k = 0; k <= 10; k++) {
            System.out.println(k);
        }

        //exercitiul 2
        int a = 1;
        int sum = 0;
        while (a <= 10) {
            sum += a;
            a++;


        }
        System.out.println("Sum of numbers is " + sum);
        {
            int sum1 = 0;
            for (int b = 1; b <= 10; b++) {
                sum1 += b;

            }
            System.out.println("Sum of numbers is " + sum1);
            {
                int sum2 = 0;
                int c = 1;
                do {
                    sum2 += c;
                    c++;
                } while (c <= 10);
                System.out.println("Sum of numbers is " + sum2);


                //exercitiul 3
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number");
                int number = scanner.nextInt();
                if (number <= 0) {
                    System.out.println("Please enter a positive number");
                } else {
                    System.out.println("Multiplication table for " + number + ": ");

                    int d = 1;
                    while (d <= 10) { //daca facem cu for atunci:  for (int d = 1; d <= 10; d++)
                        System.out.println(number + " x " + d + " = " + (number * d));
                        d++;
                    }
                }


                //exercitiul 4
                Scanner scanner1 = new Scanner(System.in);

                System.out.println("Enter a number to calculate the factorial: ");
                int number1 = scanner1.nextInt();


                if (number1 < 0) {
                    System.out.println("Input a positive number");
                } else {
                    long factorial = 1;
                    int e = 1;

                    while (e <= number1) { // cu for:  for (int e = 1; e <= number; e++)
                        factorial *= e;
                        e++;
                    }
                    System.out.println("Factorial of " + number1 + " is: " + factorial);
                }

                //exercitiul 5
                System.out.println(" Even numbers between 1 and 100: ");
                for (int f = 2; f <= 100; f += 2) {
                    //cu while:
                    // while (number <= 100) {
                    //            System.out.print(number + " ");
                    //            number += 2;
                    System.out.println(f + " ");
                }

                //exercitiul 6
                System.out.println(" Odd numbers between 1 and 100: ");
                for (int g = 1; g <= 100; g += 2) {
                    //cu while:
                    // while (number <= 100) {
                    //            System.out.print(number + " ");
                    //            number += 2;

                    System.out.println(g + " ");
                }

                //exercitiul 7
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter a positive number: ");
                int n = scanner2.nextInt();

                if (n <= 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    int sum3 = 0;

                    for (int h = 1; h <= n; h++) {
                        // cu while:
                        // while(h <= n){
                        // sum3 += h;
                        // h++;
                        sum3 += h;

                    }
                    System.out.println("The sum of the natural numbers from 1 to " + n + " is: " + sum3);
                }

                //exercitiul 8
                Scanner scanner4 = new Scanner(System.in);

                System.out.print("Enter a positive integer (n): ");
                int n1 = scanner.nextInt();

                if (n1 <= 0) {
                    System.out.println("Please enter a positive integer greater than zero.");
                } else {
                    int sum4 = 0;

                    for (int l = 2; l <= n; l += 2) {
                        //cu while:
                        // while (l <= n) {
                        //                sum += l;
                        //                l += 2;
                        sum4 += l;
                    }

                    System.out.println("The sum of even numbers from 1 to " + n1 + " is: " + sum4);

                    //exercitiul 9 - pe tabul de 'exercise9'

                    // exercitiul 10
                    Scanner scanner5 = new Scanner(System.in);

                    System.out.print("Enter a number with more than 3 digits: ");
                    long number0 = scanner5.nextLong();

                    if (number0 < 1000) {
                        System.out.println("Please enter a number with more than 3 digits.");
                    } else {
                        long sum10 = 0;
                        long temp = Math.abs(number0); // Handling negative numbers

                        while (temp > 0) {
                            sum10 += temp % 10;
                            temp /= 10;
                        }

                        System.out.println("The sum of digits in the number " + number0 + " is: " + sum10);




                    }
                }
            }
        }
    }
}

















