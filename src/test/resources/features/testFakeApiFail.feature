Feature: Second API test

  In order to test fake API
  As a web user
  I want to be able to verify returned response code

@skip
  Scenario: Should Fake API status code FAIL
  #..to the URL
    When I issue HTTP 'GET' with the URL 'https://jsonplaceholder.typicode.com/todos/1'
    Then the response code is equal to '300'