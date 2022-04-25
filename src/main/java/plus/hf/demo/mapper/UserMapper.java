package plus.hf.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import plus.hf.demo.domain.User;

/**
 * @author : HFC
 * @date : 2022/4/24 20:42
 * @description :
 */
@Mapper
public interface UserMapper extends BaseMapper<User>{
    User userLoginByEmail(String email, String password);
}
