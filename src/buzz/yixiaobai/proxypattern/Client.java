package buzz.yixiaobai.proxypattern;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import java.util.zip.DataFormatException;

/**
 * 场景类
 * @author yixiaobai
 * @create 2022/04/12 下午3:55
 */
public class Client {
    public static void main(String[] args){
        // 定义一个玩家
        IGamePlayer player = new GamePlayer("张三");
        // 定一个一个代练
        IGamePlayer playerProxy = new GamePlayerProxy(player);
        // 初始化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 获取本地当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        // 格式化之后的时间
        String dateTimeString = dateTimeFormatter.format(localDateTime);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是" + dateTimeString);
        // 登录
        playerProxy.login("zhangSan", "password");
        // 开始杀怪
        playerProxy.killBoss();
        // 升级
        playerProxy.upgrade();
        // 记录结束时间
        System.out.println("结束时间是：2022-12-22 12:12:22");

    }
}
