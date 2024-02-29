package Homework9;

public class Dreptunghi {
    private double lungime;
    private double latime;
    private String culoare;

    public Dreptunghi(double lungime, double latime, String culoare) {
        this.lungime = lungime;
        this.latime = latime;
        this.culoare = culoare;
    }

        public void descrie() {
            System.out.println("Culoarea dreptunghiului: " + culoare);
            System.out.println("Latimea dreptunghiului: " + latime);
            System.out.println("Lungimea dreptunghiului: " + lungime);
        }

        public double aria() {
            return lungime * latime;

        }

        public double perimetru() {
            return 2 * (lungime + latime);

        }
        public void schimbaCuloarea (String nouaCuloare){
            this.culoare = nouaCuloare;
        }

        public static void main(String[] args) {
            Dreptunghi dreptunghi = new Dreptunghi (5,3.0,"red");
            dreptunghi.descrie();
            System.out.println("Aria " + dreptunghi.aria());
            System.out.println("Perimetrul: "+ dreptunghi.perimetru());

            dreptunghi.schimbaCuloarea("green");
            System.out.println("Noua culoare: ");
            dreptunghi.descrie();
        }
    }

