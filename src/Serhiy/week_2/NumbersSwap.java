package Serhiy.week_2;

/**
 *  Numbers -- Swap Numbers
 * Swap two variable values without using a third variable
 */
public class NumbersSwap {

    public static void main(String[] args) {

        //solution 1 by using addition and subtraction of math operators

        int num1 = 5;
        int num2 =8;

        num1 = num1 + num2; // 5+8=13 --> num1 = 13
        num2 = num1 - num2; // 13-8=5 --> num2 = 5
        num1 = num1 - num2; // 13-5=8 --> num1 = 8

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //solution 2 by using the 3rd variable

        int num01 = 5;
        int num02 =8;
        int temp =0;

        temp = num01; // assign 5 to temporary variable
        num01 = num02; // assign 8 to num01
        num02 = temp; // assign 5 to num02


        System.out.println("num01 = " + num01);
        System.out.println("num02 = " + num02);


    }
}
