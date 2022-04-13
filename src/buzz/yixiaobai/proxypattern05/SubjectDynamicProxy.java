package buzz.yixiaobai.proxypattern05;

import java.lang.reflect.InvocationHandler;

/**
 * 具体业务的动态代理
 * @author yixiaobai
 * @create 2022/04/13 下午4:34
 */
public class SubjectDynamicProxy extends DynamicProxy{

    public static <T> T newProxyInstance(Subject subject){
        // 获取的Class loader
        ClassLoader loader = subject.getClass().getClassLoader();
        // 获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        // 获得Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
