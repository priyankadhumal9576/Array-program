import java.util.Scanner;

public class SquareOfElements 
{
	/*public void findSquare(int a[])
	{
		System.out.println(" ");
		  System.out.println("The square of elements of array are:");
		  for(int i=0;i<a.length;i++)
		  {
			  System.out.println(a[i]*a[i]);
		  }*/
		  public void findSquareWithForEach(int a[])
			{
			  int i = 0;
			  System.out.println("square elements are:");
			  for(int x:a)
			  {
				  System.out.println(x*x);
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
	 /* for(int:a)
	  {
		  System.out.println(a[i]);
	  }*/
	  SquareOfElements s=new SquareOfElements();
	 // s.findSquare(a);
	  System.out.println("The enhanced sq are");
	  s.findSquareWithForEach(a);
	  
	}

}
