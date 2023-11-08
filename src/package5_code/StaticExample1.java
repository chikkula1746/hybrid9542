package package5_code;
//Write a program with no return type with object

public class StaticExample1 {
	  int a;//non static 
      static int b;//static
     
      void m2()
      {
    	  System.out.println("this is m2 - non-static method");  
      }
      
      
	public static void main(String[] args) {  
		
		StaticExample1 se1=new StaticExample1(); //creating with object
		se1.a=200;
		System.out.println(se1.a);
		se1.m2();
	}


}
	

