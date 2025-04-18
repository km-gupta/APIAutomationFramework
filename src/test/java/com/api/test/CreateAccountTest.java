package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.modals.request.SignUpRequest;

import io.restassured.response.Response;

public class CreateAccountTest {
	@Test(description = "Verify if the login API is working! ")
	public void creationAccountTest() {

		SignUpRequest signUpRequest = new SignUpRequest.Builder()
		.username("string")
		.password("string")
		.email("string")
		.firstName("string")
		.lastName("string")
		.mobileNumber("1662317950")
		.build();
		

		AuthService authService = new AuthService();
		Response response = authService.signup(signUpRequest);
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());


	}
}
