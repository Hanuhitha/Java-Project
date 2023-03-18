package util;


import java.text.SimpleDateFormat;
import java.util.Date;

public class dateutil 
{
	public static Date convertStringToDate(String dateInString,String format)
	{
		SimpleDateFormat f=new SimpleDateFormat(format);
		Date date=null;
		try
		{
			System.out.println("date strng "+dateInString);
			date=f.parse(dateInString);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return date;
		
	}
}
