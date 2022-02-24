package selenium_core;

import org.testng.annotations.Test;

public class A1 {

	@Test(groups = {"end to end testing","regression testing","sanitary testing"})
	public void hello1() {
		System.out.println("A1:  hello1");
	}
	@Test(groups = {"end to end testing","regression testing"})
	public void hello2() {
		System.out.println("A1:  hello2");
	}
}
