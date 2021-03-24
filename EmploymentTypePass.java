package Test;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import EmployeeListAndMethods.EmployeeTypeMethods;

class EmploymentTypePass {

	@ParameterizedTest
	@ValueSource(strings= {"P","F","f","p"})
	void testWillPassBecouseTheInputIsValid(String input) {
		var test=EmployeeTypeMethods.EmployementTypeHasNumber(input);
		Assert.assertTrue(test);
	}
}
