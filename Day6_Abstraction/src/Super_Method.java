class Bike{
	void Hero() {
		int a=55;
		System.out.println("Hero bike");
		System.out.println(a);
	}
}
class Bjaj extends Bike {
	void tvs() {
		System.out.println("TVS Bike");
		super.Hero();
	}
	
}
public class Super_Method {

	public static void main(String[] args) {
		Bjaj b=new Bjaj();
		b.tvs();

	}

}
