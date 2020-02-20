import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestAssertions {
	@Test
	public void testAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		Assertions.assertEquals(str1, str2);
		Assertions.assertTrue(val1 < val2);
		Assertions.assertFalse(val1 > val2);
		Assertions.assertNotNull(str1);
		Assertions.assertNull(str3);
		Assertions.assertSame(str4, str5);
		Assertions.assertNotSame(str1, str3);
		Assertions.assertArrayEquals(expectedArray, resultArray);
		

	}
}
