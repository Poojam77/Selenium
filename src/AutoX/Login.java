package AutoX;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.2.35:4000/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.name("email")).sendKeys("emma@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("Pass@123");
        Thread.sleep(3000);
        driver.findElement(By.className("btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("button-text")).click();
        
	}

}