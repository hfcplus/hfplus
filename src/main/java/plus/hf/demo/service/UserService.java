package plus.hf.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import plus.hf.demo.domain.User;

/**
 * @author : HFC
 * @date : 2022/4/24 20:41
 * @description :
 */
public interface UserService extends IService<User> {
    User userLoginByEmail(String email, String password);
}
