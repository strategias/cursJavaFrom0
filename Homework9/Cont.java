package Homework9;

public class Cont {
    private String iban;
    private String titularCont;
    private double sold;

    public Cont(String iban, String titularCont, double sold) {
        this.iban = iban;
        this.titularCont = titularCont;
        this.sold = sold;

    }

    public void afisareSold() {
        System.out.println("Titularul " + titularCont + " are in contul " + iban + " suma de " + sold + "lei");
    }

    public void debitareCont(double suma) {
        if (suma <= sold) {
            sold -= suma;
            System.out.println("S-a debitat din contul " + iban + " cu suma de " + suma + " lei" + " Soldul curent: " + sold);
        } else {
            System.out.println("Sold insuficient.");
        }
    }

        public void creditareCont ( double suma){
            sold += suma;
            System.out.println("S-a creditat contul " + iban + " cu suma de " + suma + " Soldul curent: " + sold);
        }

        public static void main(String[]args){
            // Exemplu de utilizare
            Cont cont = new Cont("RO123456789", "Ana Maria", 1000.0);
            cont.afisareSold();

            cont.debitareCont(500);
            cont.afisareSold();

            cont.creditareCont(300);
            cont.afisareSold();
        }
    }


