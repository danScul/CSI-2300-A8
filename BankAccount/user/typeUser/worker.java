package BankAccount.user.typeUser;

import BankAccount.user.user;

public class worker extends user{
    private String employer;
    public worker(){
        super();
    }
    public worker(String name, String employer){
        super(name);
        this.employer = employer;
    }

    private void setEmployer(){
        this.employer = "*Placeholder Employer*";
    }
    private void setEmployer(String employer){
        this.employer = employer;
    }

    public void printInfo(){
        System.out.println("Name: "+ this.getName() + " \nAddress: "+ this.getAddress() + " \nEmployer: " + this.employer);
    }

    protected String getEmployer(){
        return this.employer;
    }
}
