

public class Example1 {
	int a,b;
	void display(int a,int b) {
		this.a=a;
		this.b=b;
	}
	void print() {
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
	}

	public static void main(String[] args) {
		Example1 e=new Example1();
		e.display(12, 21);
        e.print();
	}

}
