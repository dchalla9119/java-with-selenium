package selenium_advanced;

import org.testng.annotations.Test;

public class B1 {

	@Test(groups = {"end to end testing","regression testing","sanitary testing"})
	public void hello1() {
		System.out.println("B1:  hello1");
	}
	@Test(groups = {"end to end testing","regression testing","sanitary testing"})
	public void hello2() {
		System.out.println("B1:  hello2");
	}
}
