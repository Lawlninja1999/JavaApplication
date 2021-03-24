package Test;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import EmployeeListAndMethods.EmployeeIDMethods;

class EmployeeIdTestPass {

	@ParameterizedTest
	@ValueSource(strings= {"103828","038288","485858","484384","483843"})
	void testWillPassBecouseThereIsNoLettersAndSixDigitNumber(String input) {
	var test=EmployeeIDMethods.validateEmploymentID(input);
		Assert.assertTrue(test);
	}
}
