class Parent{
	void print() {
		System.out.println("Hello");
	}
	@Deprecated
	void print1() {
		System.out.println("Bye");
	}
}
public class Example3 {
	

	public static void main(String[] args) {
		Parent p=new Parent();
		p.print1();

	}

}
