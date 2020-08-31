package lele.bosch.ios.service;

import lele.bosch.ios.model.Person;
import com.baomidou.mybatisplus.extension.service.IService;
import lele.bosch.ios.vo.PersonVO;

import java.util.List;


public interface IPersonService extends IService<Person> {
    public List<PersonVO> findPersonRoleByName(String lastName);
}
