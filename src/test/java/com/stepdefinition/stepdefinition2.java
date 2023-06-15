package com.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class stepdefinition2 {
	@Given("Get request to get list of resouces")
	public void get_request_to_get_list_of_resouces() {
		
		Response response = RestAssured.given().when().get("api/unknown").then().log().all().extract().response();
		response.asPrettyString();
		System.out.println(response.getStatusCode());
		
		String string = response.jsonPath().getString("data[4].name");
		System.out.println(string);
	
	}

	@Then("get a single resource name and validate the status code")
	public void get_a_single_resource_name_and_validate_the_status_code() {
	 
	}

}
