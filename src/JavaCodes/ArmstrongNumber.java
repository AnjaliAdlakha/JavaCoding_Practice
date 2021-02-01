package JavaCodes;

public class ArmstrongNumber {

        public static void isArmstrongNumber(int num){
            System.out.println("given number is" + num);
//declaring variables
            int cube=0;//initializing the local variable (cube)with zero by default
            int r;
            int t;
            t=num;//giving the value of num to t, so that i can use this t later for comparison

            while(num>0){
                // get the remainder and divide the number by 10, so after every while loop iteration, number will be decreased
                r = num%10;
                num = num/10;
//whatever remainder is there, you have to multiple the remainder 3 times and add with cube so every time cube will be increased
                cube = cube+(r*r*r);
            }

            if(t==cube){
                System.out.println("this is armstrong number");

            }  else{

                System.out.println("this is armstrong number");

            }}

    public static void main(String[]args){
        isArmstrongNumber(153);
        isArmstrongNumber(0);
    }

}
