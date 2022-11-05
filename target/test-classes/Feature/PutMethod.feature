Feature: Put Request

@PutMethod
Scenario:User should be able to update data into database
Given User want to update the Date into database
When User is able to update dat into database using URI "http://localhost:8080/admins"
Then User want to check the code is 200


