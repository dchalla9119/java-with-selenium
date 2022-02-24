package basics;

public class ThisDotLocalVariables_MethodLevelVariables {
	int n = 123;//class level variable
void main()
{
	int n = 321;//local variable
	System.out.println(this.n);//this. never gives priority to local variables. it always gives priority to class level variables
	System.out.println(n);
}
public static void main(String[] args) {
	ThisDotLocalVariables_MethodLevelVariables demo = new ThisDotLocalVariables_MethodLevelVariables();// created object syntax: classname variablename = new classname()
	demo.main();
}//end of main
}//end of class

////output: 
//123
//321
