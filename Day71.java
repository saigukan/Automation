package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import junit.framework.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day71 {
  @Test
  public void f() 
  {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,"Guest Registration Form-User Registration");
	  
	  
	  
	  
  }
}
