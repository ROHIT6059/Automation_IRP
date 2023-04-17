@Test
# Feature: Login Application  As a user I want to login to the application
# @QuickTest
 # Scenario Outline: Valid email and password
      #Given I launch thee url "https://dev.portal.irisirp.com"   
  
  
  Feature: Login As a new user
  I want to log in to the website 
  So that the system can remember my data

  Scenario Outline: Negative and positive Scenario Loginpage in to the website
    Given I launch thee url "https://dev.portal.irisirp.com"   
     When user filled a wrong password
     When User fill only email
      Then User fill only password
      When User fill correct email but wrong password
      When User fill wrong email and wrong password
      Then User fill wrong email but correct password
      Then User fill correct email and password 
     
  #   And User clicked on login button
  #  Then it gives error like is not registered with IRISIRP kindly sign up to register yourself
  
   #   When User fills a Correct data
   #    And User clicked on button 
   #    Then it gives a message 
#    When A user clicks Sign-in
#    And A user enters a valid email <email> and password <password>
#    And A user clicks Sign-in
#    Then A user should be successfully logged into the site

#  Scenario #2: Unsuccessful Log in to the website
 #   Given A user brings up the login pop-up
  #  When A user enters an invalid email <email> and password <password>
  #  And A user clicks Sign-in
  #  Then A user should not be successfully logged into the site