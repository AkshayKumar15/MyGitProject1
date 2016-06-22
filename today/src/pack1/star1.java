package pack1;

import java.util.Scanner;

public class star1 {

	public static void main(String[] args) {
		System.out.println("Please input a number...");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");                
            }
            System.out.println();
        }
        for(int i = num; i > 0 ; i--){
            for(int j = i - 1 ; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    

	}

}
