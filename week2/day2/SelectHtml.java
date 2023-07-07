package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectHtml {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement favouriteTool=driver.findElement(By.className("ui-selectonemenu"));
		Select favTool= new Select(favouriteTool);
		List<WebElement> options = favTool .getOptions();
		for(int i=0;i<options.size();i++) {
			if(i==1) {
				options.get(i).click();
			}
		}
		driver.findElement(By.xpath("//label[text()='Select Country']/following::span")).click();
		driver.findElement(By.xpath("//li[contains(@class,'ui-selectonemenu-item')]"));
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete')]/span")).click();
		List<WebElement> course = driver.findElements(By.xpath("//li[contains(@class,'ui-autocomplete-item')]"));
		for(int i=0;i<course.size();i++) {
			if(i==3 || i==4) {
				course.get(i).click();
			}
		}
		driver.findElement(By.xpath("//label[text()='Select Language']")).click() ;
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();   
	}
}
