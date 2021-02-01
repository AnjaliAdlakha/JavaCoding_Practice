package JavaCodes;

public class PalindromeNumber {

    public static boolean isPalindromeNumber(int num) {
        System.out.println("Given Number is:" + num);
//maintaining variables r means reverse variable, which I will declare with zero
        int r = 0;//reverse variable
        int sum = 0;//sum variable
        int t;//temporary variable

        t = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }
        if (t == sum) {

            System.out.println("palindrome number");
          return true;

        } else {

            System.out.println("not palindrome number");
            return false;
        }
    }
        public static void main (String[]args){
            isPalindromeNumber(151);

        }

    }