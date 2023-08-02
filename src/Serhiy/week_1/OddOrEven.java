package Serhiy.week_1;

public class OddOrEven {
    /*
Numbers-Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
     */

    public static void main(String[] args) {

        OddOrEven.EvenOrOdd(5);
        OddOrEven.EvenOrOdd(6);
    }
    public static void EvenOrOdd (int num){
        if (num % 2 == 0){
            System.out.println(num +": Even");
        } else if (num % 2 != 0) {
            System.out.println(num +": Odd");
        }

    }


}
