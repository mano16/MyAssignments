package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonHtml {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement buttonDsiabled= driver.findElement(By.xpath("//h5[contains(text(),'button is disabled')]/following-sibling::button"));
		buttonDsiabled.getCssValue("disabled").equals("disabled");
		WebElement buttonPostion = driver.findElement(By.xpath("//h5[contains(text(),'Submit button')]/following-sibling::button"));
		System.out.println("The button position is " + buttonPostion.getLocation());
		WebElement buttonColor = driver.findElement(By.xpath("//h5[contains(text(),'button color')]/following-sibling::button"));
		System.out.println("The button color is " + buttonColor.getCssValue("background"));
		WebElement buttonSize = driver.findElement(By.xpath("//h5[contains(text(),'height and width ')]/following-sibling::button"));
		System.out.println("The button size is " +buttonSize.getSize());
		WebElement changeColor = driver.findElement(By.xpath("//h5[contains(text(),'color change')]/following-sibling::button"));
		System.out.println("The button color is " + changeColor.getCssValue("background"));
		
		
		
	}
}
