package freetasks;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen harf sayısı çift sayıda olan bir kelime giriniz: ");
        String word = input.nextLine().trim();

        word.trim();
        if (word.contains(" ")){
            word= word.replaceAll(" ","");
        }

        if (word.length() % 2 == 0) {
            for (int i = 0; i < word.length() / 2; i++) {
                System.out.print(word.charAt(i));



            }
        }else {
            System.out.println("Lütfen çift sayıdan oluşan bir kelime giriniz.");
        }
    }
}