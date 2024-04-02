package class_work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//hari,james,rahul,farooq,shyam
public class UniqueNames {
    public static void main(String[] args) {
       LinkedHashSet a1=new LinkedHashSet();
    	a1.add("Hari");
    	a1.add("Rahul");
    	a1.add("Ravi");
    	a1.add("Rahul");
    	
    	
    	LinkedHashSet a2=new LinkedHashSet();
    	a2.add("James");
    	a2.add("Shyam");
    	a2.add("Roni");
    	a2.add("James");
    	a1.addAll(a2);
    	System.out.println(a1);
    	
    	
    	
  
    	
    	
    }
}
