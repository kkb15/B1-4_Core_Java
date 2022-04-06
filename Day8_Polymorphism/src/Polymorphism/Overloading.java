package Polymorphism;
class Car{
void Tata(int a) {
	System.out.println("a "+a);
}
void Tata(int a,float b) {
	System.out.println("second method "+a+","+b);
}
}



public class Overloading {

	public static void main(String[] args) {
		Car c=new Car();
		c.Tata(21);
		c.Tata(9, 23);

	}

}
