package Demo1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Seleniumscript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme Narzo 50 pro");
        Thread.sleep(4000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("Nokia")).click();
        driver.navigate().to("https://start.atlassian.com/");
        Thread.sleep(4000);
        driver.navigate().back();
        driver.quit();
	}
 
}
