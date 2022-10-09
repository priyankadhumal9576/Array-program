import java.util.Arrays;
public class ArrayEx1                  //To check default output.
{

	public static void main(String[] args) 
	{
		float f[]=new float[5];
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		System.out.println("-------------");
		
		double d[]=new double[5];
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		System.out.println("---------------");
		
		boolean b1[]=new boolean[5];
		for(int i=0;i<b1.length;i++)
		{
			System.out.println(b1[i]);
		}
		System.out.println("---------------");
		
		boolean[] b=new boolean[] {true,false,false,true,true,false};
			System.out.println(Arrays.toString(b));
			System.out.println("-------");
			
			float[] f1=new float[] {2f,3f};
			System.out.println(Arrays.toString(f1));

	}

}
