import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		LocalDate l= LocalDate.now();
		LocalTime t= LocalTime.now();
		LocalDateTime d=LocalDateTime.now();
		LocalDate x=LocalDate.of(2222,02,29);
		System.out.println(t);
		System.out.println(l);
		System.out.println(d);
		System.out.println(x);
		
		

	}

}
