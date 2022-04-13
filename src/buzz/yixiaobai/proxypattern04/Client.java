package buzz.yixiaobai.proxypattern04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理的场景类
 * @author yixiaobai
 * @create 2022/04/13 下午2:30
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        // 定义一个Handler
        InvocationHandler handler = new GamePlayIH(player);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-08-25 10:45");
        // 获得类的class loader（获取类的加载器）
        ClassLoader cl = player.getClass().getClassLoader();
        // 动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class}, handler);
        // 登录
        proxy.login("zhangSan", "password");
        // 杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录游戏结束的时间
        System.out.println("结束时间是：2009-08-06 03:40");
    }
}
