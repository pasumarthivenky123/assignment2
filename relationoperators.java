package assignment2;
public class relationoperators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Relationaloperators(10,20);
	}
	public static void Relationaloperators(int a,int b)
	{
		if(a==b)
		{
			System.out.println("both inputs are equal");
		}
		else if(a>b)
		{
			System.out.println("a is greater than b");	
		}
		else if(a<b)
		{
			System.out.println("a is less than b");	
		}
		else if(a!=b)
		{
			System.out.println("a is not equal to b");	
		}
		else if(a>=b)
		{
			System.out.println("a is greater and equal to b");	
		}
		else if(a<=b)
		{
			System.out.println("a is less and equal to b");	
		}
	}
}