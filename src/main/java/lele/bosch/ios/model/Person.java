package lele.bosch.ios.model;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Person对象", description="")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "personId")
    private Integer personId;

    @ApiModelProperty(value = "firstName")
    private String firstName;

    @ApiModelProperty(value = "lastName")
    private String lastName;

    @ApiModelProperty(value = "gender")
    private String gender;

    @ApiModelProperty(value = "roleId")
    private Integer roleId;


}
