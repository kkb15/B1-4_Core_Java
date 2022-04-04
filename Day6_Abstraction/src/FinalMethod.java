 class X1{
	final void Hi() {
		System.out.println("Hello from X");
	}
}
class Y1 extends X1 {
	void Hi1() {
		System.out.println("Hi from Y");
	}
}


public class FinalMethod {

	public static void main(String[] args) {
		Y1 y=new Y1();
		y.Hi();
		y.Hi1();

	}

}
