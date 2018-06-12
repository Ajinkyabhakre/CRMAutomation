package ToolsQaTestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTestCase {
	
	
  @Test
  public void validateAlert() {
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Downloads\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/delete_customer.php");
	  driver.findElement(By.name("cusid")).sendKeys("215");
	  driver.findElement(By.name("submit")).submit();
	  
	  // Now switch to Alert
	  String actual = driver.switchTo().alert().getText(); 
	  System.out.println(actual);
	  Assert.assertEquals(actual, "Do you really want to delete this Customer?" );
	  
	  // click on 'Cancel'
	  driver.switchTo().alert().dismiss();;
  }
}
