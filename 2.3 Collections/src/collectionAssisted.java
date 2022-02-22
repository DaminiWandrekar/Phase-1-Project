import java.util.*;
public class collectionAssisted {
	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Pune");//
	      city.add("Mumbai");    	   
	      System.out.println(city);  
		
		//creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(17); 
	      vec.addElement(20); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Kathrin");  
	      names.add("Ronny");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(111);  
	       set.add(112);  
	       set.add(113);
	       set.add(114);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(10);  
	       set2.add(11);  
	       set2.add(12);
	       set2.add(13);	       
	       System.out.println(set2);
	      	} 
}
}
