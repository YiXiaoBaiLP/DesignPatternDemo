package buzz.yixiaobai.proxypattern04;

/**
 * @author yixiaobai
 * @create 2022/04/13 下午2:26
 */
public interface IGamePlayer {
    // 登录
    void login(String user, String password);
    // 杀怪
    void killBoss();
    // 升级
    void upgrade();
}
