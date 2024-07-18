package lab10;
interface ArticleSB{
    float articleScore();
}
interface ConferenceSB{
    float conferenceScore();
}
interface ProjectSB{
    float projectScore();
}

abstract class Student{
    int id;
    protected float mid;
    protected float fin;
    
    public Student(int id,float mid,float fin){
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }
    abstract float computeTotalScore();
    float computeBaseScore(){
        return mid*0.4f+fin*0.6f;
    }
}
class MasterStudent extends Student implements ConferenceSB{
    protected int numberOfConf;
    
    public MasterStudent(int id,float mid,float fin,int numberOfConf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }
    @Override
    float computeTotalScore(){
        return computeBaseScore()+conferenceScore();
    }
    @Override
    public float conferenceScore(){
        return numberOfConf*5;
    }
}
class BachelourStudent extends Student implements ProjectSB{
    public BachelourStudent(int id,float mid,float fin){
        super(id,mid,fin);
    }
    @Override
    float computeTotalScore(){
        return computeBaseScore()+projectScore();
    }
    @Override
    public float projectScore(){return 20;}
}
class PhdStudent extends MasterStudent implements ArticleSB{
    protected int numOfArticles;
    
    public PhdStudent(int id,float mid,float fin,int numOfArticles){
        super(id,mid,fin,numOfArticles);
    }
    @Override
    public float computeTotalScore(){return computeBaseScore()+articleScore();}
    @Override
    public float articleScore(){return numOfArticles*8;}
}

public class Lab10 {

    
    public static void main(String[] args) {
        Student[] students = {
            new BachelourStudent(100,80f,90f),
            new MasterStudent(200,71f,69f,4),
            new PhdStudent(300,99f,88f,3)
            
        };
        for(Student student : students){
            System.out.println("Total Score of "+student.id+" is: "+student.computeTotalScore());
            // number id represents which Student class phd,master,etc
        }
    }
    
}
