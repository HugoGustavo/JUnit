import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestJUnit3 extends TestResult {
	public synchronized void addError(Test test, Throwable throwable) {
		super.addError((junit.framework.Test) test, throwable);		
	}
	
	public synchronized void addFailure(Test test, AssertionFailedError assertionFailedError) {
		super.addFailure((junit.framework.Test) test, assertionFailedError);
	}
	
	@Test
	public void testAdd() {
		int value1 = 1;
		int value2 = 0;
		Assertions.assertTrue(value1/value2 == 0);
	}
	
	@AfterAll
	public synchronized void stop() {
		
	}
}
