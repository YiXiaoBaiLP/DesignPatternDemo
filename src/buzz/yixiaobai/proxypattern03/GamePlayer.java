package buzz.yixiaobai.proxypattern03;

/**
 * 强制代理的真实角色
 * @author yixiaobai
 * @create 2022/04/12 下午5:50
 */
public class GamePlayer implements IGamePlayer{
    private String name;
    // 我的代理是谁
    private IGamePlayer proxy;

    public GamePlayer(String name){
        this.name = name;
    }
    // 登录
    @Override
    public void login(String user, String passwrod) {
        if(this.isProxy()){
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        }else{
            System.out.println("请使用指定的代理访问！");
        }
    }
    // 打怪
    @Override
    public void killBoss() {
        if(this.isProxy()) {
            System.out.println(this.name + "在打怪！");
        }else{
            System.out.println("请使用指定代理访问！");
        }
    }
    // 升级
    @Override
    public void upgrade() {
        if(isProxy()){
            System.out.println(this.name + "又升了一级");
        }else{
            System.out.println("请使用指定代理访问！");
        }
    }

    // 找到自己的代理
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
    // 校验是否是代理访问
    private boolean isProxy(){
        if(this.proxy == null){
            return false;
        }else{
            return true;
        }
    }
}
