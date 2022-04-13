package buzz.yixiaobai.proxypattern05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 * @author yixiaobai
 * @create 2022/04/13 下午3:53
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] inerfaces, InvocationHandler handler){
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){
            // 执行一个前置通知
            new BeforeAdvice().exec();
        }
        // 执行目标，并返回结果
        // 这里重新生成了一个对象
        return (T) Proxy.newProxyInstance(loader, inerfaces, handler);
    }
}
