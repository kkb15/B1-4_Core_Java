
public class This_Method {
	void print() {
		System.out.println("JFS Developer");
	}
	void display() {
		this.print();
	}

	public static void main(String[] args) {
		This_Method t=new This_Method();
		t.display();

	}

}
