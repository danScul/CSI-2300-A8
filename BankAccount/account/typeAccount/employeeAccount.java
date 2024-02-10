package BankAccount.account.typeAccount;

import BankAccount.account.accessibleAccount;
import BankAccount.account.account;

public class employeeAccount extends account implements accessibleAccount{
    protected int balance; 
    private int employeeID;

    public employeeAccount(){
        super();
    }
    public employeeAccount(int accountNumber, int employeeID){
        super(accountNumber);
        this.employeeID = employeeID;
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
    public void depositEmployeeAccount(int num){
        System.out.println("An extra dollar has been deposited into your account, thank you for being part of the [BANK] family! Enjoy your bonus!");
        this.balance += num + 1;
    }
    public int getEmployId(){
        return this.employeeID;
    }
    protected void printInfo(){
        System.out.println("Account Number: "+ this.getAcccountNum()  +" \nBalance: "+ this.balance + " Employee ID: " + this.employeeID);
    }
}
