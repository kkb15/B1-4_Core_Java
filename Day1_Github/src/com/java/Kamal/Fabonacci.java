package com.java.Kamal;
import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,sum=0;
		System.out.print(a+","+b+",");
		for(int i=3;i<n;i++) {
			sum=a+b;
			System.out.print(sum+",");
			a=b;
			b=sum;
			sc.close();
			
		}

	}

}
