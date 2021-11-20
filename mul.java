package assignment2;
public class mul {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       product(5,6);
       product(10.0f,6.0f);
       product(12.0d,12.0d);
}
   public static void product(int x,int y)
{
	int res=x*y;
	System.out.println(+res);
	}
	public static void product(float x,float y)
	{
		float res=x*y;
		System.out.println(+res);
		}
		public static void product(double x,double y)
		{
			double res=x*y;
			System.out.println(+res);
			}
}
