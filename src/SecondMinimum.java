
public class SecondMinimum
{
	public void findSecondMinimum(int a[])
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
		System.out.println(a[1]+" ");
		
	}

	public static void main(String[] args) 
	{
		int a[]=new int[] {54,698,132,54,1,25};
		SecondMinimum s=new SecondMinimum();
		s.findSecondMinimum(a);

	}

}
