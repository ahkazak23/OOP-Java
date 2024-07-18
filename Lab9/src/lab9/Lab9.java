package lab9;

import java.util.Scanner;

abstract class Shape2D{
    protected final double PI=3.14;
    protected double length;
    protected double radius;
    private double width;
    
    public Shape2D(double length,double width){
        setlength(length);
        setWidth(width);
    }
    public Shape2D(double radius){
        setRadius(radius);
    }
    public void setlength(double length){this.length=length;}
    public void setRadius(double radius){this.radius=radius;}
    public void setWidth(double width){this.width=width;}

    public double getlength(){return length;}
    public double getRadius(){return radius;}
    public double getWidth(){return width;}
    
    abstract double getArea();
    @Override
    public String toString(){
        return "Length= "+length+"  Radius= "+radius+"  Width= "+width;
    }
}

class Circle extends Shape2D{
    public Circle(double radius){
        super(radius);
    }
    
    @Override
    public double getArea(){
       return super.PI*Math.pow(radius, 2);  
    }
}

class Square extends Shape2D{
    Square(double width){
        super(1.0,width);
    }
    @Override
    public double getArea(){
        return Math.pow(getWidth(), 2);
    }
}

class Rectangle extends Shape2D{
    public Rectangle(double length,double width){
        super(length,width);
    }
    @Override
    public double getArea(){
        return length*getWidth();
    }
}
    
abstract class Shape3D extends Shape2D{
    protected double height;
    
    public Shape3D(double height,double length,double width){
        super(length,width);
        this.height=height;
    }
    public Shape3D(double length,double radius){
         super(length,1.0);
         super.setRadius(radius);
     }
     abstract double getVolume();
     @Override
    public String toString(){
        return "Length= "+length+"  Radius= "+radius+"  Width= "+getWidth()+"  Height= "+height;
    }
}

 class Cylinder extends Shape3D{
     public Cylinder(double length,double radius){
         super(length,radius);
     }
     @Override
     public double getArea(){
         return 2.0*PI*Math.pow(radius, 2)+(2.0*PI*radius)*length;
     }
    @Override
    public double getVolume(){
        return Math.pow(radius, 2)*length*PI;
    } 
 }
 
 class Sphere extends Shape3D{
     public Sphere(int height,double radius){
         super(height,radius);
    }
     @Override
    public double getArea(){
         return 4.0*PI*Math.pow(radius, 2);
    }
     @Override
    public double getVolume(){
    return (4.0/3.0)*PI*Math.pow(radius, 3);
    }
 }

class Pyramid extends Shape3D{
    public Pyramid(int height,int length,int width){
        super(height,length,width);
    }
    @Override
    public double getArea(){
        //double slantlength = Math.sqrt(Math.pow(length / 2, 2) + Math.pow(getWidth() / 2, 2) + Math.pow(height, 2));
        //double perimeter = 2 * (length + getWidth());
        //return length*getWidth()+0.5*perimeter*slantlength;
        return length*getWidth()+length*Math.sqrt(Math.pow(getWidth()/2.0, 2)+Math.pow(height, 2))+getWidth()*Math.sqrt(Math.pow(length/2.0, 2)+Math.pow(height, 2));
    }
    @Override
    public double getVolume(){
        return (1.0/3.0)*length*height*getWidth();
    }
}

class Cone extends Shape3D{
    public Cone(double length,double radius){
        super(length,radius);
    }
    @Override
    public double getArea(){
        double slant = Math.sqrt(Math.pow(length, 2)  + Math.pow(radius, 2))*PI*radius;
        return PI*Math.pow(radius,2)+slant;
    }
    @Override
    public double getVolume(){
        return (1.0/3.0)*PI*Math.pow(radius,2)*length;
    }
}


public class Lab9 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        do{
            System.out.println("Choose a shape");
            System.out.println("1. Circle");
            System.out.println("2. Square");
            System.out.println("3. Rectangle");
            System.out.println("4. Cylinder");
            System.out.println("5. Sphere");
            System.out.println("6. Pyramid");
            System.out.println("7. Cone");
            System.out.println("8. Exit");
            
            System.out.print("Enter your choice: ");
            choice=scanner.nextInt();
        
        
        switch (choice) {
            case 1:
                System.out.println("Enter the Radius of the Circle: ");
                double circleR=scanner.nextDouble();
                Circle circle =new Circle(circleR);
                System.out.println(circle);
                System.out.println("Area of the Circle: "+circle.getArea());
                break;
            case 2:
                System.out.println("Enter the Length of the Square: ");
                double squareL= scanner.nextDouble();
                Square square = new Square(squareL);
                System.out.println(square);
                System.out.println("Area of the Square: "+square.getArea());
                break;
            case 3:
                System.out.println("Enter the Length of the Rectangle: ");
                double rectangleL = scanner.nextDouble();
                System.out.println("Enter the Width of the Rectangle: ");
                double rectangleW = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(rectangleL,rectangleW);
                System.out.println(rectangle);
                System.out.println("Area of the Rectangle: "+rectangle.getArea());
                break;
            case 4:
                System.out.print("Enter the Length of the Cylinder: ");
                double cylinderL = scanner.nextDouble();
                System.out.print("Enter the Radius of the Cylinder: ");
                double cylinderR = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(cylinderL,cylinderR);
                System.out.println(cylinder);
                System.out.println("Area of the Cylinder: "+cylinder.getArea());
                System.out.println("Volume of the Cylinder: "+cylinder.getVolume());
                break;
            case 5:
                System.out.print("Enter the Radius of the Sphere: ");
                double sphereR = scanner.nextDouble();
                int sphereD=1;
                Sphere sphere =new Sphere(sphereD,sphereR);
                System.out.println(sphere);
                System.out.println("Area of the Sphere: "+sphere.getArea());
                System.out.println("Volume of Sphere: "+sphere.getVolume());
                break;
            case 6:
                System.out.print("Enter the Height of the Pyramid: ");
                int pyramidD = scanner.nextInt();
                System.out.print("Enter the Length of the Pyramid: ");
                int pyramidL = scanner.nextInt();
                System.out.print("Enter the Width of the Pyramid: ");
                int pyramidW = scanner.nextInt();
                Pyramid pyramid = new Pyramid(pyramidD,pyramidL,pyramidW);
                System.out.println(pyramid);
                System.out.println("Area of the Pyramid: " + pyramid.getArea());
                System.out.println("Volume of the Pyramid: " + pyramid.getVolume());
                break;
            case 7:
                System.out.print("Enter the Length of the Cone: ");
                double coneL = scanner.nextDouble();
                System.out.print("Enter the Radius of the Cone: ");
                double coneR = scanner.nextDouble();
                Cone cone = new Cone(coneL,coneR);
                System.out.println(cone);
                System.out.println("Area of the Cone: " + cone.getArea());
                System.out.println("Volume of the Cone: " + cone.getVolume());
                break;
            case 8:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter valid option");
        }
        } while(choice!=8);
        
        scanner.close();
    }
}
