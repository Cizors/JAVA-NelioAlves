package applications_sec9;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account accountOne;

        System.out.print("Account Number: ");
        String number = sc.nextLine();

        System.out.print("Account Holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit [Y/N]?");
        char response = sc.next().charAt(0);

        if (Character.toLowerCase(response) == 'y') {
            System.out.print("Enter initial deposit: ");
            Double initialDeposit = sc.nextDouble();
            accountOne = new Account(number, holder, initialDeposit);
        }
        else {
            accountOne = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account Data:");
        System.out.print(accountOne);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        // double depositValue = sc.nextDouble;
        accountOne.deposit(sc.nextDouble());
        System.out.println("Updated Account Data:");
        System.out.println(accountOne);

        System.out.print("Enter a withdraw value: ");
        // double withdrawValue = sc.nextDouble;
        accountOne.withdraw(sc.nextDouble());
        System.out.println("Updated Account Data:");
        System.out.println(accountOne);

        sc.close();
    }
}
