package Aaron.week_1;

public class Finra {
    public static void main(String[] args) {
        FINRA();
    }

    public static void FINRA() {
        String result = "";
        for (int i = 1; i <= 30; i++) { //iterate from 1 to 30
            if (i % 5 == 0 && i % 3 == 0) //multiple of both 3 and 5, print "FINRA" instead of the number.
                result += "FINRA ";
            else if (i % 5 == 0) //multiple of 5, print "RA" instead of the number.
                result += "RA ";
            else if (i % 3 == 0)
                result += "FIN ";  //multiple of 3, print "FIN" instead of the number.
            else
                result += i + " ";
        }
        System.out.println(result);
    }
}
/*
 FINRA:
Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */