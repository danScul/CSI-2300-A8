package BankAccount.account;
import java.util.random.*;
public abstract class account{
    private int accountNumber;
    private double balance = 0; 
    public account(){
        double rand = Math.random();
        this.accountNumber = (int) ((rand * 9000) + 1000);
    }
    public account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    protected void setBalance(){
        this.balance = 0;
    }
    protected void setBalance(int num){
        this.balance = num;
    }

    protected void printInfo(){
        System.out.println("Account Number: "+ this.accountNumber  +" \nBalance: "+ this.balance);
    }

    public int getAcccountNum(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }

    protected final static void emptyAccount(){
        System.out.println("ALERT: It would appear your account is out of funds.");
    }
}