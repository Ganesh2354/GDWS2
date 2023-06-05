package com.org.framewk.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class NewConfig {
	
	 public static Properties prop;
		
		public NewConfig()
		{
			try {
			String path="C:\\Users\\Ganesh Dandekar\\Devils\\EclipseNew\\"
					+ "JourneyToUpSkill\\ConfigData\\NewConfigFile";
			File file=new File(path);		
			FileInputStream fis=new FileInputStream(file);
			prop=new Properties();
			prop.load(fis);		
			}catch (Exception e)
			{
				System.out.println("Message : "+e);
			}	
		}
		
		
		public static String getpathValue(String parentName, String childName)
		{
			return prop.getProperty(childName);
		}
	
	
	
	
	
	
	
	
	
}
