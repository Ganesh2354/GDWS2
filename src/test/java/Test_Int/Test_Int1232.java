package Test_Int;

import java.util.HashSet;
import java.util.Set;

public class Test_Int1232 {

	public static void main(String[] args) {
		
		
		int[] a1= {1,2,3,4};
		int[] a2= {2,1,3,4,4,5};
		
		System.out.println(doesArrayContainsSameElement(a1,a2));
		
		
		
		
	}
	
	
	public static boolean doesArrayContainsSameElement(int[] a, int[] b)
	{
		int flag=0;
		
		Set<Integer> s1=new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			
			if(!s1.contains(a[i]))
			{
				s1.add(a[i]);
			}
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(!s1.contains(b[i]))
			{
				s1.add(b[i]);
				flag=1;
			}
		}
		
		if(flag==1)
		{
			return false;
		}
		else {
		return true;
		}
	}
	

}
