package com.Array;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Element are:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		

	}

}
