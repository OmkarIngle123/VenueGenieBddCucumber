package stepDefinations;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class PutSteps {
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	@Given("User want to update the Date into database")
	public void user_want_to_update_the_date_into_database() {
		JSONObject object=new JSONObject();
		 object.put("email","omkar.ingale2001@gmail.com");
		 object.put("id", 58);
		 object.put("name","Omi");
		 object.put("otp",123457);
		 object.put("passWord","Omkar@123");
		 object.put("phone","8999096615");
		 
	  req = RestAssured.given()
		   .body(object)
		   .contentType(ContentType.JSON);
	}

	@When("User is able to update dat into database using URI {string}")
	public void user_is_able_to_update_dat_into_database_using_uri(String URI1) {
	      res = req.put(URI1);
	}

	@Then("User want to check the code is {int}")
	public void user_want_to_check_the_code_is(Integer code) {
	    validate = res.then();
	    validate.assertThat().statusCode(code)
	    .log().all();
	   
	}

}
