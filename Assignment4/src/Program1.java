import java.util.Scanner;
public class Program1 {
       static int skip(int n,int k) {
		if(n==1) {
			return 1;
		}
		else {
		return (skip(n-1,k)+k-1)%n+1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),k=sc.nextInt();
		int a=skip(n,k);
		System.out.println(a);
        sc.close();
	}

}
