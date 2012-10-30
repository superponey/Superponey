package com.poney.test;

import java.util.Locale;

public class MyNewClass
{

	public String getMessage()
	{
		return "Hello git";
	}

	public String getLocalizedMessage( Locale locale )
	{
		if ( Locale.FRENCH.equals( locale ) )
		{
			return "Bonjour git";
		}
		else
		{
			return this.getMessage();
		}
	}
}
