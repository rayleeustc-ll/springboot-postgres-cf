package lele.bosch.ios.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="role model", description="Model entity of role")
@TableName("role")
public class Role implements Serializable {

    @ApiModelProperty(value = "description")
    private String description;

    @ApiModelProperty(value = "role Id ")
    @TableField("role_id")
    private Integer roleId;

    @ApiModelProperty(value = "role name")
    @TableField("role_name")
    private String roleName;


}
