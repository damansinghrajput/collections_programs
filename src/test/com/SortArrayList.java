package test.com;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> nameList1 = new ArrayList<Integer>(Arrays.asList(123,12,1));
		Collections.sort(nameList1);
		System.out.println(nameList1);
	}

}
