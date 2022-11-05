package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class DeleteSteps {
	 
	     RequestSpecification req;
         Response resp;
         ValidatableResponse val;

	@When("User want to delete the data by giving Id from database by using URI {string}")
	public void user_want_to_delete_the_data_by_giving_id_from_database_by_using_uri(String URI)
	{
		resp = RestAssured.delete(URI); 
	}

	@Then("User want to check the code is  {int}")
	public void user_want_to_check_the_code_is(Integer int4) 
	{
		val=resp.then()
				.assertThat().statusCode(int4)
				.log().all();		
	}


}
