package buzz.yixiaobai.proxypattern02;

/**
 * 普通代理模式
 * @author yixiaobai
 * @create 2022/04/12 下午3:50
 */
public class GamePlayer implements IGamePlayer {
    private String name;
    // 构造函数限制谁能创建对象，并同时传递姓名
    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if(gamePlayer == null){
            throw new Exception("不能创建真实角色");
        } else {
            this.name = name;
        }
    }
    // 进入游戏之前要登录吧，这是一个必要条件
    @Override
    public void login(String user, String password) {
        System.out.println("登录名为：" + user + "的用户\n"
            + this.name + "登录成功！");
    }
    // 打怪，最期望的就是杀老怪
    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }
    // 升级
    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级!");
    }
}
