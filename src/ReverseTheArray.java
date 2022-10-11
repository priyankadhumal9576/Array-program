import java.util.Scanner;

public class ReverseTheArray
{
	public void doReverse(int a[])
	{
      System.out.println("The reverse elements of array are:");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
       		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array you want:");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("The elements of array are:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		 ReverseTheArray rr=new  ReverseTheArray();
		 rr.doReverse(a);

	}

}
