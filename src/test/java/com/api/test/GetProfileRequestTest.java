package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.modals.request.LoginRequest;
import com.api.modals.response.LoginResponse;
import com.api.modals.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	@Test
	void getProfileInfoTest() {
		LoginRequest loginRequest = new LoginRequest("Demo", "QWEqwe!@#123");

		AuthService authService = new AuthService();
		
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);

		UserProfileManagementService userPMService = new UserProfileManagementService();
		response = userPMService.getProfile(loginResponse.getToken());

		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getUsername());

	}
}
