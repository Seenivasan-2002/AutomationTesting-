Feature: Verfify the created account name in Salesforce

Scenario: Create and verify the Account

Given Load the url and login 

When Click on toggle menu button

And Click view All and click Sales

And Click on Accounts tab

And Click on New button

And Enter account name as Seenivasan

And Select Ownership as Public

And Click save

Then verify Account name