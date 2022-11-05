Feature: GetWithEmailOtp Request

@GetWithEmailOtp
Scenario: User want to read the data from the database
When User want To fetch the Data from the database "http://localhost:8080/admins/email/starpubg316@gmail.com/otp/24680"
Then User Want to Verfy StatuS code 404