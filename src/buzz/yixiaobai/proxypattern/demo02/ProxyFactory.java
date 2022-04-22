package buzz.yixiaobai.proxypattern.demo02;

import java.lang.reflect.Proxy;

/**
 * 动态代理模式-代理对象
 * @author yixiaobai
 * @create 2022/04/22 下午2:59
 */
public class ProxyFactory {
    // 维护一个目标对象，Object
    private Object target;
    // 构造器，对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 获取动态代理对象
    public Object getProxyInstance(){

        /*
        public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)
        参数说明：
            1、ClassLoader loader：指当前目标对象使用的类加载器，获取加载器的方法固定
            2、Class<?>[] interfaces：目标类型实现的接口类型，使用泛型方法确认类型
            3、InvocationHandler h：事件处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), (proxy, method, args)->{
                    System.out.println("JDK代理开始了。。。");
                    Object proxyObj = method.invoke(target, args);
                    System.out.println("JDK代理结束了。。。");
                    return proxyObj;
                });
    }
}
