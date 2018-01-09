import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ClassThree {

	@Test(dependsOnGroups = { "classTwo" }, groups = { "classThree" })
	public void classThree_Test1() {
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "classThree_Test3" })
	public void classThree_Test2() {
		Assert.assertTrue(true);
	}

	@Test
	public void classThree_Test3() {
		throw new SkipException("Force Skipping by throwing SkipException");
	}
}