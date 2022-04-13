package buzz.yixiaobai.proxypattern05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 * @author yixiaobai
 * @create 2022/04/13 下午3:50
 */
public class MyInvocationHandler implements InvocationHandler {
    // 被代理的对象
    private Object target;

    public MyInvocationHandler(Object obj){
        this.target = obj;
    }

    // 代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target, args);
    }
}
