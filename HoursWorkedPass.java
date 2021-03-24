package Test;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import EmployeeListAndMethods.HoursWorked;

class HoursWorkedPass {
	@ParameterizedTest
	@ValueSource(strings= {"20.00","30.00","16.00","17.00","20.30"})
	void testPassBecouseCOnditionsAreMet(String input)
	{
		var test=HoursWorked.validateEmployeeHoursWorked(input);
		Assert.assertTrue(test);
	}

}
