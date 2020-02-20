import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JavaTest {

	@Test
	public void testAdd() {
		int value1 = 3;
		int value2 = 3;
		int result = value1 + value2;
		Assertions.assertTrue(result == 6);
	}

}
