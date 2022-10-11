import java.util.Scanner;

public class OccurenceOfElements
{
	public void findOccuence(int a[],int c)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==c)
				count++;
		}
		System.out.println("Number of occurence of element: "+count);
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[] {3,5,4,3,3,4,6,7,6};
		System.out.println("The count of occurence");
		int c=sc.nextInt();
		OccurenceOfElements o=new OccurenceOfElements();
		o.findOccuence(a,c);
		

	}

}
