class R6{
	void print() {
		System.out.println("I love R6");
	}
}
class R15 extends R6{
	void display() {
		System.out.println("I love R15");
	}
}
class R5 extends R15{
	void show() {
		System.out.println("I love R5");
	}
}
public class Multilevel_Inheritence {

	public static void main(String[] args) {
		R5 r=new R5();
		r.display();
		r.show();
		r.print();

	}

}
