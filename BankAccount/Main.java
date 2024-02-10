package BankAccount;
import BankAccount.account.typeAccount.businessAccount;
import BankAccount.account.typeAccount.employeeAccount;
import BankAccount.account.typeAccount.jointAccount;
import BankAccount.account.typeAccount.personalAccount;
import BankAccount.account.typeAccount.transferAccount;
import BankAccount.user.typeUser.employee;
import BankAccount.user.typeUser.patron;
import BankAccount.user.typeUser.worker;

public class Main {
    final static void explainPurpose(){
        System.out.println("This application is desgined to function as a system for a bank to create and store patron's user profiles as well as an account.");
    }
    public static void main(String[] args) {
        explainPurpose();

        employee e1 = new employee();
        employee e2 = new employee("John", 12345);
        e1.printInfo();
        e2.printInfo();
        e2.setAddress("1234 Main Street");
        patron p1 = new patron();
        patron p2 = new patron("Jane", 23456);
        p1.printInfo();
        p2.printInfo();
        worker w1 = new worker();
        worker w2 = new worker("Jim", "Big Business");
        w1.printInfo();
        w2.printInfo();
        w2.setAddress();

        businessAccount b1 = new businessAccount();
        businessAccount b2 = new businessAccount(123, "Bill", "Placeholder Business");
        b1.deposit();
        System.out.println(b1.getBalance());
        b2.deposit(5);
        employeeAccount ea1 = new employeeAccount();
        employeeAccount ea2 = new employeeAccount(12345, 8675309);
        ea1.getAcccountNum();
        ea2.depositEmployeeAccount(5);
        jointAccount j1 = new jointAccount();
        jointAccount j2 = new jointAccount(1234, "Jessica");
        j1.depositSecondary();
        j2.depositSecondary(5);
        personalAccount pa1 = new personalAccount();
        personalAccount pa2 = new personalAccount(3456);
        pa1.invest(4);
        pa2.invest(5, 4, .05);
        transferAccount t1 = new transferAccount();
        transferAccount t2 = new transferAccount(6543);
        
    }

}
