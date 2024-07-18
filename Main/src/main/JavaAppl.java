package main;

public class JavaAppl{
    float midterm=70.5f;
    float finalexam=80.5f;
    String name="Fang";
    
    float calcAvg(){
        return midterm*0.4f + finalexam*0.6f;
    }
    void printData(){
        System.out.println("Name:"+name);
        System.out.println("Average:"+calcAvg());
    }
}