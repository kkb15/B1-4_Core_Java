package com.java.Kamal;
import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Operation
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int sub=a-b;
		int multi=a*b;
		int div=a/b;
		int module=a%b;
		System.out.println("sum is: "+sum);
		System.out.println("sub is: "+sub);
		System.out.println("multi is: "+multi);
		System.out.println("Division is: "+div);
		System.out.println("Module is: "+module);
		
		sc.close();
	

	}

}
