package EmployeeListAndMethods;

public class ExixAdding {
public static Boolean ExitAddingMethod(String x)
{
	//method used to check if the user want to add more employees or exit the loop
return x.contains("No")||x.contains("no")?false:true;

}
}
