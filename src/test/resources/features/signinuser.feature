#Autor: Laura Romero

  Feature:Login uTest
    As a user, I want to create a new user in uTest
    to access as user

  Scenario:Successful user creation
    Given user in the home page
    When  user create an account filling all fields
    Then  user sees its username
