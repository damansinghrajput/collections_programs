package test.com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



	public class IteratorExp {

		public static void main(String[] args) {
			List<String> fruit = List.of("Apple","bat","cat","that","gat");
			System.out.println(fruit);
			
			List<String> arrayList = new ArrayList<String>(fruit);
			System.out.println(arrayList);
			
			List<String> arrayList1 = new ArrayList<String>(arrayList);
			
			Iterator<String> iterator = arrayList.iterator();
			
			
			
			 for(String word:fruit){
				      if(word.endsWith("at")) {
				      System.out.println(word);
				      }
				   }
			
			 for(String word:arrayList1) {			
				 System.out.println(arrayList);
				        if(word.endsWith("at")) {
				        arrayList.remove(word);
				        }
				        
				    }
			 System.out.println(arrayList);
			 
			
			 
		}
		
	

	}
	
	
//	while(iterator.hasNext()) {
//		if(iterator.next().endsWith("at")) {
//			iterator.remove();
//			
//		}
//		System.out.println(arrayList);
//		
//	}