package pack1;
import java.util.Scanner;

public class item {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
			
				System.out.println("enter your shoping item: ");
				String item=sc.next() ;		
				
				switch (item) {
				
				case "cloth":
					System.out.println("discount of 5%");
					break;
				case "electronic item":
					System.out.println("discount of 7%");
					break;
				case "toys":
					System.out.println("discount of 10%");
					break;
				case "footware":
					System.out.println("discount of 15%");
					break;
				default:
					System.out.println("no discount..");
					break;
				}

	}

}
