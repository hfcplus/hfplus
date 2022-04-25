package plus.hf.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plus.hf.demo.domain.User;
import plus.hf.demo.mapper.UserMapper;
import plus.hf.demo.service.UserService;



/**
 * @author : HFC
 * @date : 2022/4/24 20:41
 * @description :
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User userLoginByEmail(String email, String password) {
        System.out.println("asdfasdfa");
        return userMapper.userLoginByEmail(email, password);
    }
}
