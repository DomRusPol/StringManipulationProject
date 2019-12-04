package info.ls;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppRunnerTest {

	@Test
	void testGetResult() {
		
		String result = AppRunner.getResult(12345,123);
		assertEquals("  12345\r\n" + 
				"    123\r\n" + 
				"  _____\r\n" + 
				"  37035\r\n" + 
				" 24690\r\n" + 
				"12345\r\n" + 
				"_______\r\n" + 
				"1518435", AppRunner.getResult(12345, 123));
	}

}



                                                                                                                               