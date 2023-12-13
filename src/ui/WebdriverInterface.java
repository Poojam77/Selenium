package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverInterface {

	//Execute test case on Multiple Browsers Using Webdriver Interface
	
	public static String browser = "firefox"; //External configuration -XLS,CSV file
	public static WebDriver driver;//WebDriver Interface
	
	public static void main(String[] args) throws InterruptedException {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		
		}
		driver.get("http://192.168.2.35:4000/");//Launch the url
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.name("email")).sendKeys("dev@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("Pass@123");
        Thread.sleep(3000);
        driver.findElement(By.className("btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("button-text")).click();
	}

}
