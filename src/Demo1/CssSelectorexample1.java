package Demo1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorexample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Realme narzo 50 pro");
		driver.findElement(By.cssSelector("#gh-btn")).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'realme Narzo 50 Pro 5G (Hyper Blue 6GB RAM+128GB S')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//body/div[@id='Body']/div[@id='CenterPanelDF']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		Thread.sleep(4000);
		alert.accept();

		
		
	
		
		
		
		
		

	}

}
