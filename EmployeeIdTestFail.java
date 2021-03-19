package Test;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import EmployeeListAndMethods.EmployeeIDMethods;

class EmployeeIdTestFail {

	@Test
	void test1fail() {
	var test=	EmployeeIDMethods.validateEmploymentID("a");
		Assert.assertFalse(test);
	}

	@Test
	void test2fail() {

	var test=EmployeeIDMethods.validateEmploymentID("32324a");
		Assert.assertFalse(test);
	}
	@Test
	void test3fail() {

	var test=	EmployeeIDMethods.validateEmploymentID("32939");
		Assert.assertFalse(test);
	}
	@Test
	void test4fail() {

	var test=	EmployeeIDMethods.validateEmploymentID("329.32");
		Assert.assertFalse(test);
	}
	@Test
	void test5fail() {
	var test=	EmployeeIDMethods.validateEmploymentID("38283@");
		Assert.assertFalse(test);
	}
	@Test
	void test6fail() {
	var test=	EmployeeIDMethods.validateEmploymentID("1");
		Assert.assertFalse(test);
	}
	@Test
	void test7fail() {
	var test=	EmployeeIDMethods.validateEmploymentID("asjsjd");
		Assert.assertFalse(test);
	}

}
