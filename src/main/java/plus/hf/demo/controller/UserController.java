package plus.hf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import plus.hf.demo.common.utils.MD5Utils;
import plus.hf.demo.common.utils.ResultUtils;
import plus.hf.demo.domain.User;
import plus.hf.demo.service.UserService;

/**
 * @author : HFC
 * @date : 2022/4/24 20:06
 * @description :
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public Object login(String loginEmail, String loginPwd) {
        User user = userService.userLoginByEmail(loginEmail, MD5Utils.getMD5(loginPwd));
        if (user != null) {
            return ResultUtils.success();
        } else {
            return ResultUtils.fail("账号或者密码错误");
        }
    }

    @RequestMapping("register")
    @ResponseBody
    public Object register(String email) {
        User byId = userService.getById(email);
        return byId;

    }
}
