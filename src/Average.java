
public class Average 
{
	public void findAverage(int a[])
	{
		int sum=0;
		int oddCount=0;
		float average = 0;
		for(int i=0;i<a.length ;i++)
		{
			if(a[i]%2!=0)
			{
				oddCount++;
				sum=sum+a[i];
				 average=sum/oddCount;
			}
					
		}
		System.out.println("Average is:"+average);
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {5,4,3,15,35,9,11};
		Average avg=new Average();
		avg.findAverage(a);

	}

}
