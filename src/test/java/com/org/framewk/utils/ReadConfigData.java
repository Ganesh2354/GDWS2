package com.org.framewk.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigData {
	
    public static Properties prop;
	
	public ReadConfigData(String location)
	{
		try {
		String path=location;
		File file=new File(path);		
		FileInputStream fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);		
		}catch (Exception e)
		{
			System.out.println("Message : "+e);
		}	
	}
	
	public static String getLocatorValue(String LocatorKey)
	{
		return prop.getProperty(LocatorKey);
	}
	

}
