package lele.bosch.ios.service;


import com.baomidou.mybatisplus.extension.service.IService;
import lele.bosch.ios.model.Role;

import java.util.List;


public interface RoleService extends IService<Role> {
	public void insertRole(String roleName, String roleDesc);
	public void deleteRoleById(Integer roleId);
	public List<Role> listAllRoles();
	public List<Role> findRoleBYName(String name);
}
