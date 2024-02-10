package BankAccount.account.typeAccount;

import BankAccount.account.accessibleAccount;
import BankAccount.account.account;

public class transferAccount extends account implements accessibleAccount{
    protected int balance;
    protected int foreignBalance;

    public transferAccount(){
        super();
    }
    public transferAccount(int accountNumber){
        super(accountNumber);
    }

    public void withdraw() {
        if(balance > 0)
        this.balance -= 1;
        else
        emptyAccount();
    }
    public void withdraw(int num){
        if(balance > 0)
        this.balance -= num;
        else
        emptyAccount();
    }
    public void deposit() {
       this.balance += 1;
    }
    public void deposit(int num){
        this.balance += num;
    }
    
    public void withdrawSecondaryAccount() {
        this.foreignBalance -= 1;
    }
    public void withdrawSecondaryAccount(int num){
        this.foreignBalance -= num;
    }
    public void depositSecondaryAccount() {
       this.foreignBalance += 1;
    }
    public void depositSecondaryAccount(int num){
        this.foreignBalance += num;
    }

    private void transferMoneyOut(int num){
        this.foreignBalance += num;
        this.balance -= num;
    }
    private void transferMoneyIn(int num){
        this.balance += num;
        this.foreignBalance -= num;
    }

    protected void printInfo(){
        System.out.println("Account Number: "+ this.getAcccountNum()  +" \nBalance: "+ this.balance + " Secondary Balance: " + this.foreignBalance);
    }
}
