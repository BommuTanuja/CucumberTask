Feature: Home Module
  @login
  Scenario Outline: Fill the Form
    Given User on welcome screen and click on contact
    Then User enter name "<Name>" and email "<Email>" and message "<Message>"
    And User should click on checkbox and submit form
    And User verify successful login

    Examples:
    |Name  | |  Email|               |Message|
    |Tanuja| |bommutanuja@gmail.com| |Testing|