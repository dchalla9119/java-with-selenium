package basics;

public class LocalVariables_MethodLevelVariables {

	int n = 123;//class level variable
	void main()
	{
		int n = 321;//local variable
		System.out.println(n);
	}
	public static void main(String[] args) {
		LocalVariables_MethodLevelVariables demo = new LocalVariables_MethodLevelVariables();// created object syntax: classname variablename = new classname()
		demo.main();
	}//end of main
	}//end of class


//output: 321