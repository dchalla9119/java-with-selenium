package control_statements;


public class DoWhile2 {
	public static void main(String[] args) {
		int i = 1;
		do
		{
			System.out.println(i+"hello");
			i++;
		}
		while(i>=10);
		System.out.println("out of loop");
	}
}

////output:
//1hello
//out of loop
