package buzz.yixiaobai.proxypattern04;

/**
 * @author yixiaobai
 * @create 2022/04/13 下午2:27
 */
public class GamePlayer implements IGamePlayer{
    private String name;

    public GamePlayer(String name){
        this.name = name;
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
