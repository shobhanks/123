package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyBrowser1
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver();
	}
}
