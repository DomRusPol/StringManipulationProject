package info.ls;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppRunnerTest {

	@Test
	void testGetResult() {
		
		String result = AppRunner.getResult(12345,123);
		assertEquals(
				"  12345\n" + 
				"    123\n" + 
				"  _____\n" + 
				"  37035\n" + 
				" 24690\n" + 
				"12345\n" + 
				"_______\n" + 
				"1518435", AppRunner.getResult(12345, 123));
	}

}



                                                                                                                               