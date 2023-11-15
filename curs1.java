public class curs1 {
    public static void main(String[] args) {
       System.out.println("hello");

        //variabile primitive
        int speedMax = 230; // numere intregi pozitive si negative
        double costCar = 9.9; //numere cu punct
        final double costCars = 9.9; // final nu te lasa sa mai modifici
        char letter = 'A';
        boolean expensive = true;
        String carBrand = "BMW"; // non primitive

        System.out.println(carBrand + speedMax);
        System.out.println(costCar);
        int x,y,z;
        x=y=z=50;
        int a=5, b=6, c=7; //mai multe variabile declarate deodata


        // operatori aritmetici: +,-,*,/,%,++, --
        int restul = 6%5;
        System.out.print("costul este" + restul);
        restul = restul+1;
        System.out.print("costul este" + restul);
        restul++;
        System.out.println("costul este" + restul);
        restul --;
        System.out.println("costul este" + restul);

        //operatori de atributie: +=; -=;*=
        restul = restul +5;

        //operatori de comparare: ==; !=; >;<; <=; >=
        //operatori logici: &&, !!, !


    }













}


