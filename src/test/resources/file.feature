Feature: annotation
#This is how background can be used to eliminate duplicate steps
#Scenario with BUT
  Scenario:
    Given I am on Facebook login page
    When I enter username as "mord"
    And I enter password as "neroONE"
    And I click on LogIn button
    Then Login should fail
    But Relogin option should be available