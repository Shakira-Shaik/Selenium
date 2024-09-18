package testngpackage1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
//we retry the failed test cases by using IRetryAnalyzer interfce
public class RetryFailTestcase_RetryLogic implements IRetryAnalyzer 
{
    int Current_Count=0;
    int No_Of_Retry=2;
	@Override
	public boolean retry(ITestResult result) //we override the unimplemented method
	{ 
		if(Current_Count< No_Of_Retry)
		{
			Current_Count++;
			return true; // true means give a retry
		}
		return false; // false means dont retry
	}

}
