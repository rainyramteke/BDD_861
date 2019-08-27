package stepdefinition;

import cucumber.api.java.en.Given;


public class Login {
	
	@Given("^open application$")
	public void open_application() throws Throwable {
	    System.out.println("Launch");
	}

	@Given("^login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void login_with_and(String s1, String s2) throws Throwable {
	    
		if((s1.equals("admin")) && (s2.equals("pass123"))) {
			System.out.println("welcome");
		}
		else {
			System.err.println("try again");
		}
	}

}
