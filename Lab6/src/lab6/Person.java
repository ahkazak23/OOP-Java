class Person{
String firstName;
String lastName;
int id;
int age;

public Person(String firstName,String lastName,int id,int age){
    this.firstName=firstName;
    this.lastName=lastName;
    this.id=id;
    this.age=age;
    }

public Person(String firstName,String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
    id++;
    this.age=0;
    }

public Person(int id){
    this.id=id;
    }

public Person(){
    id++;
    }

}