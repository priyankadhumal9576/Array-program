import java.util.Scanner;

public class SquareOfElements 
{
	public void findSquare(int a[])
	{
		System.out.println(" ");
		  System.out.println("The square of elements of array are:");
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]*a[i]);
		  }

	}

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the size");
	  int size=sc.nextInt();
	  
	  int a[]=new int[size];
	  System.out.println("The elements of the array are:");
	  for(int i=0;i<size;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	  SquareOfElements s=new SquareOfElements();
	  s.findSquare(a);
	  
	}

}
