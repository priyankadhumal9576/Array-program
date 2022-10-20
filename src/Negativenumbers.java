
import java.util.Scanner;

public class Negativenumbers 
{
	public void findNegative(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
				if(a[i]<0)
				{
					count++;
					System.out.println(a[i]+"are negarive numbers ");
					
				}
				else
					System.out.println(a[i]+"positive numbers");
			
		}
		System.out.println(count+" Are number of negative numbers");
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Elements of the array are:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int x:a)
		{
			System.out.println(x+" ");
		}
		Negativenumbers n=new Negativenumbers ();
		n.findNegative(a);

	}

}
