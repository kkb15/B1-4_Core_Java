
public class Lembda7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Runnable R1=new Runnable() {
			@Override
			public void run() {
				System.out.println("Class is :Lemda");
			}
		};*/
		Runnable R1=()->{
			System.out.println("Class name is :Lamda");
		};
Thread t=new Thread(R1);
t.start();
	}

}
