package lesson23;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestB {
	
	@Test
	public void testB1() {
		System.out.println("Test B1");
	}
	
	@Test
	public void testB2() {
		System.out.println("Test B2");
		Assert.fail("Failing it for testing");
	}

}
