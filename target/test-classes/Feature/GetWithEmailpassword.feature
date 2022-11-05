Feature: GetWithEmailPasswordSteps Request

@GetWithEmailPassword
Scenario: User want to read the data frm the database
When user Want to retrive the data From the database "http://localhost:8080/admins/email/starpubg316@gmail.com/password/Raj@134"
Then User want to check sTatus code 404