package lele.bosch.ios.service.impl;

import lele.bosch.ios.model.Person;
import lele.bosch.ios.mapper.PersonMapper;
import lele.bosch.ios.service.IPersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lele.bosch.ios.vo.PersonVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    public List<PersonVO> findPersonRoleByName(String lastName){
        return this.baseMapper.findPersonRoleByName(lastName);
    }
}
