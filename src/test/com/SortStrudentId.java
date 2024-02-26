package test.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStrudentId implements Comparable<SortStrudentId> {
	
	private int id;
	private String name;
	
	
	
	public SortStrudentId(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		
		return id +""+name;
	}
	@Override
	public int compareTo(SortStrudentId that) {
		
		return Integer.compare(this.id, that.id);
	}

	

	
	

	public static void main(String[] args) {
		
		// custom class jab ho toh aap ko compare method use kar ne hogay 
		
		List<SortStrudentId> students = List.of(new SortStrudentId (140,"daman"),new SortStrudentId(130,"aman"),new SortStrudentId(1,"pawan"));
		
		 ArrayList<SortStrudentId> student = new ArrayList<SortStrudentId>(students);
		 
		 
		System.out.println(student);
		
		//student.sort(Comparator.comparing(SortStrudentId::getId));
		
		Collections.sort(student);
		System.out.println(student);
	
       System.out.println("Ascending The Id "+student);
       
	}

	

}
