package com.newpro.k;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import coomon1.browser;

/**
 * Hello world!
 *
 */
public class App extends browser implements ITestListener
{

	
	public void onTestSuccess(ITestResult result) {
		try {
			screenshots("C:\\Users\\Kelvin PC\\eclipse-workspace\\k\\Pictures\\Pass\\");
		}catch (IOException e ) {
			e.printStackTrace();
			
		}
	}


	public void onTestFailure(ITestResult result) {
		try {
			screenshots("C:\\Users\\Kelvin PC\\eclipse-workspace\\k\\Pictures\\Fail\\");
		}catch (IOException e ) {
			e.printStackTrace();
			
		}
	}
    
}
