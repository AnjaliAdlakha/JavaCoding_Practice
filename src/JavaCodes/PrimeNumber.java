package JavaCodes;

public class PrimeNumber {
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

        public static void getPrimeNumbers(int num){

            for(int i =2; i<=num; i++)
                if (isPrimeNumber(i)) {
                    System.out.println(i + " ");
                }
        }

        public static void main(String[] args){
            System.out.println("2 is prime number:"+isPrimeNumber(2));
            System.out.println("10 is prime number:"+isPrimeNumber(10));
            System.out.println("0 is prime number:"+isPrimeNumber(0));
            System.out.println("-2 is prime number:"+isPrimeNumber(-2));

            getPrimeNumbers(13); //2 3 5 7 11 13
            getPrimeNumbers(19); //2 3 5 7 11 13 15 17 19
        }
    }