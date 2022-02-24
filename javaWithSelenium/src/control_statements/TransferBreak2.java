package control_statements;


public class TransferBreak2 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10)
		{
			System.out.println(i+  "hello");
			if(i==5)
			{
				break;
			}//end of if
			i++;
		}//end of while
		System.out.println("out of loop");
	}//end of main
	}//end of class

////output:
//1hello
//2hello
//3hello
//4hello
//5hello
//out of loop
