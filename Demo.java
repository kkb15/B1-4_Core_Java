package College_Wallah;

public class Demo {
//	private char[] x;

	public void Hello(int x,int b) {
		System.out.println(x+"  "+b);
	}
	public void Hello(char a,int v) {
		System.out.println(a+"  "+v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.Hello('e', 3);
		d.Hello(3, 9);
		

	}

}
