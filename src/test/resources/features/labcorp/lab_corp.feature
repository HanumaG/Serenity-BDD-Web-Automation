Feature: Login to labcorp and apply for a job

 Scenario: Login to labcorp and apply to job
 Given user logs in to labcorp portal with valid credential
 When user search and applies for a job
 Then user should be able to apply successfully for desired job