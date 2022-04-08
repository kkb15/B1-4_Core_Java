package Interface;

interface Car{
	void color();
	void company();
}
interface Bike{
	void speed();
}
class Vehical implements Car,Bike{
	public void color() {
		System.out.println("Car is red");
	}
	public void company() {
		System.out.println("Maruti");
	}
	public void speed() {
		System.out.println("Bike speed is:90km/h");
	}
}

public class Multi {

	public static void main(String[] args) {
		Vehical v=new Vehical();
		v.color();
		v.company();
		v.speed();

	}

}
