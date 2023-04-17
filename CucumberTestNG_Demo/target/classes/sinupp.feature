@Test
Feature:
 Login Application  As a user I want to login to the application

@QuickTest
 Scenario Outline: Valid user name and password for Taxpayer
    Given User launch the urll "https://dev.portal.irisirp.com" 
    Then User clicked on signup link 
    When User Not fills name
    When User Not Fills email
    When User fill only name not email
    When User fill only email not name
    When User fill wrong emailformat
    Then User fill name and correct email format but that are already exist
     Then User fill name and correct email but new User and they not mark on checkbox
     Then User fill name and correct email but new User
   
   
   # Then User received OTP Successfully 
  #  Then checking Actual and expected error   
  #  Then User pass Correct Random name and email
  #   When User cliked on SIGNUP button
  #  When User use wrong OTP  
  #  Then it gives message to user
   # When I enter OTP for validation 
 #  And I set new password "Rohit@123" and "Rohit@123" 
 #  Then I clicked on set password button

# @QuickTest
 # Scenario: Successfully Login to Website
  # Given I am on the www.garanti.com.tr Home Page
  # When I click Login Link on Home Page
  # And Fill UserID field with "111234567854" and Fill Password field with "P@ssw0rd" and click Login on LoginPage
  # And I click SMS Code and write "458298" on Login Page
  # Then I should see url contains "wellcome"
   #And I should see my account Dashboard page

# Scenario Outline: UnSuccessfully Signup with Invalid Email and Number 
#   Given I am on the "https://dev.portal.irisirp.com"
 #  When I clicked on signup link
  #  Then I pass wrong name  and wrong Random email 
  # And I click SMS Code and write "<smscode>" on Login Page
  # Then I should not see url contains "wellcome"
   

# Scenario Outline: UnSuccessfully Login with Credentials to Website
#   Given I am on the "https://dev.portal.irisirp.com"
#   When I click Login Link on Home Page
#   And Fill UserID field with "<userid>" and Fill Password field with "<password>" from list and click Login on LoginPage
#   Then I should not see url contains "dashboard"
   
    
    
   