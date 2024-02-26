package test.com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapCollections {

	public static void main(String[] args) {
		HashMap<String,Integer> hashMap = new HashMap<>();
		hashMap.put("daman",27);
		hashMap.put("aman",29);
		hashMap.put("pawan",20);
		System.out.println(hashMap);
		
		LinkedHashMap<String,Integer> linkedhashMap = new LinkedHashMap<>();
		linkedhashMap.put("daman",27);
		linkedhashMap.put("aman",29);
		linkedhashMap.put("pawan",20);
		System.out.println(linkedhashMap);
		
		TreeMap<String,Integer> treeMap = new TreeMap<>();
		treeMap.put("daman",27);
		treeMap.put("aman",29);
		treeMap.put("pawan",20);
		System.out.println(treeMap);
		

	}

}
