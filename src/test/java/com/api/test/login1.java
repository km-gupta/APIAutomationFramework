package com.api.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@Test
class login1 {
	
	
	public void login() {
		Response response = RestAssured.given().baseUri("http://64.227.160.186:8080/api/auth/").header("Content-Type", "application/json")
				.body("{\"username\": \"Demo\", \"password\": \"QWEqwe!@#123\"}").post("/login");
		System.out.println(response.asPrettyString());
	}
}