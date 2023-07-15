package genrick_libries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenShot extends Base_class {
	static ScreenShot st=new ScreenShot();
	public static void screenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/insta.png");
		FileUtils.copyFile(src, dest);
		
	}

}
