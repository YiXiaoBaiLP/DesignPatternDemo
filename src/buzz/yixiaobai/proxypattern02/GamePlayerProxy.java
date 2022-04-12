package buzz.yixiaobai.proxypattern02;

/**
 * 普通代理模式
 * 代练者
 * @author yixiaobai
 * @create 2022/04/12 下午4:32
 */
public class GamePlayerProxy implements IGamePlayer {
    //接口对象
    private IGamePlayer gamePlayer;
    // 通过构造函数传递要对谁进行代练
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            System.err.println("角色创建失败!");
            e.printStackTrace();
        }
    }
    // 代练登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    // 代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    // 代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
