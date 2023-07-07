package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputHtml {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()='Type your name']/following::input")).sendKeys("Mano");
		driver.findElement(By.xpath("//h5[contains(text(),'Append Country')]/following::input")).sendKeys("India");
		driver.findElement(By.xpath("//h5[contains(text(),'Verify')]/following::input")).isDisplayed();
		driver.findElement(By.xpath("//h5[contains(text(),'Clear')]/following::input")).clear();
		WebElement retrieve =driver.findElement(By.xpath("//h5[contains(text(),'Retrieve')]/following::input"));
		retrieve.click();
		System.out.println("The retrieved text is " + retrieve.getAttribute("value"));
		WebElement email=driver.findElement(By.xpath("//h5[contains(text(),'Type email')]/following::input"));
		email.sendKeys("mail4rmano.m@gmail.com");
		email.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//h5[contains(text(),'about yourself')]/following::textarea")).sendKeys("My name is Mano");
		driver.findElement(By.xpath("//h5[text()='Text Editor']/following::div[contains(@class,'ql-editor')]")).sendKeys("Edit the text typed in");
		driver.findElement(By.xpath("//span[contains(@class,'ql-font')]/span")).click();
		driver.findElement(By.xpath("//span[@data-value='serif']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ql-size')]/span")).click();
		driver.findElement(By.xpath("//span[@data-value='large']")).click();
		driver.findElement(By.xpath("//button[@class='ql-underline']")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Press Enter')]/following::input[2]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText().equals("Age is mandatory");
		WebElement labelPostion=driver.findElement(By.xpath("//h5[contains(text(),'Label Position')]/following::input"));
		labelPostion.click();
		labelPostion.getLocation();
		driver.findElement(By.xpath("//h5[contains(text(),'name and choose')]/following::input")).sendKeys("Mano");
		driver.findElement(By.xpath("//ul[contains(@class,'autocomplete-items')]/li[@data-item-value='Mano2']")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'DOB')]/following::input")).sendKeys("10/16/1993");
		driver.findElement(By.xpath("//a[text()='16']")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Type number')]/following::input")).sendKeys("11");
		driver.findElement(By.xpath("(//span[@class='ui-button-text'])[3]/span")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Type random number')]/following::input")).sendKeys("55");
		WebElement slider =driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		slider.getCssValue("style").contains("55");
		driver.findElement(By.xpath("//h5[contains(text(),'Keyboard')]/following::input")).click();
		driver.findElement(By.xpath("//div[contains(@class,'keypad-popup')]")).isDisplayed();
		driver.findElement(By.xpath("//h5[contains(text(),'Toolbar')]/following::div[contains(@class,'ql-editor')]")).sendKeys("Hello");
		driver.findElement(By.xpath("(//span[contains(@class,'ql-font')]/span)[3]")).click();
		driver.findElement(By.xpath("(//span[@data-value='monospace'])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'ql-size')]/span)[3]")).click();
		driver.findElement(By.xpath("(//span[@data-value='huge'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='ql-underline'])[2]")).click();






	}
}
