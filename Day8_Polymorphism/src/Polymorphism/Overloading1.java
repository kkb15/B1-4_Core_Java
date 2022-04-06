package Polymorphism;

public class Overloading1 {
	void show(int a,int b) {
		System.out.println("sum is"+(a+b));
	}
	void show (int a, float b) {
		System.out.println("multi is"+(a*b));
	}

	public static void main(String[] args) {
		Overloading1 o=new Overloading1();
		o.show(2, 9);
		o.show(5, 34f);

	}

}
