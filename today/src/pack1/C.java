package pack1;

import java.util.Scanner;

public class C {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("enter mode of transport: ");
		String MOT=sc.next() ;	
		
		
		switch (MOT) {
		
		case "Bus":
			System.out.println("Reach office in 20 min");
			break;
		case "Car":
			System.out.println("Reach office in 15 min");
			break;
		case "Train":
			System.out.println("Rech office in 30 min");
			break;
		case "Walk":
			System.out.println("You dont go to office");
			break;
		default:
			System.out.println("Invalid input..");
			break;
		}

	}

}
