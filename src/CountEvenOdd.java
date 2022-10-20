import java.util.Scanner;

public class CountEvenOdd 
{
	public void countNumber(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
					count++;
				System.out.println(a[i]+"Are even numbers");
				
			}
		}
		System.out.println(count+"are number of even");
		System.out.println((a.length-count)+"are odd ");
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
		CountEvenOdd c=new CountEvenOdd ();
		c.countNumber(a);

	}

}
