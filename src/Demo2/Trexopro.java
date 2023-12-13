package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trexopro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.2.35:3000/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.className("form-control")).sendKeys("ravi@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pass@123");
		driver.findElement(By.className("circle")).click();
		
	}

}
