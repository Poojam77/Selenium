package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Pooja");//selected by Id
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("mulik");//basic syntax
		driver.findElement(By.cssSelector("a.agree")).click();//selected by Class
		//driver.findElement(By.cssSelector("input#input-firstname[type='text']")).sendKeys("mulik");//Advanced css selector by id
		//driver.findElement(By.cssSelector("input.form-control[type='text'][name='firstname']")).sendKeys("mulik");//Advanced css selector by class
		driver.findElement(By.cssSelector("input[name^=em]")).sendKeys("email@gmail.com");//sub string(Prefix
		//driver.findElement(By.cssSelector("input[name$=il]")).sendKeys("email@gmail.com");//sub string(suffix)
		//driver.findElement(By.cssSelector("input[name*=ma]")).sendKeys("email@gmail.com");//sub string(In between)
		Thread.sleep(3000);
		driver.close();
		
	}

}
