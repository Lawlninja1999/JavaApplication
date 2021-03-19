package EmployeeListAndMethods;

public class HoursWorked {
	public static Boolean validateEmployeeHoursWorked(String type)
	{
		StringBuilder rb = new StringBuilder();
		 rb.append(type);
		 rb.delete(2, 3);
	
		 var x=rb.toString();
		 
		 double tosring=Double.parseDouble(type);
		 if(tosring>40.00||tosring<15.00)
			{
				return false;
			}
		 char[] chars = x.toCharArray();
	      StringBuilder sb = new StringBuilder();
	      for(char c : chars)
	      {
	         if(Character.isDigit(c))
	         {
	            sb.append(c);
	         } 
	      }
	      if(sb.toString().endsWith(" "))
	         {
	        	 sb.append(0);
	         }
		return sb.length()==4&& rb.length()==4?true:false;
	}
}
