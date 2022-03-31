
public class Car1 {
	String st;
	Car1(String s){
		st=s;
	}

	public static void main(String[] args) {
		Car1 c= new Car1("Audi");
		Car1 d=new Car1("BMW");
		Car1 e=new Car1("Ferrari");
		System.out.println(c.st);
		System.out.println(d.st);
		System.out.println(e.st);
		

	}

}
