import java.util.Arrays;
import java.util.Scanner;

public class AlternateNumber 
{
	public void doAlternate(int a[])
	{
System.out.println("length is:"+a.length);
		
		System.out.println("alternate array elements are:");
		for(int i=0;i<=a.length;i=i+2)
		{
			System.out.println(a[i]+" ");
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		AlternateNumber an=new AlternateNumber();
		an.doAlternate(a);

	}

}
