Feature: the version can be retrieved
  Scenario: client makes call to GET /version
  When the client calls /version
  Then the client receives status code of 200
  And the client receives server version 1.0

  Scenario: client makes call to GET /health
  When the client calls /health
  Then the client receives status code of 200
  And the client receives health status ok

  Scenario: client makes call to GET /info
  When the client calls /info
  Then the client receives status code of 200
  And the client receives application info