public class testEnv {
        public static void main(String[] args) {
          /*  for (int i = 1; i <=4 ; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print("*");
                }
                System.out.println(); */

            /*for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); */
           /*
            for (int i = 1; i <= 5; i++) {
                for (int space = 1; space <= 5-i; space++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); */
            /* for (int i = 1; i <= 5; i++) {
                for (int space = 1; space <= 5-i; space++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2* i-1; j++) {
                    System.out.print("*");
                }

                System.out.println(); */

           /* for (int i = 1; i <= 5; i++) {

                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print(i);
                }

                System.out.println(); */

            for (int i = 1; i <= 5; i++) {
                // Print spaces before numbers
                for (int space = 1; space <= 5- i; space++) {
                    System.out.print(" ");
                }

                // Print ascending numbers
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }

                // Print descending numbers, excluding the first one
                for (int k = 2; k <= i; k++) {
                    System.out.print(k);
                }

                System.out.println();
            }
        }
}


