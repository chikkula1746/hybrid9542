package package5_code;
//Write a program with no return type with out object

public class StaticExample {
        int a;//non static 
        static int b;//static
        static void m1()
        {
        	System.out.println("this is m1 - static method");
        }
	public static void main(String[] args) {  //stattic method
		b=100;
		System.out.println(b);
		m1();
		
		
	}

}
