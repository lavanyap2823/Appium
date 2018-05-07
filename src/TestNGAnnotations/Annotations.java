package TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void userIdGeneration()
	{
		 System.out.println("New user id generated");
		System.out.println("New user id generated");
	}
	@BeforeTest
	public void delCookiesBeforeTest()
	{
		System.out.println("Delete cookies before Test");
	}
	@AfterTest
	public void delCookiesAfterTest()
	{
		System.out.println("Delete cookies After Test");
	}
	
	@Test
	public void NasicTest()
	{
	System.out.println("execution done");
	}
	
	@Test
	public void flightBooking()
	{
	System.out.println("Flight booking tkcts done");
	}
}
