package practice.more.enhance;


public class TestOne2Three {
	
	public static boolean goodVerifier(String s)
	{
		int[] a=new int[127];
		
		for(int i=0;i<s.length();i++)
		{
			a[s.charAt(i)]=a[s.charAt(i)]+1;
			
		}
		
		for(int i=0;i<s.length()-1;i++)
		{
			if(a[s.charAt(i)]!=a[s.charAt(i+1)])
			{
			   return false;	
			}
		}		
		return true;
	}
	
	
		

	public static void main(String[] args) {
		System.out.println(goodVerifier("aabbccdd"));
		
		
		
		String s2="abbcdde";
		
		int[] a2=new int[127];
		
		for(int i=0;i<s2.length();i++)
		{
			a2[s2.charAt(i)]=a2[s2.charAt(i)]+1;
			
		}
		
		for(int i=0;i<s2.length();i++)
		{
			System.out.println(a2[s2.charAt(i)]);
			
			if(a2[s2.charAt(i)]>1)
			{
				System.out.println("the first duplicate character is "+s2.charAt(i)+" and is repeated "+a2[s2.charAt(i)]+" times"); break;
			}
		}
		
		
//		Assert.assert
		
		
		
		
		
		
		
//		ArrayList<String> list=new ArrayList<String>();
//		list.add("one");
//		list.add("one");
//		list.add("two"); list.add("three"); list.add("four");
//		list.add("five");list.add("five");list.add("five");
//		
//		
//		Set<Integer> set=new LinkedHashSet<Integer>();
//		
//		for(int e:b)
//		{
//			set.add(e);
//		}
//		
//		System.out.println(set);
//		Iterator<Integer> it=set.iterator();
//		int i=0;
//			while(it.hasNext())
//			{
//				b[i]=it.next();
//				i++;
//			}
//		
//		System.out.println(Arrays.toString(b));
//		
		
//		System.out.println(set);
//		
//		list.clear();
//		
//		list.addAll(set);
//		
//		System.out.println(list);
		
	
		
	
	
	
	
	}

}
