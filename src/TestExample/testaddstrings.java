package TestExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddstrings {

	@Test
	void test() {
		testClass junit = new testClass();
		String res = junit.addStrings("abc", "bcd");
		assertEquals("abcbcd", res);
	}

}
