@Test
Feature: Login Application  As a user I want to login to the application

  Scenario Outline: Valid user name and password
    Given I launch the url "https://dev.portal.irisirp.com"   
      When I provide "rohit.savade@irisbusiness.com" and "Abcd@1234"
    Then I click on login button
    Then User see the AddGSTN page
    When user enter GSTN for SEZ Unit "33AGNLC3227C2Z0"
    Then enter GSTN for ISD  "32AGNLC3227C3Z2"
    When enter GSTN for UIN "2719UNO00061UN0"
    Then enter GSTN for UN Body "2919UNO00007UNL"
    When enter GSTN for Other notified person "298IND00017ONB "
    Then enter GSTN for Composition "03AYPPS7110A1ZG"
   # When enter GSTN for TCS "24AGNLC3227C1CK"
    Then enter GSTN for TDS "36AGNLC3227C2DS"
    When enter GSTN for NRI "2923IND00017NRN"
    Then enter GSTN for Regular "21GSPMH0121G1Z8"
    When enter GSTN for SEZ Developer "33GSPMH0121G3ZJ"
    Then adding the GSTN for Inactive "34GSPMH0121G1ZI"
    When Adding the GSTN for Suspended "03GSPMH0121G1ZQ"
    Then GSTN adding for Provisional "04GSPMH0121G1ZL"
    When adding GSTN for Cancelled "27AGNLC3227C1Z0"
   
    When adding a Invalid GSTIN "26AECPR9208C321"
 #   Then adding the GSTN for Positive response "05GSPMH0121G1Z6"
    When verify valid email and valid mobile "rohitsava@irisbusiness.com" and "8806481789"
    Then verify Registered user emailid and mobile "samaira.tolani@irisbusiness.com" and "8318052744"     
    When UnRegistered user emailid and mobile "nik@irisbusiness.com" and "8806482889"
    Then User  entering non valid email and non valid mobile "jesh.gmail.com" "1208052743"
    When User enter only email not mobile "Rohitsade6059@gmail.com"
    When User enter only mobile not email "8806481789"
    Then User enter invalid OTP "123456"
    #And User enter valid OTP "676767"
    
    When User use correct valid Set IRP Username and password that time checking button is enbaled or disabled  
    Then User choose Intermediary integration method
    
 
 
 
 
   # Then I enter GSTIN number "24GSPMH0121G1Z9"
  #  Then I clicked on save and next button1
 # Then I enter "rohit.savade@irisbusiness.com" and "8806481789"
  #  Then I clicked on send OTP button
  # Then I enter OTP "676767"
  #  Then I clicked on save&next button2
  #  Then I enter IRP "Rohit@" and "Abcd@1234"
  #  Then I clicked on save&next button3
  #  Then I choose Intermediary integration method 
  #  Then I clicked on dropdown and choose all
  # Then I clicked on  save&next button4
  # And I choose all the checkboxes
  # Then I click on sendotp  
  #  Then clicked on final save 
   
    
    
   
     # Then I Choose Direct API integration method
   