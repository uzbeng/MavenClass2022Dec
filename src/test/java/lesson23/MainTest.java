package lesson23;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.comp.abc.xyz.Main;

public class MainTest {
	
	//@Test
	public void testSum() {
		Main myclass = new Main();
		Assert.assertEquals(myclass.sum(4, 5), 9);
	}

}
