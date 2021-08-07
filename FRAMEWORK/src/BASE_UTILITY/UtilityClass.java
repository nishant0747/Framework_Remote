package BASE_UTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	
	public static String getvalue(int rowindex, int colindex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\FRAMEWORK\\Test_data\\Test data.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		
		return value;
		
		
	}
	
	public static void captureScreenshot(WebDriver driver,int TCID) throws IOException 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\HP\\eclipse-workspace\\FRAMEWORK\\Screenshots\\Screenshot_"+TCID+".jpg");
		
		FileHandler.copy(source, destination);	
	}
	

	
	

}
