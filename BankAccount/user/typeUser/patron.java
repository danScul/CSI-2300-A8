package BankAccount.user.typeUser;

import BankAccount.user.user;

public class patron extends user{
    private int accountNumber;
    public patron(){
        super();
    }
    public patron(String name, int accNum){
        super(name);
        this.accountNumber = accNum;
    }

    private void setAccNum(){
        this.accountNumber = 00000;
    }
    private void setId(int accNum){
        this.accountNumber = accNum;
    }

    public void printInfo(){
        System.out.println("Name: "+ this.getName() + " \nAddress: "+ this.getAddress() + " \nAccount Number: " + this.accountNumber);
    }

    protected int getAcccountNum(){
        return this.accountNumber;
    }
}
