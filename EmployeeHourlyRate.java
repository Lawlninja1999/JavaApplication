package EmployeeListAndMethods;

public class EmployeeHourlyRate {
	public static Boolean validateEmployeeHourlyRateLength(String type)
	{
	    if(!type.contains(".")||type.length()<=4)
        {
       	 return false;
        }
	    StringBuilder sb = new StringBuilder();
	    sb.append(type);
	      if(sb.toString().length()!=5)
	         {
	        	 sb.append(0);
	         }
	      String x=sb.toString();


		 
		 //creates a char array with values from the string builder x variable
		 char[] chars = x.toCharArray();
		 //creates a string builder 
		 StringBuilder rb = new StringBuilder();
	      //for loop checks for numbers in the char array array and appends it to the string builder
	      for(char c : chars)
	      {
	    	  //if character is a number then add it to the string builder
	         if(Character.isDigit(c)||c=='.')
	         {
	            rb.append(c);
	         } 
	         else if(Character.isLetter(c))
	         {
	        	 return false;
	         }
	      }
			//changes the string input value to a double value
			double tosring=Double.parseDouble(type);
			//business logic 
			if(tosring<20.00||tosring>45.00)
			{
				return false;
			}
		
		//return 
		return rb.length()==5?true:false;
	}
}
