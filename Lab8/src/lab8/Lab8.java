package lab8;

class Circle{
    private double radius=1.0;
    private String color="Red";
    public static final double Pi=3.14;

public double getRadius(){return radius;}
public void setRadius(double radius){this.radius=radius;}

public String getColor(){return color;}
public void setColor(String color){this.color=color;}

public Circle(double radius,String color){
    setRadius(radius);
    setColor(color);   
}
public Circle(double radius){
    this(radius,"Yellow");
}
public Circle(){
    this(1.0,"Green");
}
public double getArea(){
    return Pi*(radius*radius);
}
    @Override
    public String toString(){
    return "Color: "+color+" radius= "+radius+" Area= "+getArea();
}
}

class Cylinder extends Circle{
    private double height=1.0;
    
public double getHeight(){return height;}
public void setHeight(double height){this.height=height;}

public Cylinder(double height,double radius,String color){
super.setRadius(radius);
super.setColor(color);
setHeight(height);
}
public Cylinder(double height,double radius){
this(height,radius,"Brown");
}
public Cylinder(double height){
this(height,1.0,"Purple");
}
public Cylinder(){
this(1.0,1.0,"Orange");
}

public double getVolume(){return super.getArea()*height;}

    @Override
    public String toString(){
        return "Color: "+super.getColor()+" radius= "+super.getRadius()+" Volume= "+getVolume();}
}

public class Lab8 {
    
    private static void printShape(Circle[] shapes) {
        for (Circle shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        Circle[] circles = {
            new Circle(),
            new Circle(5.0),
            new Circle(9.0, "Black")
        };

        Cylinder[] cylinders = {
            new Cylinder(),
            new Cylinder(4.0),
            new Cylinder(5.4, 6.0),
            new Cylinder(7.4, 5.0, "Blue")
        };

        printShape(circles);
        printShape(cylinders);
    }

    
}

