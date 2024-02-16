import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework7_jucatori {

    public static void main(String[] args) {
        // Creem un array list cu jucatorii disponibili
        List<String> jucatori = new ArrayList<>(); //lista creata
        jucatori.add("Jucator1");
        jucatori.add("Jucator2");
        jucatori.add("Jucator3");
        jucatori.add("Jucator4");
        jucatori.add("Jucator5");

        int schimbariMaxime = 3; //declaram o variabila care sa contina nr maxim de schimbari
        int schimbariEfectuate = 0; //declaram o variabila ce se poate schimba care sa tina evidenta schimbarilor

        // Loop pentru efectuarea schimbarilor
        while (schimbariEfectuate < schimbariMaxime) { //loop-ul care cere numele jucatorilor
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceti numele jucatorului care trebuie sa intre in teren: ");
            String jucatorIn = scanner.nextLine();

            // Verificam daca jucatorul cerut este în lista de jucatori disponibili
            if (jucatori.contains(jucatorIn)) { // jucatori. fiind array-ul in care sunt jucatorii
                // Selectam un jucator care iese din teren (jucatorul de pe pozitia 0)
                String jucatorOut = jucatori.get(0);
                jucatori.remove(0);

                // Adaugam jucatorul care intra in teren
                jucatori.add(jucatorIn);
                schimbariEfectuate++; //schimbam valoarea schimbarilor efectuate cu +1

                // Afișam mesajul corespunzator
                System.out.println("A intrat " + jucatorIn + ", a iesit " + jucatorOut + ", mai aveti " + (schimbariMaxime - schimbariEfectuate) + " schimbari disponibile.");
            } else {
                // Afișam mesajul de eroare daca jucatorul nu este în lista de jucatori disponibili
                System.out.println("Nu se poate efectua schimbarea deoarece jucatorul " + jucatorIn + " nu este in teren. Mai aveti " + (schimbariMaxime - schimbariEfectuate) + " schimbari disponibile.");
            }
        }

        System.out.println("Ati atins numarul maxim de schimbari permise.");
    }
}

