package Test;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import EmployeeListAndMethods.EmployeeIDMethods;

class EmployeeIdTestPass {

	@Test
	void test1pass() {
		var test=	EmployeeIDMethods.validateEmploymentID("312123");
		Assert.assertTrue(test);
	}
	@Test
	void test2pass() {
		var test=	EmployeeIDMethods.validateEmploymentID("012123");
		Assert.assertTrue(test);
	}

}
