package Sorting;

public class MergeSort {

	public static void main(String[] args)
	{
		int[]a= {2,3,5,1};
		sort(a);
		for(int s:a)
		{
			System.out.println(s);
		}
	}
	public static void sort(int[]a)
	{
		if(a.length==1)return;
		int []left=new int[a.length/2];
		int []right=new int[a.length-left.length];
		
		for(int i=0;i<left.length;i++)
		{
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=a[left.length+j];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int[]l,int[]r,int[]c)
	{
		int i=0,j=0,k=0;
		while(i<l.length && j<r.length)
		{
			if(l[i]<r[j])
			{
				c[k]=l[i];
				k++;
				i++;
			}
			else {
				c[k]=r[j];
				k++;
				j++;
			}
		}
		while(i<l.length)
		{
			c[k]=l[i];
			k++;
			i++;
		}
		while(j<r.length)
		{
			c[k]=r[j];
			k++;
			j++;
		}
	}

}
