package selenium_chrome;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LombokDemo {

	private String job;
	private int id;
	private float in;
	@Getter @ Setter private static String practice; //as it is static we need to give getter and setter methods in the beginning
	
	
	
	public static void main(String[] args) {
		LombokDemo lombok = new LombokDemo();
		lombok.setJob("Sangeeth");
		System.out.println(lombok.getJob());
		lombok.setId(78);
		System.out.println(lombok.getId());
		lombok.setIn(567.789f);
		System.out.println(lombok.getIn());
		lombok.setPractice("Hours");
		System.out.println(lombok.getPractice());
		
	}
	

}
