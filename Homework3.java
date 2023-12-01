import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        //exercise #1
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("What temperature is outside in Celsius?");

        float temperatureCelsius = scanner1.nextFloat();
        float fahrenheit = (temperatureCelsius * 9 / 5) + 32; // formula of conversion

        System.out.println("Temperature outside is " + fahrenheit);

        //exercise #2
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Input value a: ");
        int valueA = scanner2.nextInt();

        System.out.println("Input value b: ");
        int valueB = scanner2.nextInt();

        System.out.println("Values before interchanging: " + " a = " + valueA + " b = " + valueB);


        int temp = valueA; // we use temporary value while we swap values
        valueA = valueB;
        valueB = temp;

        System.out.println("Interchanged variables:" + " a = " + valueA + " b = " + valueB);


        //exercise #3
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Transform the following amount of minutes into years: ");
        long minutes = scanner3.nextLong();

        long minutesInYear = 60 * 24 * 365; // formula to convert minutes in years
        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = (int) (remainingMinutes / (60 * 24));

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

        //exercise #4
        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Introdu prima nota: ");
        int numar1 = scanner4.nextInt();

        System.out.println("Introdu a doua nota: ");
        int numar2 = scanner4.nextInt();

        System.out.println("Introdu a treia nota: ");
        int numar3 = scanner4.nextInt();

        System.out.println("Introdu a patra nota: ");
        int numar4 = scanner4.nextInt();

        System.out.println("Introdu a cincea nota: ");
        int numar5 = scanner4.nextInt();

        int arithmeticMean = numar1 + numar2 + numar3 + numar4 + numar5;
        double arithmeticMeanResult = (double) arithmeticMean / 5.0;

        System.out.println("Media aritmetica a notelor este: " + arithmeticMeanResult);

        //exercise #5
        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Ce nota ai luat la info?");
        int notaInfo = scanner5.nextInt();

        if (notaInfo >= 5)
            System.out.println("Promovat! Felicitari");
        else
            System.out.println("Nepromovat! Te asteptam la toamna!");

        //exercise #6
        Scanner scanner6 = new Scanner(System.in);

        System.out.println("Introduceți nota la informatică: ");
        int nota = scanner6.nextInt();

        if (nota >= 8) {
            System.out.println("Foarte bine");
        } else if (nota >= 5) {
            System.out.println("Bine");
        } else
            System.out.println("Insuficient");

        //exercise #7
        Scanner scanner7 = new Scanner(System.in);

        System.out.println("Scrie un numar par sau impar: ");
        int n = scanner7.nextInt();

        if (n % 2 == 0)
            System.out.println("Par");
        else
            System.out.println("Impar");


        //exercise #9
        Scanner scanner9 = new Scanner(System.in);

        System.out.println("Introdu numarul zilei");
        int numarIntrodus = scanner9.nextInt();

        switch (numarIntrodus) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Ai introdus un alt numar");
        }

        //exercise #10
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Primul numar: ");
        int a = scanner10.nextInt();
        System.out.println("Al doilea numar");
        int b = scanner10.nextInt();
        System.out.println("Al treilea numar");
        int c = scanner10.nextInt();
        String newNumber = String.valueOf(a) + String.valueOf(b) + String.valueOf(c);
        System.out.println("Noul numar este: " + newNumber);

        //exercise #11
        Scanner scanner11 = new Scanner(System.in);
        System.out.println("Numere consecutive 1: ");
        int numarConsec = scanner11.nextInt();
        System.out.println("Numere consecutive 2: ");
        int numarConsec2 = scanner11.nextInt();

        if (Math.abs(numarConsec - numarConsec2) == 1) //we use this formula to find out if the equation result
                    //is 1
            System.out.println("Numerele sunt consecutive");
        else
            System.out.println("Numerele nu sunt consecutive");

        //exercise #12
        Scanner scanner12 = new Scanner(System.in);

        System.out.println("Introdu numarul lunii: ");
        int month = scanner12.nextInt();
        String season;
        switch (month) {
                    case 12:
                    case 1:
                    case 2:
                        season = "Iarna";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        season = "Primavara";
                        break;
                    case 6:
                    case 7:
                    case 8:
                        season = "Vara";
                        break;
                    case 9:
                    case 10:
                    case 11:
                        season = "Toamna";
                        break;
                    default:
                        season = "Invalid month";
                        break;
                }
                System.out.println("Season for month " + month + " is: " + season);
                scanner12.close();

                }


        }








