package Test;


import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import EmployeeListAndMethods.EmployeeIDMethods;

class EmployeeIdTestFail {

	@ParameterizedTest
	@ValueSource(strings= {"88dh23","dhdhdh","3838e8","483dh3","32323O"})
	void testWillFailBecouseItHasLettersInTheInput(String input) {
	var test=EmployeeIDMethods.validateEmploymentID(input);
		Assert.assertFalse(test);
	}
	@ParameterizedTest
	@ValueSource(strings= {"8843","3","349","32","37","9926"})
	void testWillFailBecouseItHasLessThenSixDigits(String input) {
	var test=EmployeeIDMethods.validateEmploymentID(input);
		Assert.assertFalse(test);
	}
	@ParameterizedTest
	@ValueSource(strings= {"884848484843","4844883","348448449","3434342","3434347","99434326"})
	void testWillFailBecouseItHaMoreThenSixDigits(String input) {
	var test=EmployeeIDMethods.validateEmploymentID(input);
		Assert.assertFalse(test);
	}
}
