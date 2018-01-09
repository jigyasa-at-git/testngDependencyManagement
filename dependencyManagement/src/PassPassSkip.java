import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PassPassSkip {

	@Test
	public void passedTest1() {
		Assert.assertTrue(true);
	}

	@Test
	public void passedTest2() {
		Assert.assertTrue(true);
	}

	@Test 
	public void skipedTest() {
		throw new SkipException("Force Skipping by throwing SkipException");
	}
}