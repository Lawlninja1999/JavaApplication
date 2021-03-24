package EmployeeListAndMethods;

public class EmployeeTypeMethods {

	public static Boolean validateEmploymentType(String type)
	{
		if(!(type.length()==1))
		{
			return false;
		}
		//checks the length of the input string and makes sure the values entered are 'p' or 'f'
		return  type.toLowerCase().contains("p")||type.toLowerCase().contains("f")?true:false;
	}
	
	
	public static Boolean EmployementTypeHasNumber(String type)
	{
		//creates an char array based on the input value and creates a string builder object
	      char[] chars = type.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      
	      //for loop checks for numbers and adds them to the string builder 
	      for(char c : chars){
	         if(!Character.isLetter(c)){
	            sb.append(c);
	         }
	      }
	     return sb.length()!=0?false:true;
	}
}
