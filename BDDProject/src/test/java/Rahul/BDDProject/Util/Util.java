package Rahul.BDDProject.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Util {
	private static Properties prop = new Properties();
	private static String propFile="C:\\Users\\Shalini R Chauhan\\workspace\\BDDProject\\src\\test\\java\\Rahul\\BDDProject\\Resources\\Data\\Data.properties";
	
	public static String getProperties(String key) {
		try {
			
		    prop.load(new FileInputStream(new File(propFile)));
		    return prop.getProperty(key);

//		    System.out.println(prop.getProperty("username"));
//		    System.out.println(prop.getProperty("password"));

		} 
		catch (IOException ex) {
		    ex.printStackTrace();
		}
		return null;
	}
	
}
