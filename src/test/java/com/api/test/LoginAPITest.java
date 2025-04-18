package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.modals.request.LoginRequest;
import com.api.modals.response.LoginResponse;

import io.restassured.response.Response;


@Listeners(com.api.listener.TestListener.class)
public class LoginAPITest {
	@Test
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("Demo", "QWEqwe!@#123");
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		
		Assert.assertTrue(loginResponse.getToken() != null);
		
		
	}
}
