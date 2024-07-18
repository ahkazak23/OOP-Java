package lab4;
import java.util.InputMismatchException;
import java.util.Scanner;

class Worker{
    private String name;
    private double salary;
    private static int cnt=0;
    
    public Worker(String name,double salary){
        this.name=name;
        setSalary(salary);
        cnt++;
    }
    public void setSalary(double salary){
        if(salary<0)
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        this.salary=salary;
        
    }
    
    public String setName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public static int getTotalWorkers(){
        return cnt;
    }
}

public class Lab4 {

   
   public static void main(String[] args) {
    try {
        Worker worker1 = new Worker("Alice", 3000.0);
        Worker worker2 = new Worker("Charlie", 5000.0);
        Worker worker3 = new Worker("Bob", 1050.0);
        Worker worker4 = new Worker("Charlie", -5000.0);
        System.out.println("Total number of workers: " + Worker.getTotalWorkers());

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter a number ");
            int Number = input.nextInt();
            System.out.println("Number you entered is: " + Number);
        } catch (InputMismatchException x) {
            System.out.println("Not a number");
        }
    } catch (IllegalArgumentException e) {
        System.out.println("Exception:  Salary amount must be greater than zero ");
    }
}

    
}
    

        