package stepDefinations;

import java.net.URI;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetWithEmailOtpSteps {
	
      	Response res;
      	ValidatableResponse validate;
	
	@When("User want To fetch the Data from the database {string}")
	public void user_want_to_fetch_the_data_from_the_database(String URI) {
		 res = RestAssured.get(URI);
	   
	}

	@Then("User Want to Verfy StatuS code {int}")
	public void user_want_to_verfy_statu_s_code(Integer code) {
	    validate = res.then();
	    validate.assertThat().statusCode(code).log().all();
	}


}
