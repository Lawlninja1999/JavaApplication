package EmployeeListAndMethods;

import java.util.Scanner;

import EmployeeDetailsAndOtherInformation.EmployeeFields;

public class AddToList {
	//creates an static instance of the employeeDields, createList,and  scanner classes
	static EmployeeFields employeeFields;
	static CreateList createList;
	static Scanner input;
	
	//Method is used to make the list 
	/** method used to create the employee list
	 * 
	 */
	public static void MakeList()
	{
		//Reference for the createList class
createList= new CreateList();

//boolean value to check if the user want to continue adding employees
	boolean Adding= true;
	
	//while loops
	while(Adding)
	{
	//creates an reference of the scanner class 
	 input= new Scanner(System.in);
	 //creates an reference  of the employeeFields class
		employeeFields	= new EmployeeFields();

		//first user input 
		try {
			
			System.out.println("Enter Employees Hours worked (format: 30.00 for 30 hours) 15-40: ");
			String HourWorked= input.nextLine();
		
			//the method in the hourWorked class, the input value is the scanner
			//the variable 'hours is a boolean
			var Hours= HoursWorked.validateEmployeeHoursWorked(HourWorked).booleanValue();
			//checks if the 'hours' boolean variable is false and if yes then ask the user to reenter input 
			while(Hours==false)
			{
				
				System.out.println("Not a valid input,Enter Employees Hours worked (format: 30.00 for 30 dollars) 15-40: ");
				HourWorked= input.nextLine();
				
				Hours=HoursWorked.validateEmployeeHoursWorked(HourWorked).booleanValue();	
			}
			//if while is true then add the Hours Worked User input as the value for the setter in the
			//employeeFields class
			var HoursToInt=Double.parseDouble(HourWorked);
			employeeFields.sethoursWorked(HoursToInt);
		}
		catch(Exception e)
		{
			continue;
		}
		
		
		//second  user input, Hourly rate
		try {
			System.out.println("Enter Employees HourlyRate (format: 30.00 for 30 dollars) 20-45: ");
			String HourlyRate= input.nextLine();
		
			//the method in the hourly rate class, the input value is the scanner
			//the variable 'hourlyRate' is a boolean
			var HourRateBool=EmployeeHourlyRate.validateEmployeeHourlyRateLength(HourlyRate).booleanValue();
			while(HourRateBool==false)
			{
				
				System.out.println("Not a valid input,Enter Employees HourlyRate (format: 30.00 for 30 dollars) 20-45: ");
				HourlyRate= input.nextLine();
				
				 HourRateBool=EmployeeHourlyRate.validateEmployeeHourlyRateLength(HourlyRate).booleanValue();	
			}
			var RateToInt=Double.parseDouble(HourlyRate);
			employeeFields.sethourlyWage(RateToInt);
		}
		catch(Exception e)
		{
			continue;
		}
		
		
		//third user input 
		System.out.println("Enter Employement type (P/F): ");
		String employmentType= input.nextLine();
		var type=EmployeeTypeMethods.validateEmploymentType(employmentType).booleanValue();
	var hasnumber=EmployeeTypeMethods.EmployementTypeHasNumber(employmentType).booleanValue();
		while(type==false|| hasnumber==false)
		{
			
			System.out.println("Not a valid input,Please Enter Employement type (P/F): ");
			employmentType= input.nextLine();
			type=EmployeeTypeMethods.validateEmploymentType(employmentType).booleanValue();
			hasnumber=EmployeeTypeMethods.EmployementTypeHasNumber(employmentType).booleanValue();		
		}
		employeeFields.setemploymentType(employmentType);
		

		//fourth user input 
		System.out.println("Enter EmployeeID (6 numbers): ");
		String employeeId= input.nextLine();
		
		var IDMethod=EmployeeIDMethods.validateEmploymentID(employeeId).booleanValue();
		while(IDMethod==false)
		{
			
			System.out.println("Not a valid input,Please Enter EmployeeID: (6 numbers): ");
			employeeId= input.nextLine();
			IDMethod=EmployeeIDMethods.validateEmploymentID(employeeId).booleanValue();
			
		}
	var IdToInt= Integer.parseInt(employeeId);
		employeeFields.setEmployeeId(IdToInt);
		

		
		createList.employeeList.add(employeeFields);
		System.out.println("Do you want to add more employee data?: (Yes/No)");
		String Answer= input.nextLine();
		if(ExixAdding.ExitAddingMethod(Answer).booleanValue()==false)
		{
			Adding=false;
		}
	
	}
	input.close();
	//for each loop used to loop through the EmployeeList
	for(var i:createList.employeeList)
	{
		// format string is used to style the output of the program, uses getters from the employee
		//details class
		System.out.println(String.format("EmployeeID: %S \n Employment type: %S \n Hours Worked in a week :%d \n Total amount earned: $ %d \n-----------", i.getEmployeeId(), i.getemploymentType(),Math.round(i.gethoursWorked()),Math.round(i.gethourlyWage()*i.gethoursWorked())));
	}
		
	}




}
