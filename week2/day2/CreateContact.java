package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Mano");
		driver.findElement(By.id("lastNameField")).sendKeys("ranjitha");
		driver.findElement(By.xpath("//input[contains(@id,'firstNameLocal')]")).sendKeys("Mano");
		driver.findElement(By.xpath("//input[contains(@id,'lastNameLocal')]")).sendKeys("ranjitha");
		driver.findElement(By.xpath("//input[contains(@id,'departmentName')]")).sendKeys("IT");
		driver.findElement(By.xpath("//textarea[contains(@id,'description')]")).sendKeys("Learning selenium");
		driver.findElement(By.xpath("//input[contains(@id,'primaryEmail')]")).sendKeys("test@gmail.com");
		WebElement stateOrProvince = driver.findElement(By.xpath("//select[contains(@id,'generalState')]"));
		Select state = new Select(stateOrProvince);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//textarea[contains(@id,'importantNote')]")).sendKeys("Focus learning");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
	}
}
