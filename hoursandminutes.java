import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int m1=m%60;
        int m2=m1/60;
        System.out.println(m2+" "+m1);
	}
}
