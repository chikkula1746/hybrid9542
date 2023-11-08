package package5_code;
//Write a program with out return type with object by passing the parameterized

public class Calculation1 {
	int a;//non-static
	static int b;//static
	
 void sum(int a,int b)//with parameters
{
	 System.out.println(a+b);
		
}
	public static void main(String[] args) {
		Calculation1 cal=new Calculation1();//creating with object
	cal.sum(100,200);
	

	}

}
 