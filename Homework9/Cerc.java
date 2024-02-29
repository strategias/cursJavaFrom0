package Homework9;

public class Cerc {
    private double raza;
    private String culoare;

    // Constructor
    public Cerc(double raza, String culoare) {
        this.raza = raza;
        this.culoare = culoare;
    }

    // Metoda pentru a printa descrierea cercului
    public void descrieCerc() {
        System.out.println("Culoarea: " + culoare);
        System.out.println("Raza: " + raza);
    }

    // Metoda pentru a calcula aria cercului
    public double aria() {
        return Math.PI * raza * raza;
    }

    // Metoda pentru a calcula diametrul cercului
    public double diametru() {
        return 2 * raza;
    }

    // Metoda pentru a calcula circumferința cercului
    public double circumferinta() {
        return 2 * Math.PI * raza;
    }

    public static void main(String[] args) {
        // Exemplu de utilizare
        Cerc cerc = new Cerc(5.0, "rosu");
        cerc.descrieCerc();
        System.out.println("Aria: " + cerc.aria());
        System.out.println("Diametrul: " + cerc.diametru());
        System.out.println("Circumferinta: " + cerc.circumferinta());
    }
}


