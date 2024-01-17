public class curs5 {
    public static void main(String[] arg) {
        int sum = 0;
        for (int i = 100; i <= 200; i += 13){
            System.out.println(i);
            //continue sare peste o iteratie
            if (i == 152){
                continue;
            }
            sum = sum+i;
            // break iese din iteratie
            if (sum > 500){
                break;
            }
        }
        System.out.println("Suma este " + sum);
    }

}
