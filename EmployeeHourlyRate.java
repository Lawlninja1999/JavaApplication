package EmployeeListAndMethods;

public class EmployeeHourlyRate {
	public static Boolean validateEmployeeHourlyRateLength(String type)
	{
		//changes the string input value to a double value
		double tosring=Double.parseDouble(type);
		//business logic 
		if(tosring>45.00||tosring<20.00)
		{
			return false;
		}
		
	//creates a string builder and appends input value to the string builder,after this.
		//the decimal point is removed from the string 
		StringBuilder rb = new StringBuilder();
		 rb.append(type);
		 rb.delete(2, 3);
		 
		 //x = the string builder to a string, this is needed because string builder is an object
		 var x=rb.toString();
		 
		 //creates a char array with values from the string builder x variable
		 char[] chars = x.toCharArray();
		 //creates a string builder 
	      StringBuilder sb = new StringBuilder();
	      //for loop checks for numbers in the char array array and appends it to the string builder
	      for(char c : chars)
	      {
	    	  //if character is a number then add it to the string builder
	         if(Character.isDigit(c))
	         {
	            sb.append(c);
	         } 
	      }
	      //if the string ends with an emply value for example 10.9, then append 0 to the end 
	      if(sb.toString().endsWith(" "))
	         {
	        	 sb.append(0);
	         }
	      
	
		
		//return 
		return sb.length()==4&& rb.length()==4?true:false;
	}
}
