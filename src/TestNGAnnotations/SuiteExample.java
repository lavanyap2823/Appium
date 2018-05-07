package TestNGAnnotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteExample {

	@BeforeSuite
	public void installNewSoftware()
	{
		System.out.println("Before Suite Executed.");
	}
	@AfterSuite
	public void uninstallSoftware()
	{
		System.out.println("After Suite Executed.");
	}
}
