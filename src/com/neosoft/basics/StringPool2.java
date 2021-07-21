package com.neosoft.basics;

public class StringPool2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2="java";
		String s3= new String("java");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
