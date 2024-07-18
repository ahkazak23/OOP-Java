
package prepexam;

class Student{
    private int midterm;
    private int finalexam;
    
    Student(int midterm,int finalexam){
    setMidterm(midterm);
    setFinalexam(finalexam);
    }
    
    public void setMidterm(int midterm){
    if(midterm<0 || midterm>100)
        throw new IllegalArgumentException("Wrong input for Midterm Exam");
    this.midterm=midterm;
    }
    
    public void setFinalexam(int finalexam){
    if(finalexam<0 || finalexam>100)
        throw new IllegalArgumentException("Wrong input for Final exam");
    this.finalexam=finalexam;
    }
    
    public int getMidterm(){return midterm;};
    
    public int getFinalexam(){return finalexam;};

    
    public double getAverage(){
        return midterm*0.4+finalexam*0.6;
    }
}

public class PrepExam {

 
    public static void main(String[] args) {
        try{
         Student student1=new Student(-5,35);
            System.out.println("Midterm: "+student1.getMidterm()+" Final Exam: "+student1.getFinalexam());
            System.out.println(student1.getAverage());
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
     
}
}
