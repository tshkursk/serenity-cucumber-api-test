Feature: First API test

  In order to test fake API
  As a web user
  I want to be able to issue get request on it

  Scenario: Fake API should work on GET
    When I issue HTTP 'GET' to the URL 'https://jsonplaceholder.typicode.com/todos/1'
    Then the response code is equal to '200'

  Scenario: Fake API should work on POST
    Given I set request headers:
    |Content-Type|application/json; charset=UTF-8|
    Given I set request body: '{"title": "foo",	"body": "bar", "userId": 1}'
    When I issue HTTP 'POST' to the URL 'https://jsonplaceholder.typicode.com/posts'
    Then the response code is equal to '201'
