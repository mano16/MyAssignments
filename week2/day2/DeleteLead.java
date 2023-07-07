package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("0654321");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement firstLead= driver.findElement(By.xpath("(//div[contains(@class,'partyId')]/a)[2]"));
		String firstLeadId = firstLead.getText();
		firstLead.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(firstLeadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement deletionConfirmationMsg = driver.findElement(By.xpath("//div[contains(@class,'small-editor')]/div"));
		deletionConfirmationMsg.getText().equals("No records to display");
		driver.close();   
	}
}
