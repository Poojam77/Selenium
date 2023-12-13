package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		
	    //System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup(); //used to launch Chrome browser
		/*WebDriverManager.firefoxdriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.operadriver().setup();
		WebDriverManager.chromiumdriver().setup()
		WebDriverManager.iedriver().setup();*/
		WebDriver driver = new ChromeDriver();//create object of chromDriver
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