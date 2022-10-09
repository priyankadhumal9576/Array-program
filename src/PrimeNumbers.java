import java.util.Scanner;

public class PrimeNumbers  
{  
	public static void main(String[] args)   
  {  
		int a[]=new int[5];
   int ct=0,n=0,i=1,j=1;  
    while(n<5)  
    {  
      j=1;  
      ct=0;  
      while(j<=i)  
     {  
      if(i%j==0)  
      ct++;  
     j++;   
    }  
    if(ct==2)  
    {  
      System.out.println(a[i]);  
      n++;  
    }  
      i++;  
    }  
		/*int i;
		int a[]=new int[5];
		int ct=0,n=0;
		for( i=1;n<5;i++)
		{
			for(int j=1;j<=i;j++)
				if(i%j==0)
				ct++;		
		}
			if(ct==2)
			{
				System.out.println(i);
			}
			n++;*/
   }  
	
}
 
