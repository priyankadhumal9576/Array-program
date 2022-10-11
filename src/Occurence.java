import java.util.Scanner;

public class Occurence 
{
	public void findOccurence(int a[])
	{
		int i;
		int count=0;
		for( i=0;i<a.length-1;i++)
		{
			if(a[i]==-999)
				continue;
	           count=1;
	         for(int j=i+1;j<a.length;j++)
	         {
	        	 if(a[i]==a[j])
	        	 {
	        		 count++;
	        	  a[j]=-999;
	        	 }
	         }
	         System.out.println(a[i]+"occurs"+count+"times");
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[] {3,5,4,3,3,4,6,7,6};
		//System.out.println("The count of occurence");
		//int c=sc.nextInt();
		Occurence o=new Occurence();
		o.findOccurence(a);
		

	}

}
