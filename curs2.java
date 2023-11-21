import java.util.Scanner;

public class curs2 {

    public static void main(String[] args) {

       /*System.out.println("Care este varsta ta?");
        Scanner scanner0 = new Scanner(System.in); //read the input
        int age = scanner0.nextInt();
        System.out.println("Varsta introduse este " + age);
        System.out.println("Introdu textul");
        Scanner scanner1 = new Scanner(System.in);
        String message = scanner1.nextLine();
        System.out.print("Care este numarul? ");
        Scanner scanner2 = new Scanner(System.in);
        int number = scanner2.nextInt();
        System.out.println(message.substring(0,number) + message.substring((message.length() -number)) ); */

        // simple if method
        // un angajat castiga 10.000 de lei, daca si-a respectat targetu de 10 vanzari primeste inca 2500 de lei
       /* int salary = 10000;
        int bonus = 2500;
        int sales = 10;
        System.out.print("Numarul de vanzari");
        Scanner scanner = new Scanner(System.in);
        int salesPerEmployee = scanner.nextInt();
        if(salesPerEmployee> sales) {
            salary = salary +bonus;
        System.out.println("Noul salariu este " + salary); */

       /* int salary = 10000;
        int bonus = 2500;
        int sales = 10;
        int requiredYear = 2;
        int yearsEmployee = 6;

        System.out.print("Numarul de vanzari");
        Scanner scanner = new Scanner(System.in);
        int salesPerEmployee = scanner.nextInt();
        scanner.close();

        if(salesPerEmployee>= sales && yearsEmployee > requiredYear ) {
            salary = salary + bonus;
        }else{
            salary = salary - bonus;
            System.out.println("Noul salariu este " + salary);
*/

        // nested if

        System.out.println("Scrie ceva: ");
        Scanner scanner5 = new Scanner(System.in);
        String newString = scanner5.next();
        if (newString.matches("[a-zA-Z]+")) {
            System.out.println("true");
        } else if (newString.matches("[0-9]+")){
            System.out.println("false");
        }
    }
}


