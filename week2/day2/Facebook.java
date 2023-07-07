package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement createNewAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		driver.executeScript("arguments[0].click()", createNewAcc);
		driver.findElement(By.name("firstname")).sendKeys("Mano");
		driver.findElement(By.name("lastname")).sendKeys("ranjitha");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("test123!");
		WebElement dayOfBirth = driver.findElement(By.id("day"));
		Select day= new Select(dayOfBirth);
		day.selectByValue("16");
		WebElement monthOfBirth = driver.findElement(By.id("month"));
		Select month= new Select(monthOfBirth);
		month.selectByVisibleText("Oct");
		WebElement yearOfBirth = driver.findElement(By.id("year"));
		Select year= new Select(yearOfBirth);
		year.selectByValue("1993");
		driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label")).click();
	}
}
