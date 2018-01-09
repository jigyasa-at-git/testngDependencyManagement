import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTwo {

	@Test(dependsOnGroups = { "classOne" }, groups = { "classTwo" })
	public void classTwo_Test1() {
		Assert.assertTrue(true);
	}
}