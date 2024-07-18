package lab11ex1;

import java.util.ArrayList;


class BankAccount implements Comparable<BankAccount> {
    int accountNo;
    String holderName;
    double balance;
    
    BankAccount(int accountNo,String holderName,double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }
    void balanceChange(double amount){
    balance-=amount;
    }

    @Override
    public int compareTo(BankAccount a) {
        return this.holderName.compareTo(a.holderName);
    }
}


public class Lab11Ex1 {

   
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(001,"Fang",999999.0);
        BankAccount a2 = new BankAccount(002,"Yuan",888888.0);
        BankAccount a3 = new BankAccount(003,"Gu",777777.0);
        BankAccount a4 = new BankAccount(004,"Yue",666666.0);
        
        ArrayList <BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);
        
        //Collections.sort(myAccounts);
              
        myAccounts.forEach((acc) -> {
            acc.balanceChange(500);
            System.out.println("Account Holder: " + acc.holderName + ", Account No: " + acc.accountNo + ", Balance: " + acc.balance);
        });
    }
    
    
}
