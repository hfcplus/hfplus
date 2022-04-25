package plus.hf.demo.common.utils;

import java.util.HashMap;

/**
 * @author : HFC
 * @date : 2022/4/24 20:08
 * @description :
 */
public class ResultUtils extends HashMap<String, Object> {
    public static ResultUtils success(){
        ResultUtils resultUtils = new ResultUtils();
        resultUtils.put(Constant.RESULT_CODE, Constant.SUCCESS_CODE);
        return resultUtils;
    }

    public static ResultUtils fail(String message) {
        ResultUtils resultUtils = new ResultUtils();
        resultUtils.put(Constant.RESULT_CODE, Constant.FALSE_CODE);
        resultUtils.put(Constant.RESULT_MESSAGE, message);
        return resultUtils;
    }
}
