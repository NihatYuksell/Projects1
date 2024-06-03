package freetasks;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Programı çalıştırmak için harf girin");
            String data = input.next().toLowerCase();
            if(data.equals("x")){
                System.out.println("Program bitti");
                break;
            }else {
                System.out.println("Program çalışıyor");

            }
        }while (true);
    }
}
