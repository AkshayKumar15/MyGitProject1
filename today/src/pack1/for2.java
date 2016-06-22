package pack1;

public class for2 {

	public static void main(String[] args) {
		
		for(char i='A';i<='G';i++)	//i=B
		{
			for(char j='A';j<=i;j++) 	//j=B, i=A
		{
			System.out.print(j);
		}
			System.out.println();
		}
	}

}
/*
 A
 AB
 ABC
 ABCD
 ABCDE
 */