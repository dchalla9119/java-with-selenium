package control_statements;


public class NestedIfElse3 {
	public static void main(String[] args) {
		int n1 = 2, n2 = 3, n3 = 2;
		if(n1==n2)
		{
			System.out.println("hello");
			if(n1==n3)
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
//hi
//normal statement1
//normal statement2
