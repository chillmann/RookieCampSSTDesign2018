package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Evaluation;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.CoffeeResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Api(value = "EvaluationAPI", description = "")
@RequestMapping(path = "/api", produces = "application/json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "gets List of available coffees")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = CoffeeResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/coffee", method = RequestMethod.GET)
    public ResponseEntity<CoffeeResponse> getCoffeeList() {

        return new ResponseEntity<>(new CoffeeResponse(Boolean.TRUE, null), HttpStatus.OK);
    }

    @ApiOperation(value = "gets List of available beverages")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = CoffeeResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/beverage", method = RequestMethod.GET)
    public ResponseEntity<CoffeeResponse> getBeverageList() {

        return new ResponseEntity<>(new CoffeeResponse(Boolean.TRUE, null), HttpStatus.OK);
    }

    @ApiOperation(value = "adds Evaluation to Database")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = CoffeeResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/evaluation/add", method = RequestMethod.POST)
    public ResponseEntity<CoffeeResponse> addEvaluation(int taste, int looks, String remarks, int coffeID, int beverageID) {

        return new ResponseEntity<>(new CoffeeResponse(Boolean.TRUE, null), HttpStatus.OK);
    }

}
