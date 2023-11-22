import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;

public class Homework1 {

    public static void main(String[] args) {

    /* Display the sum of 5+10, using two variables x and y
     int x = 5, y = 10, sum; // declaring the
     sum = x + y;
     System.out.println("The result of the equation is" + " " + sum);

     //Create the next type of variables: string, int, float
      int value = 20;
      float decimalNumber = 10;
      String name = "java";

      //Declare two numbers and display the multiplied result
        double a = 10.25;
        double b = 5.7;
        System.out.println(a * b);

      //Declare 3 tickets in 3 variables, save the sum and print it
       int ticket1 = 10, ticket2 = 20, ticket3 = 30;
       int totalPrice = ticket1 + ticket2 + ticket3;
       System.out.println(totalPrice);

      //Save in a variable the sum of 142+9.38 and print it (do we first convert int into double?)
        int firstNumber = 142;
        double secondNumber = 9.38;
        double result = firstNumber + secondNumber;
        System.out.println(result);

      // Declare firstname, lastname and print the character length
      String firstName = "John";
      String lastName = "John";
      String fullName = firstName + lastName;
      System.out.println("Numele complet are" + " " + fullName.length() + " " + "caractere");


      //Declare length, width, and print area

      int length = 20;
      int width = 5;
      System.out.println("Aria dreptunghiului este" + " " + length*width + " " + "cm");

      //Write a program to calculate the length of a string in "Eu merg la mare" -> 15
        String whatever= "Eu merg la mare";
        System.out.println(whatever.length());

      //Remove first n characters from a string in "Ana are mere" if n=3 print "are mere"
      String sentence = "Ana are mere";
      sentence = sentence.substring(3);
      System.out.println(sentence);

      // Having the string "Coral is either the stupidest animal or the smartest rock" declare...
        String str = "Coral is either the stupidest animal or the smartest rocks";
        String newStr = str.replace("the", "THE");
        System.out.println(newStr);

      // Count the number of words
      String string = "Coral is either the stupidest animal or the smartest rocks";
      int countWord = string.split("the", 3).length;
      System.out.println(countWord);

      // Declare a string that is made from the first 5 character and the last 5
      String string1 = "Coral is either the stupidest animal or the smartest rocks";
      String string2 ="Coral";
      String string3 = "rocks";
      System.out.println(string2 + string3);
      System.out.println(string2.concat(string3));

      //daca lungimea e 10 ultimul element va fi pe pozitia 9 pentru ca incepem de la 0
      String text = "Coral is either the stupidest animal or the smartest rock";
      System.out.println("lungime " + text.length()); // ca sa aflam lungimea totala a textului
      System.out.println("substring cu 1 parametru: " + text.substring(6)); // afisam de la indexul 6,
        // pana la indexul 6 nu afisam nimic
      System.out.println("substring cu doi parametrii: " + text.substring(6,15)); // afisam intre indexele 6-15 textul
      System.out.println("substring cu doi parametrii: " + text.substring(text.length()-3)); // din totalul
        //de 57 de caractere afisam doar ultimele 3
      System.out.println("Substring fara ultimele caractere: " + text.substring(0,(text.length() -2))); // afisam textul
        // de la indexul 0 pana la lungimea 57-2

        // Declare a string that is made from the first 5 character and the last 5
        String text2 = "Coral is either the stupidest animal or the smartest rock";
        System.out.println("lungimea: " + text2.substring(0,5) + text2.substring((text2.length() -5))); // afisam textul
        //format din primele 5 caractere de la indexul 0 pana la 5, si ultimele 5 caractere format din ultimele 5 ch


        //afisati de cate ori apare cuvantul "the"
        String text3 = "Coral is either the stupidest animal or the smartest rock";
        String noThe = text3.replaceAll("the","");
        System.out.println("textul fara the: " +noThe);
        int the = (text.length() - noThe.length())/3;
        System.out.println("numarul the: " + the);
*/

        //Verificare imbarcare

        Scanner scanner20 = new Scanner(System.in);
        System.out.println("Intrduceti varsta: ");
        int varsta = scanner20.nextInt();

        System.out.println("Aveti pasaport?");
        boolean hasPasaport = scanner20.nextBoolean();

        System.out.println("Sunteti insotit de mama?");
        boolean insotitDeMama = scanner20.nextBoolean();

        System.out.println("Sunteti insotit de tata");
        boolean insotitDeTata = scanner20.nextBoolean();

        System.out.println("Aveti permisiune de la mama?");
        boolean hasActPermisiuneMama = scanner20.nextBoolean();

        System.out.println("Aveti permisiunea de la tata?");
        boolean hasActPermisiuneTata = scanner20.nextBoolean();


        //Conditii de imbarcare
        if (varsta >= 18 && hasPasaport) {
            System.out.println("Puteti imbarca");
        } else if (varsta < 18 && hasPasaport && insotitDeTata && insotitDeMama) {
            System.out.println("Puteti imbarca");
        } else if (varsta < 18 && hasPasaport && ((insotitDeTata && hasActPermisiuneMama) || (insotitDeMama && hasActPermisiuneTata))) {
            System.out.println("Puteti imbarca");
        } else {
            System.out.println("Nu puteti imbarca");

        }



        }

    }










