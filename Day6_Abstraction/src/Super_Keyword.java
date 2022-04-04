class Example3{
		String s="Day";
	
}
class Example1 extends Example3{
	String s="Night";
	void show() {
		
		System.out.println(super.s);
		System.out.println(s);
		
	}
}
public class Super_Keyword {

	public static void main(String[] args) {
		Example1 e=new Example1();
		e.show();
		

	}

}
