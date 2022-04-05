package Instance;
class Mango{
	
}
class Apple extends Mango{
	
}

public class Fruit {

	public static void main(String[] args) {
		Apple a=new Apple();
		System.out.println(a instanceof Mango);

	}

}
