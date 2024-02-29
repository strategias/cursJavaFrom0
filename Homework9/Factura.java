package Homework9;

import java.time.LocalDate;

public class Factura {
    private final String serie = "CJ";
    private int numar;
    private String numeProdus;
    private int cantitate;
    private double pretBuc;

    public Factura(int numar, String numeProdus, int cantitate, double pretBuc){
        this.numar = numar;
        this.numeProdus = numeProdus;
        this.cantitate = cantitate;
        this.pretBuc = pretBuc;
    }

    public void schimbaCantitatea(int cantitate) {
        this.cantitate = cantitate;
    }

    public void schimbaPretul(double pretBuc) {
        this.pretBuc = pretBuc;
    }
    public void schimbaNumeProdus(String numeProdus) {
        this.numeProdus = numeProdus;
    }

    public void genereazaFactura(){
        System.out.println("Factura cu seria " + serie + " numar " + numar);
        System.out.println("Data: " + LocalDate.now());
        System.out.println("Produs        | Cantitate | Pret bucata | Total");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-12s | %-9d | %-12.2f | %.2f%n", numeProdus, cantitate, pretBuc, cantitate *pretBuc);

    }

    public static void main(String[] args) {
        Factura factura = new Factura(514, "Telefon", 7, 700);
        factura.genereazaFactura();

        factura.schimbaCantitatea(10);
        factura.schimbaPretul(750);
        factura.genereazaFactura();
    }
}
