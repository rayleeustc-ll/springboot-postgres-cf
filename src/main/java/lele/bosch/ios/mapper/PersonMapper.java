package lele.bosch.ios.mapper;

import lele.bosch.ios.model.Person;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lele.bosch.ios.vo.PersonVO;

import java.util.List;


public interface PersonMapper extends BaseMapper<Person> {
     List<PersonVO> findPersonRoleByName(String lastName);
}
