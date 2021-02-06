package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(int sum) {
        return amount = sum;
    }

    public void withdraw(int sum) throws LimitException {
        if (amount > sum) {
            amount = amount - sum;
        } else {
            throw new LimitException("У вас недостаточно денег на счету. \nСчитано с карты: " + amount, amount);
        }

    }
}

