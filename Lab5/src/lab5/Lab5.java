package lab5;

enum Branch {
    MATH("y'=dx/dy"),
    PHYSICS("E=mc^2"),
    CS("Hello World"),
    ENG("My name is Jorge ");

    String info;

    Branch(String info) {
        this.info = info;
    }
}

class Teacher {
    int id;
    Branch branch;

    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }
    
    public int getId() {
        return id;
    }
    
    public Branch getBranch() {
        return branch;
    }
}

class Circle {
    private static final double PI = 3.141519;
    private double Radius;

    public Circle(double radius) {
        this.Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double computeArea() {
        double Area;
        Area = PI * (Radius * Radius);
        return Area;
    }
}

public class Lab5 {

    public static void main(String[] args) {
        Circle[] circles = new Circle[]{
            new Circle(5.0),
            new Circle(10.0),
            new Circle(15.0)
        };

        Teacher[] teachers = new Teacher[]{
            new Teacher(1, Branch.CS),
            new Teacher(2, Branch.ENG),
            new Teacher(3, Branch.MATH),
            new Teacher(4, Branch.PHYSICS)
        };

        for (Circle circle : circles) {
            double area = circle.computeArea();
            System.out.println("Circle - Radius: " + circle.getRadius() + ", Area: " + area);
        }
        System.out.println("*********************************************");
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() + ", Branch: " + teacher.getBranch() + " - " + teacher.getBranch().info);
        }
    }
}
