package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import EmployeeListAndMethods.EmployeeHourlyRate;

class hourlyRatePass {
	@ParameterizedTest
	@ValueSource(strings= {"20.00","30.00","40.00","45.00","20.30"})
	void testPassBecouseCOnditionsAreMet(String input)
	{
		var test=EmployeeHourlyRate.validateEmployeeHourlyRateLength(input);
				Assert.assertTrue(test);
	}
	@ParameterizedTest
	@ValueSource(strings= {"30.00","20.00","40.02","32.03"})
	void testWillPassBecouseDoesNotThrowsException(String input) {
		assertDoesNotThrow(()->EmployeeHourlyRate.validateEmployeeHourlyRateLength(input));
	}
	
}
