package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class paldef {
	
	public String testPal;
	public boolean isPal;
	
	@Given("I entered string {string}")
	public void i_entered_string(String test) {
	    testPal = test;
	}

	@When("I test it for palindrome")
	public void i_test_it_for_palindrome() {
	    isPal = testPal.equalsIgnoreCase(new StringBuilder(testPal).reverse().toString());
	}

	@Then("The result should be {string}")
	public void the_result_should_be(String string) {
	    boolean flag = Boolean.parseBoolean(string);
	    
	    if(flag) {
	    	Assert.assertTrue(isPal);
	    }
	    else {
	    	Assert.assertFalse(isPal);
	    }
	}

}
