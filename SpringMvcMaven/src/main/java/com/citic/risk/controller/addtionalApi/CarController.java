package com.citic.risk.controller.addtionalApi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.citic.risk.additionalModels.Car;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Controller
@RequestMapping(value = "/api/v1/cars")
@Api(value = "/api/v1/cars", description = "All operations for cars", position = 2)
public class CarController {

    @ApiOperation(value = "Find all cars", notes = "Get all cars currently available", httpMethod = "GET", response = Car.class)
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Process error"), @ApiResponse(code = 405, message = "Invalid input")})
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    Car[] cars() {
        Car car = new Car();
        car.setMake("Toyota");
        car.setModel("Camry");
        car.setYear("2005");

        return new Car[]{car};
    }
}
