Feature: Create the Account and Lead with Multilingual data

#common codes in backgroud
Background: 
When Enter the username 
And Enter the password 
And Click on LoginButton
And Click on crmsfa

Scenario: Create the lead
When Click on leads tab
And Click on create lead
And Enter the CompanyName
And Enter the FirstName
And Enter the LastName
Then Click on leadSubmitButton

Scenario: Create the account
When Click on account tab
And Click on Create Account 
And Enter the AccountName
And Enter the description
And Enter the site name
And Enter the Count of employee
Then Click on AccountSubmitButton