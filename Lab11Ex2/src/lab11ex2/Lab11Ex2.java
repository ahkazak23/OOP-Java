package lab11ex2;
import java.util.ArrayList;

public class Lab11Ex2 {
    public static void switchPairs(ArrayList<String> list) {
    int size=list.size();
    
    for(int i=0;i<size-1;i+=2){
        String temp=list.get(i);
        
        list.set(i,list.get(i+1));
        list.set(i+1, temp);
    }
}

    
    
    public static void main(String[] args) {
       ArrayList <String> list = new ArrayList<>();
       
       list.add("name");
       list.add("My");
       list.add("bahçe");
       list.add("Fener");
       list.add("odd");
     //list.add("Not");
       
       System.out.println("Original list:             " + list);
       switchPairs(list);
       System.out.println("After switching pairs:     " + list);
       
      
       
    }
    
}
