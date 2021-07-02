Feature: Zerobank new Payee funtionality
Background:
  Given Navigate to ZeroBank
  And Enter e valid username "username" and password "password"
  Then Login successfully

  @SmokeTest
  Scenario:  Add ne payee succesfully

    Given navigate to Pay Bills
    And Click required boxes
      | PAYBILLSTAB |
      | PAYEE       |
    And Fill  all needed Boxes with suitable infos
      | PAYEENAME      | Manisali            |
      | ADRESSPAYEE    | Manisali merkez mah |
      | ACCOUNTNAME    | Yillik              |
      | ACCOUNTDETAILS | Yillik birikimler   |
    Then Pay succesfully



  @SmokeTest
  Scenario Outline:
    Given Navigate to Purchase Foreign CUrrency

    And Fill  all needed Boxes with suitable infos
      | AMOUNT | 100 |
    And Click required boxes
      | FOREIGNCURRENCYTAB |
      | CURRENCY           |
      | <RADIOBUTTONUSD>   |
      | CALCULATE          |

    Then Calculate succesfully

    Examples:
      | RADIOBUTTONUSD  |
      | RADIOBUTTONUSD  |
      | RADIOBUTTONUSD2 |