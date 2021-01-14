package My_First_Project.firstAmazonCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pagesForAmazon.screenshot;

public class Test_ScreenShots extends screenshot{
@Test()
 void run_ScreenShots() throws IOException {
	amazon();
    screenshot a=new screenshot();
	a.demo_screenshots();
}}
