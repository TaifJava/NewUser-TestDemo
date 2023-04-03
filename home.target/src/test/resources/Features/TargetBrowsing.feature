Feature: Target Home Browsing
  
As a user I test Target Home Page website

  Scenario: Home page browsing
    Given User navigates to Target Home Page
    Then User lands on Home page and sees Home Page title
    When User clicks on Profile button
    And User clicks on create account button
    And User types email address in email field
    And User types First name in First name field
    And User types Last name in Last name field
    And User types Password in password field