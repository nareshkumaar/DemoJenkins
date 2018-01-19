package demoJenkins;

import org.testng.annotations.Test;

public class DemoJenkinsJob {

	@Test
	public void testJenkins() {
		System.out.println("Welcome to Jenkins World");

	}

	@Test
	public void testJenkins2() {
		System.out.println("Running the 2nd TC");

	}
	
	@Test
	public void testBranch(){
		System.out.println("Adding TC for Branch Test");
	}
}
