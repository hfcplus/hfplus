package plus.hf.demo.common.utils;

import java.util.UUID;

/**
 * @author : HFC
 * @date : 2022/4/24 20:30
 * @description :
 */
public class UUIDUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
