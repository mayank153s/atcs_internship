import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.out.println("ArrayList:");
			ArrayList arr = new ArrayList();
			arr.add("mayank");
			arr.add(new Integer(34));
			arr.add(47);
			arr.add(null);
			arr.add(true);
			System.out.println(arr);

			System.out.println();
			System.out.println();
			
			
			
			
			System.out.println("LinkedList:");
			LinkedList li = new LinkedList();
			li.add("mayank");
			li.add(new Integer(34));
			li.add(47);
			li.add(null);
			li.add(true);
			System.out.println(li);
			System.out.println("first:"+li.getFirst());
			System.out.println("last:"+li.getLast());
			System.out.println("size:"+li.size());
			li.remove(1);
			System.out.println(li.contains(97));
			System.out.println(li);
			
			System.out.println("size:"+li.size());
			System.out.println();
			
			
			
			System.out.println("Printing list using for loop and for each loop" );
			ArrayList ar = new ArrayList();
			ar.add("mayank");
			ar.add(new Integer(34));
			ar.add(47);
			ar.add(null);
			ar.add(true);
			for(int i =0;i<ar.size();i++){
				System.out.print(ar.get(i)+" ");
			}
			
			
			
			System.out.println();
			
			
			
			
			
			for(Object o:ar){
				System.out.print(o+" ");
			}
			
			System.out.println();
			
			System.out.println("Printing list using for iterator");
			Iterator itr = ar.iterator();
			while(itr.hasNext()){
				System.out.print(itr.next()+" ");
			}
			
	}

}
