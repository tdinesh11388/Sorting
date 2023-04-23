package Sorting;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		
	//	String s="abc3mnop23";
		String s1="";
		String s2="";
		int a=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			{
				s1+=c;
			}
			if(c>='0' && c<='9')
			{
				s2+=c;
					if(s.charAt(i+1)>='0' && s.charAt(i+1)<='9')
					{
						s2+=c;
					}	
				a=Integer.parseInt(s2);
				System.out.println(a);
				for(int j=0;j<a;j++)
				{
					System.out.println(s1);
				}
				s1="";
				s2="";
			}
		}
		
		
	}

}
