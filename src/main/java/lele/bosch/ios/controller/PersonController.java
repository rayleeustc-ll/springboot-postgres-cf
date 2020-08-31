package lele.bosch.ios.controller;


import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import lele.bosch.ios.model.Role;
import lele.bosch.ios.service.IPersonService;
import lele.bosch.ios.service.RoleService;
import lele.bosch.ios.vo.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @ApiOperation(value = "List all the roles")
    @GetMapping("/ListPersonsByLastName")
    public String listPersonAndRoleByLastName(String lastName) {
        try {
            List<PersonVO> personList = personService.findPersonRoleByName(lastName);
            return JSON.toJSONString(personList);
        }catch (Exception e) {
            return e.getMessage();
        }
    }
}

