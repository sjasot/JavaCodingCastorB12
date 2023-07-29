package Serhiy.week_1;
public class DivisionWithoutOperator {
    /*
Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
     */

    public static void main(String[] args) {

        divide(12,5);
    }

    public static void divide(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Invalid Number"); // no division on 0 is allowed
            return; // returns 0
        }

        int count = 0;
        while (numerator >= denominator) { // if condition is true
            numerator -= denominator;      // subtract denominator from numerator (numerator - denominator)
            count++; // count will increase by 1 until the condition is true
        }
        System.out.println(count + " and remainder is " + numerator);
    }


}
