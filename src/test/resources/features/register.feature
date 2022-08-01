Feature: Register Functionality

  @wip
  Scenario: User is on the homepage
    Given User navigate to homepage
    Then Verify that homepage is visible successfully
    When User clicks on signup button
    Then Verify New User Signup is visible
    When user enter username and email address
    And user clicks on new signup button
    Then Verify that enter account information is visible
    And fill details following information
    And user select checkbox1
    And user select checkbox2
    And user fill following details
      | FirstName    | Mike     |
      | LastName     | Smith    |
      | Company      | Cydeo    |
      | Address      | Birlik   |
      | Address2     | Cankaya  |
      | State        | Turkey   |
      | City         | Ankara   |
      | ZipCode      | 06600    |
      | MobileNumber | 05321000 |
    And user clicks on create account button
    Then verify 'ACCOUNT CREATED!' is visible
    And user clicks on Continue button
    Then Verify that 'Logged in as username' is visible
    And user clicks on Delete Account button


#Test Case 1: Register User
#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Signup / Login' button
#5. Verify 'New User Signup!' is visible
#6. Enter name and email address
#7. Click 'Signup' button
#8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
#9. Fill details: Title, Name, Email, Password, Date of birth

#10. Select checkbox 'Sign up for our newsletter!'
#11. Select checkbox 'Receive special offers from our partners!'
#12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
#13. Click 'Create Account button'
#14. Verify that 'ACCOUNT CREATED!' is visible
#15. Click 'Continue' button
#16. Verify that 'Logged in as username' is visible
#17. Click 'Delete Account' button
#18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button