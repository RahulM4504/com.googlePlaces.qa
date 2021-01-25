package stepDefination;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.Utils;
import resources.testDataBuilder;

public class StepDefinations extends Utils{
	RequestSpecification request;
	ResponseSpecification res;
	testDataBuilder testData = new testDataBuilder();
	
	
	
	
	@Given("add place payload")
	public void add_place_payload() throws IOException {		
		
		res = new ResponseSpecBuilder().expectStatusCode(200).build();
		RequestSpecification request = given().spec(requestSpec())
		.body(testData.AddPlacesPayload());
		throw new io.cucumber.java.PendingException();
	}

	@When("user calls {string} with Post http request")
	public void user_calls_with_post_http_request(String string) {
		Response response = request.when().post("/maps/api/place/add/json")
				.then().assertThat().spec(res).extract().response();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the api call is successful with status code {int}")
	public void the_api_call_is_successful_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("{string} response body is {string}")
	public void response_body_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
