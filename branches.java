package assignment2;
import java.util.Scanner;
public class branches {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter branch:");
		String branch=sc.nextLine();
	}
	public static void course(String branch,int yr) {
     switch(branch)
     {
     case "cse":
    if(yr==1)
    {
    	System.out.println("maths,english,science");
    }
    if(yr==2)
    {
    	System.out.println("operating systems,java,data structure");
    if(yr==3)
    {
    	System.out.println("computer organization,multimedia");
    }
    if(yr==4)
    {
    	System.out.println("data communications and networks,multimedia");
    }
    break; 
    }
    
    case "ece":
    	 if(yr==1)
    	    {
    	    	System.out.println("maths,english,science");
    	    }
    	    if(yr==2)
    	    {
    	    	System.out.println("microprocessors,logic switching theory");
    	    if(yr==3)
    	    {
    	    	System.out.println("fundamentals of logic design,microelectronics");
    	    }
    	    if(yr==4)
    	    {
    	    	System.out.println("embedded systems,image processing");
    	    }
    	    break;
    	    }
    	    
    	    case "mech":
    	    if(yr==1)
    	    {
    	    	System.out.println("maths,english,science");
    	    }
    	    if(yr==2)
    	    {
    	    	System.out.println("drawing manufacturing,machines");
    	    if(yr==3)
    	    {
    	    	System.out.println("internal combustion engines,mechanical vibration");
    	    }
    	    if(yr==4)
    	    {
    	    	System.out.println("production technology,thermal engineering");
    	    }
    	    break; 
    	    }
    	    
    	    default:
    	    	System.out.println("invalid input");
    	    	break;
           }
    	    }
    	    }
		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		
    		