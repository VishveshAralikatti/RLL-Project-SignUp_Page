 Feature: SignUp fuctionality
 
 Scenario Outline: To test the SigUp functionality of Chiltern Oak page
			Given user navigates to the signup page
			When the user enters their first name as '<fname>'
	    And the user enters their last name as '<lname>'
	    And the user enters their email as '<email>'
	    And the user enters their password as '<password>'
	    And the user click on create botton
	    Then the user should see the status as '<status>'
	    
	    
	    Examples:
	    		| fname | lname | email                 | password | status                                         |
	    		| User  | A     | usera7997@gmail.com   | User     | Password is too short (minimum is 5 characters)|
	    		| User  | A     |                       | User@123 | Please enter the valid data                    |
	    		| User  |       | usera@gmail.com       | User     | Please enter the valid data                    |
	    		|       |       |                       |          | Emil and Password cant be bla                  |
	    		| User  | A     | usera012@gmail.com    | User@123 | robot                                          | 
	    		