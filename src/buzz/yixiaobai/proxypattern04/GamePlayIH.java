package buzz.yixiaobai.proxypattern04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * InvocationHandler：是JDK提供的动态代理接口，对被代理的方法进行代理
 * @author yixiaobai
 * @create 2022/04/13 下午2:28
 */
public class GamePlayIH implements InvocationHandler {

    // 被代理者
    Class cls;
    // 被代理的实例
    Object obj;
    // 要代理的谁
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    /**
     * 调用被代理的方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        // 如果是登录方法，则发送这条消息
        if(method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的帐号登录！");
        }
        return result;
    }
}
