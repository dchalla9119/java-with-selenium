package selenium_advanced;

import org.testng.annotations.Test;

public class B3 {

	@Test(groups = {"end to end testing","regression testing","sanitary testing"})
	public void hello1() {
		System.out.println("B3:  hello1");
	}
	@Test(groups = {"end to end testing","regression testing"})
	public void hello2() {
		System.out.println("B3:  hello2");
	}
}
