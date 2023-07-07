package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("mail4rmano.m@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.xpath("(//div[contains(@class,'firstName')]/a)[2]"));
		String fn = firstName.getText();
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')]/a)[2]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.getTitle().contains("Duplicate Lead");
		driver.findElement(By.name("submitButton")).click();
		WebElement duplicateFirstName =driver.findElement(By.id("viewLead_firstName_sp"));
		duplicateFirstName.getText().equals(fn);
		driver.close();
}
}
