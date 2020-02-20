import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJUnit1 {
	@Test
	public void testPrintMessage() {
		String message = "Robert";
		MessageUtil messageUtil = new MessageUtil(message);
		
		System.out.println("Inside testPrintMessage()");
		Assertions.assertEquals(message, messageUtil.printMessage());
	}
}
