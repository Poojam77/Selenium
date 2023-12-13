package Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("New movies");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(4000);
        driver.findElement(By.xpath("//ytd-masthead/div[@id='container']/div[@id='center']/ytd-searchbox[@id='search']/form[@id='search-form']/div[@id='container']/div[@id='search-clear-button']/ytd-button-renderer[1]/yt-button-shape[1]/button[1]/yt-touch-feedback-shape[1]/div[1]/div[2]")).click();
	    Thread.sleep(4000);
        driver.findElement(By.xpath("//body/ytd-app[1]/div[1]/tp-yt-app-drawer[1]/div[2]/div[1]/div[2]/div[2]/ytd-guide-renderer[1]/div[1]/ytd-guide-section-renderer[1]/div[1]/ytd-guide-entry-renderer[1]/a[1]/tp-yt-paper-item[1]/yt-formatted-string[1]")).click();
	    
	
	}

}
