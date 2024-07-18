class Student {
    int a=75;
    String name;

    void printData() {
        System.out.println(a + "," + name);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student std1 = new Student();
        Student std2 = new Student();
        std1.a = 75;
        std1.name = "Fang"; // Add a semicolon here
        std1.printData();
        int c=75;
        int b=25;
        System.out.println(c+b);
    }
}