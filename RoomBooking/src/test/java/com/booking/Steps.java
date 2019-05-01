package com.booking;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.omg.PortableInterceptor.Interceptor;

import static org.junit.Assert.assertEquals;

public class Steps {
    private RequestSpecification request;
    private Response response;
    private int expectedResponseCode, actualResponseCode;
    private String expectedResponseData, actualResponseData;

    @Given("When I hit the rest endpoint at {string}")
    public void i_have_booking_details_in_booking_table(String url) {
        RestAssured.baseURI = url;
        this.request = RestAssured.given();
    }

    @When("I invoke the hotel booking REST API with GET method")
    public void when_I_hit_the_rest_endpoint_at() {
        this.request.header( "Content-Type", "application/json" );
        this.response = request.get();
        this.actualResponseCode = this.response.getStatusCode();
    }

    @Then("I expect response code {string}")
    public void i_expect_response_code(String expectedResponseCode) {
        actualResponseCode = response.getStatusCode();
        this.expectedResponseCode = Integer.parseInt(expectedResponseCode);
        assertEquals(this.expectedResponseCode,actualResponseCode);
    }

    @Then("I expect {string} booking records as response")
    public void i_expect_booking_records_as_response(String strExpectedCount) {
        Booking[] bookings = response.as(Booking[].class);
        int expectedRecordCount = Integer.parseInt(strExpectedCount);
        int actualRecordCount = bookings.length;
        assertEquals(expectedRecordCount, actualRecordCount);
    }

}
