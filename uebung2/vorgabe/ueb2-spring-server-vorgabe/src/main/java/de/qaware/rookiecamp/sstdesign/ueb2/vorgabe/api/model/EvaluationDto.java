package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "A stored evaluation")
public class EvaluationDto extends CreateEvaluationDto {

    @ApiModelProperty(name = "evaluationId", required = true)
    private Integer evaluationId;

    public EvaluationDto(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }
}
