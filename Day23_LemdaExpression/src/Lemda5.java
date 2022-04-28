interface C{
	String print(String message);
}
public class Lemda5 {
	

	public static void main(String[] args) {
		C obj=(String message)->{
			return message;
		};
		System.out.println("Name is:"+obj.print("Kamal"));
		

	}

}
