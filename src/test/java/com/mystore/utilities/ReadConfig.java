package com.mystore.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
   Properties properties;
   String path="C:\\Users\\archa\\Desktop\\Frame\\Mystore\\configuration\\config.properties";
   //constructor
   public ReadConfig()
     {
	//try
	 try{   
	   //initialize properties
	   properties=new Properties();
	   
	   //to read file
	   
		FileInputStream fis = new FileInputStream(path) ;
		properties.load(fis);
	   } 
	 //catch
	   catch (Exception e)
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	 
    }  
   
   
   public String getBaseUrl()
	{
		String value = properties.getProperty("baseUrl");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}

	public String getBrowser()
	{
		String value = properties.getProperty("browser");

		if(value!=null)
			return value;
		else
			throw new RuntimeException("url not specified in config file.");

	}
	
	public String getEmail()
	{
		String email = properties.getProperty("email");
		if(email!=null)
			return email;
		else
			throw new RuntimeException("email not specified in config file.");
		
	}

	public String getPassword()
	{
		String password = properties.getProperty("password");
		if(password!=null)
			return password;
		else
			throw new RuntimeException("password not specified in config file.");
		
	}

}
