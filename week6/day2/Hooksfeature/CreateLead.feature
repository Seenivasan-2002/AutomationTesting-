Feature: Create a account in LeafTap

#scenario outline for multiple data
Scenario Outline: Create account with multiple data

When Click on create lead 
And Enter the companyname as <comname>
And Enter the firstname as <fname>
And Enter the Lastname as <lname>
And Click on submit button

Examples: 
|comname|fname|lname|
|'Testleaf'|'Dharun'|'Kumar'|
|'Qeagle'|'Arun'|'kumar'|