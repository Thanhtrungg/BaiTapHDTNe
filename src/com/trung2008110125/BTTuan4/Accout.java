package com.trung2008110125.BTTuan4;

public class Accout {
     //attribute - thuộc tính - data
     int number_account;
     int number_balance;
     
     //method - function
     Account(int a, int b){
         number_account = a;
         number_balance = b;
     }
     void showData(){
         System.out.println("Number account: " + number_account);
         System.out.println("Number balance: " + number_balance);
     }
     void deposit(int ammount){
         number_balance += ammount;
     }
     void withdraw(int amount){
         number_balance -= amount;
 
}
