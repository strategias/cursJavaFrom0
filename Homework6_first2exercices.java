public class Homework6_first2exercices {
        public static void main(String[] args) {
            int count = NumerePatruCifre();
            System.out.println("Numerele sunt: " + count);

            displayDivizor(6); // inlocuim parametrul din metoda cu ce nr vrem
        }

        public static int NumerePatruCifre() {
            int count = 0;

            for (int i = 1000; i <= 9999; i++) {
                if (i % 67 == 23) {
                    System.out.println(i);
                    count++;
                }
            }

            return count;
        }




    public static void displayDivizor(int numar) {
        System.out.println("Divizorii lui " + numar + " sunt:");

        for (int i = 1; i <= numar; i++) {
            if (numar % i == 0) {
                System.out.println(i);
            }
        }
    }
    }


