package Test_Int;

public class Test_PrimeNo {

	public static void main(String[] args) {
		
		int num=7, temp=num;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(temp%i==0)
			{
				count++;
			}
		}
		
		if(count!=0)
		{
			System.out.println(num+" isnot prime");
		}
		else {
			System.out.println(num+" is prime");
		}


		

	}

}
