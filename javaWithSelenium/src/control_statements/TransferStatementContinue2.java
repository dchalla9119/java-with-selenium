package control_statements;


public class TransferStatementContinue2 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10)
		{
			
						i++;
			if(i==5)
			{
				System.out.println(i+  "hello");
				continue;
			}//end of if
			
		
		}//end of while
		System.out.println("out of loop");
	}//end of main
	}//end of class



////output:
//5hello
//out of loop
