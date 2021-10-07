package com.trung2008110125.BTTuan4;

public class AccountTestDriver {
    public static void main(String[] args) {
        Account account;
        account = new Account(123, 500);
        account.showData();
        account.deposit(500);
        account.showData();
        account.withdraw(200);
        account.showData();
    }
}
