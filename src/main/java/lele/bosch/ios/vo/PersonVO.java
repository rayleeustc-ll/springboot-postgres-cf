package lele.bosch.ios.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lele.bosch.ios.model.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="person vo", description="view object of person")
public class PersonVO extends Person {

    @ApiModelProperty(value = "description")
    private String description;

    @ApiModelProperty(value = "role name")
    private String roleName;
}
