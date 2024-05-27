package freetasks;

import java.util.Scanner;

public class PerfectNumber {/* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to check whether it is a perfect number or not :");
        int num = scan.nextInt();

        int divisor = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisor = divisor+i;


            } else {

            }
        }
        if (divisor == num) {

            System.out.println("Perfect number!!!");
        } else {
            System.out.println("Try another number :(");
        }


    }
}
