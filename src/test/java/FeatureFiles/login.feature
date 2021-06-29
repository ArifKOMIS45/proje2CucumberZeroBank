Feature: Zerobank login funtionality

  Scenario: Login to Zero Bank successfully
    Given Navigate to ZeroBank
    And Enter e valid username "username" and password "password"
    Then Login successfully