class A{
	void print(int num) {
		synchronized (this) {
			for(int i=1;i<=3;i++) {
				System.out.println(num*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
class B extends Thread{
	A obj;
	B(A obj){
		this.obj=obj;
	}
	public void run() {
		obj.print(50);
	}
}
public class Example4 {
A a=new A();
B b=new B();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
