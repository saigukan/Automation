package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Day5_2 {


		 public static void main( String[] args )
		    {
		    	WebDriverManager.edgedriver().setup();
		        WebDriver driver = new EdgeDriver(); 
		        driver.get("https://j2store.net/free/");
		        driver.manage().window().maximize();
		        String url=driver.getCurrentUrl();
		        if(url.equals("https://j2store.net/free/"))
		        {
		        	System.out.println(url);
		        }
		        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
		        String b=driver.getCurrentUrl();
		        if(b.equals("https://j2store.net/free/index.php/shop?filter_catid=11"))
		        {
		        	System.out.println(b);
		        }
		        else
		        {
		        	driver.close();
		        }
		    }
	}


