Feature: Login to application
	This is a test to check login functionality
	
	Scenario: Check Valid Login
		Given I am on www.automationpractice.com
		When I click on SignIn link
		And I enter username
		And I enter password
		And I click SigIn button
		Then I should be logged in to the application
	