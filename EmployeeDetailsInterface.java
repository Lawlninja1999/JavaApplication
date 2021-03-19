package EmployeeDetailsAndOtherInformation;

public interface EmployeeDetailsInterface {
	//Interface is inherited by employee fields class to implement the 
	// getter and setter for the private employee details fields.

//setter
void sethoursWorked(double hoursWorked);
void  sethourlyWage(double hoursWage);
void setemploymentType(String employmentType);
void setEmployeeId(int employeeId);

//getter
double gethoursWorked();
double  gethourlyWage();
String getemploymentType();
int getEmployeeId();
}
