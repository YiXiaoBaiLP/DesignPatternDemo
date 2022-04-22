package buzz.yixiaobai.proxypattern01;

/**
 * 普通代理模式
 * 游戏者接口
 * @author yixiaobai
 * @create 2022/04/12 下午3:47
 */
public interface IGamePlayer {
    // 登录游戏
    void login(String user, String password);
    // 杀怪，网络游戏的主要特色
    void killBoss();
    // 升级
    void upgrade();
}
