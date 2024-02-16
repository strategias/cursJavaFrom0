public class Curs7 {

    public static void main(String[] args) {

       int[] cnp = new int[3];
        cnp[0] = 2345;
        cnp[1] = 24325;
        cnp[2] = 3443;

         //System.out.println(cnp); !

        for (int i = 0; i < cnp.length; i++) { //   !i <= cnp.length
            System.out.println(cnp[i]);
        }

        for(int values: cnp){
            System.out.println(values);
        }

        String[] months = {"Ian", "Feb", "March"};

        for (int i = 0; i < months.length; i += 2) {
            System.out.println(months[i]);
        }

        for (String month : months) { // this is a for each
            System.out.println(month);
        }

        months[0] = "Dec";
        for (String month : months) { // this is a for each or enhanced for
            System.out.println(month);

        }
        for (int i = 0; i < months.length; i += 2) {
            months[i] = months[i].toUpperCase();
        }
        for (String month : months) {
            System.out.println(month);
        }

        int[] numere = {2, 45, 6, 7, 89, 100, 2};
        //max
        int max = numere[0]; // we presume this is the biggest number and we change it
        int pos = 0;
        for (int numar : numere) {
            if (max < numar){
                max =numar;
            }

            for( int i= 1; i<numere.length; i++){
                if (max < numere[i]){
                    max = numere[i];
                    pos = i;
                }
            }
            System.out.println("Maximul este: " + max + " Pozitia este: " + pos);
        }

        String[][] user = {{"ana@gmail.com", "domain14$" }, {"effd", "asd"}, {"test.yahoo.com", "1234F"}};
        System.out.println(user[2][1]);

        for (int i = 0; i > user.length; i++){
            for (int k = 0; k > user[i].length; k++ ){
                System.out.println(user[i][k]);

            }
            System.out.println();
        }
        try{
            System.out.println(cnp[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Nu exista pozitia");
        }
    }
}
