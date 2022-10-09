import java.util.Scanner;

public class AscendingOrder 
{
	public void ascendingNumber(int a[])
	{
		System.out.println("Elements in ascending order are as:");
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					max=a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
			
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Elements of the array are:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		//int a[]=new int[5];
		AscendingOrder ao=new AscendingOrder();
		ao.ascendingNumber(a);
		
	}

}
