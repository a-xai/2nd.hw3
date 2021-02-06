package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        System.out.println("На вашем счете: " + bankAccount.getAmount() + " coм.");
        System.out.println("Сколько денег хотите снять ?");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();


        while (true) {
            try {
                System.out.println(bankAccount.getAmount());
                bankAccount.withdraw(m);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println(bankAccount.getAmount() - bankAccount.getAmount());

                bankAccount.withdraw((int) bankAccount.getAmount());
            } finally {
                if (bankAccount.getAmount() == 0) {

                    break;
                }
            }
        }
    }
}
