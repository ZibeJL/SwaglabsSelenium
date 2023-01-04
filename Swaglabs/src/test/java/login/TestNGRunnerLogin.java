package login;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestNGRunnerLogin {
	
	public static void main(String [] args) {
		TestNG objTNG = new TestNG();
		
		List<String> suites = new ArrayList<String>();
		
		suites.add("C:\\Users\\Zibe\\Desktop\\Swaglabs-TestNG\\Swaglabs\\SuiteLogin\\testngrun1.xml");
		
		suites.add("C:\\Users\\Zibe\\Desktop\\Swaglabs-TestNG\\Swaglabs\\SuiteLogin\\testngrun2.xml");
		
		suites.add("C:\\Users\\Zibe\\Desktop\\Swaglabs-TestNG\\Swaglabs\\SuiteLogin\\testngrun3.xml");
		
		objTNG.setTestSuites(suites);
		
		objTNG.run();
		
	} 

}
