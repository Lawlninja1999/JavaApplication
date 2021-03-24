package Test;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import EmployeeListAndMethods.EmployeeHourlyRate;

class HourlyRateFail {
	@ParameterizedTest
	@ValueSource(strings= {"3d","46.00","10.j0","10.00","300","23.9","if.ds","103.00","23.9o"})
	void testWillFailBecouseTheInputContainsALettersOrDoesNotMeetTheRequirements(String input) {
		var test=EmployeeHourlyRate.validateEmployeeHourlyRateLength(input);
		Assert.assertFalse(test);
	}
}
