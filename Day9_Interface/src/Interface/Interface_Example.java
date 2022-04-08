package Interface;

interface Example{
	void display();
}
class Interface_Example implements Example{
	public void display() {
		System.out.println("Display method");
	}
public static void main(String[] args) {
		Interface_Example h=new Interface_Example();
		h.display();

	
	}
}
