package My_First_Project.firstAmazonCases;

import org.testng.annotations.Test;

public class Test_DependsOn {
	
	
	@Test(dependsOnMethods = {"test2"})
	void test1()
	{
		System.out.println("Method test1");
		
	}
	
	@Test()
	void test2()
	{
		System.out.println("Method test2");
	}
	
	@Test()
	void test3()
	{
		System.out.println("Method test3");
	}

}
