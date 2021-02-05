package com.company;

public class BankAccount {
    private double amount;

    public int setAmount(double amount) {
        this.amount = amount;
        return 0;
    }

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount = sum;
    }

    public int withdraw(int sum) throws LimitException {
        if (amount > sum) {
            setAmount(getAmount() - sum);
        } else {
            throw new LimitException("У вас недостаточно денег на счету. ", amount);

        }

        return (int) getAmount();
    }
}

