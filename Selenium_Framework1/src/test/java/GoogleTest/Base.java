package GoogleTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	Properties	properties;
	FileInputStream fis;
	WebDriver myD;
	String vBrowser;
	
	
	
	public WebDriver BrowserCall() throws IOException
	{
		
	properties=new Properties();
	fis=new FileInputStream("C:\\Users\\00004551\\workspace\\LatestEclipse\\Selenium\\fileinput\\Data.properties");
	properties.load(fis);
	vBrowser=properties.getProperty("Browser");
	
	if(vBrowser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004551\\Downloads\\chromedriver_win32\\chromedriver.exe");
		myD= new ChromeDriver();
	}
	else if(vBrowser.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\00004551\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		myD= new EdgeDriver();
	}
	else
	{
		System.out.println("Invalid Browser");
	}
	return myD;
	
	
		
	}
	
	
	
}
