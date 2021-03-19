package EmployeeListAndMethods;

public class EmployeeTypeMethods {

	public static Boolean validateEmploymentType(String type)
	{
		//checks the length of the inout string and makes sure the values entered are 'p' or 'f'
		return type.toLowerCase().length()==1 && type.toLowerCase().contains("p")||type.toLowerCase().contains("f")&&type.toLowerCase().length()==1?true:false;
	}
	
	
	public static Boolean EmployementTypeHasNumber(String type)
	{
		//creates an char array based on the input value and creates a string builder object
	      char[] chars = type.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      
	      //for loop checks for numbers and adds them to the string builder 
	      for(char c : chars){
	         if(Character.isDigit(c)){
	            sb.append(c);
	         }
	      }
	     return sb.length()!=0?false:true;
	}
}
