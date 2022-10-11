import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation 
{
	public void doLeftRotation(int a[])
	{
		int n=4;                         //how many times you want rotation
		for(int i=0;i<a.length;i++)
		{
			int first;
			int j;
			first=a[0];
			for( j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=first;
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		
	    }
		LeftRotation l=new LeftRotation();
		l.doLeftRotation(a);

	}

}
