import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ClassOne {

	@Test(groups = { "classOne" })
	public void classOne_Test1() {
		Assert.assertTrue(true);
	}

	@Test
	public void classOne_Test3() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void classOne_Test2() {
		throw new SkipException("Force Skipping by throwing SkipException");
	}
}