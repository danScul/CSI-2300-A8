package BankAccount.user;

public abstract class user {
    private String name, address;
    public user()
    {
        this.name = "*Placeholder Name*";
    }
    public user(String name){
        this.name = name;
    }

    public void setAddress(){
        this.address = "*Placeholder Name*";
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    protected void printInfo(){
        System.out.println("Name: "+ this.name + " \nAddress: "+ this.address);
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    final static void greeting(){
        System.out.println("Hello valued patron, thank you for choosing [BANK] for your banking needs!");
    }

}
