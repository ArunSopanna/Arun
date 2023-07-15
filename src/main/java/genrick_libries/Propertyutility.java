package genrick_libries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyutility {
	FileInputStream file=null;
	public String readingData(String key) throws FileNotFoundException 
	{
		file=new FileInputStream("./src/test/resources/data.properties");
		Properties property=new Properties();
		try {
			property.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property.getProperty(key);
	}

}
