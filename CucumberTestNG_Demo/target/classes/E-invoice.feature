@Test
Feature: E-invoice 

  Scenario Outline: Valid user name and password
    Given I launch the urrl
      When I proviide "samaira.tolani@irisbusiness.com" and "Abcd@123456"
    Then I click on loginn button
    And User clicked on generate einvoice
   When User enter 16 digit Document number
   Then User enter More than 16 digit Document number
   
    When User enter One digit Document number
    Then User enter No digit Document number
    When User start with - in document number
    Then User start with 0 in document number
    When user start with / in document number1
    Then user start with numbers in document number
   
    When user use positive case
    Then user set Legal Name maximum
    When user set Legal Name minimum
    Then user set numbers in legal name
    Then user not set any legal name put Blank
   
    When user set Trade Name Maximum
    Then user set Trade Name Minimum
    Then user set Trade Name numbers
    When user set Trade Name Blank
   
    Then user set Address1 Maximum
    Then user set Address1 Minimum
    Then user set Address1 numbers
    When user set Address1 Blank
   
    Then user set Address2 Maximum
     Then user set Address2 Minimum
    Then user set Address2 numbers
    When user set Address2 Blank
   
    Then user set Location Maximum
     Then user set Location Minimum
    Then user set Location numbers
    When user set Location Blank
   
    Then user set Pincode Maximum
    Then user set Pincode Minimum
    Then user set Pincode aplhabets
    When user set Pincode Blank
   
    Then user set Phone Maximum digit
    When user set Phone Minimum digit
    Then user set aplhabets in phone   
      When user set Phone number Blank
      #Then user set email Maximum digit
   
    When user set email Minimum digit
    Then user set email in aplhabets   
      When user set email  Blank
      Then user set alphanumeric values in email
   
    Then user set valid detail
   
     When Recipient GSTIN added more than 15 digit Maximum
      Then Recipient GSTIN added less than 15 digit for Minimum
      When User Not adding Recipient GSTIN means its Blank
      Then User added Cancelled GSTIN "02AGNLC3227C1Z0"
      When user added Inactive GSTIN "34GSPMH0121G1ZI"
      Then user added Provisional GSTIN "04GSPMH0121G1ZL"
      When User added Suspended GSTIN "03GSPMH0121G1ZQ"
      Then User added Composition GSTIN "03AYPPS7110A1ZG"
      When User added TDS GSTIN "36AGNLC3227C2DS"
      Then User added TCS GSTIN "24AGNLC3227C1CK"
      When User added NR GSTIN "2923IND00017NRN"
      Then User added gstn for SEZ Unit "33AGNLC3227C2Z0"
      When User added gstn for SEZ Developer "33AGNLC3227C3ZJ"
    Then User added gstn for ISD "32AGNLC3227C3Z2"
    When User added gstn for UIN "2719UNO00061UN0"
    Then User added gstn for UN Body "2919UNO00007UNL"
    When User added gstn for Other notified person "298IND00017ONB"
   # When User enter Document No and checking maximum, minimum and pattern condition
   
  Then User added Legal Name Maximum character
  When User added Legal name Minimum character
  Then User added Legal name alphanumeric values character
  When User added numbers in Legal name 
  Then User added in legal name Blank 
 
  Then user added Trade Name Maximum character
   When user added Trade Name Minimum character
  Then user added Trade Name alphanumeric values character
  When user added Trade Name numbers character
   Then user added Trade Name Blank
   
 When user added Maximum character in Address1 
 Then user added Minimum character in Address1
  Then user added alphanumeric values character in Address1
  When user added numbers in Address1
  Then user added Blank in Address1
  
  When user added Maximum character in Address2
 Then user added Minimum character in Address2
  Then user added alphanumeric values character in Address2
  When user added numbers in Address2
  Then user added Blank in Address2
  
    When user added Maximum character in Location
 Then user added Minimum character in Location
  Then user added alphanumeric values character in Location
  When user added numbers in Location
  Then user added Blank in Location
  
  When user added Maximum character in Pincode
 Then user added Minimum character in Pincode
  Then user added alphanumeric values character in Pincode
  When user added numbers in Pincode
  Then user added Blank in Pincode
 
  When user added Maximum character in Phone
 Then user added Minimum character in Phone
  Then user added alphanumeric values character in Phone
  When user added aplhabets in Phone
  
   When user added Maximum character in Email
 Then user added Minimum character in Email
  Then user added alphanumeric values character in Email
  When user added numbers in Email
 # Then user added Blank in Email
  
  Then Positive test case for Recipient Details
  
  When user added Maximum character in Sr No
 Then user added Minimum character in Sr No
  Then user added alphanumeric values character Sr No
  When user added alphabets in Sr No
  Then user added 0 in Sr No
  When user added decimal in Sr No
  
   When user added Maximum character HSN
 Then user added Minimum character in HSN
  Then user added alphanumeric values character HSN
  When user added numbers in HSN
  Then user added 0 in HSN
  When user added decimal in HSN 
  
  Then user added Maximum length Product Description
  When user added Minimum length Product Description
  Then user added alphanumeric values  Product Description
  When user added aplhabets Product Description
  Then user added numbers in Product Description
  
    Then user added Maximum length Quantity
  When user added Minimum length Quantity
  Then user added alphanumeric values Quantity
  When user added aplhabets Quantity
  Then user added numbers in Quantity
  
    Then user added Maximum length Free Quantity
  When user added Minimum length Free Quantity
  Then user added alphanumeric Free Quantity
  When user added aplhabets Free Quantity
  Then user added numbers in Free Quantity
  
 
  Then user added Maximum length  Unit Price
  When user added Minimum length  Unit Price
  Then user added alphanumeric  Unit Price
  When user added aplhabets  Unit Price
  Then user added numbers in  Unit Price
  
  
  Then user added Maximum length Discount
  When user added Minimum length Discount
  Then user added alphanumeric Discount
  When user added aplhabets Discount
  
   Then user added Maximum length Pre tax value
  When user added Minimum length Pre tax value
  Then user added alphanumeric Pre tax value
  When user added aplhabets Pre tax value
  
  
   Then user added Maximum length Cess Rate
  When user added Minimum length Cess Rate
  Then user added alphanumeric Cess Rate
  When user added aplhabets Cess Rate
  Then user added numbers in Cess Rate
 
   Then user added Maximum length State Cess Rate
  When user added Minimum length State Cess Rate
  Then user added alphanumeric State Cess Rate
  When user added aplhabets State Cess Rate
  Then user added numbers in State Cess Rate
  
   
   Then user added Maximum length Cess Non Ad Value
  When user added Minimum length Cess 
  Then user added alphanumeric Cess Non Ad Value
  When user added aplhabets Cess Non Ad Value
  Then user added numbers in Cess Non Ad Value
  
   Then user added Maximum length State Cess Non Ad Value
  When user added Minimum length State Cess Non Ad Value
  Then user added alphanumeric State Cess Non Ad Value
  When user added aplhabets State Cess Non Ad Value
  Then user added numbers in State Cess Non Ad Value
  
   Then user added Maximum length Other Charges
  When user added Minimum length Other Charges
  Then user added alphanumeric Other Charges
  When user added aplhabets Other Charges
  Then user added numbers in Other Charges
  
  Then added positive test case for item details 
  
  
  
  
  
  
  
  
 # Then user added Blank in Email
  
   
  
  
    
    

    