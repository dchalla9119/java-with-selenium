package oops_Concept;

public class VarArgDemo {
	
	public void hello(String... str) //Var Arg parameters. String... takes from 0 to any number
	{
		//System.out.println("str");//1) str
		//System.out.println("Var Arg Method");//2) Var Arg Method
		System.out.println("Var Arg Method");
	}
	public void hello(int... str) //Var Arg parameters. int... takes from 0 to any number
	{
			System.out.println("1 Var Arg Method");
	}
	public void hello(String str1,int... str) //Var Arg parameters should be last statement inside the method. int... takes from 0 to any number
	{
			System.out.println("2 Var Arg Method");
	}
	public void hello(int str) //takes one int
	{
			System.out.println("3 Var Arg Method");
	}
	public static void main(String[] args) {
		VarArgDemo demo = new VarArgDemo();
		//demo.hello();//1) for this exact method is not there. it looks for alternate method. output; str
		//demo.hello();//2) exact method is not there so it looks for alternate method. output: Var Arg Method
		//demo.hello();//output: Var Arg Method
		//demo.hello("java");//output: Var Arg Method
		demo.hello("practice","job");//output: Var Arg Method
		demo.hello(25);
		demo.hello(25,35,45);
		demo.hello("java",45,35,645);
		
	}
}
