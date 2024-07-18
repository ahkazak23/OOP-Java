package lab10no2;
abstract class Animal {protected String name;}

interface Moveable{void move();}
interface Flyable{void fly();}
interface Swimmable{void swim();}

class Eagle extends Animal implements Flyable{
    @Override
    public void fly(){
        System.out.println("Eagle is flying");
    }
}
class Cat extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("Cat is swimming");
    }
}
class Duck extends Animal implements Moveable,Flyable,Swimmable{
    @Override
    public void swim(){
        System.out.println("Duck is swimming");
    }
    @Override
    public void fly(){
        System.out.println("Duck is flying");
    }
    @Override
    public void move(){
        System.out.println("Duck is moving");
    }
}

public class Lab10NO2 {

   
    public static void main(String[] args) {
        Swimmable Scat = new Cat();
        Flyable Feagle = new Eagle();
        Moveable Mduck = new Duck();
        Flyable Fduck = new Duck();
        Swimmable Sduck = new Duck();
      
      Scat.swim();
      Feagle.fly();
      Mduck.move();
      Fduck.fly();
      Sduck.swim();
        
      System.out.println("************Down Casting************");
      Animal duck = new Duck();
            ((Moveable)duck).move();
            ((Flyable)duck).fly();
            ((Swimmable)duck).swim();
      Animal cat = new Cat();
      Animal eagle = new Eagle();
            ((Swimmable)cat).swim();
            ((Flyable)eagle).fly();
      
      
      
        
    }
    
}
