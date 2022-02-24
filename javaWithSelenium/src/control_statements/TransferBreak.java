package control_statements;


public class TransferBreak {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10)
		{
			System.out.println(i+  "hello");
			i++;
			if(i==5)
			{
				break;
			}//end of if
		}//end of while
		System.out.println("out of loop");
	}//end of main
	}//end of class

////output:
//1hello
//2hello
//3hello
//4hello
//out of loop
