package it.pkg.util;

public class ValidatorUtil {

	 
	public static boolean isEmpty(String str )
	{
		if(str==null || str.trim().length() <= 0)
		{
			return true;
		}
		return false;
	}
	
	
	public static boolean maxAndMin(String str,int min,int max)
	{
		if(str.length()<= min || str.length()>max)
		{
			return true;
		}
		return false;
	}
}
