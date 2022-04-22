import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class JUnittest4 {
	//@BeforeAll
	@AfterAll
	//@Test
	static void display() {
		System.out.println("Before");
	}
	//@Tag("Diya")
	//@Disabled
	@Test
	void display1() {
		System.out.println("next");
	}
	

}
