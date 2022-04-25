package plus.hf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author : HFC
 * @date : 2022/4/24 15:58
 * @description :
 */
@Controller
public class ArrayController {

    @RequestMapping("/ajaxList")
    @ResponseBody
    public void testAjaxList(@RequestParam("id") List<String> roleIds) {
        for (String s : roleIds) {
            System.out.println(s);
        }
    }
}
