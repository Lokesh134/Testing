 Feature: Test login function
 Scenario Outline: Check login is successful with valid credentials
 
 Given user is login page
 When user enters <username> and <password>
 And  clicks on login button
 Then user is navigated to home page 
 
 Examples:
 |username|password|
 |lokesh|12345|
 |virat|17344|
 