package Test_Int;

import java.util.Arrays;

public class Test_Int1233 {
	
	public static void main(String[] args) {

//		String s = "G@A#n%%esH"; 
		String s = "G&*A#%$n!R!a@j";
		int spclcntr=0;
		//wait.until(ExpectedConditions.elementToBeLocated(By.xpath("//input[@name='pass']"))
		for(int i=0;i<s.length();i++)
		{		
			if((Character.isDigit(s.charAt(i)))==false && (Character.isAlphabetic(s.charAt(i)))==false && (Character.isWhitespace(s.charAt(i)))==false)
			{
				spclcntr++;			
			}
		}
		System.out.println(spclcntr);

		String mod="";
		int[] ind=new int[spclcntr];
		int in=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				mod=mod+s.charAt(i);
			}			
			else if((!Character.isDigit(s.charAt(i))) || (!Character.isAlphabetic(s.charAt(i))) || (!Character.isWhitespace(s.charAt(i))))
			{
				ind[in]=i;in++;
			}			
		}
		System.out.println(Arrays.toString(ind));
		String newmod="";
		int revcnt=0;
		
		for(int i=0;i<s.length();i++)
		{
			int flag=0;
			for(int j=0;j<ind.length;j++)
			{
				if(ind[j]==i)
				{
					newmod=newmod+s.charAt(i);flag=1;
				}			
			}
			if(flag==0)
			{
				newmod=newmod+mod.charAt(revcnt);revcnt++;
			}
		}
		System.out.println(newmod);
				
	}

}
