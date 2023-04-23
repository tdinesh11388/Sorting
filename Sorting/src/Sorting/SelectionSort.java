package Sorting;

public class SelectionSort {

	public static void main(String[] args)
	{
		int[]a= {4,6,7,1,3,9};
		//int[]a= {3,6,8,1,4,9,2};

		sort(a);
		for(int s:a)
		{
			System.out.println(s);
		}
	}
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])
				{
					index=j;
				}
				if(i!=index)
				{
					int temp=a[i];
					a[i]=a[index];
					a[index]=temp;
				}
			}
		}
	}

}
