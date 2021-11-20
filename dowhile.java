package assignment2;
import java.util.Scanner;
public class dowhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
   do
   {
    int fact=1;
    for(int i=5;i>=1;i--)
   {
    	fact=fact*i;
   }
    System.out.println(+fact);
    System.out.println("Do you want to continue?(y/n)");
    Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
   }while(ch=='y');
   System.out.println();
	}
}