package buzz.yixiaobai.proxypattern03;

/**
 * 强制代理的代理类
 * @author yixiaobai
 * @create 2022/04/12 下午5:56
 */
public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer iGamePlayer;
    public GamePlayerProxy(IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;
    }
    // 代练登录
    @Override
    public void login(String user, String passwrod) {
        this.iGamePlayer.login(user, passwrod);
    }
    // 代练杀怪
    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }
    // 代练升级
    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }
    // 代理的代理暂时还没有，就是自己
    // 代理角色也可以被再次代理下去
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
