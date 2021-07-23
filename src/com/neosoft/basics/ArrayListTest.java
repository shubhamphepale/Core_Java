package com.neosoft.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> ar=new ArrayList<Student1>();
		ar.add(new Student1(101,"Sandy","Java", 80));
		ar.add(new Student1(102,"Logan",".Net", 70));
		ar.add(new Student1(103,"Sammy","Angular", 85));
		ar.add(new Student1(104,"Akki","Java", 90));
		ar.add(new Student1(105,"Shubham","Java", 85));
		
//		Iterator<Student1> itr=ar.iterator();
//		while(itr.hasNext()) {
//			Student1 s=itr.next();
//			System.out.println("ID : "+s.stid+", Name : "+s.Name+", Course : "+s.Course+", Marks : "+s.marks);
//		}
		for(Student1 s : ar) {
			System.out.println("ID : "+s.stid+", Name : "+s.Name+", Course : "+s.Course+", Marks : "+s.marks);
		}
		
	}

}

class Student1{
	
	int stid;
	String Name;
	String Course;
	int marks;
	public Student1(int stid, String name, String course, int marks) {
		super();
		this.stid = stid;
		Name = name;
		Course = course;
		this.marks = marks;
	}
}