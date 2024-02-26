package test.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollections {

	public static void main(String[] args) {
		List<Integer> ch  = List.of(65,55,45,25,55,35);	
	
		List <Integer> arraylist = new ArrayList<Integer>(ch);
		System.out.println("ArrayList Value :"+arraylist);
		
		List <Integer> linkedlist = new LinkedList<Integer>(ch);
		System.out.println("LinkedList Value :"+linkedlist);

	}

}
