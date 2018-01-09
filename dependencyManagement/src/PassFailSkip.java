import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PassFailSkip {

	@Test (dependsOnGroups = { "addStandardCampaign" }, groups = { "addCampaignAsks" })
	public void passedTest() {
		Assert.assertTrue(true);
	}

	@Test
	public void failedTest() {
		Assert.assertTrue(false);
	}

	@Test 
	public void skipedTest() {
		throw new SkipException("Force Skipping by throwing SkipException");
	}
}