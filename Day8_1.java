package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Day8_1 {
	


	
	    public static void main( String[] args ) throws InterruptedException
	    {
	        System.out.println( "Hello World!" );
	        WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://jqueryui.com/droppable/");
	        driver.manage().window().maximize();
	        driver.switchTo().frame(0);
	        WebElement drg = driver.findElement(By.id("draggable"));
	        WebElement drp = driver.findElement(By.id("droppable"));
	        Actions ac=new Actions(driver);
	        ac.clickAndHold(drg).release(drp).build().perform();
//	        Thread.sleep(6000);
	    } 
	}


