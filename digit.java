package assignment2;
import java.util.Scanner;
public class digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number:");
     int num=sc.nextInt();
     if(num>99&&num<1000)
     {
    	 System.out.println("you entered 3 digit number");
     }
     else if(num>9&&num<100)
     {
    	System.out.println("you entered 2 digit number"); 
     }
     else if(num<9) 
     {
    	 System.out.println("you entered 1 digit number");
     }
     else
     {
    	 System.out.println("your entered number is too high");
     }
	}

}
