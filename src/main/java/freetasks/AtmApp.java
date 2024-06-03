package freetasks;

import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Checking the name and surname

        System.out.println("Please enter your name: ");
        String name = input.nextLine().trim();

        System.out.println("Please enter your surname: ");
        String surname = input.nextLine();

        String fullName = name + " " + surname;
        String upperFullname = fullName.toUpperCase();
        System.out.println("Welcome to your account \n" + upperFullname);

        System.out.println("Please enter your new password: ");
        String newpwd = input.nextLine().trim();
        String lowerNewpwd = newpwd.toLowerCase();

        //---------------------------------------------------

        String lowName = name.toLowerCase().trim();
        String[] splitNames = lowName.split(" ");
        String name1 = splitNames[0];
        String name2 = splitNames.length>1 ? splitNames[1]: "";
        String lowSurname = surname.toLowerCase();
        if (lowerNewpwd.contains(name1)||(lowerNewpwd.contains(name2))||(lowerNewpwd.contains(lowSurname))){
            System.out.println("Your password should not contain your name or surname");

        }else {

            //Checking password


            int userTry = 1;
            int mainAccountBalance = 10000;
            boolean pwdCorrect = false;
            while (userTry < 4) {
                System.out.println("Please enter your password to verify: ");
                String userpwd = input.nextLine();

                if (!userpwd.equals(newpwd)) {
                    System.out.println("Password invalid. Please try again.");
                    userTry++;

                } else {
                    pwdCorrect = true;
                    System.out.println("Main Account Balance: " + mainAccountBalance + "$");
                    break;
                }
            }
            if (pwdCorrect) {
                System.out.println("Please enter the amount of money you want to withdraw: ");
                int withdraw = input.nextInt();

                if ((withdraw <= mainAccountBalance) && (withdraw > 0)) {
                    int withdrawn = mainAccountBalance - withdraw;
                    System.out.println("You withdraw : " + withdraw + "\n" + withdrawn + "$ has left");
                } else {
                    System.out.println("Amount of money you want to withdraw should be above 0 and under your total Main Account Balance");
                }
            }
        }
    }
}


