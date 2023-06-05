package Test_Int;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_Int3 {
	
	static String add_Binary(String x, String y)
    {
  
        int num1 = Integer.parseInt(x,2);
        //converting binary string into integer(decimal number)
       
        int num2 = Integer.parseInt(y,2);
        //converting binary string into integer(decimal number)
       
       
        int sum = num1 + num2;
        // Adding those two decimal numbers and storing in sum
         
        String result = Integer.toBinaryString(sum);
        //Converting that resultant decimal into binary string
 
        return result;
    }
	static int countStrings(int n)
    {
        int a[] = new int[n];
        int b[] = new int[n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }
        return a[n - 1] + b[n - 1];
    }

	public static void main(String[] args) {
		
		
		 System.out.println(0.1*3 == 0.3);
		    System.out.println(0.1*2 == 0.2);
		
//		int n=2;		
//		int a[] = new int[n];
//        int b[] = new int[n];
//        a[0] = b[0] = 1;
//        for (int i = 1; i < n; i++) {
//            a[i] = a[i - 1] + b[i - 1];
//            System.out.println(a[i]);
//            b[i] = a[i - 1];System.out.println(b[i]);
//        }
        
        
		
		
		
		
		
		
		
		
		
		
		
		
//		String s1="10101";
//		String s2="0101";
//		int s1n=Integer.parseInt(s1, 2);
//		int s2n=Integer.parseInt(s2, 2);
//        int sum=s1n+s2n;
//        
//        String result=Integer.toBinaryString(sum);
//		
//       System.out.println(result);
//        
		
//		if(true)
//		{
//			System.out.println(111);
//			break;
//		}
		
		
	}

}
