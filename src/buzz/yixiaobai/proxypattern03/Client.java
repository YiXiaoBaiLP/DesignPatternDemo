package buzz.yixiaobai.proxypattern03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 强制使用代理类
 * @author yixiaobai
 * @create 2022/04/12 下午6:28
 */
public class Client {
    public static void main(String[] args){
        // 定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        // 初始化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 获取本地当前时间
        LocalDateTime localTime = LocalDateTime.now();
        // 获取当前时间
        String nowTime = dateTimeFormatter.format(localTime);
        System.out.println("开始时间是："+nowTime);
        // 登录
        player.login("zhangSan", "password");
        // 杀怪
        player.killBoss();
        // 升级
        player.upgrade();
        System.out.println("结束时间是：2022-12-27 12:27:00");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-------- 使用强制代理 --------");
        // 获取指定的代理类
        player.getProxy();
        System.out.println("开始时间是："+nowTime);
        // 登录
        player.login("zhangSan", "password");
        // 杀怪
        player.killBoss();
        // 升级
        player.upgrade();
        System.out.println("结束时间是：2022-12-27 12:27:00");
    }
}
