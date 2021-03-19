package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import EmployeeDetailsAndOtherInformation.EmployeeFields;

class fieldsTestFail {
		@Test
		void EmployeeId()
		{
			EmployeeFields fields= new EmployeeFields();
			fields.setEmployeeId(31323);
			int expectedtest=1043;
			int x= fields.getEmployeeId();
		assertFalse(x==expectedtest);	
		}
		@Test
		void HoursWorked()
		{
			EmployeeFields fields= new EmployeeFields();
			fields.sethoursWorked(21);
			double expectedtest=10;
			double x = fields.gethoursWorked();
		assertFalse(x==expectedtest);
		}
		@Test
		void HourlyWage()
		{
			EmployeeFields fields= new EmployeeFields();
			fields.sethourlyWage(21);
			double expectedtest=10;
			double x = fields.gethourlyWage();
		assertFalse(x==expectedtest);
		}
		@Test
		void EmploymentType()
		{
			EmployeeFields fields= new EmployeeFields();
			fields.setemploymentType("p");
			String expectedtest="f";
			String x = fields.getemploymentType();
		assertFalse(x==expectedtest);
		}

}
