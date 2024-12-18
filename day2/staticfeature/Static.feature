Feature: Update the Salesforce Account

Scenario: edit the details and verify phone number

Given Load the Url
When Enter the username as 'dilip@testleaf.com'
And Enter the password as 'leaf@2024'
And Click the App Launcher Icon
And Select Accounts
And Search for the account using as 'Seenivasan S'
And select Edit
And Set Type to Technology Partner
And Set Industry to Healthcare
And Enter the Billing Address 'Chennai'
And Enter the Shipping Address 'Chennai'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Active to NO
And Enter a unique number in the Phone field '57173719'
And Set Upsell Opportunity to No
And Click Save
Then verify the phone number