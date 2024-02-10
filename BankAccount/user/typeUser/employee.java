package BankAccount.user.typeUser;

import BankAccount.user.user;

public class employee extends user{
    int idNum;
    public employee(){
        super();
    }
    public employee(String name, int id){
        super(name);
        this.idNum = id;
    }

    private void setId(){
        this.idNum = 0000;
    }
    private void setId(int num){
        this.idNum = num;
    }

    public void printInfo(){
        System.out.println("Name: "+ this.getName() + " \nAddress: "+ this.getAddress() + " \nID: " + this.idNum);
    }
    
    protected int getId(){
        return this.idNum;
    }
}
