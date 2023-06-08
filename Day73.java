package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day73 {
  WebDriver driver;
  @BeforeMethod
  public void f()
  {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void homepage() throws InterruptedException
  {
	  Thread.sleep(3000);
	  WebElement uname=driver.findElement(By.name("username"));
	  uname.sendKeys("Admin");
	  Thread.sleep(3000);
	  WebElement pass=driver.findElement(By.name("password"));
	  pass.sendKeys("admin123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
  }
  @AfterMethod
  public void quit() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.quit();
  }
}
