package lab13ex1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Circle  {
    final double pi=3.14;    
    double radius;
    String color;
    
    Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    double calcArea(){
        return (radius*radius)*pi;
    }
}
class AreaComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle a, Circle b) {
        return Double.compare(a.calcArea(), b.calcArea());
    }
}





public class Lab13Ex1 {

    
    public static void main(String[] args) {
       Circle c1 = new Circle(77,"Yellow");
       Circle c2 = new Circle(26,"Blue");
       Circle c3 = new Circle(84,"White");
       
       List<Circle> list = new LinkedList <Circle>();
       list.add(c1);
       list.add(c2);
       list.add(c3);
       
       Collections.sort(list, new AreaComparator());
       
       ListIterator<Circle> iterator = list.listIterator();
       
        while (iterator.hasNext()) {
            Circle circle = iterator.next();
            System.out.println("Radius: " + circle.radius + ", Color: " + circle.color + ", Area: " + circle.calcArea());
        }
    
    }
}
