package test.com;

import java.util.HashMap;
import java.util.Map;


// Find value of map 
public class MapExample {

	public static void main(String[] args) {
		String str = "Daman Rajput Singh ";
		
		Map<Character,Integer> count = new HashMap<>();
		
		char[] characters = str.toCharArray();
		
		for(char Char : characters ) {
			
			Integer integer = count.get(Char);
			if(integer==null) {
				
				count.put(Char, 1);
			}
			else {
				
				count.put(Char,integer + 1);
			}
			
			
		}
		System.out.println(count);
		
	}

}
