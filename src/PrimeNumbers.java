import java.util.Scanner;

public class PrimeNumbers  
{  
	public void findPrime(int a[])
	{
		int i=0,j=0;
		for( i=0;i<a.length;i++)
		{
			boolean isprime=true;
			for( j=2;j<i;j++)
			{
				if(i%j==0)
					{
					isprime=false;
				    break;
					}
			}
			if(isprime)
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
		PrimeNumbers  p=new PrimeNumbers  ();
		p.findPrime(a);
  
		
    }
		
}
 
