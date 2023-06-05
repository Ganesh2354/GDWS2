package Test_Int;

public class Test_Int123 {

	public static void main(String[] args) {


		String msg="I am an automation engineer";
		String[] splmsg=msg.split(" ");
		String revmsg="";
		
		for(int i=0;i<splmsg.length;i++)
		{
			for(int j=splmsg[i].length()-1;j>=0;j--)
			{
				revmsg=revmsg+splmsg[i].charAt(j);
								
			}
			
			revmsg=revmsg+" ";
			
		}
		
		System.out.println(revmsg);
		
		

	}

}
