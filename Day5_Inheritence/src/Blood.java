import java.util.Scanner;
public class Blood {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight = sc.nextInt();
		if(age>=18&&weight>=50) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		sc.close();
		
	}

}
