 package Lab2;

import java.util.Scanner;

class Employee{
    String name;
    int ssNO;
    float wage;
    int WorkingHours;
    
    void displayInfo(){
    System.out.println("Name: "+name+"\nSocial Security Number: "+ssNO);
}
    float displaySalary(){
        return WorkingHours * wage;
    }
}

public class Lab2 {
    
    public static void main(String[] args){
        Employee W1=new Employee();
        W1.name="Fang";
        W1.ssNO=77099;
        W1.WorkingHours=33;
        W1.wage=13.5f;
        W1.displayInfo();
        System.out.println("Salary="+W1.displaySalary()+"$");
        
        Scanner input =new Scanner(System.in);
        
        Employee W2=new Employee();
        System.out.println("Please enter Employee's name: ");
        W2.name=input.nextLine();
        
        System.out.println("Please enter Employee's Sosial Security Number: ");
        W2.ssNO=input.nextInt();
        
        System.out.println("Please enter Employee's Working hour: ");
        W2.WorkingHours=input.nextInt();
        
        System.out.println("Please enter Employee's Wage: ");
        W2.wage=input.nextFloat();
        
        W2.displayInfo();
        System.out.println("Salary of Employee="+W2.displaySalary()+"$");
    }

   
}
