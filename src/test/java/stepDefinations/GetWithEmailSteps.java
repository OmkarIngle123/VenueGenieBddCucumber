package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetWithEmailSteps {
	           Response res;
	           ValidatableResponse validate;
	
	@When("User want to Fetch the data From the database {string}")
	public void user_want_to_Fetch_the_data_From_the_database(String URI) {
	       	     res = RestAssured.get(URI);
	       	}
	           
	@Then("User want to verify Status Code {int}")
	public void user_want_to_verify_status_code(Integer code) {
	
		  validate = res.then();
	     validate.assertThat().statusCode(code).log().all();
	}
}
