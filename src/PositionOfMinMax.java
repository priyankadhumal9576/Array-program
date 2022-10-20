import java.util.Scanner;

public class PositionOfMinMax 
{
	public void showPosition(int a[])
	{
		
		int i;
		int index=0;
		int min=a[index];
		for( i=0;i<a.length;i++)
		{
			if(a[i]<a[0])
				{
				min=a[i];
			index=i;
				}
		}
		System.out.println(min+"is minimum ");
		System.out.println(index+"is position of minimum ");
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
		PositionOfMinMax p=new PositionOfMinMax ();
		p.showPosition(a);
	}

}
