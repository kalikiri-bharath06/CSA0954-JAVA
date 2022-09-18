import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		int a,b,i,cal;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a and b");
		a=s.nextInt();
		b=s.nextInt();
		if(a<=0 && b<=0)
		{
		    System.out.println("INVALID");
		}
		else
		{
		    for(i=1;i<=10;i++)
		    {
		        cal=a*i;
		        System.out.println(a +"*" +i+"=" +cal);
		    }
		    for(i=1;i<=10;i++)
		    {
		        cal=b*i;
		        System.out.println(b +"*" +i+"="+cal );
		    }

		}

	}
}
