package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHtml {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		List<WebElement> language =driver.findElements(By.xpath("//div[@class='ui-chkbox ui-widget']/following::label[contains(@for,'basic')]"));
		for(int i=0;i<language.size();i++) {
			if(i==0 || i==2) {
				language.get(i).click();
			}
		}
		driver.findElement(By.xpath("//h5[contains(text(),'Tri State')]/following::div[contains(@data-iconstates,'ui-icon')]")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'Toggle Switch')]/following::div[3]")).click();
		driver.findElement(By.xpath("//h5[contains(text(),'disabled')]/following::div[contains(@class,'ui-chkbox-box')]")).isEnabled();
		driver.findElement(By.xpath("//h5[contains(text(),'Select Multiple')]/following::span")).click();
		List<WebElement> selectMultiple=driver.findElements(By.xpath("//li[contains(@class,'ui-selectcheckboxmenu-item')]/label"));
		for(int i=0 ;i<selectMultiple.size();i++) {
			if(i==0 ||i==2 || i==3) {
				selectMultiple.get(i).click();
			}
		}

	}
}
