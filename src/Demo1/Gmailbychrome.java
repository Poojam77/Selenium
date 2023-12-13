package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailbychrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
        driver.get("http://www.gmail.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("identifierId")).sendKeys("mulikp77@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Thread.sleep(2000);
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();
        if(at.equalsIgnoreCase(et))
        {
           System.out.println("Test successful");
        }
        else
        {
        	System.out.println("Test failed");
        }
	}

}
