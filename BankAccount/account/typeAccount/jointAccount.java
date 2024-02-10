package BankAccount.account.typeAccount;

import BankAccount.account.account;
import BankAccount.account.lockedAccount;

public class jointAccount extends account implements lockedAccount{
    protected int balance, balance2, sharedBalance;
    private String coownerName;

    public jointAccount(){
        super();
    }
    public jointAccount(int accountNumber, String coownerName){
        super(accountNumber);
        this.coownerName = coownerName;
    }

    public void deposit() {
        this.balance += 1;
        this.sharedBalance +=1;
     }
    public void deposit(int num){
         this.balance += num;
         this.sharedBalance += num;
     }
    final static void withdraw(){
        System.out.println("This account is locked. You cannot withdraw without authorization of all owners of the account (Ex. Business Owners, Co-Owners, etc)");
    }

    public void depositSecondary() {
        this.balance2 += 1;
        this.sharedBalance +=1;
    }
    public void depositSecondary(int num){
         this.balance2 += num;
         this.sharedBalance += num;
    }
    
    public String getCoowner(){
        return this.coownerName;
    }

    public void printSharedBalance(){
            System.out.println("You have $" + sharedBalance + " between both members' acconuts.");
    }
    protected void printInfo(){
        System.out.println("Account Number: "+ this.getAcccountNum()  +" \nBalance: "+ this.balance + " Co-Account Owner: " + coownerName);
    }
}
