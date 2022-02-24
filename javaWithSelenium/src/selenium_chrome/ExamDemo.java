package selenium_chrome;

import lombok.Data;

@Data
public class ExamDemo {

	private int id;
	private String name;
	private double salary;
	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	public static void main(String[] args) {
	
		ExamDemo examDemo = new ExamDemo();
		examDemo.setId(5);
		System.out.println(examDemo.getId());
		
		examDemo.setName("RAMESHSOFT");
		System.out.println(examDemo.getName());
		
		examDemo.setSalary(4565.556);
		System.out.println(examDemo.getSalary());
//		System.out.println(ExamDemo.getSalary());
//		
		
		
	
	
}

}
