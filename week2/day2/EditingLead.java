package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditingLead {



	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("firstName")).sendKeys("Mano");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')]/a)[2]")).click();
		driver.getTitle().equals("View Lead | opentaps CRM");
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName =driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("Selenium");
		String newCompanyName = companyName.getAttribute("value");
		System.out.println(newCompanyName);
		driver.findElement(By.name("submitButton")).click();
		WebElement updatedCompanyName =driver.findElement(By.id("viewLead_companyName_sp"));
		updatedCompanyName.getText().contains(newCompanyName);
		driver.close();		
	}
}
