import java.util.Scanner;
public class Dhoni {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equals("Dhoni")) {
			System.out.println("Match");
		}
		else {
			System.out.println("Not Matching");
		}
		sc.close();

	}

}
