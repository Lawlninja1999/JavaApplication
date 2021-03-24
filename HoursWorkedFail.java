package Test;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import EmployeeListAndMethods.HoursWorked;

class HoursWorkedFail {
	@ParameterizedTest
	@ValueSource(strings= {"3d","46.00","10.j0","10.00","300","23.9","if.ds","103.00","23.9o"})
	void testWillFailBecouseTheInputContainsALetterOrOtherConditionsAreNotMet(String input) {
		var test=HoursWorked.validateEmployeeHoursWorked(input);
		Assert.assertFalse(test);
	}

}
