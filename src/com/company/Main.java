package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Сколько денег хотите снять ?");
        Scanner scanner = new Scanner(System.in);int m = scanner.nextInt();
        bankAccount.deposit(20000);
        while (true) {
            try {
                System.out.println(bankAccount.getAmount());
                bankAccount.withdraw(m);
            } catch (LimitException e) {
                System.out.println(e.getMessage());

                bankAccount.setAmount(bankAccount.getAmount() - bankAccount.getAmount());
                System.out.println(bankAccount.getAmount());
            }

            finally {
                if(bankAccount.getAmount()==0){
                    break;
                }
            }
        }
    }
}
