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
		LoginResponse loginResponse = LoginAPITest.loginResponse;

		UserProfileManagementService userPMService = new UserProfileManagementService();
		Response response = userPMService.getProfile(loginResponse.getToken());

		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getUsername());

	}
}
