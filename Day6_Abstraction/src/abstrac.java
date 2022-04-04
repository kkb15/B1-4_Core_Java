abstract class World{
	void city() {
		System.out.println("Ahemdabad");
	}
}
class Country extends World{
	
}
public class abstrac {

	public static void main(String[] args) {
		
		Country c=new Country();
		c.city();

	}

}
