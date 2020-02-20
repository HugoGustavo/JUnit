import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import junit.framework.TestCase;

public class TestJUnit2 extends TestCase {
	@Test
	public void testSalutationMessage() {
		String message = "Robert";
		MessageUtil messageUtil = new MessageUtil(message);
		
		System.out.println("Inside testSalutationMessage()");
		message = "Hi! " + message;
		Assertions.assertEquals(message, messageUtil.salutationMessage());
	}
}
