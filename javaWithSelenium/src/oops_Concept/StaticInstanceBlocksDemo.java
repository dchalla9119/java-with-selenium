package oops_Concept;

class BlockDemo1
{
	public BlockDemo1()
	{
		System.out.println("P: DC");
	}
	static
	{
		System.out.println("P: SB1");
	}
	static
	{
		System.out.println("P: SB2");
	}
	{
		System.out.println("P: IB1");
	}
}
public class StaticInstanceBlocksDemo extends BlockDemo1
{
	public StaticInstanceBlocksDemo()
	{
		System.out.println("C: DC");
	}
	{
		System.out.println("C: IB1");
	}
	static
	{
		System.out.println("C: SB1");
	}
	static
	{
		System.out.println("C: SB2");
	}
public static void main(String[] args) {
	System.out.println("main()");
	StaticInstanceBlocksDemo staticInstanceBlocksDemo = new StaticInstanceBlocksDemo();
	
}
}
//op
//P: SB1
//P: SB2
//C: SB1
//C: SB2
//main()
//P: IB1
//P: DC
//C: IB1
//C: DC
//
