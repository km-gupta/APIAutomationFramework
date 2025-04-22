package com.api.test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.UserProfileManagementService;
import com.api.modals.request.PasswordRequest;

import io.restassured.response.Response;

@Listeners(com.api.listener.TestListener.class)
public class ChangePassword {
	@Test(dependsOnMethods = { "loginTest()" })
	public void changePassword() {
		String token = LoginAPITest.loginResponse.getToken();

		PasswordRequest passwordRequest = new PasswordRequest.Builder().currentPassword("QWEqwe!@#123")
				.newPassword("QWEqwe!@#123").confirmPassword("QWEqwe!@#123").build();
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		Response response = userProfileManagementService.changePassword(token, passwordRequest);
		System.out.println(response.asPrettyString());
	}
}
