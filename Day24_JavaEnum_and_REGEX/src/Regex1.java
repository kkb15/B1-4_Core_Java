import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pattern=sc.nextLine();
		String input="Kamal";
		boolean Result=Pattern.matches(pattern, input);
		System.out.println(Result);
		sc.close();

	}

}
