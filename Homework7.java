import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework7 {
    public static void main(String[] args) {

        String[] noteMuzicale = {"do", "re", "mi", "fa", "sol", "la", "si", "do"};

        int count = 0;
        for (String nota : noteMuzicale) {
            if (nota.equals("do")) {
                count++;
            }
            System.out.println(nota);
        }
        System.out.println("Do apare de " + count + " ori");

        List<Integer> listaUnificata = listeUnificate();
        stergeZero(listaUnificata, 0);

        if (!listaUnificata.isEmpty()) {
            int max = Collections.max(listaUnificata);
            int min = Collections.min(listaUnificata);

            System.out.println("Valoarea maxima din lista este: " + max);
            System.out.println("Valoarea minima din lista este: " + min);
        } else {
            System.out.println("Lista este goala!");
        }
    }

    public static List<Integer> listeUnificate() {
        int[] lista1 = {3, 1, 0, 2};
        int[] lista2 = {6, 5, 4};

        List<Integer> listaUnificata = new ArrayList<>();



        for (int numar : lista1) {
            listaUnificata.add(numar);
        }

        for (int numar : lista2) {
            listaUnificata.add(numar);
        }

        System.out.println("Lista noua unificata: " + listaUnificata);

        Collections.sort(listaUnificata);

        System.out.println("Lista sortata: " + listaUnificata);


        return listaUnificata;

    }

    public static void stergeZero(List<Integer> array, int zero) {
        array.remove(Integer.valueOf(zero));

        System.out.println("Lista noua fara zero: " + array);

    }
}

