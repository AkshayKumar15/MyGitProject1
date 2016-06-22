package pack1;

public class method1 {

	static int a=10;
	int b=20;
	public static void test1()
	{
		System.out.println(a);
	}
	public void test2()
	{
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		method1 m=new method1();
		test1();
		m.test2();

	}

}
