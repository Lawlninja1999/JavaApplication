package EmployeeListAndMethods;

import java.util.ArrayList;
import EmployeeDetailsAndOtherInformation.EmployeeFields;

public class CreateList {
	
		// this creates an Array list of the employee fields class, this allows
		// field in the employee Details  to be added to the Array list.
	  ArrayList<EmployeeFields> employeeList;

	public CreateList() {
		//this is a constructor that creates a new array list every time a new version of the
		//class is created.
		// this allows a new employee to be added after an employee is added to the list 
		employeeList= new ArrayList<EmployeeFields>();
	}
}
