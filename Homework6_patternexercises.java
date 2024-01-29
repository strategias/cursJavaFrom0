public class Homework6_patternexercises {

    public static void main(String[] args) {

        int size = 4;
        printStarPattern(size);

        /*int dimensiune = 5;


        for (int i = 0; i < dimensiune; i++) {
            for (int j = 0; j < dimensiune; j++) {
                if (i % 2 == 0) {
                    System.out.print("- ");
                } else {
                    if (j % 2 == 0) {
                        System.out.print("+ ");
                    } else {
                        System.out.print("- ");
                    }
                }
            }
            System.out.println(); */
    }

        public static void printStarPattern(int size) {
            for (int i = 0; i < size; i++) {
                // Print spaces
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = 0; k < size - i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }

            for (int i = 2; i <= size; i++) {
                // Print spaces
                for (int j = size; j > i; j--) {
                    System.out.print(" ");
                }

                // Print stars
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    }







