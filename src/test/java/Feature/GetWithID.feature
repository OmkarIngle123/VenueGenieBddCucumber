
Feature: User is able to fetch the data by ID

@GetByID
Scenario: User want to read the data from database
When User want to fetch the data from database "http://localhost:8080/admins/58"
Then User want to verify status code 200

