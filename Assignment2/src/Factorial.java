import java.util.Scanner;
public class Factorial {
	public static int fact(int n) {
		if(n==0) {
			return 0;
		}
		else {
			return fact(n-1)*n;
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int x=fact(n);
		System.out.println(x);
		sc.close();
		

	}

}
