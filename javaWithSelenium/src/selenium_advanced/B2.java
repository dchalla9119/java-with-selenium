package selenium_advanced;

import org.testng.annotations.Test;

public class B2 {

	@Test(groups = {"end to end testing","regression testing"})
	public void hello1() {
		System.out.println("B2:  hello1");
	}
	@Test(groups = {"end to end testing"})
	public void hello2() {
		System.out.println("B2:  hello2");
	}
}
