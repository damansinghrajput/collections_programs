package test.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


 //  USE IN TreeSet , LinkedHashSet , HashSet //


public class SetCollections {

	public static void main(String[] args) {
//		List<Integer> ch  = List.of(65,55,45,25,55,35);	
//		System.out.println(ch);
		
		 List<Character> ch = List.of('A','Z','A','B','Z','F'); 
		 System.out.println(ch);
		 	
	Set<Character> treeset = new TreeSet<>(ch);
	System.out.println("TreeSet provide Storing value :"+treeset);
	
	

	Set<Character> linkedhash = new LinkedHashSet<>(ch);
	System.out.println("LinkedHash :"+linkedhash);
	
	
	
	
	Set<Character> hashset = new HashSet<>(ch);
	System.out.println("HashSet :" +hashset);
	
	}

}
