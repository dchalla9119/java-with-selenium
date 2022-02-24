package oops_Concept;

public class SetterMethods1 {
	private int practiceHrs = 0;
	private String name = "jhj";
	public int getPracticeHrs() 
	{
		return practiceHrs;
	}
	public void setPracticeHrs(int pra) //here for easy understanding of program we can give int practiceHrs as  int prac
	{
		this.practiceHrs = pra;//this. always gives priority for class level variables. it doesnt give priority to local variables
	}
	//public String getName() 
	//{
		//return name;
	//}
	//public void setName(String name) 
	//{
		//this.name = name;
	//}
	public static void main(String[] args) {
		SetterMethods1 setter = new SetterMethods1();
		setter.setPracticeHrs(9);
		//setter.setName("job");
		System.out.println(setter.getPracticeHrs());
		//System.out.println(setter.getName());
	}

}
