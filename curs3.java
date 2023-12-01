import java.util.Scanner;

public class curs3 {
    public static void main(String[] args) {
        // avem numerele de la 1 la 7 si fiecare reprezinta o zi
        int day = 5;
        if (day == 1) {
            System.out.println("Luni");
        } else if (day == 2)
            System.out.println("Marti");
        else if (day == 3)
            System.out.println("Miercuri");
        else if (day == 4)
            System.out.println("Joi");
        else if (day == 5)
            System.out.println("Vineri");
        else if (day == 6)
            System.out.println("Sambata");
        else if (day == 7)
            System.out.println("Duminica");
        else
            System.out.println("Data invalida");


        switch (day) {
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
                System.out.println("Date invalide");

                // caz de switch pentru telefon
                Scanner scanner = new Scanner(System.in);
                System.out.println("Apasati o tasta: ");
                int tasta = scanner.nextInt();

                switch (tasta) {
                    case 1:
                        System.out.println("Romana");
                        break;
                    case 2:
                        System.out.println("Engleza");
                        break;
                    case 3:
                        System.out.println("Redirectionat");
                        break;
                    default:
                        System.out.println("Tasta invalida");


                        // short if else
                        int time = 20;

                        time = 10;
                        String result = (time > 18) ? "Este seara" : "este zi";
                        System.out.println(result);


                }


        }
    }
}
