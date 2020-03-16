Feature: Jpet 


@tc01_Jpet_Register
Scenario: 
To register users in Jpet Application 
Given enter all user details in register page
	
@tc02_Jpet_SignIn
Scenario: 
To SignIn users in Jpet Application

When launch an chrome browser for signin
Then launch application homepage for signin
And enter username and password in signin page
	
@tc03_Jpet_Search
Scenario: 
To Search data in Jpet Application

Given launch an chrome browser for search
When the user opens Jpet homepage for search
Then enter text in search textbox
And take a screenshot of search result
	
@tc04_Jpet_PrintTable
Scenario: 
To print pets Table in Jpet Application

	Given launch an chrome browser for print table
	When the user opens Jpet homepage for print table
	And print the product list table
	@tc05_Jpet_AddToCart
	Scenario:
	Given launch an chrome browser for add a product to cart
	When launch application homepage for add to cart
	Then Add a product to cart
	And Take a screenshot for add to cart
