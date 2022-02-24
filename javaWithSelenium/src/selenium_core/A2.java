package selenium_core;

import org.testng.annotations.Test;

public class A2 {

	@Test(groups = {"end to end testing","regression testing"})
	public void hello1() {
		System.out.println("A2:  hello1");
	}
	@Test(groups = {"end to end testing"})
	public void hello2() {
		System.out.println("A2:  hello2");
	}

}
