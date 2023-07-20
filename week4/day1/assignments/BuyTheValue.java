package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BuyTheValue {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='product-title']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.id("dummy-chat-button")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[contains(@class,'chat-app')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.name("wk_zipcode")).sendKeys("600078");
		driver.findElement(By.xpath("//div[contains(@class,'zipfinder_btn')]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//p[contains(@class,'show-cart')]//a)[2]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.switchTo().alert().accept();	
	}
}
