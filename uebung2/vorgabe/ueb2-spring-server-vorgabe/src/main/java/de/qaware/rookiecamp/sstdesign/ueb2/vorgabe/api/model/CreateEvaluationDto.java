package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "An evaluation of stuff lul")
public class CreateEvaluationDto {

    @ApiModelProperty(name = "coffeeId", required = true)
    private Integer coffeeId;
    @ApiModelProperty(name = "beverageI", required = true)
    private Integer beverageId;
    @ApiModelProperty(name = "taste", required = true)
    private Integer taste;
    @ApiModelProperty(name = "look", required = true)
    private Integer look;
    @ApiModelProperty(name = "remarks")
    private String remarks;

    public CreateEvaluationDto() {
    }

    public Integer getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(Integer coffeeId) {
        this.coffeeId = coffeeId;
    }

    public Integer getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(Integer beverageId) {
        this.beverageId = beverageId;
    }

    public Integer getTaste() {
        return taste;
    }

    public void setTaste(Integer taste) {
        this.taste = taste;
    }

    public Integer getLook() {
        return look;
    }

    public void setLook(Integer look) {
        this.look = look;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
