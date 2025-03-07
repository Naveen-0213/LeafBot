Feature: Login salesforce

Scenario: Login with positive data
Given Enter the username as 'hari.radhakrishnan@qeagle.com'
And Enter the password as 'Testleaf$321'
When Click on login button
Then Homepage should be displayed
