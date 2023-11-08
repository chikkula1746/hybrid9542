package package5_code;
//Write a program with return type with object 
public class Calculation {
	int a=15;
	int b=30;
	
 int sum() 
{
	return (a+b);
}

	public static void main(String[] args) {
		Calculation cal=new Calculation();
	int res=cal.sum();
	System.out.println(res);
	

	}

}
