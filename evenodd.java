import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int n,m,mul;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	mul=n*m;
	if(mul%2==0)
	System.out.println("even");
	else
	System.out.println("odd");	// your code goes here
	}
}
