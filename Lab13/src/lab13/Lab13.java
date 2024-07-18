package lab13;

abstract class Developer{
    String fullName;
    int id;
    abstract double income();
    
    Developer(int id,String fullName){
        this.id=id;
        this.fullName=fullName;
    }
}
interface BonusSalaryBhv{
    public double getBonusSalary();
}
interface PromotionBhv{
    public double getPromotion();
}

class RegularDeveloper extends Developer{
    double monthlySalary;
    
    RegularDeveloper(int id,String fullName,double monthlySalary){
    super(id,fullName);
    this.monthlySalary=monthlySalary;
    }
    @Override
    double income() {
        return monthlySalary;
    }

}
class FreelancerDeveloper extends Developer implements BonusSalaryBhv{
    int hours;
    int unitPrice=20;
    
    FreelancerDeveloper(int id,String fullName,int hours){
        super(id,fullName);
        this.hours=hours;
    }
    @Override
    double income() {
      return hours*unitPrice+getBonusSalary();  
    }

    @Override
    public double getBonusSalary() {
       return hours*1.5;
    }

}
class SeniorDeveloper extends RegularDeveloper implements PromotionBhv{
    SeniorDeveloper(int id,String fullName,double monthlySalary){
        super(id,fullName,monthlySalary);
    }
    
    @Override
    double income(){
        return monthlySalary+getPromotion();
    }
    @Override
    public double getPromotion() {
       return 1.5*monthlySalary ;
    }

}

public class Lab13 {
    public static void main(String[] args) {
        
        RegularDeveloper regularDeveloper = new RegularDeveloper(1, "Fang", 5000);
        FreelancerDeveloper freelancerDeveloper = new FreelancerDeveloper(2, "Yuan", 160);
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(3, "Gu Yue", 7000);

        
        System.out.println("Regular Developer Income: $" + regularDeveloper.income());
        System.out.println("Freelancer Developer Income: $" + freelancerDeveloper.income());
        System.out.println("Senior Developer Income: $" + seniorDeveloper.income());
    }
}

