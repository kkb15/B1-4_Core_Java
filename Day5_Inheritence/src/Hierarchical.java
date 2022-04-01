class Bus{
	void volvo() {
		System.out.println("Volvo Bus");
	}
	void CT() {
		System.out.println("City Bus");
	}
}
class Car extends Bus{
	void Ferrari() {
		System.out.println("Ferrari");
	}
}
class Bike extends Bus{
	void Hero() {
		System.out.println("Splendor");
	}
	void Honda() {
		System.out.println("Honda CT");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		Bike b=new Bike();
		Car c=new Car();
		b.Honda();
		b.Hero();
		b.volvo();
		b.CT();
		c.Ferrari();
		

	}

}
