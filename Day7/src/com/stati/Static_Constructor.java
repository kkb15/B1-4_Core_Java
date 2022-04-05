package com.stati;

public class Static_Constructor {
	static int a;
	static String s;
	static {
		s="Kamal";
		a=25;
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(s);
	}

}
