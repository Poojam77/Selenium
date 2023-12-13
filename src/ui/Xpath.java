package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("FirstName");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'input-lastname')]")).sendKeys("LastName");//starts-with function
		//driver.findElement(By.xpath("//a[text()='login page']")).click();//text() method
		driver.findElement(By.xpath("//input[@type='email' and @name='email']")).sendKeys("pooja@gmail.com");//AND operator
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login'][2]")).click();//text method for link

}
}