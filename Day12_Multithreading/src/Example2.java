
public class Example2 extends Thread {
	public void run() {
		System.out.println("Thread of Example2");
		
	}

	public static void main(String[] args) {
		Example1 e=new Example1();
		e.start();
		e.run();
		//e.start();

	}

}
