import java.util.Scanner;

public class ReverseArrayPoition
{
	public void doReverse(int a[])
	{
		int i,j;
		for( i=0,j=a.length-1;i<=a.length/2 && j>=a.length/2;i++,j--)
		{
			//for(j=a.length-1;j>a.length/2;j--)
			//{                                                   
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
						
			//}
			
		}
		for(int x :a)
			System.out.print(x+" ");
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
		ReverseArrayPoition r=new ReverseArrayPoition();
		r.doReverse(a);

	}

}
