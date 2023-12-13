package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");//get(java.lang.string url)
		driver.manage().window().maximize();//manage()
		
		String currenturl = driver.getCurrentUrl();//getCurrentUrl()
		System.out.println(currenturl);
		
		String title = driver.getTitle();//getTitle()
		System.out.println(title);
		
		String pagesource = driver.getPageSource();//getPageSource()
		System.out.println(pagesource);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");//findElelment() method
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_item']"));//findElelments() method
		System.out.print(webelements);
		 
		driver.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		//driver.navigate().to("http://google.com");//navigate()
		Thread.sleep(4000);
		//driver.quit();//quit()
		driver.close();//close()
	

	}

}
