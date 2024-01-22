public class curs6 {

        public static void main(String[] args) {

            for (int i = 1; i <= 4; i++) {
                System.out.println("Saptamana " + i);
                for (int j = 1; j <= 7; j++) {
                    System.out.println("  Ziua " + j);
                }
            }

            for (int i = 1; i < 10; i++) {
                System.out.println(i);
                printNumbers(i);
                int sum = getSum(1, 2);
                double salarNou = getMarireSalar(7700, 20);
                boolean isParResult = isPar(20);
                System.out.println("Is Par: " + isParResult);
            }
        }

        public static void printNumbers(int numbers) {
            for (int i = 1; i <= numbers; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

        public static int getSum(int a, int b) {
            return a + b;
        }

        public static double getMarireSalar(double salar, double marire) {
            double salarNou = salar + (marire / 100.0) * salar;
            System.out.println("Salar nou: " + salarNou);
            return salarNou;
        }

        public static boolean isPar(int number) {
            if (number % 2 == 0) {
                System.out.println("Numarul este par");
                return true;
            } else {
                System.out.println("Numarul nu este par");
                return false;
            }
        }
    }



