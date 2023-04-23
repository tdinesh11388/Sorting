package Sorting;

public class Demo {

	public static void main(String[] args)
	{
		int[]a= {2,3,5,7,8};
		int[]b= {4,2,6,9,2};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			 //sum=sum+a[i]+b[i];
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			
		}
		for(int j=0;j<b.length;j++)
		{
			if(b[j]%2==0)
			{
				sum=sum+b[j];
			}
		}
		System.out.println(sum);
	}

}
