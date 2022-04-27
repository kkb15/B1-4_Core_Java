import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Example2 {

	public static void main(String[] args) {
		String datetime ="27-04-2022 18:16";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		LocalDateTime l=LocalDateTime.parse(datetime,df);
		System.out.println(l);
				

	}

}
