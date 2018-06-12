package ToolsQaTestCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.YoutubePO;

public class Automating_tabs {
  
	
	@Test
  public void validateTabs(){
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Downloads\\browsers_setup\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://qavalidation.com/demo/");
	  driver.manage().window().maximize();
	  /*	  Select s =new Select(selenium_tab);
	  List<WebElement> list =s.getAllSelectedOptions();
	  for(WebElement item:list){
		  if(item.getText().equals("PageObjectModel")==true){
			  s.selectByVisibleText("PageObjectModel");
		  }
	  
	  Iterator<WebElement> itr = list.iterator();
		  while(itr.hasNext()){
			  if(itr.next().getText().equals("PageObjectModel")){
				  itr.next().click();
			  }
		  
	  }*/
	
	}
}
