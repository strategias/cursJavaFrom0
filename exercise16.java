public class exercise16 {

        public static void main(String[] args) {
            int num, rem, temp, sum;
            System.out.println("Armstrong numbers between 1 and 500:");

            for (int i = 1; i <= 500; i++) {
                num = i;
                sum = 0;

                temp = num;
                while (temp != 0) {
                    rem = temp % 10;
                    sum += rem * rem * rem;
                    temp /= 10;
                }

                if (sum == num) {
                    System.out.println(num);
                }
            }
        }
    }

