class Example{
	int a;
	Example(int a){
		this.a=a;
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		Example e=new Example(4);
		System.out.println(e.a);
		

	}

}
