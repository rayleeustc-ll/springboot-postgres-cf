package lele.bosch.ios.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lele.bosch.ios.mapper.RoleMapper;
import lele.bosch.ios.model.Role;
import lele.bosch.ios.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    public void insertRole ( String roleName, String roleDesc){
        Role role = new Role();
        role.setRoleName(roleName);
        role.setDescription(roleDesc);
        this.save(role);
    }

    public void deleteRoleById(Integer roleId){
        LambdaQueryWrapper<Role> rolequery = new LambdaQueryWrapper<>();
        rolequery.eq(Role::getRoleId,roleId);
        this.remove(rolequery);
    }

    public List<Role> listAllRoles(){
        List<Role> list = this.list();
        return list;
    }

    public List<Role> findRoleBYName(String name){
        LambdaQueryWrapper<Role> queryRole= new LambdaQueryWrapper<>();
        queryRole.eq(Role::getRoleName,name);
        List<Role> roleList = this.list(queryRole);
        return roleList;
    }
}
