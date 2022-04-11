import java.util.Scanner;
public class Sum {
	public static int total(int a) {
		if(a==1) {
			return a;
		}
		else {
			return a+total(a-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(total(n));
sc.close();
	}

}
