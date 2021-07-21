package com.neosoft.basics;

public class Shape {
	
	void Area() {
		System.out.println("Calculate the area of shape");
	}
	
	void Draw() {
		System.out.println("Draw the Shape with it coordinates");
	}
}
class Circle extends Shape{
	int radius=5;
	double area;
	void Area() {
		area=3.14*(radius*radius);
	}
	void Draw() {
		System.out.println("Drawing a shape Circle with radius "+radius);
	}
}
class Triangle extends Shape{
	int height=20;
	int base=10;
	int area;
	void Area() {
		area=(height*base)/2;
	}
	void Draw() {
		System.out.println("Drawing a shape Circle with Height "+height+" and Base "+base);
	}
}
class Square extends Shape{
	int side=5;
	int area;
	void Area() {
		area=(side*side);
	}
	void Draw() {
		System.out.println("Drawing a shape Circle with Side "+side);
	}
}
class Test{  
	public static void main(String args[]){ 
		
		Shape s1;
		s1 = new Circle();
		s1.Area();
		s1.Draw();
		s1 = new Triangle();
		s1.Area();
		s1.Draw();
		s1 = new Square();
		s1.Area();
		s1.Draw();
	
	}  
}  
