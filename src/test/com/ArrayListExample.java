package test.com;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// use method addAll() , add(() ,remove(), set() .


public class ArrayListExample {

	public static void main(String[] args) {
		
		List value = List.of(101, 102, 103, 104);

		/// remove integer value ..

		List<Integer> value1 = new ArrayList<Integer>(value);

		value1.remove(Integer.valueOf(101));
		System.out.println(value1);
		
		
		
		ArrayList <String> nameList1 = new ArrayList<String>(Arrays.asList("Daman","Aman"));
		System.out.println("List1 :" +nameList1);
		ArrayList <String> nameList2 = new ArrayList<String>(Arrays.asList("Shubham","Shivam"));
		System.out.println("List2 :" +nameList2);
		ArrayList <String> nameList3 = new ArrayList<String>(Arrays.asList("Prince","Pawan"));
		System.out.println("List3 :"+nameList3);
		
		
		
		ArrayList <String> mergeList = new ArrayList<String>();
		mergeList.addAll(nameList1);
		mergeList.addAll(nameList2);
		mergeList.addAll(nameList3);
		System.out.println("Total Name :"+mergeList);
		
		
		mergeList.add(2,"Bhavya");
		System.out.println("Add name in index 2:"+mergeList);
		
		mergeList.remove("Pawan");
		System.out.println("Remove name :"+mergeList);
		
		mergeList.set(3, "Pawan");
		System.out.println("Replaced name Shubham replace Pawan :"+mergeList);
	}

}
