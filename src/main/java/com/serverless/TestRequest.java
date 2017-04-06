package com.serverless;

public class TestRequest {

	private final String firstName;
	private final String lastName;

	public TestRequest(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
}