import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassFour {

	@Test(dependsOnGroups = { "classThree" }, groups = { "classFour" })
	public void classFour_Test1() {
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = { "classFour_Test3" })
	public void classFour_Test2() {
		Assert.assertTrue(true);
	}

	@Test
	public void classFour_Test3() {
		Assert.assertTrue(true);
	}
}