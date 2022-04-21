package buzz.yixiaobai.flyweightpattern.demo06;

import java.util.HashMap;

/**
 * 享元模式-享元工厂
 * @author yixiaobai
 * @create 2022/04/21 下午11:02
 */
public class SignInfoFactory {
    // 池容器
    private static HashMap<ExtrinsicState, SignInfo> pool = new HashMap<>();
    // 从池中获取对象
    public static SignInfo getSignInfo(ExtrinsicState key){
        // 设置返回对象
        SignInfo result = null;
        // 池中没有该对象，则建立，并放入池中
        if(!pool.containsKey(key)){
            result = new SignInfo();
            pool.put(key, result);
        } else {
            result = pool.get(key);
        }
        return result;
    }
}
