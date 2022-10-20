
public class SecondLargestElement 
{
	public void findSecondLarge(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			
		}
		System.out.println(a[a.length-2]+" ");
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {65,45,3,78,100,546,98};
		SecondLargestElement l=new SecondLargestElement ();
		l.findSecondLarge(a);

	}

}
