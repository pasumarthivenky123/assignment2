package assignment2;
public class max {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Max(10,5);
       Max(12,5,8);
       Max(40,30,20,10);
	}
	public static void Max(int x,int y)
	{
         int   Max=((x+y)-(x-y))/2;
				System.out.println(+Max);
	}
	public static void Max(int x,int y,int z)
	{
         int   Max=((x+y+z)-(x-y-z))/3;
				System.out.println(+Max);
	}
	public static void Max(int x,int y,int z,int k)
	{
         int   Max=((x+y+z+k)-(x-y-z-k))/4;
				System.out.println(+Max);
	}
}