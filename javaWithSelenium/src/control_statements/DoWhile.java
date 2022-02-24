package control_statements;


public class DoWhile {
	public static void main(String[] args) {
		int i = 1;
		do
		{
			System.out.println(i+"hello");
			i++;
		}
		while(i<=10);
		System.out.println("out of loop");
	}
}

////output:
//1hello
//2hello
//3hello
//4hello
//5hello
//6hello
//7hello
//8hello
//9hello
//10hello
//out of loop
