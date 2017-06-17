package Methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Generic {
	
	
	public static Properties problem(String PropertiesFile){
		
		String fpath = System.getProperty("user.dir");
		File file = new File(fpath+File.separator+PropertiesFile+".properties");
		FileInputStream fileInput = null;
		try {
			
			fileInput = new FileInputStream(file);
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try{
			prop.load(fileInput);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return prop;
		}
	public  static String problem_getPropertyvalue(String strPropertykey){
		String strPropertyValue =null;
		Properties  sprop = problem("prob");
		try {
			strPropertyValue = sprop.getProperty(strPropertykey);
		} catch(Throwable t) {
			t.printStackTrace();
		}
		
		return strPropertyValue;
		
	}

}
