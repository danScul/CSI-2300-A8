package BankAccount.account.typeAccount;
import BankAccount.account.accessibleAccount;
import BankAccount.account.account;

public class personalAccount extends account implements accessibleAccount{
    protected int balance;
    private int investedAmount;

    public personalAccount(){
        super();
    }
    public personalAccount(int accountNumber){
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

    public void invest(int investedAmount){
        this.investedAmount += (investedAmount * (1 * .03));
    }
    public void invest(int investedAmount, int timeYear, double interestRate){
        this.investedAmount += (investedAmount * (interestRate * timeYear));
    }
    public void printInvestment(){
        System.out.println("Your investment has accrued: " + this.investedAmount);
    }

    public int getInvested(){
        return this.investedAmount;
    }
    protected void printInfo(){
        System.out.println("Account Number: "+ this.getAcccountNum()  +" \nBalance: "+ this.balance + " Invested Amount: " + this.investedAmount);
    }
}
