
public class This_Constructor {
	int a;
	This_Constructor(){
		a=5;
	}
	This_Constructor display() {
		return this;
	}
	void print() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		This_Constructor c=new This_Constructor();
		c.display().print();

	}

}
