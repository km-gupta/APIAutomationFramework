package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.modals.request.LoginRequest;
import com.api.modals.request.ProfileRequest;
import com.api.modals.response.LoginResponse;
import com.api.modals.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {

	@Test
	void updateProfileTest() {
		AuthService authService = new AuthService();
		LoginRequest loginRequest = new LoginRequest("Demo", "QWEqwe!@#123");
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());

		System.out.println("---------------------------------------------");

		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());

		ProfileRequest profileRequest = new ProfileRequest.Builder().firstName("Karan").lastName("lastname")
				.email("email@domain.com").mobileNumber("9999999999").build();

		System.out.println("---------------------------------------------");
		response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
		

	}

}
