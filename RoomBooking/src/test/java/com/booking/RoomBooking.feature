Feature: Develop a Hotel Booking REST API

  Scenario: Should be able to retrieve all hotel room booking done as on today
    Given When I hit the rest endpoint at "http://localhost:8080/RoomBooking-1.0/rest/booking/all"
    When I invoke the hotel booking REST API with GET method
    Then I expect response code "200"
    And I expect "3" booking records as response