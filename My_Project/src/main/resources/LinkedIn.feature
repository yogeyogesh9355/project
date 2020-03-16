@Test1
Feature: LinkedIn Login
Scenario: 
 LinkedIn Login page
	
	Given the user launched the chrome browser 
	When the user opens LinkedIn homepage 
	And the user enters the user name and password  
	Then the user should click on sign in button 
	
	
@test2 
Scenario: 
	 linkedIn register

	Given launch an chrome browser 
	When the user opens LinkedIn homepage
	Then the user enters email and creates password
	And the user should click Agree & join