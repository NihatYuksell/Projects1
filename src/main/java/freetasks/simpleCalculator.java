package freetasks;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bu hesap makinesinde sadece toplama '+', çıkarma '-', çarpma '*', bölme '/' işlemlerini kullanınız.\nLütfen yapmak istediğiniz işlemi giriniz: ");
        String operation = input.nextLine();

        String operator = operation.replaceAll("[0-9]", "").trim();

        String[] parts = operation.split("[/*+-]");
        double num1 = Double.parseDouble(parts[0].trim());
        double num2 = Double.parseDouble(parts[1].trim());

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Sayılar 0'a bölünemez.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Geçersiz işlem.");
                validOperation = false;

        }
        if (validOperation){
            System.out.println("Sonuç: " + result);

        }

        input.close();


    }
}
