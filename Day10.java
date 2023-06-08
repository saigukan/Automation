package com.testing;

public class Day10 {
	
	import java.io.IOException;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	
	  @Test(dataProvider = "testData")
	  public void addMethod(double n1,double n2) throws IOException {
		  double res = n1+n2;
		  xlutility.updateExcel();
		  
	  }
	  @DataProvider
	  public Object[][] testData() throws IOException
	  {
		  Object[][] data = xlutility.readExcel();
		  return data;
	  }
	}


