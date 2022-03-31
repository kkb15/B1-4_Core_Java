
public class Car {
	String A;
	String B;
	String F;
	Car(String s,String b,String f){
		A=s;
		B=b;
		F=f;
	}
	void display() {
		System.out.println("This car is:"+A);
		System.out.println("This car is:"+B);
		System.out.println("This car is:"+F);
	}
	

	public static void main(String[] args) {
		Car c=new Car("Audi","Benz","Ferari");
		c.display();

	}

}
