package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * TODO: comment
 *
 * @author stefan.billet@qaware.de
 * @since 18.09.2018
 */
@ApiModel(description = "List of available beverages.")
public class BeverageListResponse extends QAcoffeeResponse<List<Beverage>> {
    public BeverageListResponse(List<Beverage> payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
