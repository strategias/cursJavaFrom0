import java.util.Scanner;

public class Homework6_exercise3 {
    //Pentru trei numere întregi a, b şi c, să se calculeze maximul,
    //minimul şi media aritmetică a celor trei numere, folosind o metodă
    //separată ce are ca parametrii trei numere întregi şi care returnează trei
    //rezultate: maximul, minimul şi media aritmetică a celor trei numere. (void)

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;


        int maxim = calculeazaMaxim(a, b, c);
        int minim = calculeazaMinim(a, b, c);
        double media = calculeazaMedia(a, b, c);

        System.out.println("Maximul: " + maxim);
        System.out.println("Minimul: " + minim);
        System.out.println("Media aritmetica: " + media);

        //exercise 4 de aici:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceți un text:");
        String text = scanner.nextLine();

        boolean gasita = cautaLiteraA(text);

        if (gasita) {
            System.out.println("Textul conține litera 'A'.");
        } else {
            System.out.println("Textul nu conține litera 'A'.");
        }

        scanner.close();

        // :pana aici
    }

    public static int calculeazaMaxim(int numar1, int numar2, int numar3) {
        return Math.max(numar1, Math.max(numar2, numar3));
    }

    public static int calculeazaMinim(int numar1, int numar2, int numar3) {
        return Math.min(numar1, Math.min(numar2, numar3));
    }

    public static double calculeazaMedia(int numar1, int numar2, int numar3) {
        return (numar1 + numar2 + numar3) / 3.0;


    }

    public static boolean cautaLiteraA(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
                return true;
            }
        }
        return false;


    }
}

