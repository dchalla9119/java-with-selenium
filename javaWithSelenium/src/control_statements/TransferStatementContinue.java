package control_statements;


public class TransferStatementContinue {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10)
		{
			i++;
			if(i==5)
			{
				continue;
			}//end of if
			System.out.println(i+  "hello");
		}//end of while
		System.out.println("out of loop");
	}//end of main
	}//end of class

////output:
//2hello
//3hello
//4hello
//6hello
//7hello
//8hello
//9hello
//10hello
//11hello
//out of loop

//public class TransferStatementContinue {
//	public static void main(String[] args) {
//		int i = 1;
//		while(i<=10)
//		{
//			
//			i++;
//			if(i==5)
//			{
//				continue;
//			}//end of if
//			System.out.println(i+  "hello");
//		}//end of while
//		System.out.println("out of loop");
//	}//end of main
//	}//end of class

//output:
//2hello
//3hello
//4hello
//6hello
//7hello
//8hello
//9hello
//10hello
//11hello
//out of loop

