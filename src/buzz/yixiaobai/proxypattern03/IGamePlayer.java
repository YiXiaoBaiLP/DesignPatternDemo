package buzz.yixiaobai.proxypattern03;

/**
 * 强制代理类
 * 强制代理类的接口
 * @author yixiaobai
 * @create 2022/04/12 下午5:42
 */
public interface IGamePlayer{

    // 登录游戏
    void login(String user, String passwrod);
    // 杀怪
    void killBoss();
    // 升级
    void upgrade();
    // 每个人都可以找一下自己的代理
    IGamePlayer getProxy();
}
