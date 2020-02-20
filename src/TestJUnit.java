import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit {
	@Test
	@Ignore
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		
		String message = "Robert";
		MessageUtil messageUtil = new MessageUtil(message);
		
		Assertions.assertEquals(message, messageUtil.printMessage());

	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		
		MessageUtil messageUtil = new MessageUtil("Robert");
		Assertions.assertEquals("Hi! Robert", messageUtil.salutationMessage());
	}
	
	@Test(timeout = 10000)
	public void testWithTimeoutPrintMessage() {
		System.out.println("Inside testWithTimeoutPrintMessage()");
		MessageUtil messageUtil = new MessageUtil("Robert");
		messageUtil.printMessageWithTimeout();
	}
	
	@Test(expected = ArithmeticException.class )
	public void testSalutationMessageWithException() {
		System.out.println("Inside testSalutationMessageWithException()");
		MessageUtil messageUtil = new MessageUtil("Robert");
		messageUtil.printWithDivisionByZero();
	}
}
