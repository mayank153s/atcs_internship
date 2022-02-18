
import java.util.*;

public class Day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs= new HashSet();
		for(int i=0 ;i<5;i++){
			hs.add(i);
		}
		hs.add(8);
		hs.add(0);
		System.out.println("HashSet:");
		System.out.println(hs);
		
		
		
		hs.add("mayank");
		hs.add(2.48);
		System.out.println("Updated HashSet:");
		System.out.println(hs);
		
		
		
		System.out.println("Iterating hashset using iterators:");	
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+", ");
		}
		
		
		System.out.println();
		LinkedHashSet li = new LinkedHashSet();
		li.add("fdfsff");
		li.add(779);
		li.add(232.44);
		li.add(true);
		System.out.println("Iterating Linkedhashset using iterators:");	
		Iterator ltr = li.iterator();
		while(ltr.hasNext()){
			System.out.print(ltr.next()+", ");
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Hashmap:");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("mayank", 1523);
		hm.put("himanshu", 5566);
		hm.put("uma", 6677);
		hm.put("mohan", 5590);
		System.out.println(hm);
		
		
		
		System.out.println("keys:");
		Set <String> s=hm.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		
		}
		
		
		
		
		
	}
	
	
	

}
