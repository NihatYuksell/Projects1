package freetasks;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen aralarında boşluk bırakarak 3 kelime yazınız: ");
        String kelime = input.nextLine();


        String[] words = kelime.split(" ");

        if (words.length==3){
            char first = words[0].charAt(0);
            char second = words[1].charAt(0);
            char third = words[2].charAt(0);

            String formatted = first +","+ second +","+ third;
            System.out.println("formatted = " + formatted);
        }else {
            System.out.println("Lütfen aralarında boşluk olan 3 kelime giriniz.");
        }
        input.close();

    }
}
