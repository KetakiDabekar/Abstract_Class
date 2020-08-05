/*
Program in which abstract class car contains instance var ,one concrete method,2 abstract method
*/
import java.io.*;

abstract class Car{
	int regno;
	Car(int r){
		regno=r;
	}
	//cocrete method 
	void openTank()
	{
		System.out.println("Fill the tank");
	}

	abstract void steering(int direction,int angel);
	abstract void braking(int force);
}

class Maruti extends Car{
	Maruti(int regno){
		super(regno);
	}
	void steering(int direction,int angel)
	{
		System.out.println("Take a turn"+direction);
		System.out.println("This is ordinary steering"+angel);
	}

	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("These are hydraulic breakes");
	}
}

class Santro extends Car{
	Santro(int regno){
		super(regno);
	}
	void steering(int direction,int angel)
	{
		System.out.println("Take a turn");
		System.out.println("This car uses power steering");
	}

	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("This car uses gas breakes");
	}
}

class UseCar{
public static void main(String args[]){
	Maruti m=new Maruti(1100); 
	Santro s=new Santro(121312);
	Car ref;
	ref=m;
	m.openTank();
	m.steering(123,56);
	m.braking(25);
	//Santro
	ref=s;
	s.openTank();
	s.steering(123,56);
	s.braking(25);
}
}
