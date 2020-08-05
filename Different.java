/*
Write a program where create one abstract class MyClass and one abstrac method in it which has to got various implementation in sub classes.
*/

import java.io.*;

abstract class MyClass{
	abstract void calculate(double x);	//abstract method
}

class sub1 extends MyClass{
	void calculate(double a)
	{
		System.out.println("Square are="+(a*a));
	}
}

class sub2 extends MyClass{
	void calculate(double b)
	{
		System.out.println("Square root are="+Math.sqrt(b));
	}
}

class sub3 extends MyClass{
	void calculate(double c)
	{
		System.out.println("Cube are="+(c*c*c));
	}
}

class Different{
public static void main(String ar[]){
	MyClass mc;
	mc=new sub1();		//sub1 s1=new sub1();
	mc.calculate(5);		//calculate square
	mc=new sub2();		//sub2 s2=new sub2();
	mc.calculate(25);		//calculate square root
	mc=new sub3();		//sub3 s3=new sub3();
	mc.calculate(5);		//calculate cube
}
}
