package plus.hf.demo;

import org.junit.jupiter.api.Test;
import plus.hf.demo.common.utils.MD5Utils;

/**
 * @author : HFC
 * @date : 2022/4/24 20:32
 * @description :
 */
public class MyTest {
    @Test
    public void test(){
        String password = "chfandcty";
        String p1 = MD5Utils.getMD5(password);
        String p2 = MD5Utils.getMD5(password);
        String p3 = MD5Utils.getMD5(password);
        String p4 = MD5Utils.getMD5(password);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
