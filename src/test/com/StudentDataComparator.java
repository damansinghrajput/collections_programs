package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentInfomation {
	
	int rollno;
	 String name,address;
	
	 public StudentInfomation(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	 public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String toString() {
		 
		 return this.rollno +""+this.address+""+this.name;
		 
	 }


}

class sortRollNo implements  Comparator<StudentInfomation> {

	
	@Override
	public int compare(StudentInfomation o1, StudentInfomation o2) {
		
		  return Integer.compare(o1.rollno, o2.rollno);
	}
	


}

public class StudentDataComparator {

	public static void main(String[] args) {
	
		
		List<StudentInfomation> student = List.of(new StudentInfomation (307, " Daman ", " kalol "),new StudentInfomation( 402, " Pawan ", " Panchvati "),new StudentInfomation(101, " Aman ", " Chhatral "));
		
		
		 ArrayList<StudentInfomation> studentInfo = new ArrayList<StudentInfomation>(student);
		 System.out.println("unsorted id");
		 System.out.println(studentInfo);
		 
		 
		 Collections.sort(studentInfo,new sortRollNo());
		 System.out.println(studentInfo);
		 
		 
		 
		 
		 
	}

}
