import java.util.Scanner;

public class Homework2 {


    public static void main(String[] args) {

        /*Citim un string de la tastatura (10 caractere si contine litera x)
        a. printam un string format din primele 3 litere si ultimele 3
        b. inlocuim litera 'a' cu '?' peste tot si printam
        c. afisam pe ce pozitie apare litera 'x'
        d. intr-un if verificam daca prima litera e egala cu ultima, daca da afisam 'Da'
        */

        System.out.println("Scrie un string cu 10 caractere care sa contina litera x");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Stringul format din primele 3 litere si ultimele 3 este " + input.substring(0, 3)
                + input.substring((input.length() - 3)));


        System.out.println("Scrie un string cu 10 caractere care sa contina litera x");
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner.next();
        String replacedInput = input2.toLowerCase().replaceAll("a", "?");
        System.out.println("Stringul unde am inlocuit litera 'a' cu '?': " + replacedInput);

        System.out.println("Scrie un string cu 10 caractere care sa contina litera x");
        Scanner scanner3 = new Scanner(System.in);
        String input3 = scanner.next();
        System.out.println("X este pe pozitia " + input3.indexOf("x"));

        System.out.println("Scrie un string cu 10 caractere care sa contina litera x");
        String string1;
        String string2;
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter string1: ");
        string1 = scanner4.nextLine();
        System.out.println("Enter string2: ");
        string2 = scanner4.nextLine();
        if (string1.equals(string2))
            System.out.println("Da");
        else {
            System.out.println("Nu");
        }


        //citim alt string de la tastatura, verificam intr-un if daca contine doar litere sau nu
        System.out.println("Scrie ceva: "); // why doesn't it work with space between characters?
        Scanner scanner5 = new Scanner(System.in);
        String newString = scanner5.next();
        if (newString.matches("[a-zA-Z]+")) {
            System.out.println("true");
        } else System.out.println("false");
        {
        }


        //citeste de la tastatura un string de dimensiune impara, afiseaza caracterul din mijloc
        System.out.println("String de dimensiune impara: ");
        Scanner scanner6 = new Scanner(System.in);
        String string0 = scanner6.next();
        int middle = string0.length() / 2;
        char middleChar = string0.charAt(middle);
        System.out.println("Caracterul din mijloc e: " + middleChar);

        //citeste un string de la tastatura: alabala portocala, salveaza primul caracter intr-o variabila si capitalizeaza
        // acel caracter peste tot in afara de primul si ultimul
        Scanner scanner7 = new Scanner(System.in);

        System.out.println("Scrie: ");
        String originalString = scanner7.nextLine();

        System.out.println("Caracterul ce inlocuiesti: ");
        char charToReplace = scanner7.next().charAt(0);

        System.out.println("Caracterul cu ce inlocuiesti: ");
        char replacementChar = scanner7.next().charAt(0);

        String replacedString = originalString.charAt(0)
                + originalString.substring(1, originalString.length() - 1).replace(charToReplace, replacementChar)
                + originalString.substring(originalString.length() - 1);

        System.out.println("Stringul original: " + originalString);
        System.out.println("Stringul capitalizat: " + replacedString);


        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Scrie un numar");

        if (scanner8.hasNextInt()) {                           // folosim hasNextInt sa ne dam seama ce este in input
            int number = scanner8.nextInt();
            System.out.println(number + " este natural");
        }

        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Scrie un numar");
        if (scanner9.hasNextInt()) {
            int number = scanner9.nextInt();

            if (number > 0) {
                System.out.println(number + " e pozitiv");
            } else if (number < 0)
                System.out.println(number + " e negativ");
            else if (number == 0)
                System.out.println(number + " e neutru");


            Scanner scanner10 = new Scanner(System.in);
            System.out.println("Scrie un numar");
            if (scanner10.hasNextInt()) {
                int numberNew = scanner10.nextInt();
                if (numberNew > -2 && numberNew < 13)
                    System.out.println(numberNew + " este intre -2 si 13");


                Scanner scanner11 = new Scanner(System.in);
                System.out.println("Scrie primul numar: ");
                int x = scanner11.nextInt();
                System.out.println("Scrie al doilea numar: ");
                int y = scanner11.nextInt();
                int rezultat = x - y;
                if (rezultat < 5)
                    System.out.println(rezultat + " este mai mic ca 5");
                else {
                    System.out.println(rezultat + " este mai mare ca 5");


                    Scanner scanner12 = new Scanner(System.in);
                    System.out.println("Scrie un numar:");
                    int a = scanner12.nextInt();
                    if (!(a >= 5 && a <= 27))
                        System.out.println(a + " Nu este intre 5 si 27");
                    else {
                        System.out.println(a + " este intre 5 si 27");

                    }


                    Scanner scanner13 = new Scanner(System.in);
                    System.out.println("Scrie primul numar: ");
                    int m = scanner13.nextInt();
                    System.out.println("Scrie al doilea numar: ");
                    int n = scanner13.nextInt();
                    if (m == n)
                        System.out.println("Numerele sunt egale");
                    else if (m > n)
                        System.out.println(m + " este mai mare");
                    else if (m < n)
                        System.out.println(n + " este mai mare");


                }


            }
        }
    }
}

















