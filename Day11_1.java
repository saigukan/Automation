package com.testing;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class Day11_1 {
//	package com.example.demo.workDay11;

	/**
	 * Unit test for simple App.
	 */ 
	    extends TestCase
	{
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
	    public AppTest( String testName )
	    {
	        super( testName );
	    }

	    /**
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite( AppTest.class );
	    }

	    /**
	     * Rigourous Test :-)
	     */
	    public void testApp()
	    {
	        assertTrue( true );
	    }
	}

}
