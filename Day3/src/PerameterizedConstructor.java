
public class PerameterizedConstructor {
	int x;
	String n;
	PerameterizedConstructor(int a,String b){
		x=a;
	    n=b;
	}

	public static void main(String[] args) {
		PerameterizedConstructor p=new PerameterizedConstructor(23,"Javed");
		System.out.println(p.x+","+p.n);
		
		

	}

}
