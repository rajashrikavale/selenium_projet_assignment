package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;

	@BeforeSuite
	public void navToUrl() throws IOException {

		WebDriverManager.chromedriver().setup();
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
		FileInputStream file = new FileInputStream(path);
		prop.load(file);

		driver = new ChromeDriver();
		driver.get(prop.getProperty("testsiteurl"));
		driver.manage().window().maximize();
	}

}
