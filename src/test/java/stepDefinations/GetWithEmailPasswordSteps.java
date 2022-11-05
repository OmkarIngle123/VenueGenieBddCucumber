package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetWithEmailPasswordSteps {
	
	 Response res;
	 ValidatableResponse validate;
	 
	@When("user Want to retrive the data From the database {string}")
	public void user_want_to_retrive_the_data_from_the_database(String URI) {
		
		 res = RestAssured.get(URI);
	}
	
	  

	@Then("User want to check sTatus code {int}")
	public void user_want_to_check_s_tatus_code(Integer code) {
	     validate = res.then();
	     validate.assertThat().statusCode(code).log().all();
	}

}
