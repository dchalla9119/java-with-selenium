package control_statements;


public class NestedIfElse {
	public static void main(String[] args) {
		int n1 = 2, n2 = 2;
		if(n1==n2)
		{
			System.out.println("hello");
			if(n1==5)
			{
				System.out.println("nested if");
			}
		}
		else
		{
			System.out.println("hi");
		}
		System.out.println("normal statement1");
		System.out.println("normal statement2");
	}

}

////output:
//hello
//normal statement1
//normal statement2
