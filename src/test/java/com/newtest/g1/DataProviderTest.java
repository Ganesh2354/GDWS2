package com.newtest.g1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	@Test(dataProvider = "loginCredentials")
	
	public void verifyLogin(String email, String pass)
	{
		System.out.println(email+":"+pass);
		
		
	}
	
	
	@DataProvider(name="loginCredentials")
	
	public Object[][] getCredentials()
	{
		
		Object[][] credentials= {{"test1@test.com","1234"},{"test2@test.com","1234"},{"test3@test.com","1234"}};
		
		return credentials;
		
	}

}
