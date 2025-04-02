package Day5;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();

        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

     for(String s:list ) {
    	 System.out.println(s);
     }
     Iterator<String> iterator = list.iterator();

     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
        String fruit = list.get(1);

        
        list.remove("Apple");

        
        int size = list.size();

       
        System.out.println(list);
    }
}

