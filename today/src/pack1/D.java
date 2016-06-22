package pack1;

import java.util.Scanner;

public class D {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter first number: ");
		int a=sc.nextInt();
		System.out.println("enter second number: ");
		int b=sc.nextInt();
		System.out.println("enter third number: ");
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("first number is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("second number is greater");
		}
		else
		{
			System.out.println("third number is greater");
		}
	}

}
