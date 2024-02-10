package BankAccount.account.typeAccount;
import BankAccount.account.account;
import BankAccount.account.lockedAccount;
public class businessAccount extends account implements lockedAccount{
    protected int balance;
    protected String owner, businessName;

    public businessAccount(){
        super();
    }
    public businessAccount(int accountNumber, String owner, String businessName){
        super(accountNumber);
        this.owner = owner;
        this.businessName = businessName;
    }

    public void deposit() {
        this.balance += 1;
     }
    public void deposit(int num){
         this.balance += num;
     }
    final static void withdraw(){
        System.out.println("This account is locked. You cannot withdraw without authorization of all owners of the account (Ex. Business Owners, Co-Owners, etc)");
    }

    private void setOwner(){
        this.owner = "*Placeholder Name*";
    }
    private void setOwner(String owner){
        this.owner = owner;
    }
    private void setName(){
        this.businessName = "*Placeholder Name*";
    }
    private void setName(String businessName){
        this.businessName = businessName;
    }

    protected void printInfo(){
        System.out.println("Account Number: "+ this.getAcccountNum()  +" \nBalance: "+ this.balance + " Owner: " + owner +" Business Name: " + businessName );
    }
}