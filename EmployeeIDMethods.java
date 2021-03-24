package EmployeeListAndMethods;

public class EmployeeIDMethods 
{
	public static Boolean validateEmploymentID(String type)
	{
		
		String Num=type.toString();
		//creates an char array based on the value of the 'num' variable and creates a string builder object
		 char[] chars = Num.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      
	      //for loop checks for numbers and adds them to the string builder 
	      for(char c : chars){
	         if(Character.isDigit(c))
	         {
	            sb.append(c);
	         } 
	      }
		return Num.length()==6 && sb.length()==6?true:false;
	}
}
