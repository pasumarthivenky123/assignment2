package assignment2;
import java.util.Scanner;
public class calculate2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		int count=0;
		for(int i=num;num!=0;)
		{
			num=num/10;
			count++;
		}
  System.out.println("no.of digits in an entered integer:"+count);
	}
}