final class X{
	void Hi() {
		System.out.println("Hello from X");
	}
}
class Y {
	void Hi() {
		System.out.println("Hi from Y");
	}
}
public class FinalClass {

	public static void main(String[] args) {
		X x=new X();
		x.Hi();
		Y y=new Y();
		y.Hi();

	}

}
