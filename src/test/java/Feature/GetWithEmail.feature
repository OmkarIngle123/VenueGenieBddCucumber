Feature: GetWithEmail  Request


@GetByEmail
Scenario: User want to read the data from database 
When User want to Fetch the data From the database "http://localhost:8080/admins/email/starpubg316@gmail.com"
Then User want to verify Status Code 200

