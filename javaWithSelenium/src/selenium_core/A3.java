package selenium_core;

import org.testng.annotations.Test;

public class A3 {

	@Test(groups = {"end to end testing"})
	public void hello1() {
		System.out.println("A3:  hello1");
	}
	@Test(groups = {"end to end testing","regression testing","sanitary testing"})
	public void hello2() {
		System.out.println("A3:  hello2");
	}
}
