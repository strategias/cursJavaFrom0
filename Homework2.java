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

                    //k,l,o laturile unui triunghi, verificam daca triunghiul e isoscel, echilateral sau oarecare
                    Scanner scanner14 = new Scanner(System.in);
                    System.out.println("Introdu latura k");
                    double k = scanner14.nextDouble();
                    System.out.println("Introdu latura l");
                    double l = scanner14.nextDouble();
                    System.out.println("Introdu latura o");
                    double o = scanner14.nextDouble();
                    if (k == l && l == o)
                        System.out.println("Triunghiul este echilateral");
                    else if (k == l || l == o || o == k)
                        System.out.println("Triunghiul este isoscel");
                    else
                        System.out.println("Triunghiul este oarecare");

                    //Citeste o litera de la tastatura si verifica daca e o vocala sau o consoana
                    System.out.println("Scrie o litera: ");
                    Scanner scanner15 = new Scanner(System.in);
                    if (scanner15.hasNext("[aeiouAEIOU]")) {
                        System.out.println("e vocala");
                    } else if (scanner15.hasNext("[a-zA-Z]")) {
                        System.out.println("e consoana");

                        //Transforma si printeaza notele din sistem romanesc - perfect example to use switch here
                        System.out.println("Ce nota ai luat?");
                        Scanner scanner16 = new Scanner(System.in);
                        int nota = scanner16.nextInt();
                        if (nota <= 4)
                            System.out.println("F");
                        else if (nota >= 4)
                            System.out.println("E");
                        else if (nota >= 6)
                            System.out.println("D");
                        else if (nota >= 7)
                            System.out.println("C");
                        else if (nota >= 8)
                            System.out.println("B");
                        else if (nota >= 9)
                            System.out.println("A");

                        //Verifica daca x are minim 4 cifre/ exact 6 cifre
                        System.out.println("Introdu cifrele: ");
                        Scanner scanner17 = new Scanner(System.in);
                        int cifra = scanner17.nextInt();
                        int cifraString = String.valueOf(cifra).length();
                        int minlength = 4;
                        int exactlength = 6;
                        int numberpar = cifra / 2;

                        if (cifraString >= minlength) {
                            System.out.println("Are cel putin 4 cifre");
                        } else if (cifraString < minlength) {
                            System.out.println("Are mai putine cifre");
                        } else if (cifraString == exactlength) {
                            System.out.println("Are exact 6 cifre");

                        // Verifica daca x este numar par sau impar
                            System.out.println("Introdu cifrele: ");
                            Scanner scanner18 = new Scanner(System.in);
                            int numarul = scanner18.nextInt();
                            if (numarul % 2 == 0)
                                System.out.println("Par");
                            else
                                System.out.println("Impar");


                        // x,y,z integers, afiseaza care este cele mai mari dintre ele
                            Scanner scanner19 = new Scanner(System.in);
                            System.out.println("Introdu trei numere");

                            int num1 = scanner19.nextInt();
                            int num2 = scanner19.nextInt();
                            int num3 = scanner19.nextInt();

                            int celMaiMare = num1;


                            if (num2 > celMaiMare) {
                                celMaiMare = num2;
                                if (num3 > celMaiMare)
                                    celMaiMare = num3;
                            }

                            System.out.println("Cel mai mare numar e " + celMaiMare);









                        }
                    }
                }
            }
        }
    }
}



















