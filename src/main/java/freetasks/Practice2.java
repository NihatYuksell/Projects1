package freetasks;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen mailinizi giriniz: ");
        String mail = input.nextLine();

        if (mail.contains("hotmail")){
            mail = mail.replace("hotmail", "gmail");

        }else {

        }
        System.out.println("Mailiniz: " + mail);
    }
}
