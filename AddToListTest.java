package Test;


import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import EmployeeListAndMethods.ExixAdding;

class AddToListTest {
	@ParameterizedTest
	@ValueSource(strings= {"Yes","YES","yes"})
	void testReturnTrueAndTheLoopContinues(String input)
	{
		var test=ExixAdding.ExitAddingMethod(input);
		Assert.assertTrue(test);
	}
	@ParameterizedTest
	@ValueSource(strings= {"No","NO","no"})
	void testReturnsFalseAndTheLoopIsNeeeded(String input)
	{
		var test=ExixAdding.ExitAddingMethod(input);
		Assert.assertFalse(test);
	}
}
