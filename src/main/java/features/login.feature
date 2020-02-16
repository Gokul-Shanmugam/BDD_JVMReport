@tst @reg @sasnity @US123456
Feature: BDD Scenario_1

@SIT @Reg @test1
Scenario Outline: BDD Test case_1

Given user is on Login Pages
When title of login page is Free CRMs
And user enters "<username>" and "<password>" and "<Date>"
#And user enters "Gokul" and "12345" and "12"
Then user click on login button
Then users is on home page
Then Close the browsers   

Examples:
	| username | password |Date|
	| naveenk  | test@123 |12  |
	|Gokul	   |12345	  |15  |
	
	
@Register
Scenario: BDD Test case_2

Given User launch demo automation in chrome
When verify title of login page
And user click on skip sign in demo automation site
And user enter "Gokul" and "S" in register page	   

		   