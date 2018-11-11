import java.util.*;
import java.util.Scanner;

class Main
{
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String p= sc.next();
		String a= sc.next();
		
		Main o = new Main();
		System.out.println(o.verifyP(p));
		System.out.println(o.verifyA(a));
	}
	
	boolean verifyP(String p)
	{
		int l = p.length();
		if(l==10)
		{
			for(int i =0;i<10;i++)
			{
			if(('A'<=p.charAt(i)&&p.charAt(i)<='Z')||('0'<=p.charAt(i)&&p.charAt(i)<='9'))
			{
				if(i==9)
				return true;
			}
			else
			{
                return false;
			}
				

			}	
		}
		return false;
	}
    boolean verifyA(String p)
	{
	    int l = p.length();
		if(l==12)
		
		{
			for(int i =0;i<12;i++)
			{
    			if(('0'<=p.charAt(i)&&p.charAt(i)<='9'))
    			{
    				if(i==11)
    				return true;
    			}
    			else
    			{
                    return false;
    			}
    				
			}	
		}
		return false;	
	}
	
}
