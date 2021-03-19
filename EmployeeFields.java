package EmployeeDetailsAndOtherInformation;

public class EmployeeFields implements EmployeeDetailsInterface
{
	
//this class contains business logic, 
	private double hoursWorked;
	private int EmployeeId;
	private double hourlyWage;
	private String employmentType;
	
	// setting for the getter and setters
	@Override
	public void sethoursWorked(double hoursWorked) {
		this.hoursWorked=hoursWorked;	
	}
	@Override
	public void setEmployeeId(int employeeId) {
		this.EmployeeId=employeeId;	
	}
	@Override
	public void sethourlyWage(double hoursWage) {
		this.hourlyWage=hoursWage;	
	}
	@Override
	public void setemploymentType(String employmentType) {
		this.employmentType=employmentType;
	}
	
	@Override
	public double gethoursWorked() {	
		return hoursWorked;
	}
	@Override
	public double gethourlyWage() {
		return hourlyWage;
	}
	@Override
	public String getemploymentType() {
		return employmentType;
	}

	@Override
	public int getEmployeeId() {
		return EmployeeId;
	}
}
