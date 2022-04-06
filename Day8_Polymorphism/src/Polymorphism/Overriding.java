package Polymorphism;
class Parent{
	void Super() {
		System.out.println("This is superclass");
		
	}
}
class Child extends Parent{
	void Super() {
		System.out.println("This is subclass");
		
	}
}

public class Overriding {

	public static void main(String[] args) {
		Parent p=new Child();
		p.Super();
		Child c=new Child();
		c.Super();
		

	}

}
