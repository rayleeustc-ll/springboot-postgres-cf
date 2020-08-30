package lele.bosch.ios.controller;

import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lele.bosch.ios.model.Role;
import lele.bosch.ios.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/role")
@Api(value = "Roles", tags = {"roles"})
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ApiOperation(value = "List all the roles")
    @GetMapping("/listRoles")
    public String listRole() {
        try {
            List<Role> roles = roleService.listAllRoles();
            return JSON.toJSONString(roles);
        }catch (Exception e) {
            return e.getMessage();
        }
    }
    @ApiOperation(value = "Insert a role, parameters: role name and role description")
    @GetMapping("/insertRole")
    public String insertRole (@RequestParam String roleName,
                              @RequestParam String roleDesc){
        try {
            roleService.insertRole(roleName, roleDesc);
            return "insert successfully!!!" ;
        }catch (Exception e) {
            return e.getMessage();
        }
    }

    @ApiOperation(value = "Delete the role by given roleId")
    @GetMapping("/deleteRole")
    public String deleteRoleById(@RequestParam( name ="id") Integer roleID){
        try {
            roleService.deleteRoleById(roleID);
            return "delete successfully!!!" ;
        }catch (Exception e) {
            return e.getMessage();
        }
    }

    @ApiOperation(value = "Find a role by name")
    @GetMapping("/findRoleByName")
    public String findRoleByName(String name){
        try {
            List<Role> roleList = roleService.findRoleBYName(name);
            return JSON.toJSONString(roleList) ;
        }catch (Exception e) {
            return e.getMessage();
        }
    }
}
