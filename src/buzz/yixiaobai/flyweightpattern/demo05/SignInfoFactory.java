package buzz.yixiaobai.flyweightpattern.demo05;

import java.util.HashMap;

/**
 * 享元模式-报考信息工厂
 * @author yixiaobai
 * @create 2022/04/21 下午7:00
 */
public class SignInfoFactory {

    // 池容器
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfo(){
        return new SignInfo();
    }
    // 从池中获取对象
    public static SignInfo getSiginInfo(String key){
        // 设置返回对象
        SignInfo result = null;
        // 池中没有该对象，则新建，放入池中
        if(!pool.containsKey(key)){
            System.out.println(key +"--- 建立对象，并放置到池中");
            result = new SignInfo();
            pool.put(key, result);
        } else {
            System.out.println(key + "--- 直接从池中获取");
            result = pool.get(key);
        }
        return result;
    }
}
