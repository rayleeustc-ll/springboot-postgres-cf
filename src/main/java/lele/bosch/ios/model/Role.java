package lele.bosch.ios.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("role")
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    private String description;
    @TableField("role_id")
    private Integer roleId;
    @TableField("role_name")
    private String roleName;

    @Override
    protected Serializable pkVal() {
        return this.description;
    }

}
