Feature: Login Feature

  Scenario Outline: Login Success
    Given I open login page
    When I enter email <email>
    And I enter password<password>
    And I submit
    Then I am logged in
    Examples:
      | email                        | password      |
      | "abisola.omotoso@testpro.io" | "te$t$tudent" |
