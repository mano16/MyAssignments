package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UipathLogin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//label[text()='Email:']/following-sibling::input")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//label[text()='Password:']/following-sibling::input")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		System.out.println("The title of the page is " + driver.getTitle());
		driver.findElement(By.partialLinkText("Log Out")).click();
		driver.close();
	}
}
