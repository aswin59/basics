package Basic.Basic;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class printing {
	@BeforeMethod
	public void before()
	{
		System.out.println("before.........");
	}

	@Test
	public void test()
	{
		System.out.println("test.........");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("after.........");
	}
}
