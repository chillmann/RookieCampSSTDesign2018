package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Coffee;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BeverageListResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.CoffeeListResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.QAcoffeeResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;


@Api(value = "Evaluation API", description = "evaluation of QACoffee")
@RequestMapping(path = "/evaluation", produces = "application/json")
@Controller
public class QAcoffeeEvaluationAPI {

    @ApiOperation(value = "Returns the available beverages.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BeverageListResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/beverages", method = RequestMethod.GET)
    public ResponseEntity<BeverageListResponse> getAvailableBeverages() {
        List<Beverage> dummyResponse = Arrays.asList(
                new Beverage(0, "American"),
                new Beverage(1, "Espresso")
        );
        return new ResponseEntity<>(new BeverageListResponse(dummyResponse, null), HttpStatus.OK);
    }

    @ApiOperation(value = "Returns the available coffees.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BeverageListResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/coffees", method = RequestMethod.GET)
    public ResponseEntity<CoffeeListResponse> getAvailableCoffees() {
        List<Coffee> dummyResponse = Arrays.asList(
                new Coffee(0, "Giasing", "giasing.png"),
                new Coffee(1, "Sendling", "sendling.png")
        );
        return new ResponseEntity<>(new CoffeeListResponse(dummyResponse, null), HttpStatus.OK);
    }

    @ApiOperation(value = "Adds an evaluation for the given coffee and beverage.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BeverageListResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/evaluation", method = RequestMethod.POST)
    public ResponseEntity<QAcoffeeResponse> evaluate(@ApiParam(value = "The evaluated coffee's id") int coffeeId,
                                                       @ApiParam(value = "The evaluated beverage's id") int beverageId,
                                                       @ApiParam(value = "Taste from 0 (worst) to 10 (best)") int taste,
                                                       @ApiParam(value = "Look from 0 (worst) to 10 (best)") int look,
                                                       @ApiParam(value = "User's remarks") String remarks) {

        return new ResponseEntity<>(new QAcoffeeResponse<Void>(null, null), HttpStatus.OK);
    }
}
