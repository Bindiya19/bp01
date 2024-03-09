Feature:Login successfully
   I want login to my Bank Account with valid credentials, So I can use Bank Functionalities.
  // Valid Username: bindi, Valid Password: Abc1234
  //Invalid Username: patel, Invalid Password: 123abc
  //Reset Password: Abcd1234, Email: bindiya.patel@yahoo.com
  Scenario: I should be logged in with valid credentials
  Given Chrome browser is open
    And Type the URL = www.santender.com
    When I enter valid usernane = bindi
    And I enter valid password = Abc1234
    And I click on login button
    Then I should be logged in successfully

  Scenario: I should not be logged in with invalid credentials, displayed error message should be
    Given Chrome browser is open
    And Type the URL = www.santender.com
    When I enter invalid usernane = patel
    And I enter invalid password = 123abc
    And I click on login button
    Then I should not be logged in
    And Displayed error message shows 'invalid username and password'

  Scenario:  I should not be logged in with blank username and valid password, displayed error message should be
    Given Chrome browser is open
    And Type the URL = www.santender.com
    When I did not enter usernane = blank
    And I enter valid password = Abc1234
    And I click on login button
    Then I should not be logged in
    And Displayed error message shows 'you must enter username'

  Scenario:Successful login with 'Remember Me' option
   Given I am on the log in page
    When i enter valie username = bindi
    And I enter valid password = Abcd123
    And tick the 'Remember me'
    And I click on login button
    Then I should be logged in successfully and will remember me for the next time

  Scenario: Successful login after password reset
    Given I reset my password, new password is Abcd1234
    When I enter valid username = bindi
    And i enter the new password = Abcd1234
    And I click on login button
    Then I should be logged in successfully

    Scenario: Successful log in with Multi-factor Authentication
      Given I am on login page
      When I enter valid username = bindi
      And I enter valid password = Abcd1234
      And I click on login button
      Then I Completed the Multi-factor Authentication process
      And I click on the OK button
      Then I should be logged in successfully

     Scenario: Successful log in with Email instead username because forget username
       Given I am on login page
       When Instead of usernane I enter valid Email = bindiya.patel@yahoo.com
       Then I enter valid password = Abcd1234
       And I click on login button
       Then I should be logged in successfully

      Scenario: successful login after session timeout
        Given I went back on log in page because, My session have expired
        When I enter valid username = bindi
        And I enter valid password = Abcd1234
        And I click on login button
        Then I should be logged in successfully





