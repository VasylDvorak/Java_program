package org.example;

public class Main {
    public static void main(String[] args) {


        System.out.println(getFractionDigitsCount(5.1234567897f));










    }



     static int getFractionDigitsCount(float digit2) {
        digit2 = Math.abs(digit2);



        if (digit2 >= 1)
            digit2 = digit2 - (int) digit2;
        if (digit2 == 0)
            return 0;

        digit2 *= 10;

        int count = 1;
         System.out.println(digit2);
        while ((digit2 - (int) digit2) != 0) {
          // System.out.println("**********"+(digit2 - (int) digit2));
            digit2 *= 10;
            count++;
            System.out.println(count);
        }

        return count;



    }


}