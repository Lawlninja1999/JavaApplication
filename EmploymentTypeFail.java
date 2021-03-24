package Test;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import EmployeeListAndMethods.EmployeeTypeMethods;

class EmploymentTypeFail {

	@ParameterizedTest
	@ValueSource(strings= {"T","theheh","Y","O","X","I","fufvdf","PP"})
	void testWillFailBecouseTheInputIsNotValidLengthOr_Not_P_Or_F(String input) {
		var test=EmployeeTypeMethods.validateEmploymentType(input);
		Assert.assertFalse(test);
	}
	@ParameterizedTest
	@ValueSource(strings= {"$","3","P3","O4","$X","5I","F4"})
	void testWillFailBecouseTheInputContainsADigit(String input) {
		var test=EmployeeTypeMethods.EmployementTypeHasNumber(input);
		Assert.assertFalse(test);
	}

}
