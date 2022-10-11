import java.util.Arrays;
import java.util.Scanner;

public class RightRotate
{
	public void doRotation(int a[])
	{
		
		int n=3;
		for(int i=0;i<n;i++)
		{
			int last;
			last=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
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
		RightRotate r=new RightRotate();
		r.doRotation(a);

	}

}
