package com.neosoft.basics;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Object> linkedlist= new LinkedList<Object>(Arrays.asList(null,"abs",100,10.25,true));
		
		linkedlist.add("java");
		linkedlist.addFirst("python");
		linkedlist.addLast(".net");
		linkedlist.removeLast();
		for(Object o : linkedlist) {
			System.out.println(o);
		}
		

	}

}
