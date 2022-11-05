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

public class PostSteps {
	
	
	RequestSpecification req;
	Response res;
	  ValidatableResponse validate;
	@Given("User want to post Data into Database")
	public void user_want_to_post_data_into_database() {
		JSONObject object=new JSONObject();
		 object.put("email", "omkar.ingale2001@gmail.com");
		 object.put("id",126);
		 object.put("name","Omkar");
		 object.put("otp",123456);
		 object.put("passWord","Omkar@123");
		 object.put("phone","8999096615");
		 
            req = RestAssured.given()
            		 .body(object)
		   .contentType(ContentType.JSON);
		  
	}

	@When("User is able to put data into URI {string}")
	public void user_is_able_to_put_data_into_uri(String URI) {
	     res = req.post(URI);
	}

	@Then("User want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer code) {
	   validate = res.then();
	   validate.assertThat().statusCode(code).log().all();
			   
	}

}
