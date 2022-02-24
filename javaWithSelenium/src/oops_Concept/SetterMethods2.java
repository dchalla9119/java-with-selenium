package oops_Concept;

public class SetterMethods2 {
	private int practiceHrs = 0;
	private String name="jkl";
	public int getPracticeHrs() 
	{
		return practiceHrs;
	}
	public void setPracticeHrs(int practiceHrs) //here for easy understanding of program we can give int practiceHrs as  int prac
	{
	//this. is not there we will get default values.because we are not assigning any value
		practiceHrs = practiceHrs;//this. always gives priority for class level variables. it doesnt give priority to local variables
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public static void main(String[] args) {
		SetterMethods2 setter1 = new SetterMethods2();
		setter1.setPracticeHrs(9);
		setter1.setName("job");
		System.out.println(setter1.getPracticeHrs());
		System.out.println(setter1.getName());
	}


}
