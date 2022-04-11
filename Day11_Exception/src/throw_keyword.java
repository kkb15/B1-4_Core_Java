import java.util.Scanner;
public class throw_keyword {
	 static void display(int n) {
		 if(n>=18&&n<=21) {
			 System.out.println("eligible");
		 }
		 else {
			 throw new ArithmeticException("Error");
		 }
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		display(a);
		sc.close();

	}

}
