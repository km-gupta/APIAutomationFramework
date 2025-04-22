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
		LoginResponse loginResponse = LoginAPITest.loginResponse;

		System.out.println("---------------------------------------------");

		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();


		ProfileRequest profileRequest = new ProfileRequest.Builder().firstName("Karan").lastName("lastname")
				.email("email@domain.com").mobileNumber("9999999999").build();

		System.out.println("---------------------------------------------");
		Response response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
		

	}

}
