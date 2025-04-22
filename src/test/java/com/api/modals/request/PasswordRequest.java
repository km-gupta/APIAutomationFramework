package com.api.modals.request;

public class PasswordRequest {
	private String currentPassword;
	private String newPassword;
	private String confirmPassword;
	
	

	public PasswordRequest(String currentPassword, String newPassword, String confirmPassword) {
		super();
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
	}



	public String getCurrentPassword() {
		return currentPassword;
	}



	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}



	public String getNewPassword() {
		return newPassword;
	}



	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	@Override
	public String toString() {
		return "PasswordRequest [currentPassword=" + currentPassword + ", newPassword=" + newPassword
				+ ", confirmPassword=" + confirmPassword + "]";
	}



	public static class Builder {
		private String currentPassword;
		private String newPassword;
		private String confirmPassword;
		
		public Builder currentPassword(String currentPassword) {
			this.currentPassword = currentPassword;
			return this;
		}
		
		public Builder newPassword(String newPassword) {
			this.newPassword = newPassword;
			return this;
		}
		
		public Builder confirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
			return this;
		}
		
		
		public PasswordRequest build() {
			PasswordRequest passwordRequest = new PasswordRequest(currentPassword, newPassword, confirmPassword);
			return passwordRequest;
		}
		
		
	}

}
