package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "A coffee.")
public class CoffeeDTO {

    @ApiModelProperty(name = "imgUrl", required = false)
    private String imgUrl;

    @ApiModelProperty(name = "startDate", required = true)
    private Date startDate;

    @ApiModelProperty(name = "endDate", required = true)
    private Date endDate;

    @ApiModelProperty(name = "name", required = true)
    private String name;

    public CoffeeDTO() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
