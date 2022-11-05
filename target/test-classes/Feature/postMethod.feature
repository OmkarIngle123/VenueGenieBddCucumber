Feature: user is able to post the data in database

@PostMethod
Scenario: User should be able to add data into database
Given User want to post Data into Database
When User is able to put data into URI "http://localhost:8080/admins"
Then User want to validate status code 201 

