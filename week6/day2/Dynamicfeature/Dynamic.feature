
Feature: Create the Salesforce Account

#scenario outline for multiple data 
Scenario Outline: New account

Given Load the url 
When  login to salesforce
And  Click on toggle menu button
And Click view All and click Sales
And Click on Accounts tab
And Click on New button
And Enter account name as <name>
And Select Ownership as Public
And Click on save
Then verify Account name
Examples:
|name|
|'tester1'|
|'tester2'|
|'tester3'|
