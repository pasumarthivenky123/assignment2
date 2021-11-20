package assignment2;
public class Ternary3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ternary3(15,30,20);
	}
	public static void  Ternary3(int a,int b,int c)
	   {
		      int Greater=(a>b)?(a>c?a:c):(b>c?b:c);
		   System.out.println(+Greater);
	   }
	}
