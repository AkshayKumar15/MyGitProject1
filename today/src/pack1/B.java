package pack1;

import java.util.Scanner;

public class B {
		
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter 1st number:");
		int a=sc.nextInt();
		System.out.println("enter 2nd number:");
		int b=sc.nextInt();
		if(a>b)
		{
		System.out.println(a+" is greater");
		}
		else
		{
		System.out.println(b+" is greater");
		}
		
	}
}
