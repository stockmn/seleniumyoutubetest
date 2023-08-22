Feature: Test youtube music search application
  Scenario: test if you input a music name on the youtube search module the songs will play when you click okay
    Given User on the youtube landing page
    When user input the song on the search button
    And user click submit
    Then the songs will be played
    Then the driver exit the process after some time


