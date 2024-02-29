package Homework9;

public class Angajat {
    private String nume;
    private String prenume;
    private double salariu;

    public Angajat(String nume, String prenume, double salariu){
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
    }

    public void descrie() {
        System.out.println("Numele angajatului: " + nume);
        System.out.println("Prenumele angajatului " + prenume);
        System.out.println("Salariul angajatului: " + salariu);
    }

    public String numeComplet(){
        return nume + " " + prenume;
    }

    public double salariuLunar(){
        return salariu;

    }

    public double salariuAnual() {
        return salariu * 12;
    }

    public void marireSalariu (double procent){
        salariu *= (1+ procent/100);
    }

    public static void main(String[] args) {
        Angajat angajat = new Angajat("Ilie", "Ana", 1200);
        angajat.descrie();
        System.out.println("Nume complet: " + angajat.numeComplet());
        System.out.println("Salariu lunar: " + angajat.salariuLunar());
        System.out.println("Salariu anual " + angajat.salariuAnual());

        angajat.marireSalariu(10);
        System.out.println("Noul salariu: ");
        angajat.descrie();
        System.out.println("Salariu lunar: " + angajat.salariuLunar());
    }
}
