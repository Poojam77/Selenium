package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Test");//Sendkeys
		driver.findElement(By.name("firstname")).clear();//Clear
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));//getAttribute
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));//getCssValue()
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());//getLocation()
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());//getSize()
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());//getTagName()
		System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[4]/div/div/h2")).getText());//getText()
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());//isDisplayed()
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());//isEnabled()
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());//isSelected()
		Thread.sleep(2000);
		driver.close();
		

	}

}
