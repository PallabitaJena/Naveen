Feature: Free CRL login feature

Scenario: Free CRM login with Valid credentials

Given User is already on login page
When title of logi page is Free CRM
Then user enters username and password
And user clicks on login button
And user is on Home page

