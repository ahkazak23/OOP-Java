package collectiontest;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;


public class CollectionTest {
    static final int p=5;
    
    public static void main(String[] args) {
       List <Integer> list= new ArrayList<>();
       int[] Array={1,2,5,9,17};
       
            for(int i:Array){
                list.add(i);
       }
            ListIterator  itr = list.listIterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
    }
    
}
