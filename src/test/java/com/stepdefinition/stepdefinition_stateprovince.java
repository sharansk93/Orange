package com.stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class stepdefinition_stateprovince {
	@Given("Hit the URI")
	public void hit_the_uri() {
		RestAssured.baseURI="http://universities.hipolabs.com/search?country=South+Africa";
//		Response response = RestAssured.given().when().get();
//		response.prettyPrint();
		RequestSpecification given = RestAssured.given();
		Response response = given.get();
//		ResponseBody body = response.getBody();
//		System.out.println(body.asString());
		System.out.println(response.jsonPath().getString("[7737].state-province"));
	  
	}

	@When("I post the get response")
	public void i_post_the_get_response() {
	  
	}

	@Then("Print the state provicence")
	public void print_the_state_provicence() {
	   
	}

}
