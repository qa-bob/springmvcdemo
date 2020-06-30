package com.teksystems.springmvcdemo.controllers;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CustomerControllerTest {

    @Test(groups = "smoke")
    public void validateCustomerController(){
        given().get("http://localhost:8080//api/v1/customers").then().statusCode(200).log().all();
    }

}